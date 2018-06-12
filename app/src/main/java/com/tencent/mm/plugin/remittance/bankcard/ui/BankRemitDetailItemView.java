package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.pluginsdk.ui.d.j;

public class BankRemitDetailItemView
  extends LinearLayout
{
  private TextView gsY;
  private TextView hVS;
  private boolean mvp = false;
  
  public BankRemitDetailItemView(Context paramContext)
  {
    this(paramContext, false);
  }
  
  public BankRemitDetailItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public BankRemitDetailItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  public BankRemitDetailItemView(Context paramContext, boolean paramBoolean)
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
  
  public final void a(String paramString, CharSequence paramCharSequence, boolean paramBoolean)
  {
    this.gsY.setText(paramString);
    if (paramBoolean)
    {
      this.hVS.setText(j.a(getContext(), paramCharSequence, this.hVS.getTextSize()));
      return;
    }
    this.hVS.setText(paramCharSequence);
  }
  
  public final void b(int paramInt, CharSequence paramCharSequence)
  {
    a(getContext().getString(paramInt), paramCharSequence, false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitDetailItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */