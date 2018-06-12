package com.tencent.tinker.a.b.a;

import com.tencent.tinker.a.a.j;

public final class d
{
  private final g vpW;
  
  public d(g paramg)
  {
    this.vpW = paramg;
  }
  
  public final void a(e parame)
  {
    Object localObject = this.vpW;
    ((a)localObject).vpS.fi = 0;
    ((a)localObject).vpT = 0;
    for (;;)
    {
      localObject = this.vpW;
      if (((a)localObject).vpT < ((g)localObject).vqb.length) {}
      int n;
      int m;
      for (int i = 1; i != 0; i = 0)
      {
        n = this.vpW.vpT;
        m = this.vpW.read();
        j = m & 0xFF;
        if (j != 0)
        {
          i = j;
          if (j != 255) {}
        }
        else
        {
          i = m;
        }
        switch (i)
        {
        default: 
          throw new IllegalStateException("Unknown opcode: " + com.tencent.tinker.a.b.b.a.HM(i));
        }
      }
      parame.a(n, m, 0, 1, 0, 0L);
      continue;
      parame.a(n, m & 0xFF, 0, 1, n + (byte)b.HG(m), 0L);
      continue;
      parame.a(n, m & 0xFF, 0, 1, 0, b.HG(m));
      continue;
      parame.a(n, m & 0xFF, 0, 1, 0, (m >> 12 & 0xF) << 28 >> 28, m >> 8 & 0xF);
      continue;
      parame.a(n, m & 0xFF, 0, 1, 0, 0L, b.HG(m));
      continue;
      parame.a(n, m & 0xFF, 0, 1, 0, 0L, m >> 8 & 0xF, m >> 12 & 0xF);
      continue;
      i = b.HG(m);
      parame.a(n, m & 0xFF, 0, 1, n + (short)this.vpW.read(), i);
      continue;
      i = m & 0xFF;
      int j = b.HG(m);
      parame.a(n, i, this.vpW.read(), b.HJ(i), 0, 0L, j);
      continue;
      j = m & 0xFF;
      int k = b.HG(m);
      long l = (short)this.vpW.read();
      if (j == 21) {}
      for (i = 16;; i = 48)
      {
        parame.a(n, j, 0, 1, 0, l << i, k);
        break;
      }
      i = b.HG(m);
      parame.a(n, m & 0xFF, 0, 1, 0, (short)this.vpW.read(), i);
      continue;
      i = b.HG(m);
      parame.a(n, m & 0xFF, 0, 1, n + (short)this.vpW.read(), 0L, i);
      continue;
      i = b.HG(m);
      j = this.vpW.read();
      parame.a(n, m & 0xFF, 0, 1, 0, (byte)b.HG(j), i, j & 0xFF);
      continue;
      i = m & 0xFF;
      parame.a(n, i, this.vpW.read(), b.HJ(i), 0, 0L, m >> 8 & 0xF, m >> 12 & 0xF);
      continue;
      parame.a(n, m & 0xFF, 0, 1, 0, (short)this.vpW.read(), m >> 8 & 0xF, m >> 12 & 0xF);
      continue;
      parame.a(n, m & 0xFF, 0, 1, n + (short)this.vpW.read(), 0L, m >> 8 & 0xF, m >> 12 & 0xF);
      continue;
      parame.a(n, m & 0xFF, 0, 1, 0, 0L, b.HG(m), this.vpW.read());
      continue;
      i = b.HG(m);
      j = this.vpW.read();
      parame.a(n, m & 0xFF, 0, 1, 0, 0L, i, j & 0xFF, b.HG(j));
      continue;
      i = b.HG(m);
      parame.a(n, m & 0xFF, 0, 1, n + this.vpW.readInt(), i);
      continue;
      i = m & 0xFF;
      j = b.HG(m);
      parame.a(n, i, this.vpW.readInt(), b.HJ(i), 0, 0L, j);
      continue;
      i = b.HG(m);
      parame.a(n, m & 0xFF, 0, 1, 0, this.vpW.readInt(), i);
      continue;
      i = m & 0xFF;
      j = b.HG(m);
      k = n + this.vpW.readInt();
      switch (i)
      {
      }
      for (;;)
      {
        parame.a(n, i, 0, 1, k, 0L, j);
        break;
        this.vpW.fK(k + 1, n);
      }
      i = b.HG(m);
      j = this.vpW.read();
      k = this.vpW.read();
      parame.a(n, m & 0xFF, 0, 1, 0, i, j, k);
      continue;
      i = m & 0xFF;
      j = m >> 12 & 0xF;
      k = this.vpW.read();
      int i4 = this.vpW.read();
      int i1 = i4 & 0xF;
      int i2 = i4 >> 4 & 0xF;
      int i3 = i4 >> 8 & 0xF;
      i4 = i4 >> 12 & 0xF;
      int i5 = b.HJ(i);
      switch (j)
      {
      default: 
        throw new j("bogus registerCount: " + new String(new char[] { Character.forDigit(j & 0xF, 16) }));
      case 0: 
        parame.a(n, i, k, i5, 0, 0L);
        break;
      case 1: 
        parame.a(n, i, k, i5, 0, 0L, i1);
        break;
      case 2: 
        parame.a(n, i, k, i5, 0, 0L, i1, i2);
        break;
      case 3: 
        parame.a(n, i, k, i5, 0, 0L, i1, i2, i3);
        break;
      case 4: 
        parame.a(n, i, k, i5, 0, 0L, i1, i2, i3, i4);
        break;
      case 5: 
        parame.a(n, i, k, i5, 0, 0L, i1, i2, i3, i4, m >> 8 & 0xF);
        continue;
        i = m & 0xFF;
        j = b.HG(m);
        k = this.vpW.read();
        m = this.vpW.read();
        parame.b(n, i, k, b.HJ(i), 0, 0L, m, j);
        continue;
        i = b.HG(m);
        parame.a(n, m & 0xFF, 0, 1, 0, this.vpW.readLong(), i);
        continue;
        i = this.vpW.read();
        i1 = this.vpW.readInt();
        switch (i)
        {
        case 3: 
        case 5: 
        case 6: 
        case 7: 
        default: 
          throw new j("bogus element_width: " + com.tencent.tinker.a.b.b.a.HN(i));
        case 1: 
          localObject = new byte[i1];
          j = 1;
          i = 0;
          k = 0;
          if (k < i1)
          {
            if (j != 0) {
              i = this.vpW.read();
            }
            localObject[k] = ((byte)(i & 0xFF));
            k += 1;
            if (j == 0) {}
            for (j = 1;; j = 0)
            {
              i >>= 8;
              break;
            }
          }
          parame.a(n, m, localObject, localObject.length, 1);
          break;
        case 2: 
          localObject = new short[i1];
          i = 0;
          while (i < i1)
          {
            localObject[i] = ((short)this.vpW.read());
            i += 1;
          }
          parame.a(n, m, localObject, localObject.length, 2);
          break;
        case 4: 
          localObject = new int[i1];
          i = 0;
          while (i < i1)
          {
            localObject[i] = this.vpW.readInt();
            i += 1;
          }
          parame.a(n, m, localObject, localObject.length, 4);
          break;
        case 8: 
          localObject = new long[i1];
          i = 0;
          while (i < i1)
          {
            localObject[i] = this.vpW.readLong();
            i += 1;
          }
          parame.a(n, m, localObject, localObject.length, 8);
          continue;
          j = this.vpW.cGQ();
          k = this.vpW.read();
          i1 = this.vpW.readInt();
          localObject = new int[k];
          i = 0;
          while (i < k)
          {
            localObject[i] = (this.vpW.readInt() + j);
            i += 1;
          }
          parame.a(n, m, i1, (int[])localObject);
          continue;
          j = this.vpW.cGQ();
          k = this.vpW.read();
          localObject = new int[k];
          int[] arrayOfInt = new int[k];
          i = 0;
          while (i < k)
          {
            localObject[i] = this.vpW.readInt();
            i += 1;
          }
          i = 0;
          while (i < k)
          {
            arrayOfInt[i] = (this.vpW.readInt() + j);
            i += 1;
          }
          parame.a(n, m, (int[])localObject, arrayOfInt);
        }
        break;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tinker/a/b/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */