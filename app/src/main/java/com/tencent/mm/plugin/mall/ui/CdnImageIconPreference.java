package com.tencent.mm.plugin.mall.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.Preference;

public class CdnImageIconPreference
  extends IconPreference
{
  String iconUrl;
  private CdnImageView kYr;
  
  public CdnImageIconPreference(Context paramContext)
  {
    super(paramContext);
  }
  
  public CdnImageIconPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public CdnImageIconPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.kYr = ((CdnImageView)paramView.findViewById(a.f.image_iv));
    if (!bi.oW(this.iconUrl))
    {
      this.kYr.setUseSdcardCache(true);
      this.kYr.setUrl(this.iconUrl);
      this.kYr.setVisibility(0);
    }
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(com.tencent.mm.w.a.g.content);
    localViewGroup.removeAllViews();
    View.inflate(this.mContext, com.tencent.mm.plugin.wxpay.a.g.cdn_preference_content_icon, localViewGroup);
    return paramViewGroup;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/mall/ui/CdnImageIconPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */