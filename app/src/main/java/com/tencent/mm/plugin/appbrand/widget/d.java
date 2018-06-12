package com.tencent.mm.plugin.appbrand.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.mm.g.a.if;
import com.tencent.mm.kernel.b.h;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.widget.recentview.AppBrandRecentView;
import com.tencent.mm.plugin.appbrand.widget.recentview.MenuAppBrandRecentView;
import com.tencent.mm.plugin.appbrand.widget.recentview.b;
import com.tencent.mm.plugin.appbrand.widget.recentview.c;
import com.tencent.mm.plugin.appbrand.widget.recentview.d.a;
import com.tencent.mm.plugin.appbrand.widget.recentview.d.b;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.x;

public final class d
  implements com.tencent.mm.plugin.appbrand.widget.recentview.d
{
  public final AppBrandRecentView a(Context paramContext, int paramInt, d.a parama)
  {
    Object localObject;
    if (paramInt == d.b.gPA)
    {
      localObject = new c(paramContext);
      ((AppBrandRecentView)localObject).setSceneFactory(parama);
      parama = new FrameLayout.LayoutParams(-1, (int)paramContext.getResources().getDimension(k.a.app_brand_recent_view_height));
      ((AppBrandRecentView)localObject).setPadding(0, (int)paramContext.getResources().getDimension(k.a.app_brand_recent_view_padding_top), 0, 0);
      ((AppBrandRecentView)localObject).setLayoutParams(parama);
      return (AppBrandRecentView)localObject;
    }
    if (paramInt == d.b.gPz)
    {
      localObject = new MenuAppBrandRecentView(paramContext);
      ((AppBrandRecentView)localObject).setSceneFactory(parama);
      parama = new FrameLayout.LayoutParams(-1, (int)paramContext.getResources().getDimension(k.a.app_brand_recent_view_height));
      ((AppBrandRecentView)localObject).setPadding(0, (int)paramContext.getResources().getDimension(k.a.app_brand_recent_view_padding_top), 0, 0);
      ((AppBrandRecentView)localObject).setLayoutParams(parama);
      return (AppBrandRecentView)localObject;
    }
    return null;
  }
  
  public final void aoX()
  {
    x.i("MicroMsg.AppBrandRecentViewService", "[hideAppBrandRecentView] delay:%s type:%s", new Object[] { Integer.valueOf(300), Integer.valueOf(8) });
    if (((h)g.Ef().DM()).ES())
    {
      if localif = new if();
      localif.bRG.delay = 300;
      localif.bRG.type = 8;
      a.sFg.m(localif);
    }
  }
  
  public final b aoY()
  {
    return new b();
  }
  
  public final void cN(Context paramContext)
  {
    Intent localIntent = new Intent();
    localIntent.setClassName(paramContext, "com.tencent.mm.ui.LauncherUI").addFlags(268435456).addFlags(67108864).addFlags(536870912);
    localIntent.putExtra("isShowHeaderWithAnim", true);
    localIntent.putExtra("isShowHeader", true);
    localIntent.putExtra("isScrollFirst", true);
    paramContext.startActivity(localIntent);
  }
  
  public final AppBrandRecentView z(Context paramContext, int paramInt)
  {
    return a(paramContext, paramInt, null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */