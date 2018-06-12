package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.plugin.setting.a.f;
import com.tencent.mm.plugin.setting.a.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.preference.Preference;

public class SelfVuserPreference
  extends Preference
{
  Drawable drawable;
  private String mQB;
  String text;
  
  public SelfVuserPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SelfVuserPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(a.g.mm_preference);
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    ImageView localImageView = (ImageView)paramView.findViewById(a.f.image_iv);
    if (localImageView != null)
    {
      localImageView.setImageDrawable(this.drawable);
      x.d("MicroMsg.SelfVuserPreference", "onBindView set icon=" + this.drawable);
      if (!bi.oW(this.mQB)) {
        localImageView.setContentDescription(this.mQB);
      }
    }
    paramView = (TextView)paramView.findViewById(a.f.text_tv);
    if (paramView != null)
    {
      paramView.setVisibility(0);
      paramView.setText(this.text);
    }
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(a.f.content);
    localViewGroup.removeAllViews();
    View.inflate(this.mContext, a.g.mm_preference_self_vuser, localViewGroup);
    return paramViewGroup;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SelfVuserPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */