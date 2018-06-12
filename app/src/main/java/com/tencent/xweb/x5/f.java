package com.tencent.xweb.x5;

import android.content.Context;
import android.webkit.ValueCallback;
import com.tencent.smtt.sdk.QbSdk;
import com.tencent.smtt.sdk.X5JsCore;
import com.tencent.xweb.c.g;
import com.tencent.xweb.d;
import java.net.URL;
import java.nio.ByteBuffer;
import org.xwalk.core.Log;

public final class f
  implements g
{
  private Context mContext;
  private X5JsCore vDy;
  
  public f(Context paramContext)
  {
    this.mContext = paramContext;
    Log.i("MicroMsg.X5JsRuntime", "create X5V8JsRuntime");
  }
  
  public final boolean CY()
  {
    return (X5JsCore.canUseX5JsCore(this.mContext)) && (QbSdk.getTbsVersion(this.mContext) >= 43600);
  }
  
  public final void addJavascriptInterface(Object paramObject, String paramString)
  {
    this.vDy.addJavascriptInterface(paramObject, paramString);
  }
  
  public final boolean cIG()
  {
    return X5JsCore.canX5JsCoreUseNativeBuffer(this.mContext);
  }
  
  public final void cleanup()
  {
    this.vDy.destroy();
  }
  
  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback)
  {
    this.vDy.evaluateJavascript(paramString, new a.d(paramValueCallback));
  }
  
  public final void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback, URL paramURL)
  {
    this.vDy.evaluateJavascript(paramString, new a.d(paramValueCallback));
  }
  
  public final ByteBuffer getNativeBuffer(int paramInt)
  {
    return this.vDy.getNativeBuffer(paramInt);
  }
  
  public final int getNativeBufferId()
  {
    return this.vDy.getNativeBufferId();
  }
  
  public final void init(int paramInt)
  {
    this.vDy = new X5JsCore(this.mContext);
  }
  
  public final void pause()
  {
    this.vDy.pause();
  }
  
  public final void resume()
  {
    this.vDy.resume();
  }
  
  public final void setJsExceptionHandler(d paramd) {}
  
  public final void setNativeBuffer(int paramInt, ByteBuffer paramByteBuffer)
  {
    this.vDy.setNativeBuffer(paramInt, paramByteBuffer);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/xweb/x5/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */