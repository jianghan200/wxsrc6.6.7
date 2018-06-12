package oicq.wlogin_sdk.a;

public final class f
  extends a
{
  int vJe = 0;
  
  public f()
  {
    this.vIl = 260;
  }
  
  public final byte[] bY(byte[] paramArrayOfByte)
  {
    this.vJe = paramArrayOfByte.length;
    byte[] arrayOfByte = new byte[this.vJe];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, paramArrayOfByte.length);
    super.IE(this.vIl);
    super.Z(arrayOfByte, this.vJe);
    super.cKe();
    return super.cKa();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/oicq/wlogin_sdk/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */