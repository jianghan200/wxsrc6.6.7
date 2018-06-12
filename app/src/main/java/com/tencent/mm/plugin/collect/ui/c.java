package com.tencent.mm.plugin.collect.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.kernel.g;
import com.tencent.mm.l.a;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.b;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.base.preference.Preference;

public final class c
  extends Preference
{
  String cYO = null;
  String cZH = null;
  private TextView gsY = null;
  private ImageView hVP = null;
  private Context mContext = null;
  private View mView = null;
  
  public c(Context paramContext)
  {
    super(paramContext);
    this.mContext = paramContext;
    setLayoutResource(a.g.collect_pay_info_preference);
  }
  
  public c(Context paramContext, int paramInt)
  {
    super(paramContext);
    this.mContext = paramContext;
    setLayoutResource(paramInt);
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
    this.gsY = ((TextView)paramView.findViewById(16908310));
    this.hVP = ((ImageView)paramView.findViewById(a.f.collect_payer_avatar));
    this.gsY.setText(j.a(this.mContext, this.cZH, this.gsY.getTextSize()));
    if (!bi.oW(this.cYO))
    {
      this.hVP.setVisibility(0);
      g.Ek();
      paramView = ((i)g.l(i.class)).FR().Yf(this.cYO);
      if ((paramView == null) || ((int)paramView.dhP <= 0))
      {
        x.d("MicroMsg.CollectPayInfoPreference", "Receiver in contactStg and try to get contact");
        long l = bi.VF();
        am.a.dBr.a(this.cYO, "", new c.1(this, l));
        return;
      }
      a.b.a(this.hVP, this.cYO);
      return;
    }
    this.hVP.setVisibility(8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/collect/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */