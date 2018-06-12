package com.tencent.mm.plugin.wear.model.e;

import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class q
{
  public HashMap<Integer, a> pKf = new HashMap();
  
  public final void a(a parama)
  {
    Iterator localIterator = parama.bSy().iterator();
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      x.d("MicroMsg.Wear.WearHttpServerLogic", "add funId %d %s", new Object[] { Integer.valueOf(i), parama });
      this.pKf.put(Integer.valueOf(i), parama);
    }
  }
  
  public final a zG(int paramInt)
  {
    return (a)this.pKf.get(Integer.valueOf(paramInt));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/wear/model/e/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */