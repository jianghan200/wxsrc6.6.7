package com.tencent.mm.plugin.bottle;

import com.tencent.mm.model.ar;
import com.tencent.mm.plugin.bottle.a.i;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.n;

public final class Plugin
  implements c
{
  private b hjL = new Plugin.1(this);
  
  public final n createApplication()
  {
    return new a();
  }
  
  public final ar createSubCore()
  {
    return new i();
  }
  
  public final b getContactWidgetFactory()
  {
    return this.hjL;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/bottle/Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */