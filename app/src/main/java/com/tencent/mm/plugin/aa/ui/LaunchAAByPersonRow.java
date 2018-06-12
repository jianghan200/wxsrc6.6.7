package com.tencent.mm.plugin.aa.ui;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

public class LaunchAAByPersonRow
  extends LinearLayout
{
  private ImageView eDn;
  private TextView eDo;
  private TextView eDp;
  private WalletFormView eDq;
  private TextView eDr;
  private String username;
  
  public LaunchAAByPersonRow(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public LaunchAAByPersonRow(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private void init()
  {
    inflate(getContext(), a.g.launch_aa_by_person_row, this);
    this.eDn = ((ImageView)findViewById(a.f.aa_avatar));
    this.eDo = ((TextView)findViewById(a.f.aa_username));
    this.eDq = ((WalletFormView)findViewById(a.f.launch_aa_by_person_money_edit));
    this.eDp = ((TextView)findViewById(a.f.launch_aa_by_person_money_unit));
    this.eDr = ((TextView)findViewById(a.f.my_self_note));
  }
  
  public WalletFormView getAmountEditView()
  {
    return this.eDq;
  }
  
  public double getMoneyAmount()
  {
    String str = this.eDq.getText().toString();
    if ((bi.oW(str)) || ("".equals(str))) {
      return 0.0D;
    }
    return bi.getDouble(str, 0.0D);
  }
  
  public String getUsername()
  {
    return this.username;
  }
  
  public void setAmountTextChangeWatcher(TextWatcher paramTextWatcher)
  {
    if (paramTextWatcher != null) {
      this.eDq.a(paramTextWatcher);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/aa/ui/LaunchAAByPersonRow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */