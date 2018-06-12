package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.ui.base.preference.Preference;

public final class h
  extends Preference
{
  boolean gOc = true;
  boolean lQA = false;
  boolean lQz = false;
  private View mView = null;
  
  public h(Context paramContext)
  {
    super(paramContext);
    setLayoutResource(a.g.mall_order_divider_pref);
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
    paramView = paramView.findViewById(a.f.mall_order_divider_pref_line);
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)paramView.getLayoutParams();
    int i = BackwardSupportUtil.b.b(this.mContext, 10.0F);
    if (this.lQz) {}
    for (int j = i;; j = 0)
    {
      if (this.lQA) {}
      for (;;)
      {
        localLayoutParams.setMargins(0, j, 0, i);
        paramView.setLayoutParams(localLayoutParams);
        if (!this.gOc)
        {
          paramView.setVisibility(4);
          return;
        }
        paramView.setVisibility(0);
        return;
        i = 0;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/order/ui/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */