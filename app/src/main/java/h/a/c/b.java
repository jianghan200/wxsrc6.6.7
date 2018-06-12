package h.a.c;

import java.io.InputStream;

public final class b
{
  public int spd;
  public int vLI;
  public InputStream vLJ;
  
  public static void c(short[] paramArrayOfShort)
  {
    int i = 0;
    while (i < paramArrayOfShort.length)
    {
      paramArrayOfShort[i] = 1024;
      i += 1;
    }
  }
  
  public final int e(short[] paramArrayOfShort, int paramInt)
  {
    int i = paramArrayOfShort[paramInt];
    int j = (this.vLI >>> 11) * i;
    if ((this.spd ^ 0x80000000) < (0x80000000 ^ j))
    {
      this.vLI = j;
      paramArrayOfShort[paramInt] = ((short)(i + (2048 - i >>> 5)));
      if ((this.vLI & 0xFF000000) == 0)
      {
        this.spd = (this.spd << 8 | this.vLJ.read());
        this.vLI <<= 8;
      }
      return 0;
    }
    this.vLI -= j;
    this.spd -= j;
    paramArrayOfShort[paramInt] = ((short)(i - (i >>> 5)));
    if ((this.vLI & 0xFF000000) == 0)
    {
      this.spd = (this.spd << 8 | this.vLJ.read());
      this.vLI <<= 8;
    }
    return 1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/h/a/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */