package com.tencent.mm.plugin.appbrand.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.ac.m;
import com.tencent.mm.modelappbrand.b.b;
import com.tencent.mm.modelappbrand.b.f;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.WxaEntryInfo;
import com.tencent.mm.plugin.appbrand.s.g;
import com.tencent.mm.plugin.appbrand.s.h;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import java.util.List;

public class WxaBindBizInfoView
  extends LinearLayout
{
  private static int gEW = com.tencent.mm.bp.a.fromDPToPix(ad.getContext(), 15);
  private static int gEX = com.tencent.mm.bp.a.fromDPToPix(ad.getContext(), 30);
  public List<WxaAttributes.WxaEntryInfo> gEP;
  private View gEQ;
  private ImageView gER;
  private TextView gES;
  private LinearLayout gET;
  private ViewGroup gEU;
  private View gEV;
  private TextView gsY;
  
  public WxaBindBizInfoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public WxaBindBizInfoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private static void a(WxaAttributes.WxaEntryInfo paramWxaEntryInfo, ImageView paramImageView, TextView paramTextView)
  {
    if (paramWxaEntryInfo == null) {}
    for (;;)
    {
      return;
      Object localObject = paramWxaEntryInfo.username;
      if (paramImageView != null)
      {
        paramImageView.setTag(localObject);
        localObject = m.kV(paramWxaEntryInfo.username);
        if ((localObject == null) || (((Bitmap)localObject).isRecycled())) {
          break label59;
        }
        paramImageView.setImageBitmap((Bitmap)localObject);
      }
      while (paramTextView != null)
      {
        paramTextView.setText(bi.oV(paramWxaEntryInfo.title));
        return;
        label59:
        b.Ka().a(paramImageView, paramWxaEntryInfo.iconUrl, com.tencent.mm.modelappbrand.b.a.JZ(), f.dGr);
      }
    }
  }
  
  private void init()
  {
    this.gEP = new LinkedList();
    View localView = View.inflate(getContext(), s.h.app_brand_profile_wxa_bind_biz_info_item, this);
    this.gEQ = localView.findViewById(s.g.firstItemV);
    this.gER = ((ImageView)localView.findViewById(s.g.iconIv));
    this.gsY = ((TextView)localView.findViewById(s.g.titleTv));
    this.gES = ((TextView)localView.findViewById(s.g.countTv));
    this.gEV = localView.findViewById(s.g.moreV);
    this.gET = ((LinearLayout)localView.findViewById(s.g.containerV));
    this.gEU = ((ViewGroup)localView.findViewById(s.g.itemContainerV));
  }
  
  public final void dj(boolean paramBoolean)
  {
    if (this.gEU.getMeasuredWidth() == 0)
    {
      if (paramBoolean) {
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
        {
          public final boolean onPreDraw()
          {
            WxaBindBizInfoView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            WxaBindBizInfoView.a(WxaBindBizInfoView.this);
            return true;
          }
        });
      }
      return;
    }
    Object localObject;
    int j;
    int k;
    int i;
    if (this.gEP.isEmpty())
    {
      setVisibility(8);
      localObject = null;
      if (localObject != null) {
        a((WxaAttributes.WxaEntryInfo)localObject, this.gER, this.gsY);
      }
      this.gES.setText(getContext().getString(s.j.contact_info_bind_weapp_count, new Object[] { Integer.valueOf(this.gEP.size()) }));
      localObject = this.gEP;
      this.gET.removeAllViews();
      if (((List)localObject).isEmpty()) {
        break label366;
      }
      j = ((List)localObject).size();
      k = this.gEU.getMeasuredWidth() - this.gEU.getPaddingLeft() - this.gEU.getPaddingRight();
      i = k / (gEX + gEW);
      if (i <= j) {
        break label310;
      }
      this.gEV.setVisibility(8);
    }
    for (;;)
    {
      j = Math.min(i, j);
      if (j <= 1) {
        break label340;
      }
      i = 0;
      while (i < j)
      {
        WxaAttributes.WxaEntryInfo localWxaEntryInfo = (WxaAttributes.WxaEntryInfo)((List)localObject).get(i);
        ImageView localImageView = new ImageView(getContext());
        localImageView.setLayoutParams(new ViewGroup.LayoutParams(gEX + gEW, gEX));
        localImageView.setPadding(0, 0, gEW, 0);
        this.gET.addView(localImageView);
        a(localWxaEntryInfo, localImageView, null);
        i += 1;
      }
      setVisibility(0);
      localObject = (WxaAttributes.WxaEntryInfo)this.gEP.get(0);
      break;
      label310:
      this.gEV.setVisibility(0);
      i = (k - this.gEV.getMeasuredWidth()) / (gEX + gEW);
    }
    label340:
    x.i("MicroMsg.WxaBindBizInfoView", "attachItemToContainer(size : %s)", new Object[] { Integer.valueOf(((List)localObject).size()) });
    label366:
    if (this.gEP.size() == 1)
    {
      this.gEQ.setVisibility(0);
      this.gEU.setTag(((WxaAttributes.WxaEntryInfo)this.gEP.get(0)).username);
      return;
    }
    this.gEQ.setVisibility(8);
    this.gEU.setTag(null);
  }
  
  public List<WxaAttributes.WxaEntryInfo> getWxaEntryInfoList()
  {
    return this.gEP;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/WxaBindBizInfoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */