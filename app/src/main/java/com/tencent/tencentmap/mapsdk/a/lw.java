package com.tencent.tencentmap.mapsdk.a;

public class lw
{
  public static lv a(mf parammf, int paramInt, String paramString)
  {
    parammf.display(new StringBuilder(), 0);
    lv locallv = new lv();
    locallv.a = 0;
    locallv.b = paramInt;
    locallv.c = paramString;
    locallv.d = 0;
    locallv.e = 0;
    locallv.f = "0";
    locallv.g = "0";
    paramString = new lu();
    paramString.a = System.currentTimeMillis();
    locallv.h = paramString.toByteArray();
    locallv.i = parammf.toByteArray("UTF-8");
    return locallv;
  }
  
  public static lv a(byte[] paramArrayOfByte)
  {
    lv locallv = new lv();
    paramArrayOfByte = new md(paramArrayOfByte);
    paramArrayOfByte.a("utf-8");
    locallv.readFrom(paramArrayOfByte);
    paramArrayOfByte = new md(locallv.h);
    lu locallu = new lu();
    locallu.readFrom(paramArrayOfByte);
    if (locallu.b.a != 0) {
      throw new Exception(locallu.b.b);
    }
    return locallv;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/lw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */