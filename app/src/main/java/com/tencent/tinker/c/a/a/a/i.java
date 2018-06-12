package com.tencent.tinker.c.a.a.a;

import com.tencent.tinker.a.a.i.e;
import com.tencent.tinker.a.a.o;
import com.tencent.tinker.a.a.t.a;
import com.tencent.tinker.a.a.t.a.a;
import com.tencent.tinker.c.a.c.c;
import java.util.Arrays;

public abstract class i<T extends Comparable<T>>
{
  protected final com.tencent.tinker.a.a.i vqf;
  protected final com.tencent.tinker.c.a.b.a vqh;
  private final c vqi;
  
  public i(com.tencent.tinker.c.a.b.a parama, com.tencent.tinker.a.a.i parami, c paramc)
  {
    this.vqh = parama;
    this.vqf = parami;
    this.vqi = paramc;
  }
  
  private int[] HT(int paramInt)
  {
    int[] arrayOfInt = new int[paramInt];
    int i = 0;
    int j = 0;
    while (i < paramInt)
    {
      j = o.a(this.vqh.vre) + j;
      arrayOfInt[i] = j;
      i += 1;
    }
    return arrayOfInt;
  }
  
  private static int a(int paramInt, T paramT)
  {
    if ((paramT instanceof t.a.a)) {
      paramInt = ((t.a.a)paramT).off;
    }
    return paramInt;
  }
  
  protected abstract T a(com.tencent.tinker.a.a.a.a parama);
  
  protected T a(com.tencent.tinker.c.a.c.a parama, T paramT)
  {
    return paramT;
  }
  
  protected void a(c paramc, int paramInt1, int paramInt2) {}
  
  protected void a(c paramc, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  protected abstract t.a c(com.tencent.tinker.a.a.i parami);
  
  protected abstract int e(T paramT);
  
  public final void execute()
  {
    int[] arrayOfInt1 = HT(o.b(this.vqh.vre));
    int[] arrayOfInt2 = HT(o.b(this.vqh.vre));
    int[] arrayOfInt3 = HT(o.b(this.vqh.vre));
    Object localObject = c(this.vqf);
    i.e locale;
    int k;
    if (((t.a)localObject).exists())
    {
      locale = this.vqf.a((t.a)localObject);
      k = ((t.a)localObject).size;
    }
    for (;;)
    {
      int i2 = arrayOfInt1.length;
      int i3 = arrayOfInt2.length;
      int i4 = arrayOfInt3.length;
      int j = 0;
      int i = 0;
      int i1 = 0;
      int n = 0;
      int m = 0;
      while ((j < k) || (i < k + i3 - i2)) {
        if ((n < i3) && (arrayOfInt2[n] == i))
        {
          e(a(this.vqh.vre));
          i += 1;
          n += 1;
        }
        else if ((i1 < i4) && (arrayOfInt3[i1] == i))
        {
          e(a(this.vqh.vre));
          i += 1;
          i1 += 1;
        }
        else if (Arrays.binarySearch(arrayOfInt1, j) >= 0)
        {
          localObject = a(locale);
          a(this.vqi, j, a(j, (Comparable)localObject));
          j += 1;
          m += 1;
        }
        else if (Arrays.binarySearch(arrayOfInt3, j) >= 0)
        {
          localObject = a(locale);
          a(this.vqi, j, a(j, (Comparable)localObject));
          j += 1;
        }
        else if (j < k)
        {
          localObject = a(this.vqi, a(locale));
          int i5 = e((Comparable)localObject);
          a(this.vqi, j, a(j, (Comparable)localObject), i, i5);
          j += 1;
          i += 1;
        }
      }
      if ((n != i3) || (m != i2) || (i1 != i4)) {
        throw new IllegalStateException(String.format("bad patch operation sequence. addCounter: %d, addCount: %d, delCounter: %d, delCount: %d, replaceCounter: %d, replaceCount:%d", new Object[] { Integer.valueOf(n), Integer.valueOf(i3), Integer.valueOf(m), Integer.valueOf(i2), Integer.valueOf(i1), Integer.valueOf(i4) }));
      }
      return;
      k = 0;
      locale = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tinker/c/a/a/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */