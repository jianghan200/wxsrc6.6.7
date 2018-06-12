package com.tencent.mm.plugin.game.model;

import java.util.Iterator;
import java.util.LinkedList;

public final class k
  extends j
{
  protected k(String paramString)
  {
    super(paramString);
  }
  
  public final void aTP()
  {
    LinkedList localLinkedList = m(optJSONArray("items"));
    Iterator localIterator = localLinkedList.iterator();
    while (localIterator.hasNext())
    {
      d locald = (d)localIterator.next();
      locald.dj(locald.jLc);
    }
    com.tencent.mm.plugin.game.e.d.S(localLinkedList);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/model/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */