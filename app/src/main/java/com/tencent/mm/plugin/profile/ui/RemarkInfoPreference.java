package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;

public class RemarkInfoPreference
  extends Preference
{
  private MMActivity bGc;
  private TextView eBO;
  private ImageView gxd;
  private TextView lWL;
  private boolean lXU = false;
  private String summary;
  private String title;
  
  public RemarkInfoPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.bGc = ((MMActivity)paramContext);
  }
  
  public RemarkInfoPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(R.i.mm_preference);
    setWidgetLayoutResource(R.i.mm_preference_submenu);
  }
  
  public final void onBindView(View paramView)
  {
    this.eBO = ((TextView)paramView.findViewById(R.h.title));
    this.lWL = ((TextView)paramView.findViewById(R.h.summary));
    this.gxd = ((ImageView)paramView.findViewById(R.h.image_iv));
    if (!this.lXU) {
      this.gxd.setVisibility(8);
    }
    for (;;)
    {
      if (this.eBO != null) {
        this.eBO.setText(this.title);
      }
      if (this.lWL != null) {
        this.lWL.setText(this.summary);
      }
      super.onBindView(paramView);
      return;
      this.gxd.setVisibility(0);
    }
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(R.i.mm_preference_content_remark_info, localViewGroup);
    return paramViewGroup;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/RemarkInfoPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */