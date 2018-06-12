package com.tencent.mm.ui.contact;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.preference.Preference;

public class DomainMailListPreference
  extends Preference
{
  private TextView eBO;
  private boolean iAc;
  private String title;
  private String ujp;
  private TextView ujq;
  private TextView ujr;
  private TextView ujs;
  
  public DomainMailListPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public DomainMailListPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private void init()
  {
    this.iAc = false;
    this.title = "";
    this.ujp = "";
  }
  
  public final void onBindView(View paramView)
  {
    this.eBO = ((TextView)paramView.findViewById(R.h.title));
    this.ujq = ((TextView)paramView.findViewById(R.h.firstDomainMail));
    this.ujr = ((TextView)paramView.findViewById(R.h.secondDomainMail));
    this.ujs = ((TextView)paramView.findViewById(R.h.thirdDomainMail));
    this.iAc = true;
    if (!this.iAc)
    {
      x.e("MicroMsg.DomainMailPreference", "initView : unbind view");
      super.onBindView(paramView);
      return;
    }
    this.eBO.setText(ai.oV(this.title));
    String[] arrayOfString = this.ujp.split(";");
    if (ai.oV(this.ujp).length() <= 0)
    {
      this.ujq.setVisibility(8);
      this.ujr.setVisibility(8);
    }
    label174:
    label243:
    label253:
    for (;;)
    {
      this.ujs.setVisibility(8);
      break;
      if (arrayOfString.length > 0)
      {
        this.ujq.setVisibility(0);
        this.ujq.setText(ai.oV(arrayOfString[0]));
        if (arrayOfString.length <= 1) {
          break label243;
        }
        this.ujr.setVisibility(0);
        this.ujr.setText(ai.oV(arrayOfString[1]));
      }
      for (;;)
      {
        if (arrayOfString.length <= 2) {
          break label253;
        }
        this.ujs.setVisibility(0);
        this.ujs.setText(ai.oV(arrayOfString[2]));
        break;
        this.ujq.setVisibility(8);
        break label174;
        this.ujr.setVisibility(8);
      }
    }
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(R.i.mm_preference_content_domainmaillist, localViewGroup);
    return paramViewGroup;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/contact/DomainMailListPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */