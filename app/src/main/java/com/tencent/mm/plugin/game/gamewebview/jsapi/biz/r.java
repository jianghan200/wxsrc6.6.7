package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import com.tencent.mm.plugin.game.gamewebview.jsapi.GameJsApiMMTask.a;
import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;

public final class r
  extends a
{
  public static final int CTRL_BYTE = -2;
  public static final int DO_IN_ENV = 1;
  public static final String NAME = "getLocalWePkgInfo";
  
  public final void a(Context paramContext, String paramString, GameJsApiMMTask.a parama)
  {
    x.i("MicroMsg.GameJsApiGetLocalWePkgInfo", "invoke");
    ah.A(new r.1(this, parama));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */