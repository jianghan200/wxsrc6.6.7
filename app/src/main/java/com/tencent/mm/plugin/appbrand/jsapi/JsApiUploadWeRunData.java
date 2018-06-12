package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.v;
import com.tencent.mm.model.bx;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.protocal.c.bwg;
import com.tencent.mm.protocal.c.bwh;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public class JsApiUploadWeRunData
  extends a
{
  public static final int CTRL_INDEX = 323;
  public static final String NAME = "uploadWeRunData";
  private UploadMiniAppStepTask fHn;
  
  public final void a(e parame, l paraml, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramInt2 <= 0)
    {
      paraml.E(paramInt1, parame.f("fail:step invalid", null));
      return;
    }
    this.fHn = new UploadMiniAppStepTask(parame, paraml, paramInt1, paramInt2, paramBoolean);
    this.fHn.ahA();
    AppBrandMainProcessService.a(this.fHn);
  }
  
  public void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    x.d("MicroMsg.JsApiUploadWeRunData", "JsApiUploadWeRunData!");
    if (paramJSONObject == null)
    {
      paraml.E(paramInt, f("fail:data is null", null));
      x.e("MicroMsg.JsApiUploadWeRunData", "data is null");
      return;
    }
    a(this, paraml, paramInt, paramJSONObject.optInt("step"), false);
  }
  
  private static class UploadMiniAppStepTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<UploadMiniAppStepTask> CREATOR = new JsApiUploadWeRunData.UploadMiniAppStepTask.2();
    private String appId;
    private boolean bKE;
    private e fFF;
    private l fFa;
    private int fFd;
    private int fHo;
    private boolean fHp;
    
    public UploadMiniAppStepTask(Parcel paramParcel)
    {
      g(paramParcel);
    }
    
    public UploadMiniAppStepTask(e parame, l paraml, int paramInt1, int paramInt2, boolean paramBoolean)
    {
      x.d("MicroMsg.JsApiUploadWeRunData", "UploadMiniAppStepTask");
      this.fFF = parame;
      this.fFa = paraml;
      this.fFd = paramInt1;
      this.fHo = paramInt2;
      this.fHp = paramBoolean;
      this.appId = paraml.mAppId;
    }
    
    public final void aai()
    {
      long l2 = bx.IR();
      x.d("MicroMsg.JsApiUploadWeRunData", "UploadMiniAppStepTask currentTime %d", new Object[] { Long.valueOf(l2 / 1000L) });
      long l1 = l2;
      if (l2 == 0L) {
        l1 = System.currentTimeMillis();
      }
      b.a locala = new b.a();
      bwg localbwg = new bwg();
      locala.dIG = localbwg;
      locala.dIH = new bwh();
      locala.uri = "/cgi-bin/mmoc-bin/hardware/uploadminiappstep";
      locala.dIF = 1949;
      locala.dII = 0;
      locala.dIJ = 0;
      localbwg.jQb = this.appId;
      localbwg.hcC = this.fHo;
      localbwg.ssB = this.fHp;
      localbwg.jRa = ((int)(l1 / 1000L));
      v.a(locala.KT(), new JsApiUploadWeRunData.UploadMiniAppStepTask.1(this), true);
    }
    
    public final void aaj()
    {
      if (this.bKE) {
        this.fFa.E(this.fFd, this.fFF.f("ok", null));
      }
      for (;;)
      {
        ahB();
        return;
        this.fFa.E(this.fFd, this.fFF.f("fail", null));
      }
    }
    
    public final void g(Parcel paramParcel)
    {
      boolean bool2 = true;
      this.fHo = paramParcel.readInt();
      if (paramParcel.readByte() != 0)
      {
        bool1 = true;
        this.fHp = bool1;
        if (paramParcel.readByte() == 0) {
          break label52;
        }
      }
      label52:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        this.bKE = bool1;
        this.appId = paramParcel.readString();
        return;
        bool1 = false;
        break;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      byte b2 = 1;
      paramParcel.writeInt(this.fHo);
      if (this.fHp)
      {
        b1 = 1;
        paramParcel.writeByte(b1);
        if (!this.bKE) {
          break label54;
        }
      }
      label54:
      for (byte b1 = b2;; b1 = 0)
      {
        paramParcel.writeByte(b1);
        paramParcel.writeString(this.appId);
        return;
        b1 = 0;
        break;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/JsApiUploadWeRunData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */