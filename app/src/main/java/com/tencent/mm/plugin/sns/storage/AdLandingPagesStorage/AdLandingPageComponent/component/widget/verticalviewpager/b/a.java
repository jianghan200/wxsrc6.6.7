package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.b;

import android.support.v4.view.ViewPager.f;
import android.view.View;

public final class a
  implements ViewPager.f
{
  public final void h(View paramView, float paramFloat)
  {
    float f2 = 0.0F;
    float f1;
    if ((0.0F <= paramFloat) && (paramFloat <= 1.0F)) {
      f1 = 1.0F - paramFloat;
    }
    for (;;)
    {
      paramView.setAlpha(f1);
      paramView.setTranslationX(paramView.getWidth() * -paramFloat);
      paramView.setTranslationY(paramView.getHeight() * paramFloat);
      return;
      f1 = f2;
      if (-1.0F < paramFloat)
      {
        f1 = f2;
        if (paramFloat < 0.0F) {
          f1 = paramFloat + 1.0F;
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */