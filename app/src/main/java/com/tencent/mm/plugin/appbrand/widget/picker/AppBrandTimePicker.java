package com.tencent.mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.annotation.Keep;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.TimePicker;
import com.tencent.mm.compatible.loader.c;
import com.tencent.mm.plugin.appbrand.s.f;
import com.tencent.mm.plugin.appbrand.s.k;

public final class AppBrandTimePicker
  extends TimePicker
  implements e<String>
{
  public int fXv = -1;
  public int fXw = -1;
  public int fXx = -1;
  public int fXy = -1;
  public NumberPicker gNn;
  private NumberPicker gNo;
  
  @Keep
  public AppBrandTimePicker(Context paramContext)
  {
    super(new ContextThemeWrapper(paramContext, s.k.Widget_AppBrand_Picker));
    setIs24HourView(Boolean.valueOf(true));
    this.gNn = wm("mHourSpinner");
    this.gNo = wm("mMinuteSpinner");
    com.tencent.mm.ui.widget.picker.e.c(this.gNn);
    com.tencent.mm.ui.widget.picker.e.c(this.gNo);
    f.a(this.gNn);
    f.a(this.gNo);
    paramContext = getResources().getDrawable(s.f.appbrand_picker_divider);
    com.tencent.mm.ui.widget.picker.e.a(this.gNn, paramContext);
    com.tencent.mm.ui.widget.picker.e.a(this.gNo, paramContext);
    if (this.gNn != null) {
      this.gNn.setOnValueChangedListener(new AppBrandTimePicker.1(this));
    }
    if ((this.gNo != null) && (Build.VERSION.SDK_INT >= 21)) {
      this.gNo.setOnValueChangedListener(new AppBrandTimePicker.2(this));
    }
    com.tencent.mm.ui.widget.picker.e.e(this.gNn);
    com.tencent.mm.ui.widget.picker.e.e(this.gNo);
  }
  
  private NumberPicker wm(String paramString)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return wo(paramString);
    }
    return wn(paramString);
  }
  
  private NumberPicker wn(String paramString)
  {
    try
    {
      paramString = (NumberPicker)new c(this, paramString, null).get();
      return paramString;
    }
    catch (Exception paramString) {}
    return null;
  }
  
  private NumberPicker wo(String paramString)
  {
    try
    {
      Object localObject = new c(this, "mDelegate", null).get();
      if (localObject != null)
      {
        paramString = (NumberPicker)new c(localObject, paramString, null).get();
        return paramString;
      }
    }
    catch (Exception paramString) {}
    return null;
  }
  
  public final void a(d paramd) {}
  
  public final void aqo() {}
  
  public final void aqp() {}
  
  public final void aqt()
  {
    if ((com.tencent.mm.ui.widget.picker.f.GF(this.fXv)) && (com.tencent.mm.ui.widget.picker.f.GE(this.fXw)) && (this.gNn != null) && (this.gNo != null))
    {
      if (this.gNn.getValue() != this.fXv) {
        break label109;
      }
      this.gNo.setMinValue(this.fXw);
    }
    for (;;)
    {
      if ((com.tencent.mm.ui.widget.picker.f.GF(this.fXx)) && (this.gNn != null) && (this.gNo != null))
      {
        if (this.gNn.getValue() != this.fXx) {
          break;
        }
        this.gNo.setMaxValue(this.fXy);
      }
      return;
      label109:
      this.gNo.setMinValue(0);
    }
    this.gNo.setMaxValue(59);
  }
  
  public final void b(d paramd) {}
  
  public final View getView()
  {
    return this;
  }
  
  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    com.tencent.mm.ui.widget.picker.e.d(this.gNn);
    com.tencent.mm.ui.widget.picker.e.d(this.gNo);
  }
  
  public final void setCurrentHour(Integer paramInteger)
  {
    if (paramInteger == null) {}
    for (int i = 0;; i = paramInteger.intValue())
    {
      super.setCurrentHour(Integer.valueOf(i));
      aqt();
      return;
    }
  }
  
  public final void setCurrentMinute(Integer paramInteger)
  {
    if (paramInteger == null) {}
    for (int i = 0;; i = paramInteger.intValue())
    {
      super.setCurrentMinute(Integer.valueOf(i));
      aqt();
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/picker/AppBrandTimePicker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */