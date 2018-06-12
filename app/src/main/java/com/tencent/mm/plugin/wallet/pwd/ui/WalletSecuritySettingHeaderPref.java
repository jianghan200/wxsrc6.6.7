package com.tencent.mm.plugin.wallet.pwd.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;

public class WalletSecuritySettingHeaderPref
  extends Preference
{
  private MMActivity bGc;
  TextView gVv;
  private TextView gzS;
  String iRT;
  private TextView pik;
  TextView pil;
  String pim;
  String pio;
  View.OnClickListener pip = null;
  View.OnClickListener piq = null;
  
  public WalletSecuritySettingHeaderPref(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    this.bGc = ((MMActivity)paramContext);
  }
  
  public WalletSecuritySettingHeaderPref(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.bGc = ((MMActivity)paramContext);
    setLayoutResource(a.g.wallet_security_header_pref);
  }
  
  final void aL()
  {
    if ((!bi.oW(this.iRT)) && (this.gzS != null))
    {
      this.gzS.setText(this.iRT);
      this.gzS.setVisibility(0);
    }
    if ((!bi.oW(this.pim)) && (this.pik != null))
    {
      this.pik.setText(this.pim);
      this.pik.setVisibility(0);
    }
    if ((!bi.oW(this.pio)) && (this.pil != null))
    {
      this.pil.setText(this.pio);
      this.pil.setVisibility(0);
    }
    if ((bi.oW(this.pio)) && (this.pil != null)) {
      this.pil.setVisibility(8);
    }
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    x.v("MicroMsg.WalletSecuritySettingHeaderPref", "alvinluo onBindView");
    this.gzS = ((TextView)paramView.findViewById(a.f.main_content));
    this.pik = ((TextView)paramView.findViewById(a.f.desc));
    this.pil = ((TextView)paramView.findViewById(a.f.details_text));
    this.gVv = ((TextView)paramView.findViewById(a.f.wallet_security_close_btn));
    aL();
    if ((this.pil != null) && (this.pip != null)) {
      this.pil.setOnClickListener(this.pip);
    }
    if ((this.gVv != null) && (this.piq != null)) {
      this.gVv.setOnClickListener(this.piq);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet/pwd/ui/WalletSecuritySettingHeaderPref.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */