package com.tencent.mm.plugin.remittance.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;

public class F2fDynamicCodeItemLayout
  extends LinearLayout
{
  TextView idh;
  TextView myG;
  
  public F2fDynamicCodeItemLayout(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public F2fDynamicCodeItemLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public F2fDynamicCodeItemLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private void init()
  {
    View localView = LayoutInflater.from(getContext()).inflate(a.g.remittance_f2f_dynamic_code_item_layout, this);
    this.myG = ((TextView)localView.findViewById(a.f.rfdi_left_tv));
    this.idh = ((TextView)localView.findViewById(a.f.rfdi_right_tv));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/remittance/ui/F2fDynamicCodeItemLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */