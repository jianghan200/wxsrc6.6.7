package com.tencent.mm.plugin.wxcredit.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.ui.base.preference.Preference;

public class WalletWXCreditDetailHeaderPreference
  extends Preference
{
  private LayoutInflater Bc;
  TextView eBQ;
  TextView qxm;
  
  public WalletWXCreditDetailHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public WalletWXCreditDetailHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.Bc = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    setLayoutResource(a.g.mm_preference);
  }
  
  public final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.eBQ = ((TextView)paramView.findViewById(a.f.wallet_wxcredit_detail_left_amount));
    this.qxm = ((TextView)paramView.findViewById(a.f.wallet_wxcredit_update_tips));
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(a.f.content);
    localViewGroup.removeAllViews();
    this.Bc.inflate(a.g.wallet_wxcredit_detail_header_pref, localViewGroup);
    return paramViewGroup;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditDetailHeaderPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */