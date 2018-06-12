package com.tencent.mm.plugin.soter_mp;

import com.tencent.mm.model.ar;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.x;

public class Plugin
  implements c
{
  public Plugin()
  {
    x.i("SubCoreSoter", "soter plugin constructor");
  }
  
  public n createApplication()
  {
    return new a();
  }
  
  public ar createSubCore()
  {
    return new b();
  }
  
  public com.tencent.mm.pluginsdk.b.b getContactWidgetFactory()
  {
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/soter_mp/Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */