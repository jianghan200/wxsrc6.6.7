package com.tencent.mm.plugin.appbrand.dynamic.a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.modelappbrand.j;
import com.tencent.mm.modelappbrand.j.a;
import com.tencent.mm.plugin.appbrand.appcache.d.a;
import com.tencent.mm.plugin.appbrand.dynamic.WxaWidgetInitializer;
import com.tencent.mm.plugin.appbrand.dynamic.ui.WxaWidgetDebugUI;
import com.tencent.mm.plugin.appbrand.wxawidget.console.e;

public final class d
  implements j
{
  boolean fvq;
  
  public final boolean JP()
  {
    return this.fvq;
  }
  
  public final boolean JQ()
  {
    return com.tencent.mm.sdk.a.b.chp();
  }
  
  public final boolean a(String paramString, j.a parama)
  {
    return com.tencent.mm.plugin.appbrand.dynamic.debugger.b.c(paramString, parama);
  }
  
  public final boolean b(String paramString, j.a parama)
  {
    return com.tencent.mm.plugin.appbrand.dynamic.debugger.b.d(paramString, parama);
  }
  
  public final void bI(Context paramContext)
  {
    e.cP(paramContext);
  }
  
  public final void bx(boolean paramBoolean)
  {
    this.fvq = paramBoolean;
  }
  
  public final void d(Context paramContext, Bundle paramBundle)
  {
    Intent localIntent = new Intent(paramContext, WxaWidgetDebugUI.class);
    String str = WxaWidgetInitializer.bh(paramBundle.getString("app_id"), paramBundle.getString("msg_id"));
    localIntent.putExtras(paramBundle);
    localIntent.putExtra("id", str);
    paramContext.startActivity(localIntent);
  }
  
  public final boolean ho(int paramInt)
  {
    return d.a.ho(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */