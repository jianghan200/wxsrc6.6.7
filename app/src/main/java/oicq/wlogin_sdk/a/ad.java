package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.util;

public final class ad
  extends a
{
  public int vJx = 0;
  
  public ad()
  {
    this.vIl = 312;
  }
  
  public final Boolean cKf()
  {
    if (this.vIV < 4) {
      return Boolean.valueOf(false);
    }
    this.vJx = util.ad(this.vIf, this.vIU);
    if (this.vIV < this.vJx * 10 + 4) {
      return Boolean.valueOf(false);
    }
    return Boolean.valueOf(true);
  }
  
  public final int cKh()
  {
    int i = 0;
    for (;;)
    {
      if (i >= this.vJx) {
        return 0;
      }
      if (util.ac(this.vIf, this.vIU + 4 + i * 10) == 266) {
        return util.ad(this.vIf, i * 10 + (this.vIU + 4) + 2);
      }
      i += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/oicq/wlogin_sdk/a/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */