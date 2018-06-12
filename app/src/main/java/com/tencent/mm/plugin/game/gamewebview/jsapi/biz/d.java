package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ipcinvoker.wx_extension.b;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a.a;
import com.tencent.mm.plugin.game.gamewebview.ui.GameWebViewUI;
import com.tencent.mm.protocal.c.aot;
import com.tencent.mm.protocal.c.aou;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d
  extends a
{
  public static final int CTRL_BYTE = 232;
  public static final String NAME = "authorize";
  
  public final void a(com.tencent.mm.plugin.game.gamewebview.ui.d paramd, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.GameJsApiAuthorize", "invoke");
    GameWebViewUI localGameWebViewUI = paramd.getPageActivity();
    Object localObject = paramJSONObject.optJSONArray("scope");
    if (localObject == null)
    {
      x.e("MicroMsg.GameJsApiAuthorize", "scope is null!");
      paramd.E(paramInt, a.f("authorize:fail", null));
      return;
    }
    paramJSONObject = paramd.getCacheAppId();
    if (bi.oW(paramJSONObject))
    {
      x.e("MicroMsg.GameJsApiAuthorize", "appId is null!");
      paramd.E(paramInt, a.f("authorize:fail", null));
      return;
    }
    LinkedList localLinkedList = new LinkedList();
    int i = 0;
    while (i < ((JSONArray)localObject).length())
    {
      localLinkedList.add(((JSONArray)localObject).optString(i));
      i += 1;
    }
    localObject = new b.a();
    aot localaot = new aot();
    ((b.a)localObject).dIG = localaot;
    ((b.a)localObject).dIH = new aou();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/js-authorize";
    ((b.a)localObject).dIF = 1157;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    localaot.jQb = paramJSONObject;
    localaot.rQZ = localLinkedList;
    localaot.rRb = 0;
    paramd = new a.a(paramd, paramInt);
    b.a(((b.a)localObject).KT(), new d.1(this, paramd, localGameWebViewUI, paramJSONObject));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */