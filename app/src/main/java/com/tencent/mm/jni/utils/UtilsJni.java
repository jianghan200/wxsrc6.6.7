package com.tencent.mm.jni.utils;

public class UtilsJni
{
  public static native byte[] cryptGenRandom(int paramInt);
  
  public static native int doEcdsaSHAVerify(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3);
  
  public static native int doEcdsaVerify(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/jni/utils/UtilsJni.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */