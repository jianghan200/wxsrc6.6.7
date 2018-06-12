package com.google.android.exoplayer2.h;

import com.google.android.exoplayer2.i.a;
import java.io.InputStream;

public final class h
  extends InputStream
{
  private final byte[] aAG;
  long aAH;
  private final f aiC;
  private final i asJ;
  private boolean closed = false;
  private boolean opened = false;
  
  public h(f paramf, i parami)
  {
    this.aiC = paramf;
    this.asJ = parami;
    this.aAG = new byte[1];
  }
  
  public final void close()
  {
    if (!this.closed)
    {
      this.aiC.close();
      this.closed = true;
    }
  }
  
  final void lP()
  {
    if (!this.opened)
    {
      this.aiC.a(this.asJ);
      this.opened = true;
    }
  }
  
  public final int read()
  {
    if (read(this.aAG) == -1) {
      return -1;
    }
    return this.aAG[0] & 0xFF;
  }
  
  public final int read(byte[] paramArrayOfByte)
  {
    return read(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (!this.closed) {}
    for (boolean bool = true;; bool = false)
    {
      a.ap(bool);
      lP();
      paramInt1 = this.aiC.read(paramArrayOfByte, paramInt1, paramInt2);
      if (paramInt1 != -1) {
        break;
      }
      return -1;
    }
    this.aAH += paramInt1;
    return paramInt1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/exoplayer2/h/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */