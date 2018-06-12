package com.tencent.mm.plugin.appbrand.jsapi.coverview;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  extends c
{
  public static final int CTRL_INDEX = 342;
  public static final String NAME = "animateCoverView";
  
  protected final boolean a(p paramp, int paramInt, View paramView, JSONObject paramJSONObject, com.tencent.mm.plugin.appbrand.jsapi.base.f paramf)
  {
    for (;;)
    {
      String str;
      try
      {
        paramp = paramJSONObject.getJSONObject("finalStyle");
        float f1 = com.tencent.mm.plugin.appbrand.q.f.a(paramp, "left", com.tencent.mm.plugin.appbrand.q.f.ad(paramView.getX()));
        float f2 = com.tencent.mm.plugin.appbrand.q.f.a(paramp, "top", com.tencent.mm.plugin.appbrand.q.f.ad(paramView.getY()));
        float f3 = (float)paramp.optDouble("opacity", paramView.getAlpha());
        float f4 = (float)paramp.optDouble("rotate", paramView.getRotation());
        float f5 = (float)paramp.optDouble("scaleX", paramView.getScaleX());
        double d = paramp.optDouble("scaleY", paramView.getScaleY());
        float f6 = (float)d;
        paramInt = paramJSONObject.optInt("duration", 300);
        str = paramJSONObject.optString("easing", "linear");
        paramJSONObject = ObjectAnimator.ofFloat(paramView, "x", new float[] { paramView.getX(), f1 });
        ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(paramView, "y", new float[] { paramView.getY(), f2 });
        ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(paramView, "alpha", new float[] { paramView.getAlpha(), f3 });
        ObjectAnimator localObjectAnimator3 = ObjectAnimator.ofFloat(paramView, "rotation", new float[] { paramView.getRotation(), f4 });
        ObjectAnimator localObjectAnimator4 = ObjectAnimator.ofFloat(paramView, "scaleX", new float[] { paramView.getScaleX(), f5 });
        ObjectAnimator localObjectAnimator5 = ObjectAnimator.ofFloat(paramView, "scaleY", new float[] { paramView.getScaleY(), f6 });
        AnimatorSet localAnimatorSet = new AnimatorSet();
        localAnimatorSet.setDuration(paramInt);
        paramView = null;
        paramp = paramView;
        if (str != null)
        {
          if (str.equals("ease")) {
            paramp = new AccelerateDecelerateInterpolator();
          }
        }
        else
        {
          paramView = paramp;
          if (paramp == null) {
            paramView = new LinearInterpolator();
          }
          localAnimatorSet.setInterpolator(paramView);
          localAnimatorSet.addListener(new b.1(this, paramf));
          localAnimatorSet.playTogether(new Animator[] { paramJSONObject, localObjectAnimator1, localObjectAnimator2, localObjectAnimator3, localObjectAnimator4, localObjectAnimator5 });
          localAnimatorSet.start();
          return true;
        }
      }
      catch (JSONException paramp)
      {
        x.w("MicroMsg.JsApiAnimateCoverView", "get finalStyle error : %s", new Object[] { Log.getStackTraceString(paramp) });
        paramf.tp(f("fail:missing finalStyle", null));
        return false;
      }
      if (str.equals("ease-in"))
      {
        paramp = new AccelerateInterpolator();
      }
      else
      {
        paramp = paramView;
        if (str.equals("ease-out")) {
          paramp = new DecelerateInterpolator();
        }
      }
    }
  }
  
  protected final boolean aik()
  {
    return true;
  }
  
  protected final int k(JSONObject paramJSONObject)
  {
    return paramJSONObject.getInt("viewId");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/coverview/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */