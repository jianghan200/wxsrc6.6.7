package com.tencent.mm.plugin.music.cache;

import com.tencent.mm.sdk.platformtools.x;

public final class a
{
  private byte[] buffer = new byte[81920];
  public int fi = 0;
  public com.tencent.mm.plugin.music.c.a.a lxo;
  public c lxp;
  public f lxq;
  public int lxr = -1;
  public int lxs = 0;
  public int tH = -1;
  
  public a(com.tencent.mm.plugin.music.c.a.a parama)
  {
    this.lxo = parama;
  }
  
  public final boolean bhI()
  {
    int j = 0;
    boolean bool = false;
    int m;
    int i;
    label198:
    int[] arrayOfInt;
    int n;
    int k;
    int i1;
    for (;;)
    {
      c localc;
      try
      {
        if ((this.tH < 0) || (this.fi <= 0))
        {
          x.e("MicroMsg.FileBytesCacheMgr", "flushBufferAll(), mOffset:%d, mSize:%d", new Object[] { Integer.valueOf(this.tH), Integer.valueOf(this.fi) });
          return bool;
        }
        byte[] arrayOfByte = new byte[this.fi];
        System.arraycopy(this.buffer, 0, arrayOfByte, 0, this.fi);
        this.lxq.c(arrayOfByte, this.tH, this.fi);
        localc = this.lxp;
        m = this.tH;
        i = this.fi;
        if ((m < 0) || (i < 0) || (m > localc.eyz) || (m + i > localc.eyz))
        {
          x.i("MicroMsg.IndexBitMgr", "getWriteBuffIndexRange offset %d, size %d, fileLength %d", new Object[] { Integer.valueOf(m), Integer.valueOf(i), Long.valueOf(localc.eyz) });
          x.e("MicroMsg.IndexBitMgr", "getWriteBuffRange invalid parameter!");
          arrayOfByte = null;
          if (arrayOfByte != null) {
            break label576;
          }
          x.e("MicroMsg.FileBytesCacheMgr", "flushBufferAll, range is null");
          continue;
        }
        arrayOfInt = new int[2];
      }
      finally {}
      arrayOfInt[1] = -1;
      arrayOfInt[0] = -1;
      n = m + i;
      k = localc.getIndex(m);
      i1 = localc.getIndex(n);
      i = k;
      break;
      label263:
      if ((arrayOfInt[0] != -1) || (arrayOfInt[1] != -1) || (n != localc.eyz)) {
        break label573;
      }
      x.i("MicroMsg.IndexBitMgr", "write to file end!");
      arrayOfInt[0] = k;
      arrayOfInt[1] = i1;
      break label573;
      label312:
      x.d("MicroMsg.FileBytesCacheMgr", "flushBufferAll range[0]:%d, range[1]:%d", new Object[] { Integer.valueOf(arrayOfInt[0]), Integer.valueOf(arrayOfInt[1]) });
    }
    for (;;)
    {
      if (i <= arrayOfInt[1])
      {
        this.lxp.tw(i);
        i += 1;
      }
      else
      {
        k = arrayOfInt[0];
        i = j;
        if (k > 0)
        {
          k -= 1;
          i = j;
          if (!this.lxp.tv(k))
          {
            i = j;
            if (this.lxr + this.lxs == this.tH)
            {
              i = j;
              if (this.fi > 0)
              {
                i = j;
                if (this.lxs >= 8192)
                {
                  x.i("MicroMsg.FileBytesCacheMgr", "isCanSavePreviousIndex, save index :%d", new Object[] { Integer.valueOf(k) });
                  i = 1;
                }
              }
            }
          }
        }
        if (i != 0) {
          this.lxp.tw(arrayOfInt[0] - 1);
        }
        this.lxp.bhK();
        bool = true;
        break;
        while (i <= i1)
        {
          if ((i * 8192 >= m) && ((i + 1) * 8192 <= n))
          {
            if (arrayOfInt[0] == -1) {
              arrayOfInt[0] = i;
            }
            if (arrayOfInt[0] > i) {
              arrayOfInt[0] = i;
            }
            if (arrayOfInt[1] == -1) {
              arrayOfInt[1] = i;
            }
            if (arrayOfInt[1] < i) {
              arrayOfInt[1] = i;
            }
          }
          i += 1;
        }
        break label263;
        label573:
        break label198;
        label576:
        if ((arrayOfInt[0] == -1) || (arrayOfInt[1] == -1)) {
          break label312;
        }
        i = arrayOfInt[0];
      }
    }
  }
  
  public final void p(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      paramInt1 -= this.tH;
      this.fi = (paramInt1 + paramInt2);
      System.arraycopy(paramArrayOfByte, 0, this.buffer, paramInt1, paramInt2);
      return;
    }
    finally
    {
      paramArrayOfByte = finally;
      throw paramArrayOfByte;
    }
  }
  
  /* Error */
  public final boolean tr(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 27	com/tencent/mm/plugin/music/cache/a:tH	I
    //   6: iload_1
    //   7: if_icmpgt +22 -> 29
    //   10: aload_0
    //   11: getfield 27	com/tencent/mm/plugin/music/cache/a:tH	I
    //   14: istore_2
    //   15: iload_1
    //   16: iload_2
    //   17: ldc 23
    //   19: iadd
    //   20: if_icmpgt +9 -> 29
    //   23: iconst_1
    //   24: istore_3
    //   25: aload_0
    //   26: monitorexit
    //   27: iload_3
    //   28: ireturn
    //   29: iconst_0
    //   30: istore_3
    //   31: goto -6 -> 25
    //   34: astore 4
    //   36: aload_0
    //   37: monitorexit
    //   38: aload 4
    //   40: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	41	0	this	a
    //   0	41	1	paramInt	int
    //   14	6	2	i	int
    //   24	7	3	bool	boolean
    //   34	5	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	15	34	finally
  }
  
  /* Error */
  public final boolean ts(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 27	com/tencent/mm/plugin/music/cache/a:tH	I
    //   6: iload_1
    //   7: if_icmpgt +28 -> 35
    //   10: aload_0
    //   11: getfield 27	com/tencent/mm/plugin/music/cache/a:tH	I
    //   14: istore_2
    //   15: aload_0
    //   16: getfield 29	com/tencent/mm/plugin/music/cache/a:fi	I
    //   19: istore_3
    //   20: iload_1
    //   21: iload_2
    //   22: iload_3
    //   23: iadd
    //   24: if_icmpgt +11 -> 35
    //   27: iconst_1
    //   28: istore 4
    //   30: aload_0
    //   31: monitorexit
    //   32: iload 4
    //   34: ireturn
    //   35: iconst_0
    //   36: istore 4
    //   38: goto -8 -> 30
    //   41: astore 5
    //   43: aload_0
    //   44: monitorexit
    //   45: aload 5
    //   47: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	48	0	this	a
    //   0	48	1	paramInt	int
    //   14	10	2	i	int
    //   19	5	3	j	int
    //   28	9	4	bool	boolean
    //   41	5	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	20	41	finally
  }
  
  public final void tt(int paramInt)
  {
    try
    {
      this.lxr = this.tH;
      this.lxs = this.fi;
      this.tH = paramInt;
      this.fi = 0;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/music/cache/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */