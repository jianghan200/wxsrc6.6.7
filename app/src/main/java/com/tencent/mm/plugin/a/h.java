package com.tencent.mm.plugin.a;

import android.util.Pair;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class h
  extends a
{
  private int[] amv;
  long duration;
  long eyR;
  long[] eyU;
  List<g> eyW = new LinkedList();
  List<Pair> eyX = new LinkedList();
  long ezb;
  private long ezc;
  private long ezd;
  private long eze;
  private long ezf;
  private int[] ezg;
  private int[] ezh;
  private int[] ezi;
  private long[] ezj;
  private int[] ezk;
  private int[] ezl;
  
  public h(int paramInt1, long paramLong, int paramInt2)
  {
    super(paramInt1, paramLong, paramInt2, 0L);
  }
  
  private boolean VN()
  {
    if (this.ezi != null) {}
    int m;
    for (int i = this.ezi.length;; i = this.ezj.length)
    {
      j = i - 1;
      m = this.ezg.length;
      i = 1;
      while (i < m)
      {
        this.ezg[(i - 1)] = (this.ezg[i] - this.ezg[(i - 1)]);
        i += 1;
      }
    }
    this.ezg[(m - 1)] = (j - this.ezg[(m - 1)] + 1);
    this.ezl = new int[j + 1];
    this.ezl[0] = 0;
    i = 0;
    int j = 1;
    int k;
    while (i < m)
    {
      int n = this.ezg[i];
      int i1 = this.ezh[i];
      k = 0;
      while (k < n)
      {
        this.ezl[j] = (this.ezl[(j - 1)] + i1);
        j += 1;
        k += 1;
      }
      i += 1;
    }
    i = 0;
    while (i < this.eyU.length)
    {
      k = (int)this.eyU[i];
      m = iT(k);
      j = this.ezl[(m - 1)] + 1;
      if (this.amv.length == 1)
      {
        l2 = this.amv[0] * (k - j);
        l1 = iU(m);
        this.eyU[i] = (l2 + l1);
        i += 1;
      }
      else
      {
        l1 = 0L;
        for (;;)
        {
          l2 = l1;
          if (j > k) {
            break;
          }
          l1 += this.amv[j];
          j += 1;
        }
      }
    }
    Object localObject = this.eyW.iterator();
    long l1 = 0L;
    long l2 = 0L;
    j = 0;
    i = 1;
    if (((Iterator)localObject).hasNext())
    {
      g localg = (g)((Iterator)localObject).next();
      localg.size = this.amv[i];
      k = iT(i);
      if (k != j) {}
      for (localg.start = iU(k);; localg.start = l2)
      {
        l2 = localg.start;
        long l3 = localg.size;
        l1 += localg.eyZ;
        localg.eyZ = (((float)l1 * 1.0F / (float)this.eyR * 1000.0F * 1000.0F));
        localg.id = i;
        l2 += l3;
        j = k;
        i += 1;
        break;
      }
    }
    i = 0;
    while (i < this.ezk.length)
    {
      localObject = (g)this.eyW.get(this.ezk[i] - 1);
      ((g)localObject).eza = 1;
      localObject = new Pair(Integer.valueOf(this.ezk[i] - 1), Long.valueOf(((g)localObject).eyZ));
      x.d("MicroMsg.StblAtom", "stss key frame [%s %s]", new Object[] { ((Pair)localObject).first, ((Pair)localObject).second });
      this.eyX.add(localObject);
      i += 1;
    }
    return true;
  }
  
  private long a(RandomAccessFile paramRandomAccessFile, int paramInt)
  {
    this.ezc = paramRandomAccessFile.getFilePointer();
    if (!c.a(paramRandomAccessFile, 4L)) {
      return -1L;
    }
    byte[] arrayOfByte = new byte[12];
    if (paramRandomAccessFile.read(arrayOfByte, 0, 4) < 4)
    {
      x.w("MicroMsg.StblAtom", "stsc read entry count error");
      return -1L;
    }
    int i = c.B(arrayOfByte, 0);
    long l3 = 12L * i;
    if ((l3 > paramInt - 16) || (l3 <= 0L))
    {
      x.w("MicroMsg.StblAtom", "stsc error entryCount : " + i);
      return -1L;
    }
    x.d("MicroMsg.StblAtom", "handle stsc entryCount : " + i);
    this.ezg = new int[i];
    this.ezh = new int[i];
    i = 0;
    long l1 = 0L;
    for (paramInt = paramRandomAccessFile.read(arrayOfByte);; paramInt = paramRandomAccessFile.read(arrayOfByte))
    {
      long l2 = l1;
      if (paramInt >= 12)
      {
        l1 += paramInt;
        this.ezg[i] = c.B(arrayOfByte, 0);
        this.ezh[i] = c.B(arrayOfByte, 4);
        i += 1;
        if (l1 >= l3)
        {
          x.d("MicroMsg.StblAtom", "read stsc atom end");
          l2 = l1;
        }
      }
      else
      {
        return l2 + 8L;
      }
    }
  }
  
  private long b(RandomAccessFile paramRandomAccessFile, int paramInt)
  {
    this.ezd = paramRandomAccessFile.getFilePointer();
    if (!c.a(paramRandomAccessFile, 4L)) {
      return -1L;
    }
    byte[] arrayOfByte = new byte[4];
    if (paramRandomAccessFile.read(arrayOfByte, 0, 4) < 4)
    {
      x.w("MicroMsg.StblAtom", "stco read entry count error");
      return -1L;
    }
    int i = c.B(arrayOfByte, 0);
    long l3 = i * 4L;
    if ((l3 <= 0L) || (l3 > paramInt - 16))
    {
      x.w("MicroMsg.StblAtom", "stco error entryCount : " + i);
      return -1L;
    }
    this.ezi = new int[i + 1];
    paramInt = 1;
    i = paramRandomAccessFile.read(arrayOfByte);
    long l1 = 0L;
    for (;;)
    {
      long l2 = l1;
      if (i >= 4)
      {
        l1 += i;
        this.ezi[paramInt] = c.B(arrayOfByte, 0);
        if (l1 >= l3)
        {
          x.d("MicroMsg.StblAtom", "read stco atom end");
          l2 = l1;
        }
      }
      else
      {
        return l2 + 8L;
      }
      i = paramRandomAccessFile.read(arrayOfByte);
      paramInt += 1;
    }
  }
  
  private long c(RandomAccessFile paramRandomAccessFile, int paramInt)
  {
    this.eze = paramRandomAccessFile.getFilePointer();
    if (!c.a(paramRandomAccessFile, 4L)) {
      return -1L;
    }
    byte[] arrayOfByte = new byte[8];
    if (paramRandomAccessFile.read(arrayOfByte, 0, 4) < 4)
    {
      x.w("MicroMsg.StblAtom", "co64 read entry count error");
      return -1L;
    }
    int i = c.B(arrayOfByte, 0);
    long l3 = i * 8L;
    if ((l3 <= 0L) || (l3 > paramInt - 16))
    {
      x.w("MicroMsg.StblAtom", "stco error entryCount : " + i);
      return -1L;
    }
    this.ezj = new long[i + 1];
    paramInt = 1;
    i = paramRandomAccessFile.read(arrayOfByte);
    long l1 = 0L;
    for (;;)
    {
      long l2 = l1;
      if (i >= 8)
      {
        l1 += i;
        this.ezj[paramInt] = c.R(arrayOfByte);
        if (l1 >= l3)
        {
          x.d("MicroMsg.StblAtom", "read stco atom end");
          l2 = l1;
        }
      }
      else
      {
        return l2 + 8L;
      }
      i = paramRandomAccessFile.read(arrayOfByte);
      paramInt += 1;
    }
  }
  
  private long d(RandomAccessFile paramRandomAccessFile, int paramInt)
  {
    this.ezf = paramRandomAccessFile.getFilePointer();
    if (!c.a(paramRandomAccessFile, 4L)) {
      return -1L;
    }
    byte[] arrayOfByte = new byte[4];
    if (paramRandomAccessFile.read(arrayOfByte, 0, 4) < 4)
    {
      x.w("MicroMsg.StblAtom", "stsz read sample size error");
      return -1L;
    }
    int i = c.B(arrayOfByte, 0);
    if (i > 0)
    {
      this.amv = new int[1];
      this.amv[0] = i;
      x.i("MicroMsg.StblAtom", "all sample size is the same. size : " + i);
      return 8L;
    }
    if (paramRandomAccessFile.read(arrayOfByte, 0, 4) < 4)
    {
      x.w("MicroMsg.StblAtom", "stsz read entry count error");
      return -1L;
    }
    i = c.B(arrayOfByte, 0);
    long l3 = 4L * i;
    if ((l3 <= 0L) || (l3 > paramInt - 20))
    {
      x.w("MicroMsg.StblAtom", "stco error entryCount : " + i);
      return -1L;
    }
    this.amv = new int[i + 1];
    paramInt = 1;
    i = paramRandomAccessFile.read(arrayOfByte);
    long l1 = 0L;
    for (;;)
    {
      long l2 = l1;
      if (i >= 4)
      {
        l1 += i;
        this.amv[paramInt] = c.B(arrayOfByte, 0);
        if (l1 >= l3)
        {
          x.d("MicroMsg.StblAtom", "read stsz atom end");
          l2 = l1;
        }
      }
      else
      {
        return l2 + 12L;
      }
      i = paramRandomAccessFile.read(arrayOfByte);
      paramInt += 1;
    }
  }
  
  private long e(RandomAccessFile paramRandomAccessFile, int paramInt)
  {
    if (!c.a(paramRandomAccessFile, 4L)) {
      return -1L;
    }
    byte[] arrayOfByte = new byte[4];
    if (paramRandomAccessFile.read(arrayOfByte, 0, 4) < 4)
    {
      x.w("MicroMsg.StblAtom", "stss rread entry count error");
      return -1L;
    }
    int i = c.B(arrayOfByte, 0);
    long l3 = i * 4L;
    if ((l3 <= 0L) || (l3 > paramInt - 16))
    {
      x.w("MicroMsg.StblAtom", "stss error entryCount : " + i);
      return -1L;
    }
    this.ezk = new int[i];
    i = paramRandomAccessFile.read(arrayOfByte);
    long l1 = 0L;
    paramInt = 0;
    for (;;)
    {
      long l2 = l1;
      if (i >= 4)
      {
        l1 += i;
        this.ezk[paramInt] = c.B(arrayOfByte, 0);
        if (l1 >= l3)
        {
          x.d("MicroMsg.StblAtom", "read stss atom end");
          l2 = l1;
        }
      }
      else
      {
        return l2 + 8L;
      }
      i = paramRandomAccessFile.read(arrayOfByte);
      paramInt += 1;
    }
  }
  
  private int iT(int paramInt)
  {
    int i = 0;
    while (i < this.ezl.length)
    {
      if (paramInt <= this.ezl[i]) {
        return i;
      }
      i += 1;
    }
    return 0;
  }
  
  private long iU(int paramInt)
  {
    if (this.ezi != null) {
      return this.ezi[paramInt];
    }
    if (this.ezj != null) {
      return this.ezj[paramInt];
    }
    return 0L;
  }
  
  public final void c(RandomAccessFile paramRandomAccessFile)
  {
    byte[] arrayOfByte1 = new byte[8];
    int i1 = paramRandomAccessFile.read(arrayOfByte1);
    int n = 0;
    int i2 = 0;
    int i = 0;
    int j = 0;
    int k = 0;
    int i7;
    int m;
    long l1;
    label84:
    int i3;
    if (i1 >= 8)
    {
      i7 = c.B(arrayOfByte1, 0);
      m = c.B(arrayOfByte1, 4);
      l1 = 0L;
      if (m == a.akA)
      {
        this.ezb = paramRandomAccessFile.getFilePointer();
        if (!c.a(paramRandomAccessFile, 4L))
        {
          l1 = -1L;
          n = 1;
          i3 = k;
          m = i2;
          k = i;
          i = i3;
        }
      }
    }
    for (;;)
    {
      if (!c.a(paramRandomAccessFile, i7 - l1 - i1))
      {
        throw new IOException("skip file error.");
        byte[] arrayOfByte2 = new byte[8];
        if (paramRandomAccessFile.read(arrayOfByte2, 0, 4) < 4)
        {
          x.w("MicroMsg.StblAtom", "stts read entry count error");
          l1 = -1L;
          break label84;
        }
        m = c.B(arrayOfByte2, 0);
        long l3 = 8L * m;
        if ((l3 > i7 - 16) || (l3 <= 0L))
        {
          x.w("MicroMsg.StblAtom", "stts error entryCount : " + m);
          l1 = -1L;
          break label84;
        }
        i3 = 0;
        m = 0;
        this.eyU = new long[(int)(this.duration / this.eyR) + 2];
        Object localObject = this.eyU;
        n = 1;
        localObject[0] = 1L;
        l1 = 0L;
        int i5 = paramRandomAccessFile.read(arrayOfByte2);
        for (;;)
        {
          int i6 = n;
          int i4 = m;
          long l2 = l1;
          if (i5 >= 8)
          {
            l1 += i5;
            i6 = c.B(arrayOfByte2, 0);
            int i8 = c.B(arrayOfByte2, 4);
            i5 = 0;
            i4 = i3;
            i3 = i5;
            while (i3 < i6)
            {
              localObject = new g();
              ((g)localObject).eyZ = i8;
              this.eyW.add(localObject);
              i4 += i8;
              i5 = m + 1;
              m = i4;
              while ((m >= this.eyR) && (n < this.eyU.length))
              {
                m = (int)(m - this.eyR);
                this.eyU[n] = i5;
                n += 1;
              }
              i3 += 1;
              i4 = m;
              m = i5;
            }
            if (l1 >= l3)
            {
              x.d("MicroMsg.StblAtom", "read stts Atom end");
              l2 = l1;
              i4 = m;
              i6 = n;
            }
          }
          else
          {
            if (i6 < this.eyU.length) {
              this.eyU[i6] = i4;
            }
            l1 = 8L + l2;
            break;
          }
          i5 = paramRandomAccessFile.read(arrayOfByte2);
          i3 = i4;
        }
        if (m == a.akD)
        {
          l1 = a(paramRandomAccessFile, i7);
          m = 1;
          i = k;
          k = m;
          m = i2;
          continue;
        }
        if (m == a.akG)
        {
          l1 = b(paramRandomAccessFile, i7);
          i2 = 1;
          m = i;
          i = k;
          k = m;
          m = i2;
          continue;
        }
        if (m == a.akH)
        {
          l1 = c(paramRandomAccessFile, i7);
          i2 = 1;
          m = i;
          i = k;
          k = m;
          m = i2;
          continue;
        }
        if (m == a.akE)
        {
          l1 = d(paramRandomAccessFile, i7);
          m = 1;
          j = k;
          k = i;
          i = j;
          j = m;
          m = i2;
          continue;
        }
        if (m != a.akB) {
          break label769;
        }
        l1 = e(paramRandomAccessFile, i7);
        m = 1;
        k = i;
        i = m;
        m = i2;
        continue;
      }
      if ((n != 0) && (m != 0) && (k != 0) && (j != 0) && (i != 0))
      {
        x.i("MicroMsg.StblAtom", "read stbl atom finish");
        VN();
        return;
      }
      i1 = paramRandomAccessFile.read(arrayOfByte1);
      i2 = k;
      k = i;
      i = i2;
      i2 = m;
      break;
      label769:
      m = i;
      i = k;
      k = m;
      m = i2;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */