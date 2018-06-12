package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.v;
import com.tencent.mm.g.a.qu;
import com.tencent.mm.g.a.qu.b;
import com.tencent.mm.plugin.game.gamewebview.jsapi.GameJsApiMMTask.a;
import com.tencent.mm.protocal.c.ccy;
import com.tencent.mm.protocal.c.ccz;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class ah
  extends com.tencent.mm.plugin.game.gamewebview.jsapi.a
{
  public static final int CTRL_BYTE = 10000;
  public static final int DO_IN_ENV = 1;
  public static final String NAME = "openWeAppPage";
  
  public final void a(Context paramContext, String paramString, GameJsApiMMTask.a parama)
  {
    x.i("MicroMsg.GameJsApiOpenWeAppPage", "invoke");
    paramString = com.tencent.mm.plugin.game.gamewebview.a.d.ti(paramString);
    if (paramString == null)
    {
      x.e("MicroMsg.GameJsApiOpenWeAppPage", "data is null");
      parama.tp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("openWeAppPage:fail_null_data", null));
      return;
    }
    String str1 = paramString.optString("userName");
    String str2 = paramString.optString("relativeURL");
    int i = paramString.optInt("appVersion", 0);
    Object localObject1 = paramString.optString("searchId");
    Object localObject2 = paramString.optString("docId");
    int j = paramString.optInt("position", 1);
    int k = paramString.optInt("scene", 1000);
    paramContext = new qu();
    if (k == 201) {
      paramContext.cbq.scene = 1006;
    }
    for (;;)
    {
      paramContext.cbq.userName = str1;
      paramContext.cbq.cbs = str2;
      paramContext.cbq.cbu = i;
      paramContext.cbq.cby = false;
      str1 = paramString.optString("statSessionId");
      str2 = paramString.optString("statKeywordId");
      String str3 = paramString.optString("subScene");
      paramContext.cbq.bGG = (str1 + ":" + str2 + ":" + (String)localObject1 + ":" + (String)localObject2 + ":" + j + ":" + str3);
      com.tencent.mm.sdk.b.a.sFg.m(paramContext);
      localObject1 = new b.a();
      ((b.a)localObject1).dIG = new ccy();
      ((b.a)localObject1).dIH = new ccz();
      ((b.a)localObject1).uri = "/cgi-bin/mmux-bin/weappsearchadclick";
      ((b.a)localObject1).dIF = 1873;
      localObject1 = ((b.a)localObject1).KT();
      localObject2 = (ccy)((b)localObject1).dID.dIL;
      ((ccy)localObject2).syz = paramString.optString("statSessionId");
      ((ccy)localObject2).syA = paramString.optString("statKeywordId");
      ((ccy)localObject2).rUM = paramString.optString("searchId");
      ((ccy)localObject2).shK = paramString.optString("docId");
      ((ccy)localObject2).eIy = paramString.optInt("position", 1);
      ((ccy)localObject2).lPe = paramString.optString("userName");
      ((ccy)localObject2).syB = paramString.optInt("appVersion", 0);
      ((ccy)localObject2).syC = paramString.optString("adBuffer");
      ((ccy)localObject2).syD = paramString.optString("clickExtInfo");
      paramString = new com.tencent.mm.modelsns.d();
      paramString.r("20StatSessionId", ((ccy)localObject2).syz + ",");
      paramString.r("21KeywordId", ((ccy)localObject2).syA + ",");
      paramString.r("22SearchId", ((ccy)localObject2).rUM + ",");
      paramString.r("23DocId", ((ccy)localObject2).shK + ",");
      paramString.r("24Pos", ((ccy)localObject2).eIy + ",");
      paramString.r("25AppUserName", ((ccy)localObject2).lPe + ",");
      paramString.r("26AppVersion", ((ccy)localObject2).syB + ",");
      paramString.r("27AdBuffer", ((ccy)localObject2).syC + ",");
      paramString.r("28AdClickBuffer", ((ccy)localObject2).syD + ",");
      paramString.r("29scene", k + ",");
      x.i("MicroMsg.GameJsApiOpenWeAppPage", "doClickReportScene oreh" + paramString.wF());
      v.a((b)localObject1, new ah.1(this, paramString));
      if (!paramContext.cbr.cbD) {
        break;
      }
      parama.tp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("openWeAppPage:ok", null));
      return;
      if (k == 3) {
        paramContext.cbq.scene = 1005;
      } else if (k == 16) {
        paramContext.cbq.scene = 1042;
      } else {
        paramContext.cbq.scene = 1000;
      }
    }
    parama.tp(com.tencent.mm.plugin.game.gamewebview.jsapi.a.f("openWeAppPage:fail:" + bi.oV(paramContext.cbr.cbE), null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */