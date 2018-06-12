package com.google.android.exoplayer2.source.a;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.h.f;
import com.google.android.exoplayer2.h.i;
import com.google.android.exoplayer2.i.t;
import java.util.Arrays;

public abstract class c
  extends a
{
  private volatile boolean asP;
  public byte[] data;
  private int limit;
  
  public c(f paramf, i parami, Format paramFormat, int paramInt, Object paramObject, byte[] paramArrayOfByte)
  {
    super(paramf, parami, 3, paramFormat, paramInt, paramObject, -9223372036854775807L, -9223372036854775807L);
    this.data = paramArrayOfByte;
  }
  
  public abstract void e(byte[] paramArrayOfByte, int paramInt);
  
  public final long kP()
  {
    return this.limit;
  }
  
  public final void kQ()
  {
    this.asP = true;
  }
  
  public final boolean kR()
  {
    return this.asP;
  }
  
  public final void kS()
  {
    int i = 0;
    for (;;)
    {
      try
      {
        this.aiC.a(this.asJ);
        this.limit = 0;
        if ((i == -1) || (this.asP)) {
          break;
        }
        if (this.data == null)
        {
          this.data = new byte['䀀'];
          int j = this.aiC.read(this.data, this.limit, 16384);
          i = j;
          if (j == -1) {
            continue;
          }
          this.limit += j;
          i = j;
          continue;
        }
        if (this.data.length >= this.limit + 16384) {
          continue;
        }
      }
      finally
      {
        t.a(this.aiC);
      }
      this.data = Arrays.copyOf(this.data, this.data.length + 16384);
    }
    if (!this.asP) {
      e(this.data, this.limit);
    }
    t.a(this.aiC);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/exoplayer2/source/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */