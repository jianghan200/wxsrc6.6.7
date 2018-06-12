package com.tencent.mm.plugin.kitchen.b;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.plugin.kitchen.ui.KvInfoUI;

public final class a
  implements com.tencent.mm.plugin.kitchen.a.a
{
  public final void s(Context paramContext, Intent paramIntent)
  {
    paramIntent.setClass(paramContext, KvInfoUI.class);
    paramContext.startActivity(paramIntent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/kitchen/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */