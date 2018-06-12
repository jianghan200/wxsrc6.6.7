package com.tencent.mm.plugin.appbrand.jsapi;

import android.animation.ObjectAnimator;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.n;
import com.tencent.mm.plugin.appbrand.widget.c;
import com.tencent.mm.plugin.appbrand.widget.c.5;
import org.json.JSONObject;

public final class bo
  extends a
{
  public static final int CTRL_INDEX = -2;
  public static final String NAME = "showTabBar";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    Object localObject = paraml.fdO.fcz.getCurrentPage();
    if (!(localObject instanceof com.tencent.mm.plugin.appbrand.page.e))
    {
      paraml.E(paramInt, f("fail:not TabBar page", null));
      return;
    }
    localObject = ((com.tencent.mm.plugin.appbrand.page.e)localObject).getTabBar();
    boolean bool = paramJSONObject.optBoolean("animation", true);
    int j = ((c)localObject).getHeight();
    int i;
    if ("top".equals(((c)localObject).gEi))
    {
      i = -1;
      paramJSONObject = ObjectAnimator.ofFloat(localObject, "translationY", new float[] { i * j, 0.0F });
      if (!bool) {
        break label151;
      }
    }
    label151:
    for (long l = 250L;; l = 0L)
    {
      paramJSONObject.setDuration(l);
      ((c)localObject).post(new c.5((c)localObject, paramJSONObject));
      paraml.E(paramInt, f("ok", null));
      return;
      i = 1;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */