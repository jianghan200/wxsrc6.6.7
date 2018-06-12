package com.tencent.mm.plugin.appbrand.jsapi;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.ui.j;
import com.tencent.mm.plugin.appbrand.widget.actionbar.c;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class bh
  extends a
{
  public static final int CTRL_INDEX = 198;
  public static final String NAME = "setNavigationBarColor";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    try
    {
      l = j.vF(paramJSONObject.getString("frontColor"));
      if (l == -1L) {
        throw new Exception();
      }
    }
    catch (Exception paramJSONObject)
    {
      x.e("MicroMsg.JsApiSetNavigationBarColor", "Color parse error");
      paraml.E(paramInt, f("fail", null));
      return;
    }
    int j = (int)l;
    long l = j.vF(paramJSONObject.getString("backgroundColor"));
    if (l == -1L) {
      throw new Exception();
    }
    int k = (int)l;
    double d1 = paramJSONObject.optDouble("alpha", 1.0D);
    int i = 0;
    Object localObject1 = "";
    Object localObject2 = paramJSONObject.optJSONObject("animation");
    paramJSONObject = (JSONObject)localObject1;
    if (localObject2 != null)
    {
      i = ((JSONObject)localObject2).optInt("duration");
      paramJSONObject = ((JSONObject)localObject2).optString("timingFunc");
    }
    localObject1 = d(paraml);
    if (localObject1 == null)
    {
      paraml.E(paramInt, f("fail:no page for now", null));
      return;
    }
    int m = ((p)localObject1).gnn.getBackgroundColor();
    int n = ((p)localObject1).gnn.getForegroundColor();
    double d2 = ((p)localObject1).gnn.getBackgroundAlpha();
    if ("linear".equals(paramJSONObject)) {
      paramJSONObject = new LinearInterpolator();
    }
    for (;;)
    {
      localObject2 = new ValueAnimator();
      ((ValueAnimator)localObject2).setIntValues(new int[] { m, k });
      ((ValueAnimator)localObject2).setEvaluator(new ArgbEvaluator());
      ((ValueAnimator)localObject2).setDuration(i);
      ((ValueAnimator)localObject2).setInterpolator(paramJSONObject);
      ((ValueAnimator)localObject2).addUpdateListener(new bh.1(this, (p)localObject1));
      ValueAnimator localValueAnimator1 = new ValueAnimator();
      localValueAnimator1.setIntValues(new int[] { n, j });
      localValueAnimator1.setEvaluator(new ArgbEvaluator());
      localValueAnimator1.setDuration(i);
      localValueAnimator1.setInterpolator(paramJSONObject);
      localValueAnimator1.addUpdateListener(new bh.2(this, (p)localObject1));
      ValueAnimator localValueAnimator2 = new ValueAnimator();
      localValueAnimator2.setFloatValues(new float[] { (float)d2, (float)d1 });
      localValueAnimator2.setDuration(i);
      localValueAnimator2.setInterpolator(paramJSONObject);
      localValueAnimator2.addUpdateListener(new bh.3(this, (p)localObject1));
      ((ValueAnimator)localObject2).start();
      localValueAnimator1.start();
      paraml.E(paramInt, f("ok", null));
      return;
      if ("easeIn".equals(paramJSONObject)) {
        paramJSONObject = new AccelerateInterpolator();
      } else if ("easeOut".equals(paramJSONObject)) {
        paramJSONObject = new DecelerateInterpolator();
      } else if ("easeInOut".equals(paramJSONObject)) {
        paramJSONObject = new AccelerateDecelerateInterpolator();
      } else {
        paramJSONObject = null;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */