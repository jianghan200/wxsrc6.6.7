package com.tencent.mm.plugin.i;

import com.tencent.mm.kernel.a.c.a;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.model.ak;
import com.tencent.mm.model.au;

public final class e
  extends a
{
  private ak dBw;
  
  public e(ak paramak)
  {
    this.dBw = paramak;
  }
  
  public final void execute(g paramg)
  {
    au.a(this.dBw, new e.1(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/i/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */