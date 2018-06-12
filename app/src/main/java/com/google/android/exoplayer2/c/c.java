package com.google.android.exoplayer2.c;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.i.j;
import java.io.EOFException;

public final class c
  implements k
{
  public final int a(e parame, int paramInt, boolean paramBoolean)
  {
    paramInt = parame.cj(paramInt);
    if (paramInt == -1)
    {
      if (paramBoolean) {
        return -1;
      }
      throw new EOFException();
    }
    return paramInt;
  }
  
  public final void a(long paramLong, int paramInt1, int paramInt2, int paramInt3, k.a parama) {}
  
  public final void a(j paramj, int paramInt)
  {
    paramj.da(paramInt);
  }
  
  public final void f(Format paramFormat) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/exoplayer2/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */