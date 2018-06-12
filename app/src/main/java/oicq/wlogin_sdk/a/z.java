package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.util;

public final class z
  extends a
{
  public int vJt = 0;
  public int vJu = 0;
  
  public z()
  {
    this.vIl = 293;
  }
  
  public final Boolean cKf()
  {
    if (this.vIV < 2) {
      return Boolean.valueOf(false);
    }
    this.vJt = util.ac(this.vIf, this.vIU);
    if (this.vIV < this.vJt + 2 + 2) {
      return Boolean.valueOf(false);
    }
    this.vJu = util.ac(this.vIf, this.vIU + 2 + this.vJt);
    return Boolean.valueOf(true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/oicq/wlogin_sdk/a/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */