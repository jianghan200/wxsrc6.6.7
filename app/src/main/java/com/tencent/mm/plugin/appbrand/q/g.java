package com.tencent.mm.plugin.appbrand.q;

import android.support.v4.e.a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class g<K, V>
{
  private final Map<K, Set<V>> gBs = new a();
  
  private Set<V> l(K paramK, boolean paramBoolean)
  {
    synchronized (this.gBs)
    {
      Set localSet = (Set)this.gBs.get(paramK);
      Object localObject = localSet;
      if (localSet == null)
      {
        localObject = localSet;
        if (paramBoolean)
        {
          localObject = new HashSet();
          this.gBs.put(paramK, localObject);
        }
      }
      return (Set<V>)localObject;
    }
  }
  
  public final Set<V> bo(K paramK)
  {
    if (paramK == null) {
      return null;
    }
    paramK = l(paramK, false);
    if (paramK == null) {
      return Collections.emptySet();
    }
    HashSet localHashSet = new HashSet();
    try
    {
      localHashSet.addAll(paramK);
      return localHashSet;
    }
    finally {}
  }
  
  public final Set<V> bp(K paramK)
  {
    if (paramK == null) {
      return null;
    }
    synchronized (this.gBs)
    {
      paramK = (Set)this.gBs.remove(paramK);
      return paramK;
    }
  }
  
  public final void o(K arg1, V paramV)
  {
    if (??? == null) {
      return;
    }
    synchronized (l(???, true))
    {
      ???.add(paramV);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/q/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */