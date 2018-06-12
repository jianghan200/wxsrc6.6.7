package oicq.wlogin_sdk.a;

public final class ah
  extends a
{
  public int vJC = 0;
  
  public ah()
  {
    this.vIl = 325;
  }
  
  public final byte[] cc(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {}
    for (int i = paramArrayOfByte.length + 0;; i = 0)
    {
      byte[] arrayOfByte = new byte[i];
      if (arrayOfByte.length > 0) {
        System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, i);
      }
      this.vJC = arrayOfByte.length;
      super.IE(this.vIl);
      super.Z(arrayOfByte, arrayOfByte.length);
      super.cKe();
      return super.cKa();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/oicq/wlogin_sdk/a/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */