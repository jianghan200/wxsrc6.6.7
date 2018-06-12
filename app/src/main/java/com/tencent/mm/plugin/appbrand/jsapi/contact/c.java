package com.tencent.mm.plugin.appbrand.jsapi.contact;

import android.content.Intent;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams.a;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.share.k;
import com.tencent.mm.plugin.appbrand.n;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.protocal.c.aic;
import com.tencent.mm.protocal.c.aid;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import org.json.JSONObject;

public final class c
  extends a
{
  public static final int CTRL_INDEX = 145;
  public static final String NAME = "enterContact";
  public static int fIS = 0;
  private String fPn;
  private String fPo;
  private String fPp;
  private String fPq;
  private boolean fPr;
  private String fPs;
  private boolean fPt;
  private String sessionFrom;
  
  private void a(p paramp, AppBrandSysConfig paramAppBrandSysConfig, String paramString, a parama)
  {
    JsApiChattingTask localJsApiChattingTask = new JsApiChattingTask();
    WxaExposedParams.a locala = new WxaExposedParams.a();
    locala.appId = paramp.mAppId;
    locala.username = paramAppBrandSysConfig.bGy;
    locala.nickname = paramAppBrandSysConfig.bKC;
    locala.iconUrl = paramAppBrandSysConfig.fqJ;
    locala.fih = paramAppBrandSysConfig.frm.fih;
    locala.fii = paramAppBrandSysConfig.frm.fii;
    locala.fso = paramAppBrandSysConfig.frm.bKg;
    locala.bJu = 5;
    Object localObject = "";
    if (paramp != null) {
      localObject = paramp.getURL();
    }
    x.d("MicroMsg.JsApiEnterContact", "getCurrentPageId %s", new Object[] { localObject });
    locala.bVs = ((String)localObject);
    locala.fsp = n.qz(paramp.mAppId);
    String str = paramAppBrandSysConfig.bGy;
    if (!bi.oW(paramString))
    {
      localObject = paramString;
      localJsApiChattingTask.username = ((String)localObject);
      localObject = paramAppBrandSysConfig.bKC;
      if (bi.oW(paramString)) {
        break label256;
      }
      paramAppBrandSysConfig = "";
    }
    for (;;)
    {
      localJsApiChattingTask.nickname = paramAppBrandSysConfig;
      localJsApiChattingTask.sessionFrom = this.sessionFrom;
      localJsApiChattingTask.fFC = new c.4(this, localJsApiChattingTask, locala, paramp, parama);
      localJsApiChattingTask.ahA();
      AppBrandMainProcessService.a(localJsApiChattingTask);
      return;
      localObject = str;
      if (!bi.oW(str)) {
        break;
      }
      x.e("MicroMsg.JsApiEnterContact", "username & subBusinessUsername is null, err");
      localObject = "";
      break;
      label256:
      paramAppBrandSysConfig = (AppBrandSysConfig)localObject;
      if (bi.oW((String)localObject))
      {
        x.e("MicroMsg.JsApiEnterContact", "username & subBusinessUsername is null, err");
        paramAppBrandSysConfig = "";
      }
    }
  }
  
  private void a(p paramp, JSONObject paramJSONObject, a parama)
  {
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.JsApiEnterContact", "enterChatting fail, data is null");
      return;
    }
    AppBrandSysConfig localAppBrandSysConfig = paramp.fdO.fcu;
    if (localAppBrandSysConfig == null)
    {
      x.i("MicroMsg.JsApiEnterContact", "enterChatting fail, config is null");
      parama.a(false, "fail:config is null", null);
      return;
    }
    this.sessionFrom = paramJSONObject.optString("sessionFrom");
    if (this.sessionFrom.length() > 1024)
    {
      this.sessionFrom = this.sessionFrom.substring(0, 1024);
      x.i("MicroMsg.JsApiEnterContact", "sessionFrom length is large than 1024!");
    }
    this.fPn = paramJSONObject.optString("businessId");
    this.fPo = paramJSONObject.optString("sendMessageTitle");
    this.fPp = paramJSONObject.optString("sendMessagePath");
    this.fPq = paramJSONObject.optString("sendMessageImg");
    this.fPr = paramJSONObject.optBoolean("showMessageCard", false);
    this.fPt = k.tY(this.fPq);
    this.fPs = k.a(paramp, this.fPq, true);
    if (bi.oW(this.fPn))
    {
      x.i("MicroMsg.JsApiEnterContact", "businessId is empty, enter to chatting");
      a(paramp, localAppBrandSysConfig, "", parama);
      return;
    }
    x.i("MicroMsg.JsApiEnterContact", "do GetSubBusinessInfo cgi");
    if ((localAppBrandSysConfig == null) || (bi.oW(localAppBrandSysConfig.bGy)))
    {
      x.e("MicroMsg.JsApiEnterContact", "doCgiAndEnterChatting username is null, err");
      parama.a(false, "fail", null);
      return;
    }
    paramJSONObject = new b.a();
    paramJSONObject.dIG = new aic();
    paramJSONObject.dIH = new aid();
    paramJSONObject.uri = "/cgi-bin/mmbiz-bin/wxausrevent/getsubbusinessinfo";
    paramJSONObject.dIF = 1303;
    paramJSONObject.dII = 0;
    paramJSONObject.dIJ = 0;
    paramJSONObject = paramJSONObject.KT();
    aic localaic = (aic)paramJSONObject.dID.dIL;
    localaic.username = localAppBrandSysConfig.bGy;
    localaic.rKT = this.fPn;
    com.tencent.mm.ipcinvoker.wx_extension.b.a(paramJSONObject, new c.3(this, parama, paramp, localAppBrandSysConfig));
  }
  
  public final void a(com.tencent.mm.plugin.appbrand.l paraml, JSONObject paramJSONObject, int paramInt)
  {
    p localp = d(paraml);
    if (localp == null)
    {
      x.i("MicroMsg.JsApiEnterContact", "enterChatting fail, pageView is null");
      paraml.E(paramInt, f("fail:current page do not exist", null));
      return;
    }
    a(localp, paramJSONObject, new c.2(this, paraml, paramInt));
  }
  
  public final void a(final p paramp, JSONObject paramJSONObject, final int paramInt)
  {
    a(paramp, paramJSONObject, new a()
    {
      public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, Intent paramAnonymousIntent)
      {
        x.i("MicroMsg.JsApiEnterContact", "page enterChatting isSuccess:%b", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
        if (paramAnonymousBoolean)
        {
          HashMap localHashMap = new HashMap();
          String str = "";
          paramAnonymousString = new HashMap();
          if (paramAnonymousIntent != null)
          {
            paramAnonymousString = bi.aG(paramAnonymousIntent.getStringExtra("keyOutPagePath"), "");
            str = com.tencent.mm.plugin.appbrand.q.l.vP(paramAnonymousString);
            paramAnonymousString = com.tencent.mm.plugin.appbrand.q.l.vQ(paramAnonymousString);
          }
          localHashMap.put("path", str);
          localHashMap.put("query", paramAnonymousString);
          x.i("MicroMsg.JsApiEnterContact", "onBackFromContact path:%s, query:%s", new Object[] { str, paramAnonymousString.toString() });
          paramp.E(paramInt, c.this.f("ok", localHashMap));
          return;
        }
        paramp.E(paramInt, c.this.f(paramAnonymousString, null));
      }
    });
  }
  
  private static abstract interface a
  {
    public abstract void a(boolean paramBoolean, String paramString, Intent paramIntent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/contact/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */