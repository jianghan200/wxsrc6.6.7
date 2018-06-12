package com.tencent.mm.plugin.appbrand.jsapi.storage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.plugin.appbrand.appstorage.c;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import java.util.ArrayList;

public class JsApiGetStorageInfoTask
  extends MainProcessTask
{
  public static final Parcelable.Creator<JsApiGetStorageInfoTask> CREATOR = new JsApiGetStorageInfoTask.1();
  public String appId;
  public Runnable fFC;
  public ArrayList<String> fZr;
  public int limit;
  public int size;
  
  public final void aai()
  {
    Object localObject = e.aaZ();
    if (localObject == null)
    {
      ahH();
      return;
    }
    localObject = ((c)localObject).rc(this.appId);
    this.fZr = ((ArrayList)localObject[0]);
    this.size = ((int)Math.ceil(((Integer)localObject[1]).doubleValue() / 1000.0D));
    this.limit = ((int)Math.ceil(((Integer)localObject[2]).doubleValue() / 1000.0D));
    ahH();
  }
  
  public final void aaj()
  {
    if (this.fFC != null) {
      this.fFC.run();
    }
  }
  
  public final void g(Parcel paramParcel)
  {
    this.appId = paramParcel.readString();
    this.fZr = paramParcel.createStringArrayList();
    this.size = paramParcel.readInt();
    this.limit = paramParcel.readInt();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.appId);
    paramParcel.writeStringList(this.fZr);
    paramParcel.writeInt(this.size);
    paramParcel.writeInt(this.limit);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/storage/JsApiGetStorageInfoTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */