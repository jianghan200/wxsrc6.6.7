package com.tencent.mm.storage;

import android.content.Context;
import android.database.Cursor;
import com.tencent.mm.bt.h;
import com.tencent.mm.g.a.kl;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.c;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.ArrayList;
import java.util.List;

public final class as
  extends com.tencent.mm.sdk.e.i<ar>
  implements c, j.a
{
  public static final String[] diD = { com.tencent.mm.sdk.e.i.a(ar.dhO, "fmessage_conversation") };
  private static final String[] tbj = { "CREATE INDEX IF NOT EXISTS  fmessageConversationTalkerIndex ON fmessage_conversation ( talker )", "CREATE INDEX IF NOT EXISTS  fmconversation_isnew_Index ON fmessage_conversation ( isNew )" };
  private final int bzG = 1;
  public com.tencent.mm.sdk.e.e diF;
  protected Context mContext = null;
  private Runnable tbk = new Runnable()
  {
    public final void run()
    {
      int i = as.this.clP();
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.FMessageConversationStorage", "onNotifyChange, newCount update to = %d", new Object[] { Integer.valueOf(i) });
      g.Ei().DT().set(143618, Integer.valueOf(i));
    }
  };
  
  public as(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, ar.dhO, "fmessage_conversation", tbj);
    this.diF = parame;
    this.mContext = ad.getContext();
  }
  
  public final ar Gx(String paramString)
  {
    Object localObject;
    if ((paramString == null) || (paramString.length() == 0))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FMessageConversationStorage", "get fail, talker is null");
      localObject = null;
    }
    ar localar;
    do
    {
      return (ar)localObject;
      localar = new ar();
      localar.field_talker = paramString;
      localObject = localar;
    } while (super.b(localar, new String[0]));
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FMessageConversationStorage", "get fail, maybe not exist, talker = " + paramString);
    return null;
  }
  
  public final boolean YK(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FMessageConversationStorage", "unsetNew fail, talker is null");
      return false;
    }
    ar localar = Gx(paramString);
    if ((localar == null) || (!paramString.equals(localar.field_talker)))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FMessageConversationStorage", "unsetNew fail, conversation does not exist, talker = " + paramString);
      return false;
    }
    localar.field_isNew = 0;
    return super.c(localar, new String[0]);
  }
  
  public final ar YL(String paramString)
  {
    Object localObject = null;
    if ((paramString == null) || (paramString.length() == 0))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FMessageConversationStorage", "get fail, encryptTalker is null");
      return null;
    }
    paramString = "select * from fmessage_conversation  where encryptTalker=" + h.fz(paramString);
    Cursor localCursor = this.diF.b(paramString, null, 2);
    paramString = (String)localObject;
    if (localCursor.moveToFirst())
    {
      paramString = new ar();
      paramString.d(localCursor);
    }
    localCursor.close();
    return paramString;
  }
  
  public final void a(String paramString, l paraml)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FMessageConversationStorage", "onNotifyChange, id is null");
      return;
    }
    long l;
    try
    {
      l = bi.getLong(paramString, 0L);
      if (l == 0L)
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FMessageConversationStorage", "onNotifyChange fail, sysRowId is invalid");
        return;
      }
    }
    catch (Exception paraml)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FMessageConversationStorage", "onNotifyChange, id = " + paramString + ", ex = " + paraml.getMessage());
        l = 0L;
      }
      if (!g.Eg().Dx())
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FMessageConversationStorage", "onNotifyChange, account not ready, can not insert fmessageconversation");
        return;
      }
      paraml = new at();
      if (!((au)((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcX()).b(l, paraml))
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FMessageConversationStorage", "onNotifyChange, get fail, id = " + l);
        return;
      }
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FMessageConversationStorage", "onNotifyChange succ, sysRowId = " + l);
      paramString = ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcW().Gx(paraml.field_talker);
      if (paramString != null) {
        break label630;
      }
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FMessageConversationStorage", "onNotifyChange, fmessage conversation does not exist, insert a new one, talker = " + paraml.field_talker);
    if (bi.oW(paraml.field_talker))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FMessageConversationStorage", "onNotifyChange, fmessage info talker is null, quit insert fmessage conversation.");
      return;
    }
    paramString = new ar();
    Object localObject;
    if (paraml.field_type == 0)
    {
      localObject = bd.a.YV(paraml.field_msgContent);
      paramString.field_displayName = ((bd.a)localObject).getDisplayName();
      if ((((bd.a)localObject).scene == 4) && (((bd.a)localObject).cmJ() != null)) {
        paramString.field_displayName = ((bd.a)localObject).cmJ();
      }
      paramString.field_addScene = ((bd.a)localObject).scene;
      paramString.field_isNew = 1;
      paramString.field_contentFromUsername = ((bd.a)localObject).otZ;
      paramString.field_contentNickname = ((bd.a)localObject).nickname;
      paramString.field_contentPhoneNumMD5 = ((bd.a)localObject).tbE;
      paramString.field_contentFullPhoneNumMD5 = ((bd.a)localObject).tbF;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FMessageConversationStorage", "push, new friend Username: " + paramString.field_contentFromUsername + "new friend Nickname: " + paramString.field_contentNickname);
      paramString.field_lastModifiedTime = System.currentTimeMillis();
      paramString.field_state = 0;
      paramString.field_talker = paraml.field_talker;
      paramString.field_encryptTalker = paraml.field_encryptTalker;
      paramString.field_fmsgSysRowId = l;
      paramString.field_fmsgIsSend = paraml.field_isSend;
      paramString.field_fmsgType = paraml.field_type;
      paramString.field_fmsgContent = paraml.field_msgContent;
      if (!paraml.clS()) {
        break label625;
      }
    }
    label625:
    for (int i = paraml.field_type;; i = 0)
    {
      paramString.field_recvFmsgType = i;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FMessageConversationStorage", "field_fmsgContent: " + paramString.field_fmsgContent);
      ((as)((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcW()).b(paramString);
      clR();
      return;
      if (!paraml.clS()) {
        break;
      }
      localObject = bd.d.YY(paraml.field_msgContent);
      paramString.field_displayName = ((bd.d)localObject).getDisplayName();
      paramString.field_addScene = ((bd.d)localObject).scene;
      paramString.field_isNew = 1;
      paramString.field_contentFromUsername = ((bd.d)localObject).otZ;
      paramString.field_contentNickname = ((bd.d)localObject).nickname;
      paramString.field_contentVerifyContent = ((bd.d)localObject).content;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FMessageConversationStorage", "receive, new friend Username: " + paramString.field_contentFromUsername + "new friend Nickname: " + paramString.field_contentNickname);
      break;
    }
    label630:
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FMessageConversationStorage", "onNotifyChange, fmessage conversation has existed, talker = " + paraml.field_talker);
    if (paraml.clS()) {
      paramString.field_isNew = 1;
    }
    paramString.field_lastModifiedTime = System.currentTimeMillis();
    paramString.field_encryptTalker = paraml.field_encryptTalker;
    paramString.field_fmsgSysRowId = l;
    paramString.field_fmsgIsSend = paraml.field_isSend;
    paramString.field_fmsgType = paraml.field_type;
    paramString.field_fmsgContent = paraml.field_msgContent;
    if (paraml.clS())
    {
      paramString.field_recvFmsgType = paraml.field_type;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FMessageConversationStorage", "field_recvFmsgType: " + paramString.field_recvFmsgType);
    }
    if (paraml.field_type == 0)
    {
      paraml = bd.a.YV(paraml.field_msgContent);
      paramString.field_contentFromUsername = paraml.otZ;
      paramString.field_contentNickname = paraml.nickname;
      paramString.field_contentPhoneNumMD5 = paraml.tbE;
      paramString.field_contentFullPhoneNumMD5 = paraml.tbF;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FMessageConversationStorage", "TYPE_SYSTEM_PUSH, new friend Username: " + paramString.field_contentFromUsername + "new friend Nickname: " + paramString.field_contentNickname);
    }
    label1057:
    for (;;)
    {
      ((as)((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcW()).c(paramString, new String[0]);
      if (clP() != 0) {
        break;
      }
      g.Ei().DT().set(340225, Long.valueOf(System.currentTimeMillis()));
      break;
      if (paraml.clS())
      {
        if (paraml.field_isSend >= 2) {}
        for (i = 1;; i = 0)
        {
          if (i != 0) {
            break label1057;
          }
          paraml = bd.d.YY(paraml.field_msgContent);
          paramString.field_contentVerifyContent = paraml.content;
          paramString.field_contentFromUsername = paraml.otZ;
          paramString.field_contentNickname = paraml.nickname;
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FMessageConversationStorage", "field_contentVerifyContent: " + paramString.field_contentVerifyContent + " receive, new friend Username: " + paramString.field_contentFromUsername + " new friend Nickname: " + paramString.field_contentNickname);
          paraml = paramString.field_contentFromUsername;
          localObject = paramString.field_contentNickname;
          kl localkl = new kl();
          localkl.bUL.userName = paraml;
          localkl.bUL.bgn = ((String)localObject);
          localkl.bUL.type = 1;
          com.tencent.mm.sdk.b.a.sFg.m(localkl);
          break;
        }
      }
    }
  }
  
  public final Cursor axc()
  {
    return this.diF.rawQuery("select * from fmessage_conversation  ORDER BY lastModifiedTime DESC", null);
  }
  
  public final boolean clO()
  {
    if (this.diF.fV("fmessage_conversation", "update fmessage_conversation set isNew = 0"))
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FMessageConversationStorage", "clearAllNew success");
      doNotify();
      return true;
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FMessageConversationStorage", "clearAllNew fail");
    return false;
  }
  
  public final int clP()
  {
    int i = 0;
    Object localObject = String.format("select count(*) from %s where %s = 1 and %s < 2", new Object[] { "fmessage_conversation", "isNew", "fmsgIsSend" });
    localObject = this.diF.b((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst()) {
      i = ((Cursor)localObject).getInt(0);
    }
    ((Cursor)localObject).close();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FMessageConversationStorage", "getNewCount = " + i);
    return i;
  }
  
  public final List<String> clQ()
  {
    Object localObject = String.format("select %s from %s where isNew = 1 ORDER BY lastModifiedTime DESC limit %d", new Object[] { "contentNickname", "fmessage_conversation", Integer.valueOf(2) });
    localObject = this.diF.b((String)localObject, null, 2);
    ArrayList localArrayList = new ArrayList();
    while (((Cursor)localObject).moveToNext()) {
      localArrayList.add(((Cursor)localObject).getString(((Cursor)localObject).getColumnIndex("contentNickname")));
    }
    ((Cursor)localObject).close();
    return localArrayList;
  }
  
  public final void clR()
  {
    ah.M(this.tbk);
    ah.i(this.tbk, 500L);
  }
  
  public final boolean db(String paramString, int paramInt)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FMessageConversationStorage", "updateState fail, talker is null");
    }
    ar localar;
    do
    {
      return false;
      localar = Gx(paramString);
      if (localar == null)
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FMessageConversationStorage", "updateState fail, get fail, talker = " + paramString);
        return false;
      }
      if (paramInt == localar.field_state)
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FMessageConversationStorage", "updateState, no need to update");
        return true;
      }
      localar.field_state = paramInt;
      localar.field_lastModifiedTime = System.currentTimeMillis();
    } while (!super.c(localar, new String[0]));
    Xp(paramString);
    return true;
  }
  
  public final int getCount()
  {
    int i = 0;
    Cursor localCursor = this.diF.b("select count(*) from fmessage_conversation", null, 2);
    if (localCursor.moveToFirst()) {
      i = localCursor.getInt(0);
    }
    localCursor.close();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FMessageConversationStorage", "getCount = " + i);
    return i;
  }
  
  public final boolean m(long paramLong, String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FMessageConversationStorage", "deleteByTalker rowId: %d, talker: %s", new Object[] { Long.valueOf(paramLong), paramString });
    if (bi.oW(paramString)) {
      if (paramLong <= 0L) {}
    }
    for (String str = "delete from fmessage_conversation where fmsgSysRowId = '" + paramLong + "'"; this.diF.fV("fmessage_conversation", str); str = "delete from fmessage_conversation where talker = '" + bi.oU(paramString) + "'")
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FMessageConversationStorage", "deleteByTalker success, rowId: %d, talker: %s", new Object[] { Long.valueOf(paramLong), paramString });
      Xp(paramString);
      return true;
      return false;
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/storage/as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */