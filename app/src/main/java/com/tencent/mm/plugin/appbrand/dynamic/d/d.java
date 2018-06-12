package com.tencent.mm.plugin.appbrand.dynamic.d;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.model.u.b;
import com.tencent.mm.plugin.appbrand.q.f;
import com.tencent.mm.sdk.platformtools.e;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.u.b.b.a;
import java.util.HashMap;
import org.json.JSONObject;

public final class d
  extends com.tencent.mm.plugin.appbrand.dynamic.d.a.a
{
  public d(int paramInt)
  {
    super("getSystemInfo", paramInt);
  }
  
  protected final void a(com.tencent.mm.u.c.a parama, JSONObject paramJSONObject, b.a<JSONObject> parama1)
  {
    paramJSONObject = parama.getContext();
    parama = parama.Da();
    DisplayMetrics localDisplayMetrics = paramJSONObject.getResources().getDisplayMetrics();
    float f = localDisplayMetrics.density;
    HashMap localHashMap = new HashMap();
    localHashMap.put("model", q.zE());
    localHashMap.put("pixelRatio", Float.valueOf(f));
    localHashMap.put("windowWidth", Integer.valueOf(f.lO(parama.getInt("__page_view_width", 0))));
    localHashMap.put("windowHeight", Integer.valueOf(f.lO(parama.getInt("__page_view_height", 0))));
    localHashMap.put("screenWidth", Integer.valueOf(f.lO(localDisplayMetrics.widthPixels)));
    localHashMap.put("screenHeight", Integer.valueOf(f.lO(localDisplayMetrics.heightPixels)));
    localHashMap.put("language", w.fD(paramJSONObject));
    localHashMap.put("version", e.aj(null, com.tencent.mm.protocal.d.qVN));
    localHashMap.put("system", "Android " + Build.VERSION.RELEASE);
    parama1.aA(a(true, "", localHashMap));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */