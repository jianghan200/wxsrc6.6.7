package com.tencent.mm.plugin.account.ui;

import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.applet.SecurityImage.b;

public abstract class b
  extends SecurityImage.b
{
  SecurityImage eIX = null;
  l ePq = null;
  
  public final void Xe()
  {
    g.DF().a(a(this.ePq, ""), 0);
  }
  
  public abstract l a(l paraml, String paramString);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/account/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */