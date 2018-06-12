package com.tencent.mm.plugin.appbrand.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.WxaEntryInfo;
import com.tencent.mm.plugin.appbrand.n.f;
import com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI;
import com.tencent.mm.plugin.profile.ui.BizBindWxaInfoUI;
import com.tencent.mm.sdk.platformtools.ad;
import java.util.ArrayList;
import java.util.List;

public final class c
  implements f
{
  public final void a(Context paramContext, String paramString1, String paramString2, List<WxaAttributes.WxaEntryInfo> paramList)
  {
    Intent localIntent = new Intent(paramContext, BizBindWxaInfoUI.class);
    localIntent.putParcelableArrayListExtra("extra_wxa_entry_info_list", new ArrayList(paramList));
    localIntent.putExtra("extra_username", paramString1);
    localIntent.putExtra("extra_appid", paramString2);
    if (!(paramContext instanceof Activity)) {
      localIntent.addFlags(268435456);
    }
    paramContext.startActivity(localIntent);
  }
  
  public final void x(Context paramContext, int paramInt)
  {
    Context localContext;
    Intent localIntent;
    if (paramContext == null)
    {
      localContext = ad.getContext();
      localIntent = new Intent(localContext, AppBrandLauncherUI.class).putExtra("extra_enter_scene", paramInt);
      if (!(paramContext instanceof Activity)) {
        break label51;
      }
    }
    label51:
    for (paramInt = 0;; paramInt = 268435456)
    {
      localContext.startActivity(localIntent.addFlags(paramInt));
      return;
      localContext = paramContext;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/app/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */