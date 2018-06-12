package com.tencent.mm.aa;

import android.database.Cursor;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bi;

public final class i
  extends j
{
  public static final String[] diD = { "CREATE TABLE IF NOT EXISTS hdheadimginfo ( username text  PRIMARY KEY , imgwidth int  , imgheigth int  , imgformat text  , totallen int  , startpos int  , headimgtype int  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int  ) " };
  com.tencent.mm.bt.h dCZ;
  
  public i(com.tencent.mm.bt.h paramh)
  {
    this.dCZ = paramh;
  }
  
  public final int a(String paramString, h paramh)
  {
    paramh = paramh.wH();
    return this.dCZ.update("hdheadimginfo", paramh, "username=?", new String[] { paramString });
  }
  
  public final h ka(String paramString)
  {
    Object localObject = null;
    paramString = "select hdheadimginfo.username,hdheadimginfo.imgwidth,hdheadimginfo.imgheigth,hdheadimginfo.imgformat,hdheadimginfo.totallen,hdheadimginfo.startpos,hdheadimginfo.headimgtype,hdheadimginfo.reserved1,hdheadimginfo.reserved2,hdheadimginfo.reserved3,hdheadimginfo.reserved4 from hdheadimginfo   where hdheadimginfo.username = \"" + bi.oU(paramString) + "\"";
    Cursor localCursor = this.dCZ.b(paramString, null, 2);
    if (localCursor == null) {
      return null;
    }
    paramString = (String)localObject;
    if (localCursor.moveToFirst())
    {
      paramString = new h();
      paramString.username = localCursor.getString(0);
      paramString.dHF = localCursor.getInt(1);
      paramString.dHG = localCursor.getInt(2);
      paramString.dHH = localCursor.getString(3);
      paramString.dHI = localCursor.getInt(4);
      paramString.dHJ = localCursor.getInt(5);
      paramString.dHK = localCursor.getInt(6);
      paramString.dHL = localCursor.getString(7);
      paramString.dHM = localCursor.getString(8);
      paramString.dHN = localCursor.getInt(9);
      paramString.dHO = localCursor.getInt(10);
    }
    localCursor.close();
    return paramString;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/aa/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */