package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.w.a.g;
import com.tencent.mm.w.a.h;

public class CheckPreference
  extends Preference
{
  private TextView piP;
  private int piQ = -1;
  private String piR = "";
  private int piS = 8;
  public boolean qpJ = false;
  private CheckBox tBF;
  public int tBG = -1;
  
  public CheckPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public CheckPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(a.h.mm_preference_summary_check);
  }
  
  public final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.tBF = ((CheckBox)paramView.findViewById(a.g.checkbox));
    this.tBF.setChecked(this.qpJ);
    this.piP = ((TextView)paramView.findViewById(a.g.tipicon));
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
    paramView = (LinearLayout.LayoutParams)this.tBF.getLayoutParams();
    if (-1 != this.tBG) {
      paramView.setMargins(paramView.leftMargin, paramView.topMargin, this.tBG, paramView.bottomMargin);
    }
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    return super.onCreateView(paramViewGroup);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/base/preference/CheckPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */