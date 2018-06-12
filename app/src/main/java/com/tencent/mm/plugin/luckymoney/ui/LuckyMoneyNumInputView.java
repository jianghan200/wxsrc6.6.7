package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.luckymoney.b.o;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tenpay.android.wechat.TenpaySecureEditText;

public class LuckyMoneyNumInputView
  extends LinearLayout
  implements b
{
  private TextWatcher UE = new TextWatcher()
  {
    public final void afterTextChanged(Editable paramAnonymousEditable)
    {
      if (LuckyMoneyNumInputView.a(LuckyMoneyNumInputView.this) != null)
      {
        paramAnonymousEditable = LuckyMoneyNumInputView.a(LuckyMoneyNumInputView.this);
        LuckyMoneyNumInputView.this.getInputViewId();
        paramAnonymousEditable.baD();
      }
    }
    
    public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
    
    public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3) {}
  };
  private TextView gsY;
  private f kLt;
  private TenpaySecureEditText kWB;
  private TextView kWC;
  private int kWD = 1;
  private int kWE = Integer.MAX_VALUE;
  private int kWF = 1;
  
  public LuckyMoneyNumInputView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = LayoutInflater.from(paramContext).inflate(a.g.lucky_money_num_input_view, this, true);
    this.gsY = ((TextView)paramContext.findViewById(a.f.lucky_money_num_input_title));
    this.kWB = ((TenpaySecureEditText)paramContext.findViewById(a.f.lucky_money_et));
    this.kWC = ((TextView)paramContext.findViewById(a.f.lucky_money_num_unit));
    this.kWB.setText(this.kWD);
    this.kWB.addTextChangedListener(this.UE);
  }
  
  public final int baC()
  {
    if (bi.oW(this.kWB.getText().toString())) {}
    int i;
    do
    {
      return 0;
      i = bi.getInt(this.kWB.getText().toString(), -1);
      if (i < 0) {
        return 3;
      }
      if ((i > this.kWE) && (this.kWE > 0)) {
        return 1;
      }
    } while ((i >= this.kWF) || (this.kWF <= 0));
    return 2;
  }
  
  public int getInput()
  {
    try
    {
      int i = Integer.parseInt(this.kWB.getText().toString(), 10);
      return i;
    }
    catch (Exception localException) {}
    return 0;
  }
  
  public int getInputViewId()
  {
    return getId();
  }
  
  public final void onError()
  {
    this.gsY.setTextColor(o.dM(getContext()));
    this.kWB.setTextColor(o.dM(getContext()));
    this.kWC.setTextColor(o.dM(getContext()));
  }
  
  public final String rV(int paramInt)
  {
    if (paramInt == 1) {
      return getContext().getString(a.i.lucky_money_num_max_limit_tips, new Object[] { Integer.valueOf(this.kWE) });
    }
    if (paramInt == 2) {
      return getContext().getString(a.i.lucky_money_num_luck_min_limit_tips, new Object[] { Integer.valueOf(this.kWF) });
    }
    return null;
  }
  
  public final void restore()
  {
    this.gsY.setTextColor(-16777216);
    this.kWB.setTextColor(-16777216);
    this.kWC.setTextColor(-16777216);
  }
  
  public void setHint(String paramString)
  {
    this.kWB.setHint(paramString);
  }
  
  public void setMaxNum(int paramInt)
  {
    int j = 3;
    this.kWE = paramInt;
    int k = 0;
    int i = paramInt;
    paramInt = k;
    while (i > 0)
    {
      paramInt += 1;
      i /= 10;
    }
    if (paramInt <= 3) {
      paramInt = j;
    }
    for (;;)
    {
      this.kWB.setFilters(new InputFilter[] { new InputFilter.LengthFilter(paramInt) });
      return;
    }
  }
  
  public void setMinNum(int paramInt)
  {
    this.kWF = paramInt;
  }
  
  public void setNum(String paramString)
  {
    this.kWB.setText(paramString);
    this.kWB.setSelection(this.kWB.getText().length());
    this.kWD = bi.getInt(paramString, 0);
  }
  
  public void setOnInputValidChangerListener(f paramf)
  {
    this.kLt = paramf;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNumInputView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */