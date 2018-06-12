package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import com.tencent.mm.plugin.comm.a.f;
import com.tencent.mm.ui.base.preference.Preference;

public class ContactListCustomPreference
  extends Preference
{
  int background = -1;
  View.OnClickListener mtE;
  private View pYk;
  private final View.OnTouchListener qJx = new ContactListCustomPreference.1(this);
  
  public ContactListCustomPreference(Context paramContext)
  {
    super(paramContext);
    setLayoutResource(a.f.mm_preference_contact_list_custom);
  }
  
  public ContactListCustomPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setLayoutResource(a.f.mm_preference_contact_list_custom);
  }
  
  public ContactListCustomPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(a.f.mm_preference_contact_list_custom);
  }
  
  public final void onBindView(View paramView)
  {
    ViewGroup localViewGroup = (ViewGroup)paramView;
    if ((this.pYk != null) && (this.pYk != null))
    {
      localViewGroup.removeAllViews();
      if (this.pYk.getParent() != null) {
        ((ViewGroup)this.pYk.getParent()).removeAllViews();
      }
      localViewGroup.addView(this.pYk);
      if (this.mtE == null) {
        break label85;
      }
      localViewGroup.setOnClickListener(this.mtE);
    }
    for (;;)
    {
      if (this.background >= 0) {
        paramView.setBackgroundResource(this.background);
      }
      return;
      label85:
      localViewGroup.setOnTouchListener(this.qJx);
    }
  }
  
  public final void setCustomView(View paramView)
  {
    if (paramView == null) {
      return;
    }
    this.pYk = paramView;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/applet/ContactListCustomPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */