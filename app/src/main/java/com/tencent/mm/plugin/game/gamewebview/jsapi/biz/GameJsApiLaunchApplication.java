package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.g.a.ir;
import com.tencent.mm.g.a.ir.b;
import com.tencent.mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameProcessActivityTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameProcessActivityTask.a;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a.a;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.protocal.c.aog;
import com.tencent.mm.protocal.c.aoh;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import org.json.JSONObject;

public final class GameJsApiLaunchApplication
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 260;
  public static final String NAME = "launchApplication";
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.GameJsApiLaunchApplication", "invoke");
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.GameJsApiLaunchApplication", "data is null");
      paramd.E(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("launchApplication:fail", null));
      return;
    }
    GameWebViewUI localGameWebViewUI = paramd.getPageActivity();
    Object localObject2 = paramJSONObject.optString("appID");
    String str1 = paramJSONObject.optString("schemeUrl");
    Object localObject1 = paramJSONObject.optString("parameter");
    int i = paramJSONObject.optInt("alertType");
    paramJSONObject = paramJSONObject.optString("extInfo");
    x.i("MicroMsg.GameJsApiLaunchApplication", "appid : %s, scheme : %s, extinfo:[%s], parameter : %s", new Object[] { localObject2, str1, paramJSONObject, localObject1 });
    if ((bi.oW((String)localObject2)) && (bi.oW(str1)))
    {
      x.e("MicroMsg.GameJsApiLaunchApplication", "appid and scheme is null or nil");
      paramd.E(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("launchApplication:fail", null));
      return;
    }
    String str2 = paramd.getCacheAppId();
    localObject1 = new Bundle();
    try
    {
      ((Bundle)localObject1).putString("current_page_url", URLEncoder.encode(paramd.getCurrentURL(), "UTF-8"));
      ((Bundle)localObject1).putString("current_page_appid", str2);
      if (bi.oW((String)localObject2))
      {
        if (!TextUtils.isEmpty(str2))
        {
          paramd.E(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("launchApplication:fail", null));
          return;
        }
        localObject2 = new Intent("android.intent.action.VIEW", Uri.parse(str1));
        ((Intent)localObject2).addFlags(268435456);
        paramJSONObject = bi.B(localGameWebViewUI, (Intent)localObject2);
        if ((paramJSONObject != null) && (!paramJSONObject.isEmpty()))
        {
          if ((TextUtils.isEmpty(((Intent)localObject2).getPackage())) && (paramJSONObject.size() == 1)) {}
          for (paramJSONObject = g.b((ResolveInfo)paramJSONObject.get(0)); !bi.oV(ad.getPackageName()).equals(paramJSONObject); paramJSONObject = ((Intent)localObject2).getPackage())
          {
            g.a(localGameWebViewUI, (Intent)localObject2, null, new GameJsApiLaunchApplication.1(this, paramd, paramInt), (Bundle)localObject1);
            return;
          }
        }
        paramd.E(paramInt, com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("launchApplication:fail", null));
        return;
      }
      a.a locala = new a.a(paramd, paramInt);
      b.a locala1 = new b.a();
      locala1.uri = "/cgi-bin/mmbiz-bin/checklaunchapp";
      locala1.dIF = 1125;
      aog localaog = new aog();
      localaog.bPS = str2;
      localaog.rQM = ((String)localObject2);
      localaog.scene = paramd.getGetA8KeyScene();
      localaog.url = paramd.getCurrentURL();
      localaog.rQN = str1;
      localaog.hUp = i;
      localaog.rQO = 0;
      x.i("MicroMsg.GameJsApiLaunchApplication", "run cgi to check(appId : %s, toAppId : %s, scene : %s, url : %s, schemeUrl : %s, alertType : %s)", new Object[] { str2, localObject2, Integer.valueOf(localaog.scene), localaog.url, localaog.rQN, Integer.valueOf(localaog.hUp) });
      locala1.dIG = localaog;
      locala1.dIH = new aoh();
      com.tencent.mm.ipcinvoker.wx_extension.b.a(locala1.KT(), new GameJsApiLaunchApplication.2(this, locala, str1, localGameWebViewUI, (Bundle)localObject1, (String)localObject2, paramJSONObject));
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;) {}
    }
  }
  
  private static class LaunchApplicationTask
    extends GameProcessActivityTask
  {
    public static final Parcelable.Creator<LaunchApplicationTask> CREATOR = new GameJsApiLaunchApplication.LaunchApplicationTask.3();
    public String appId;
    public Bundle bJx;
    public String extInfo;
    public Runnable fFC;
    public String fGe;
    public int showType;
    public boolean success;
    
    private LaunchApplicationTask(Parcel paramParcel)
    {
      g(paramParcel);
    }
    
    public LaunchApplicationTask(MMActivity paramMMActivity)
    {
      super();
    }
    
    public final void a(Context paramContext, GameProcessActivityTask.a parama)
    {
      if (!g.r(paramContext, this.appId))
      {
        x.e("MicroMsg.GameJsApiLaunchApplication", "app is not installed, appid:[%s]", new Object[] { this.appId });
        this.success = false;
        parama.ahz();
      }
      do
      {
        return;
        localObject1 = new WXAppExtendObject();
        ((WXAppExtendObject)localObject1).extInfo = this.extInfo;
        localObject1 = new WXMediaMessage((WXMediaMessage.IMediaObject)localObject1);
        ((WXMediaMessage)localObject1).sdkVer = 620823808;
        ((WXMediaMessage)localObject1).messageExt = this.extInfo;
        localObject2 = new ir();
        ((ir)localObject2).bSe.bSg = ((WXMediaMessage)localObject1);
        ((ir)localObject2).bSe.appId = this.appId;
        ((ir)localObject2).bSe.showType = this.showType;
        ((ir)localObject2).bSe.context = paramContext;
        ((ir)localObject2).bSe.bJx = this.bJx;
        ((ir)localObject2).bSe.bSh = new GameJsApiLaunchApplication.LaunchApplicationTask.1(this, (ir)localObject2, parama);
        com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject2);
      } while (((ir)localObject2).bSf.bSi);
      Object localObject1 = this.appId + "://" + this.fGe;
      Object localObject2 = new Intent("android.intent.action.VIEW", Uri.parse((String)localObject1));
      x.i("MicroMsg.GameJsApiLaunchApplication", "launchApplication by opensdk failed, try to launch by scheme(%s).", new Object[] { localObject1 });
      ((Intent)localObject2).addFlags(268435456);
      localObject1 = bi.B(paramContext, (Intent)localObject2);
      if ((localObject1 != null) && (!((List)localObject1).isEmpty()))
      {
        if ((TextUtils.isEmpty(((Intent)localObject2).getPackage())) && (((List)localObject1).size() == 1)) {}
        for (localObject1 = g.b((ResolveInfo)((List)localObject1).get(0)); !bi.oV(ad.getPackageName()).equals(localObject1); localObject1 = ((Intent)localObject2).getPackage())
        {
          g.a(paramContext, (Intent)localObject2, null, new GameJsApiLaunchApplication.LaunchApplicationTask.2(this, parama), this.bJx);
          return;
        }
      }
      this.success = false;
      parama.ahz();
    }
    
    public final void aaj()
    {
      if (this.fFC != null) {
        this.fFC.run();
      }
    }
    
    public final void g(Parcel paramParcel)
    {
      boolean bool = true;
      this.showType = paramParcel.readInt();
      this.appId = paramParcel.readString();
      this.fGe = paramParcel.readString();
      this.extInfo = paramParcel.readString();
      this.bJx = paramParcel.readBundle();
      if (paramParcel.readByte() == 1) {}
      for (;;)
      {
        this.success = bool;
        return;
        bool = false;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeInt(this.showType);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.fGe);
      paramParcel.writeString(this.extInfo);
      paramParcel.writeBundle(this.bJx);
      if (this.success) {}
      for (paramInt = 1;; paramInt = 0)
      {
        paramParcel.writeByte((byte)paramInt);
        return;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/GameJsApiLaunchApplication.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */