package com.tencent.mm.plugin.webview.ui.tools.bag;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.mm.R.f;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.ak;

public final class b
{
  public static final int qbj;
  public static final int qbk;
  public static final int qbl;
  public static final int qbm;
  public static final int qbn;
  public static final int qbo;
  public static final int qbp;
  public static final float qbq;
  
  static
  {
    boolean bool = ak.gt(ad.getContext());
    if (bool) {}
    for (int i = ak.gs(ad.getContext());; i = 0)
    {
      x.i("MicroMsg.BagIndicatorController", "getNavigationBarHeight show:%b height:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i) });
      qbj = i;
      qbk = ak.eL(ad.getContext());
      qbl = ad.getContext().getResources().getDimensionPixelSize(R.f.DefaultActionbarHeightPort);
      qbm = ad.getContext().getResources().getDimensionPixelSize(R.f.webview_bag_size);
      qbn = ad.getContext().getResources().getDimensionPixelSize(R.f.webview_bag_margin);
      qbo = ad.getContext().getResources().getDimensionPixelSize(R.f.webview_bag_indicator_size);
      i = ad.getContext().getResources().getDimensionPixelSize(R.f.webview_bag_indicator_container_size);
      qbp = i;
      qbq = i / qbo;
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/bag/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */