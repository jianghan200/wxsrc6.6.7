package com.tencent.mm.plugin.appbrand.jsapi.container;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.p;

public class AppBrandNativeContainerView
  extends FrameLayout
  implements p
{
  public boolean fPF;
  
  public AppBrandNativeContainerView(Context paramContext)
  {
    super(paramContext);
  }
  
  public AppBrandNativeContainerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public AppBrandNativeContainerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void setFullscreenWithChild(boolean paramBoolean)
  {
    this.fPF = paramBoolean;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/container/AppBrandNativeContainerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */