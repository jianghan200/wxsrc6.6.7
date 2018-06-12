package com.tencent.mm.plugin.collect.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.d;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.widget.MMSpinnerDatePicker;
import com.tencent.mm.ui.y;

public class DatePickerDialogView
  extends LinearLayout
  implements View.OnClickListener
{
  private CollectRadioBtnView hZe;
  private CollectRadioBtnView hZf;
  private CollectRadioBtnView hZg;
  private MMSpinnerDatePicker hZh;
  private TextView hZi;
  private TextView hZj;
  private int hZk = 0;
  
  public DatePickerDialogView(Context paramContext)
  {
    super(paramContext);
    init(paramContext);
  }
  
  public DatePickerDialogView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  public DatePickerDialogView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private void aCA()
  {
    if (this.hZk == 2)
    {
      this.hZe.setRadioSrc(a.h.radio_on);
      this.hZf.setRadioSrc(a.h.radio_off);
      this.hZg.setRadioSrc(a.h.radio_off);
    }
    for (;;)
    {
      this.hZh.setPickerMode(this.hZk);
      return;
      if (this.hZk == 1)
      {
        this.hZe.setRadioSrc(a.h.radio_off);
        this.hZf.setRadioSrc(a.h.radio_on);
        this.hZg.setRadioSrc(a.h.radio_off);
      }
      else
      {
        this.hZe.setRadioSrc(a.h.radio_off);
        this.hZf.setRadioSrc(a.h.radio_off);
        this.hZg.setRadioSrc(a.h.radio_on);
      }
    }
  }
  
  private void init(Context paramContext)
  {
    paramContext = y.gq(paramContext).inflate(a.g.collect_bill_datepicker_dialog_view, this);
    this.hZe = ((CollectRadioBtnView)paramContext.findViewById(a.f.year_btn));
    this.hZf = ((CollectRadioBtnView)paramContext.findViewById(a.f.month_btn));
    this.hZg = ((CollectRadioBtnView)paramContext.findViewById(a.f.day_btn));
    this.hZi = ((TextView)paramContext.findViewById(a.f.confirm_btn));
    this.hZj = ((TextView)paramContext.findViewById(a.f.cancel_btn));
    this.hZe.setOnClickListener(this);
    this.hZf.setOnClickListener(this);
    this.hZg.setOnClickListener(this);
    this.hZe.setTitleText("年");
    this.hZf.setTitleText("月");
    this.hZg.setTitleText("日");
    this.hZh = ((MMSpinnerDatePicker)paramContext.findViewById(a.f.datepicker));
    this.hZh.Gm(a.c.transparent);
    this.hZh.setTextSize(a.d.NormalTextSize);
  }
  
  public int getDatePickerMode()
  {
    return this.hZh.getPickerMode();
  }
  
  public int getDayOfMonth()
  {
    return this.hZh.getDayOfMonth();
  }
  
  public int getMonth()
  {
    return this.hZh.getMonth();
  }
  
  public int getYear()
  {
    return this.hZh.getYear();
  }
  
  public void onClick(View paramView)
  {
    int i = paramView.getId();
    if (i == a.f.year_btn) {
      this.hZk = 2;
    }
    for (;;)
    {
      aCA();
      return;
      if (i == a.f.month_btn) {
        this.hZk = 1;
      } else if (i == a.f.day_btn) {
        this.hZk = 0;
      } else {
        x.i("MicroMsg.DatePickerDialogView", "unhandled click view: %s", new Object[] { paramView.getClass().toString() });
      }
    }
  }
  
  public void setDatePickerMode(int paramInt)
  {
    this.hZk = paramInt;
    aCA();
  }
  
  public void setOnCancelBtnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.hZj.setOnClickListener(paramOnClickListener);
  }
  
  public void setOnOkBtnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.hZi.setOnClickListener(paramOnClickListener);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/collect/ui/DatePickerDialogView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */