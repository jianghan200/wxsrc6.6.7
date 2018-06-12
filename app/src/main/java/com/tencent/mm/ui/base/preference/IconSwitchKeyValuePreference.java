package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.ui.tools.q;
import com.tencent.mm.w.a.j;

public class IconSwitchKeyValuePreference
  extends IconPreference
{
  private TextView lWL;
  private int status = 0;
  
  public IconSwitchKeyValuePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public IconSwitchKeyValuePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private void aL()
  {
    if (this.lWL == null) {
      return;
    }
    int i = BackwardSupportUtil.b.b(this.mContext, 2.0F);
    this.lWL.setTextColor(q.hc(this.mContext));
    if (this.status == 0)
    {
      this.lWL.setCompoundDrawablesWithIntrinsicBounds(a.j.status_accountunkey, 0, 0, 0);
      this.lWL.setCompoundDrawablePadding(i);
      return;
    }
    if (this.status == 1)
    {
      this.lWL.setCompoundDrawablesWithIntrinsicBounds(a.j.status_accountkey, 0, 0, 0);
      this.lWL.setCompoundDrawablePadding(i);
      return;
    }
    if (this.status == 2)
    {
      this.lWL.setCompoundDrawablesWithIntrinsicBounds(a.j.status_accountkey_off, 0, 0, 0);
      this.lWL.setCompoundDrawablePadding(i);
      return;
    }
    this.lWL.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
  }
  
  public final void Ey(int paramInt)
  {
    this.status = paramInt;
    aL();
  }
  
  public final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.lWL = ((TextView)paramView.findViewById(16908304));
    aL();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/base/preference/IconSwitchKeyValuePreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */