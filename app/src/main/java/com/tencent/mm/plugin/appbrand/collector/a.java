package com.tencent.mm.plugin.appbrand.collector;

import java.util.concurrent.ConcurrentHashMap;

final class a<K, V>
  extends ConcurrentHashMap<K, V>
{
  public final boolean containsValue(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    return super.containsValue(paramObject);
  }
  
  public final V get(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    return (V)super.get(paramObject);
  }
  
  public final V put(K paramK, V paramV)
  {
    if (paramK == null) {
      return null;
    }
    if (paramV == null) {
      return (V)super.remove(paramK);
    }
    return (V)super.put(paramK, paramV);
  }
  
  public final V remove(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    return (V)super.remove(paramObject);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/collector/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */