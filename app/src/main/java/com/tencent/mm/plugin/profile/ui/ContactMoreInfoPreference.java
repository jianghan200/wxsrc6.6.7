package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.bp.a;
import com.tencent.mm.ui.base.preference.Preference;

public class ContactMoreInfoPreference
  extends Preference
{
  private TextView hEx;
  private ImageView lUP;
  private ImageView lUQ;
  private ImageView lUR;
  private ImageView lUS;
  private ImageView lUT;
  private ImageView lUU;
  private int lUV = 8;
  private int lUW = 8;
  private int lUX = 8;
  private int lUY = 8;
  private int lUZ = 8;
  private int lVa = 8;
  
  public ContactMoreInfoPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public ContactMoreInfoPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(R.i.mm_preference);
  }
  
  private void aL()
  {
    if (this.lUP != null) {
      this.lUP.setVisibility(this.lUV);
    }
    if (this.lUQ != null) {
      this.lUQ.setVisibility(this.lUW);
    }
    if (this.lUR != null) {
      this.lUR.setVisibility(this.lUX);
    }
    if (this.lUS != null) {
      this.lUS.setVisibility(this.lUY);
    }
    if (this.lUT != null) {
      this.lUT.setVisibility(this.lUZ);
    }
    if (this.hEx != null)
    {
      ViewGroup.LayoutParams localLayoutParams = this.hEx.getLayoutParams();
      localLayoutParams.width = a.ad(this.mContext, R.f.FixedTitleWidth);
      this.hEx.setLayoutParams(localLayoutParams);
    }
    if (this.lUU != null) {
      this.lUU.setVisibility(this.lVa);
    }
  }
  
  public final void onBindView(View paramView)
  {
    this.lUP = ((ImageView)paramView.findViewById(R.h.image_mobile));
    this.lUQ = ((ImageView)paramView.findViewById(R.h.image_qq));
    this.lUR = ((ImageView)paramView.findViewById(R.h.image_linkedin));
    this.lUS = ((ImageView)paramView.findViewById(R.h.image_facebook));
    this.lUT = ((ImageView)paramView.findViewById(R.h.image_googlecontacts));
    this.lUU = ((ImageView)paramView.findViewById(R.h.image_weishop));
    this.hEx = ((TextView)paramView.findViewById(R.h.title));
    aL();
    super.onBindView(paramView);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(R.i.mm_preference_content_more_info, localViewGroup);
    return paramViewGroup;
  }
  
  public final void uF(int paramInt)
  {
    this.lUW = paramInt;
    aL();
  }
  
  public final void uG(int paramInt)
  {
    this.lUX = paramInt;
    aL();
  }
  
  public final void uH(int paramInt)
  {
    this.lUZ = paramInt;
    aL();
  }
  
  public final void uI(int paramInt)
  {
    this.lVa = paramInt;
    aL();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/ContactMoreInfoPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */