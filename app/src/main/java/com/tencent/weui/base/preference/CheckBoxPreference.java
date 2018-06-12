package com.tencent.weui.base.preference;

import android.content.Context;
import android.content.res.Resources;
import android.preference.Preference;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.bw.a.c;
import com.tencent.mm.bw.a.f;
import com.tencent.mm.bw.a.g;
import com.tencent.mm.ui.widget.MMSwitchBtn;

public class CheckBoxPreference
  extends Preference
{
  private MMSwitchBtn kAq;
  private TextView piP;
  private int piQ = -1;
  private String piR = "";
  private int piS = 8;
  boolean qpJ = false;
  
  public CheckBoxPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public CheckBoxPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(a.g.mm_preference_summary_checkbox);
  }
  
  public final boolean isChecked()
  {
    if (this.kAq != null) {
      return this.kAq.uGQ;
    }
    return this.qpJ;
  }
  
  public void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.kAq = ((MMSwitchBtn)paramView.findViewById(a.f.checkbox));
    this.kAq.setSwitchListener(new CheckBoxPreference.1(this));
    this.kAq.setCheck(this.qpJ);
    if (!isEnabled())
    {
      this.kAq.setEnabled(false);
      ((TextView)paramView.findViewById(16908310)).setTextColor(paramView.getResources().getColor(a.c.black_text_color_disabled));
    }
    this.piP = ((TextView)paramView.findViewById(a.f.tipicon));
    paramView = this.piR;
    int i = this.piQ;
    this.piQ = i;
    this.piR = paramView;
    if (this.piP != null)
    {
      if (i > 0) {
        this.piP.setBackgroundResource(this.piQ);
      }
      if (!TextUtils.isEmpty(this.piR)) {
        this.piP.setText(this.piR);
      }
    }
    this.piS = this.piS;
    if (this.piP != null) {
      this.piP.setVisibility(this.piS);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/weui/base/preference/CheckBoxPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */