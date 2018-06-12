package com.tencent.mm.plugin.webview.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class WebViewJSSDKVideoItem
  extends WebViewJSSDKFileItem
  implements Parcelable
{
  public static final Parcelable.Creator<WebViewJSSDKVideoItem> CREATOR = new WebViewJSSDKVideoItem.1();
  public int duration;
  public int height;
  public int size;
  public int width;
  
  public WebViewJSSDKVideoItem()
  {
    this.bMT = 4;
  }
  
  protected WebViewJSSDKVideoItem(Parcel paramParcel)
  {
    super(paramParcel);
    this.bMT = paramParcel.readInt();
    this.duration = paramParcel.readInt();
    this.size = paramParcel.readInt();
    this.width = paramParcel.readInt();
    this.height = paramParcel.readInt();
  }
  
  public final WebViewJSSDKFileItem bUh()
  {
    this.bNH = aj.Qt(this.fnM);
    return this;
  }
  
  public final String bUi()
  {
    return "mp4";
  }
  
  public final String bUj()
  {
    return "video";
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.bMT);
    paramParcel.writeInt(this.duration);
    paramParcel.writeInt(this.size);
    paramParcel.writeInt(this.width);
    paramParcel.writeInt(this.height);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/webview/model/WebViewJSSDKVideoItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */