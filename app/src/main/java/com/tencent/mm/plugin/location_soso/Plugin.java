package com.tencent.mm.plugin.location_soso;

import com.tencent.mm.model.ar;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.x;

public class Plugin
  implements c
{
  public static final String TAG = "MicroMsg.Plugin";
  
  public Plugin()
  {
    x.d("MicroMsg.Plugin", "initLoctionInit");
  }
  
  public n createApplication()
  {
    return null;
  }
  
  public ar createSubCore()
  {
    return null;
  }
  
  public b getContactWidgetFactory()
  {
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/location_soso/Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */