package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.util;

public final class b
  extends a
{
  int vIW = 4;
  int vIX = 14;
  int vIY = 1;
  int vIZ = 20;
  byte[] vJa = new byte[2];
  
  public b()
  {
    this.vIl = 1;
  }
  
  public final Boolean cKf()
  {
    if (this.vIV < 20) {
      return Boolean.valueOf(false);
    }
    return Boolean.valueOf(true);
  }
  
  public final byte[] g(long paramLong, byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = new byte[this.vIZ];
    util.B(arrayOfByte, 0, this.vIY);
    util.C(arrayOfByte, 2, util.cKl());
    util.C(arrayOfByte, 6, (int)paramLong);
    util.d(arrayOfByte, 10, util.cKn());
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 14, paramArrayOfByte.length);
    util.B(arrayOfByte, paramArrayOfByte.length + 14, 0);
    super.IE(this.vIl);
    super.Z(arrayOfByte, this.vIZ);
    super.cKe();
    return super.cKa();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/oicq/wlogin_sdk/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */