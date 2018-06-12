package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.t;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d;

public final class v
  extends i
{
  TextView ePz;
  private RelativeLayout nFv;
  ImageView nFw;
  
  public v(Context paramContext, t paramt, ViewGroup paramViewGroup)
  {
    super(paramContext, paramt, paramViewGroup);
    this.nDt = paramt;
  }
  
  public final void bzA()
  {
    super.bzA();
  }
  
  public final void bzB()
  {
    super.bzB();
  }
  
  public final View bzM()
  {
    View localView = this.contentView;
    localView.setBackgroundColor(this.backgroundColor);
    this.ePz = ((TextView)localView.findViewById(i.f.sns_ad_landingpage_processbar_label));
    this.nFv = ((RelativeLayout)localView.findViewById(i.f.sns_ad_landingpage_processbar_bg));
    this.nFw = ((ImageView)localView.findViewById(i.f.sns_ad_landingpage_processbar_front));
    return localView;
  }
  
  protected final void bzQ()
  {
    this.ePz.setText(((t)this.nDt).label);
    this.ePz.setTextSize(0, ((t)this.nDt).azb);
    if ((((t)this.nDt).fpc != null) && (((t)this.nDt).fpc.length() > 0))
    {
      int i = Color.parseColor(((t)this.nDt).fpc);
      this.nFv.setBackgroundColor(i);
    }
    d.a(((t)this.nDt).nBn, ((t)this.nDt).nAX, new v.1(this));
  }
  
  public final void bzz()
  {
    super.bzz();
  }
  
  protected final int getLayout()
  {
    return i.g.sns_ad_native_landing_pages_item_process_bar;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */