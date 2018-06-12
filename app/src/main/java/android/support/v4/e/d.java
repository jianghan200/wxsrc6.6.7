package android.support.v4.e;

import java.io.Writer;

public final class d
  extends Writer
{
  private StringBuilder mBuilder = new StringBuilder(128);
  private final String mTag;
  
  public d(String paramString)
  {
    this.mTag = paramString;
  }
  
  private void bU()
  {
    if (this.mBuilder.length() > 0) {
      this.mBuilder.delete(0, this.mBuilder.length());
    }
  }
  
  public final void close()
  {
    bU();
  }
  
  public final void flush()
  {
    bU();
  }
  
  public final void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i = 0;
    if (i < paramInt2)
    {
      char c = paramArrayOfChar[(paramInt1 + i)];
      if (c == '\n') {
        bU();
      }
      for (;;)
      {
        i += 1;
        break;
        this.mBuilder.append(c);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/e/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */