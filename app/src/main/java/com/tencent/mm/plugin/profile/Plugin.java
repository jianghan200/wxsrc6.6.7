package com.tencent.mm.plugin.profile;

import com.tencent.mm.model.ar;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.x;

public final class Plugin
  implements c
{
  public Plugin()
  {
    x.i("MicroMsg.Plugin.profile", "profile constructor " + System.currentTimeMillis());
  }
  
  public final n createApplication()
  {
    x.i("MicroMsg.Plugin.profile", "profile createApplication " + System.currentTimeMillis());
    return new a();
  }
  
  public final ar createSubCore()
  {
    x.i("MicroMsg.Plugin.profile", "profile createSubCore " + System.currentTimeMillis());
    return new b();
  }
  
  public final com.tencent.mm.pluginsdk.b.b getContactWidgetFactory()
  {
    x.i("MicroMsg.Plugin.profile", "profile getContactWidgetFactory " + System.currentTimeMillis());
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/profile/Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */