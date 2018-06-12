package g;

public abstract class a
{
  public final int height;
  public final int width;
  
  public a(int paramInt1, int paramInt2)
  {
    this.width = paramInt1;
    this.height = paramInt2;
  }
  
  public abstract byte[] bsX();
  
  public abstract byte[] m(int paramInt, byte[] paramArrayOfByte);
  
  public String toString()
  {
    byte[] arrayOfByte = new byte[this.width];
    StringBuilder localStringBuilder = new StringBuilder(this.height * (this.width + 1));
    int i = 0;
    int j;
    for (;;)
    {
      if (i >= this.height) {
        return localStringBuilder.toString();
      }
      arrayOfByte = m(i, arrayOfByte);
      j = 0;
      if (j < this.width) {
        break;
      }
      localStringBuilder.append('\n');
      i += 1;
    }
    int k = arrayOfByte[j] & 0xFF;
    char c;
    if (k < 64) {
      c = '#';
    }
    for (;;)
    {
      localStringBuilder.append(c);
      j += 1;
      break;
      if (k < 128) {
        c = '+';
      } else if (k < 192) {
        c = '.';
      } else {
        c = ' ';
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */