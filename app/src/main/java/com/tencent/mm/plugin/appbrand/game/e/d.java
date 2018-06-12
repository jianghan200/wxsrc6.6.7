package com.tencent.mm.plugin.appbrand.game.e;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class d
{
  private static boolean fBd = false;
  
  public static void cw(Context paramContext)
  {
    Object localObject = q.deU.dbx;
    if (fBd)
    {
      x.i("MicroMsg.WAGameShowFailDialogUtil", "hy: already shown");
      return;
    }
    String str1 = ad.getResources().getString(s.j.appbrand_game_game_start_error);
    String str2 = ad.getResources().getString(s.j.app_tip);
    if (!bi.oW((String)localObject)) {}
    for (;;)
    {
      com.tencent.mm.plugin.appbrand.ipc.a.a(paramContext, (String)localObject, str2, ad.getResources().getString(s.j.app_ok), "", new d.1(), new d.2(), new d.3());
      fBd = true;
      return;
      localObject = str1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/game/e/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */