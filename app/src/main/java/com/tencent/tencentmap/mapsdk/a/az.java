package com.tencent.tencentmap.mapsdk.a;

import com.qq.jutil.crypto.HexUtil;
import java.nio.ByteBuffer;

public class az
{
  int a = 0;
  byte[] b;
  int c;
  ao d;
  jp e;
  
  private az(int paramInt, byte[] paramArrayOfByte)
  {
    this.c = paramInt;
    a(paramArrayOfByte);
  }
  
  public static az a(int paramInt1, int paramInt2)
  {
    az localaz = new az(paramInt2, new byte[0]);
    jp localjp = new jp();
    localjp.e = paramInt1;
    localjp.c = paramInt2;
    localaz.e = localjp;
    return localaz;
  }
  
  public static az a(boolean paramBoolean, int paramInt, byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(paramArrayOfByte.length + 4);
    localByteBuffer.putInt(localByteBuffer.capacity()).put(paramArrayOfByte).flip();
    return new az(paramInt, localByteBuffer.array());
  }
  
  public void a(ao paramao)
  {
    this.d = paramao;
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    this.b = paramArrayOfByte;
    this.a = paramArrayOfByte.length;
  }
  
  public String toString()
  {
    return "seq:" + this.c + " " + HexUtil.bytes2HexStr(this.b);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */