package com.davemorrissey.labs.subscaleview.a;

public final class c
{
  public String Yy;
  public int errCode;
  
  public c(int paramInt, String paramString)
  {
    this.errCode = paramInt;
    this.Yy = paramString;
  }
  
  public final String toString()
  {
    return String.format("ImageDecodeResult{errCode: %d, errMsg: %s}", new Object[] { Integer.valueOf(this.errCode), this.Yy });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/davemorrissey/labs/subscaleview/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */