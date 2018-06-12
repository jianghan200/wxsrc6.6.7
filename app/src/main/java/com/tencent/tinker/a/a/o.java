package com.tencent.tinker.a.a;

import com.tencent.tinker.a.a.b.a;
import com.tencent.tinker.a.a.b.b;

public final class o
{
  public static int a(a parama)
  {
    int j = -1;
    int i = 0;
    int k = 0;
    for (;;)
    {
      int m = parama.readByte() & 0xFF;
      k = (m & 0x7F) << i * 7 | k;
      j <<= 7;
      i += 1;
      if (((m & 0x80) != 128) || (i >= 5))
      {
        if ((m & 0x80) == 128) {
          throw new j("invalid LEB128 sequence");
        }
        i = k;
        if ((j >> 1 & k) != 0) {
          i = k | j;
        }
        return i;
      }
    }
  }
  
  public static int a(b paramb, int paramInt)
  {
    int k = paramInt >>> 7;
    int i = 0;
    int j = paramInt;
    paramInt = k;
    while (paramInt != 0)
    {
      paramb.writeByte((byte)(j & 0x7F | 0x80));
      i += 1;
      j = paramInt;
      paramInt >>>= 7;
    }
    paramb.writeByte((byte)(j & 0x7F));
    return i + 1;
  }
  
  public static int b(a parama)
  {
    int i = 0;
    int j = 0;
    for (;;)
    {
      int k = parama.readByte() & 0xFF;
      j = (k & 0x7F) << i * 7 | j;
      i += 1;
      if (((k & 0x80) != 128) || (i >= 5))
      {
        if ((k & 0x80) == 128) {
          throw new j("invalid LEB128 sequence");
        }
        return j;
      }
    }
  }
  
  public static int b(b paramb, int paramInt)
  {
    return a(paramb, paramInt + 1);
  }
  
  public static int c(a parama)
  {
    return b(parama) - 1;
  }
  
  public static int c(b paramb, int paramInt)
  {
    int j;
    int k;
    int i;
    int m;
    if ((0x80000000 & paramInt) == 0)
    {
      j = 0;
      k = 0;
      i = 1;
      n = paramInt >> 7;
      m = paramInt;
      paramInt = n;
      label26:
      if (i == 0) {
        break label107;
      }
      if ((paramInt == j) && ((paramInt & 0x1) == (m >> 6 & 0x1))) {
        break label96;
      }
      i = 1;
      label50:
      if (i == 0) {
        break label101;
      }
    }
    label96:
    label101:
    for (int n = 128;; n = 0)
    {
      paramb.writeByte((byte)(n | m & 0x7F));
      k += 1;
      m = paramInt;
      paramInt >>= 7;
      break label26;
      j = -1;
      break;
      i = 0;
      break label50;
    }
    label107:
    return k;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tinker/a/a/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */