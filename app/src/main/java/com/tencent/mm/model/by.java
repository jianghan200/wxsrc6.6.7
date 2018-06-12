package com.tencent.mm.model;

import com.tencent.mm.sdk.platformtools.x;
import java.util.HashSet;
import java.util.Set;

public final class by
{
  public boolean bgH = false;
  public Set<a> dDD = new HashSet();
  
  public final boolean a(a parama)
  {
    if (this.bgH)
    {
      x.e("MicroMsg.UninitForUEH", "add , is running , forbid add");
      return false;
    }
    return this.dDD.add(parama);
  }
  
  public final boolean b(a parama)
  {
    if (this.bgH)
    {
      x.e("MicroMsg.UninitForUEH", "remove , is running , forbid remove");
      return false;
    }
    return this.dDD.remove(parama);
  }
  
  public static abstract interface a
  {
    public abstract boolean IS();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/model/by.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */