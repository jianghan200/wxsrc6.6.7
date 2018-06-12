package com.tencent.mm.plugin.setting.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.setting.a.f;
import com.tencent.mm.plugin.setting.a.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.ui.base.preference.Preference;

public final class HeadImgNewPreference
  extends Preference
{
  public ImageView gwj;
  private int height = -1;
  private TextView mVP;
  private View mVQ;
  public String mVR;
  public View.OnClickListener mVS;
  public boolean mVT = false;
  private boolean mVU = false;
  
  public HeadImgNewPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public HeadImgNewPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(a.g.mm_preference);
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    if (this.gwj == null) {
      this.gwj = ((ImageView)paramView.findViewById(a.f.image_headimg));
    }
    if (this.mVP == null) {
      this.mVP = ((TextView)paramView.findViewById(a.f.no_header_icon_tip));
    }
    if (this.mVQ == null) {
      this.mVQ = paramView.findViewById(a.f.mask_header_icon);
    }
    if (this.mVS != null) {
      this.mVQ.setOnClickListener(this.mVS);
    }
    if (this.mVR != null)
    {
      a.b.a(this.gwj, this.mVR);
      this.mVR = null;
    }
    if (!this.mVT)
    {
      this.mVQ.setVisibility(8);
      this.mVP.setVisibility(0);
    }
    for (;;)
    {
      paramView = (RelativeLayout)paramView.findViewById(a.f.mm_preference_ll_id);
      if (this.height != -1) {
        paramView.setMinimumHeight(this.height);
      }
      return;
      this.mVP.setVisibility(8);
      this.mVQ.setVisibility(0);
    }
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(a.f.content);
    localViewGroup.removeAllViews();
    if (this.mVU) {
      View.inflate(this.mContext, a.g.more_tab_personal_info, localViewGroup);
    }
    for (;;)
    {
      this.gwj = ((ImageView)paramViewGroup.findViewById(a.f.image_headimg));
      this.mVP = ((TextView)paramViewGroup.findViewById(a.f.no_header_icon_tip));
      this.mVQ = paramViewGroup.findViewById(a.f.mask_header_icon);
      return paramViewGroup;
      View.inflate(this.mContext, a.g.mm_preference_content_headimg_new, localViewGroup);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/widget/HeadImgNewPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */