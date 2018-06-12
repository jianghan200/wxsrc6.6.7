package com.tencent.mm.plugin.appbrand.widget.input.panel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ViewPager.e;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.plugin.appbrand.s.g;
import com.tencent.mm.plugin.appbrand.s.h;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMDotView;

public class AppBrandSmileyPanelBase
  extends LinearLayout
  implements ViewPager.e, AppBrandSmileyViewPager.b
{
  public View FU = null;
  private boolean gIv = false;
  public c gKF;
  private a gKR;
  public MMActivity gKS;
  private AppBrandSmileyViewPager gKT = null;
  private MMDotView gKU;
  private boolean gKV = true;
  
  public AppBrandSmileyPanelBase(Context paramContext)
  {
    super(paramContext, null);
    init();
  }
  
  public AppBrandSmileyPanelBase(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  private void aqh()
  {
    if (this.gKU == null) {}
    boolean bool;
    do
    {
      return;
      bool = j.fC(getContext());
    } while (bool == this.gKV);
    RelativeLayout.LayoutParams localLayoutParams;
    if (bool)
    {
      this.gKU.setPadding(0, 0, 0, getContext().getResources().getDimensionPixelSize(s.e.MiddlePadding));
      localLayoutParams = (RelativeLayout.LayoutParams)this.gKU.getLayoutParams();
      localLayoutParams.bottomMargin = getContext().getResources().getDimensionPixelSize(s.e.emoji_panel_tab_height);
      this.gKU.setLayoutParams(localLayoutParams);
    }
    for (;;)
    {
      this.gKV = bool;
      return;
      this.gKU.setPadding(0, 0, 0, getContext().getResources().getDimensionPixelSize(s.e.LittlePadding));
      localLayoutParams = (RelativeLayout.LayoutParams)this.gKU.getLayoutParams();
      localLayoutParams.bottomMargin = 0;
      this.gKU.setLayoutParams(localLayoutParams);
    }
  }
  
  private void init()
  {
    this.gKS = ((MMActivity)getContext());
    this.gKF = apD();
    this.gKF.gKE = getContext();
    this.gKF.gKY = this.gKR;
  }
  
  public final void N(int paramInt) {}
  
  public final void O(int paramInt)
  {
    a locala = this.gKF.aqi();
    int i = locala.getPageCount();
    int j = locala.gKG;
    if (i <= 1)
    {
      this.gKU.setVisibility(4);
      return;
    }
    this.gKU.setVisibility(0);
    this.gKU.setDotCount(i);
    this.gKU.setSelectedDot(paramInt - j);
  }
  
  public final void a(int paramInt1, float paramFloat, int paramInt2) {}
  
  public c apD()
  {
    return new c();
  }
  
  public final void aqf()
  {
    if (this.gKT == null) {
      return;
    }
    this.gKF.gKV = j.fC(getContext());
    AppBrandSmileyViewPager.a locala = (AppBrandSmileyViewPager.a)this.gKT.getAdapter();
    if (locala != null)
    {
      locala.gLf.clear();
      locala.gKF = this.gKF;
      locala.notifyDataSetChanged();
    }
    for (;;)
    {
      this.gKT.post(new Runnable()
      {
        public final void run()
        {
          AppBrandSmileyPanelBase.this.O(AppBrandSmileyPanelBase.a(AppBrandSmileyPanelBase.this).getCurrentItem());
        }
      });
      return;
      locala = new AppBrandSmileyViewPager.a();
      locala.gKF = this.gKF;
      this.gKT.setAdapter(locala);
    }
  }
  
  public final void aqg()
  {
    if (this.FU != null) {
      this.FU.setVisibility(4);
    }
  }
  
  @SuppressLint({"WrongCall"})
  public final void bZ(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public final c getManager()
  {
    return this.gKF;
  }
  
  public final void initView()
  {
    if ((this.FU != null) && (getChildCount() > 0))
    {
      this.FU.setVisibility(0);
      return;
    }
    if (this.FU == null) {
      this.FU = View.inflate(ad.getContext(), s.h.appbrand_smiley_panel, null);
    }
    for (;;)
    {
      this.gKT = ((AppBrandSmileyViewPager)this.FU.findViewById(s.g.smiley_panel_view_pager));
      this.gKT.setOnPageChangeListener(this);
      this.gKT.setPanelManager(this.gKF);
      this.gKT.setOnSizeChangedListener(this);
      this.gKU = ((MMDotView)this.FU.findViewById(s.g.smiley_panel_dot));
      this.gKU.setDotCount(1);
      aqh();
      addView(this.FU, new LinearLayout.LayoutParams(-1, -1));
      return;
      if (this.FU.getParent() != null) {
        ((ViewGroup)this.FU.getParent()).removeView(this.FU);
      }
    }
  }
  
  public final void md(int paramInt)
  {
    super.setVisibility(paramInt);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.gIv)
    {
      super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE));
      return;
    }
    j.fC(getContext());
    super.onMeasure(paramInt1, paramInt2);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    aqh();
  }
  
  public void setOnTextOperationListener(a parama)
  {
    this.gKR = parama;
    this.gKF.gKY = this.gKR;
  }
  
  public void setVisibility(int paramInt)
  {
    if (paramInt == 0) {}
    for (this.gIv = false;; this.gIv = true)
    {
      super.setVisibility(paramInt);
      if (!this.gIv)
      {
        this.gKS.YC();
        initView();
      }
      return;
    }
  }
  
  public static abstract interface a
  {
    public abstract void apK();
    
    public abstract void append(String paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/panel/AppBrandSmileyPanelBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */