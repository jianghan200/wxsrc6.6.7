package oicq.wlogin_sdk.a;

import oicq.wlogin_sdk.tools.d;
import oicq.wlogin_sdk.tools.util;

public class a
{
  public int vHZ = 128;
  int vIT = 0;
  public int vIU = 4;
  public int vIV = 0;
  public int vIa = 0;
  public byte[] vIf = new byte[this.vHZ];
  public int vIl = 0;
  
  private static int y(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int j = paramArrayOfByte.length;
    for (;;)
    {
      if (paramInt1 >= j) {}
      do
      {
        int i = -1;
        do
        {
          return i;
          if (paramInt1 + 2 > j) {
            break;
          }
          i = paramInt1;
        } while (util.ac(paramArrayOfByte, paramInt1) == paramInt2);
        paramInt1 += 2;
      } while (paramInt1 + 2 > j);
      paramInt1 += util.ac(paramArrayOfByte, paramInt1) + 2;
    }
  }
  
  public final void IE(int paramInt)
  {
    util.B(this.vIf, this.vIa, paramInt);
    this.vIa += 2;
    util.B(this.vIf, this.vIa, 0);
    this.vIa += 2;
  }
  
  public final void Z(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramInt > this.vHZ - this.vIU)
    {
      this.vHZ = (this.vIU + paramInt + 64);
      byte[] arrayOfByte = new byte[this.vHZ];
      System.arraycopy(this.vIf, 0, arrayOfByte, 0, this.vIa);
      this.vIf = arrayOfByte;
    }
    this.vIV = paramInt;
    System.arraycopy(paramArrayOfByte, 0, this.vIf, this.vIa, paramInt);
    this.vIa += paramInt;
  }
  
  public final int b(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2)
  {
    int i = y(paramArrayOfByte1, paramInt1, this.vIl);
    if (i < 0) {}
    byte[] arrayOfByte;
    do
    {
      do
      {
        return -1;
        paramInt1 = paramInt2 - (i - paramInt1);
        arrayOfByte = new byte[paramInt1];
        System.arraycopy(paramArrayOfByte1, i, arrayOfByte, 0, paramInt1);
      } while (this.vIU >= paramInt1);
      this.vIV = util.ac(arrayOfByte, 2);
    } while (this.vIU + this.vIV > paramInt1);
    paramArrayOfByte1 = d.decrypt(arrayOfByte, this.vIU, this.vIV, paramArrayOfByte2);
    if (paramArrayOfByte1 == null) {
      return 64521;
    }
    if (this.vIU + paramArrayOfByte1.length > this.vHZ)
    {
      this.vHZ = (this.vIU + paramArrayOfByte1.length);
      this.vIf = new byte[this.vHZ];
    }
    this.vIa = 0;
    System.arraycopy(arrayOfByte, 0, this.vIf, 0, this.vIU);
    this.vIa += this.vIU;
    System.arraycopy(paramArrayOfByte1, 0, this.vIf, this.vIa, paramArrayOfByte1.length);
    this.vIa += paramArrayOfByte1.length;
    this.vIV = paramArrayOfByte1.length;
    if (!cKf().booleanValue()) {
      return 64531;
    }
    return 0;
  }
  
  public final byte[] cKa()
  {
    byte[] arrayOfByte = new byte[this.vIa];
    System.arraycopy(this.vIf, 0, arrayOfByte, 0, this.vIa);
    return arrayOfByte;
  }
  
  public final byte[] cKd()
  {
    byte[] arrayOfByte = new byte[this.vIV];
    System.arraycopy(this.vIf, this.vIU, arrayOfByte, 0, this.vIV);
    return arrayOfByte;
  }
  
  public final void cKe()
  {
    util.B(this.vIf, 2, this.vIa - this.vIU);
  }
  
  public Boolean cKf()
  {
    return Boolean.valueOf(true);
  }
  
  public final int z(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = y(paramArrayOfByte, paramInt1, this.vIl);
    if (i < 0) {}
    do
    {
      do
      {
        return -1;
        paramInt1 = paramInt2 - (i - paramInt1);
      } while (this.vIU >= paramInt1);
      this.vIV = util.ac(paramArrayOfByte, i + 2);
    } while (this.vIU + this.vIV > paramInt1);
    paramInt1 = this.vIU + this.vIV;
    if (paramInt1 > this.vHZ)
    {
      this.vHZ = (paramInt1 + 128);
      this.vIf = new byte[this.vHZ];
    }
    this.vIa = paramInt1;
    System.arraycopy(paramArrayOfByte, i, this.vIf, 0, paramInt1);
    this.vIl = util.ac(paramArrayOfByte, i);
    this.vIV = (paramInt1 - this.vIU);
    if (!cKf().booleanValue()) {
      return 64531;
    }
    return this.vIU + i + this.vIV;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/oicq/wlogin_sdk/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */