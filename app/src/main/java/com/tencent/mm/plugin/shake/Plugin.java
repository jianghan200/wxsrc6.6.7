package com.tencent.mm.plugin.shake;

import android.content.Context;
import com.tencent.mm.model.ar;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.n;

public class Plugin
  implements c
{
  private b mWm = new b()
  {
    public final com.tencent.mm.pluginsdk.b.a Z(Context paramAnonymousContext, String paramAnonymousString)
    {
      return new com.tencent.mm.plugin.shake.ui.a(paramAnonymousContext);
    }
  };
  
  public n createApplication()
  {
    return new a();
  }
  
  public ar createSubCore()
  {
    return new m();
  }
  
  public b getContactWidgetFactory()
  {
    return this.mWm;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/shake/Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */