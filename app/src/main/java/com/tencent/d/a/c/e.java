package com.tencent.d.a.c;

public class e
{
  public String Yy;
  public int errCode;
  
  public e(int paramInt)
  {
    this.errCode = paramInt;
    switch (this.errCode)
    {
    case 1: 
    default: 
      this.Yy = "errmsg not specified";
      return;
    case 0: 
      this.Yy = "ok";
      return;
    }
    this.Yy = "device not support soter";
  }
  
  public e(int paramInt, String paramString)
  {
    this(paramInt);
    if (!f.oW(paramString)) {
      this.Yy = paramString;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    return ((paramObject instanceof e)) && (((e)paramObject).errCode == this.errCode);
  }
  
  public final boolean isSuccess()
  {
    return this.errCode == 0;
  }
  
  public String toString()
  {
    return "SoterCoreResult{errCode=" + this.errCode + ", errMsg='" + this.Yy + '\'' + '}';
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/d/a/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */