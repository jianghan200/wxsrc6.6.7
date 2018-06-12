package android.support.v4.e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class g<K, V>
{
  g<K, V>.b tE;
  g<K, V>.c tF;
  g<K, V>.e tG;
  
  public static <K, V> boolean a(Map<K, V> paramMap, Collection<?> paramCollection)
  {
    int i = paramMap.size();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext()) {
      if (!paramCollection.contains(localIterator.next())) {
        localIterator.remove();
      }
    }
    return i != paramMap.size();
  }
  
  public static <T> boolean a(Set<T> paramSet, Object paramObject)
  {
    if (paramSet == paramObject) {}
    for (;;)
    {
      return true;
      if ((paramObject instanceof Set))
      {
        paramObject = (Set)paramObject;
        try
        {
          if (paramSet.size() == ((Set)paramObject).size())
          {
            boolean bool = paramSet.containsAll((Collection)paramObject);
            if (bool) {}
          }
          else
          {
            return false;
          }
        }
        catch (NullPointerException paramSet)
        {
          return false;
        }
        catch (ClassCastException paramSet)
        {
          return false;
        }
      }
    }
    return false;
  }
  
  protected abstract void ac(int paramInt);
  
  public final Object[] ai(int paramInt)
  {
    int j = bR();
    Object[] arrayOfObject = new Object[j];
    int i = 0;
    while (i < j)
    {
      arrayOfObject[i] = p(i, paramInt);
      i += 1;
    }
    return arrayOfObject;
  }
  
  protected abstract V b(int paramInt, V paramV);
  
  protected abstract void b(K paramK, V paramV);
  
  public final <T> T[] b(T[] paramArrayOfT, int paramInt)
  {
    int j = bR();
    if (paramArrayOfT.length < j) {
      paramArrayOfT = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), j);
    }
    for (;;)
    {
      int i = 0;
      while (i < j)
      {
        paramArrayOfT[i] = p(i, paramInt);
        i += 1;
      }
      if (paramArrayOfT.length > j) {
        paramArrayOfT[j] = null;
      }
      return paramArrayOfT;
    }
  }
  
  protected abstract int bR();
  
  protected abstract Map<K, V> bS();
  
  protected abstract void bT();
  
  protected abstract int h(Object paramObject);
  
  protected abstract int i(Object paramObject);
  
  protected abstract Object p(int paramInt1, int paramInt2);
  
  final class a<T>
    implements Iterator<T>
  {
    int fi;
    int mIndex;
    final int tH;
    boolean tI = false;
    
    a(int paramInt)
    {
      this.tH = paramInt;
      this.fi = g.this.bR();
    }
    
    public final boolean hasNext()
    {
      return this.mIndex < this.fi;
    }
    
    public final T next()
    {
      Object localObject = g.this.p(this.mIndex, this.tH);
      this.mIndex += 1;
      this.tI = true;
      return (T)localObject;
    }
    
    public final void remove()
    {
      if (!this.tI) {
        throw new IllegalStateException();
      }
      this.mIndex -= 1;
      this.fi -= 1;
      this.tI = false;
      g.this.ac(this.mIndex);
    }
  }
  
  final class b
    implements Set<Map.Entry<K, V>>
  {
    b() {}
    
    public final boolean addAll(Collection<? extends Map.Entry<K, V>> paramCollection)
    {
      int i = g.this.bR();
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramCollection.next();
        g.this.b(localEntry.getKey(), localEntry.getValue());
      }
      return i != g.this.bR();
    }
    
    public final void clear()
    {
      g.this.bT();
    }
    
    public final boolean contains(Object paramObject)
    {
      if (!(paramObject instanceof Map.Entry)) {}
      int i;
      do
      {
        return false;
        paramObject = (Map.Entry)paramObject;
        i = g.this.h(((Map.Entry)paramObject).getKey());
      } while (i < 0);
      return b.c(g.this.p(i, 1), ((Map.Entry)paramObject).getValue());
    }
    
    public final boolean containsAll(Collection<?> paramCollection)
    {
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext()) {
        if (!contains(paramCollection.next())) {
          return false;
        }
      }
      return true;
    }
    
    public final boolean equals(Object paramObject)
    {
      return g.a(this, paramObject);
    }
    
    public final int hashCode()
    {
      int j = g.this.bR() - 1;
      int i = 0;
      if (j >= 0)
      {
        Object localObject1 = g.this.p(j, 0);
        Object localObject2 = g.this.p(j, 1);
        int k;
        if (localObject1 == null)
        {
          k = 0;
          label45:
          if (localObject2 != null) {
            break label76;
          }
        }
        label76:
        for (int m = 0;; m = localObject2.hashCode())
        {
          j -= 1;
          i += (m ^ k);
          break;
          k = localObject1.hashCode();
          break label45;
        }
      }
      return i;
    }
    
    public final boolean isEmpty()
    {
      return g.this.bR() == 0;
    }
    
    public final Iterator<Map.Entry<K, V>> iterator()
    {
      return new g.d(g.this);
    }
    
    public final boolean remove(Object paramObject)
    {
      throw new UnsupportedOperationException();
    }
    
    public final boolean removeAll(Collection<?> paramCollection)
    {
      throw new UnsupportedOperationException();
    }
    
    public final boolean retainAll(Collection<?> paramCollection)
    {
      throw new UnsupportedOperationException();
    }
    
    public final int size()
    {
      return g.this.bR();
    }
    
    public final Object[] toArray()
    {
      throw new UnsupportedOperationException();
    }
    
    public final <T> T[] toArray(T[] paramArrayOfT)
    {
      throw new UnsupportedOperationException();
    }
  }
  
  final class c
    implements Set<K>
  {
    c() {}
    
    public final boolean add(K paramK)
    {
      throw new UnsupportedOperationException();
    }
    
    public final boolean addAll(Collection<? extends K> paramCollection)
    {
      throw new UnsupportedOperationException();
    }
    
    public final void clear()
    {
      g.this.bT();
    }
    
    public final boolean contains(Object paramObject)
    {
      return g.this.h(paramObject) >= 0;
    }
    
    public final boolean containsAll(Collection<?> paramCollection)
    {
      Map localMap = g.this.bS();
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext()) {
        if (!localMap.containsKey(paramCollection.next())) {
          return false;
        }
      }
      return true;
    }
    
    public final boolean equals(Object paramObject)
    {
      return g.a(this, paramObject);
    }
    
    public final int hashCode()
    {
      int i = g.this.bR() - 1;
      int j = 0;
      if (i >= 0)
      {
        Object localObject = g.this.p(i, 0);
        if (localObject == null) {}
        for (int k = 0;; k = localObject.hashCode())
        {
          j += k;
          i -= 1;
          break;
        }
      }
      return j;
    }
    
    public final boolean isEmpty()
    {
      return g.this.bR() == 0;
    }
    
    public final Iterator<K> iterator()
    {
      return new g.a(g.this, 0);
    }
    
    public final boolean remove(Object paramObject)
    {
      int i = g.this.h(paramObject);
      if (i >= 0)
      {
        g.this.ac(i);
        return true;
      }
      return false;
    }
    
    public final boolean removeAll(Collection<?> paramCollection)
    {
      Map localMap = g.this.bS();
      int i = localMap.size();
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext()) {
        localMap.remove(paramCollection.next());
      }
      return i != localMap.size();
    }
    
    public final boolean retainAll(Collection<?> paramCollection)
    {
      return g.a(g.this.bS(), paramCollection);
    }
    
    public final int size()
    {
      return g.this.bR();
    }
    
    public final Object[] toArray()
    {
      return g.this.ai(0);
    }
    
    public final <T> T[] toArray(T[] paramArrayOfT)
    {
      return g.this.b(paramArrayOfT, 0);
    }
  }
  
  final class d
    implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V>
  {
    int mIndex = -1;
    int tK = g.this.bR() - 1;
    boolean tL = false;
    
    d() {}
    
    public final boolean equals(Object paramObject)
    {
      if (!this.tL) {
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      }
      if (!(paramObject instanceof Map.Entry)) {}
      do
      {
        return false;
        paramObject = (Map.Entry)paramObject;
      } while ((!b.c(((Map.Entry)paramObject).getKey(), g.this.p(this.mIndex, 0))) || (!b.c(((Map.Entry)paramObject).getValue(), g.this.p(this.mIndex, 1))));
      return true;
    }
    
    public final K getKey()
    {
      if (!this.tL) {
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      }
      return (K)g.this.p(this.mIndex, 0);
    }
    
    public final V getValue()
    {
      if (!this.tL) {
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      }
      return (V)g.this.p(this.mIndex, 1);
    }
    
    public final boolean hasNext()
    {
      return this.mIndex < this.tK;
    }
    
    public final int hashCode()
    {
      int j = 0;
      if (!this.tL) {
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      }
      Object localObject1 = g.this.p(this.mIndex, 0);
      Object localObject2 = g.this.p(this.mIndex, 1);
      int i;
      if (localObject1 == null)
      {
        i = 0;
        if (localObject2 != null) {
          break label69;
        }
      }
      for (;;)
      {
        return j ^ i;
        i = localObject1.hashCode();
        break;
        label69:
        j = localObject2.hashCode();
      }
    }
    
    public final void remove()
    {
      if (!this.tL) {
        throw new IllegalStateException();
      }
      g.this.ac(this.mIndex);
      this.mIndex -= 1;
      this.tK -= 1;
      this.tL = false;
    }
    
    public final V setValue(V paramV)
    {
      if (!this.tL) {
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      }
      return (V)g.this.b(this.mIndex, paramV);
    }
    
    public final String toString()
    {
      return getKey() + "=" + getValue();
    }
  }
  
  final class e
    implements Collection<V>
  {
    e() {}
    
    public final boolean add(V paramV)
    {
      throw new UnsupportedOperationException();
    }
    
    public final boolean addAll(Collection<? extends V> paramCollection)
    {
      throw new UnsupportedOperationException();
    }
    
    public final void clear()
    {
      g.this.bT();
    }
    
    public final boolean contains(Object paramObject)
    {
      return g.this.i(paramObject) >= 0;
    }
    
    public final boolean containsAll(Collection<?> paramCollection)
    {
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext()) {
        if (!contains(paramCollection.next())) {
          return false;
        }
      }
      return true;
    }
    
    public final boolean isEmpty()
    {
      return g.this.bR() == 0;
    }
    
    public final Iterator<V> iterator()
    {
      return new g.a(g.this, 1);
    }
    
    public final boolean remove(Object paramObject)
    {
      int i = g.this.i(paramObject);
      if (i >= 0)
      {
        g.this.ac(i);
        return true;
      }
      return false;
    }
    
    public final boolean removeAll(Collection<?> paramCollection)
    {
      int j = g.this.bR();
      int i = 0;
      boolean bool = false;
      while (i < j)
      {
        int m = i;
        int k = j;
        if (paramCollection.contains(g.this.p(i, 1)))
        {
          g.this.ac(i);
          m = i - 1;
          k = j - 1;
          bool = true;
        }
        i = m + 1;
        j = k;
      }
      return bool;
    }
    
    public final boolean retainAll(Collection<?> paramCollection)
    {
      int j = g.this.bR();
      int i = 0;
      boolean bool = false;
      while (i < j)
      {
        int m = i;
        int k = j;
        if (!paramCollection.contains(g.this.p(i, 1)))
        {
          g.this.ac(i);
          m = i - 1;
          k = j - 1;
          bool = true;
        }
        i = m + 1;
        j = k;
      }
      return bool;
    }
    
    public final int size()
    {
      return g.this.bR();
    }
    
    public final Object[] toArray()
    {
      return g.this.ai(1);
    }
    
    public final <T> T[] toArray(T[] paramArrayOfT)
    {
      return g.this.b(paramArrayOfT, 1);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/e/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */