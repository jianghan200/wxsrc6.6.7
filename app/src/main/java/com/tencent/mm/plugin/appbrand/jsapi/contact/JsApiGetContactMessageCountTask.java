package com.tencent.mm.plugin.appbrand.jsapi.contact;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.g.c.am;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.az;

class JsApiGetContactMessageCountTask
  extends MainProcessTask
{
  public static final Parcelable.Creator<JsApiGetContactMessageCountTask> CREATOR = new JsApiGetContactMessageCountTask.1();
  public int bGz;
  public Runnable fFC;
  public String username;
  
  public JsApiGetContactMessageCountTask() {}
  
  public JsApiGetContactMessageCountTask(Parcel paramParcel)
  {
    g(paramParcel);
  }
  
  public final void aai()
  {
    ai localai = ((i)g.l(i.class)).FW().Yq(this.username);
    if (localai == null)
    {
      this.bGz = -1;
      ahH();
      return;
    }
    this.bGz = localai.field_unReadCount;
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
    this.username = paramParcel.readString();
    this.bGz = paramParcel.readInt();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.username);
    paramParcel.writeInt(this.bGz);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/contact/JsApiGetContactMessageCountTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */