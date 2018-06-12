package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.bp.a;
import com.tencent.mm.plugin.order.model.MallOrderDetailObject.HelpCenter;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.d;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.LinkedList;
import java.util.List;

public final class j
  extends Preference
{
  List<MallOrderDetailObject.HelpCenter> lNv = new LinkedList();
  String lQD;
  View.OnClickListener lQE = null;
  View.OnClickListener mOnClickListener = null;
  private View mView = null;
  
  public j(Context paramContext)
  {
    super(paramContext);
    setLayoutResource(a.g.mall_order_multi_button_pref);
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
    paramView = (LinearLayout)paramView.findViewById(a.f.mall_order_multi_button);
    paramView.removeAllViews();
    if (this.lNv == null) {
      return;
    }
    int i;
    if ((!bi.oW(this.lQD)) && (this.lQE != null))
    {
      i = this.lNv.size();
      if (i != 0) {
        break label449;
      }
      i = -1;
    }
    label449:
    for (;;)
    {
      int j = 0;
      int k = 0;
      for (;;)
      {
        if (j < this.lNv.size())
        {
          localObject = (MallOrderDetailObject.HelpCenter)this.lNv.get(j);
          TextView localTextView = new TextView(this.mContext);
          localTextView.setTextColor(this.mContext.getResources().getColor(a.c.black));
          localTextView.setTextSize(0, a.ad(this.mContext, a.d.NormalTextSize));
          localTextView.setIncludeFontPadding(false);
          localTextView.setText(((MallOrderDetailObject.HelpCenter)localObject).name);
          localTextView.setTag(localObject);
          localTextView.setGravity(17);
          localTextView.setOnClickListener(this.mOnClickListener);
          if (k == i) {
            localTextView.setTextColor(this.mContext.getResources().getColor(a.c.green_text_color));
          }
          paramView.addView(localTextView, new LinearLayout.LayoutParams(0, -2, 1.0F));
          if (k < i)
          {
            localObject = new View(this.mContext);
            ((View)localObject).setBackgroundColor(this.mContext.getResources().getColor(a.c.small_line_color));
            paramView.addView((View)localObject, new LinearLayout.LayoutParams(a.ad(this.mContext, a.d.DividerSmallHeight), -1));
          }
          k += 1;
          j += 1;
          continue;
          i = this.lNv.size() - 1;
          break;
        }
      }
      if ((bi.oW(this.lQD)) || (this.lQE == null)) {
        break;
      }
      Object localObject = new TextView(this.mContext);
      ((TextView)localObject).setTextColor(this.mContext.getResources().getColor(a.c.black));
      ((TextView)localObject).setTextSize(0, a.ad(this.mContext, a.d.NormalTextSize));
      ((TextView)localObject).setIncludeFontPadding(false);
      ((TextView)localObject).setText(this.lQD);
      ((TextView)localObject).setGravity(17);
      ((TextView)localObject).setOnClickListener(this.lQE);
      if (k == i) {
        ((TextView)localObject).setTextColor(this.mContext.getResources().getColor(a.c.green_text_color));
      }
      paramView.addView((View)localObject, new LinearLayout.LayoutParams(0, -2, 1.0F));
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/order/ui/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */