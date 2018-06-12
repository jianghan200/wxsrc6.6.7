package com.tencent.tencentmap.mapsdk.a;

public final class rp
{
  private int a = 0;
  private int b = 0;
  private String c = "default";
  private String d = "";
  private String e = "";
  
  public rp(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.d = paramString1;
    this.e = paramString2;
    this.c = paramString3;
  }
  
  public final int a()
  {
    return this.a * 10 + this.b;
  }
  
  public final boolean a(rr paramrr)
  {
    boolean bool2 = true;
    boolean bool1;
    switch (this.a)
    {
    default: 
      bool1 = false;
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while ("default".equals(this.c));
      if (paramrr == null) {
        return false;
      }
      paramrr = paramrr.a();
      sk.a();
      return sk.a(paramrr, sk.c(this.c));
      bool1 = bool2;
    } while ("default".equals(this.c));
    if (paramrr != null)
    {
      sk.a();
      ru[] arrayOfru = sk.c(this.c);
      paramrr = paramrr.b();
      int j = paramrr.length;
      int i = 0;
      for (;;)
      {
        if (i >= j) {
          break label147;
        }
        bool1 = bool2;
        if (sk.a(paramrr[i], arrayOfru)) {
          break;
        }
        i += 1;
      }
    }
    label147:
    return false;
  }
  
  public final String b()
  {
    return this.d;
  }
  
  public final String c()
  {
    return this.e;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/rp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */