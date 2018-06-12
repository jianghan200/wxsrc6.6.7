package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import org.json.JSONArray;
import org.json.JSONObject;

public final class at
  extends a
{
  public static final int CTRL_INDEX = 434;
  public static final String NAME = "openQRCode";
  private static volatile boolean fGq = false;
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    if (fGq)
    {
      paraml.E(paramInt, f("cancel", null));
      return;
    }
    fGq = true;
    x.i("MicroMsg.JsApiOpenQRCode", "openQRCode data::%s", new Object[] { paramJSONObject });
    MMActivity localMMActivity = c(paraml);
    if (localMMActivity == null)
    {
      fGq = false;
      x.e("MicroMsg.JsApiOpenQRCode", "pageContext is null, err");
      paraml.E(paramInt, f("fail:context is err", null));
      return;
    }
    paramJSONObject.optString("desc");
    int i3 = bi.getInt(paramJSONObject.optString("needResult"), 1);
    paramJSONObject = paramJSONObject.optString("scanType");
    int i;
    int j;
    int n;
    int i1;
    int k;
    int m;
    if (bi.oW(paramJSONObject))
    {
      i = 1;
      j = 1;
      n = i;
      i1 = j;
      if (paramJSONObject != null)
      {
        k = i;
        m = j;
      }
    }
    for (;;)
    {
      int i2;
      try
      {
        paramJSONObject = new JSONArray(paramJSONObject);
        i2 = 0;
        k = i;
        m = j;
        n = i;
        i1 = j;
        if (i2 < paramJSONObject.length())
        {
          k = i;
          m = j;
          String str = (String)paramJSONObject.get(i2);
          k = i;
          m = j;
          if (str.equalsIgnoreCase("qrCode"))
          {
            j = 1;
          }
          else
          {
            k = i;
            m = j;
            boolean bool = str.equalsIgnoreCase("barCode");
            if (bool) {
              i = 1;
            }
          }
        }
      }
      catch (Exception paramJSONObject)
      {
        x.e("MicroMsg.JsApiOpenQRCode", "doScanQRCode, ex in scanType");
        i1 = m;
        n = k;
      }
      if ((i1 != 0) && (n == 0)) {
        i = 8;
      }
      for (;;)
      {
        localMMActivity.geJ = new at.1(this, paraml, paramInt);
        if (i3 == 0)
        {
          x.i("MicroMsg.JsApiOpenQRCode", "doScanQRCode, startActivity");
          paramJSONObject = new Intent();
          paramJSONObject.putExtra("BaseScanUI_select_scan_mode", i);
          d.c(localMMActivity, "scanner", ".ui.SingleTopScanUI", paramJSONObject);
          fGq = false;
          paraml.E(paramInt, f("ok", null));
          return;
          if ((i1 == 0) && (n != 0)) {
            i = 4;
          }
        }
        else
        {
          if (i3 == 1)
          {
            x.d("MicroMsg.JsApiOpenQRCode", "doScanQRCode, startActivityForResult requestCode:%d", new Object[] { Integer.valueOf(hashCode()) });
            paraml = new Intent();
            paraml.putExtra("BaseScanUI_select_scan_mode", i);
            paraml.putExtra("BaseScanUI_only_scan_qrcode_with_zbar", true);
            paraml.putExtra("key_is_finish_on_scanned", true);
            paraml.putExtra("GetFriendQRCodeUI.INTENT_FROM_ACTIVITY", 3);
            d.a(localMMActivity, "scanner", ".ui.SingleTopScanUI", paraml, hashCode() & 0xFFFF, false);
            return;
          }
          x.e("MicroMsg.JsApiOpenQRCode", "needResult is err");
          paraml.E(paramInt, f("fail:invalid data", null));
          return;
        }
        i = 1;
      }
      break label482;
      i = 0;
      j = 0;
      break;
      label482:
      i2 += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */