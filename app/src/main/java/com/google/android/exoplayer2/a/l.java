package com.google.android.exoplayer2.a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public final class l
  implements d
{
  private int aeg = -1;
  float aex = 1.0F;
  private ByteBuffer agG = afB;
  private k ahP;
  private ShortBuffer ahQ = this.buffer.asShortBuffer();
  long ahR;
  long ahS;
  private int ahe = -1;
  private boolean ahi;
  private ByteBuffer buffer = afB;
  float pitch = 1.0F;
  
  public final void c(ByteBuffer paramByteBuffer)
  {
    Object localObject1;
    Object localObject2;
    int j;
    int k;
    if (paramByteBuffer.hasRemaining())
    {
      localObject1 = paramByteBuffer.asShortBuffer();
      i = paramByteBuffer.remaining();
      this.ahR += i;
      localObject2 = this.ahP;
      j = ((ShortBuffer)localObject1).remaining() / ((k)localObject2).ahu;
      k = ((k)localObject2).ahu;
      ((k)localObject2).ce(j);
      ((ShortBuffer)localObject1).get(((k)localObject2).ahA, ((k)localObject2).ahH * ((k)localObject2).ahu, k * j * 2 / 2);
      ((k)localObject2).ahH += j;
      ((k)localObject2).jw();
      paramByteBuffer.position(paramByteBuffer.position() + i);
    }
    int i = this.ahP.ahI * this.aeg * 2;
    if (i > 0)
    {
      if (this.buffer.capacity() >= i) {
        break label301;
      }
      this.buffer = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
      this.ahQ = this.buffer.asShortBuffer();
    }
    for (;;)
    {
      paramByteBuffer = this.ahP;
      localObject1 = this.ahQ;
      j = Math.min(((ShortBuffer)localObject1).remaining() / paramByteBuffer.ahu, paramByteBuffer.ahI);
      ((ShortBuffer)localObject1).put(paramByteBuffer.ahC, 0, paramByteBuffer.ahu * j);
      paramByteBuffer.ahI -= j;
      localObject1 = paramByteBuffer.ahC;
      k = paramByteBuffer.ahu;
      localObject2 = paramByteBuffer.ahC;
      int m = paramByteBuffer.ahI;
      System.arraycopy(localObject1, j * k, localObject2, 0, paramByteBuffer.ahu * m);
      this.ahS += i;
      this.buffer.limit(i);
      this.agG = this.buffer;
      return;
      label301:
      this.buffer.clear();
      this.ahQ.clear();
    }
  }
  
  public final void flush()
  {
    this.ahP = new k(this.ahe, this.aeg);
    this.ahP.aex = this.aex;
    this.ahP.pitch = this.pitch;
    this.agG = afB;
    this.ahR = 0L;
    this.ahS = 0L;
    this.ahi = false;
  }
  
  public final boolean iT()
  {
    return (this.ahi) && ((this.ahP == null) || (this.ahP.ahI == 0));
  }
  
  public final int iY()
  {
    return this.aeg;
  }
  
  public final int iZ()
  {
    return 2;
  }
  
  public final boolean isActive()
  {
    return (Math.abs(this.aex - 1.0F) >= 0.01F) || (Math.abs(this.pitch - 1.0F) >= 0.01F);
  }
  
  public final void ja()
  {
    k localk = this.ahP;
    int j = localk.ahH;
    float f = localk.aex / localk.pitch;
    int k = localk.ahI + (int)((j / f + localk.ahJ) / localk.pitch + 0.5F);
    localk.ce(localk.ahx * 2 + j);
    int i = 0;
    while (i < localk.ahx * 2 * localk.ahu)
    {
      localk.ahA[(localk.ahu * j + i)] = 0;
      i += 1;
    }
    localk.ahH += localk.ahx * 2;
    localk.jw();
    if (localk.ahI > k) {
      localk.ahI = k;
    }
    localk.ahH = 0;
    localk.ahK = 0;
    localk.ahJ = 0;
    this.ahi = true;
  }
  
  public final ByteBuffer jb()
  {
    ByteBuffer localByteBuffer = this.agG;
    this.agG = afB;
    return localByteBuffer;
  }
  
  public final boolean r(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt3 != 2) {
      throw new d.a(paramInt1, paramInt2, paramInt3);
    }
    if ((this.ahe == paramInt1) && (this.aeg == paramInt2)) {
      return false;
    }
    this.ahe = paramInt1;
    this.aeg = paramInt2;
    return true;
  }
  
  public final void reset()
  {
    this.ahP = null;
    this.buffer = afB;
    this.ahQ = this.buffer.asShortBuffer();
    this.agG = afB;
    this.aeg = -1;
    this.ahe = -1;
    this.ahR = 0L;
    this.ahS = 0L;
    this.ahi = false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/exoplayer2/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */