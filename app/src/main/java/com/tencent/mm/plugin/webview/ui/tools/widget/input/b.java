package com.tencent.mm.plugin.webview.ui.tools.widget.input;

import android.content.Context;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import com.tencent.mm.R.i;
import com.tencent.mm.br.e;
import com.tencent.mm.sdk.platformtools.ad;

public final class b
  extends a
{
  private static final int gKH = com.tencent.mm.bp.a.fromDPToPix(ad.getContext(), 48);
  private static final int gKI = com.tencent.mm.bp.a.fromDPToPix(ad.getContext(), 43);
  
  public final int aqc()
  {
    return e.cjH().apW();
  }
  
  public final int aqd()
  {
    return aqe() * getRowCount();
  }
  
  public final int aqe()
  {
    if (this.qlL.gKV) {
      return 7;
    }
    c localc = this.qlL;
    if (localc.gLa <= 1)
    {
      Display localDisplay = ((WindowManager)ad.getContext().getSystemService("window")).getDefaultDisplay();
      localc.gLa = new int[] { localDisplay.getWidth(), localDisplay.getHeight() }[0];
    }
    return localc.gLa / gKI;
  }
  
  public final int getPageCount()
  {
    if (aqd() <= 0) {
      return 0;
    }
    int i = e.cjH().apW();
    int j = aqd();
    return (int)Math.ceil(i / j);
  }
  
  public final int getRowCount()
  {
    int i = 3;
    int j = this.qlL.gKZ / gKH;
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
    return (this.qlL.gKZ - gKH * getRowCount()) / (getRowCount() + 1);
  }
  
  public final View mk(int paramInt)
  {
    View localView = null;
    Object localObject = this.gKE;
    c localc = this.qlL;
    d locald = new d();
    locald.mIndex = paramInt;
    locald.qlT = this;
    locald.mContext = ((Context)localObject);
    locald.qlL = localc;
    localObject = localView;
    if (locald.mContext != null)
    {
      if (locald.qlT != null) {
        break label77;
      }
      localObject = localView;
    }
    label77:
    do
    {
      return (View)localObject;
      localView = View.inflate(locald.mContext, R.i.webview_smiley_panel_page, null);
      localObject = localView;
    } while (!(localView instanceof WebViewSmileyGrid));
    ((WebViewSmileyGrid)localView).setPanelManager(locald.qlL);
    localObject = (WebViewSmileyGrid)localView;
    paramInt = locald.mIndex;
    int i = locald.qlT.aqc();
    int j = locald.qlT.aqd();
    int k = locald.qlT.aqe();
    int m = locald.qlT.getRowCount();
    int n = locald.qlT.getRowSpacing();
    ((WebViewSmileyGrid)localObject).setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    ((WebViewSmileyGrid)localObject).setBackgroundResource(0);
    ((WebViewSmileyGrid)localObject).setStretchMode(2);
    ((WebViewSmileyGrid)localObject).setOnItemClickListener(((WebViewSmileyGrid)localObject).UD);
    ((WebViewSmileyGrid)localObject).gKM = paramInt;
    ((WebViewSmileyGrid)localObject).gKK = i;
    ((WebViewSmileyGrid)localObject).gKL = j;
    ((WebViewSmileyGrid)localObject).gKN = n;
    ((WebViewSmileyGrid)localObject).gKO = k;
    ((WebViewSmileyGrid)localObject).gKP = m;
    ((WebViewSmileyGrid)localObject).setNumColumns(k);
    i = ((WebViewSmileyGrid)localObject).getRowSpacing();
    j = com.tencent.mm.bp.a.fromDPToPix(((WebViewSmileyGrid)localObject).getContext(), 6);
    k = com.tencent.mm.bp.a.fromDPToPix(((WebViewSmileyGrid)localObject).getContext(), 6);
    paramInt = i;
    if (i == 0) {
      paramInt = com.tencent.mm.bp.a.fromDPToPix(((WebViewSmileyGrid)localObject).getContext(), 6);
    }
    ((WebViewSmileyGrid)localObject).setPadding(j, paramInt, k, 0);
    ((WebViewSmileyGrid)localObject).qlM = new WebViewSmileyGrid.a((WebViewSmileyGrid)localObject, (byte)0);
    ((WebViewSmileyGrid)localObject).setAdapter(((WebViewSmileyGrid)localObject).qlM);
    ((WebViewSmileyGrid)localObject).qlM.notifyDataSetChanged();
    return localView;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/widget/input/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */