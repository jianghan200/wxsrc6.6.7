package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.ui.base.preference.Preference;

public final class d
  extends Preference
{
  public View.OnClickListener iFK;
  private View ido;
  public String jNk;
  public boolean jNo;
  public int lQm = Integer.MAX_VALUE;
  private int lQn = -1;
  private int lQo = -1;
  private View mView = null;
  
  public d(Context paramContext)
  {
    super(paramContext, null);
    setLayoutResource(a.g.key_value_preference);
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
    Object localObject = (TextView)paramView.findViewById(a.f.key_pref_tv);
    TextView localTextView = (TextView)paramView.findViewById(a.f.value_pref_tv);
    ((TextView)localObject).setText(getTitle());
    this.ido = paramView;
    if (this.lQm != Integer.MAX_VALUE) {
      localTextView.setTextColor(this.lQm);
    }
    if (this.jNo)
    {
      if ((this.lQn >= 0) && (this.lQo > 0))
      {
        paramView = new h(this.mContext);
        localObject = new SpannableString(this.jNk);
        paramView.pvm = new d.1(this);
        localTextView.setMovementMethod(LinkMovementMethod.getInstance());
        ((SpannableString)localObject).setSpan(paramView, this.lQn, this.lQo, 33);
        localTextView.setText((CharSequence)localObject);
        return;
      }
      if (this.lQm != Integer.MAX_VALUE) {
        localTextView.setTextColor(this.lQm);
      }
      for (;;)
      {
        localTextView.setOnClickListener(this.iFK);
        localTextView.setText(j.a(this.mContext, this.jNk, localTextView.getTextSize()));
        return;
        localTextView.setTextColor(this.mContext.getResources().getColor(a.c.mall_link_color));
      }
    }
    localTextView.setOnClickListener(null);
    localTextView.setText(j.a(this.mContext, this.jNk, localTextView.getTextSize()));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */