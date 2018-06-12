package com.tencent.mm.plugin.appbrand.wxawidget.console;

import android.os.Bundle;
import com.tencent.mm.ipcinvoker.d.a;
import com.tencent.mm.ipcinvoker.d.b;
import com.tencent.mm.ipcinvoker.d.e;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.plugin.appbrand.wxawidget.a;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class d
{
  private static final Map<String, List<a>> dmH = new ConcurrentHashMap();
  private static List<a> gQp = new LinkedList();
  private static final e gQq = new d.1();
  
  public static boolean a(a parama)
  {
    if (gQp.contains(parama)) {
      return false;
    }
    Object localObject;
    e locale;
    com.tencent.mm.ipcinvoker.d locald;
    if ((dmH.isEmpty()) && (gQp.isEmpty()))
    {
      localObject = c.gQo;
      locale = gQq;
      locald = ((com.tencent.mm.ipcinvoker.d.d)localObject).dmX;
      localObject = ((com.tencent.mm.ipcinvoker.d.d)localObject).bHA;
      if ((localObject != null) && (((String)localObject).length() != 0) && (locale != null)) {
        break label79;
      }
    }
    for (;;)
    {
      return gQp.add(parama);
      label79:
      Bundle localBundle = new Bundle();
      localBundle.putString("Token", com.tencent.mm.ipcinvoker.d.au(locale));
      localBundle.putString("Event", (String)localObject);
      f.a(locald.dmw, localBundle, d.a.class, locale);
    }
  }
  
  public static boolean b(a parama)
  {
    boolean bool = gQp.remove(parama);
    Object localObject;
    com.tencent.mm.ipcinvoker.d locald;
    if ((dmH.isEmpty()) && (gQp.isEmpty()))
    {
      localObject = c.gQo;
      parama = gQq;
      locald = ((com.tencent.mm.ipcinvoker.d.d)localObject).dmX;
      localObject = ((com.tencent.mm.ipcinvoker.d.d)localObject).bHA;
      if ((localObject != null) && (((String)localObject).length() != 0) && (parama != null)) {}
    }
    else
    {
      return bool;
    }
    Bundle localBundle = new Bundle();
    localBundle.putString("Token", com.tencent.mm.ipcinvoker.d.au(parama));
    localBundle.putString("Event", (String)localObject);
    f.a(locald.dmw, localBundle, d.b.class, null);
    return bool;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/wxawidget/console/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */