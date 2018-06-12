package com.tencent.mm.plugin.appbrand.widget.input.panel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.tencent.mm.br.e;
import com.tencent.mm.plugin.appbrand.s.h;
import com.tencent.mm.sdk.platformtools.ad;

public final class b
  extends a
{
  private static final int gKH = com.tencent.mm.bp.a.fromDPToPix(ad.getContext(), 48);
  private static final int gKI = com.tencent.mm.bp.a.fromDPToPix(ad.getContext(), 43);
  
  public final int aqc()
  {
    return this.gKF.apU().apW();
  }
  
  public final int aqd()
  {
    return aqe() * getRowCount();
  }
  
  public final int aqe()
  {
    if (this.gKF.gKV) {
      return 7;
    }
    c localc = this.gKF;
    if (localc.gLa <= 1) {
      localc.gLa = c.anG()[0];
    }
    return localc.gLa / gKI;
  }
  
  public final int getPageCount()
  {
    if (aqd() <= 0) {
      return 0;
    }
    int i = aqc();
    int j = aqd();
    return (int)Math.ceil(i / j);
  }
  
  public final int getRowCount()
  {
    int i = 3;
    int j = this.gKF.gKZ / gKH;
    if (j > 3) {}
    for (;;)
    {
      j = i;
      if (i <= 0) {
        j = 1;
      }
      return j;
      i = j;
    }
  }
  
  public final int getRowSpacing()
  {
    return (this.gKF.gKZ - gKH * getRowCount()) / (getRowCount() + 1);
  }
  
  public final View mk(int paramInt)
  {
    View localView = null;
    Object localObject = this.gKE;
    c localc = this.gKF;
    d locald = new d();
    locald.mIndex = paramInt;
    locald.gLb = this;
    locald.mContext = ((Context)localObject);
    locald.gKF = localc;
    localObject = localView;
    if (locald.mContext != null)
    {
      if (locald.gLb != null) {
        break label77;
      }
      localObject = localView;
    }
    label77:
    do
    {
      return (View)localObject;
      localView = View.inflate(locald.mContext, s.h.appbrand_smiley_panel_page, null);
      localObject = localView;
    } while (!(localView instanceof AppBrandSmileyGrid));
    ((AppBrandSmileyGrid)localView).setPanelManager(locald.gKF);
    localObject = (AppBrandSmileyGrid)localView;
    paramInt = locald.mIndex;
    int i = locald.gLb.aqc();
    int j = locald.gLb.aqd();
    int k = locald.gLb.aqe();
    int m = locald.gLb.getRowCount();
    int n = locald.gLb.getRowSpacing();
    ((AppBrandSmileyGrid)localObject).setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    ((AppBrandSmileyGrid)localObject).setBackgroundResource(0);
    ((AppBrandSmileyGrid)localObject).setStretchMode(2);
    ((AppBrandSmileyGrid)localObject).setOnItemClickListener(((AppBrandSmileyGrid)localObject).UD);
    ((AppBrandSmileyGrid)localObject).gKM = paramInt;
    ((AppBrandSmileyGrid)localObject).gKK = i;
    ((AppBrandSmileyGrid)localObject).gKL = j;
    ((AppBrandSmileyGrid)localObject).gKN = n;
    ((AppBrandSmileyGrid)localObject).gKO = k;
    ((AppBrandSmileyGrid)localObject).gKP = m;
    ((AppBrandSmileyGrid)localObject).setNumColumns(k);
    i = ((AppBrandSmileyGrid)localObject).getRowSpacing();
    j = com.tencent.mm.bp.a.fromDPToPix(((AppBrandSmileyGrid)localObject).getContext(), 6);
    k = com.tencent.mm.bp.a.fromDPToPix(((AppBrandSmileyGrid)localObject).getContext(), 6);
    paramInt = i;
    if (i == 0) {
      paramInt = com.tencent.mm.bp.a.fromDPToPix(((AppBrandSmileyGrid)localObject).getContext(), 6);
    }
    ((AppBrandSmileyGrid)localObject).setPadding(j, paramInt, k, 0);
    ((AppBrandSmileyGrid)localObject).gKJ = new AppBrandSmileyGrid.a((AppBrandSmileyGrid)localObject, (byte)0);
    ((AppBrandSmileyGrid)localObject).setAdapter(((AppBrandSmileyGrid)localObject).gKJ);
    ((AppBrandSmileyGrid)localObject).gKJ.notifyDataSetChanged();
    return localView;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/panel/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */