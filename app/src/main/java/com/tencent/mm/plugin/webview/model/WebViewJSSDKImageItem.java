package com.tencent.mm.plugin.webview.model;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;

public class WebViewJSSDKImageItem
  extends WebViewJSSDKFileItem
  implements Parcelable
{
  public static final Parcelable.Creator<WebViewJSSDKImageItem> CREATOR = new WebViewJSSDKImageItem.1();
  
  public WebViewJSSDKImageItem()
  {
    this.bMT = 1;
  }
  
  protected WebViewJSSDKImageItem(Parcel paramParcel)
  {
    super(paramParcel);
  }
  
  public final WebViewJSSDKFileItem bUh()
  {
    this.bNH = aj.Qt(this.fnM);
    bUl();
    return this;
  }
  
  public final String bUi()
  {
    return "jpeg";
  }
  
  public final String bUj()
  {
    return "image";
  }
  
  public final void bUl()
  {
    if (!new File(this.fnM).exists())
    {
      x.i("MicroMsg.WebViewJSSDkImageItem", "Original file not existed");
      return;
    }
    this.fOs = aj.Qr(System.currentTimeMillis());
    Bitmap localBitmap = c.a(this.fnM, 640, 640, false, null, 0);
    if (localBitmap != null)
    {
      x.i("MicroMsg.WebViewJSSDkImageItem", "extract thumbnail bitmap");
      localBitmap = c.b(localBitmap, BackwardSupportUtil.ExifHelper.VX(this.fnM));
      if (localBitmap == null) {}
    }
    try
    {
      c.a(localBitmap, 100, Bitmap.CompressFormat.JPEG, this.fOs, true);
      x.i("MicroMsg.WebViewJSSDkImageItem", "Thumb Path: %s", new Object[] { this.fOs });
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.e("MicroMsg.WebViewJSSDkImageItem", "save bitmap to file failed : %s", new Object[] { localException.getMessage() });
      }
    }
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/webview/model/WebViewJSSDKImageItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */