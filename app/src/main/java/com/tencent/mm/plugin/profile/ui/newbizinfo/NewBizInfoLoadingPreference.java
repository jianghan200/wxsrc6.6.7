package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.profile.ui.newbizinfo.b.c;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;

public class NewBizInfoLoadingPreference
  extends Preference
{
  private MMActivity bGc;
  private View ern;
  private TextView fAK;
  private boolean iAc = false;
  private ProgressBar lYF;
  boolean lYG = false;
  c lYt;
  int state = 1;
  
  public NewBizInfoLoadingPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.bGc = ((MMActivity)paramContext);
    this.iAc = false;
  }
  
  public NewBizInfoLoadingPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.bGc = ((MMActivity)paramContext);
    this.iAc = false;
  }
  
  final void initView()
  {
    if (!this.iAc) {
      return;
    }
    if (this.state == 1)
    {
      this.ern.setVisibility(0);
      this.lYF.setVisibility(0);
      this.fAK.setVisibility(8);
      return;
    }
    if (this.state == 2)
    {
      this.ern.setVisibility(0);
      SpannableString localSpannableString = j.a(this.bGc, this.lYt.field_banReason, (int)this.fAK.getTextSize(), 1);
      this.fAK.setText(localSpannableString);
      this.fAK.setMovementMethod(LinkMovementMethod.getInstance());
      this.fAK.setVisibility(0);
      this.lYF.setVisibility(8);
      return;
    }
    if (this.state == 3)
    {
      this.ern.setVisibility(0);
      this.fAK.setText(this.bGc.getString(R.l.contact_info_time_expired));
      this.fAK.setVisibility(0);
      this.lYF.setVisibility(8);
      return;
    }
    this.ern.setVisibility(8);
  }
  
  public final void onBindView(View paramView)
  {
    this.ern = paramView.findViewById(R.h.new_bizinfo_container);
    this.fAK = ((TextView)paramView.findViewById(R.h.new_bizinfo_desc_tv));
    this.lYF = ((ProgressBar)paramView.findViewById(R.h.new_bizinfo_loading));
    this.iAc = true;
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoLoadingPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */