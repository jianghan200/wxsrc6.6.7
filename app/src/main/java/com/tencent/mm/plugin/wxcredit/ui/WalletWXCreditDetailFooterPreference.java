package com.tencent.mm.plugin.wxcredit.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.ui.base.preference.Preference;

public class WalletWXCreditDetailFooterPreference
  extends Preference
  implements View.OnClickListener
{
  private LayoutInflater Bc;
  View.OnClickListener mVS;
  private TextView qxk;
  private TextView qxl;
  
  public WalletWXCreditDetailFooterPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public WalletWXCreditDetailFooterPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.Bc = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    setLayoutResource(a.g.mm_preference);
  }
  
  public final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.qxk = ((TextView)paramView.findViewById(a.f.wallet_wxcredit_detail_username_tv));
    this.qxl = ((TextView)paramView.findViewById(a.f.wallet_wxcredit_detail_help_tv));
    this.qxk.setOnClickListener(this);
    this.qxl.setOnClickListener(this);
  }
  
  public void onClick(View paramView)
  {
    if (this.mVS != null) {
      this.mVS.onClick(paramView);
    }
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(a.f.content);
    localViewGroup.removeAllViews();
    this.Bc.inflate(a.g.wallet_wxcredit_detail_footer_pref, localViewGroup);
    return paramViewGroup;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditDetailFooterPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */