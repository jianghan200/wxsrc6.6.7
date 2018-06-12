package com.tencent.mm.plugin.mall.ui;

import android.graphics.Point;
import android.support.v7.app.ActionBar;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ak;

public final class a
{
  private static int kYs = 39;
  private static int kYt = 40;
  private static int kYu = 95;
  private static int kYv = 0;
  private static int kYw = 0;
  private static int kYx = 70;
  
  public static int bbK()
  {
    return kYv;
  }
  
  public static int bbL()
  {
    return kYw;
  }
  
  public static int bbM()
  {
    return com.tencent.mm.bp.a.fromDPToPix(ad.getContext(), kYs);
  }
  
  public static void f(MMActivity paramMMActivity)
  {
    int k = com.tencent.mm.bp.a.fromDPToPix(paramMMActivity, kYs);
    int m = com.tencent.mm.bp.a.fromDPToPix(paramMMActivity, kYt);
    int j = ak.gu(paramMMActivity).y;
    int i = j;
    if (ak.gt(paramMMActivity)) {
      i = j - ak.gs(paramMMActivity);
    }
    if (paramMMActivity.getSupportActionBar() != null) {}
    for (j = paramMMActivity.getSupportActionBar().getHeight();; j = 0)
    {
      int n = com.tencent.mm.bp.a.fromDPToPix(paramMMActivity, kYu);
      kYv = Math.round((i - k * 2 - m - j) / 5.0F);
      x.i("MicroMsg.FunctionGridSizeCalculator", "calc GRID_HEIGHT_SIZE_PX: %s, minHeight: %s", new Object[] { Integer.valueOf(kYv), Integer.valueOf(n) });
      if (kYv < n) {
        kYv = n;
      }
      kYw = Math.round(kYv * 4 / 3.0F) + com.tencent.mm.bp.a.fromDPToPix(paramMMActivity, kYx);
      x.i("MicroMsg.FunctionGridSizeCalculator", "calcGridSize, GRID_HEIGHT_SIZE_PX: %s, TOP_FUNC_LINE_GRID_SIZE_PX: %s", new Object[] { Integer.valueOf(kYv), Integer.valueOf(kYw) });
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/mall/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */