package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import com.tencent.mm.w.a.d;
import com.tencent.mm.w.a.g;
import com.tencent.mm.w.a.h;

public class CheckBoxPreference
  extends Preference
{
  private MMSwitchBtn kAq;
  private TextView piP;
  private int piQ = -1;
  private String piR = "";
  private int piS = 8;
  public boolean qpJ = false;
  
  public CheckBoxPreference(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public CheckBoxPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public CheckBoxPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(a.h.mm_preference_summary_checkbox);
  }
  
  public void cq(String paramString, int paramInt)
  {
    this.piQ = paramInt;
    this.piR = paramString;
    if (this.piP != null)
    {
      if (paramInt > 0) {
        this.piP.setBackgroundResource(this.piQ);
      }
      if (!TextUtils.isEmpty(this.piR)) {
        this.piP.setText(this.piR);
      }
    }
  }
  
  public final boolean isChecked()
  {
    if (this.kAq != null) {
      return this.kAq.uGQ;
    }
    return this.qpJ;
  }
  
  public final void lM(boolean paramBoolean)
  {
    if (this.kAq != null)
    {
      this.qpJ = paramBoolean;
      this.kAq.setCheck(paramBoolean);
    }
  }
  
  public void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.kAq = ((MMSwitchBtn)paramView.findViewById(a.g.checkbox));
    this.kAq.setSwitchListener(new CheckBoxPreference.1(this));
    this.kAq.setCheck(this.qpJ);
    if (!isEnabled())
    {
      this.kAq.setEnabled(false);
      ((TextView)paramView.findViewById(16908310)).setTextColor(paramView.getResources().getColor(a.d.black_text_color_disabled));
    }
    this.piP = ((TextView)paramView.findViewById(a.g.tipicon));
    cq(this.piR, this.piQ);
    zi(this.piS);
  }
  
  public void zi(int paramInt)
  {
    this.piS = paramInt;
    if (this.piP != null) {
      this.piP.setVisibility(this.piS);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/base/preference/CheckBoxPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */