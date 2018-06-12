package com.tencent.mm.plugin.aa.ui;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.y;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;

public class LaunchAAByPersonAmountSelectRow
  extends LinearLayout
{
  private ImageView eBM;
  private TextView eCM;
  private WalletFormView eCN;
  private View eCO;
  private TextWatcher eCP = null;
  private String username;
  
  public LaunchAAByPersonAmountSelectRow(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  public LaunchAAByPersonAmountSelectRow(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private void init(Context paramContext)
  {
    y.gq(paramContext).inflate(a.g.launch_aa_by_person_amount_select_row, this, true);
    this.eBM = ((ImageView)findViewById(a.f.avatar));
    this.eCM = ((TextView)findViewById(a.f.username));
    this.eCN = ((WalletFormView)findViewById(a.f.money_edit));
    this.eCO = findViewById(a.f.divider);
  }
  
  public double getAmount()
  {
    String str = this.eCN.getText().toString();
    if ((bi.oW(str)) || ("".equals(str))) {
      return 0.0D;
    }
    return bi.getDouble(str, 0.0D);
  }
  
  public WalletFormView getMoneyEdit()
  {
    return this.eCN;
  }
  
  public String getUsername()
  {
    return this.username;
  }
  
  public void setDividerVisible(boolean paramBoolean)
  {
    View localView = this.eCO;
    if (paramBoolean) {}
    for (int i = 0;; i = 8)
    {
      localView.setVisibility(i);
      return;
    }
  }
  
  public void setTextWatcher(TextWatcher paramTextWatcher)
  {
    this.eCP = paramTextWatcher;
    this.eCN.a(paramTextWatcher);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectRow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */