package com.tencent.smtt.sdk;

import android.graphics.Bitmap;
import com.tencent.smtt.export.external.interfaces.IX5WebHistoryItem;

public class WebHistoryItem
{
  private IX5WebHistoryItem a = null;
  private android.webkit.WebHistoryItem b = null;
  
  static WebHistoryItem a(android.webkit.WebHistoryItem paramWebHistoryItem)
  {
    if (paramWebHistoryItem == null) {
      return null;
    }
    WebHistoryItem localWebHistoryItem = new WebHistoryItem();
    localWebHistoryItem.b = paramWebHistoryItem;
    return localWebHistoryItem;
  }
  
  static WebHistoryItem a(IX5WebHistoryItem paramIX5WebHistoryItem)
  {
    if (paramIX5WebHistoryItem == null) {
      return null;
    }
    WebHistoryItem localWebHistoryItem = new WebHistoryItem();
    localWebHistoryItem.a = paramIX5WebHistoryItem;
    return localWebHistoryItem;
  }
  
  public Bitmap getFavicon()
  {
    if (this.a != null) {
      return this.a.getFavicon();
    }
    return this.b.getFavicon();
  }
  
  public String getOriginalUrl()
  {
    if (this.a != null) {
      return this.a.getOriginalUrl();
    }
    return this.b.getOriginalUrl();
  }
  
  public String getTitle()
  {
    if (this.a != null) {
      return this.a.getTitle();
    }
    return this.b.getTitle();
  }
  
  public String getUrl()
  {
    if (this.a != null) {
      return this.a.getUrl();
    }
    return this.b.getUrl();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/smtt/sdk/WebHistoryItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */