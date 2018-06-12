package com.google.android.exoplayer2.b;

import java.nio.ByteBuffer;

public class e
  extends a
{
  public final b aif = new b();
  public ByteBuffer aig;
  public long aih;
  public final int aii;
  
  public e(int paramInt)
  {
    this.aii = paramInt;
  }
  
  private ByteBuffer ci(int paramInt)
  {
    if (this.aii == 1) {
      return ByteBuffer.allocate(paramInt);
    }
    if (this.aii == 2) {
      return ByteBuffer.allocateDirect(paramInt);
    }
    if (this.aig == null) {}
    for (int i = 0;; i = this.aig.capacity()) {
      throw new IllegalStateException("Buffer too small (" + i + " < " + paramInt + ")");
    }
  }
  
  public final void ch(int paramInt)
  {
    if (this.aig == null) {
      this.aig = ci(paramInt);
    }
    int i;
    int j;
    do
    {
      return;
      i = this.aig.capacity();
      j = this.aig.position();
      paramInt = j + paramInt;
    } while (i >= paramInt);
    ByteBuffer localByteBuffer = ci(paramInt);
    if (j > 0)
    {
      this.aig.position(0);
      this.aig.limit(j);
      localByteBuffer.put(this.aig);
    }
    this.aig = localByteBuffer;
  }
  
  public final void clear()
  {
    super.clear();
    if (this.aig != null) {
      this.aig.clear();
    }
  }
  
  public final boolean jD()
  {
    return cg(1073741824);
  }
  
  public final void jE()
  {
    this.aig.flip();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/exoplayer2/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */