package com.tencent.mm.ui.widget.picker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.widget.NumberPicker;
import android.widget.TimePicker;
import com.tencent.mm.bw.a.e;
import com.tencent.mm.bw.a.j;
import com.tencent.mm.ui.aj;

public class CustomTimePicker
  extends TimePicker
{
  public int fXv = -1;
  public int fXw = -1;
  public int fXx = -1;
  public int fXy = -1;
  public NumberPicker gNn;
  private NumberPicker gNo;
  
  public CustomTimePicker(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(new ContextThemeWrapper(paramContext, a.j.Widget_Picker), paramAttributeSet);
    initView();
  }
  
  public CustomTimePicker(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    initView();
  }
  
  private void initView()
  {
    setIs24HourView(Boolean.valueOf(true));
    this.gNn = wm("mHourSpinner");
    this.gNo = wm("mMinuteSpinner");
    e.c(this.gNn);
    e.c(this.gNo);
    Drawable localDrawable = getResources().getDrawable(a.e.picker_divider);
    e.a(this.gNn, localDrawable);
    e.a(this.gNo, localDrawable);
    if (this.gNn != null) {
      this.gNn.setOnValueChangedListener(new CustomTimePicker.1(this));
    }
    if ((this.gNo != null) && (Build.VERSION.SDK_INT >= 21)) {
      this.gNo.setOnValueChangedListener(new CustomTimePicker.2(this));
    }
    e.e(this.gNn);
    e.e(this.gNo);
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
      paramString = (NumberPicker)new aj(this, paramString).get();
      return paramString;
    }
    catch (Exception paramString) {}
    return null;
  }
  
  private NumberPicker wo(String paramString)
  {
    try
    {
      Object localObject = new aj(this, "mDelegate").get();
      if (localObject != null)
      {
        paramString = (NumberPicker)new aj(localObject, paramString).get();
        return paramString;
      }
    }
    catch (IllegalAccessException paramString)
    {
      return null;
    }
    catch (NoSuchFieldException paramString)
    {
      for (;;) {}
    }
  }
  
  public final void aqt()
  {
    if ((f.GF(this.fXv)) && (f.GE(this.fXw)) && (this.gNn != null) && (this.gNo != null))
    {
      if (this.gNn.getValue() != this.fXv) {
        break label109;
      }
      this.gNo.setMinValue(this.fXw);
    }
    for (;;)
    {
      if ((f.GF(this.fXx)) && (this.gNn != null) && (this.gNo != null))
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
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    e.d(this.gNn);
    e.d(this.gNo);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/widget/picker/CustomTimePicker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */