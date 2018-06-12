package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import com.tencent.mm.R.h;
import com.tencent.mm.ac.d;
import com.tencent.mm.modelappbrand.b.b;
import com.tencent.mm.modelappbrand.b.b.f;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.WxaEntryInfo;
import com.tencent.mm.plugin.appbrand.widget.AppBrandNearbyShowcaseView;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;
import java.util.List;

public class NewBizBindWxaInfoPreference
  extends Preference
{
  private static final int gzI = com.tencent.mm.bp.a.fromDPToPix(ad.getContext(), 25);
  private static final int gzJ = com.tencent.mm.bp.a.fromDPToPix(ad.getContext(), 20);
  private static final int gzK = com.tencent.mm.bp.a.fromDPToPix(ad.getContext(), 2);
  private Context context;
  private AppBrandNearbyShowcaseView gBd;
  private View gBe;
  private boolean gBg = false;
  List<WxaAttributes.WxaEntryInfo> gEP;
  private ThreeDotsLoadingView gtb;
  private b.f gzY;
  private View.OnClickListener iDo;
  private View.OnClickListener lUh;
  d lUs;
  private View mView = null;
  
  public NewBizBindWxaInfoPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
    init();
  }
  
  public NewBizBindWxaInfoPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
    init();
  }
  
  private static void b(View paramView, Runnable paramRunnable)
  {
    if (paramView.getVisibility() != 0)
    {
      paramView.setAlpha(0.0F);
      paramView.setVisibility(0);
    }
    paramView.animate().setDuration(200L).alpha(1.0F).withEndAction(paramRunnable).start();
  }
  
  private void bN(View paramView)
  {
    if (paramView.getVisibility() == 0) {
      paramView.animate().setDuration(200L).alpha(0.0F).withEndAction(new NewBizBindWxaInfoPreference.4(this, paramView)).start();
    }
  }
  
  private void init()
  {
    this.iDo = new NewBizBindWxaInfoPreference.1(this);
    this.lUh = new NewBizBindWxaInfoPreference.2(this);
  }
  
  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    if (this.mView == null) {
      this.mView = onCreateView(paramViewGroup);
    }
    onBindView(this.mView);
    return this.mView;
  }
  
  public final void hy()
  {
    if (this.gtb == null)
    {
      x.i("MicroMsg.NewBizBindWxaInfoPreference", "startLoad or mLoadingView is null");
      return;
    }
    if (this.gBg)
    {
      x.i("MicroMsg.NewBizBindWxaInfoPreference", "startLoad has load.");
      return;
    }
    this.gBg = true;
    bN(this.gBe);
    b(this.gtb, null);
    this.gtb.cAG();
    if ((this.lUs == null) || (this.gEP == null))
    {
      x.w("MicroMsg.NewBizBindWxaInfoPreference", "mWxaEntryInfoList or bizInfo is null, return");
      return;
    }
    this.gtb.cAH();
    bN(this.gtb);
    if (this.gEP.size() > 0)
    {
      this.gBd.setVisibility(0);
      this.gBd.setIconLayerCount(Math.min(this.gEP.size(), 4));
      boolean bool;
      int i;
      label184:
      b localb;
      ImageView localImageView;
      if (this.gBe.getVisibility() != 0)
      {
        bool = true;
        if (bool) {
          this.gBd.aoT();
        }
        if (this.gzY == null) {
          this.gzY = new com.tencent.mm.plugin.appbrand.ui.widget.a(gzI, gzK);
        }
        i = 0;
        if (i >= this.gBd.getChildCount()) {
          break label273;
        }
        localb = b.Ka();
        localImageView = this.gBd.lT(i);
        if (this.gEP.size() <= i) {
          break label268;
        }
      }
      label268:
      for (String str = ((WxaAttributes.WxaEntryInfo)this.gEP.get(i)).iconUrl;; str = null)
      {
        localb.a(localImageView, str, com.tencent.mm.modelappbrand.b.a.JZ(), this.gzY);
        i += 1;
        break label184;
        bool = false;
        break;
      }
      label273:
      b(this.gBe, new NewBizBindWxaInfoPreference.3(this, bool));
      if (this.gEP.size() == 1)
      {
        this.mView.setTag(((WxaAttributes.WxaEntryInfo)this.gEP.get(0)).username);
        this.mView.setOnClickListener(this.iDo);
        return;
      }
      this.mView.setTag(null);
      this.mView.setOnClickListener(this.lUh);
      return;
    }
    this.gBd.setVisibility(8);
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.gBe = paramView.findViewById(R.h.new_bizinfo_loading_icon_layout);
    this.gtb = ((ThreeDotsLoadingView)paramView.findViewById(R.h.new_bizinfo_loading_view));
    this.gBd = ((AppBrandNearbyShowcaseView)paramView.findViewById(R.h.new_bizinfo_loading_icon_view));
    this.gBd.setIconSize(gzI + gzK * 2);
    this.gBd.setIconGap(gzJ);
    hy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizBindWxaInfoPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */