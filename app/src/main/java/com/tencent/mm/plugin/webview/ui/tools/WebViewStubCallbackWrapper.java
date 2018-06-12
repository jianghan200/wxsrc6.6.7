package com.tencent.mm.plugin.webview.ui.tools;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.plugin.webview.stub.e;
import com.tencent.mm.plugin.webview.stub.e.a;

public class WebViewStubCallbackWrapper
  implements Parcelable
{
  public static final Parcelable.Creator<WebViewStubCallbackWrapper> CREATOR = new WebViewStubCallbackWrapper.1();
  public int id;
  public e pXx;
  
  private WebViewStubCallbackWrapper(IBinder paramIBinder)
  {
    this.pXx = e.a.Z(paramIBinder);
  }
  
  public WebViewStubCallbackWrapper(e parame, int paramInt)
  {
    this.pXx = parame;
    this.id = paramInt;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof WebViewStubCallbackWrapper)) {}
    while (((WebViewStubCallbackWrapper)paramObject).id != this.id) {
      return false;
    }
    return true;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeStrongBinder(this.pXx.asBinder());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/WebViewStubCallbackWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */