package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.d;
import com.tencent.mm.modelappbrand.b.b;
import com.tencent.mm.modelappbrand.b.f;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.WxaEntryInfo;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.List;

public class BizBindWxaInfoPreference
  extends Preference
{
  private static DisplayMetrics gBr = ad.getContext().getResources().getDisplayMetrics();
  private static int gEW = com.tencent.mm.bp.a.fromDPToPix(ad.getContext(), 15);
  private static int gEX = ad.getResources().getDimensionPixelSize(R.f.NormalIconSize);
  d eXL;
  List<WxaAttributes.WxaEntryInfo> gEP;
  private View gEQ;
  private ImageView gER;
  private TextView gES;
  private LinearLayout gET;
  private ViewGroup gEU;
  private View gEV;
  private TextView gsY;
  private View.OnClickListener iDo;
  private volatile boolean lUf;
  volatile boolean lUg;
  private View.OnClickListener lUh;
  
  public BizBindWxaInfoPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public BizBindWxaInfoPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private static void a(WxaAttributes.WxaEntryInfo paramWxaEntryInfo, ImageView paramImageView, TextView paramTextView)
  {
    if (paramWxaEntryInfo == null) {}
    do
    {
      return;
      String str = paramWxaEntryInfo.username;
      if (paramImageView != null)
      {
        paramImageView.setTag(str);
        b.Ka().a(paramImageView, paramWxaEntryInfo.iconUrl, com.tencent.mm.modelappbrand.b.a.JZ(), f.dGr);
      }
    } while (paramTextView == null);
    paramTextView.setText(bi.oV(paramWxaEntryInfo.title));
  }
  
  private void init()
  {
    this.iDo = new BizBindWxaInfoPreference.1(this);
    this.lUh = new BizBindWxaInfoPreference.2(this);
  }
  
  final void aeP()
  {
    if ((!this.lUf) || (this.gEP == null)) {}
    while (!this.lUg) {
      return;
    }
    this.lUg = false;
    if (!this.gEP.isEmpty()) {}
    for (Object localObject = (WxaAttributes.WxaEntryInfo)this.gEP.get(0);; localObject = null)
    {
      if (localObject != null) {
        a((WxaAttributes.WxaEntryInfo)localObject, this.gER, this.gsY);
      }
      this.gES.setText(this.mContext.getString(R.l.contact_info_bind_weapp_count, new Object[] { Integer.valueOf(this.gEP.size()) }));
      localObject = this.gEP;
      this.gET.removeAllViews();
      if (!((List)localObject).isEmpty())
      {
        int k = ((List)localObject).size();
        int j = this.gEU.getMeasuredWidth();
        int i = j;
        if (j == 0) {
          i = gBr.widthPixels;
        }
        j = i - this.gEU.getPaddingLeft() - this.gEU.getPaddingRight();
        i = j / (gEX + gEW);
        if (i > k) {
          this.gEV.setVisibility(8);
        }
        for (;;)
        {
          j = Math.min(i, k);
          if (j <= 1) {
            break;
          }
          i = 0;
          while (i < j)
          {
            WxaAttributes.WxaEntryInfo localWxaEntryInfo = (WxaAttributes.WxaEntryInfo)((List)localObject).get(i);
            ImageView localImageView = new ImageView(this.mContext);
            localImageView.setLayoutParams(new ViewGroup.LayoutParams(gEX + gEW, gEX));
            localImageView.setPadding(0, 0, gEW, 0);
            this.gET.addView(localImageView);
            a(localWxaEntryInfo, localImageView, null);
            i += 1;
          }
          this.gEV.setVisibility(0);
          i = (j - this.gEV.getMeasuredWidth()) / (gEX + gEW);
        }
        x.i("MicroMsg.BizBindWxaInfoPreference", "attachItemToContainer(size : %s)", new Object[] { Integer.valueOf(((List)localObject).size()) });
      }
      if (this.gEP.size() == 1)
      {
        this.gEQ.setVisibility(0);
        this.gEU.setTag(((WxaAttributes.WxaEntryInfo)this.gEP.get(0)).username);
        this.gEU.setOnClickListener(this.iDo);
        return;
      }
      this.gEQ.setVisibility(8);
      this.gEU.setTag(null);
      this.gEU.setOnClickListener(this.lUh);
      return;
    }
  }
  
  protected final void onBindView(View paramView)
  {
    this.gEQ = paramView.findViewById(R.h.firstItemV);
    this.gER = ((ImageView)paramView.findViewById(R.h.iconIv));
    this.gsY = ((TextView)paramView.findViewById(R.h.titleTv));
    this.gES = ((TextView)paramView.findViewById(R.h.countTv));
    this.gEV = paramView.findViewById(R.h.moreV);
    this.gET = ((LinearLayout)paramView.findViewById(R.h.containerV));
    this.gEU = ((ViewGroup)paramView.findViewById(R.h.itemContainerV));
    this.lUf = true;
    if (this.gEP != null) {}
    for (boolean bool = true;; bool = false)
    {
      this.lUg = bool;
      aeP();
      super.onBindView(paramView);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/BizBindWxaInfoPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */