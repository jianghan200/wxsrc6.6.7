package com.tencent.mm.plugin.gwallet.a;

public final class c
{
  public int kjf;
  String kjg;
  
  public c(int paramInt, String paramString)
  {
    this.kjf = paramInt;
    if ((paramString == null) || (paramString.trim().length() == 0))
    {
      this.kjg = b.rg(paramInt);
      return;
    }
    this.kjg = (paramString + " (response: " + b.rg(paramInt) + ")");
  }
  
  public final int aVR()
  {
    switch (this.kjf)
    {
    default: 
      return this.kjf;
    case 0: 
      return 0;
    case 1: 
      return 1;
    case -1009: 
    case -1002: 
    case -1001: 
    case -1000: 
    case 2: 
    case 3: 
    case 4: 
    case 6: 
      return 5;
    case 5: 
      return 6;
    case 7: 
      return 100000002;
    case 8: 
      return 106;
    }
    return 3;
  }
  
  public final boolean isSuccess()
  {
    return this.kjf == 0;
  }
  
  public final String toString()
  {
    return "IapResult: " + this.kjg;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/gwallet/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */