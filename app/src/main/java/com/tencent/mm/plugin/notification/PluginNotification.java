package com.tencent.mm.plugin.notification;

import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.model.al;
import com.tencent.mm.plugin.notification.b.a;

public class PluginNotification
  extends f
  implements a
{
  private al lHs;
  
  public void execute(g paramg) {}
  
  public al getNotification()
  {
    return this.lHs;
  }
  
  public void setNotification(al paramal)
  {
    this.lHs = paramal;
    b.lHh = paramal;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/notification/PluginNotification.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */