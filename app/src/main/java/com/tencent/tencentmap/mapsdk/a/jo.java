package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Rect;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class jo
{
  public final Rect a = new Rect();
  public int[] b;
  public int[] c;
  public int[] d;
  
  public static jo a(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = ByteBuffer.wrap(paramArrayOfByte).order(ByteOrder.nativeOrder());
    if (paramArrayOfByte.get() == 0) {
      return null;
    }
    jo localjo = new jo();
    localjo.b = new int[paramArrayOfByte.get()];
    localjo.c = new int[paramArrayOfByte.get()];
    localjo.d = new int[paramArrayOfByte.get()];
    a(localjo.b.length);
    a(localjo.c.length);
    paramArrayOfByte.getInt();
    paramArrayOfByte.getInt();
    localjo.a.left = paramArrayOfByte.getInt();
    localjo.a.right = paramArrayOfByte.getInt();
    localjo.a.top = paramArrayOfByte.getInt();
    localjo.a.bottom = paramArrayOfByte.getInt();
    paramArrayOfByte.getInt();
    a(localjo.b, paramArrayOfByte);
    a(localjo.c, paramArrayOfByte);
    a(localjo.d, paramArrayOfByte);
    return localjo;
  }
  
  private static void a(int paramInt)
  {
    if ((paramInt == 0) || ((paramInt & 0x1) != 0)) {
      throw new RuntimeException("invalid nine-patch: " + paramInt);
    }
  }
  
  private static void a(int[] paramArrayOfInt, ByteBuffer paramByteBuffer)
  {
    int i = 0;
    int j = paramArrayOfInt.length;
    while (i < j)
    {
      paramArrayOfInt[i] = paramByteBuffer.getInt();
      i += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/jo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */