package com.tencent.mm.plugin.appbrand.jsapi.i;

import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.base.ReportSubmitFormTask;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import java.util.Map;
import org.json.JSONObject;

public final class e
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 57;
  public static final String NAME = "requestPayment";
  
  public final void a(final c paramc, JSONObject paramJSONObject, final int paramInt)
  {
    if (paramJSONObject == null) {
      paramc.E(paramInt, f("fail", null));
    }
    Object localObject;
    do
    {
      return;
      MMActivity localMMActivity = paramc.getRuntime().fcq;
      if (localMMActivity == null)
      {
        paramc.E(paramInt, f("fail", null));
        return;
      }
      try
      {
        paramJSONObject.put("appId", paramc.getAppId());
        localObject = new PString();
        if (!a.fWH.a(localMMActivity, paramc.getRuntime().fcE, paramJSONObject, new b.a()
        {
          public final void a(int paramAnonymousInt, String paramAnonymousString, Map<String, Object> paramAnonymousMap)
          {
            switch (paramAnonymousInt)
            {
            default: 
              return;
            case 1: 
              paramc.E(paramInt, e.this.f("ok", null));
              return;
            case 2: 
              paramc.E(paramInt, e.this.f("fail:" + paramAnonymousString, null));
              return;
            }
            paramc.E(paramInt, e.this.f("cancel", null));
          }
        }, (PString)localObject))
        {
          paramc.E(paramInt, f("fail", null));
          return;
        }
      }
      catch (Exception paramJSONObject)
      {
        x.e("MicroMsg.JsApiRequestPayment", paramJSONObject.getMessage());
        paramc.E(paramInt, f("fail", null));
        return;
      }
    } while (!paramJSONObject.optBoolean("grantMessageQuota", true));
    if ((paramc instanceof p)) {}
    for (paramc = (p)paramc;; paramc = com.tencent.mm.plugin.appbrand.jsapi.a.d((l)paramc))
    {
      paramJSONObject = ((PString)localObject).value;
      if (paramc == null) {
        break;
      }
      localObject = new ReportSubmitFormTask(paramc.fdO.fcu);
      ((ReportSubmitFormTask)localObject).type = 0;
      ((ReportSubmitFormTask)localObject).fKK = paramJSONObject.replace("prepay_id=", "");
      ((ReportSubmitFormTask)localObject).bVs = paramc.getURL();
      AppBrandMainProcessService.a((MainProcessTask)localObject);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/i/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */