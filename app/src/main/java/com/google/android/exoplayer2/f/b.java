package com.google.android.exoplayer2.f;

import com.google.android.exoplayer2.b.g;
import java.nio.ByteBuffer;

public abstract class b
  extends g<h, i, f>
  implements e
{
  private final String name;
  
  public b(String paramString)
  {
    super(new h[2], new i[2]);
    this.name = paramString;
    if (this.aio == this.aim.length) {}
    for (boolean bool = true;; bool = false)
    {
      com.google.android.exoplayer2.i.a.ap(bool);
      paramString = this.aim;
      int j = paramString.length;
      while (i < j)
      {
        paramString[i].ch(1024);
        i += 1;
      }
    }
  }
  
  private f a(h paramh, i parami, boolean paramBoolean)
  {
    try
    {
      Object localObject = paramh.aig;
      localObject = b(((ByteBuffer)localObject).array(), ((ByteBuffer)localObject).limit(), paramBoolean);
      parami.a(paramh.aih, (d)localObject, paramh.aek);
      parami.flags &= 0x7FFFFFFF;
      return null;
    }
    catch (f paramh) {}
    return paramh;
  }
  
  public final void O(long paramLong) {}
  
  protected final void a(i parami)
  {
    super.a(parami);
  }
  
  public abstract d b(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/exoplayer2/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */