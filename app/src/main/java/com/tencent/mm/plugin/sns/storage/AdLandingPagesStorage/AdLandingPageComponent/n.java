package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class n
  extends s
{
  public LinkedList<m> nAH = new LinkedList();
  public int nAJ = 0;
  public boolean nAK = true;
  
  protected final List<s> bzF()
  {
    ArrayList localArrayList = new ArrayList(super.bzF());
    if (this.nAH != null)
    {
      Iterator localIterator = this.nAH.iterator();
      while (localIterator.hasNext())
      {
        m localm = (m)localIterator.next();
        if (localm.nAH != null) {
          localArrayList.addAll(localm.nAH);
        }
      }
    }
    return localArrayList;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */