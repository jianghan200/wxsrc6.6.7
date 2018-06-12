package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.mm.ui.y;
import com.tencent.mm.w.a.h;

public class TextButtonPreference
  extends Preference
{
  public TextButtonPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public TextButtonPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final int getLayoutResource()
  {
    return a.h.mm_preference_button;
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    paramView = (TextView)paramView.findViewById(16908310);
    if (paramView != null)
    {
      paramView.setText(getTitle());
      paramView.setEnabled(isEnabled());
    }
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    super.onCreateView(paramViewGroup);
    return y.gq(this.mContext).inflate(a.h.mm_preference_button, paramViewGroup, false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/base/preference/TextButtonPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */