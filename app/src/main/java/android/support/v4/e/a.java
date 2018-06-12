package android.support.v4.e;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class a<K, V>
  extends j<K, V>
  implements Map<K, V>
{
  g<K, V> tv;
  
  public a() {}
  
  public a(int paramInt)
  {
    super(paramInt);
  }
  
  private g<K, V> bQ()
  {
    if (this.tv == null) {
      this.tv = new g()
      {
        protected final void ac(int paramAnonymousInt)
        {
          a.this.removeAt(paramAnonymousInt);
        }
        
        protected final V b(int paramAnonymousInt, V paramAnonymousV)
        {
          return (V)a.this.setValueAt(paramAnonymousInt, paramAnonymousV);
        }
        
        protected final void b(K paramAnonymousK, V paramAnonymousV)
        {
          a.this.put(paramAnonymousK, paramAnonymousV);
        }
        
        protected final int bR()
        {
          return a.this.fi;
        }
        
        protected final Map<K, V> bS()
        {
          return a.this;
        }
        
        protected final void bT()
        {
          a.this.clear();
        }
        
        protected final int h(Object paramAnonymousObject)
        {
          return a.this.indexOfKey(paramAnonymousObject);
        }
        
        protected final int i(Object paramAnonymousObject)
        {
          return a.this.indexOfValue(paramAnonymousObject);
        }
        
        protected final Object p(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          return a.this.tT[((paramAnonymousInt1 << 1) + paramAnonymousInt2)];
        }
      };
    }
    return this.tv;
  }
  
  public Set<Map.Entry<K, V>> entrySet()
  {
    g localg = bQ();
    if (localg.tE == null) {
      localg.tE = new g.b(localg);
    }
    return localg.tE;
  }
  
  public Set<K> keySet()
  {
    g localg = bQ();
    if (localg.tF == null) {
      localg.tF = new g.c(localg);
    }
    return localg.tF;
  }
  
  public void putAll(Map<? extends K, ? extends V> paramMap)
  {
    int i = this.fi + paramMap.size();
    Object localObject;
    if (this.tS.length < i)
    {
      localObject = this.tS;
      Object[] arrayOfObject = this.tT;
      super.aj(i);
      if (this.fi > 0)
      {
        System.arraycopy(localObject, 0, this.tS, 0, this.fi);
        System.arraycopy(arrayOfObject, 0, this.tT, 0, this.fi << 1);
      }
      j.a((int[])localObject, arrayOfObject, this.fi);
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
    g localg = bQ();
    if (localg.tG == null) {
      localg.tG = new g.e(localg);
    }
    return localg.tG;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */