package com.tencent.mm.plugin.appbrand.ui.recents;

import android.os.Bundle;
import com.tencent.mm.plugin.appbrand.appusage.k;
import com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.c;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.ArrayList;
import java.util.List;

final class j
  extends AppBrandLauncherUI.c<Object>
{
  j(ArrayList<?> paramArrayList1, ArrayList<?> paramArrayList2)
  {
    super(paramArrayList1, paramArrayList2);
  }
  
  public final boolean bV(int paramInt1, int paramInt2)
  {
    if (!this.guO.get(paramInt1).getClass().equals(this.guP.get(paramInt2).getClass())) {
      return false;
    }
    if ((this.guO.get(paramInt1) instanceof k))
    {
      k localk1 = (k)this.guO.get(paramInt1);
      k localk2 = (k)this.guP.get(paramInt2);
      return (localk1.fig == localk2.fig) && (localk1.bGy.equals(localk2.bGy));
    }
    return false;
  }
  
  public final boolean bW(int paramInt1, int paramInt2)
  {
    if ((this.guO.get(paramInt1) instanceof k))
    {
      k localk1 = (k)this.guO.get(paramInt1);
      k localk2 = (k)this.guP.get(paramInt2);
      return (bi.oV(localk1.appId).equals(localk2.appId)) && (localk1.bGy.equals(localk2.bGy)) && (localk1.fig == localk2.fig) && (localk1.fmd == localk2.fmd) && (bi.oV(localk1.fmb).equals(localk2.fmb)) && (bi.oV(localk1.appName).equals(localk2.appName));
    }
    return false;
  }
  
  public final Object bX(int paramInt1, int paramInt2)
  {
    if (paramInt1 >= this.guO.size()) {
      return null;
    }
    Bundle localBundle = new Bundle();
    if ((this.guO.get(paramInt1) instanceof k))
    {
      k localk1 = (k)this.guO.get(paramInt1);
      k localk2 = (k)this.guP.get(paramInt2);
      if (localk1.fmc != localk2.fmc) {
        localBundle.putLong("running_flag", localk2.fmc);
      }
      if (localk1.fmd != localk2.fmd) {
        localBundle.putBoolean("star", localk2.fmd);
      }
      if (localk1.fig != localk2.fig) {
        localBundle.putInt("debug_type", localk2.fig);
      }
      if (!bi.oV(localk1.fmb).equals(localk2.fmb)) {
        localBundle.putString("icon", localk2.fmb);
      }
      if (!bi.oV(localk1.appName).equals(localk2.appName)) {
        localBundle.putString("nick_name", localk2.appName);
      }
    }
    if (localBundle.size() <= 0) {
      return null;
    }
    return localBundle;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/recents/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */