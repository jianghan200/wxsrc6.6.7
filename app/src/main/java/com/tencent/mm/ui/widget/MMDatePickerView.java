package com.tencent.mm.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import com.tencent.mm.ui.y;
import com.tencent.mm.w.a.g;
import com.tencent.mm.w.a.h;

public class MMDatePickerView
  extends LinearLayout
  implements View.OnClickListener
{
  private MMSpinnerDatePicker hZh;
  private Button uGe;
  private Button uGf;
  private Button uGg;
  
  public MMDatePickerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  public MMDatePickerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private void init(Context paramContext)
  {
    paramContext = y.gq(paramContext).inflate(a.h.mm_datepicker_dialog, this);
    this.uGe = ((Button)paramContext.findViewById(a.g.year_btn));
    this.uGf = ((Button)paramContext.findViewById(a.g.month_btn));
    this.uGg = ((Button)paramContext.findViewById(a.g.day_btn));
    this.hZh = ((MMSpinnerDatePicker)paramContext.findViewById(a.g.mm_datepicker));
    this.uGe.setOnClickListener(this);
    this.uGf.setOnClickListener(this);
    this.uGg.setOnClickListener(this);
  }
  
  public void onClick(View paramView)
  {
    int i = paramView.getId();
    if (i == a.g.year_btn)
    {
      this.hZh.setPickerMode(0);
      return;
    }
    if (i == a.g.month_btn)
    {
      this.hZh.setPickerMode(1);
      return;
    }
    this.hZh.setPickerMode(2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/widget/MMDatePickerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */