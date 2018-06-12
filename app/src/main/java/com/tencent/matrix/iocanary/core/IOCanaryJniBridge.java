package com.tencent.matrix.iocanary.core;

import java.util.ArrayList;

public class IOCanaryJniBridge
{
  private static b bqW;
  private static boolean bqX;
  private static boolean bqY;
  
  public static void a(com.tencent.matrix.iocanary.a.a parama, b paramb)
  {
    com.tencent.matrix.d.b.v("Matrix.IOCanaryJniBridge", "install sIsTryInstall:%b", new Object[] { Boolean.valueOf(bqX) });
    if (bqX) {
      return;
    }
    if (!tt())
    {
      com.tencent.matrix.d.b.e("Matrix.IOCanaryJniBridge", "install loadJni failed", new Object[0]);
      return;
    }
    bqW = paramb;
    if (parama != null) {}
    try
    {
      if (parama.el(1))
      {
        enableDetector(0);
        setConfig(0, parama.bqM * 1000L);
      }
      if (parama.el(4))
      {
        enableDetector(1);
        setConfig(1, parama.bqN);
      }
      if (parama.el(2))
      {
        enableDetector(2);
        setConfig(2, parama.bqP);
      }
      doHook();
      bqX = true;
      return;
    }
    catch (Error parama)
    {
      com.tencent.matrix.d.b.printErrStackTrace("Matrix.IOCanaryJniBridge", parama, "call jni method error", new Object[0]);
    }
  }
  
  private static native boolean doHook();
  
  private static native boolean doUnHook();
  
  private static native void enableDetector(int paramInt);
  
  private static JavaContext getJavaContext()
  {
    try
    {
      JavaContext localJavaContext = new JavaContext(null);
      return localJavaContext;
    }
    catch (Throwable localThrowable)
    {
      com.tencent.matrix.d.b.printErrStackTrace("Matrix.IOCanaryJniBridge", localThrowable, "get javacontext exception", new Object[0]);
    }
    return null;
  }
  
  public static void onIssuePublish(ArrayList<IOIssue> paramArrayList)
  {
    if (bqW == null) {
      return;
    }
    bqW.y(paramArrayList);
  }
  
  private static native void setConfig(int paramInt, long paramLong);
  
  public static void ts()
  {
    if (!bqX) {
      return;
    }
    doUnHook();
    bqX = false;
  }
  
  private static boolean tt()
  {
    if (bqY) {
      return true;
    }
    try
    {
      System.loadLibrary("io-canary");
      bqY = true;
      return true;
    }
    catch (Exception localException)
    {
      com.tencent.matrix.d.b.e("Matrix.IOCanaryJniBridge", "hook: e: %s", new Object[] { localException.getLocalizedMessage() });
      bqY = false;
    }
    return false;
  }
  
  private static final class ConfigKey
  {
    static final int MAIN_THREAD_THRESHOLD = 0;
    static final int REPEAT_READ_THRESHOLD = 2;
    static final int SMALL_BUFFER_THRESHOLD = 1;
  }
  
  private static final class DetectorType
  {
    static final int MAIN_THREAD_IO = 0;
    static final int REPEAT_READ = 2;
    static final int SMALL_BUFFER = 1;
  }
  
  private static final class JavaContext
  {
    private final String stack = com.tencent.matrix.iocanary.c.a.getThrowableStack(new Throwable());
    private final String threadName = Thread.currentThread().getName();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/iocanary/core/IOCanaryJniBridge.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */