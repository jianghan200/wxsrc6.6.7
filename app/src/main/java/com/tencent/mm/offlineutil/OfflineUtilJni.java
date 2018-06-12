package com.tencent.mm.offlineutil;

public class OfflineUtilJni
{
  public static native char[] CheckSumWithBase91(String paramString);
  
  public static native String DecodeBase91(String paramString);
  
  public static native String EncodeBase91(String paramString);
  
  public static native String GenOffLineQrcode(String paramString, byte[] paramArrayOfByte);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/offlineutil/OfflineUtilJni.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */