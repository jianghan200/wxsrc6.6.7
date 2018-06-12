package com.tencent.mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.game.m;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.q.f;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.e;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.s;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class ag
  extends n
{
  public static final int CTRL_INDEX = 40;
  public static final String NAME = "getSystemInfo";
  private float fFS = -1.0F;
  
  private static View e(l paraml)
  {
    paraml = d(paraml);
    if (paraml == null) {
      return null;
    }
    return paraml.aha();
  }
  
  public final String a(l paraml, JSONObject paramJSONObject)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("brand", Build.BRAND);
    localHashMap.put("model", Build.MODEL);
    localHashMap.put("pixelRatio", Float.valueOf(paraml.getContext().getResources().getDisplayMetrics().density));
    if (e(paraml) != null)
    {
      x.i("MicroMsg.JsApiGetSystemInfo", "Method: normal");
      paramJSONObject = new int[2];
      paramJSONObject[0] = e(paraml).getWidth();
      paramJSONObject[1] = e(paraml).getHeight();
      localHashMap.put("windowWidth", Integer.valueOf(f.lO(paramJSONObject[0])));
      localHashMap.put("windowHeight", Integer.valueOf(f.lO(paramJSONObject[1])));
      if ((paraml.fdO == null) || (!paraml.fdO.aaq())) {
        break label490;
      }
      paramJSONObject = new Point();
      m.fAw.d(paramJSONObject);
      localHashMap.put("screenWidth", Integer.valueOf(f.lO(paramJSONObject.x)));
      localHashMap.put("screenHeight", Integer.valueOf(f.lO(paramJSONObject.y)));
      label195:
      int j = com.tencent.mm.ui.statusbar.a.aa(paraml.getContext());
      int i = j;
      if (j == 0) {
        i = s.gJ(paraml.getContext());
      }
      localHashMap.put("statusBarHeight", Integer.valueOf(f.lO(i)));
      localHashMap.put("language", w.fD(paraml.getContext()));
      localHashMap.put("version", e.aj(null, d.qVN));
      localHashMap.put("system", "Android " + Build.VERSION.RELEASE);
      localHashMap.put("benchmarkLevel", Integer.valueOf(paraml.fdO.fcu.frl));
      if (this.fFS == -1.0F) {
        break label547;
      }
      localHashMap.put("fontSizeSetting", Integer.valueOf((int)(this.fFS * 16.0F)));
    }
    for (;;)
    {
      return f("ok", localHashMap);
      if ((paraml.getContext() instanceof Activity))
      {
        x.i("MicroMsg.JsApiGetSystemInfo", "Method: DecorView");
        paramJSONObject = paraml.getContext().getWindow().getDecorView();
        Rect localRect = new Rect();
        paramJSONObject.getWindowVisibleDisplayFrame(localRect);
        paramJSONObject = new int[2];
        paramJSONObject[0] = (localRect.right - localRect.left);
        paramJSONObject[1] = (localRect.bottom - localRect.top - com.tencent.mm.bp.a.fromDPToPix(paraml.getContext(), 48));
        break;
      }
      x.i("MicroMsg.JsApiGetSystemInfo", "Method: Screen");
      paramJSONObject = new int[2];
      paramJSONObject[0] = paraml.getContext().getResources().getDisplayMetrics().widthPixels;
      paramJSONObject[1] = paraml.getContext().getResources().getDisplayMetrics().heightPixels;
      break;
      label490:
      localHashMap.put("screenWidth", Integer.valueOf(f.lO(paraml.getContext().getResources().getDisplayMetrics().widthPixels)));
      localHashMap.put("screenHeight", Integer.valueOf(f.lO(paraml.getContext().getResources().getDisplayMetrics().heightPixels)));
      break label195;
      label547:
      float f = MultiProcessSharedPreferences.getSharedPreferences(paraml.getContext(), ad.chY(), 0).getFloat("text_size_scale_key", 1.0F);
      localHashMap.put("fontSizeSetting", Integer.valueOf((int)(f * 16.0F)));
      this.fFS = f;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */