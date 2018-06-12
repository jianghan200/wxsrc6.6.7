package com.tencent.tencentmap.mapsdk.a;

public final class js
  extends mf
{
  public String a = "";
  public int b = 0;
  public int c = 0;
  
  public js() {}
  
  public js(String paramString, int paramInt1, int paramInt2)
  {
    this.a = paramString;
    this.b = paramInt1;
    this.c = paramInt2;
  }
  
  public final void readFrom(md parammd)
  {
    this.a = parammd.a(0, true);
    this.b = parammd.a(this.b, 1, true);
    this.c = parammd.a(this.c, 2, false);
  }
  
  public final void writeTo(me paramme)
  {
    paramme.a(this.a, 0);
    paramme.a(this.b, 1);
    paramme.a(this.c, 2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/js.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */