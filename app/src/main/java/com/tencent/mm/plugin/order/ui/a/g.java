package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public final class g
  extends Preference
{
  private static int lQq;
  private static float lQr = 16.0F;
  f gua;
  String lQs;
  private String[] lQt;
  private TextUtils.TruncateAt lQu;
  private boolean lQv = false;
  private View mView = null;
  
  public g(Context paramContext)
  {
    super(paramContext);
    setLayoutResource(a.g.mall_order_deployable_pref);
    lQq = paramContext.getResources().getColor(a.c.mall_order_pref_content_color);
  }
  
  public final void a(String[] paramArrayOfString, TextUtils.TruncateAt paramTruncateAt)
  {
    this.lQt = paramArrayOfString;
    this.lQu = paramTruncateAt;
    this.lQv = true;
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
    TextView localTextView1 = (TextView)paramView.findViewById(a.f.mall_order_deployable_pref_title);
    TextView localTextView2 = (TextView)paramView.findViewById(a.f.mall_order_deployable_pref_content_summary);
    paramView = (LinearLayout)paramView.findViewById(a.f.mall_order_deployable_pref_content_container);
    localTextView1.setText(getTitle());
    if ((this.lQt == null) || (this.lQt.length <= 1)) {
      localTextView2.setTextColor(lQq);
    }
    for (;;)
    {
      localTextView2.setText(this.lQs);
      return;
      localTextView2.setOnClickListener(new g.1(this, localTextView2, paramView));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/order/ui/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */