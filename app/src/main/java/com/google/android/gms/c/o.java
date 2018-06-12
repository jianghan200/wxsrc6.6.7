package com.google.android.gms.c;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class o<K, V>
{
  private final LinkedHashMap<K, V> aXB;
  private int aXC;
  private int aXD;
  private int aXE;
  private int aXF;
  private int aXG;
  private int size;
  
  private int l(K paramK, V paramV)
  {
    int i = ae(paramV);
    if (i < 0) {
      throw new IllegalStateException("Negative size: " + paramK + "=" + paramV);
    }
    return i;
  }
  
  public int ae(V paramV)
  {
    return 1;
  }
  
  public final V get(K paramK)
  {
    try
    {
      paramK = this.aXB.get(paramK);
      if (paramK != null)
      {
        this.aXF += 1;
        return paramK;
      }
      this.aXG += 1;
      return null;
    }
    finally {}
  }
  
  public final V put(K paramK, V paramV)
  {
    if (paramV == null) {
      throw new NullPointerException("key == null || value == null");
    }
    try
    {
      this.aXD += 1;
      this.size += l(paramK, paramV);
      paramV = this.aXB.put(paramK, paramV);
      if (paramV != null) {
        this.size -= l(paramK, paramV);
      }
      trimToSize(this.aXC);
      return paramV;
    }
    finally {}
  }
  
  public final String toString()
  {
    int i = 0;
    try
    {
      int j = this.aXF + this.aXG;
      if (j != 0) {
        i = this.aXF * 100 / j;
      }
      String str = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[] { Integer.valueOf(this.aXC), Integer.valueOf(this.aXF), Integer.valueOf(this.aXG), Integer.valueOf(i) });
      return str;
    }
    finally {}
  }
  
  public final void trimToSize(int paramInt)
  {
    try
    {
      if ((this.size < 0) || ((this.aXB.isEmpty()) && (this.size != 0))) {
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
      }
    }
    finally
    {
      throw ((Throwable)localObject1);
      if ((this.size <= paramInt) || (this.aXB.isEmpty())) {
        return;
      }
      Object localObject3 = (Map.Entry)this.aXB.entrySet().iterator().next();
      Object localObject2 = ((Map.Entry)localObject3).getKey();
      localObject3 = ((Map.Entry)localObject3).getValue();
      this.aXB.remove(localObject2);
      this.size -= l(localObject2, localObject3);
      this.aXE += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/c/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */