package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.util;

public final class c
  extends a
{
  int vJb = 1;
  int vJc = util.vKh;
  int vJd = 22;
  
  public c()
  {
    this.vIl = 256;
  }
  
  public final byte[] IF(int paramInt)
  {
    byte[] arrayOfByte = new byte[this.vJd];
    util.B(arrayOfByte, 0, this.vJb);
    util.C(arrayOfByte, 2, this.vJc);
    util.C(arrayOfByte, 6, 522017402);
    util.C(arrayOfByte, 10, 1);
    util.C(arrayOfByte, 14, paramInt);
    util.C(arrayOfByte, 18, 8256);
    super.IE(this.vIl);
    super.Z(arrayOfByte, this.vJd);
    super.cKe();
    return super.cKa();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/oicq/wlogin_sdk/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */