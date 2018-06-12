package com.tencent.mm.plugin.recharge.ui.form;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
import com.tencent.mm.sdk.platformtools.x;

public class InstantAutoCompleteTextView
  extends AutoCompleteTextView
{
  private boolean mqO;
  
  public InstantAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public InstantAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void dismissDropDown()
  {
    super.dismissDropDown();
    x.d("TestAutoCompleteTextView", "dismiss");
  }
  
  public boolean enoughToFilter()
  {
    return (this.mqO) || (super.enoughToFilter());
  }
  
  public void setShowAlways(boolean paramBoolean)
  {
    this.mqO = paramBoolean;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/recharge/ui/form/InstantAutoCompleteTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */