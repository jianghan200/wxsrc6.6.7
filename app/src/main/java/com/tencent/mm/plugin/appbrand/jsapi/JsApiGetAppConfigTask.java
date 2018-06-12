package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Pair;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.plugin.appbrand.appcache.a.d.b;
import com.tencent.mm.plugin.appbrand.config.m;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;

class JsApiGetAppConfigTask
  extends MainProcessTask
{
  public static final Parcelable.Creator<JsApiGetAppConfigTask> CREATOR = new JsApiGetAppConfigTask.2();
  public String aAL;
  public String appId;
  public Runnable fFC;
  public int scene;
  public int type;
  public String value;
  
  public JsApiGetAppConfigTask() {}
  
  public JsApiGetAppConfigTask(Parcel paramParcel)
  {
    g(paramParcel);
  }
  
  public final void aai()
  {
    if (!g.Eg().dpD) {
      return;
    }
    Pair localPair = ((b)e.x(b.class)).w(this.appId, 4, this.scene);
    if (((Boolean)localPair.first).booleanValue())
    {
      int i = com.tencent.mm.plugin.appbrand.appcache.a.c.a.fiY;
      com.tencent.mm.plugin.appbrand.appcache.a.c.a.n(((Integer)localPair.second).intValue(), 166L);
    }
    if (!((Boolean)localPair.first).booleanValue()) {}
    for (boolean bool = true;; bool = false)
    {
      m.a(this.appId, this.type, 0, new JsApiGetAppConfigTask.1(this), bool);
      return;
    }
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
    this.aAL = paramParcel.readString();
    this.value = paramParcel.readString();
    this.type = paramParcel.readInt();
    this.scene = paramParcel.readInt();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.aAL);
    paramParcel.writeString(this.value);
    paramParcel.writeInt(this.type);
    paramParcel.writeInt(this.scene);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/JsApiGetAppConfigTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */