package com.tencent.mm.wallet_core.c;

public final class c
{
  public String Yy;
  public int errCode;
  public int errType;
  public int uWZ = 0;
  
  public c()
  {
    this.errType = 0;
    this.errCode = 0;
    this.Yy = "";
    this.uWZ = 0;
  }
  
  public c(int paramInt1, int paramInt2, String paramString)
  {
    e(paramInt1, paramInt2, paramString, 0);
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    this.errType = paramInt1;
    this.errCode = paramInt2;
    this.Yy = paramString;
    this.uWZ = paramInt3;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/wallet_core/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */