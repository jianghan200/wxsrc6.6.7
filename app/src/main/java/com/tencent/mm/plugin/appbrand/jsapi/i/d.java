package com.tencent.mm.plugin.appbrand.jsapi.i;

import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.base.ReportSubmitFormTask;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import org.json.JSONObject;

public final class d
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 431;
  public static final String NAME = "requestMallPayment";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    if (paramJSONObject == null) {
      paraml.E(paramInt, f("fail", null));
    }
    do
    {
      return;
      MMActivity localMMActivity = c(paraml);
      if (localMMActivity == null)
      {
        paraml.E(paramInt, f("fail", null));
        return;
      }
      try
      {
        paramJSONObject.put("appId", paraml.mAppId);
        paramJSONObject.put("pay_for_wallet_type", 3);
        localObject = new PString();
        if (!a.fWH.a(localMMActivity, paraml.fdO.fcE, paramJSONObject, new d.1(this, paraml, paramInt), (PString)localObject))
        {
          paraml.E(paramInt, f("fail", null));
          return;
        }
      }
      catch (Exception paramJSONObject)
      {
        x.e("MicroMsg.JsApiRequestMallPayment", paramJSONObject.getMessage());
        paraml.E(paramInt, f("fail", null));
        return;
      }
      paraml = d(paraml);
      paramJSONObject = ((PString)localObject).value;
    } while (paraml == null);
    Object localObject = new ReportSubmitFormTask(paraml.fdO.fcu);
    ((ReportSubmitFormTask)localObject).type = 0;
    ((ReportSubmitFormTask)localObject).fKK = paramJSONObject.replace("prepay_id=", "");
    ((ReportSubmitFormTask)localObject).bVs = paraml.getURL();
    AppBrandMainProcessService.a((MainProcessTask)localObject);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/i/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */