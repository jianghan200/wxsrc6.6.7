package com.tencent.mm.plugin.sns.storage;

import android.database.Cursor;
import com.tencent.mm.bt.h;
import com.tencent.mm.g.c.dv;
import com.tencent.mm.plugin.sns.b.d;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class k
  extends i<j>
  implements d
{
  public static final String[] diD = { i.a(j.dhO, "SnsComment") };
  public h dCZ;
  
  public k(h paramh)
  {
    super(paramh, j.dhO, "SnsComment", dv.ciG);
    this.dCZ = paramh;
  }
  
  public static String bAO()
  {
    return "select *, rowid from SnsComment";
  }
  
  public final boolean a(long paramLong, String paramString1, int paramInt, String paramString2)
  {
    if (bi.oW(paramString2)) {}
    for (paramString1 = "select count(*) from SnsComment where snsID = " + paramLong + " and createTime = " + paramInt + " and talker = '" + paramString1 + "'";; paramString1 = "select count(*) from SnsComment where snsID = " + paramLong + " and clientId = '" + paramString2 + "'")
    {
      paramString1 = rawQuery(paramString1, new String[0]);
      if (paramString1 == null) {
        break label129;
      }
      paramString1.moveToFirst();
      paramInt = paramString1.getInt(0);
      paramString1.close();
      if (paramInt <= 0) {
        break;
      }
      return true;
    }
    return false;
    label129:
    return false;
  }
  
  public final int axd()
  {
    int i = 0;
    Cursor localCursor = this.dCZ.b(" select count(*) from SnsComment where isRead = ? and isSilence != ? ", new String[] { "0", "1" }, 2);
    if (localCursor == null) {
      return 0;
    }
    if (localCursor.moveToFirst()) {
      i = localCursor.getInt(0);
    }
    localCursor.close();
    return i;
  }
  
  public final boolean axe()
  {
    return this.dCZ.fV("SnsComment", " update SnsComment set isRead = 1 where isRead = 0");
  }
  
  public final Cursor bAP()
  {
    return this.dCZ.b("select *, rowid from SnsComment where isRead = ?  and isSilence != ?  order by createTime desc", new String[] { "0", "1" }, 0);
  }
  
  public final int bAQ()
  {
    int i = 0;
    Cursor localCursor = rawQuery("select count(*) from SnsComment where isSend = 0", new String[0]);
    if (localCursor != null)
    {
      localCursor.moveToFirst();
      i = localCursor.getInt(0);
      localCursor.close();
    }
    return i;
  }
  
  public final void bAR()
  {
    this.dCZ.ZM("SnsComment");
  }
  
  public final j c(long paramLong1, long paramLong2, int paramInt)
  {
    if (paramInt == 9) {
      paramInt = 2;
    }
    for (;;)
    {
      int i = paramInt;
      if (paramInt == 10) {
        i = 8;
      }
      Cursor localCursor = rawQuery("select *, rowid from SnsComment where snsID = " + paramLong1 + " and commentSvrID = " + paramLong2 + " and type = " + i, new String[0]);
      if (localCursor != null)
      {
        j localj;
        if (localCursor.moveToFirst())
        {
          localj = new j();
          localj.d(localCursor);
        }
        for (;;)
        {
          localCursor.close();
          return localj;
          localj = null;
        }
      }
      return null;
    }
  }
  
  public final boolean d(long paramLong1, long paramLong2, int paramInt)
  {
    if (paramInt == 9) {
      paramInt = 2;
    }
    for (;;)
    {
      int i = paramInt;
      if (paramInt == 10) {
        i = 8;
      }
      String str = "delete from SnsComment where snsID = " + paramLong1 + " and commentSvrID = " + paramLong2 + " and type = " + i;
      return this.dCZ.fV("SnsComment", str);
    }
  }
  
  public final boolean fd(long paramLong)
  {
    String str = "delete from SnsComment where snsID = " + paramLong;
    return this.dCZ.fV("SnsComment", str);
  }
  
  public final boolean s(long paramLong, boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      String str = " update SnsComment set isSilence = " + i + " where isSilence != " + i + " and  snsID = " + paramLong;
      x.i("MicroMsg.SnsCommentStorage", "updateIsSilence " + str);
      return this.dCZ.fV("SnsComment", str);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */