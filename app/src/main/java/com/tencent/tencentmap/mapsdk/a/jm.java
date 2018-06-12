package com.tencent.tencentmap.mapsdk.a;

public class jm
{
  public static int a(byte[] paramArrayOfByte)
  {
    return paramArrayOfByte[0] & 0xFF | 0xFF00 & paramArrayOfByte[1] << 8 | 0xFF0000 & paramArrayOfByte[2] << 16 | 0xFF000000 & paramArrayOfByte[3] << 24;
  }
  
  public static String a(byte[] paramArrayOfByte, String paramString)
  {
    try
    {
      paramArrayOfByte = new String(paramArrayOfByte, paramString).trim();
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte) {}
    return null;
  }
  
  public static byte[] a(int paramInt)
  {
    return new byte[] { (byte)paramInt, (byte)(paramInt >> 8), (byte)(paramInt >> 16), (byte)(paramInt >> 24) };
  }
  
  public static byte[] a(String paramString)
  {
    if (paramString != null) {
      try
      {
        paramString = paramString.getBytes("UTF-16LE");
        return paramString;
      }
      catch (Exception paramString) {}
    }
    return new byte[0];
  }
  
  public static boolean b(byte[] paramArrayOfByte)
  {
    boolean bool = false;
    if (paramArrayOfByte[0] > 0) {
      bool = true;
    }
    return bool;
  }
  
  public static float c(byte[] paramArrayOfByte)
  {
    return Float.intBitsToFloat(a(paramArrayOfByte));
  }
  
  public static String d(byte[] paramArrayOfByte)
  {
    try
    {
      paramArrayOfByte = new String(paramArrayOfByte, "UTF-16LE").trim();
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte) {}
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/jm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */