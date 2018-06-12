package com.tencent.mm.plugin.location.ui.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.mm.plugin.location_soso.SoSoProxyUI;
import com.tencent.mm.plugin.location_soso.api.SoSoMapView;
import com.tencent.mm.plugin.map.a.e;
import com.tencent.mm.plugin.r.a;
import com.tencent.mm.sdk.platformtools.x;

public final class d
  implements com.tencent.mm.plugin.r.c
{
  public static View dL(Context paramContext)
  {
    paramContext = new SoSoMapView(paramContext);
    paramContext.setId(a.e.g_mapView);
    return paramContext;
  }
  
  public static Intent t(Activity paramActivity)
  {
    return new Intent(paramActivity, SoSoProxyUI.class);
  }
  
  public final a d(Activity paramActivity, int paramInt)
  {
    switch (paramInt)
    {
    case 3: 
    default: 
      return null;
    case 2: 
      return new c(paramActivity);
    case 4: 
      return new h(paramActivity);
    }
    x.i("MicroMsg.MapFactoryImp", "share map");
    return new g(paramActivity);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/location/ui/impl/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */