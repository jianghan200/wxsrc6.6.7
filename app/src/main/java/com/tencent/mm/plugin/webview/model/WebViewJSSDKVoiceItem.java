package com.tencent.mm.plugin.webview.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.modelvoice.q;

public class WebViewJSSDKVoiceItem
  extends WebViewJSSDKFileItem
{
  public static final Parcelable.Creator<WebViewJSSDKVoiceItem> CREATOR = new Parcelable.Creator() {};
  
  public WebViewJSSDKVoiceItem()
  {
    this.bMT = 2;
  }
  
  protected WebViewJSSDKVoiceItem(Parcel paramParcel)
  {
    super(paramParcel);
  }
  
  public final WebViewJSSDKFileItem bUh()
  {
    this.fnM = q.getFullPath(this.fileName);
    this.bNH = aj.Qt(this.fnM);
    return this;
  }
  
  public final String bUi()
  {
    return "speex";
  }
  
  public final String bUj()
  {
    return "voice";
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/webview/model/WebViewJSSDKVoiceItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */