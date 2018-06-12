package com.tencent.mm.plugin.appbrand;

import android.graphics.Bitmap;
import android.os.Looper;
import com.tencent.magicbrush.handler.image.MBCanvasContentHolder;
import com.tencent.mm.plugin.appbrand.game.e.a;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bd;
import com.tencent.mm.sdk.platformtools.x;

public final class t
{
  public static void i(g paramg)
  {
    if (paramg == null)
    {
      x.e("MicroMsg.AppBrand.RuntimeRestartHelper", "restart skip with Null runtime");
      return;
    }
    if (!paramg.dti)
    {
      x.e("MicroMsg.AppBrand.RuntimeRestartHelper", "restart %s, not initialized", new Object[] { paramg.mAppId });
      return;
    }
    j(paramg);
  }
  
  static void j(g paramg)
  {
    if (ah.isMainThread())
    {
      e.post(new t.1(paramg), String.format("performRestart$%s", new Object[] { paramg.mAppId }));
      return;
    }
    Object localObject;
    if (paramg.aaq())
    {
      localObject = a.fDd.ahj();
      if (localObject == null) {
        localObject = null;
      }
    }
    for (;;)
    {
      ah.A(new t.2(paramg, (Bitmap)localObject));
      return;
      localObject = ((MBCanvasContentHolder)localObject).content;
      continue;
      localObject = (Bitmap)new t.3(paramg).a(new ag(Looper.getMainLooper()));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */