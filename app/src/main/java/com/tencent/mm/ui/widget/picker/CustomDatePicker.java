package com.tencent.mm.ui.widget.picker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.NumberPicker;
import android.widget.NumberPicker.OnValueChangeListener;
import com.tencent.mm.bw.a.e;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CustomDatePicker
  extends YADatePicker
{
  public boolean gMK = true;
  public boolean gML = true;
  NumberPicker gMM;
  NumberPicker gMN;
  NumberPicker gMO;
  private Date gMP;
  private Date gMQ;
  private Calendar gMR;
  private String[] gMS;
  
  public CustomDatePicker(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    initView();
  }
  
  public CustomDatePicker(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    initView();
  }
  
  private void initView()
  {
    this.gMS = new String[12];
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
    Object localObject = getResources().getDrawable(a.e.picker_divider);
    e.a(this.gMM, (Drawable)localObject);
    e.a(this.gMN, (Drawable)localObject);
    e.a(this.gMO, (Drawable)localObject);
    e.c(this.gMM);
    e.c(this.gMN);
    e.c(this.gMO);
    localObject = new CustomDatePicker.1(this);
    if (this.gMM != null)
    {
      this.gMM.setOnValueChangedListener((NumberPicker.OnValueChangeListener)localObject);
      this.gMM.setMinValue(1900);
    }
    if (this.gMN != null) {
      this.gMN.setOnValueChangedListener((NumberPicker.OnValueChangeListener)localObject);
    }
    if (this.gMO != null) {
      this.gMO.setOnValueChangedListener((NumberPicker.OnValueChangeListener)localObject);
    }
    aqn();
    e.e(this.gMM);
    e.e(this.gMN);
    e.e(this.gMO);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, YADatePicker.d paramd)
  {
    super.a(paramInt1, Math.max(paramInt2 - 1, 0), paramInt3, paramd);
    aqn();
  }
  
  public final void an(int paramInt1, int paramInt2, int paramInt3)
  {
    a(paramInt1, paramInt2, paramInt3, null);
  }
  
  final void aqn()
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
  
  public int getDayOfMonth()
  {
    if (this.gMO != null) {
      return this.gMO.getValue();
    }
    return super.getDayOfMonth();
  }
  
  public int getMonth()
  {
    if (this.gMN != null) {}
    for (int i = this.gMN.getValue() + 1;; i = super.getMonth() + 1) {
      return Math.max(Math.min(i, 12), 0);
    }
  }
  
  public int getYear()
  {
    if (this.gMM != null) {
      return this.gMM.getValue();
    }
    return super.getYear();
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    e.d(this.gMM);
    e.d(this.gMN);
    e.d(this.gMO);
  }
  
  public void setMaxDate(long paramLong)
  {
    super.setMaxDate(paramLong);
    this.gMQ = new Date(paramLong);
    if (this.gMM != null) {
      this.gMM.setMaxValue(this.gMQ.getYear() + 1900);
    }
    aqn();
  }
  
  public void setMinDate(long paramLong)
  {
    super.setMinDate(paramLong);
    this.gMP = new Date(paramLong);
    if (this.gMM != null) {
      this.gMM.setMinValue(this.gMP.getYear() + 1900);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/widget/picker/CustomDatePicker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */