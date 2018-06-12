package oicq.wlogin_sdk.a;

public final class j
  extends a
{
  int vJn = 0;
  
  public j()
  {
    this.vIl = 264;
  }
  
  public final byte[] bZ(byte[] paramArrayOfByte)
  {
    this.vJn = paramArrayOfByte.length;
    byte[] arrayOfByte = new byte[this.vJn];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, paramArrayOfByte.length);
    super.IE(this.vIl);
    super.Z(arrayOfByte, this.vJn);
    super.cKe();
    return super.cKa();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/oicq/wlogin_sdk/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */