package com.tencent.mm.plugin.wallet.balance.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;

public class WalletBalanceFetchResultItemView
  extends LinearLayout
{
  private TextView gsY;
  private TextView hVS;
  private boolean mvp = false;
  
  public WalletBalanceFetchResultItemView(Context paramContext)
  {
    this(paramContext, false);
  }
  
  public WalletBalanceFetchResultItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public WalletBalanceFetchResultItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  public WalletBalanceFetchResultItemView(Context paramContext, boolean paramBoolean)
  {
    super(paramContext);
    this.mvp = paramBoolean;
    init();
  }
  
  private void init()
  {
    if (this.mvp) {
      inflate(getContext(), a.g.bank_remit_detail_item_money_layout, this);
    }
    for (;;)
    {
      this.gsY = ((TextView)findViewById(a.f.brdi_title_tv));
      this.hVS = ((TextView)findViewById(a.f.brdi_desc_tv));
      return;
      inflate(getContext(), a.g.bank_remit_detail_item_comm_layout, this);
    }
  }
  
  public final void b(int paramInt, CharSequence paramCharSequence)
  {
    String str = getContext().getString(paramInt);
    this.gsY.setText(str);
    this.hVS.setText(paramCharSequence);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceFetchResultItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */