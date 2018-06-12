package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.util;

public final class y
  extends a
{
  int vJs = 0;
  
  public y()
  {
    this.vIl = 292;
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
  
  public final byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt, byte[] paramArrayOfByte3, byte[] paramArrayOfByte4, byte[] paramArrayOfByte5)
  {
    int n = aa(paramArrayOfByte1, 16);
    int m = aa(paramArrayOfByte2, 16);
    int k = aa(paramArrayOfByte3, 16);
    int j = aa(paramArrayOfByte4, 32);
    int i = aa(paramArrayOfByte5, 16);
    this.vJs = (n + 2 + 2 + m + 2 + 2 + k + 2 + j + 2 + i);
    byte[] arrayOfByte = new byte[this.vJs];
    util.B(arrayOfByte, 0, n);
    System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, 2, n);
    n += 2;
    util.B(arrayOfByte, n, m);
    n += 2;
    System.arraycopy(paramArrayOfByte2, 0, arrayOfByte, n, m);
    m = n + m;
    util.B(arrayOfByte, m, paramInt);
    paramInt = m + 2;
    util.B(arrayOfByte, paramInt, k);
    paramInt += 2;
    System.arraycopy(paramArrayOfByte3, 0, arrayOfByte, paramInt, k);
    paramInt += k;
    util.B(arrayOfByte, paramInt, j);
    paramInt += 2;
    System.arraycopy(paramArrayOfByte4, 0, arrayOfByte, paramInt, j);
    paramInt += j;
    util.B(arrayOfByte, paramInt, i);
    System.arraycopy(paramArrayOfByte5, 0, arrayOfByte, paramInt + 2, i);
    super.IE(this.vIl);
    super.Z(arrayOfByte, this.vJs);
    super.cKe();
    return super.cKa();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/oicq/wlogin_sdk/a/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */