package com.tencent.mm.plugin.appbrand.game.d.a;

import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.plugin.appbrand.l;
import java.util.HashMap;
import java.util.Map;

final class c
  extends h
{
  static final int CTRL_INDEX = 78;
  static final String NAME = "onKeyboardInput";
  
  final void a(String paramString, l paraml)
  {
    HashMap localHashMap = new HashMap(2);
    localHashMap.put("errMsg", "ok");
    localHashMap.put("value", paramString);
    x(localHashMap).a(paraml).ahM();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/game/d/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */