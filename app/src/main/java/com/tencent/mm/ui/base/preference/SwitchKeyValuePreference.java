package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.ui.tools.q;
import com.tencent.mm.w.a.h;

public class SwitchKeyValuePreference
  extends Preference
{
  public boolean bKe = true;
  private TextView lWL;
  
  public SwitchKeyValuePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SwitchKeyValuePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(a.h.mm_preference);
  }
  
  public final void aL()
  {
    if (this.lWL == null) {
      return;
    }
    if (this.bKe)
    {
      this.lWL.setTextColor(q.hb(this.mContext));
      return;
    }
    this.lWL.setTextColor(q.hc(this.mContext));
  }
  
  public final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.lWL = ((TextView)paramView.findViewById(16908304));
    aL();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/base/preference/SwitchKeyValuePreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */