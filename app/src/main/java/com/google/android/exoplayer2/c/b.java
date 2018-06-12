package com.google.android.exoplayer2.c;

import com.google.android.exoplayer2.h.f;
import com.google.android.exoplayer2.i.t;
import java.io.EOFException;
import java.util.Arrays;

public final class b
  implements e
{
  private static final byte[] aiB = new byte['က'];
  private final f aiC;
  private final long aiD;
  private byte[] aiE;
  private int aiF;
  private int aiG;
  private long position;
  
  public b(f paramf, long paramLong1, long paramLong2)
  {
    this.aiC = paramf;
    this.position = paramLong1;
    this.aiD = paramLong2;
    this.aiE = new byte[65536];
  }
  
  private int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if (Thread.interrupted()) {
      throw new InterruptedException();
    }
    paramInt1 = this.aiC.read(paramArrayOfByte, paramInt1 + paramInt3, paramInt2 - paramInt3);
    if (paramInt1 == -1)
    {
      if ((paramInt3 == 0) && (paramBoolean)) {
        return -1;
      }
      throw new EOFException();
    }
    return paramInt3 + paramInt1;
  }
  
  private int c(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.aiG == 0) {
      return 0;
    }
    paramInt2 = Math.min(this.aiG, paramInt2);
    System.arraycopy(this.aiE, 0, paramArrayOfByte, paramInt1, paramInt2);
    cn(paramInt2);
    return paramInt2;
  }
  
  private int cm(int paramInt)
  {
    paramInt = Math.min(this.aiG, paramInt);
    cn(paramInt);
    return paramInt;
  }
  
  private void cn(int paramInt)
  {
    this.aiG -= paramInt;
    this.aiF = 0;
    byte[] arrayOfByte = this.aiE;
    if (this.aiG < this.aiE.length - 524288) {
      arrayOfByte = new byte[this.aiG + 65536];
    }
    System.arraycopy(this.aiE, paramInt, arrayOfByte, 0, this.aiG);
    this.aiE = arrayOfByte;
  }
  
  private void co(int paramInt)
  {
    if (paramInt != -1) {
      this.position += paramInt;
    }
  }
  
  private boolean p(int paramInt, boolean paramBoolean)
  {
    int i = this.aiF + paramInt;
    if (i > this.aiE.length)
    {
      i = t.u(this.aiE.length * 2, 65536 + i, i + 524288);
      this.aiE = Arrays.copyOf(this.aiE, i);
    }
    i = Math.min(this.aiG - this.aiF, paramInt);
    while (i < paramInt)
    {
      int j = a(this.aiE, this.aiF, paramInt, i, paramBoolean);
      i = j;
      if (j == -1) {
        return false;
      }
    }
    this.aiF += paramInt;
    this.aiG = Math.max(this.aiG, this.aiF);
    return true;
  }
  
  public final boolean a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    for (int i = c(paramArrayOfByte, paramInt1, paramInt2); (i < paramInt2) && (i != -1); i = a(paramArrayOfByte, paramInt1, paramInt2, i, paramBoolean)) {}
    co(i);
    return i != -1;
  }
  
  public final void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    b(paramArrayOfByte, paramInt1, paramInt2, false);
  }
  
  public final boolean b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (!p(paramInt2, paramBoolean)) {
      return false;
    }
    System.arraycopy(this.aiE, this.aiF - paramInt2, paramArrayOfByte, paramInt1, paramInt2);
    return true;
  }
  
  public final int cj(int paramInt)
  {
    int j = cm(paramInt);
    int i = j;
    if (j == 0) {
      i = a(aiB, 0, Math.min(paramInt, aiB.length), 0, true);
    }
    co(i);
    return i;
  }
  
  public final void ck(int paramInt)
  {
    for (int i = cm(paramInt); (i < paramInt) && (i != -1); i = a(aiB, -i, Math.min(paramInt, aiB.length + i), i, false)) {}
    co(i);
  }
  
  public final void cl(int paramInt)
  {
    p(paramInt, false);
  }
  
  public final long getLength()
  {
    return this.aiD;
  }
  
  public final long getPosition()
  {
    return this.position;
  }
  
  public final void jS()
  {
    this.aiF = 0;
  }
  
  public final long jT()
  {
    return this.position + this.aiF;
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int j = c(paramArrayOfByte, paramInt1, paramInt2);
    int i = j;
    if (j == 0) {
      i = a(paramArrayOfByte, paramInt1, paramInt2, 0, true);
    }
    co(i);
    return i;
  }
  
  public final void readFully(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    a(paramArrayOfByte, paramInt1, paramInt2, false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/exoplayer2/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */