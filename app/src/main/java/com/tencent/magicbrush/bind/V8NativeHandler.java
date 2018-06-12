package com.tencent.magicbrush.bind;

import com.tencent.magicbrush.a.b;

public class V8NativeHandler
{
  static
  {
    b.loadLibrary("mmv8");
    b.loadLibrary("magicbrush");
  }
  
  public native void nativeAddJsInterface(V8JSInterface paramV8JSInterface, String paramString);
  
  public native String nativeCheckError();
  
  public native void nativeCleanUp();
  
  public native String nativeEvaluateJavascript(String paramString);
  
  public native void nativeInit();
  
  public native void nativePause();
  
  public native void nativeResume();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/magicbrush/bind/V8NativeHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */