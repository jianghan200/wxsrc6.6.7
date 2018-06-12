package com.tencent.magicbrush.handler;

import android.support.annotation.Keep;
import com.tencent.magicbrush.a.c.a;

@Keep
public class MBJavaHandler
{
  private static c mCallbackProxy;
  
  @Keep
  public static String decodeString(byte[] paramArrayOfByte, String paramString)
  {
    return d.decodeString(paramArrayOfByte, paramString);
  }
  
  @Keep
  public static byte[] encodeString(String paramString1, String paramString2)
  {
    return d.encodeString(paramString1, paramString2);
  }
  
  @Keep
  public static void onScreenCanvasContextTypeSet(boolean paramBoolean)
  {
    if (mCallbackProxy == null) {
      return;
    }
    mCallbackProxy.onScreenCanvasContextTypeSet(paramBoolean);
  }
  
  @Keep
  public static void onShaderCompileError(String paramString)
  {
    if (mCallbackProxy == null) {
      return;
    }
    mCallbackProxy.onShaderCompileError(paramString);
  }
  
  @Keep
  public static void printConsole(int paramInt, String paramString)
  {
    c.a.i(paramInt, paramString);
  }
  
  @Keep
  public static byte[] readResource(String paramString1, String paramString2)
  {
    if (mCallbackProxy != null) {
      return mCallbackProxy.bQ(paramString2);
    }
    return null;
  }
  
  @Keep
  public static String resource_getMediaFilePath(String paramString1, String paramString2)
  {
    if (mCallbackProxy != null) {
      return mCallbackProxy.s(paramString1, paramString2);
    }
    return null;
  }
  
  public static void setCallbackProxy(c paramc)
  {
    mCallbackProxy = paramc;
  }
  
  @Keep
  public static void v8_exception(String paramString1, String paramString2, long paramLong)
  {
    if (mCallbackProxy == null) {
      return;
    }
    mCallbackProxy.t(paramString1, paramString2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/magicbrush/handler/MBJavaHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */