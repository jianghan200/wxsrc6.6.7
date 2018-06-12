package com.tencent.xweb.c;

import android.webkit.ValueCallback;
import com.tencent.xweb.d;
import java.net.URL;
import java.nio.ByteBuffer;

public abstract interface g
{
  public abstract boolean CY();
  
  public abstract void addJavascriptInterface(Object paramObject, String paramString);
  
  public abstract boolean cIG();
  
  public abstract void cleanup();
  
  public abstract void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback);
  
  public abstract void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback, URL paramURL);
  
  public abstract ByteBuffer getNativeBuffer(int paramInt);
  
  public abstract int getNativeBufferId();
  
  public abstract void init(int paramInt);
  
  public abstract void pause();
  
  public abstract void resume();
  
  public abstract void setJsExceptionHandler(d paramd);
  
  public abstract void setNativeBuffer(int paramInt, ByteBuffer paramByteBuffer);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/xweb/c/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */