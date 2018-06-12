package com.tencent.mm.plugin.sns.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.x;

public final class f
  extends i<e>
{
  public static final String[] ciG = { "CREATE INDEX IF NOT EXISTS serverAdSnsNameIndex ON AdSnsInfo ( snsId )", "CREATE INDEX IF NOT EXISTS serverAdSnsTimeHeadIndex ON AdSnsInfo ( head )", "DROP INDEX IF EXISTS serverAdSnsTimeIndex", "DROP INDEX IF EXISTS serverAdSnsTimeSourceTypeIndex", "CREATE INDEX IF NOT EXISTS adsnsMultiIndex1 ON AdSnsInfo ( createTime,snsId,sourceType,type)", "CREATE INDEX IF NOT EXISTS adsnsMultiIndex2 ON AdSnsInfo ( sourceType,type,userName)" };
  public static final String[] diD = { i.a(e.dhO, "adsnsinfo") };
  private static final String nJf = String.format("select  %s %s,rowid from AdSnsInfo ", new Object[] { "snsId", "createTime" });
  public com.tencent.mm.sdk.e.e diF;
  
  public f(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, e.dhO, "adsnsinfo", ciG);
    this.diF = parame;
  }
  
  public final boolean a(long paramLong, e parame)
  {
    if (fa(paramLong)) {
      return b(paramLong, parame);
    }
    x.d("MicroMsg.AdSnsInfoStorage", "added PcId " + paramLong);
    x.d("MicroMsg.AdSnsInfoStorage", "SnsInfo Insert");
    int i;
    if (parame == null) {
      i = -1;
    }
    while (i != -1)
    {
      return true;
      parame = parame.wH();
      i = (int)this.diF.insert("AdSnsInfo", "", parame);
      x.d("MicroMsg.AdSnsInfoStorage", "SnsInfo Insert result" + i);
    }
    return false;
  }
  
  public final boolean b(long paramLong, e parame)
  {
    parame = parame.wH();
    parame.remove("rowid");
    return this.diF.update("AdSnsInfo", parame, "snsId=?", new String[] { String.valueOf(paramLong) }) > 0;
  }
  
  public final boolean delete(long paramLong)
  {
    int i = this.diF.delete("AdSnsInfo", "snsId=?", new String[] { String.valueOf(paramLong) });
    x.i("MicroMsg.AdSnsInfoStorage", "del msg " + paramLong + " res " + i);
    return i > 0;
  }
  
  public final e eZ(long paramLong)
  {
    e locale = new e();
    Object localObject = "select *,rowid from AdSnsInfo  where AdSnsInfo.snsId=" + paramLong;
    localObject = this.diF.b((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
    {
      locale.d((Cursor)localObject);
      ((Cursor)localObject).close();
      return locale;
    }
    ((Cursor)localObject).close();
    return null;
  }
  
  public final boolean fa(long paramLong)
  {
    Object localObject = "select *,rowid from AdSnsInfo  where AdSnsInfo.snsId=" + paramLong;
    localObject = this.diF.b((String)localObject, null, 2);
    boolean bool = ((Cursor)localObject).moveToFirst();
    ((Cursor)localObject).close();
    return bool;
  }
  
  public final e xa(int paramInt)
  {
    e locale = new e();
    Object localObject = "select *,rowid from AdSnsInfo  where AdSnsInfo.rowid=" + paramInt;
    localObject = this.diF.b((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
    {
      locale.d((Cursor)localObject);
      ((Cursor)localObject).close();
      return locale;
    }
    ((Cursor)localObject).close();
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */