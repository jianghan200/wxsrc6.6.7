package com.tencent.mm.plugin.wallet_payu;

import com.tencent.mm.model.ar;
import com.tencent.mm.plugin.wallet_payu.a.d;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.n;

public class Plugin
  implements c
{
  public n createApplication()
  {
    return null;
  }
  
  public ar createSubCore()
  {
    return new d();
  }
  
  public b getContactWidgetFactory()
  {
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/Plugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */