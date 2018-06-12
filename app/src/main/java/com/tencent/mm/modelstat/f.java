package com.tencent.mm.modelstat;

public final class f
{
  private static f ejD = null;
  public com.tencent.mm.a.f<String, Long> ejE = new com.tencent.mm.a.f(10);
  public String ejF;
  
  public static f RY()
  {
    if (ejD == null) {
      ejD = new f();
    }
    return ejD;
  }
  
  public final void r(String paramString, long paramLong)
  {
    if (this.ejE != null)
    {
      this.ejF = paramString;
      this.ejE.put(paramString, Long.valueOf(paramLong));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/modelstat/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */