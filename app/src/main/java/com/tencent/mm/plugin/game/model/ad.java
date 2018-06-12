package com.tencent.mm.plugin.game.model;

import com.tencent.mm.bk.a;
import com.tencent.mm.plugin.game.d.bn;
import com.tencent.mm.plugin.game.d.e;
import java.util.Iterator;
import java.util.LinkedList;

public final class ad
  extends ac
{
  public LinkedList<d> jNA;
  private int jNB = 0;
  public bn jNz;
  private int mType = 0;
  
  public ad(a parama, int paramInt1, int paramInt2)
  {
    if (parama == null)
    {
      this.jNz = new bn();
      return;
    }
    this.jNz = ((bn)parama);
    this.mType = paramInt1;
    this.jNB = paramInt2;
    parama = new LinkedList();
    if (this.jNz.jSk != null)
    {
      paramInt1 = this.jNB;
      Iterator localIterator = this.jNz.jSk.iterator();
      paramInt1 += 1;
      while (localIterator.hasNext())
      {
        d locald = a((e)localIterator.next());
        if (locald != null)
        {
          switch (this.mType)
          {
          }
          for (;;)
          {
            parama.add(locald);
            break;
            locald.scene = 16;
            locald.bYq = 1601;
            paramInt2 = paramInt1 + 1;
            locald.position = paramInt1;
            paramInt1 = paramInt2;
            continue;
            locald.scene = 15;
            locald.bYq = 1501;
            paramInt2 = paramInt1 + 1;
            locald.position = paramInt1;
            paramInt1 = paramInt2;
          }
        }
      }
    }
    this.jNA = parama;
    com.tencent.mm.plugin.game.e.d.S(this.jNA);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/model/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */