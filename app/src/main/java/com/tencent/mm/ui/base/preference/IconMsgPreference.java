package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.bp.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.w.a.e;
import com.tencent.mm.w.a.g;
import com.tencent.mm.w.a.h;

public class IconMsgPreference
  extends Preference
{
  private Context context;
  private Drawable drawable;
  private int height = -1;
  private String mQi = "";
  private int mQj = -1;
  private int mQk = 8;
  private int tBS = 8;
  private int tBT = 0;
  private int tBU = 8;
  private ImageView tBV = null;
  private ViewGroup tBW = null;
  private TextView tBX;
  private String tBY = "";
  
  public IconMsgPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public IconMsgPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
    setLayoutResource(a.h.mm_preference);
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    Object localObject = (ImageView)paramView.findViewById(a.g.image_iv);
    if (localObject != null)
    {
      if (this.drawable == null) {
        break label212;
      }
      ((ImageView)localObject).setImageDrawable(this.drawable);
      ((ImageView)localObject).setVisibility(0);
    }
    for (;;)
    {
      localObject = (LinearLayout)paramView.findViewById(a.g.mm_preference_ll_id);
      if (this.height != -1) {
        ((LinearLayout)localObject).setMinimumHeight(this.height);
      }
      localObject = (TextView)paramView.findViewById(a.g.text_tv_one);
      if (localObject != null)
      {
        ((TextView)localObject).setVisibility(this.mQk);
        ((TextView)localObject).setText(this.mQi);
        if (this.mQj != -1) {
          ((TextView)localObject).setBackgroundDrawable(a.f(this.context, this.mQj));
        }
      }
      this.tBV = ((ImageView)paramView.findViewById(a.g.text_prospect));
      this.tBV.setVisibility(this.tBS);
      this.tBW = ((ViewGroup)paramView.findViewById(a.g.right_rl));
      this.tBW.setVisibility(this.tBT);
      this.tBX = ((TextView)paramView.findViewById(16908310));
      paramView = (TextView)paramView.findViewById(a.g.text_tv_right);
      if (!bi.oW(this.tBY)) {
        break;
      }
      paramView.setVisibility(8);
      return;
      label212:
      if (this.Hu != 0)
      {
        ((ImageView)localObject).setImageResource(this.Hu);
        ((ImageView)localObject).setVisibility(0);
      }
      else
      {
        ((ImageView)localObject).setVisibility(8);
      }
    }
    paramView.setVisibility(0);
    paramView.setText(this.tBY);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(a.g.content);
    localViewGroup.removeAllViews();
    View.inflate(this.mContext, a.h.mm_preference_icon_msg, localViewGroup);
    paramViewGroup.setMinimumHeight(paramViewGroup.getResources().getDimensionPixelSize(a.e.SmallListHeight));
    return paramViewGroup;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/base/preference/IconMsgPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */