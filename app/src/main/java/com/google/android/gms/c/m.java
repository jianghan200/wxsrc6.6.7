package com.google.android.gms.c;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class m<K, V>
  extends q<K, V>
  implements Map<K, V>
{
  p<K, V> aXz;
  
  private p<K, V> qd()
  {
    if (this.aXz == null) {
      this.aXz = new p()
      {
        protected final void ac(int paramAnonymousInt)
        {
          m.this.removeAt(paramAnonymousInt);
        }
        
        protected final V b(int paramAnonymousInt, V paramAnonymousV)
        {
          m localm = m.this;
          paramAnonymousInt = (paramAnonymousInt << 1) + 1;
          Object localObject = localm.tT[paramAnonymousInt];
          localm.tT[paramAnonymousInt] = paramAnonymousV;
          return (V)localObject;
        }
        
        protected final void b(K paramAnonymousK, V paramAnonymousV)
        {
          m.this.put(paramAnonymousK, paramAnonymousV);
        }
        
        protected final int bR()
        {
          return m.this.fi;
        }
        
        protected final Map<K, V> bS()
        {
          return m.this;
        }
        
        protected final void bT()
        {
          m.this.clear();
        }
        
        protected final int h(Object paramAnonymousObject)
        {
          if (paramAnonymousObject == null) {
            return m.this.bX();
          }
          return m.this.indexOf(paramAnonymousObject, paramAnonymousObject.hashCode());
        }
        
        protected final int i(Object paramAnonymousObject)
        {
          return m.this.indexOfValue(paramAnonymousObject);
        }
        
        protected final Object p(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          return m.this.tT[((paramAnonymousInt1 << 1) + paramAnonymousInt2)];
        }
      };
    }
    return this.aXz;
  }
  
  public Set<Map.Entry<K, V>> entrySet()
  {
    p localp = qd();
    if (localp.aXH == null) {
      localp.aXH = new p.b(localp);
    }
    return localp.aXH;
  }
  
  public Set<K> keySet()
  {
    p localp = qd();
    if (localp.aXI == null) {
      localp.aXI = new p.c(localp);
    }
    return localp.aXI;
  }
  
  public void putAll(Map<? extends K, ? extends V> paramMap)
  {
    int i = this.fi + paramMap.size();
    Object localObject;
    if (this.tS.length < i)
    {
      localObject = this.tS;
      Object[] arrayOfObject = this.tT;
      super.du(i);
      if (this.fi > 0)
      {
        System.arraycopy(localObject, 0, this.tS, 0, this.fi);
        System.arraycopy(arrayOfObject, 0, this.tT, 0, this.fi << 1);
      }
      q.b((int[])localObject, arrayOfObject, this.fi);
    }
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      localObject = (Map.Entry)paramMap.next();
      put(((Map.Entry)localObject).getKey(), ((Map.Entry)localObject).getValue());
    }
  }
  
  public Collection<V> values()
  {
    p localp = qd();
    if (localp.aXJ == null) {
      localp.aXJ = new p.e(localp);
    }
    return localp.aXJ;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/c/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */