package com.tencent.mm.plugin.appbrand.widget.actionbar;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.mm.plugin.appbrand.s.i;

public final class AppBrandCapsuleHomeButton
  extends AppBrandOptionButton
{
  public AppBrandCapsuleHomeButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public AppBrandCapsuleHomeButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected final int getImageButtonResource()
  {
    return s.i.app_brand_actionbar_capsule_home_dark;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandCapsuleHomeButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */