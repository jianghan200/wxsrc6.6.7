package com.tencent.mm.plugin.setting;

import com.tencent.mm.model.ar;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.x;

public final class Plugin
  implements com.tencent.mm.pluginsdk.b.c
{
  public Plugin()
  {
    x.i("MicroMsg.Plugin.setting", "setting constructor " + System.currentTimeMillis());
  }
  
  public final n createApplication()
  {
    x.i("MicroMsg.Plugin.setting", "setting createApplication " + System.currentTimeMillis());
    return new b();
  }
  
  public final ar createSubCore()
  {
    x.i("MicroMsg.Plugin.setting", "setting createSubCore " + System.currentTimeMillis());
    return new c();
  }
  
  public final com.tencent.mm.pluginsdk.b.b getContactWidgetFactory()
  {
    x.i("MicroMsg.Plugin.setting", "setting getContactWidgetFactory " + System.currentTimeMillis());
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/setting/Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */