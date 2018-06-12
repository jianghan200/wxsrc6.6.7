package com.eclipsesource.a;

import java.io.Writer;

final class m
  extends Writer
{
  private final char[] abN;
  private final Writer acb;
  private int fill = 0;
  
  m(Writer paramWriter)
  {
    this.acb = paramWriter;
    this.abN = new char[''];
  }
  
  public final void close() {}
  
  public final void flush()
  {
    this.acb.write(this.abN, 0, this.fill);
    this.fill = 0;
  }
  
  public final void write(int paramInt)
  {
    if (this.fill > this.abN.length - 1) {
      flush();
    }
    char[] arrayOfChar = this.abN;
    int i = this.fill;
    this.fill = (i + 1);
    arrayOfChar[i] = ((char)paramInt);
  }
  
  public final void write(String paramString, int paramInt1, int paramInt2)
  {
    if (this.fill > this.abN.length - paramInt2)
    {
      flush();
      if (paramInt2 > this.abN.length)
      {
        this.acb.write(paramString, paramInt1, paramInt2);
        return;
      }
    }
    paramString.getChars(paramInt1, paramInt1 + paramInt2, this.abN, this.fill);
    this.fill += paramInt2;
  }
  
  public final void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (this.fill > this.abN.length - paramInt2)
    {
      flush();
      if (paramInt2 > this.abN.length)
      {
        this.acb.write(paramArrayOfChar, paramInt1, paramInt2);
        return;
      }
    }
    System.arraycopy(paramArrayOfChar, paramInt1, this.abN, this.fill, paramInt2);
    this.fill += paramInt2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/eclipsesource/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */