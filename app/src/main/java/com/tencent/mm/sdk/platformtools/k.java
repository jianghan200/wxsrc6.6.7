package com.tencent.mm.sdk.platformtools;

import android.os.Build.VERSION;
import android.view.View;

public final class k
{
  public static void bD(View paramView)
  {
    if (paramView == null) {}
    do
    {
      do
      {
        return;
        x.k("MicroMsg.ForceGpuUtil", "setLayerType, view: %s", new Object[] { Integer.valueOf(paramView.hashCode()) });
      } while (Build.VERSION.SDK_INT < 11);
      new m();
    } while (paramView.getLayerType() == 1);
    paramView.setLayerType(1, null);
  }
  
  public static void k(View paramView, int paramInt1, int paramInt2)
  {
    if (paramView == null) {}
    for (;;)
    {
      return;
      if (Build.VERSION.SDK_INT >= 11)
      {
        new m();
        if ((paramInt1 >= 2048) || (paramInt2 >= 2048)) {}
        for (paramInt1 = 1; paramView.getLayerType() != paramInt1; paramInt1 = 2)
        {
          paramView.setLayerType(paramInt1, null);
          return;
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/sdk/platformtools/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */