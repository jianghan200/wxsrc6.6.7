package com.tencent.mars.xlog;

import com.tencent.mm.sdk.platformtools.bf;
import com.tencent.mm.sdk.platformtools.x.a;
import com.tencent.mm.sdk.platformtools.y;

public class Xlog
  implements x.a
{
  public static final int AppednerModeAsync = 0;
  public static final int AppednerModeSync = 1;
  public static final int LEVEL_ALL = 0;
  public static final int LEVEL_DEBUG = 1;
  public static final int LEVEL_ERROR = 4;
  public static final int LEVEL_FATAL = 5;
  public static final int LEVEL_INFO = 2;
  public static final int LEVEL_NONE = 6;
  public static final int LEVEL_VERBOSE = 0;
  public static final int LEVEL_WARNING = 3;
  public static y logDecryptor;
  
  public static void AppenderOpen(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3)
  {
    appenderOpen(paramInt1, paramInt2, paramString1, paramString2, paramString3, "1dac3876bd566b60c7dcbffd219ca6af2d2c07f045711bf2a6d111a2b1fc27c4df31c1f568879708c5159e370ab141e6627ea028b47f8a5cf4d39ca30d501f81");
  }
  
  public static native void appenderOpen(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4);
  
  private static String decryptTag(String paramString)
  {
    y localy;
    if (logDecryptor != null)
    {
      localy = logDecryptor;
      if ((paramString != null) && (paramString.length() != 0)) {}
    }
    else
    {
      return paramString;
    }
    switch (paramString.charAt(0) ^ 0xDCBA)
    {
    default: 
      return paramString;
    case '⍆': 
      return localy.cV(paramString, paramString.length());
    }
    return localy.sGp.decryptTag(paramString);
  }
  
  public static native void logWrite(XLoggerInfo paramXLoggerInfo, String paramString);
  
  public static native void logWrite2(int paramInt1, String paramString1, String paramString2, String paramString3, int paramInt2, int paramInt3, long paramLong1, long paramLong2, String paramString4);
  
  public static void open(boolean paramBoolean, int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3)
  {
    if (paramBoolean) {
      System.loadLibrary("tencentxlog");
    }
    AppenderOpen(paramInt1, paramInt2, paramString1, paramString2, paramString3);
  }
  
  public static native void setAppenderMode(int paramInt);
  
  public static native void setConsoleLogOpen(boolean paramBoolean);
  
  public native void appenderClose();
  
  public native void appenderFlush(boolean paramBoolean);
  
  public native int getLogLevel();
  
  public void logD(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, long paramLong1, long paramLong2, String paramString4)
  {
    logWrite2(1, decryptTag(paramString1), paramString2, paramString3, paramInt1, paramInt2, paramLong1, paramLong2, paramString4);
  }
  
  public void logE(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, long paramLong1, long paramLong2, String paramString4)
  {
    logWrite2(4, decryptTag(paramString1), paramString2, paramString3, paramInt1, paramInt2, paramLong1, paramLong2, paramString4);
  }
  
  public void logF(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, long paramLong1, long paramLong2, String paramString4)
  {
    logWrite2(5, decryptTag(paramString1), paramString2, paramString3, paramInt1, paramInt2, paramLong1, paramLong2, paramString4);
  }
  
  public void logI(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, long paramLong1, long paramLong2, String paramString4)
  {
    logWrite2(2, decryptTag(paramString1), paramString2, paramString3, paramInt1, paramInt2, paramLong1, paramLong2, paramString4);
  }
  
  public void logV(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, long paramLong1, long paramLong2, String paramString4)
  {
    logWrite2(0, decryptTag(paramString1), paramString2, paramString3, paramInt1, paramInt2, paramLong1, paramLong2, paramString4);
  }
  
  public void logW(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, long paramLong1, long paramLong2, String paramString4)
  {
    logWrite2(3, decryptTag(paramString1), paramString2, paramString3, paramInt1, paramInt2, paramLong1, paramLong2, paramString4);
  }
  
  static class XLoggerInfo
  {
    public String filename;
    public String funcname;
    public int level;
    public int line;
    public long maintid;
    public long pid;
    public String tag;
    public long tid;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mars/xlog/Xlog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */