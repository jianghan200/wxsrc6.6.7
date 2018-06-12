package com.tencent.mm.plugin.webview.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class WebViewJSSDKUpFileItem
  extends WebViewJSSDKFileItem
{
  public static final Parcelable.Creator<WebViewJSSDKUpFileItem> CREATOR = new WebViewJSSDKUpFileItem.1();
  public int fileType = -1;
  public String jIf;
  
  public WebViewJSSDKUpFileItem()
  {
    this.bMT = 3;
  }
  
  private WebViewJSSDKUpFileItem(byte paramByte) {}
  
  public final WebViewJSSDKFileItem bUh()
  {
    this.bNH = aj.Qt(this.fnM);
    return this;
  }
  
  public final String bUi()
  {
    return "file";
  }
  
  public final String bUj()
  {
    return "nomal";
  }
  
  public final void c(keep_SceneResult paramkeep_SceneResult)
  {
    super.c(paramkeep_SceneResult);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(this.fileType);
    localArrayList.add(this.jIf);
    localArrayList.add(paramkeep_SceneResult.field_fileId);
    localArrayList.add(paramkeep_SceneResult.field_aesKey);
    localArrayList.add(paramkeep_SceneResult.field_fileLength);
    Context localContext = ad.getContext();
    if (ao.isWifi(localContext)) {
      localArrayList.add("1");
    }
    for (;;)
    {
      x.d("MicroMsg.WebViewJSSDKVoiceItem", "fileType=%d, initUrl=%s, field_fileId=%s", new Object[] { Integer.valueOf(this.fileType), this.jIf, paramkeep_SceneResult.field_fileId });
      paramkeep_SceneResult = h.mEJ;
      h.e(12018, localArrayList);
      paramkeep_SceneResult = this.fnM;
      if (!bi.oW(paramkeep_SceneResult))
      {
        paramkeep_SceneResult = new File(paramkeep_SceneResult);
        if (paramkeep_SceneResult.exists()) {
          paramkeep_SceneResult.delete();
        }
      }
      return;
      if (ao.is3G(localContext)) {
        localArrayList.add("4");
      } else if (ao.is4G(localContext)) {
        localArrayList.add("5");
      } else if (ao.is2G(localContext)) {
        localArrayList.add("3");
      } else if (ao.isWap(localContext)) {
        localArrayList.add("2");
      } else {
        localArrayList.add("0");
      }
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/webview/model/WebViewJSSDKUpFileItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */