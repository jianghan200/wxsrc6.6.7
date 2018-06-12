package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.mm.w.a.h;

public class TextPreference
  extends Preference
{
  private Context context;
  protected TextView ih;
  protected CharSequence mText;
  protected int rA;
  
  public TextPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
    setLayoutResource(a.h.mm_preference_info);
  }
  
  private void aL()
  {
    if (this.ih == null) {
      return;
    }
    this.ih.setText(this.mText);
    this.ih.setGravity(this.rA);
  }
  
  public final void N(CharSequence paramCharSequence)
  {
    this.mText = paramCharSequence;
    this.rA = 17;
    aL();
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.ih = ((TextView)paramView.findViewById(16908310));
    aL();
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    return super.onCreateView(paramViewGroup);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/base/preference/TextPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */