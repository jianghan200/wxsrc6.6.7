package com.tencent.mm.plugin.luckymoney.appbrand.ui;

import android.content.Context;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.luckymoney.a.a;
import com.tencent.mm.plugin.luckymoney.appbrand.a.h.a;
import com.tencent.mm.plugin.luckymoney.b.d;
import com.tencent.mm.plugin.luckymoney.b.o;
import com.tencent.mm.plugin.luckymoney.ui.b;
import com.tencent.mm.plugin.luckymoney.ui.f;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tenpay.android.wechat.TenpaySecureEditText;

public class WxaLuckyMoneyMoneyInputView
  extends LinearLayout
  implements b
{
  private TextWatcher UE = new WxaLuckyMoneyMoneyInputView.1(this);
  private TextView gsY;
  private TenpaySecureEditText kLq;
  private TextView kLr;
  private View kLs;
  private f kLt;
  private d kLu;
  private double kLv;
  private double kLw;
  public h.a kLx;
  
  public WxaLuckyMoneyMoneyInputView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a.bat();
    this.kLu = a.bau().baS();
    paramContext = LayoutInflater.from(paramContext).inflate(a.g.wxa_lucky_money_money_input_view, this, true);
    this.kLq = ((TenpaySecureEditText)paramContext.findViewById(a.f.lucky_money_et));
    this.kLq.addTextChangedListener(this.UE);
    this.gsY = ((TextView)paramContext.findViewById(a.f.lucky_money_money_input_title));
    this.kLs = paramContext.findViewById(a.f.lucky_money_money_input_group_icon);
    this.kLr = ((TextView)paramContext.findViewById(a.f.lucky_money_amount_unit_title));
  }
  
  public final int baC()
  {
    if (bi.oW(this.kLq.getText().toString())) {}
    double d;
    do
    {
      return 0;
      d = bi.getDouble(this.kLq.getText().toString(), -1.0D);
      if (d < 0.0D) {
        return 3;
      }
      if ((d > this.kLv) && (this.kLv > 0.0D)) {
        return 1;
      }
    } while ((d >= this.kLw) || (d <= 0.0D));
    return 2;
  }
  
  public double getInput()
  {
    return bi.getDouble(this.kLq.getText().toString(), 0.0D);
  }
  
  public int getInputViewId()
  {
    return getId();
  }
  
  public final void onError()
  {
    this.gsY.setTextColor(o.dM(getContext()));
    this.kLq.setTextColor(o.dM(getContext()));
    this.kLr.setTextColor(o.dM(getContext()));
  }
  
  public final String rV(int paramInt)
  {
    a.bat();
    this.kLu = a.bau().baS();
    if (paramInt == 1)
    {
      if (this.kLx == h.a.kKZ) {
        return getContext().getString(a.i.lucky_money_total_amount_max_limit_tips, new Object[] { Math.round(this.kLv), bi.aG(this.kLu.kKW, "") });
      }
      return getContext().getString(a.i.lucky_money_amount_max_limit_tips, new Object[] { Math.round(this.kLv), bi.aG(this.kLu.kKW, "") });
    }
    if (paramInt == 2) {
      return getContext().getString(a.i.lucky_money_amount_min_limit_tips, new Object[] { com.tencent.mm.wallet_core.ui.e.A(this.kLw), bi.aG(this.kLu.kKW, "") });
    }
    return null;
  }
  
  public final void restore()
  {
    this.gsY.setTextColor(-16777216);
    this.kLq.setTextColor(-16777216);
    this.kLr.setTextColor(-16777216);
  }
  
  public void setAmount(String paramString)
  {
    this.kLq.setText(paramString);
  }
  
  public void setHint(String paramString)
  {
    this.kLq.setHint(paramString);
  }
  
  public void setMaxAmount(double paramDouble)
  {
    this.kLv = paramDouble;
  }
  
  public void setMaxLen(int paramInt)
  {
    this.kLq.setFilters(new InputFilter[] { new InputFilter.LengthFilter(paramInt) });
  }
  
  public void setMinAmount(double paramDouble)
  {
    this.kLw = paramDouble;
  }
  
  public void setOnInputValidChangerListener(f paramf)
  {
    this.kLt = paramf;
  }
  
  public void setShowGroupIcon(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.kLs.setVisibility(0);
      return;
    }
    this.kLs.setVisibility(8);
  }
  
  public void setTitle(String paramString)
  {
    this.gsY.setText(paramString);
  }
  
  public void setType(h.a parama)
  {
    this.kLx = parama;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/appbrand/ui/WxaLuckyMoneyMoneyInputView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */