package com.tencent.magicbrush.engine;

import com.tencent.magicbrush.a.b;
import java.nio.ByteBuffer;

public class JsEngine
{
  static
  {
    b.loadLibrary("mmv8");
    b.loadLibrary("magicbrush");
  }
  
  static native void addJsInterface(long paramLong, Object paramObject, String paramString);
  
  static native long createVM();
  
  static native long createVMContext(long paramLong);
  
  static native String evaluateJavascript(long paramLong, String paramString);
  
  static native String evaluateJavascriptFile(long paramLong, String paramString1, String paramString2);
  
  static native ByteBuffer getNativeBuffer(int paramInt, long paramLong);
  
  public static native int getNativeBufferId();
  
  static native boolean pushObject(long paramLong1, long paramLong2, String paramString);
  
  static native void releaseVM(long paramLong);
  
  static native void releaseVMContext(long paramLong);
  
  static native boolean removeJsInterface(long paramLong, String paramString);
  
  static native boolean removeObject(long paramLong, String paramString);
  
  public static native void setNativeBuffer(int paramInt, ByteBuffer paramByteBuffer);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/magicbrush/engine/JsEngine.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */