package com.tencent.mm.plugin.aa.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.ui.y;

public class LaunchAAByPersonNameAmountRow
  extends LinearLayout
{
  TextView eBQ;
  TextView eCM;
  private View eCO;
  
  public LaunchAAByPersonNameAmountRow(Context paramContext)
  {
    super(paramContext);
    init(paramContext);
  }
  
  public LaunchAAByPersonNameAmountRow(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  public LaunchAAByPersonNameAmountRow(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private void init(Context paramContext)
  {
    y.gq(paramContext).inflate(a.g.launch_aa_by_person_name_amount_row, this, true);
    this.eCM = ((TextView)findViewById(a.f.username));
    this.eBQ = ((TextView)findViewById(a.f.amount));
    this.eCO = findViewById(a.f.divider);
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
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/aa/ui/LaunchAAByPersonNameAmountRow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */