package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.ui.base.preference.Preference;

public final class e
  extends Preference
{
  public String lQl;
  public View.OnClickListener mOnClickListener = null;
  private View mView = null;
  
  public e(Context paramContext)
  {
    super(paramContext);
    setLayoutResource(a.g.mall_order_button_pref);
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
    paramView = (TextView)paramView.findViewById(a.f.mall_order_button_pref_btn);
    paramView.setText(this.lQl);
    paramView.setOnClickListener(this.mOnClickListener);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/order/ui/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */