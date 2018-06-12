package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.util;

public final class aa
  extends a
{
  int vJv = 0;
  
  public aa()
  {
    this.vIl = 296;
  }
  
  private static int aa(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramArrayOfByte != null)
    {
      if (paramArrayOfByte.length > paramInt) {
        return paramInt;
      }
      return paramArrayOfByte.length;
    }
    return 0;
  }
  
  public final byte[] a(int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int j = aa(paramArrayOfByte1, 32);
    int i = aa(paramArrayOfByte2, 16);
    this.vJv = (j + 11 + 2 + i + 2);
    byte[] arrayOfByte = new byte[this.vJv];
    util.B(arrayOfByte, 0, 0);
    util.A(arrayOfByte, 2, paramInt1);
    util.A(arrayOfByte, 3, paramInt2);
    util.A(arrayOfByte, 4, paramInt3);
    util.C(arrayOfByte, 5, 0);
    util.B(arrayOfByte, 9, j);
    System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, 11, j);
    paramInt1 = j + 11;
    util.B(arrayOfByte, paramInt1, i);
    paramInt1 += 2;
    System.arraycopy(paramArrayOfByte2, 0, arrayOfByte, paramInt1, i);
    util.B(arrayOfByte, paramInt1 + i, 0);
    super.IE(this.vIl);
    super.Z(arrayOfByte, this.vJv);
    super.cKe();
    return super.cKa();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/oicq/wlogin_sdk/a/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */