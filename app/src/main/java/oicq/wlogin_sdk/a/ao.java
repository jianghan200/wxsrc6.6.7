package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.util;

public final class ao
  extends a
{
  int vJK = 0;
  int vJL = 0;
  
  public ao()
  {
    this.vIl = 2;
  }
  
  public final byte[] n(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    this.vJK = (paramArrayOfByte1.length + 6 + paramArrayOfByte2.length);
    byte[] arrayOfByte = new byte[this.vJK];
    util.B(arrayOfByte, 0, this.vJL);
    util.B(arrayOfByte, 2, paramArrayOfByte1.length);
    System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, 4, paramArrayOfByte1.length);
    int i = paramArrayOfByte1.length + 4;
    util.B(arrayOfByte, i, paramArrayOfByte2.length);
    System.arraycopy(paramArrayOfByte2, 0, arrayOfByte, i + 2, paramArrayOfByte2.length);
    super.IE(this.vIl);
    super.Z(arrayOfByte, this.vJK);
    super.cKe();
    return super.cKa();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/oicq/wlogin_sdk/a/ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */