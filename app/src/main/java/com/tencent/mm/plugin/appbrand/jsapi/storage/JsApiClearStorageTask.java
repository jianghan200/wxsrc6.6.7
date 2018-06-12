package com.tencent.mm.plugin.appbrand.jsapi.storage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.plugin.appbrand.appstorage.c;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;

class JsApiClearStorageTask
  extends MainProcessTask
{
  public static final Parcelable.Creator<JsApiClearStorageTask> CREATOR = new JsApiClearStorageTask.1();
  public String appId;
  
  public JsApiClearStorageTask() {}
  
  public JsApiClearStorageTask(Parcel paramParcel)
  {
    g(paramParcel);
  }
  
  public final void aai()
  {
    c localc = e.aaZ();
    if (localc == null) {
      return;
    }
    localc.clear(this.appId);
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/storage/JsApiClearStorageTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */