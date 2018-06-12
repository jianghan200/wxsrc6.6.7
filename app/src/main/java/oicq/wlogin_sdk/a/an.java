package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.util;

public final class an
  extends a
{
  int vJH = 22;
  int vJI = 1;
  int vJJ = 1536;
  
  public an()
  {
    this.vIl = 24;
  }
  
  public final byte[] U(int paramInt, long paramLong)
  {
    byte[] arrayOfByte = new byte[this.vJH];
    util.B(arrayOfByte, 0, this.vJI);
    util.C(arrayOfByte, 2, this.vJJ);
    util.C(arrayOfByte, 6, 522017402);
    util.C(arrayOfByte, 10, paramInt);
    util.C(arrayOfByte, 14, (int)paramLong);
    util.B(arrayOfByte, 18, 0);
    util.B(arrayOfByte, 20, 0);
    super.IE(this.vIl);
    super.Z(arrayOfByte, this.vJH);
    super.cKe();
    return super.cKa();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/oicq/wlogin_sdk/a/an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */