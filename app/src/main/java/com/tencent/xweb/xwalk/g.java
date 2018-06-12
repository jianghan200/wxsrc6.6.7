package com.tencent.xweb.xwalk;

import android.os.Handler;
import android.os.HandlerThread;
import android.webkit.ValueCallback;
import com.tencent.xweb.d;
import java.net.URL;
import java.nio.ByteBuffer;
import org.xwalk.core.XWalkV8;

public final class g
  implements com.tencent.xweb.c.g
{
  HandlerThread vEE = new HandlerThread("j2v8");
  private Handler vEF;
  XWalkV8 vET;
  
  public g()
  {
    this.vEE.start();
    this.vEF = new Handler(this.vEE.getLooper());
  }
  
  public final boolean CY()
  {
    return false;
  }
  
  public final void addJavascriptInterface(Object paramObject, String paramString)
  {
    this.vEF.post(new g.4(this, paramObject, paramString));
  }
  
  public final boolean cIG()
  {
    return false;
  }
  
  public final void cleanup()
  {
    this.vEF.post(new g.2(this));
  }
  
  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    this.vEF.post(new g.3(this, paramString, paramValueCallback));
  }
  
  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback, URL paramURL)
  {
    evaluateJavascript(paramString, paramValueCallback);
  }
  
  public final ByteBuffer getNativeBuffer(int paramInt)
  {
    return null;
  }
  
  public final int getNativeBufferId()
  {
    return 0;
  }
  
  public final void init(int paramInt)
  {
    this.vEF.post(new g.1(this, paramInt));
  }
  
  public final void pause() {}
  
  public final void resume() {}
  
  public final void setJsExceptionHandler(d paramd) {}
  
  public final void setNativeBuffer(int paramInt, ByteBuffer paramByteBuffer) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/xweb/xwalk/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */