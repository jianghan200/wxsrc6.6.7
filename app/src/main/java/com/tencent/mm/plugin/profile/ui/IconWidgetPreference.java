package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.base.preference.Preference;

public class IconWidgetPreference
  extends Preference
{
  private ImageView lWX = null;
  private int lWY = -1;
  private Bitmap lWZ = null;
  
  public IconWidgetPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public IconWidgetPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(R.i.mm_preference);
    setWidgetLayoutResource(0);
  }
  
  public final void C(Bitmap paramBitmap)
  {
    this.lWZ = paramBitmap;
    if (this.lWX != null) {
      this.lWX.setImageBitmap(paramBitmap);
    }
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.lWX = ((ImageView)paramView.findViewById(R.h.pref_widget_right_icon));
    if (this.lWX != null)
    {
      this.lWX.setVisibility(8);
      if (this.lWY == -1) {
        break label63;
      }
      this.lWX.setImageResource(this.lWY);
      this.lWX.setVisibility(0);
    }
    label63:
    while (this.lWZ == null) {
      return;
    }
    this.lWX.setImageBitmap(this.lWZ);
    this.lWX.setVisibility(0);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    View.inflate(this.mContext, R.i.mm_preference_widget_icon, localViewGroup);
    return paramViewGroup;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/IconWidgetPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */