package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.util;

public final class ab
  extends a
{
  public int vJw = 0;
  
  public ab()
  {
    this.vIl = 306;
  }
  
  public final Boolean cKf()
  {
    if (this.vIV < 2) {
      return Boolean.valueOf(false);
    }
    this.vJw = util.ac(this.vIf, this.vIU);
    if (this.vJw + 2 > this.vIV) {
      return Boolean.valueOf(false);
    }
    return Boolean.valueOf(true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/oicq/wlogin_sdk/a/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */