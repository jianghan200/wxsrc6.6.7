package com.tencent.mm.plugin.appbrand.jsapi.contact;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.kernel.g;
import com.tencent.mm.l.a;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.n.c;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;

public class JsApiChattingTask
  extends MainProcessTask
{
  public static final Parcelable.Creator<JsApiChattingTask> CREATOR = new JsApiChattingTask.2();
  public Runnable fFC;
  public String nickname;
  public String sessionFrom;
  public String username;
  
  public JsApiChattingTask() {}
  
  public JsApiChattingTask(Parcel paramParcel)
  {
    g(paramParcel);
  }
  
  public final void aai()
  {
    ab localab = ((i)g.l(i.class)).FR().Yg(this.username);
    x.d("MicroMsg.JsApiChattingTask", "sessionFrom:%s,username:%s,nickname:%s", new Object[] { this.sessionFrom, this.username, this.nickname });
    if ((localab == null) || ((int)localab.dhP == 0))
    {
      localab = new ab(this.username);
      localab.setType(0);
      localab.dx(this.nickname);
      ((i)g.l(i.class)).FR().T(localab);
      x.i("MicroMsg.JsApiChattingTask", "%s save to contact_table", new Object[] { this.username });
    }
    ((c)g.l(c.class)).b(this.username, new JsApiChattingTask.1(this));
  }
  
  public final void aaj()
  {
    if (this.fFC != null) {
      this.fFC.run();
    }
  }
  
  public final void g(Parcel paramParcel)
  {
    this.sessionFrom = paramParcel.readString();
    this.username = paramParcel.readString();
    this.nickname = paramParcel.readString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.sessionFrom);
    paramParcel.writeString(this.username);
    paramParcel.writeString(this.nickname);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/contact/JsApiChattingTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */