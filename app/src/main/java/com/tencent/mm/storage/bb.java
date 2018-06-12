package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.g.c.ch;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;

public final class bb
  extends com.tencent.mm.sdk.e.i<ba>
  implements com.tencent.mm.plugin.messenger.foundation.a.a.e
{
  public static final String[] diD = { com.tencent.mm.sdk.e.i.a(ba.dhO, "LBSVerifyMessage") };
  public com.tencent.mm.sdk.e.e diF;
  
  public bb(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, ba.dhO, "LBSVerifyMessage", ch.ciG);
    this.diF = parame;
  }
  
  public static long YT(String paramString)
  {
    Cursor localCursor;
    if (paramString != null)
    {
      paramString = (bb)((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcV();
      localCursor = paramString.diF.b("SELECT * FROM " + paramString.getTableName() + " ORDER BY createtime DESC LIMIT 1", null, 2);
      if (localCursor == null)
      {
        paramString = null;
        if (paramString == null) {
          break label136;
        }
      }
    }
    label136:
    for (long l1 = paramString.field_createtime + 1L;; l1 = 0L)
    {
      long l2 = bi.VE();
      if (l1 > l2)
      {
        return l1;
        if (!localCursor.moveToFirst())
        {
          localCursor.close();
          paramString = null;
          break;
        }
        paramString = new ba();
        paramString.d(localCursor);
        localCursor.close();
        break;
      }
      return l2;
    }
  }
  
  public final void YP(String paramString)
  {
    paramString = "svrid = '" + paramString + "'";
    int i = this.diF.delete(getTableName(), paramString, null);
    if (i > 0) {
      doNotify();
    }
    x.i("MicroMsg.LBSVerifyMessageStorage", "delBySvrId = " + i);
  }
  
  public final void YQ(String paramString)
  {
    paramString = "sayhiuser = '" + paramString + "' or sayhiencryptuser='" + paramString + "'";
    int i = this.diF.delete(getTableName(), paramString, null);
    if (i > 0) {
      doNotify();
    }
    x.i("MicroMsg.LBSVerifyMessageStorage", "delByUserName = " + i);
  }
  
  public final ba[] YR(String paramString)
  {
    x.d("MicroMsg.LBSVerifyMessageStorage", "getLastLBSVerifyMessage");
    paramString = "select *, rowid from LBSVerifyMessage  where sayhiuser = '" + bi.oU(paramString) + "' or sayhiencryptuser = '" + bi.oU(paramString) + "' order by createtime DESC limit 3";
    paramString = this.diF.b(paramString, null, 2);
    ArrayList localArrayList = new ArrayList();
    while (paramString.moveToNext())
    {
      ba localba = new ba();
      localba.d(paramString);
      localArrayList.add(localba);
    }
    paramString.close();
    return (ba[])localArrayList.toArray(new ba[localArrayList.size()]);
  }
  
  public final ba YS(String paramString)
  {
    Object localObject = null;
    x.d("MicroMsg.LBSVerifyMessageStorage", "getLBSVerifyMessage");
    paramString = "select *, rowid from LBSVerifyMessage  where (sayhiuser = '" + bi.oU(paramString) + "' or sayhiencryptuser = '" + bi.oU(paramString) + "') and flag=1 order by createtime DESC limit 1";
    Cursor localCursor = this.diF.b(paramString, null, 2);
    if (localCursor.moveToFirst())
    {
      paramString = new ba();
      paramString.d(localCursor);
    }
    for (;;)
    {
      localCursor.close();
      return paramString;
      x.i("MicroMsg.LBSVerifyMessageStorage", "getLBSVerifyMessage, cursor count = 0");
      paramString = (String)localObject;
    }
  }
  
  public final boolean a(ba paramba)
  {
    if (paramba == null) {
      x.e("MicroMsg.LBSVerifyMessageStorage", "insert fail, lbsMsg is null");
    }
    while (!super.b(paramba)) {
      return false;
    }
    Xp(paramba.sKx);
    return true;
  }
  
  public final void aPm()
  {
    this.diF.delete(getTableName(), null, null);
  }
  
  public final int axd()
  {
    Cursor localCursor = this.diF.b("select count(*) from " + getTableName() + " where status != 4", null, 2);
    if (!localCursor.moveToFirst())
    {
      localCursor.close();
      return 0;
    }
    int i = localCursor.getInt(0);
    localCursor.close();
    return i;
  }
  
  public final ba clZ()
  {
    Cursor localCursor = this.diF.b("SELECT * FROM " + getTableName() + " where status != 4 ORDER BY createtime DESC LIMIT 1", null, 2);
    if (localCursor == null) {
      return null;
    }
    if (!localCursor.moveToFirst())
    {
      localCursor.close();
      return null;
    }
    ba localba = new ba();
    localba.d(localCursor);
    localCursor.close();
    return localba;
  }
  
  public final void cma()
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("status", Integer.valueOf(4));
    if (this.diF.update(getTableName(), localContentValues, "status!=? ", new String[] { "4" }) != 0) {
      doNotify();
    }
  }
  
  public final ba[] dd(String paramString, int paramInt)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      x.e("MicroMsg.LBSVerifyMessageStorage", "getLastRecvLbsMsg fail, talker is null");
      return null;
    }
    paramString = "select * from LBSVerifyMessage where isSend = 0 and (sayhiuser = '" + bi.oU(paramString) + "' or sayhiencryptuser = '" + bi.oU(paramString) + "') order by createTime DESC limit " + paramInt;
    paramString = this.diF.b(paramString, null, 2);
    ArrayList localArrayList = new ArrayList();
    while (paramString.moveToNext())
    {
      ba localba = new ba();
      localba.d(paramString);
      localArrayList.add(localba);
    }
    paramString.close();
    return (ba[])localArrayList.toArray(new ba[localArrayList.size()]);
  }
  
  public final int getCount()
  {
    int i = 0;
    Cursor localCursor = this.diF.b("select count(*) from " + getTableName(), null, 2);
    if (localCursor.moveToFirst()) {
      i = localCursor.getInt(0);
    }
    localCursor.close();
    return i;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/storage/bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */