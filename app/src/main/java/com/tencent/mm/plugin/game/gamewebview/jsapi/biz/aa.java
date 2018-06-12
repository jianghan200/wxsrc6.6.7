package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ipcinvoker.wx_extension.b;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.protocal.c.aox;
import com.tencent.mm.protocal.c.aoy;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import org.json.JSONObject;

public final class aa
  extends a
{
  public static final int CTRL_BYTE = 231;
  public static final String NAME = "login";
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.GameJsApiLogin", "invoke");
    paramJSONObject = paramd.getPageActivity();
    LinkedList localLinkedList = new LinkedList();
    String str = paramd.getCacheAppId();
    if (bi.oW(str))
    {
      x.e("MicroMsg.GameJsApiLogin", "appId is null!");
      paramd.E(paramInt, a.f("login:fail", null));
      return;
    }
    paramd = new a.a(paramd, paramInt);
    b.a locala = new b.a();
    aox localaox = new aox();
    locala.dIG = localaox;
    locala.dIH = new aoy();
    locala.uri = "/cgi-bin/mmbiz-bin/js-login";
    locala.dIF = 1029;
    locala.dII = 0;
    locala.dIJ = 0;
    localaox.jQb = str;
    localaox.rQZ = localLinkedList;
    localaox.rRe = 0;
    localaox.jPK = "";
    localaox.rRf = "";
    localaox.rRb = 0;
    b.a(locala.KT(), new aa.1(this, paramd, paramJSONObject, str));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */