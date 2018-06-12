package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.bp.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.w.a.g;
import com.tencent.mm.w.a.h;

public class IconSummaryPreference
  extends Preference
{
  private Context context;
  private Drawable drawable;
  private int height = -1;
  private ImageView kYT = null;
  private String mQi = "";
  private int mQj = -1;
  public int mQk = 8;
  private int tBT = 0;
  private int tBU = 8;
  private ViewGroup tBW = null;
  private int tCe = 8;
  private View tCg = null;
  RelativeLayout.LayoutParams tCi;
  public int tCq = 8;
  public TextView tCr = null;
  private int tCs = -1;
  private int tgw = -1;
  private Bitmap tiW = null;
  
  public IconSummaryPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public IconSummaryPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
    setLayoutResource(a.h.mm_preference);
  }
  
  public final void dk(String paramString, int paramInt)
  {
    this.mQi = paramString;
    this.mQj = paramInt;
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    Object localObject = (ImageView)paramView.findViewById(a.g.image_iv);
    if (localObject != null)
    {
      ((ImageView)localObject).setVisibility(8);
      if (this.drawable != null)
      {
        ((ImageView)localObject).setImageDrawable(this.drawable);
        ((ImageView)localObject).setVisibility(0);
      }
    }
    else
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
      if (this.kYT == null) {
        this.kYT = ((ImageView)paramView.findViewById(a.g.image_right_iv));
      }
      if (this.tBW == null) {
        this.tBW = ((ViewGroup)paramView.findViewById(a.g.right_rl));
      }
      if (this.tCg == null) {
        this.tCg = paramView.findViewById(a.g.right_prospect);
      }
      this.tCg.setVisibility(this.tBU);
      if (this.tiW == null) {
        break label422;
      }
      this.kYT.setImageBitmap(this.tiW);
    }
    for (;;)
    {
      this.kYT.setVisibility(this.tCe);
      this.tBW.setVisibility(this.tBT);
      if (this.tCi != null) {
        this.kYT.setLayoutParams(this.tCi);
      }
      this.tCr = ((TextView)paramView.findViewById(a.g.right_summary));
      if ((this.tCr != null) && (getSummary() != null) && (getSummary().length() > 0))
      {
        this.tCr.setText(getSummary());
        this.tCr.setVisibility(this.tCq);
      }
      if ((this.tCr != null) && (this.tCs != -1))
      {
        this.tCr.setCompoundDrawablesWithIntrinsicBounds(this.tCs, 0, 0, 0);
        int i = BackwardSupportUtil.b.b(this.mContext, 2.0F);
        this.tCr.setCompoundDrawablePadding(i);
        this.tCr.setVisibility(this.tCq);
      }
      return;
      if (this.hh != null)
      {
        ((ImageView)localObject).setImageDrawable(this.hh);
        ((ImageView)localObject).setVisibility(0);
        break;
      }
      if (this.Hu == 0) {
        break;
      }
      ((ImageView)localObject).setImageResource(this.Hu);
      ((ImageView)localObject).setVisibility(0);
      break;
      label422:
      if (this.tgw != -1) {
        this.kYT.setImageResource(this.tgw);
      }
    }
  }
  
  protected View onCreateView(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(a.g.content);
    localViewGroup.removeAllViews();
    View.inflate(this.mContext, a.h.mm_preference_content_icon_summary, localViewGroup);
    return paramViewGroup;
  }
  
  public final void setSummary(int paramInt)
  {
    super.setSummary(paramInt);
    if ((this.tCr != null) && (getSummary() != null) && (getSummary().length() > 0)) {
      this.tCr.setText(getSummary());
    }
  }
  
  public final void setSummary(CharSequence paramCharSequence)
  {
    super.setSummary(paramCharSequence);
    if ((this.tCr != null) && (getSummary() != null) && (getSummary().length() > 0)) {
      this.tCr.setText(getSummary());
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/base/preference/IconSummaryPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */