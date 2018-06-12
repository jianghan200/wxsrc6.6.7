package com.tencent.xweb;

import android.net.Uri;
import java.util.Map;

public abstract interface l
{
  public abstract String getMethod();
  
  public abstract Map<String, String> getRequestHeaders();
  
  public abstract Uri getUrl();
  
  public abstract boolean hasGesture();
  
  public abstract boolean isForMainFrame();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/xweb/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */