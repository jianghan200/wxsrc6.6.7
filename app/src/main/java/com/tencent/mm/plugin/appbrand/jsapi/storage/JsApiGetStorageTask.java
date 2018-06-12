package com.tencent.mm.plugin.appbrand.jsapi.storage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.plugin.appbrand.appstorage.c;
import com.tencent.mm.plugin.appbrand.appstorage.c.a;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.sdk.platformtools.x;

class JsApiGetStorageTask
  extends MainProcessTask
{
  public static final Parcelable.Creator<JsApiGetStorageTask> CREATOR = new JsApiGetStorageTask.1();
  public String aAL;
  public String appId;
  public Runnable fFC;
  private boolean fZs;
  private int fZt;
  private int fZu;
  private int fZv;
  public String type;
  public String value;
  
  public final void aai()
  {
    Object localObject1 = e.aaZ();
    if (localObject1 == null)
    {
      ahH();
      return;
    }
    Object localObject2 = ((c)localObject1).aT(this.appId, this.aAL);
    if ((c.a)localObject2[0] == c.a.fjM)
    {
      localObject1 = (String)localObject2[1];
      localObject2 = (String)localObject2[2];
      if (k.j(new String[] { localObject1, localObject2 }) <= 102400) {
        break label146;
      }
      this.fZu = k.j(new String[] { localObject1 });
      this.fZv = k.j(new String[] { localObject2 });
    }
    for (;;)
    {
      try
      {
        k.g(this.fEl, new String[] { localObject1, localObject2 });
        this.fZs = true;
        ahH();
        return;
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.JsApiGetStorageTask", localException.getMessage());
        continue;
      }
      label146:
      this.fZs = false;
      this.value = localException;
      this.type = ((String)localObject2);
    }
  }
  
  public final void aaj()
  {
    if (this.fZs) {}
    try
    {
      String str = k.ua(this.fEl);
      if (str.length() == this.fZu + this.fZv)
      {
        this.value = str.substring(0, this.fZu);
        this.type = str.substring(this.fZu, this.fZu + this.fZv);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.e("MicroMsg.JsApiGetStorageTask", localException.getMessage());
        k.ub(this.fEl);
      }
    }
    finally
    {
      k.ub(this.fEl);
    }
    if (this.fFC != null) {
      this.fFC.run();
    }
  }
  
  public final void g(Parcel paramParcel)
  {
    this.appId = paramParcel.readString();
    if (paramParcel.readByte() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.fZs = bool;
      this.fZt = paramParcel.readInt();
      this.fZu = paramParcel.readInt();
      this.fZv = paramParcel.readInt();
      this.aAL = paramParcel.readString();
      this.value = paramParcel.readString();
      this.type = paramParcel.readString();
      return;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.appId);
    if (this.fZs) {}
    for (byte b = 1;; b = 0)
    {
      paramParcel.writeByte(b);
      paramParcel.writeInt(this.fZt);
      paramParcel.writeInt(this.fZu);
      paramParcel.writeInt(this.fZv);
      paramParcel.writeString(this.aAL);
      paramParcel.writeString(this.value);
      paramParcel.writeString(this.type);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/storage/JsApiGetStorageTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */