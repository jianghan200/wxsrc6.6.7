package com.tencent.mm.ui.c;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.c.a.c;
import com.tencent.mm.w.a.a;

public final class a
{
  public static Animation gz(Context paramContext)
  {
    if (paramContext == null)
    {
      x.e("MicroMsg.MMAnimationEffectLoader", "hy: context is null.");
      return null;
    }
    paramContext = AnimationUtils.loadAnimation(paramContext, a.a.anim_flash);
    if (-1L > 0L) {
      paramContext.setDuration(-1L);
    }
    paramContext.setInterpolator(new c());
    return paramContext;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */