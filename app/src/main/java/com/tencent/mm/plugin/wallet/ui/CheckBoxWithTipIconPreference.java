package com.tencent.mm.plugin.wallet.ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;

public class CheckBoxWithTipIconPreference
  extends CheckBoxPreference
{
  private TextView piP;
  private int piQ = -1;
  private String piR = "";
  private int piS = 8;
  
  public CheckBoxWithTipIconPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public CheckBoxWithTipIconPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(a.g.mm_preference_summary_icontip_checkbox);
  }
  
  public final void cq(String paramString, int paramInt)
  {
    this.piQ = paramInt;
    this.piR = paramString;
    if (this.piP != null)
    {
      if (this.piQ > 0) {
        this.piP.setBackgroundResource(this.piQ);
      }
      if (!TextUtils.isEmpty(this.piR)) {
        this.piP.setText(this.piR);
      }
    }
  }
  
  public final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.piP = ((TextView)paramView.findViewById(a.f.tipicon));
    cq(this.piR, this.piQ);
    zi(this.piS);
  }
  
  public final void zi(int paramInt)
  {
    this.piS = paramInt;
    if (this.piP != null) {
      this.piP.setVisibility(paramInt);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/ui/CheckBoxWithTipIconPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */