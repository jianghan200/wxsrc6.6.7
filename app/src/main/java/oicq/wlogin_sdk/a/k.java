package oicq.wlogin_sdk.a;

public final class k
  extends a
{
  int vJo = 0;
  
  public k()
  {
    this.vIl = 265;
  }
  
  public final byte[] ca(byte[] paramArrayOfByte)
  {
    this.vJo = paramArrayOfByte.length;
    byte[] arrayOfByte = new byte[this.vJo];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, paramArrayOfByte.length);
    super.IE(this.vIl);
    super.Z(arrayOfByte, this.vJo);
    super.cKe();
    return super.cKa();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/oicq/wlogin_sdk/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */