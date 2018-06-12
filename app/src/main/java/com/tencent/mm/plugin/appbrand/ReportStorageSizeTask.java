package com.tencent.mm.plugin.appbrand;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.mm.plugin.appbrand.appstorage.c;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.report.service.h;

public class ReportStorageSizeTask
  extends MainProcessTask
{
  public static final Parcelable.Creator<ReportStorageSizeTask> CREATOR = new ReportStorageSizeTask.1();
  public String appId;
  
  public final void aai()
  {
    c localc = e.aaZ();
    if (localc == null) {
      return;
    }
    h.mEJ.h(14073, new Object[] { this.appId, "", "", localc.rc(this.appId)[1], Long.valueOf(AppBrandLocalMediaObjectManager.getTmpFilesOccupation(this.appId)), Long.valueOf(AppBrandLocalMediaObjectManager.getStoredFilesOccupation(this.appId)) });
  }
  
  public final void g(Parcel paramParcel)
  {
    this.appId = paramParcel.readString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.appId);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ReportStorageSizeTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */