package com.tencent.mm.plugin.appbrand.jsapi.storage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.plugin.appbrand.appstorage.c;
import com.tencent.mm.plugin.appbrand.appstorage.c.a;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.sdk.platformtools.x;

class JsApiSetStorageTask
  extends MainProcessTask
{
  public static final Parcelable.Creator<JsApiSetStorageTask> CREATOR = new JsApiSetStorageTask.1();
  private String aAL;
  public String appId;
  public Runnable fFC;
  private boolean fZs;
  private int fZt;
  private int fZu;
  private int fZv;
  public String result;
  private String type;
  private String value;
  
  private void ajD()
  {
    this.aAL = null;
    this.value = null;
    this.type = null;
  }
  
  public final void E(String paramString1, String paramString2, String paramString3)
  {
    if (k.j(new String[] { paramString1, paramString2, paramString3 }) > 102400)
    {
      this.fZt = k.j(new String[] { paramString1 });
      this.fZu = k.j(new String[] { paramString2 });
      this.fZv = k.j(new String[] { paramString3 });
      try
      {
        k.g(this.fEl, new String[] { paramString1, paramString2, paramString3 });
        this.fZs = true;
        return;
      }
      catch (Exception paramString1)
      {
        for (;;)
        {
          x.e("MicroMsg.JsApiSetStorageTask", paramString1.getMessage());
        }
      }
    }
    this.fZs = false;
    this.aAL = paramString1;
    this.value = paramString2;
    this.type = paramString3;
  }
  
  public final void aai()
  {
    if (this.fZs) {}
    try
    {
      localObject1 = k.ua(this.fEl);
      if (((String)localObject1).length() == this.fZt + this.fZu + this.fZv)
      {
        this.aAL = ((String)localObject1).substring(0, this.fZt);
        this.value = ((String)localObject1).substring(this.fZt, this.fZt + this.fZu);
        this.type = ((String)localObject1).substring(this.fZt + this.fZu, this.fZt + this.fZu + this.fZv);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        x.e("MicroMsg.JsApiSetStorageTask", localException.getMessage());
        k.ub(this.fEl);
      }
    }
    finally
    {
      k.ub(this.fEl);
    }
    localObject1 = e.aaZ();
    if (localObject1 == null)
    {
      this.result = "fail";
      ajD();
      ahH();
      return;
    }
    c.a locala = ((c)localObject2).f(this.appId, this.aAL, this.value, this.type);
    if (locala == c.a.fjM) {
      this.result = "ok";
    }
    for (;;)
    {
      ajD();
      ahH();
      return;
      if (locala == c.a.fjQ) {
        this.result = "fail:quota reached";
      } else {
        this.result = "fail";
      }
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
      this.result = paramParcel.readString();
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
      paramParcel.writeString(this.result);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/storage/JsApiSetStorageTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */