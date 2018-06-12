package com.tencent.mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.tencent.mm.plugin.appbrand.s.d;
import com.tencent.mm.plugin.appbrand.s.g;

public final class a
  extends d
{
  private static final int fDq = s.g.app_brand_picker_panel;
  
  public a(Context paramContext)
  {
    super(paramContext);
    super.setId(fDq);
    setBackgroundResource(s.d.half_alpha_black);
    setOnClickListener(new a.1(this));
  }
  
  public static a ci(View paramView)
  {
    return (a)paramView.getRootView().findViewById(fDq);
  }
  
  public final void hide()
  {
    super.hide();
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    if (isShown())
    {
      if ((getParent() != null) && ((getParent() instanceof ViewGroup))) {}
      for (int i = ((ViewGroup)getParent()).getMeasuredHeight(); i > 0; i = 0)
      {
        bZ(paramInt1, View.MeasureSpec.makeMeasureSpec(i, 1073741824));
        return;
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public final void setId(int paramInt) {}
  
  public final void show()
  {
    super.show();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/picker/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */