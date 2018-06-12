package com.tencent.mm.plugin.gwallet.a;

public final class a
  extends Exception
{
  c kiN;
  
  public a(int paramInt, String paramString)
  {
    this(new c(paramInt, paramString));
  }
  
  private a(c paramc)
  {
    this(paramc, null);
  }
  
  private a(c paramc, Exception paramException)
  {
    super(paramc.kjg, paramException);
    this.kiN = paramc;
  }
  
  public a(String paramString, Exception paramException)
  {
    this(new c(64535, paramString), paramException);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/gwallet/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */