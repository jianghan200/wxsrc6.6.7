package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.u;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class aa
  extends a
{
  TextView ePz;
  private Runnable epp;
  
  public aa(Context paramContext, u paramu, ViewGroup paramViewGroup)
  {
    super(paramContext, paramu, paramViewGroup);
  }
  
  public final void bzA()
  {
    super.bzA();
  }
  
  public final void bzB()
  {
    super.bzB();
  }
  
  @TargetApi(17)
  public final View bzM()
  {
    View localView = this.contentView;
    localView.setBackgroundColor(this.backgroundColor);
    localView.findViewById(i.f.sns_ad_landingpage_text_layout).setBackgroundColor(this.backgroundColor);
    localView.findViewById(i.f.sns_ad_landingpage_text_wordTitle).setBackgroundColor(this.backgroundColor);
    this.ePz = ((TextView)localView.findViewById(i.f.sns_ad_landingpage_text_wordTitle));
    return localView;
  }
  
  protected final void bzQ()
  {
    Object localObject;
    if (((u)this.nDt).bID == 1)
    {
      if (!bi.oW(((u)this.nDt).nBt))
      {
        localObject = ((u)this.nDt).nBt.replace("<icon", "<img");
        e.remove(this.epp);
        this.epp = new aa.1(this, (String)localObject);
        e.post(this.epp, "");
      }
      if (((u)this.nDt).textAlignment != 0) {
        break label327;
      }
      this.ePz.setGravity(3);
      label99:
      if ((((u)this.nDt).nBu == null) || (((u)this.nDt).nBu.length() <= 0)) {
        break label412;
      }
    }
    for (;;)
    {
      try
      {
        i = Color.parseColor(((u)this.nDt).nBu);
        this.ePz.setTextColor(i);
        if (((u)this.nDt).duz > 0.0F) {
          this.ePz.setTextSize(0, ((u)this.nDt).duz);
        }
        localObject = this.ePz.getPaint();
        if (((u)this.nDt).nBv) {
          ((TextPaint)localObject).setFakeBoldText(true);
        }
        if (((u)this.nDt).nBw) {
          ((TextPaint)localObject).setTextSkewX(-0.25F);
        }
        if (((u)this.nDt).nBx) {
          ((TextPaint)localObject).setUnderlineText(true);
        }
        if (((u)this.nDt).maxLines > 0) {
          this.ePz.setMaxLines(((u)this.nDt).maxLines);
        }
        if (((u)this.nDt).nBy == u.nBs) {
          this.ePz.setTypeface(ad.eg(this.context));
        }
        return;
        this.ePz.setText(((u)this.nDt).nBt);
        break;
        label327:
        if (((u)this.nDt).textAlignment == 1)
        {
          this.ePz.setGravity(17);
          break label99;
        }
        if (((u)this.nDt).textAlignment != 2) {
          break label99;
        }
        this.ePz.setGravity(5);
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.Sns.AdLandingPageTextComponent", "parse the color is error : " + ((u)this.nDt).nBu);
        continue;
      }
      label412:
      int i = Color.parseColor("#FFFFFF");
      this.ePz.setTextColor(i);
    }
  }
  
  public final void bzz()
  {
    super.bzz();
    if (!e.remove(this.epp)) {
      e.S(this.epp);
    }
  }
  
  protected final int getLayout()
  {
    return i.g.sns_ad_native_landing_pages_item_text;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */