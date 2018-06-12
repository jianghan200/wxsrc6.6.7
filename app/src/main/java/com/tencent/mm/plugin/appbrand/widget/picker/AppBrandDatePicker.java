package com.tencent.mm.plugin.appbrand.widget.picker;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.Keep;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.NumberPicker;
import com.tencent.mm.plugin.appbrand.s.f;
import com.tencent.mm.plugin.appbrand.s.k;
import com.tencent.mm.ui.widget.picker.YADatePicker;
import com.tencent.mm.ui.widget.picker.YADatePicker.c;
import com.tencent.mm.ui.widget.picker.YADatePicker.d;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public final class AppBrandDatePicker
  extends YADatePicker
  implements e<String>
{
  public boolean gMJ = true;
  public boolean gMK = true;
  public boolean gML = true;
  public NumberPicker gMM;
  public NumberPicker gMN;
  public NumberPicker gMO;
  private Date gMP;
  private Date gMQ;
  private final Calendar gMR;
  private final String[] gMS = new String[12];
  
  @Keep
  public AppBrandDatePicker(Context paramContext)
  {
    super(new ContextThemeWrapper(paramContext, s.k.Widget_AppBrand_Picker));
    int i = 0;
    while (i < this.gMS.length)
    {
      this.gMS[i] = (i + 1);
      i += 1;
    }
    this.gMR = Calendar.getInstance(Locale.US);
    setCalendarViewShown(false);
    setSpinnersShown(true);
    this.gMM = ((YADatePicker.c)getUIDelegate()).uLL;
    this.gMN = ((YADatePicker.c)getUIDelegate()).uLK;
    this.gMO = ((YADatePicker.c)getUIDelegate()).uLJ;
    paramContext = getResources().getDrawable(s.f.appbrand_picker_divider);
    com.tencent.mm.ui.widget.picker.e.a(this.gMM, paramContext);
    com.tencent.mm.ui.widget.picker.e.a(this.gMN, paramContext);
    com.tencent.mm.ui.widget.picker.e.a(this.gMO, paramContext);
    com.tencent.mm.ui.widget.picker.e.c(this.gMM);
    com.tencent.mm.ui.widget.picker.e.c(this.gMN);
    com.tencent.mm.ui.widget.picker.e.c(this.gMO);
    f.a(this.gMM);
    f.a(this.gMN);
    f.a(this.gMO);
    paramContext = new AppBrandDatePicker.1(this);
    if (this.gMM != null)
    {
      this.gMM.setOnValueChangedListener(paramContext);
      this.gMM.setMinValue(1900);
    }
    if (this.gMN != null) {
      this.gMN.setOnValueChangedListener(paramContext);
    }
    if (this.gMO != null) {
      this.gMO.setOnValueChangedListener(paramContext);
    }
    aqn();
    com.tencent.mm.ui.widget.picker.e.e(this.gMM);
    com.tencent.mm.ui.widget.picker.e.e(this.gMN);
    com.tencent.mm.ui.widget.picker.e.e(this.gMO);
  }
  
  private void aqn()
  {
    int j = 0;
    if ((this.gMM == null) || (this.gMN == null) || (this.gMO == null)) {
      return;
    }
    this.gMN.setDisplayedValues(null);
    if ((this.gMM.getValue() == this.gMM.getMaxValue()) && (this.gMQ != null))
    {
      this.gMN.setMaxValue(this.gMQ.getMonth());
      if ((this.gMN.getValue() != this.gMN.getMaxValue()) || (this.gMQ == null)) {
        break label318;
      }
      this.gMO.setMaxValue(this.gMQ.getDate());
      i = 1;
      if (i == 0)
      {
        i = this.gMM.getValue();
        int k = this.gMN.getValue();
        this.gMR.set(i, k, 1);
        i = this.gMR.getActualMaximum(5);
        this.gMO.setMaxValue(i);
      }
      if ((this.gMM.getValue() != this.gMM.getMinValue()) || (this.gMP == null)) {
        break label323;
      }
      this.gMN.setMinValue(this.gMP.getMonth());
      i = j;
      if (this.gMN.getValue() == this.gMN.getMinValue())
      {
        i = j;
        if (this.gMP != null) {
          this.gMO.setMinValue(this.gMP.getDate());
        }
      }
    }
    for (int i = 1;; i = j)
    {
      if (i == 0) {
        this.gMO.setMinValue(1);
      }
      this.gMN.setDisplayedValues((String[])Arrays.copyOfRange(this.gMS, this.gMN.getMinValue(), this.gMN.getMaxValue() + 1));
      this.gMM.setWrapSelectorWheel(true);
      this.gMN.setWrapSelectorWheel(true);
      this.gMO.setWrapSelectorWheel(true);
      return;
      this.gMN.setMaxValue(11);
      label318:
      i = 0;
      break;
      label323:
      this.gMN.setMinValue(0);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, YADatePicker.d paramd)
  {
    super.a(paramInt1, Math.max(paramInt2 - 1, 0), paramInt3, paramd);
    aqn();
  }
  
  public final void a(d paramd)
  {
    aqn();
  }
  
  public final void aqo() {}
  
  public final void aqp() {}
  
  public final void b(d paramd) {}
  
  public final int getDayOfMonth()
  {
    if (this.gMO != null) {
      return this.gMO.getValue();
    }
    return super.getDayOfMonth();
  }
  
  public final int getMonth()
  {
    if (this.gMN != null) {}
    for (int i = this.gMN.getValue() + 1;; i = super.getMonth() + 1) {
      return Math.max(Math.min(i, 12), 0);
    }
  }
  
  public final View getView()
  {
    return this;
  }
  
  public final int getYear()
  {
    if (this.gMM != null) {
      return this.gMM.getValue();
    }
    return super.getYear();
  }
  
  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    com.tencent.mm.ui.widget.picker.e.d(this.gMM);
    com.tencent.mm.ui.widget.picker.e.d(this.gMN);
    com.tencent.mm.ui.widget.picker.e.d(this.gMO);
  }
  
  public final void setMaxDate(long paramLong)
  {
    super.setMaxDate(paramLong);
    this.gMQ = new Date(paramLong);
    if (this.gMM != null) {
      this.gMM.setMaxValue(this.gMQ.getYear() + 1900);
    }
  }
  
  public final void setMinDate(long paramLong)
  {
    super.setMinDate(paramLong);
    this.gMP = new Date(paramLong);
    if (this.gMM != null) {
      this.gMM.setMinValue(this.gMP.getYear() + 1900);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/picker/AppBrandDatePicker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */