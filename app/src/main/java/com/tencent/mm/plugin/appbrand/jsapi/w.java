package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class w
  extends a
{
  public static final int CTRL_INDEX = 286;
  public static final String NAME = "chooseInvoiceTitle";
  
  public final void a(final l paraml, JSONObject paramJSONObject, final int paramInt)
  {
    paramJSONObject = new Intent();
    paramJSONObject.putExtra("req_scene", 0);
    paramJSONObject.putExtra("launch_from_appbrand", true);
    MMActivity localMMActivity = c(paraml);
    if (localMMActivity == null)
    {
      paraml.E(paramInt, f("fail", null));
      return;
    }
    localMMActivity.geJ = new MMActivity.a()
    {
      public final void b(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
      {
        if (paramAnonymousInt1 != (w.this.hashCode() & 0xFFFF)) {
          return;
        }
        if ((paramAnonymousInt2 == -1) && (paramAnonymousIntent != null))
        {
          HashMap localHashMap = new HashMap();
          paramAnonymousIntent = bi.aG(paramAnonymousIntent.getStringExtra("choose_invoice_title_info"), "");
          x.i("MicroMsg.JsApiChooseInvoiceTitle", "choose_invoice_title_info is : " + paramAnonymousIntent);
          localHashMap.put("invoiceTitleInfo", paramAnonymousIntent);
          paraml.E(paramInt, w.this.f("ok", localHashMap));
          return;
        }
        if (paramAnonymousInt2 == 0)
        {
          paraml.E(paramInt, w.this.f("cancel", null));
          return;
        }
        paraml.E(paramInt, w.this.f("fail", null));
      }
    };
    d.a(localMMActivity, "address", ".ui.InvoiceListUI", paramJSONObject, hashCode() & 0xFFFF, false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */