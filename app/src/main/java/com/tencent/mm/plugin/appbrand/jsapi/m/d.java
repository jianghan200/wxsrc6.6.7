package com.tencent.mm.plugin.appbrand.jsapi.m;

import com.tencent.mm.bc.a.a;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import java.util.HashMap;
import java.util.Map;

final class d
  extends h
{
  static final int CTRL_INDEX = 473;
  static final String NAME = "onDeviceOrientationChange";
  
  final void a(a.a parama)
  {
    parama = parama.name().replace("_", "");
    HashMap localHashMap = new HashMap(2);
    localHashMap.put("errMsg", "ok");
    localHashMap.put("value", parama);
    x(localHashMap).ahM();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/m/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */