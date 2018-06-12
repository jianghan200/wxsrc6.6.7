package com.tencent.tencentmap.mapsdk.a;

public final class ju
  extends mf
{
  public String a = "";
  public int b = 0;
  public String c = "";
  
  public ju() {}
  
  public ju(String paramString1, int paramInt, String paramString2)
  {
    this.a = paramString1;
    this.b = paramInt;
    this.c = paramString2;
  }
  
  public final void readFrom(md parammd)
  {
    this.a = parammd.a(0, true);
    this.b = parammd.a(this.b, 1, true);
    this.c = parammd.a(2, false);
  }
  
  public final void writeTo(me paramme)
  {
    paramme.a(this.a, 0);
    paramme.a(this.b, 1);
    if (this.c != null) {
      paramme.a(this.c, 2);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ju.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */