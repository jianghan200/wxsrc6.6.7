package com.tencent.mm.ak.a.d;

import com.tencent.mm.a.f;
import java.util.Map;

public final class a<K, V>
{
  private f<K, V> dYh;
  
  public a(int paramInt)
  {
    this.dYh = new f(paramInt);
  }
  
  public final boolean bb(K paramK)
  {
    try
    {
      if (this.dYh == null) {
        throw new NullPointerException("mData == null");
      }
    }
    finally {}
    boolean bool = this.dYh.bb(paramK);
    return bool;
  }
  
  public final void clear()
  {
    if (this.dYh == null) {
      throw new NullPointerException("mData == null");
    }
    this.dYh.trimToSize(-1);
  }
  
  public final V get(K paramK)
  {
    if (this.dYh == null) {
      throw new NullPointerException("mData == null");
    }
    return (V)this.dYh.get(paramK);
  }
  
  public final V put(K paramK, V paramV)
  {
    if (this.dYh == null) {
      throw new NullPointerException("mData == null");
    }
    return (V)this.dYh.put(paramK, paramV);
  }
  
  public final Map<K, V> snapshot()
  {
    try
    {
      if (this.dYh == null) {
        throw new NullPointerException("mData == null");
      }
    }
    finally {}
    Map localMap = this.dYh.snapshot();
    return localMap;
  }
  
  public final String toString()
  {
    try
    {
      if (this.dYh == null) {
        throw new NullPointerException("mData == null");
      }
    }
    finally {}
    String str = this.dYh.toString();
    return str;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ak/a/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */