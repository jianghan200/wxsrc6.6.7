package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.mm.plugin.order.c.a;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.ui.base.preference.Preference;

public final class f
  extends Preference
{
  private View.OnClickListener iFK;
  private String jNk;
  private boolean jNo;
  private int lQm = Integer.MAX_VALUE;
  private int lQn = -1;
  private int lQo = -1;
  private View mView = null;
  
  public f(Context paramContext)
  {
    super(paramContext);
    setLayoutResource(a.g.mall_order_common_pref);
  }
  
  public final void Jw(String paramString)
  {
    try
    {
      this.lQm = Color.parseColor(paramString);
      return;
    }
    catch (Exception paramString)
    {
      this.lQm = Integer.MAX_VALUE;
    }
  }
  
  public final void a(String paramString, int paramInt1, int paramInt2, View.OnClickListener paramOnClickListener)
  {
    this.jNk = paramString;
    this.jNo = true;
    this.lQn = paramInt1;
    this.lQo = paramInt2;
    this.iFK = paramOnClickListener;
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
    Object localObject = (TextView)paramView.findViewById(a.f.mall_order_common_pref_title);
    paramView = (TextView)paramView.findViewById(a.f.mall_order_common_pref_content);
    ((TextView)localObject).setText(getTitle());
    if (this.lQm != Integer.MAX_VALUE) {
      paramView.setTextColor(this.lQm);
    }
    if (this.jNo)
    {
      if ((this.lQn >= 0) && (this.lQo > 0))
      {
        localObject = new a(this.mContext);
        SpannableString localSpannableString = new SpannableString(this.jNk);
        ((a)localObject).lQF = new f.1(this);
        paramView.setMovementMethod(LinkMovementMethod.getInstance());
        localSpannableString.setSpan(localObject, this.lQn, this.lQo, 33);
        paramView.setText(localSpannableString);
        return;
      }
      paramView.setTextColor(this.mContext.getResources().getColor(a.c.mall_link_color));
      paramView.setOnClickListener(this.iFK);
      paramView.setText(j.a(this.mContext, this.jNk, paramView.getTextSize()));
      return;
    }
    paramView.setOnClickListener(null);
    paramView.setText(j.a(this.mContext, this.jNk, paramView.getTextSize()));
  }
  
  public final void setContent(String paramString)
  {
    this.jNk = paramString;
    this.jNo = false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/order/ui/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */