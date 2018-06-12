package f.a.a.b.a;

import java.io.InputStream;
import java.util.LinkedList;

public final class a
{
  private int bfH = 0;
  public int bfI;
  public int bfJ = 0;
  private int bfK = Integer.MAX_VALUE;
  private int bfN = 67108864;
  public byte[] buffer;
  public int bufferSize;
  private InputStream vHG;
  private int vHH = 0;
  
  public a(byte[] paramArrayOfByte, int paramInt)
  {
    this.buffer = paramArrayOfByte;
    this.bufferSize = (paramInt + 0);
    this.bfI = 0;
    this.vHG = null;
  }
  
  private int[] ID(int paramInt)
  {
    int j = this.buffer[paramInt];
    int i = paramInt + 1;
    if (j >= 0) {
      return new int[] { j, i };
    }
    paramInt = j & 0x7F;
    j = this.buffer[i];
    if (j >= 0)
    {
      i += 1;
      paramInt |= j << 7;
    }
    int k;
    do
    {
      for (;;)
      {
        return new int[] { paramInt, i };
        paramInt |= (j & 0x7F) << 7;
        j = this.buffer[i];
        if (j >= 0)
        {
          i += 1;
          paramInt |= j << 14;
        }
        else
        {
          paramInt |= (j & 0x7F) << 14;
          j = this.buffer[i];
          if (j < 0) {
            break;
          }
          i += 1;
          paramInt |= j << 21;
        }
      }
      k = this.buffer[i];
      paramInt = paramInt | (j & 0x7F) << 21 | k << 28;
      j = i + 1;
      i = j;
    } while (k >= 0);
    paramInt = 0;
    for (;;)
    {
      if (paramInt >= 5) {
        throw b.cJV();
      }
      if (this.buffer[j] >= 0) {
        return new int[] { k, j + 1 };
      }
      paramInt += 1;
    }
  }
  
  private void dZ(int paramInt)
  {
    if (paramInt < 0) {
      throw b.cJU();
    }
    if (this.vHH + this.bfI + paramInt > this.bfK)
    {
      dZ(this.bfK - this.vHH - this.bfI);
      throw b.cJT();
    }
    if (paramInt < this.bufferSize - this.bfI) {
      this.bfI += paramInt;
    }
    for (;;)
    {
      return;
      int i = this.bufferSize - this.bfI;
      this.vHH += i;
      this.bfI = 0;
      this.bufferSize = 0;
      while (i < paramInt)
      {
        if (this.vHG == null) {}
        for (int j = -1; j <= 0; j = (int)this.vHG.skip(paramInt - i)) {
          throw b.cJT();
        }
        i += j;
        this.vHH = (j + this.vHH);
      }
    }
  }
  
  private byte sc()
  {
    if (this.bfI == this.bufferSize) {
      nb(true);
    }
    byte[] arrayOfByte = this.buffer;
    int i = this.bfI;
    this.bfI = (i + 1);
    return arrayOfByte[i];
  }
  
  public final LinkedList<byte[]> IC(int paramInt)
  {
    LinkedList localLinkedList = new LinkedList();
    int i = rY();
    try
    {
      byte[] arrayOfByte = new byte[i];
      System.arraycopy(this.buffer, this.bfI, arrayOfByte, 0, i);
      localLinkedList.add(arrayOfByte);
      this.bfI = (i + this.bfI);
      i = this.bfI;
      if (this.bfI == this.bufferSize) {
        return localLinkedList;
      }
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      throw new OutOfMemoryError("alloc bytes:" + i);
    }
    Object localObject = ID(i);
    for (i = localObject[0];; i = localObject[0])
    {
      if (f.a.a.b.a.eg(i) != paramInt) {}
      do
      {
        return localLinkedList;
        this.bfI = localObject[1];
        i = rY();
        localObject = new byte[i];
        System.arraycopy(this.buffer, this.bfI, localObject, 0, i);
        localLinkedList.add(localObject);
        this.bfI = (i + this.bfI);
      } while (this.bfI == this.bufferSize);
      localObject = ID(this.bfI);
    }
  }
  
  public final byte[] dY(int paramInt)
  {
    if (paramInt < 0) {
      throw b.cJU();
    }
    if (this.vHH + this.bfI + paramInt > this.bfK)
    {
      dZ(this.bfK - this.vHH - this.bfI);
      throw b.cJT();
    }
    if (paramInt <= this.bufferSize - this.bfI)
    {
      localObject = new byte[paramInt];
      System.arraycopy(this.buffer, this.bfI, localObject, 0, paramInt);
      this.bfI += paramInt;
      return (byte[])localObject;
    }
    if (paramInt < 2048)
    {
      localObject = new byte[paramInt];
      i = this.bufferSize - this.bfI;
      System.arraycopy(this.buffer, this.bfI, localObject, 0, i);
      this.bfI = this.bufferSize;
      nb(true);
      for (;;)
      {
        if (paramInt - i <= this.bufferSize)
        {
          System.arraycopy(this.buffer, 0, localObject, i, paramInt - i);
          this.bfI = (paramInt - i);
          return (byte[])localObject;
        }
        System.arraycopy(this.buffer, 0, localObject, i, this.bufferSize);
        i += this.bufferSize;
        this.bfI = this.bufferSize;
        nb(true);
      }
    }
    int m = this.bfI;
    int n = this.bufferSize;
    this.vHH += this.bufferSize;
    this.bfI = 0;
    this.bufferSize = 0;
    Object localObject = new LinkedList();
    int i = paramInt - (n - m);
    byte[] arrayOfByte1;
    if (i <= 0)
    {
      arrayOfByte1 = new byte[paramInt];
      i = n - m;
      System.arraycopy(this.buffer, m, arrayOfByte1, 0, i);
      paramInt = 0;
    }
    for (;;)
    {
      if (paramInt >= ((LinkedList)localObject).size())
      {
        return arrayOfByte1;
        arrayOfByte1 = new byte[Math.min(i, 2048)];
        int j = 0;
        for (;;)
        {
          if (j >= arrayOfByte1.length)
          {
            j = arrayOfByte1.length;
            ((LinkedList)localObject).add(arrayOfByte1);
            i -= j;
            break;
          }
          if (this.vHG == null) {}
          for (int k = -1; k == -1; k = this.vHG.read(arrayOfByte1, j, arrayOfByte1.length - j)) {
            throw b.cJT();
          }
          this.vHH += k;
          j += k;
        }
      }
      byte[] arrayOfByte2 = (byte[])((LinkedList)localObject).get(paramInt);
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, i, arrayOfByte2.length);
      i += arrayOfByte2.length;
      paramInt += 1;
    }
  }
  
  public final boolean nb(boolean paramBoolean)
  {
    if (this.bfI < this.bufferSize) {
      throw new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
    }
    if (this.vHH + this.bufferSize == this.bfK)
    {
      if (paramBoolean) {
        throw b.cJT();
      }
      return false;
    }
    this.vHH += this.bufferSize;
    this.bfI = 0;
    if (this.vHG == null) {}
    for (int i = -1;; i = this.vHG.read(this.buffer))
    {
      this.bufferSize = i;
      if (this.bufferSize != -1) {
        break label117;
      }
      this.bufferSize = 0;
      if (!paramBoolean) {
        break;
      }
      throw b.cJT();
    }
    return false;
    label117:
    this.bufferSize += this.bfH;
    i = this.vHH + this.bufferSize;
    if (i > this.bfK)
    {
      this.bfH = (i - this.bfK);
      this.bufferSize -= this.bfH;
    }
    for (;;)
    {
      i = this.vHH + this.bufferSize + this.bfH;
      if ((i <= this.bfN) && (i >= 0)) {
        break;
      }
      throw b.cJX();
      this.bfH = 0;
    }
    return true;
  }
  
  public final int rY()
  {
    int i = sc();
    if (i >= 0) {}
    int k;
    do
    {
      return i;
      i &= 0x7F;
      j = sc();
      if (j >= 0) {
        return i | j << 7;
      }
      i |= (j & 0x7F) << 7;
      j = sc();
      if (j >= 0) {
        return i | j << 14;
      }
      i |= (j & 0x7F) << 14;
      k = sc();
      if (k >= 0) {
        return i | k << 21;
      }
      j = sc();
      k = i | (k & 0x7F) << 21 | j << 28;
      i = k;
    } while (j >= 0);
    int j = 0;
    for (;;)
    {
      if (j >= 5) {
        throw b.cJV();
      }
      i = k;
      if (sc() >= 0) {
        break;
      }
      j += 1;
    }
  }
  
  public final long rZ()
  {
    int i = 0;
    long l = 0L;
    for (;;)
    {
      if (i >= 64) {
        throw b.cJV();
      }
      int j = sc();
      l |= (j & 0x7F) << i;
      if ((j & 0x80) == 0) {
        return l;
      }
      i += 7;
    }
  }
  
  public final double readDouble()
  {
    int i = sc();
    int j = sc();
    int k = sc();
    int m = sc();
    int n = sc();
    int i1 = sc();
    int i2 = sc();
    int i3 = sc();
    long l = i;
    return Double.longBitsToDouble((j & 0xFF) << 8 | l & 0xFF | (k & 0xFF) << 16 | (m & 0xFF) << 24 | (n & 0xFF) << 32 | (i1 & 0xFF) << 40 | (i2 & 0xFF) << 48 | (i3 & 0xFF) << 56);
  }
  
  public final float readFloat()
  {
    return Float.intBitsToFloat(sc() & 0xFF | (sc() & 0xFF) << 8 | (sc() & 0xFF) << 16 | (sc() & 0xFF) << 24);
  }
  
  public final String readString()
  {
    int i = rY();
    if ((i < this.bufferSize - this.bfI) && (i > 0))
    {
      String str = new String(this.buffer, this.bfI, i, "UTF-8");
      this.bfI = (i + this.bfI);
      return str;
    }
    return new String(dY(i), "UTF-8");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/f/a/a/b/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */