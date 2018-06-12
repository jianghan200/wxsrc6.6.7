package com.tencent.liteav.basic.util;

public class TXCCommonUtil
{
  private static String mStrAppVersion = "";
  public static String pituLicencePath;
  
  static
  {
    a.d();
  }
  
  public static String getAppVersion()
  {
    return mStrAppVersion;
  }
  
  public static String getFileExtension(String paramString)
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (paramString != null)
    {
      localObject1 = localObject2;
      if (paramString.length() > 0)
      {
        int i = paramString.lastIndexOf('.');
        localObject1 = localObject2;
        if (i >= 0)
        {
          localObject1 = localObject2;
          if (i < paramString.length() - 1) {
            localObject1 = paramString.substring(i + 1);
          }
        }
      }
    }
    return (String)localObject1;
  }
  
  public static int getSDKID()
  {
    return nativeGetSDKID();
  }
  
  public static int[] getSDKVersion()
  {
    String[] arrayOfString = nativeGetSDKVersion().split("\\.");
    int[] arrayOfInt = new int[arrayOfString.length];
    int i = 0;
    for (;;)
    {
      if (i < arrayOfString.length) {
        try
        {
          arrayOfInt[i] = Integer.parseInt(arrayOfString[i]);
          i += 1;
        }
        catch (NumberFormatException localNumberFormatException)
        {
          for (;;)
          {
            arrayOfInt[i] = 0;
          }
        }
      }
    }
    return arrayOfInt;
  }
  
  public static String getSDKVersionStr()
  {
    return nativeGetSDKVersion();
  }
  
  private static native int nativeGetSDKID();
  
  private static native String nativeGetSDKVersion();
  
  public static void setAppVersion(String paramString)
  {
    mStrAppVersion = paramString;
  }
  
  public static void setPituLicencePath(String paramString)
  {
    pituLicencePath = paramString;
  }
  
  public static void sleep(int paramInt)
  {
    long l = paramInt;
    try
    {
      Thread.sleep(l);
      return;
    }
    catch (InterruptedException localInterruptedException) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/liteav/basic/util/TXCCommonUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */