package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.mm.sdk.platformtools.x;
import java.util.HashSet;
import java.util.Set;

public final class g
{
  private Set<String> kQj = new HashSet();
  private Object lock = new Object();
  
  public final boolean Gb(String paramString)
  {
    synchronized (this.lock)
    {
      if (!this.kQj.contains(paramString))
      {
        boolean bool = this.kQj.add(paramString);
        return bool;
      }
      x.i("MicroMsg.LuckyMoneyMsg", "has contains msg, %s", new Object[] { paramString });
      return false;
    }
  }
  
  public final void Gc(String paramString)
  {
    synchronized (this.lock)
    {
      this.kQj.remove(paramString);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */