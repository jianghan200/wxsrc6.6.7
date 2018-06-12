package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.base.preference.Preference;

public final class HeadImgPreference
  extends Preference
{
  private ImageView gwj;
  private int height = -1;
  public View.OnClickListener mVS;
  private Bitmap qOJ;
  
  public HeadImgPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public HeadImgPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(R.i.mm_preference);
  }
  
  public final void O(Bitmap paramBitmap)
  {
    this.qOJ = null;
    if (this.gwj != null)
    {
      this.gwj.setImageBitmap(paramBitmap);
      return;
    }
    this.qOJ = paramBitmap;
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    if (this.gwj == null) {
      this.gwj = ((ImageView)paramView.findViewById(R.h.image_headimg));
    }
    if (this.mVS != null) {
      this.gwj.setOnClickListener(this.mVS);
    }
    if (this.qOJ != null)
    {
      this.gwj.setImageBitmap(this.qOJ);
      this.qOJ = null;
    }
    paramView = (LinearLayout)paramView.findViewById(R.h.mm_preference_ll_id);
    if (this.height != -1) {
      paramView.setMinimumHeight(this.height);
    }
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    View.inflate(this.mContext, R.i.mm_preference_content_headimg, localViewGroup);
    this.gwj = ((ImageView)paramViewGroup.findViewById(R.h.image_headimg));
    return paramViewGroup;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/preference/HeadImgPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */