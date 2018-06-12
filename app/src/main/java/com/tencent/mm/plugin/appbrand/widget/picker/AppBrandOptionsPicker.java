package com.tencent.mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.Keep;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.NumberPicker;
import com.tencent.mm.bp.a;
import com.tencent.mm.plugin.appbrand.s.f;
import com.tencent.mm.plugin.appbrand.s.k;

public class AppBrandOptionsPicker
  extends NumberPicker
  implements e<String>
{
  private int HB;
  private String[] gNb;
  private int gNc;
  private int gg;
  
  @Keep
  public AppBrandOptionsPicker(Context paramContext)
  {
    super(new ContextThemeWrapper(paramContext, s.k.Widget_AppBrand_Picker));
    com.tencent.mm.ui.widget.picker.e.a(this, getResources().getDrawable(s.f.appbrand_picker_divider));
    com.tencent.mm.ui.widget.picker.e.c(this);
    com.tencent.mm.ui.widget.picker.e.e(this);
    f.a(this);
    this.HB = a.fromDPToPix(paramContext, 100);
    this.gNc = a.fromDPToPix(paramContext, 20);
  }
  
  public final void a(d paramd) {}
  
  public final void aqo() {}
  
  public final void aqp() {}
  
  public final String aqr()
  {
    if ((this.gNb == null) || (this.gNb.length <= 0)) {
      return "";
    }
    return this.gNb[getValue()];
  }
  
  public final void b(d paramd) {}
  
  public View getView()
  {
    return this;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    com.tencent.mm.ui.widget.picker.e.d(this);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if ((View.MeasureSpec.getMode(paramInt1) == Integer.MIN_VALUE) || (View.MeasureSpec.getMode(paramInt1) == 1073741824)) {
      this.gg = View.MeasureSpec.getSize(paramInt1);
    }
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), paramInt2);
    if ((getMeasuredWidth() <= this.HB) && ((this.gg <= 0) || (this.HB <= this.gg)))
    {
      setMeasuredDimension(this.HB, getMeasuredHeight());
      return;
    }
    paramInt2 = getMeasuredWidth() + this.gNc * 2;
    paramInt1 = paramInt2;
    if (this.gg > 0) {
      if (this.gg <= paramInt2) {
        break label119;
      }
    }
    label119:
    for (paramInt1 = paramInt2;; paramInt1 = this.gg)
    {
      setMeasuredDimension(paramInt1, getMeasuredHeight());
      return;
    }
  }
  
  @Deprecated
  public void setDisplayedValues(String[] paramArrayOfString)
  {
    super.setDisplayedValues(paramArrayOfString);
  }
  
  public final void setExtraPadding(int paramInt)
  {
    this.gNc = Math.max(paramInt, 0);
  }
  
  public final void setMaxWidth(int paramInt)
  {
    this.gg = paramInt;
  }
  
  public final void setMinWidth(int paramInt)
  {
    this.HB = paramInt;
  }
  
  public void setOptionsArray(String[] paramArrayOfString)
  {
    if (paramArrayOfString == null) {
      return;
    }
    this.gNb = paramArrayOfString;
    setDisplayedValues(null);
    setMinValue(0);
    setMaxValue(Math.max(paramArrayOfString.length - 1, 0));
    String[] arrayOfString = paramArrayOfString;
    if (paramArrayOfString.length <= 0) {
      arrayOfString = null;
    }
    super.setDisplayedValues(arrayOfString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/picker/AppBrandOptionsPicker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */