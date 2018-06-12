package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.ui.base.preference.Preference;

public final class i
  extends Preference
{
  private int lQB = Integer.MAX_VALUE;
  String lQC;
  private View mView = null;
  
  public i(Context paramContext)
  {
    super(paramContext);
    setLayoutResource(a.g.mall_order_fee_pref);
  }
  
  public final void Jx(String paramString)
  {
    try
    {
      this.lQB = Color.parseColor(paramString);
      return;
    }
    catch (Exception paramString)
    {
      this.lQB = -1;
    }
  }
  
  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    if (this.mView == null) {
      this.mView = onCreateView(paramViewGroup);
    }
    onBindView(this.mView);
    return this.mView;
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    TextView localTextView = (TextView)paramView.findViewById(a.f.mall_order_fee_pref_title);
    paramView = (TextView)paramView.findViewById(a.f.mall_order_fee_pref_fee);
    localTextView.setText(getTitle());
    paramView.setText(this.lQC);
    if (this.lQB != Integer.MAX_VALUE) {
      paramView.setTextColor(this.lQB);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/order/ui/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */