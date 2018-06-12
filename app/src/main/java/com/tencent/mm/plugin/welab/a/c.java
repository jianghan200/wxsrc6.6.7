package com.tencent.mm.plugin.welab.a;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.plugin.welab.d.b;
import com.tencent.mm.plugin.welab.ui.WelabMainUI;

public final class c
  implements com.tencent.mm.plugin.welab.a.a.c
{
  public final boolean bYN()
  {
    b.bYX();
    return (b.bYZ()) && (!bYO());
  }
  
  public final boolean bYO()
  {
    b.bYX();
    if (!b.bZa())
    {
      b.bYX();
      if (b.bYZ()) {
        return true;
      }
    }
    return false;
  }
  
  public final boolean bYP()
  {
    return !bYO();
  }
  
  public final void x(Context paramContext, Intent paramIntent)
  {
    paramIntent.setClass(paramContext, WelabMainUI.class);
    if ((bYN()) || (bYO())) {}
    for (int i = 1;; i = 0)
    {
      paramIntent.putExtra("para_from_with_red_point", i);
      paramContext.startActivity(paramIntent);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/welab/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */