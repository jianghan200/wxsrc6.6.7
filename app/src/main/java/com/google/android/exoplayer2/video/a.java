package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.i.c;
import com.google.android.exoplayer2.i.h;
import com.google.android.exoplayer2.i.h.b;
import com.google.android.exoplayer2.i.j;
import com.google.android.exoplayer2.o;
import java.util.ArrayList;
import java.util.List;

public final class a
{
  public final float aCi;
  public final List<byte[]> adY;
  public final int alp;
  public final int height;
  public final int width;
  
  private a(List<byte[]> paramList, int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    this.adY = paramList;
    this.alp = paramInt1;
    this.width = paramInt2;
    this.height = paramInt3;
    this.aCi = paramFloat;
  }
  
  public static a m(j paramj)
  {
    int j = 0;
    int k;
    try
    {
      paramj.da(4);
      k = (paramj.readUnsignedByte() & 0x3) + 1;
      if (k == 3) {
        throw new IllegalStateException();
      }
    }
    catch (ArrayIndexOutOfBoundsException paramj)
    {
      throw new o("Error parsing AVC config", paramj);
    }
    ArrayList localArrayList = new ArrayList();
    int m = paramj.readUnsignedByte() & 0x1F;
    int i = 0;
    while (i < m)
    {
      localArrayList.add(n(paramj));
      i += 1;
    }
    int n = paramj.readUnsignedByte();
    i = j;
    while (i < n)
    {
      localArrayList.add(n(paramj));
      i += 1;
    }
    float f = 1.0F;
    if (m > 0)
    {
      paramj = (byte[])localArrayList.get(0);
      paramj = h.j((byte[])localArrayList.get(0), k, paramj.length);
      i = paramj.width;
      j = paramj.height;
      f = paramj.aCi;
    }
    for (;;)
    {
      paramj = new a(localArrayList, k, i, j, f);
      return paramj;
      i = -1;
      j = -1;
    }
  }
  
  private static byte[] n(j paramj)
  {
    int i = paramj.readUnsignedShort();
    int j = paramj.position;
    paramj.da(i);
    return c.i(paramj.data, j, i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/exoplayer2/video/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */