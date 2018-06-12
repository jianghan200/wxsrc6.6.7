package com.tencent.mm.ui.widget.picker;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.NumberPicker;
import com.tencent.mm.bw.a.e;
import com.tencent.mm.ui.ap;

public class OptionPicker
  extends NumberPicker
{
  private int HB;
  private String[] gNb;
  private int gNc;
  private int gg;
  private Context mContext;
  
  public OptionPicker(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
    init();
  }
  
  public OptionPicker(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    init();
  }
  
  private void init()
  {
    this.HB = ap.fromDPToPix(this.mContext, 120);
    this.gNc = ap.fromDPToPix(this.mContext, 20);
    e.a(this, getResources().getDrawable(a.e.picker_divider));
    setDescendantFocusability(393216);
  }
  
  public final String aqr()
  {
    if ((this.gNb == null) || (this.gNb.length <= 0)) {
      return "";
    }
    return this.gNb[getValue()];
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
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
    setWrapSelectorWheel(false);
    String[] arrayOfString = paramArrayOfString;
    if (paramArrayOfString.length <= 0) {
      arrayOfString = null;
    }
    super.setDisplayedValues(arrayOfString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/widget/picker/OptionPicker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */