package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.util;

public final class t
  extends a
{
  public int vJr = 0;
  
  public t()
  {
    this.vIl = 282;
  }
  
  public final Boolean cKf()
  {
    if (this.vIV < 5) {
      return Boolean.valueOf(false);
    }
    int i = util.ab(this.vIf, this.vIU + 2 + 1 + 1);
    if (this.vIV < i + 5) {
      return Boolean.valueOf(false);
    }
    this.vJr = i;
    return Boolean.valueOf(true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/oicq/wlogin_sdk/a/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */