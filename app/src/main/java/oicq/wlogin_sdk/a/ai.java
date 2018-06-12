package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.util;

public final class ai
  extends a
{
  public int vJD = 0;
  public int vJE = 0;
  public int vJF = 0;
  
  public ai()
  {
    this.vIl = 326;
  }
  
  public final Boolean cKf()
  {
    if (this.vIV < 12) {
      return Boolean.valueOf(false);
    }
    int i = util.ac(this.vIf, this.vIU + 4);
    if (this.vIV < i + 12) {
      return Boolean.valueOf(false);
    }
    this.vJD = i;
    i = util.ac(this.vIf, this.vIU + 6 + this.vJD);
    if (this.vIV < this.vJD + 12 + i) {
      return Boolean.valueOf(false);
    }
    this.vJE = i;
    i = util.ac(this.vIf, this.vIU + 10 + this.vJD + this.vJE);
    if (this.vIV < this.vJD + 12 + this.vJE + i) {
      return Boolean.valueOf(false);
    }
    this.vJF = i;
    return Boolean.valueOf(true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/oicq/wlogin_sdk/a/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */