package com.tencent.mm.plugin.appbrand.jsapi.n;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.page.t;
import com.tencent.mm.plugin.appbrand.page.t.5;
import com.tencent.mm.plugin.appbrand.q.f;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.math.BigDecimal;
import org.json.JSONObject;

public final class c
  extends a
{
  private static final int CTRL_INDEX = 413;
  public static final String NAME = "scrollWebviewTo";
  
  public final void a(final p paramp, JSONObject paramJSONObject, int paramInt)
  {
    final long l = paramJSONObject.optLong("duration", 300L);
    if (!paramJSONObject.has("scrollTop"))
    {
      paramp.E(paramInt, f("fail:invalid data", null));
      return;
    }
    try
    {
      final int i = Math.round(f.ae(new BigDecimal(paramJSONObject.getString("scrollTop")).floatValue()));
      ah.A(new Runnable()
      {
        public final void run()
        {
          t localt = paramp.gns;
          int i = i;
          long l = l;
          if (localt.goy != null)
          {
            localt.goy.cancel();
            localt.goy = null;
          }
          ValueAnimator localValueAnimator = ValueAnimator.ofInt(new int[] { localt.getView().getScrollY(), i });
          localValueAnimator.addUpdateListener(new t.5(localt));
          localValueAnimator.setInterpolator(new DecelerateInterpolator());
          localValueAnimator.setDuration(l);
          localValueAnimator.start();
          localt.goy = localValueAnimator;
          paramp.E(this.doP, c.this.f("ok", null));
        }
      });
      return;
    }
    catch (Exception paramJSONObject)
    {
      x.e("MicroMsg.AppBrand.Jsapi_scrollWebviewTo", "opt scrollTop, e = %s", new Object[] { paramJSONObject });
      paramp.E(paramInt, f("fail:invalid data " + bi.oV(paramJSONObject.getMessage()), null));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/n/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */