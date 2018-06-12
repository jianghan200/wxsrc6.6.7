package com.tencent.mm.plugin.appbrand.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.tencent.mm.bp.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.b.b.f;
import com.tencent.mm.plugin.appbrand.compat.n.a;
import com.tencent.mm.plugin.appbrand.compat.n.b;
import com.tencent.mm.plugin.appbrand.q.b;
import com.tencent.mm.plugin.appbrand.q.d;
import com.tencent.mm.plugin.appbrand.widget.AppBrandNearbyShowcaseView;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;
import java.util.LinkedList;

public class AppBrandLoadIconPreference
  extends Preference
{
  private AppBrandNearbyShowcaseView gBd;
  private View gBe;
  public String gBf;
  private boolean gBg = false;
  private int gBh = -1;
  private LinkedList<d> gBi = new LinkedList();
  private ThreeDotsLoadingView gtb;
  private int gzI;
  private int gzJ;
  private int gzK;
  private final int gzL = -1;
  private b.f gzY;
  private Context mContext;
  private View mView = null;
  
  public AppBrandLoadIconPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    cK(paramContext);
  }
  
  public AppBrandLoadIconPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    cK(paramContext);
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
      paramView.animate().setDuration(200L).alpha(0.0F).withEndAction(new AppBrandLoadIconPreference.4(this, paramView)).start();
    }
  }
  
  private void cK(Context paramContext)
  {
    setLayoutResource(n.b.appbrand_load_icon_preference);
    this.mContext = paramContext;
  }
  
  public static void onDestroy() {}
  
  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    if (this.mView == null) {
      this.mView = onCreateView(paramViewGroup);
    }
    onBindView(this.mView);
    return this.mView;
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.gzI = a.fromDPToPix(this.mContext, 21);
    this.gzJ = a.fromDPToPix(this.mContext, 11);
    this.gzK = a.fromDPToPix(this.mContext, 2);
    this.gBe = paramView.findViewById(n.a.app_brand_loading_icon_layout);
    this.gtb = ((ThreeDotsLoadingView)paramView.findViewById(n.a.app_brand_loading_view));
    this.gBd = ((AppBrandNearbyShowcaseView)paramView.findViewById(n.a.app_brand_loading_icon_view));
    this.gBd.setIconSize(this.gzI + this.gzK * 2);
    this.gBd.setIconGap(this.gzJ);
    if ((this.gBf == null) || (this.gtb == null))
    {
      x.i("MicroMsg.AppBrandLoadIconPreference", "startLoad mTalker or mLoadingView is null");
      return;
    }
    if (this.gBg)
    {
      x.i("MicroMsg.AppBrandLoadIconPreference", "startLoad has load.");
      return;
    }
    this.gBg = true;
    bN(this.gBe);
    b(this.gtb, null);
    this.gtb.cAG();
    g.Em().H(new AppBrandLoadIconPreference.1(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/widget/AppBrandLoadIconPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */