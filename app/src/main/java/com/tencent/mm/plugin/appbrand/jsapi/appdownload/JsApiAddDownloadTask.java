package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.g.a.gt;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.plugin.downloader.model.e.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class JsApiAddDownloadTask
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 474;
  public static final String NAME = "addDownloadTask";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    AppBrandMainProcessService.a(new AddDownloadTask(this, paraml, paramInt, paramJSONObject));
    b.f(paraml);
  }
  
  private static class AddDownloadTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<AddDownloadTask> CREATOR = new JsApiAddDownloadTask.AddDownloadTask.1();
    private com.tencent.mm.plugin.appbrand.jsapi.e fFu;
    private int fFw;
    private long fGL;
    private boolean fGM;
    private boolean fGN;
    private String fGO;
    private String fHA;
    private String fHB;
    private boolean fHC;
    private int fHD;
    private String fHw;
    private String fHx;
    private String fHy;
    private long fHz;
    private l fcy;
    private String mAppId;
    private String mPackageName;
    
    public AddDownloadTask(Parcel paramParcel)
    {
      g(paramParcel);
    }
    
    public AddDownloadTask(com.tencent.mm.plugin.appbrand.jsapi.e parame, l paraml, int paramInt, JSONObject paramJSONObject)
    {
      ahA();
      this.fFu = parame;
      this.fcy = paraml;
      this.fFw = paramInt;
      this.fHw = paramJSONObject.optString("taskName");
      this.fHx = paramJSONObject.optString("taskUrl");
      this.fHy = paramJSONObject.optString("fileMd5");
      this.fHz = paramJSONObject.optInt("taskSize", 0);
      this.fHA = paramJSONObject.optString("extInfo");
      this.fHB = paramJSONObject.optString("fileType");
      this.mAppId = paramJSONObject.optString("appId");
      this.mPackageName = paramJSONObject.optString("packageName");
      this.fGM = paramJSONObject.optBoolean("downloadInWifi", false);
      this.fHC = paramJSONObject.optBoolean("showNotification", false);
      this.fHD = paramJSONObject.optInt("downloaderType", 0);
      this.fGN = true;
    }
    
    public final void aai()
    {
      g.Ek();
      if (!g.Ei().isSDCardAvailable()) {
        this.fGO = "fail_sdcard_not_ready";
      }
      for (;;)
      {
        ahH();
        return;
        if ((this.fHz > 0L) && (!f.aM(this.fHz)))
        {
          this.fGO = "fail_sdcard_has_not_enough_space";
        }
        else if (bi.oW(this.fHx))
        {
          this.fGO = "fail_invalid_url";
        }
        else
        {
          x.i("MicroMsg.JsApiAddDownloadTask", "runInMainProcess taskUrl:%s md5:%s", new Object[] { this.fHx, this.fHy });
          Object localObject = new e.a();
          ((e.a)localObject).yQ(this.fHx);
          ((e.a)localObject).cx(this.fHz);
          ((e.a)localObject).yS(this.fHw);
          ((e.a)localObject).yT(this.fHy);
          ((e.a)localObject).setAppId(this.mAppId);
          ((e.a)localObject).cQ(this.mPackageName);
          ((e.a)localObject).ef(true);
          ((e.a)localObject).ox(bi.getInt(this.fHB, 1));
          ((e.a)localObject).setScene(6001);
          ((e.a)localObject).yU(this.fHA);
          ((e.a)localObject).eg(this.fHC);
          boolean bool = this.fGM;
          ((e.a)localObject).ick.fGM = bool;
          ((e.a)localObject).ef(false);
          ((e.a)localObject).ick.icj = true;
          localObject = ((e.a)localObject).ick;
          if (this.fHD == 1) {}
          for (long l = d.aCU().b((com.tencent.mm.plugin.downloader.model.e)localObject);; l = d.aCU().a((com.tencent.mm.plugin.downloader.model.e)localObject))
          {
            x.i("MicroMsg.JsApiAddDownloadTask", "doAddDownloadTaskStraight, downloadId = " + l);
            if (l > 0L) {
              break label328;
            }
            x.e("MicroMsg.JsApiAddDownloadTask", "doAddDownloadTaskStraight fail, downloadId = " + l);
            this.fGO = "";
            break;
          }
          label328:
          this.fGN = false;
          this.fGL = l;
          if (this.fGM)
          {
            localObject = new gt();
            ((gt)localObject).bPU.opType = 10;
            ((gt)localObject).bPU.bGm = l;
            com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
          }
        }
      }
    }
    
    public final void aaj()
    {
      ahB();
      if (this.fGN)
      {
        if (bi.oW(this.fGO)) {}
        for (localObject = "fail";; localObject = String.format("fail:%s", new Object[] { this.fGO }))
        {
          this.fcy.E(this.fFw, this.fFu.f((String)localObject, null));
          return;
        }
      }
      Object localObject = new HashMap();
      ((Map)localObject).put("downloadId", Long.valueOf(this.fGL));
      this.fcy.E(this.fFw, this.fFu.f("ok", (Map)localObject));
    }
    
    public final void g(Parcel paramParcel)
    {
      boolean bool2 = true;
      this.fHw = paramParcel.readString();
      this.fHx = paramParcel.readString();
      this.fHy = paramParcel.readString();
      this.fHz = paramParcel.readLong();
      this.fHA = paramParcel.readString();
      this.fHB = paramParcel.readString();
      this.mAppId = paramParcel.readString();
      this.mPackageName = paramParcel.readString();
      if (paramParcel.readByte() == 1)
      {
        bool1 = true;
        this.fGM = bool1;
        if (paramParcel.readByte() != 1) {
          break label141;
        }
        bool1 = true;
        label91:
        this.fHC = bool1;
        this.fHD = paramParcel.readInt();
        if (paramParcel.readInt() != 1) {
          break label146;
        }
      }
      label141:
      label146:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        this.fGN = bool1;
        this.fGO = paramParcel.readString();
        this.fGL = paramParcel.readLong();
        return;
        bool1 = false;
        break;
        bool1 = false;
        break label91;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramInt = 1;
      paramParcel.writeString(this.fHw);
      paramParcel.writeString(this.fHx);
      paramParcel.writeString(this.fHy);
      paramParcel.writeLong(this.fHz);
      paramParcel.writeString(this.fHA);
      paramParcel.writeString(this.fHB);
      paramParcel.writeString(this.mAppId);
      paramParcel.writeString(this.mPackageName);
      byte b;
      if (this.fGM)
      {
        b = 1;
        paramParcel.writeByte(b);
        if (!this.fHC) {
          break label136;
        }
        b = 1;
        label89:
        paramParcel.writeByte(b);
        paramParcel.writeInt(this.fHD);
        if (!this.fGN) {
          break label141;
        }
      }
      for (;;)
      {
        paramParcel.writeInt(paramInt);
        paramParcel.writeString(this.fGO);
        paramParcel.writeLong(this.fGL);
        return;
        b = 0;
        break;
        label136:
        b = 0;
        break label89;
        label141:
        paramInt = 0;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/appdownload/JsApiAddDownloadTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */