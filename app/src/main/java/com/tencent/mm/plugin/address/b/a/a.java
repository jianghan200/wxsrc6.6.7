package com.tencent.mm.plugin.address.b.a;

import com.tencent.mm.plugin.q.a.b;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
{
  public com.tencent.mm.plugin.q.a.a eXD = new com.tencent.mm.plugin.q.a.a();
  
  public final b jp(int paramInt)
  {
    Iterator localIterator = this.eXD.knz.iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      if (localb.knA == paramInt) {
        return localb;
      }
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/address/b/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */