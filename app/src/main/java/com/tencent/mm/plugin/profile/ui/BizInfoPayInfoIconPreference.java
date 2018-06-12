package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.bp.a;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.Iterator;
import java.util.List;

public class BizInfoPayInfoIconPreference
  extends Preference
{
  private LayoutInflater Bc;
  private LinearLayout lUu;
  private List<String> lUv;
  private int lUw = -1;
  
  public BizInfoPayInfoIconPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public BizInfoPayInfoIconPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.Bc = ((LayoutInflater)paramContext.getSystemService("layout_inflater"));
    setLayoutResource(R.i.mm_preference);
  }
  
  private void aL()
  {
    if (this.lUu == null) {}
    for (;;)
    {
      return;
      this.lUu.removeAllViews();
      if (this.lUw >= 0)
      {
        int i = this.lUw;
        int j = 0;
        label29:
        if (j < 5)
        {
          if (i > 0) {
            break label52;
          }
          uE(R.k.biz_info_brand_unselect);
        }
        for (;;)
        {
          j += 1;
          break label29;
          break;
          label52:
          if (i <= 10)
          {
            uE(R.k.biz_info_brand_half_selected);
            i -= 20;
          }
          else
          {
            uE(R.k.biz_info_brand_selected);
            i -= 20;
          }
        }
      }
      if (this.lUv != null)
      {
        Iterator localIterator = this.lUv.iterator();
        while (localIterator.hasNext())
        {
          Object localObject = (String)localIterator.next();
          CdnImageView localCdnImageView = new CdnImageView(this.mContext);
          localCdnImageView.setUrl((String)localObject);
          localObject = new LinearLayout.LayoutParams(a.fromDPToPix(this.mContext, 20), a.fromDPToPix(this.mContext, 20));
          ((LinearLayout.LayoutParams)localObject).rightMargin = a.fromDPToPix(this.mContext, 6);
          this.lUu.addView(localCdnImageView, (ViewGroup.LayoutParams)localObject);
        }
      }
    }
  }
  
  private void uE(int paramInt)
  {
    ImageView localImageView = (ImageView)this.Bc.inflate(R.i.contact_info_biz_info_icon, null);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(a.fromDPToPix(this.mContext, 20), a.fromDPToPix(this.mContext, 20));
    localLayoutParams.rightMargin = a.fromDPToPix(this.mContext, 6);
    localImageView.setImageResource(paramInt);
    this.lUu.addView(localImageView, localLayoutParams);
  }
  
  public final void bH(List<String> paramList)
  {
    this.lUv = paramList;
    aL();
  }
  
  public final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.lUu = ((LinearLayout)paramView.findViewById(R.h.summary));
    aL();
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    this.Bc.inflate(R.i.contact_info_pay_info_icon, localViewGroup);
    return paramViewGroup;
  }
  
  public final void uD(int paramInt)
  {
    if (paramInt == this.lUw) {
      return;
    }
    this.lUw = paramInt;
    aL();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/BizInfoPayInfoIconPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */