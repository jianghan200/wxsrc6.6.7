package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.util;

public final class ae
  extends a
{
  int vJy = 0;
  int vJz = 0;
  
  public ae()
  {
    this.vIl = 322;
  }
  
  public final byte[] cb(byte[] paramArrayOfByte)
  {
    this.vJz = (paramArrayOfByte.length + 4);
    byte[] arrayOfByte = new byte[this.vJz];
    util.B(arrayOfByte, 0, this.vJy);
    util.B(arrayOfByte, 2, paramArrayOfByte.length);
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 4, paramArrayOfByte.length);
    super.IE(this.vIl);
    super.Z(arrayOfByte, arrayOfByte.length);
    super.cKe();
    return super.cKa();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/oicq/wlogin_sdk/a/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */