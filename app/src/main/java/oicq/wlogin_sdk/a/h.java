package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.c;
import oicq.wlogin_sdk.tools.d;
import oicq.wlogin_sdk.tools.util;

public final class h
  extends a
{
  int vJj = 1;
  int vJk = 1;
  int vJl = 69;
  
  public h()
  {
    this.vIl = 262;
    if (util.vKh <= 2)
    {
      this.vJj = 1;
      this.vJl = 69;
      return;
    }
    this.vJj = 2;
    this.vJl = 90;
  }
  
  public final byte[] a(int paramInt1, long paramLong, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, byte[] paramArrayOfByte4, int paramInt2, byte[] paramArrayOfByte5)
  {
    if (util.vKh <= 2)
    {
      paramArrayOfByte5 = new byte[this.vJl];
      util.B(paramArrayOfByte5, 0, this.vJj);
      util.C(paramArrayOfByte5, 2, util.cKl());
      util.C(paramArrayOfByte5, 6, this.vJk);
      util.C(paramArrayOfByte5, 10, 522017402);
      util.C(paramArrayOfByte5, 14, paramInt1);
      util.c(paramArrayOfByte5, 18, paramLong);
      System.arraycopy(paramArrayOfByte1, 0, paramArrayOfByte5, 26, paramArrayOfByte1.length);
      paramInt1 = paramArrayOfByte1.length + 26;
      System.arraycopy(paramArrayOfByte2, 0, paramArrayOfByte5, paramInt1, paramArrayOfByte2.length);
      paramInt1 += paramArrayOfByte2.length;
      util.A(paramArrayOfByte5, paramInt1, 1);
      paramInt1 += 1;
      System.arraycopy(paramArrayOfByte3, 0, paramArrayOfByte5, paramInt1, paramArrayOfByte3.length);
      System.arraycopy(paramArrayOfByte4, 0, paramArrayOfByte5, paramInt1 + paramArrayOfByte3.length, paramArrayOfByte4.length);
      paramArrayOfByte1 = new byte[24];
      System.arraycopy(paramArrayOfByte3, 0, paramArrayOfByte1, 0, paramArrayOfByte3.length);
      util.c(paramArrayOfByte1, 16, paramLong);
      paramArrayOfByte1 = c.ce(paramArrayOfByte1);
      paramArrayOfByte1 = d.b(paramArrayOfByte5, paramArrayOfByte5.length, paramArrayOfByte1);
      this.vJl = paramArrayOfByte1.length;
      super.IE(this.vIl);
      super.Z(paramArrayOfByte1, this.vJl);
      super.cKe();
      return super.cKa();
    }
    byte[] arrayOfByte = new byte[this.vJl];
    util.B(arrayOfByte, 0, this.vJj);
    util.C(arrayOfByte, 2, util.cKl());
    util.C(arrayOfByte, 6, this.vJk);
    util.C(arrayOfByte, 10, 522017402);
    util.C(arrayOfByte, 14, paramInt1);
    util.c(arrayOfByte, 18, paramLong);
    System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, 26, paramArrayOfByte1.length);
    paramInt1 = paramArrayOfByte1.length + 26;
    System.arraycopy(paramArrayOfByte2, 0, arrayOfByte, paramInt1, paramArrayOfByte2.length);
    paramInt1 += paramArrayOfByte2.length;
    util.A(arrayOfByte, paramInt1, 1);
    paramInt1 += 1;
    System.arraycopy(paramArrayOfByte3, 0, arrayOfByte, paramInt1, paramArrayOfByte3.length);
    paramInt1 += paramArrayOfByte3.length;
    System.arraycopy(paramArrayOfByte4, 0, arrayOfByte, paramInt1, paramArrayOfByte4.length);
    paramInt1 += paramArrayOfByte4.length;
    util.C(arrayOfByte, paramInt1, 0);
    paramInt1 += 4;
    util.A(arrayOfByte, paramInt1, paramInt2);
    if ((paramArrayOfByte5 == null) || (paramArrayOfByte5.length <= 0))
    {
      paramArrayOfByte1 = new byte[16];
      util.C(paramArrayOfByte1, 0, util.cKl());
      util.C(paramArrayOfByte1, 4, util.cKl());
      util.C(paramArrayOfByte1, 8, util.cKl());
      util.C(paramArrayOfByte1, 12, util.cKl());
    }
    for (;;)
    {
      paramArrayOfByte1 = new byte[24];
      System.arraycopy(paramArrayOfByte3, 0, paramArrayOfByte1, 0, paramArrayOfByte3.length);
      util.c(paramArrayOfByte1, 16, paramLong);
      paramArrayOfByte1 = c.ce(paramArrayOfByte1);
      paramArrayOfByte1 = d.b(arrayOfByte, arrayOfByte.length, paramArrayOfByte1);
      this.vJl = paramArrayOfByte1.length;
      super.IE(this.vIl);
      super.Z(paramArrayOfByte1, this.vJl);
      super.cKe();
      return cKa();
      System.arraycopy(paramArrayOfByte5, 0, arrayOfByte, paramInt1 + 1, paramArrayOfByte5.length);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/oicq/wlogin_sdk/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */