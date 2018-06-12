package com.tencent.xweb.xwalk;

import android.os.Handler;
import android.os.HandlerThread;
import android.webkit.ValueCallback;
import com.tencent.xweb.c.g;
import com.tencent.xweb.d;
import java.net.URL;
import java.nio.ByteBuffer;

public final class b
  implements g
{
  XWAppBrandEngine vED;
  HandlerThread vEE = new HandlerThread("v8_worker");
  private Handler vEF;
  boolean vEG = false;
  
  public b()
  {
    this.vEE.start();
    this.vEF = new Handler(this.vEE.getLooper());
  }
  
  public final boolean CY()
  {
    return true;
  }
  
  public final void addJavascriptInterface(Object paramObject, String paramString)
  {
    this.vEF.post(new b.5(this, paramObject, paramString));
  }
  
  public final boolean cIG()
  {
    return true;
  }
  
  public final void cleanup()
  {
    this.vEF.post(new b.3(this));
  }
  
  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    this.vEF.post(new b.4(this, paramString, paramValueCallback));
  }
  
  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback, URL paramURL)
  {
    evaluateJavascript(paramString, paramValueCallback);
  }
  
  public final ByteBuffer getNativeBuffer(int paramInt)
  {
    Object localObject = this.vED;
    ByteBuffer localByteBuffer = ((XWAppBrandEngine)localObject).getNativeBuffer(((XWAppBrandEngine)localObject).mInstance, paramInt);
    localObject = localByteBuffer;
    if (localByteBuffer == null) {
      localObject = ByteBuffer.allocate(0);
    }
    return (ByteBuffer)localObject;
  }
  
  public final int getNativeBufferId()
  {
    if (this.vED == null) {
      return 0;
    }
    XWAppBrandEngine localXWAppBrandEngine = this.vED;
    return localXWAppBrandEngine.getNativeBufferId(localXWAppBrandEngine.mInstance);
  }
  
  public final void init(int paramInt)
  {
    this.vEF.post(new b.1(this));
  }
  
  public final void pause()
  {
    if (this.vEG) {
      return;
    }
    this.vEG = true;
    this.vEF.post(new b.2(this));
  }
  
  public final void resume()
  {
    this.vEG = false;
  }
  
  public final void setJsExceptionHandler(d paramd) {}
  
  public final void setNativeBuffer(int paramInt, ByteBuffer paramByteBuffer)
  {
    XWAppBrandEngine localXWAppBrandEngine = this.vED;
    if (paramByteBuffer != null)
    {
      ByteBuffer localByteBuffer = paramByteBuffer;
      if (!paramByteBuffer.isDirect())
      {
        localByteBuffer = ByteBuffer.allocateDirect(paramByteBuffer.capacity());
        paramByteBuffer.rewind();
        localByteBuffer.put(paramByteBuffer);
      }
      localXWAppBrandEngine.setNativeBuffer(localXWAppBrandEngine.mInstance, paramInt, localByteBuffer);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/xweb/xwalk/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */