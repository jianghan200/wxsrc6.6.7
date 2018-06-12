package com.tencent.mm.plugin.appbrand.widget.input.panel;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.mm.br.e;
import com.tencent.mm.sdk.platformtools.ad;

public class c
{
  public Context gKE;
  boolean gKV = false;
  public b gKX;
  AppBrandSmileyPanelBase.a gKY;
  int gKZ;
  int gLa;
  
  public static int[] anG()
  {
    Display localDisplay = ((WindowManager)ad.getContext().getSystemService("window")).getDefaultDisplay();
    return new int[] { localDisplay.getWidth(), localDisplay.getHeight() };
  }
  
  public e apU()
  {
    return e.cjH();
  }
  
  public final a aqi()
  {
    if (this.gKX == null)
    {
      this.gKX = new b();
      this.gKX.gKE = this.gKE;
      this.gKX.setPanelManager(this);
    }
    return this.gKX;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/panel/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */