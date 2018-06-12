package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.util;

public final class g
  extends a
{
  public int vJf = 0;
  public int vJg = 0;
  public int vJh = 0;
  public int vJi = 0;
  
  public g()
  {
    this.vIl = 261;
  }
  
  public final Boolean cKf()
  {
    if (this.vIV < 2) {
      return Boolean.valueOf(false);
    }
    this.vJg = util.ac(this.vIf, this.vIU);
    if (this.vIV < this.vJg + 2 + 2) {
      return Boolean.valueOf(false);
    }
    this.vJf = util.ac(this.vIf, this.vIU + 2 + this.vJg);
    if (this.vIV < this.vJg + 2 + 2 + this.vJf) {
      return Boolean.valueOf(false);
    }
    this.vJi = (this.vIU + 2);
    this.vJh = (this.vJg + 2 + 2 + this.vIU);
    return Boolean.valueOf(true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/oicq/wlogin_sdk/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */