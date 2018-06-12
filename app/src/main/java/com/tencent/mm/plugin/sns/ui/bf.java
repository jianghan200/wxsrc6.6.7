package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.model.c.c;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;

public final class bf
{
  private String kCA;
  private LinearLayout ohj;
  public TextView ohk;
  public TextView ohl;
  private View ohm;
  private View ohn;
  public com.tencent.mm.plugin.sns.storage.b oho;
  public com.tencent.mm.plugin.sns.storage.a ohp;
  private View view;
  
  public bf(View paramView)
  {
    this.view = paramView;
    this.kCA = w.fD(ad.getContext());
    x.i("MicroMsg.TimeLineAdView", "adView init lan " + this.kCA);
    this.ohk = ((TextView)this.view.findViewById(i.f.ad_info_tv));
    this.ohl = ((TextView)this.view.findViewById(i.f.ad_link_tv));
    this.ohm = this.view.findViewById(i.f.ad_info_tv_arrow);
    this.ohn = this.view.findViewById(i.f.ad_lbs_icon_tv);
    this.ohj = ((LinearLayout)this.view.findViewById(i.f.ad_info_ll));
    paramView = " " + this.view.getResources().getString(i.j.sns_ad_tip) + " ";
    this.ohk.setText(paramView);
  }
  
  public final void a(View.OnClickListener paramOnClickListener1, View.OnClickListener paramOnClickListener2)
  {
    this.ohl.setOnClickListener(paramOnClickListener1);
    this.ohk.setOnClickListener(paramOnClickListener2);
    if (this.ohm != null) {
      this.ohm.setOnClickListener(paramOnClickListener2);
    }
    if (this.ohj != null) {
      this.ohj.setOnClickListener(paramOnClickListener2);
    }
  }
  
  public final void a(com.tencent.mm.plugin.sns.storage.b paramb, com.tencent.mm.plugin.sns.storage.a parama)
  {
    this.ohp = parama;
    this.oho = paramb;
    Object localObject1 = "";
    Context localContext;
    if (paramb != null)
    {
      if ("zh_CN".equals(this.kCA)) {
        localObject1 = paramb.nyI;
      }
    }
    else
    {
      Object localObject2 = localObject1;
      if (paramb != null)
      {
        localObject2 = localObject1;
        if (bi.oW((String)localObject1)) {
          localObject2 = paramb.nyG;
        }
      }
      localContext = this.ohl.getContext();
      localObject1 = localObject2;
      if (bi.oW((String)localObject2)) {
        localObject1 = localContext.getString(i.j.sns_ad_view_more);
      }
      localObject1 = (String)localObject1 + " ";
      int i = ((String)localObject1).length();
      localObject2 = new SpannableString((String)localObject1 + "ad_");
      if ((parama == null) || (!parama.bzk())) {
        break label375;
      }
      localObject1 = localContext.getResources().getDrawable(i.i.album_ad_link_tag_weapp);
      ((Drawable)localObject1).setBounds(0, 0, (int)(this.ohl.getTextSize() * 0.8D), (int)(this.ohl.getTextSize() * 0.8D));
      localObject1 = new ImageSpan((Drawable)localObject1, 1);
      label219:
      if (!bi.oW(paramb.nyH)) {
        d.b("adId", paramb.nyH, false, 41, new bf.1(this, (SpannableString)localObject2, i));
      }
      ((SpannableString)localObject2).setSpan(localObject1, i, i + 3, 33);
      this.ohl.setText((CharSequence)localObject2);
      if ((parama == null) || (bi.oW(parama.nyc))) {
        break label436;
      }
      this.ohn.setVisibility(0);
      label296:
      if (paramb != null)
      {
        if (!"zh_CN".equals(this.kCA)) {
          break label448;
        }
        paramb = paramb.nyR;
      }
    }
    for (;;)
    {
      if (!bi.oW(paramb)) {
        this.ohk.setText(paramb);
      }
      return;
      if (("zh_TW".equals(this.kCA)) || ("zh_HK".equals(this.kCA)))
      {
        localObject1 = paramb.nyK;
        break;
      }
      localObject1 = paramb.nyJ;
      break;
      label375:
      localObject1 = localContext.getResources().getDrawable(i.i.album_advertise_link_icon);
      ((Drawable)localObject1).setBounds(0, 0, (int)(this.ohl.getTextSize() * 1.3D), (int)(this.ohl.getTextSize() * 1.3D));
      localObject1 = new ImageSpan((Drawable)localObject1, 0);
      break label219;
      label436:
      this.ohn.setVisibility(8);
      break label296;
      label448:
      if (("zh_TW".equals(this.kCA)) || ("zh_HK".equals(this.kCA))) {
        paramb = paramb.nyT;
      } else {
        paramb = paramb.nyS;
      }
    }
  }
  
  public final String bEC()
  {
    if (this.ohp == null) {
      return "";
    }
    if (this.ohp.ntU == null) {
      return "";
    }
    return this.ohp.ntU;
  }
  
  public final int[] bED()
  {
    int[] arrayOfInt = new int[2];
    if (this.ohj != null)
    {
      this.ohm.getLocationInWindow(arrayOfInt);
      arrayOfInt[0] += this.ohm.getMeasuredWidth();
    }
    while (this.ohm == null) {
      return arrayOfInt;
    }
    this.ohm.getLocationInWindow(arrayOfInt);
    arrayOfInt[0] += this.ohm.getMeasuredWidth();
    return arrayOfInt;
  }
  
  public final void r(Object paramObject1, Object paramObject2)
  {
    this.ohl.setTag(paramObject1);
    this.ohk.setTag(paramObject2);
    if (this.ohm != null) {
      this.ohm.setTag(paramObject2);
    }
    if (this.ohj != null) {
      this.ohj.setTag(paramObject2);
    }
  }
  
  public final void setVisibility(int paramInt)
  {
    com.tencent.mm.storage.a locala;
    if ((this.oho != null) && (this.oho.nyF == 1))
    {
      this.ohl.setVisibility(8);
      locala = c.Jy().XE("Sns_CanvasAd_DetailLink_JumpWay");
      if (!locala.isValid()) {
        break label184;
      }
    }
    label184:
    for (int i = bi.getInt(locala.field_value, -1);; i = -1)
    {
      if ((i != -1) && (this.oho != null) && (this.oho.bzm()) && (e.Nf(this.oho.bVv))) {
        this.ohl.setVisibility(paramInt);
      }
      this.ohk.setVisibility(paramInt);
      if (this.ohm != null) {
        this.ohm.setVisibility(paramInt);
      }
      if (this.ohj != null) {
        this.ohj.setVisibility(paramInt);
      }
      if ((this.ohp != null) && (!bi.oW(this.ohp.nyc)))
      {
        this.ohn.setVisibility(paramInt);
        return;
        this.ohl.setVisibility(paramInt);
        break;
      }
      this.ohn.setVisibility(8);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */