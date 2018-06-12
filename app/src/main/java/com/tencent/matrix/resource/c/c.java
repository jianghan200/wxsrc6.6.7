package com.tencent.matrix.resource.c;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.charset.Charset;

public final class c
{
  private int brK = 0;
  private final InputStream brT;
  
  public c(InputStream paramInputStream)
  {
    this.brT = paramInputStream;
  }
  
  private int a(int paramInt, b paramb)
  {
    com.tencent.matrix.resource.c.a.b localb = com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK);
    int i = com.tencent.matrix.resource.c.b.a.d(this.brT);
    int j = com.tencent.matrix.resource.c.b.a.d(this.brT);
    int k = this.brT.read();
    int m = j * com.tencent.matrix.resource.c.a.c.en(k).getSize(this.brK);
    byte[] arrayOfByte = new byte[m];
    com.tencent.matrix.resource.c.b.a.a(this.brT, arrayOfByte, m);
    paramb.a(paramInt, localb, i, j, k, arrayOfByte);
    return this.brK + 4 + 4 + 1 + m;
  }
  
  private void a(int paramInt1, int paramInt2, long paramLong, d paramd)
  {
    paramd = paramd.a(paramInt1, paramInt2, paramLong);
    long l = paramLong;
    if (paramd == null)
    {
      com.tencent.matrix.resource.c.b.a.b(this.brT, paramLong);
      return;
      paramd.b(paramInt1, com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK));
      l = paramLong - this.brK;
    }
    while (l > 0L)
    {
      paramInt1 = this.brT.read();
      paramLong = l - 1L;
      com.tencent.matrix.resource.c.a.b localb1;
      int i;
      com.tencent.matrix.resource.c.a.b localb2;
      Object localObject1;
      switch (paramInt1)
      {
      case 255: 
      default: 
        throw new IllegalArgumentException("acceptHeapDumpRecord loop with unknown tag " + paramInt1 + " with " + this.brT.available() + " bytes possibly remaining");
      case 1: 
        paramd.b(paramInt1, com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK));
        com.tencent.matrix.resource.c.b.a.b(this.brT, this.brK);
        l = paramLong - (this.brK << 1);
        break;
      case 2: 
        paramd.a(com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK), com.tencent.matrix.resource.c.b.a.d(this.brT), com.tencent.matrix.resource.c.b.a.d(this.brT));
        l = paramLong - (this.brK + 4 + 4);
        break;
      case 3: 
        paramd.b(com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK), com.tencent.matrix.resource.c.b.a.d(this.brT), com.tencent.matrix.resource.c.b.a.d(this.brT));
        l = paramLong - (this.brK + 4 + 4);
        break;
      case 4: 
        paramd.a(com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK), com.tencent.matrix.resource.c.b.a.d(this.brT));
        l = paramLong - (this.brK + 4);
        break;
      case 5: 
        paramd.b(paramInt1, com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK));
        l = paramLong - this.brK;
        break;
      case 6: 
        paramd.b(com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK), com.tencent.matrix.resource.c.b.a.d(this.brT));
        l = paramLong - (this.brK + 4);
        break;
      case 7: 
        paramd.b(paramInt1, com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK));
        l = paramLong - this.brK;
        break;
      case 8: 
        paramd.c(com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK), com.tencent.matrix.resource.c.b.a.d(this.brT), com.tencent.matrix.resource.c.b.a.d(this.brT));
        l = paramLong - (this.brK + 4 + 4);
        break;
      case 32: 
        localb1 = com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK);
        i = com.tencent.matrix.resource.c.b.a.d(this.brT);
        localb2 = com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK);
        localObject1 = com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK);
        com.tencent.matrix.resource.c.b.a.b(this.brT, this.brK << 2);
        int j = com.tencent.matrix.resource.c.b.a.d(this.brT);
        paramInt1 = this.brK;
        int k = com.tencent.matrix.resource.c.b.a.c(this.brT);
        paramInt1 = paramInt1 * 7 + 4 + 4 + 2;
        paramInt2 = 0;
        int m;
        while (paramInt2 < k)
        {
          com.tencent.matrix.resource.c.b.a.b(this.brT, 2L);
          m = com.tencent.matrix.resource.c.a.c.en(this.brT.read()).getSize(this.brK);
          com.tencent.matrix.resource.c.b.a.b(this.brT, m);
          paramInt1 += m + 1 + 2;
          paramInt2 += 1;
        }
        k = com.tencent.matrix.resource.c.b.a.c(this.brT);
        com.tencent.matrix.resource.c.a.a[] arrayOfa = new com.tencent.matrix.resource.c.a.a[k];
        paramInt1 += 2;
        paramInt2 = 0;
        while (paramInt2 < k)
        {
          localObject2 = com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK);
          m = this.brT.read();
          arrayOfa[paramInt2] = new com.tencent.matrix.resource.c.a.a(m, (com.tencent.matrix.resource.c.a.b)localObject2, com.tencent.matrix.resource.c.b.a.a(this.brT, com.tencent.matrix.resource.c.a.c.en(m), this.brK));
          paramInt1 += this.brK + 1 + com.tencent.matrix.resource.c.a.c.en(m).getSize(this.brK);
          paramInt2 += 1;
        }
        k = com.tencent.matrix.resource.c.b.a.c(this.brT);
        Object localObject2 = new com.tencent.matrix.resource.c.a.a[k];
        paramInt2 = paramInt1 + 2;
        paramInt1 = 0;
        while (paramInt1 < k)
        {
          com.tencent.matrix.resource.c.a.b localb3 = com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK);
          localObject2[paramInt1] = new com.tencent.matrix.resource.c.a.a(this.brT.read(), localb3, null);
          paramInt2 += this.brK + 1;
          paramInt1 += 1;
        }
        paramd.a(localb1, i, localb2, (com.tencent.matrix.resource.c.a.b)localObject1, j, arrayOfa, (com.tencent.matrix.resource.c.a.a[])localObject2);
        l = paramLong - paramInt2;
        break;
      case 33: 
        localb1 = com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK);
        paramInt1 = com.tencent.matrix.resource.c.b.a.d(this.brT);
        localb2 = com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK);
        paramInt2 = com.tencent.matrix.resource.c.b.a.d(this.brT);
        localObject1 = new byte[paramInt2];
        com.tencent.matrix.resource.c.b.a.a(this.brT, (byte[])localObject1, paramInt2);
        paramd.a(localb1, paramInt1, localb2, (byte[])localObject1);
        l = paramLong - (this.brK + 4 + this.brK + 4 + paramInt2);
        break;
      case 34: 
        localb1 = com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK);
        paramInt1 = com.tencent.matrix.resource.c.b.a.d(this.brT);
        paramInt2 = com.tencent.matrix.resource.c.b.a.d(this.brT);
        localb2 = com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK);
        i = paramInt2 * this.brK;
        localObject1 = new byte[i];
        com.tencent.matrix.resource.c.b.a.a(this.brT, (byte[])localObject1, i);
        paramd.a(localb1, paramInt1, paramInt2, localb2, (byte[])localObject1);
        l = paramLong - (this.brK + 4 + 4 + this.brK + i);
        break;
      case 35: 
        l = paramLong - a(paramInt1, paramd);
        break;
      case 195: 
        l = paramLong - a(paramInt1, paramd);
        break;
      case 254: 
        paramd.a(com.tencent.matrix.resource.c.b.a.d(this.brT), com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK));
        l = paramLong - (this.brK + 4);
        break;
      case 137: 
        paramd.b(paramInt1, com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK));
        l = paramLong - this.brK;
        break;
      case 138: 
        paramd.b(paramInt1, com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK));
        l = paramLong - this.brK;
        break;
      case 139: 
        paramd.b(paramInt1, com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK));
        l = paramLong - this.brK;
        break;
      case 140: 
        paramd.b(paramInt1, com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK));
        l = paramLong - this.brK;
        break;
      case 141: 
        paramd.b(paramInt1, com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK));
        l = paramLong - this.brK;
        break;
      case 142: 
        paramd.d(com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK), com.tencent.matrix.resource.c.b.a.d(this.brT), com.tencent.matrix.resource.c.b.a.d(this.brT));
        l = paramLong - (this.brK + 4 + 4);
        break;
      case 144: 
        paramd.b(paramInt1, com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK));
        l = paramLong - this.brK;
      }
    }
    paramd.tz();
  }
  
  private void a(int paramInt, long paramLong, d paramd)
  {
    int j = com.tencent.matrix.resource.c.b.a.d(this.brT);
    int k = com.tencent.matrix.resource.c.b.a.d(this.brT);
    int m = com.tencent.matrix.resource.c.b.a.d(this.brT);
    com.tencent.matrix.resource.c.a.b[] arrayOfb = new com.tencent.matrix.resource.c.a.b[m];
    int i = 0;
    while (i < m)
    {
      arrayOfb[i] = com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK);
      i += 1;
    }
    paramd.a(j, k, arrayOfb, paramInt, paramLong);
  }
  
  private void b(d paramd)
  {
    try
    {
      int i = this.brT.read();
      int j = com.tencent.matrix.resource.c.b.a.d(this.brT);
      long l1 = 0xFFFFFFFF & com.tencent.matrix.resource.c.b.a.d(this.brT);
      switch (i)
      {
      }
      for (;;)
      {
        Object localObject = new byte[(int)l1];
        com.tencent.matrix.resource.c.b.a.a(this.brT, (byte[])localObject, l1);
        paramd.a(i, j, l1, (byte[])localObject);
        break;
        localObject = com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK);
        InputStream localInputStream = this.brT;
        long l2 = l1 - this.brK;
        byte[] arrayOfByte = new byte[(int)l2];
        com.tencent.matrix.resource.c.b.a.a(localInputStream, arrayOfByte, l2);
        paramd.a((com.tencent.matrix.resource.c.a.b)localObject, new String(arrayOfByte, Charset.forName("UTF-8")), j, l1);
        break;
        paramd.a(com.tencent.matrix.resource.c.b.a.d(this.brT), com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK), com.tencent.matrix.resource.c.b.a.d(this.brT), com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK), j, l1);
        break;
        paramd.a(com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK), com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK), com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK), com.tencent.matrix.resource.c.b.a.a(this.brT, this.brK), com.tencent.matrix.resource.c.b.a.d(this.brT), com.tencent.matrix.resource.c.b.a.d(this.brT), j, l1);
        break;
        a(j, l1, paramd);
        break;
        a(i, j, l1, paramd);
        break;
      }
      return;
    }
    catch (EOFException paramd) {}
  }
  
  public final void a(d paramd)
  {
    Object localObject = this.brT;
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = ((InputStream)localObject).read(); i != 0; i = ((InputStream)localObject).read()) {
      localStringBuilder.append((char)i);
    }
    localObject = localStringBuilder.toString();
    i = com.tencent.matrix.resource.c.b.a.d(this.brT);
    long l = com.tencent.matrix.resource.c.b.a.e(this.brT);
    this.brK = i;
    paramd.a((String)localObject, i, l);
    b(paramd);
    paramd.tz();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/resource/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */