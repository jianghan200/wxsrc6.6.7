package com.google.android.exoplayer2.i;

import com.google.android.exoplayer2.d.b;
import java.nio.charset.Charset;

public final class j
{
  public byte[] data;
  public int limit;
  public int position;
  
  public j() {}
  
  public j(int paramInt)
  {
    this.data = new byte[paramInt];
    this.limit = paramInt;
  }
  
  public j(byte[] paramArrayOfByte)
  {
    this.data = paramArrayOfByte;
    this.limit = paramArrayOfByte.length;
  }
  
  public j(byte[] paramArrayOfByte, int paramInt)
  {
    this.data = paramArrayOfByte;
    this.limit = paramInt;
  }
  
  public final String a(int paramInt, Charset paramCharset)
  {
    paramCharset = new String(this.data, this.position, paramInt, paramCharset);
    this.position += paramInt;
    return paramCharset;
  }
  
  public final long ba()
  {
    byte[] arrayOfByte = this.data;
    int i = this.position;
    this.position = (i + 1);
    long l1 = arrayOfByte[i];
    arrayOfByte = this.data;
    i = this.position;
    this.position = (i + 1);
    long l2 = arrayOfByte[i];
    arrayOfByte = this.data;
    i = this.position;
    this.position = (i + 1);
    long l3 = arrayOfByte[i];
    arrayOfByte = this.data;
    i = this.position;
    this.position = (i + 1);
    return (l1 & 0xFF) << 24 | (l2 & 0xFF) << 16 | (l3 & 0xFF) << 8 | arrayOfByte[i] & 0xFF;
  }
  
  public final void c(i parami, int paramInt)
  {
    readBytes(parami.data, 0, paramInt);
    parami.setPosition(0);
  }
  
  public final void cZ(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt <= this.data.length)) {}
    for (boolean bool = true;; bool = false)
    {
      a.ao(bool);
      this.limit = paramInt;
      return;
    }
  }
  
  public final int capacity()
  {
    if (this.data == null) {
      return 0;
    }
    return this.data.length;
  }
  
  public final void da(int paramInt)
  {
    setPosition(this.position + paramInt);
  }
  
  public final void m(byte[] paramArrayOfByte, int paramInt)
  {
    this.data = paramArrayOfByte;
    this.limit = paramInt;
    this.position = 0;
  }
  
  public final int me()
  {
    return this.limit - this.position;
  }
  
  public final int mf()
  {
    byte[] arrayOfByte = this.data;
    int i = this.position;
    this.position = (i + 1);
    i = arrayOfByte[i];
    arrayOfByte = this.data;
    int j = this.position;
    this.position = (j + 1);
    j = arrayOfByte[j];
    arrayOfByte = this.data;
    int k = this.position;
    this.position = (k + 1);
    return (i & 0xFF) << 16 | (j & 0xFF) << 8 | arrayOfByte[k] & 0xFF;
  }
  
  public final int mg()
  {
    return readUnsignedByte() << 21 | readUnsignedByte() << 14 | readUnsignedByte() << 7 | readUnsignedByte();
  }
  
  public final int mh()
  {
    int i = readInt();
    if (i < 0) {
      throw new IllegalStateException("Top bit not zero: " + i);
    }
    return i;
  }
  
  public final long mi()
  {
    long l = readLong();
    if (l < 0L) {
      throw new IllegalStateException("Top bit not zero: " + l);
    }
    return l;
  }
  
  public final String mj()
  {
    if (me() == 0) {
      return null;
    }
    int i = this.position;
    while ((i < this.limit) && (this.data[i] != 0)) {
      i += 1;
    }
    String str = new String(this.data, this.position, i - this.position);
    this.position = i;
    if (this.position < this.limit) {
      this.position += 1;
    }
    return str;
  }
  
  public final void readBytes(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    System.arraycopy(this.data, this.position, paramArrayOfByte, paramInt1, paramInt2);
    this.position += paramInt2;
  }
  
  public final int readInt()
  {
    byte[] arrayOfByte = this.data;
    int i = this.position;
    this.position = (i + 1);
    i = arrayOfByte[i];
    arrayOfByte = this.data;
    int j = this.position;
    this.position = (j + 1);
    j = arrayOfByte[j];
    arrayOfByte = this.data;
    int k = this.position;
    this.position = (k + 1);
    k = arrayOfByte[k];
    arrayOfByte = this.data;
    int m = this.position;
    this.position = (m + 1);
    return (i & 0xFF) << 24 | (j & 0xFF) << 16 | (k & 0xFF) << 8 | arrayOfByte[m] & 0xFF;
  }
  
  public final String readLine()
  {
    if (me() == 0) {
      return null;
    }
    int i = this.position;
    while ((i < this.limit) && (!t.dd(this.data[i]))) {
      i += 1;
    }
    if ((i - this.position >= 3) && (this.data[this.position] == -17) && (this.data[(this.position + 1)] == -69) && (this.data[(this.position + 2)] == -65)) {
      this.position += 3;
    }
    String str = new String(this.data, this.position, i - this.position);
    this.position = i;
    if (this.position == this.limit) {
      return str;
    }
    if (this.data[this.position] == 13)
    {
      this.position += 1;
      if (this.position == this.limit) {
        return str;
      }
    }
    if (this.data[this.position] == 10) {
      this.position += 1;
    }
    return str;
  }
  
  public final long readLong()
  {
    byte[] arrayOfByte = this.data;
    int i = this.position;
    this.position = (i + 1);
    long l1 = arrayOfByte[i];
    arrayOfByte = this.data;
    i = this.position;
    this.position = (i + 1);
    long l2 = arrayOfByte[i];
    arrayOfByte = this.data;
    i = this.position;
    this.position = (i + 1);
    long l3 = arrayOfByte[i];
    arrayOfByte = this.data;
    i = this.position;
    this.position = (i + 1);
    long l4 = arrayOfByte[i];
    arrayOfByte = this.data;
    i = this.position;
    this.position = (i + 1);
    long l5 = arrayOfByte[i];
    arrayOfByte = this.data;
    i = this.position;
    this.position = (i + 1);
    long l6 = arrayOfByte[i];
    arrayOfByte = this.data;
    i = this.position;
    this.position = (i + 1);
    long l7 = arrayOfByte[i];
    arrayOfByte = this.data;
    i = this.position;
    this.position = (i + 1);
    return (l1 & 0xFF) << 56 | (l2 & 0xFF) << 48 | (l3 & 0xFF) << 40 | (l4 & 0xFF) << 32 | (l5 & 0xFF) << 24 | (l6 & 0xFF) << 16 | (l7 & 0xFF) << 8 | arrayOfByte[i] & 0xFF;
  }
  
  public final String readString(int paramInt)
  {
    return a(paramInt, Charset.forName("UTF-8"));
  }
  
  public final int readUnsignedByte()
  {
    byte[] arrayOfByte = this.data;
    int i = this.position;
    this.position = (i + 1);
    return arrayOfByte[i] & 0xFF;
  }
  
  public final int readUnsignedShort()
  {
    byte[] arrayOfByte = this.data;
    int i = this.position;
    this.position = (i + 1);
    i = arrayOfByte[i];
    arrayOfByte = this.data;
    int j = this.position;
    this.position = (j + 1);
    return (i & 0xFF) << 8 | arrayOfByte[j] & 0xFF;
  }
  
  public final void reset(int paramInt)
  {
    if (capacity() < paramInt) {}
    for (byte[] arrayOfByte = new byte[paramInt];; arrayOfByte = this.data)
    {
      m(arrayOfByte, paramInt);
      return;
    }
  }
  
  public final void setPosition(int paramInt)
  {
    boolean bool = true;
    if ((paramInt < 0) || (paramInt > this.limit)) {
      b.i("ExoPlayer", "position%d, limit:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.limit) });
    }
    if ((paramInt >= 0) && (paramInt <= this.limit)) {}
    for (;;)
    {
      a.ao(bool);
      this.position = paramInt;
      return;
      bool = false;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/exoplayer2/i/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */