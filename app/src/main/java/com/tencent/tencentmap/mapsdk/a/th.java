package com.tencent.tencentmap.mapsdk.a;

public abstract class th
  extends ri
{
  public th(int paramInt) {}
  
  protected static int a(int paramInt1, int paramInt2)
  {
    int i = paramInt1 % paramInt2;
    paramInt1 = i;
    if (i * paramInt2 < 0) {
      paramInt1 = i + paramInt2;
    }
    return paramInt1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/th.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */