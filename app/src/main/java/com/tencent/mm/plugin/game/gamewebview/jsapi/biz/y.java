package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import com.tencent.mm.g.a.ir;
import com.tencent.mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.plugin.game.gamewebview.a.d;
import com.tencent.mm.plugin.game.gamewebview.jsapi.GameJsApiMMTask.a;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.model.app.g.a;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class y
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 52;
  public static final int DO_IN_ENV = 2;
  public static final String NAME = "launch3rdApp";
  
  public final void a(Context paramContext, String paramString, final GameJsApiMMTask.a parama)
  {
    x.i("MicroMsg.GameJsApiLaunchApplication", "invoke");
    Object localObject1 = d.ti(paramString);
    if (localObject1 == null)
    {
      parama.tp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("launch_3rdApp:invalid_data", null));
      return;
    }
    int i = ((JSONObject)localObject1).optInt("type");
    paramString = ((JSONObject)localObject1).optString("appID");
    Object localObject2;
    if (i == 0)
    {
      localObject1 = ((JSONObject)localObject1).optString("extInfo");
      x.i("MicroMsg.GameJsApiLaunchApplication", "appid:[%s], extinfo:[%s]", new Object[] { paramString, localObject1 });
      if (bi.oW(paramString))
      {
        x.e("MicroMsg.GameJsApiLaunchApplication", "appid is null or nil");
        parama.tp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("launch_3rdApp:fail", null));
        return;
      }
      if (!com.tencent.mm.plugin.webview.a.a.ezo.r(ad.getContext(), paramString))
      {
        x.e("MicroMsg.GameJsApiLaunchApplication", "app is not installed, appid:[%s]", new Object[] { paramString });
        parama.tp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("launch_3rdApp:fail", null));
        return;
      }
      localObject2 = new WXAppExtendObject();
      ((WXAppExtendObject)localObject2).extInfo = ((String)localObject1);
      localObject2 = new WXMediaMessage((WXMediaMessage.IMediaObject)localObject2);
      ((WXMediaMessage)localObject2).sdkVer = 620823808;
      ((WXMediaMessage)localObject2).messageExt = ((String)localObject1);
      localObject1 = new ir();
      ((ir)localObject1).bSe.bSg = ((WXMediaMessage)localObject2);
      ((ir)localObject1).bSe.appId = paramString;
      ((ir)localObject1).bSe.context = paramContext;
      ((ir)localObject1).bSe.bSh = new g.a()
      {
        public final void cI(boolean paramAnonymousBoolean)
        {
          parama.tp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("launch_3rdApp:ok", null));
        }
      };
      com.tencent.mm.sdk.b.a.sFg.m((b)localObject1);
      return;
    }
    if (i == 1)
    {
      String str = ((JSONObject)localObject1).optString("signature");
      localObject2 = ((JSONObject)localObject1).optString("packageName");
      paramString = ((JSONObject)localObject1).optString("param");
      x.i("MicroMsg.GameJsApiLaunchApplication", "doLaunch3RdApp, signature:[%s], packageName:[%s], param:[%s]", new Object[] { str, localObject2, paramString });
      if ((bi.oW(str)) || (bi.oW((String)localObject2)))
      {
        x.e("MicroMsg.GameJsApiLaunchApplication", "doLaunch3RdApp invalid_args");
        parama.tp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("launch_3rdApp:fail_invalid_args", null));
        return;
      }
      if (!p.r(paramContext, (String)localObject2))
      {
        x.e("MicroMsg.GameJsApiLaunchApplication", "doLaunch3RdApp not_install");
        parama.tp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("launch_3rdApp:fail_not_install", null));
        return;
      }
      Object localObject3 = p.bh(paramContext, (String)localObject2);
      if ((localObject3 != null) && (localObject3[0] != null))
      {
        localObject3 = com.tencent.mm.a.g.u(localObject3[0].toByteArray());
        if ((localObject3 != null) && (((String)localObject3).equalsIgnoreCase(str)))
        {
          str = ((JSONObject)localObject1).optString("current_url");
          localObject1 = ((JSONObject)localObject1).optString("current_appid");
          try
          {
            localObject2 = paramContext.getPackageManager().getLaunchIntentForPackage((String)localObject2);
            if (localObject2 != null)
            {
              localObject3 = new Bundle();
              p.g((Bundle)localObject3, paramString);
              ((Intent)localObject2).putExtras((Bundle)localObject3);
              ((Intent)localObject2).addFlags(268435456);
              paramString = new Bundle();
              paramString.putString("current_page_url", str);
              paramString.putString("current_page_appid", (String)localObject1);
              com.tencent.mm.pluginsdk.model.app.g.a(paramContext, (Intent)localObject2, null, new y.2(this, parama), paramString);
              return;
            }
          }
          catch (Exception paramContext)
          {
            x.e("MicroMsg.GameJsApiLaunchApplication", "doLaunch3RdApp getLaunchIntentForPackage, %s", new Object[] { paramContext.getMessage() });
            parama.tp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("launch_3rdApp:fail", null));
            return;
          }
        }
      }
      x.e("MicroMsg.GameJsApiLaunchApplication", "doLaunch3RdApp signature_mismatch");
      parama.tp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("launch_3rdApp:fail_signature_mismatch", null));
      return;
    }
    parama.tp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("launch_3rdApp:fail_invalid_type", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */