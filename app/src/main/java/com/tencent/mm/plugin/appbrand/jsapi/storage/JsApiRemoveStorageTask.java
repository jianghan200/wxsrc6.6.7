package com.tencent.mm.plugin.appbrand.jsapi.storage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.plugin.appbrand.appstorage.c;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;

public class JsApiRemoveStorageTask
  extends MainProcessTask
{
  public static final Parcelable.Creator<JsApiRemoveStorageTask> CREATOR = new JsApiRemoveStorageTask.1();
  public String aAL;
  public String appId;
  
  public final void aai()
  {
    c localc = e.aaZ();
    if (localc == null) {
      return;
    }
    localc.aU(this.appId, this.aAL);
  }
  
  public final void g(Parcel paramParcel)
  {
    this.appId = paramParcel.readString();
    this.aAL = paramParcel.readString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.aAL);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/storage/JsApiRemoveStorageTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */