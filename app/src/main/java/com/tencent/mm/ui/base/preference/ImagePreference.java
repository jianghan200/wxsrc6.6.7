package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.mm.w.a.g;
import com.tencent.mm.w.a.h;
import com.tencent.mm.w.a.m;

public final class ImagePreference
  extends Preference
{
  private ImageView lWM = null;
  private e tCt = new e();
  
  public ImagePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ImagePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(a.h.mm_preference_image);
    setWidgetLayoutResource(a.h.mm_preference_submenu);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.m.ImagePreference);
    paramInt = paramContext.getResourceId(a.m.ImagePreference_img, 0);
    if (paramInt > 0)
    {
      paramAttributeSet = this.tCt;
      paramAttributeSet.jxE = paramInt;
      paramAttributeSet.bitmap = null;
      this.tCt.e(this.lWM);
    }
    paramContext.recycle();
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.lWM = ((ImageView)paramView.findViewById(a.g.image_iv));
    this.tCt.e(this.lWM);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(a.g.content_ll);
    localViewGroup.removeAllViews();
    View.inflate(this.mContext, a.h.mm_preference_image, localViewGroup);
    return paramViewGroup;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/base/preference/ImagePreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */