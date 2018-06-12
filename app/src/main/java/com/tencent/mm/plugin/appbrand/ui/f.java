package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.view.z;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.s.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.MMFragmentActivity.a;
import com.tencent.mm.ui.widget.b;

public final class f
{
  public static void a(Activity paramActivity, AppBrandStatObject paramAppBrandStatObject)
  {
    int j = 1;
    if ((paramActivity == null) || (paramActivity.getIntent() == null)) {
      return;
    }
    if (b(paramAppBrandStatObject) == 1023) {}
    for (int i = 1; i != 0; i = 0)
    {
      paramActivity.overridePendingTransition(s.a.appbrand_ui_push_open_enter, s.a.anim_not_change);
      return;
    }
    if (1024 == b(paramAppBrandStatObject)) {
      if (paramAppBrandStatObject == null)
      {
        i = 0;
        if (6 != i) {
          break label93;
        }
      }
    }
    label93:
    for (i = 1;; i = 0)
    {
      if (i == 0) {
        break label98;
      }
      paramActivity.overridePendingTransition(MMFragmentActivity.a.tnE, MMFragmentActivity.a.tnF);
      return;
      i = paramAppBrandStatObject.cbB;
      break;
    }
    label98:
    Intent localIntent = paramActivity.getIntent();
    if ((localIntent != null) && (localIntent.getBooleanExtra("key_appbrand_bring_ui_to_front_from_task_Base_by_task_top_ui", false))) {}
    for (i = j; i != 0; i = 0)
    {
      paramActivity.overridePendingTransition(s.a.appbrand_ui_push_open_enter, s.a.anim_not_change);
      return;
    }
    if (1090 == b(paramAppBrandStatObject))
    {
      paramActivity.overridePendingTransition(s.a.appbrand_ui_switch_enter, s.a.appbrand_ui_push_enter_exit);
      return;
    }
    paramActivity.overridePendingTransition(s.a.appbrand_ui_push_open_enter, s.a.appbrand_ui_push_enter_exit);
  }
  
  public static void a(final g paramg, int paramInt, Runnable paramRunnable)
  {
    if (!z.ai(paramg.fcA))
    {
      paramg.fcA.setWillNotDraw(true);
      paramg.fcA.post(new f.1(paramg, paramInt, paramRunnable));
      return;
    }
    Animation localAnimation = AnimationUtils.loadAnimation(paramg.fcq, paramInt);
    localAnimation.setAnimationListener(new b()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        if (this.ghr != null) {
          ah.A(this.ghr);
        }
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        paramg.fcA.setWillNotDraw(false);
      }
    });
    paramg.fcA.startAnimation(localAnimation);
  }
  
  public static void a(g paramg1, g paramg2, Runnable paramRunnable)
  {
    if (paramg1 == null) {}
    do
    {
      return;
      if (!paramg1.aap()) {
        break;
      }
      i = MMFragmentActivity.a.tnC;
      a(paramg1, i, null);
    } while (paramg2 == null);
    if (paramg1.aap()) {}
    for (int i = MMFragmentActivity.a.tnD;; i = s.a.anim_not_change)
    {
      a(paramg2, i, paramRunnable);
      return;
      i = s.a.appbrand_ui_push_open_enter;
      break;
    }
  }
  
  private static int b(AppBrandStatObject paramAppBrandStatObject)
  {
    if (paramAppBrandStatObject == null) {
      return 0;
    }
    return paramAppBrandStatObject.scene;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */