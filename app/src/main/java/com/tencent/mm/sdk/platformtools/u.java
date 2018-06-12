package com.tencent.mm.sdk.platformtools;

import java.nio.ByteBuffer;

public final class u
{
  private ByteBuffer byteBuffer;
  private boolean sFV;
  
  private int CY(int paramInt)
  {
    if (this.byteBuffer.limit() - this.byteBuffer.position() > paramInt) {
      return 0;
    }
    ByteBuffer localByteBuffer = ByteBuffer.allocate(this.byteBuffer.limit() + 4096);
    localByteBuffer.put(this.byteBuffer.array(), 0, this.byteBuffer.position());
    this.byteBuffer = localByteBuffer;
    return 0;
  }
  
  public final void CX(int paramInt)
  {
    this.byteBuffer.position(this.byteBuffer.position() + paramInt);
  }
  
  public final int CZ(int paramInt)
  {
    if (!this.sFV) {
      throw new Exception("Buffer For Parse");
    }
    CY(4);
    this.byteBuffer.putInt(paramInt);
    return 0;
  }
  
  public final int Wj(String paramString)
  {
    if (!this.sFV) {
      throw new Exception("Buffer For Parse");
    }
    byte[] arrayOfByte = null;
    if (paramString != null) {
      arrayOfByte = paramString.getBytes();
    }
    paramString = arrayOfByte;
    if (arrayOfByte == null) {
      paramString = new byte[0];
    }
    if (paramString.length > 2048) {
      throw new Exception("Buffer String Length Error");
    }
    CY(paramString.length + 2);
    this.byteBuffer.putShort((short)paramString.length);
    if (paramString.length > 0) {
      this.byteBuffer.put(paramString);
    }
    return 0;
  }
  
  public final int by(byte[] paramArrayOfByte)
  {
    int i;
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      i = -1;
    }
    while (i != 0)
    {
      this.byteBuffer = null;
      return -1;
      if (paramArrayOfByte[0] != 123) {
        i = -2;
      } else if (paramArrayOfByte[(paramArrayOfByte.length - 1)] != 125) {
        i = -3;
      } else {
        i = 0;
      }
    }
    this.byteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.byteBuffer.position(1);
    this.sFV = false;
    return 0;
  }
  
  public final int bz(byte[] paramArrayOfByte)
  {
    if (!this.sFV) {
      throw new Exception("Buffer For Parse");
    }
    byte[] arrayOfByte = null;
    if (paramArrayOfByte != null) {
      arrayOfByte = paramArrayOfByte;
    }
    paramArrayOfByte = arrayOfByte;
    if (arrayOfByte == null) {
      paramArrayOfByte = new byte[0];
    }
    if (paramArrayOfByte.length > 2048) {
      throw new Exception("Buffer String Length Error");
    }
    CY(paramArrayOfByte.length + 2);
    this.byteBuffer.putShort((short)paramArrayOfByte.length);
    if (paramArrayOfByte.length > 0) {
      this.byteBuffer.put(paramArrayOfByte);
    }
    return 0;
  }
  
  public final void chC()
  {
    if (this.sFV) {
      throw new Exception("Buffer For Build");
    }
    int i = this.byteBuffer.getShort();
    if (i > 2048)
    {
      this.byteBuffer = null;
      throw new Exception("Buffer String Length Error");
    }
    if (i == 0) {
      return;
    }
    this.byteBuffer.position(i + this.byteBuffer.position());
  }
  
  public final boolean chD()
  {
    return this.byteBuffer.limit() - this.byteBuffer.position() <= 1;
  }
  
  public final int chE()
  {
    this.byteBuffer = ByteBuffer.allocate(4096);
    this.byteBuffer.put((byte)123);
    this.sFV = true;
    return 0;
  }
  
  public final byte[] chF()
  {
    if (!this.sFV) {
      throw new Exception("Buffer For Parse");
    }
    CY(1);
    this.byteBuffer.put((byte)125);
    byte[] arrayOfByte = new byte[this.byteBuffer.position()];
    System.arraycopy(this.byteBuffer.array(), 0, arrayOfByte, 0, arrayOfByte.length);
    return arrayOfByte;
  }
  
  public final int fX(long paramLong)
  {
    if (!this.sFV) {
      throw new Exception("Buffer For Parse");
    }
    CY(8);
    this.byteBuffer.putLong(paramLong);
    return 0;
  }
  
  public final byte[] getBuffer()
  {
    if (this.sFV) {
      throw new Exception("Buffer For Build");
    }
    int i = this.byteBuffer.getShort();
    if (i > 2048)
    {
      this.byteBuffer = null;
      throw new Exception("Buffer String Length Error");
    }
    if (i == 0) {
      return new byte[0];
    }
    byte[] arrayOfByte = new byte[i];
    this.byteBuffer.get(arrayOfByte, 0, i);
    return arrayOfByte;
  }
  
  public final int getInt()
  {
    if (this.sFV) {
      throw new Exception("Buffer For Build");
    }
    return this.byteBuffer.getInt();
  }
  
  public final long getLong()
  {
    if (this.sFV) {
      throw new Exception("Buffer For Build");
    }
    return this.byteBuffer.getLong();
  }
  
  public final String getString()
  {
    if (this.sFV) {
      throw new Exception("Buffer For Build");
    }
    int i = this.byteBuffer.getShort();
    if (i > 2048)
    {
      this.byteBuffer = null;
      throw new Exception("Buffer String Length Error");
    }
    if (i == 0) {
      return "";
    }
    byte[] arrayOfByte = new byte[i];
    this.byteBuffer.get(arrayOfByte, 0, i);
    return new String(arrayOfByte, "UTF-8");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */