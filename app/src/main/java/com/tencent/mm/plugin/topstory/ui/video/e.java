package com.tencent.mm.plugin.topstory.ui.video;

import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.n.a;
import com.tencent.mm.plugin.topstory.ui.PluginTopStoryUI;
import com.tencent.mm.sdk.platformtools.ad;
import com.tinkerboots.sdk.b.a;

public final class e
{
  n.a hKh = new e.1(this);
  public boolean ozV = false;
  com.tencent.mm.plugin.topstory.a.c ozW;
  int ozX = bIa();
  
  public e()
  {
    g.Eh().a(this.hKh);
  }
  
  static int bIa()
  {
    if (!a.isConnected(ad.getContext())) {
      return 0;
    }
    if (a.isWifi(ad.getContext()))
    {
      if (((PluginTopStoryUI)g.n(PluginTopStoryUI.class)).getTopStoryCommand().ozr) {
        return 2;
      }
      return 1;
    }
    return 2;
  }
  
  public final boolean aEY()
  {
    return this.ozX == 1;
  }
  
  public final boolean bHZ()
  {
    return this.ozX == 2;
  }
  
  public final boolean isConnected()
  {
    return this.ozX != 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/topstory/ui/video/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */