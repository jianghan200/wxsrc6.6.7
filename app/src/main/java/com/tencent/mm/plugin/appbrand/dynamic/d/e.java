package com.tencent.mm.plugin.appbrand.dynamic.d;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.model.u.b;
import com.tencent.mm.plugin.appbrand.dynamic.d.a.b;
import com.tencent.mm.plugin.appbrand.q.f;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.u.c.a;
import java.util.HashMap;
import org.json.JSONObject;

public final class e
  extends b
{
  public e(int paramInt)
  {
    super("getSystemInfoSync", paramInt);
  }
  
  protected final JSONObject a(a parama)
  {
    Context localContext = parama.getContext();
    parama = parama.Da();
    DisplayMetrics localDisplayMetrics = localContext.getResources().getDisplayMetrics();
    float f = localDisplayMetrics.density;
    HashMap localHashMap = new HashMap();
    localHashMap.put("model", q.zE());
    localHashMap.put("pixelRatio", Float.valueOf(f));
    localHashMap.put("windowWidth", Integer.valueOf(f.lO(parama.getInt("__page_view_width", 0))));
    localHashMap.put("windowHeight", Integer.valueOf(f.lO(parama.getInt("__page_view_height", 0))));
    localHashMap.put("screenWidth", Integer.valueOf(f.lO(localDisplayMetrics.widthPixels)));
    localHashMap.put("screenHeight", Integer.valueOf(f.lO(localDisplayMetrics.heightPixels)));
    localHashMap.put("language", w.fD(localContext));
    localHashMap.put("version", com.tencent.mm.sdk.platformtools.e.aj(null, d.qVN));
    localHashMap.put("system", "Android " + Build.VERSION.RELEASE);
    return new JSONObject(localHashMap);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/d/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */