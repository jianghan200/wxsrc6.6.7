package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.bp.a;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.base.preference.Preference;

public class ContactRemarkAndLabelPreference
  extends Preference
{
  private TextView gsY;
  private String iRT;
  private TextView lVp;
  private TextView lVq;
  private boolean lVr = false;
  private String lVs;
  private String lVt;
  private Context mContext;
  
  public ContactRemarkAndLabelPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
  }
  
  public ContactRemarkAndLabelPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    setLayoutResource(R.i.mm_preference);
  }
  
  public final void onBindView(View paramView)
  {
    this.gsY = ((TextView)paramView.findViewById(R.h.title));
    this.lVp = ((TextView)paramView.findViewById(R.h.remark));
    this.lVq = ((TextView)paramView.findViewById(R.h.label));
    RelativeLayout.LayoutParams localLayoutParams;
    if ((this.gsY != null) && (!bi.oW(this.iRT)))
    {
      this.gsY.setVisibility(0);
      this.gsY.setText(this.iRT);
      localLayoutParams = (RelativeLayout.LayoutParams)this.gsY.getLayoutParams();
      localLayoutParams.width = a.ad(this.mContext, R.f.FixedTitleWidth);
      this.gsY.setLayoutParams(localLayoutParams);
    }
    if (this.lVp != null) {
      if (!this.lVr)
      {
        this.lVp.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        i = 0;
        if (!bi.oW(this.lVs))
        {
          this.lVp.setVisibility(0);
          this.lVp.setText(j.a(this.mContext, bi.oV(this.lVs), this.lVp.getTextSize()));
        }
      }
    }
    for (int i = 1;; i = 0)
    {
      int j = i;
      if (this.lVq != null)
      {
        j = i;
        if (!bi.oW(this.lVt))
        {
          j = i | 0x2;
          this.lVq.setVisibility(0);
          this.lVq.setText(this.lVt);
        }
      }
      if (j == 1) {
        ((RelativeLayout.LayoutParams)this.lVp.getLayoutParams()).addRule(15);
      }
      if (j == 2)
      {
        localLayoutParams = (RelativeLayout.LayoutParams)this.lVq.getLayoutParams();
        localLayoutParams.addRule(3, 0);
        localLayoutParams.addRule(15);
      }
      super.onBindView(paramView);
      return;
      this.lVp.setVisibility(0);
      this.lVp.setCompoundDrawablesWithIntrinsicBounds(R.k.card_photoicon, 0, 0, 0);
      i = 1;
      break;
    }
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(R.i.mm_preference_content_remark_and_label_info, localViewGroup);
    return paramViewGroup;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/ContactRemarkAndLabelPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */