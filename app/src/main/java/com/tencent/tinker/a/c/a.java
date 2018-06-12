package com.tencent.tinker.a.c;

public final class a
  implements Cloneable
{
  private static final int[] bfQ = new int[0];
  private static final boolean[] vqc = new boolean[0];
  private int fi = 0;
  private int[] tU = new int[10];
  private boolean[] vqd = new boolean[10];
  
  public a()
  {
    this((byte)0);
  }
  
  private a(byte paramByte) {}
  
  private static int HQ(int paramInt)
  {
    if (paramInt <= 4) {
      return 8;
    }
    return (paramInt >> 1) + paramInt;
  }
  
  private static int a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int i = paramInt1 - 1;
    paramInt1 = 0;
    while (paramInt1 <= i)
    {
      int j = paramInt1 + i >>> 1;
      int k = paramArrayOfInt[j];
      if (k < paramInt2)
      {
        paramInt1 = j + 1;
      }
      else
      {
        i = j;
        if (k <= paramInt2) {
          return i;
        }
        i = j - 1;
      }
    }
    i = paramInt1 ^ 0xFFFFFFFF;
    return i;
  }
  
  private a cGS()
  {
    try
    {
      a locala = (a)super.clone();
      return localCloneNotSupportedException1;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException1)
    {
      try
      {
        locala.tU = ((int[])this.tU.clone());
        locala.vqd = ((boolean[])this.vqd.clone());
        return locala;
      }
      catch (CloneNotSupportedException localCloneNotSupportedException2) {}
      localCloneNotSupportedException1 = localCloneNotSupportedException1;
      return null;
    }
  }
  
  public final void HR(int paramInt)
  {
    int i = a(this.tU, this.fi, paramInt);
    if (i >= 0)
    {
      this.vqd[i] = true;
      return;
    }
    i ^= 0xFFFFFFFF;
    Object localObject1 = this.tU;
    int j = this.fi;
    if (j > localObject1.length) {
      throw new IllegalArgumentException("Bad currentSize, originalSize: " + localObject1.length + " currentSize: " + j);
    }
    if (j + 1 <= localObject1.length)
    {
      System.arraycopy(localObject1, i, localObject1, i + 1, j - i);
      localObject1[i] = paramInt;
    }
    Object localObject2;
    for (;;)
    {
      this.tU = ((int[])localObject1);
      localObject1 = this.vqd;
      paramInt = this.fi;
      if (paramInt <= localObject1.length) {
        break;
      }
      throw new IllegalArgumentException("Bad currentSize, originalSize: " + localObject1.length + " currentSize: " + paramInt);
      localObject2 = new int[HQ(j)];
      System.arraycopy(localObject1, 0, localObject2, 0, i);
      localObject2[i] = paramInt;
      System.arraycopy(localObject1, i, localObject2, i + 1, localObject1.length - i);
      localObject1 = localObject2;
    }
    if (paramInt + 1 <= localObject1.length)
    {
      System.arraycopy(localObject1, i, localObject1, i + 1, paramInt - i);
      localObject1[i] = 1;
    }
    for (;;)
    {
      this.vqd = ((boolean[])localObject1);
      this.fi += 1;
      return;
      localObject2 = new boolean[HQ(paramInt)];
      System.arraycopy(localObject1, 0, localObject2, 0, i);
      localObject2[i] = 1;
      System.arraycopy(localObject1, i, localObject2, i + 1, localObject1.length - i);
      localObject1 = localObject2;
    }
  }
  
  public final boolean HS(int paramInt)
  {
    return a(this.tU, this.fi, paramInt) >= 0;
  }
  
  public final String toString()
  {
    if (this.fi <= 0) {
      return "{}";
    }
    StringBuilder localStringBuilder = new StringBuilder(this.fi * 28);
    localStringBuilder.append('{');
    int i = 0;
    while (i < this.fi)
    {
      if (i > 0) {
        localStringBuilder.append(", ");
      }
      localStringBuilder.append(this.tU[i]);
      localStringBuilder.append('=');
      localStringBuilder.append(this.vqd[i]);
      i += 1;
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tinker/a/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */