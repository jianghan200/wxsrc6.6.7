package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.w.a.g;
import com.tencent.mm.w.a.h;

public class PreferenceInfoCategory
  extends Preference
{
  public View.OnClickListener tDA = null;
  public View.OnClickListener tDB = null;
  public int tgI = 0;
  
  public PreferenceInfoCategory(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public PreferenceInfoCategory(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(a.h.mm_preference_info_center);
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    TextView localTextView = (TextView)paramView.findViewById(16908310);
    if (localTextView == null) {
      return;
    }
    if ((getTitle() == null) || (getTitle().length() <= 0)) {
      localTextView.setVisibility(8);
    }
    for (;;)
    {
      paramView = (ImageView)paramView.findViewById(a.g.add_my_qrcode);
      paramView.setOnClickListener(this.tDA);
      if (this.tgI <= 0) {
        break;
      }
      paramView.setImageResource(this.tgI);
      paramView.setVisibility(0);
      return;
      localTextView.setVisibility(0);
      localTextView.setText(getTitle());
      localTextView.setOnClickListener(this.tDB);
    }
    paramView.setVisibility(8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/base/preference/PreferenceInfoCategory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */