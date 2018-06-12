package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.util;

public final class i
  extends a
{
  int vJm = 6;
  
  public i()
  {
    this.vIl = 263;
  }
  
  public final byte[] cKg()
  {
    byte[] arrayOfByte = new byte[this.vJm];
    util.B(arrayOfByte, 0, 0);
    util.A(arrayOfByte, 2, 1);
    util.B(arrayOfByte, 3, 102400);
    util.A(arrayOfByte, 5, 1);
    super.IE(this.vIl);
    super.Z(arrayOfByte, this.vJm);
    super.cKe();
    return super.cKa();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/oicq/wlogin_sdk/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */