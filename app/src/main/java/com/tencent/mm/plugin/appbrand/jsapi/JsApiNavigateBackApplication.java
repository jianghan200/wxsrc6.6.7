package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.opensdk.channel.MMessageActV2;
import com.tencent.mm.opensdk.channel.MMessageActV2.Args;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram.Resp;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import org.json.JSONObject;

public final class JsApiNavigateBackApplication
  extends a
{
  private static final int CTRL_INDEX = 288;
  private static final String NAME = "navigateBackApplication";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    Object localObject = paraml.fdO.fct.fqA;
    if ((bi.oW(((AppBrandLaunchReferrer)localObject).appId)) || (((AppBrandLaunchReferrer)localObject).fqE != 4))
    {
      paraml.E(paramInt, f("fail:not from opensdk", null));
      return;
    }
    paramJSONObject = paramJSONObject.optString("extraData");
    localObject = ((AppBrandLaunchReferrer)localObject).appId;
    if (paramJSONObject == null) {}
    for (paramJSONObject = "{}";; paramJSONObject = paramJSONObject.toString())
    {
      AppBrandMainProcessService.a(new NavigateBackAppTask((String)localObject, paramJSONObject));
      paraml.E(paramInt, f("ok", null));
      return;
    }
  }
  
  private static final class NavigateBackAppTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<NavigateBackAppTask> CREATOR = new JsApiNavigateBackApplication.NavigateBackAppTask.1();
    public String appId;
    public String data;
    
    public NavigateBackAppTask() {}
    
    public NavigateBackAppTask(String paramString1, String paramString2)
    {
      this.appId = paramString1;
      this.data = paramString2;
    }
    
    public final void aai()
    {
      f localf = com.tencent.mm.pluginsdk.model.app.g.bl(this.appId, true);
      if (localf == null) {
        return;
      }
      Bundle localBundle = new Bundle();
      WXLaunchMiniProgram.Resp localResp = new WXLaunchMiniProgram.Resp(localBundle);
      localResp.extMsg = this.data;
      localResp.openId = localf.field_openId;
      MMessageActV2.Args localArgs = new MMessageActV2.Args();
      localArgs.targetPkgName = localf.field_packageName;
      localResp.toBundle(localBundle);
      localArgs.bundle = localBundle;
      p.ae(localBundle);
      p.af(localBundle);
      MMessageActV2.send(ad.getContext(), localArgs);
    }
    
    public final void g(Parcel paramParcel)
    {
      this.appId = paramParcel.readString();
      this.data = paramParcel.readString();
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.data);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/JsApiNavigateBackApplication.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */