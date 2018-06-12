package com.tencent.mm.plugin.game.model;

import com.tencent.mm.bk.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.d.b;
import com.tencent.mm.plugin.game.d.bl;
import com.tencent.mm.plugin.game.d.cg;
import com.tencent.mm.plugin.game.d.cp;
import com.tencent.mm.plugin.game.d.cq;
import com.tencent.mm.plugin.game.d.da;
import com.tencent.mm.plugin.game.d.e;
import com.tencent.mm.plugin.game.d.m;
import com.tencent.mm.plugin.game.ui.GameLibraryCategoriesView.a;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public final class aj
  extends ac
{
  private int jNB = 0;
  public bl jNW;
  public LinkedList<d> jNX;
  public LinkedList<d> jNY;
  
  public aj(a parama, boolean paramBoolean, int paramInt)
  {
    if (parama == null)
    {
      this.jNW = new bl();
      return;
    }
    this.jNW = ((bl)parama);
    this.jNB = paramInt;
    this.jNX = aUt();
    this.jNY = aUu();
    if (paramBoolean) {
      ((com.tencent.mm.plugin.game.a.c)g.l(com.tencent.mm.plugin.game.a.c.class)).aSk().a("pb_library", parama);
    }
    com.tencent.mm.plugin.game.e.d.S(this.jNX);
    com.tencent.mm.plugin.game.e.d.S(this.jNY);
  }
  
  public aj(byte[] paramArrayOfByte)
  {
    this.jNW = new bl();
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      return;
    }
    try
    {
      this.jNW.aG(paramArrayOfByte);
      this.jNX = aUt();
      this.jNY = aUu();
      com.tencent.mm.plugin.game.e.d.S(this.jNX);
      com.tencent.mm.plugin.game.e.d.S(this.jNY);
      return;
    }
    catch (IOException paramArrayOfByte)
    {
      for (;;)
      {
        x.e("MicroMsg.GamePBDataLibrary", "Parsing Failed: %s", new Object[] { paramArrayOfByte.getMessage() });
      }
    }
  }
  
  private LinkedList<d> aUt()
  {
    LinkedList localLinkedList = new LinkedList();
    if ((this.jNW.jSe == null) || (this.jNW.jSe.jSJ == null) || (this.jNW.jSe.jSJ.jSY == null)) {
      return localLinkedList;
    }
    Iterator localIterator = this.jNW.jSe.jSJ.jSY.iterator();
    int i = 1;
    while (localIterator.hasNext())
    {
      cq localcq = (cq)localIterator.next();
      d locald = a(localcq.jOV);
      if (locald != null)
      {
        locald.jLm = localcq.jOV.jPl;
        locald.scene = 11;
        locald.bYq = 1110;
        locald.position = i;
        localLinkedList.add(locald);
        i += 1;
      }
    }
    return localLinkedList;
  }
  
  private LinkedList<d> aUu()
  {
    LinkedList localLinkedList = new LinkedList();
    if (this.jNW.jSf == null) {
      return localLinkedList;
    }
    int j = this.jNB + 1;
    int i = this.jNB / 15;
    Iterator localIterator = this.jNW.jSf.iterator();
    i += 901;
    label259:
    for (;;)
    {
      if (localIterator.hasNext())
      {
        com.tencent.mm.plugin.game.d.c localc = (com.tencent.mm.plugin.game.d.c)localIterator.next();
        Object localObject = null;
        switch (localc.hcE)
        {
        }
        for (;;)
        {
          if (localObject == null) {
            break label259;
          }
          ((d)localObject).scene = 11;
          ((d)localObject).bYq = 1111;
          localLinkedList.add(localObject);
          break;
          d locald = a(localc.jOV);
          localObject = locald;
          if (locald != null)
          {
            locald.position = j;
            j += 1;
            localObject = locald;
            continue;
            if (localc.jOY != null)
            {
              locald = a(localc.jOY.jOV);
              localObject = locald;
              if (locald != null)
              {
                locald.type = 1;
                locald.jLe = localc.jOY.jOX;
                locald.jLf = localc.jOY.jOW;
                int k = i + 1;
                locald.position = i;
                i = k;
                localObject = locald;
              }
            }
          }
        }
      }
      return localLinkedList;
    }
  }
  
  public final HashMap<Integer, String> aUv()
  {
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    if ((this.jNW.jSe == null) || (this.jNW.jSe.jSM == null)) {
      return localLinkedHashMap;
    }
    Iterator localIterator = this.jNW.jSe.jSM.iterator();
    while (localIterator.hasNext())
    {
      da localda = (da)localIterator.next();
      localLinkedHashMap.put(Integer.valueOf(localda.jSc), localda.jPe);
    }
    return localLinkedHashMap;
  }
  
  public final LinkedList<GameLibraryCategoriesView.a> aUw()
  {
    if ((this.jNW.jSe == null) || (this.jNW.jSe.jSK == null)) {
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.jNW.jSe.jSK.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      m localm = (m)localIterator.next();
      GameLibraryCategoriesView.a locala = new GameLibraryCategoriesView.a();
      locala.jZu = localm.jPL;
      locala.jZv = localm.jPe;
      locala.jZw = localm.jOX;
      locala.fmD = localm.jPd;
      i += 1;
      locala.position = i;
      localLinkedList.add(locala);
    }
    return localLinkedList;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/game/model/aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */