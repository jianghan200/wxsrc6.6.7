package com.tencent.mm.plugin.appbrand.game.d;

import com.tencent.mm.plugin.appbrand.game.d.a.f;
import com.tencent.mm.plugin.appbrand.jsapi.ak;
import com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData;
import com.tencent.mm.plugin.appbrand.jsapi.i;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class c
{
  private static final String[] fCn = { "scrollWebviewTo" };
  
  public static Map<String, com.tencent.mm.plugin.appbrand.jsapi.e> agz()
  {
    Map localMap = i.ahN();
    localMap.putAll(i.ahO());
    Object localObject = new HashSet();
    ((Collection)localObject).add(new JsApiOperateWXData());
    ((Collection)localObject).add(new com.tencent.mm.plugin.appbrand.game.d.a.e());
    ((Collection)localObject).add(new f());
    ((Collection)localObject).add(new com.tencent.mm.plugin.appbrand.game.d.a.d());
    ((Collection)localObject).add(new ak());
    ((Collection)localObject).add(new b());
    ((Collection)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.l.c());
    ((Collection)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.l.b());
    ((Collection)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.l.d());
    ((Collection)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.video.a());
    ((Collection)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.video.d());
    ((Collection)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.video.c());
    ((Collection)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.video.b());
    ((Collection)localObject).add(new a());
    ((Collection)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.g.a());
    localObject = ((Set)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      com.tencent.mm.plugin.appbrand.jsapi.e locale = (com.tencent.mm.plugin.appbrand.jsapi.e)((Iterator)localObject).next();
      if ((locale != null) && (!bi.oW(locale.getName()))) {
        localMap.put(locale.getName(), locale);
      }
    }
    localObject = fCn;
    int j = localObject.length;
    int i = 0;
    while (i < j)
    {
      localMap.remove(localObject[i]);
      i += 1;
    }
    return localMap;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/game/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */