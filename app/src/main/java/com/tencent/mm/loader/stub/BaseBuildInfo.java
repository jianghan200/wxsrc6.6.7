package com.tencent.mm.loader.stub;

import android.os.Build.VERSION;

public class BaseBuildInfo
{
  public static String BUILD_TAG;
  public static String CLIENT_VERSION;
  public static String COMMAND;
  public static String DEVICE_TYPE;
  public static boolean ENABLE_STETHO = false;
  public static boolean EX_DEVICE_LOGIN = false;
  public static String HOSTNAME;
  public static String OWNER;
  public static String PATCH_ENABLED = "true";
  public static String PATCH_REV;
  public static int PATCH_TINKER_FLAG;
  public static boolean REDESIGN_ENTRANCE = false;
  public static String REV = "f6b4b06b7ce8bc23015c8c8704a7aaf7d858dfb6";
  public static String SVNPATH;
  public static String TIME;
  
  static
  {
    CLIENT_VERSION = "0x26060736";
    DEVICE_TYPE = "android-" + Build.VERSION.SDK_INT;
    TIME = "2018-05-31 14:12:58";
    HOSTNAME = "45ea8765cf33";
    BUILD_TAG = "MicroMessenger_Android_GIT_RELEASE_GRADLE #6878";
    OWNER = "amm_code_helper";
    COMMAND = "null";
    SVNPATH = "origin/RB-2018-APR@git";
    PATCH_REV = null;
    PATCH_TINKER_FLAG = 7;
  }
  
  public static String baseRevision()
  {
    return REV;
  }
  
  public static String codeRevision()
  {
    if (PATCH_REV == null) {
      return REV;
    }
    return REV + "." + PATCH_REV;
  }
  
  public static boolean patchEnabled()
  {
    return !"false".equalsIgnoreCase(PATCH_ENABLED);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/loader/stub/BaseBuildInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */