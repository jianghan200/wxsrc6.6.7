package com.tencent.mm.plugin.qqmail;

import com.tencent.mm.model.ar;
import com.tencent.mm.plugin.qqmail.b.w;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.n;

public final class Plugin
  implements c
{
  private a mbX = new a();
  
  public final n createApplication()
  {
    return new com.tencent.mm.plugin.qqmail.a.a();
  }
  
  public final ar createSubCore()
  {
    return new w();
  }
  
  public final b getContactWidgetFactory()
  {
    return this.mbX;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/qqmail/Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */