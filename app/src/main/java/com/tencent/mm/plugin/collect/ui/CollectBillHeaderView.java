package com.tencent.mm.plugin.collect.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.ui.y;
import com.tencent.mm.wallet_core.ui.WalletTextView;

public class CollectBillHeaderView
  extends LinearLayout
{
  TextView hVS;
  TextView hWO;
  WalletTextView hWP;
  private TextView hWQ;
  
  public CollectBillHeaderView(Context paramContext)
  {
    super(paramContext);
    init(paramContext);
  }
  
  public CollectBillHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  public CollectBillHeaderView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private void init(Context paramContext)
  {
    paramContext = y.gq(paramContext).inflate(a.g.collect_bill_header, this);
    this.hWO = ((TextView)paramContext.findViewById(a.f.collect_bill_header_date_tv));
    this.hWQ = ((TextView)paramContext.findViewById(a.f.collect_bill_header_currency_tv));
    this.hWP = ((WalletTextView)paramContext.findViewById(a.f.collect_bill_header_money_tv));
    this.hVS = ((TextView)paramContext.findViewById(a.f.collect_bill_header_desc_tv));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/collect/ui/CollectBillHeaderView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */