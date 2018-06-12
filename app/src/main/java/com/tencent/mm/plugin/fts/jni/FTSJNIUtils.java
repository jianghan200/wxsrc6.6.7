package com.tencent.mm.plugin.fts.jni;

public class FTSJNIUtils
{
  public static native int countTokens(String paramString);
  
  public static native String icuTokenizer(String paramString);
  
  public static native void nativeInitFts(long paramLong, byte[] paramArrayOfByte);
  
  public static native int stringCompareUtfBinary(String paramString1, String paramString2);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/fts/jni/FTSJNIUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */