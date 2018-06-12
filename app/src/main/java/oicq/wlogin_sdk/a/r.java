package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.util;

public final class r
  extends a
{
  int vJp = 0;
  int vJq = 0;
  
  public r()
  {
    this.vIl = 278;
  }
  
  public final byte[] fW(int paramInt1, int paramInt2)
  {
    this.vJp = 10;
    byte[] arrayOfByte = new byte[this.vJp];
    util.A(arrayOfByte, 0, this.vJq);
    util.C(arrayOfByte, 1, paramInt1);
    util.C(arrayOfByte, 5, paramInt2);
    util.A(arrayOfByte, 9, 0);
    super.IE(this.vIl);
    super.Z(arrayOfByte, this.vJp);
    super.cKe();
    return super.cKa();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/oicq/wlogin_sdk/a/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */