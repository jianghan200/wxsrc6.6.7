package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view;

import android.content.Context;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.c;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.Chart;
import java.util.ArrayList;

public class RadarChart
  extends Chart
{
  private Context context;
  public ArrayList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.a> nCn;
  private c nCo = new c();
  public TextView nCp;
  private RadarGrid nCq;
  private RadarDataLayer[] nCr;
  private a nCs;
  private boolean nCt = true;
  private boolean nCu = true;
  public int nCv = 3;
  public int nCw = 0;
  private int nCx = 4;
  public Spannable[] nCy;
  private float nCz = 1.0F;
  
  public RadarChart(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
  }
  
  public RadarChart(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
  }
  
  public c getGridStyle()
  {
    if (this.nCq == null) {
      return this.nCo;
    }
    this.nCo = this.nCq.getGridStyle();
    return this.nCq.getGridStyle();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt2 = getChildCount();
    paramInt1 = 0;
    while (paramInt1 < paramInt2)
    {
      getChildAt(paramInt1).layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
      paramInt1 += 1;
    }
  }
  
  public void setData(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.a... paramVarArgs)
  {
    int k = 0;
    removeAllViews();
    int j = paramVarArgs.length;
    int i = 0;
    while (i < j)
    {
      if (paramVarArgs[i].size() <= 0) {
        throw new Exception("Not enough elements.");
      }
      i += 1;
    }
    i = 0;
    while (i < paramVarArgs.length)
    {
      j = 0;
      while (j < paramVarArgs.length)
      {
        if (!paramVarArgs[i].a(paramVarArgs[j])) {
          throw new Error("Layer not compatible.");
        }
        j += 1;
      }
      i += 1;
    }
    this.nCy = paramVarArgs[0].bzI();
    this.nCw = paramVarArgs[0].size();
    if (this.nCn == null) {
      this.nCn = new ArrayList();
    }
    j = paramVarArgs.length;
    i = 0;
    while (i < j)
    {
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.a locala = paramVarArgs[i];
      this.nCn.add(locala);
      i += 1;
    }
    this.nCq = new RadarGrid(this.context, this.nCw, this.nCx, this.nCz, this.nCy, this.nCo);
    addView(this.nCq);
    this.nCr = new RadarDataLayer[this.nCv];
    i = k;
    while ((i < this.nCr.length) && (this.nCn.size() > i))
    {
      this.nCr[i] = new RadarDataLayer(this.context, this.nCz, (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.a)this.nCn.get(i));
      addView(this.nCr[i]);
      i += 1;
    }
    if (this.nCs == null) {
      this.nCs = new a(this.context, this.nCo);
    }
    addView(this.nCs);
  }
  
  public void setGridStyle(c paramc)
  {
    this.nCo = paramc;
    if (this.nCq != null) {
      this.nCq.setGridStyle(paramc);
    }
  }
  
  public void setLatitudeNum(int paramInt)
  {
    this.nCx = paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/chart/view/RadarChart.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */