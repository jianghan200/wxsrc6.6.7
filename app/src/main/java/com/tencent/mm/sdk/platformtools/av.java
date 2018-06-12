package com.tencent.mm.sdk.platformtools;

import android.os.HandlerThread;
import android.os.Looper;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public final class av<K, V>
{
  private final long aJd;
  public final al bAZ;
  public volatile boolean bBc = false;
  public final aa<K, a<V>> ktS;
  public final LinkedHashMap<K, b<K, V>> sIs = new LinkedHashMap();
  private final c<K, V> sIt;
  public final al sIu;
  private final long sIv;
  private boolean sIw = true;
  protected Object tag;
  private final long threshold;
  
  public av(c<K, V> paramc, Looper paramLooper, int paramInt1, int paramInt2, long paramLong1, long paramLong2)
  {
    if (paramc == null) {
      throw new IllegalArgumentException("arg appender can not be null!");
    }
    if (paramLooper == null) {
      throw new IllegalArgumentException("arg looper can not be null!");
    }
    if (paramInt1 <= 0) {
      throw new IllegalArgumentException("arg size can not be <= 0!");
    }
    this.sIt = paramc;
    this.ktS = new aa(paramInt1);
    long l;
    if (paramInt2 > 0)
    {
      l = paramInt2;
      this.threshold = l;
      if (paramLong1 <= 0L) {
        break label191;
      }
      label107:
      this.sIv = paramLong1;
      if (paramLong2 <= 0L) {
        break label199;
      }
    }
    for (;;)
    {
      this.aJd = paramLong2;
      this.bAZ = new al(paramLooper, new al.a()
      {
        public final boolean vD()
        {
          long l = System.currentTimeMillis();
          av.this.li(false);
          x.i("MicroMsg.RWCache", "summer timer onTimerExpired e appendAll takes: " + (System.currentTimeMillis() - l) + " ms");
          return false;
        }
      }, false);
      this.sIu = new al(new ah("RWCache_timeoutChecker").lnJ.getLooper(), new al.a()
      {
        public final boolean vD()
        {
          av.this.bBc = true;
          return false;
        }
      }, false);
      return;
      l = 40L;
      break;
      label191:
      paramLong1 = 60000L;
      break label107;
      label199:
      paramLong2 = 60000L;
    }
  }
  
  public final V get(K paramK)
  {
    if (paramK == null) {
      throw new NullPointerException("key == null");
    }
    a locala = (a)this.ktS.get(paramK);
    if (locala != null) {
      return (V)locala.sIy;
    }
    this.ktS.put(paramK, new a(null));
    return null;
  }
  
  public final Object getTag()
  {
    return this.tag;
  }
  
  public final void li(boolean paramBoolean)
  {
    x.i("MicroMsg.RWCache", "summer appendAll force: " + paramBoolean + " tid: " + Thread.currentThread().getId() + " holderMap size: " + this.sIs.size());
    try
    {
      this.sIw = true;
      if (this.sIs.isEmpty()) {
        return;
      }
      if (!this.sIt.Sc()) {
        return;
      }
    }
    finally {}
    Iterator localIterator = this.sIs.entrySet().iterator();
    if (paramBoolean) {
      while (localIterator.hasNext())
      {
        this.sIt.a(this, (b)((Map.Entry)localIterator.next()).getValue());
        localIterator.remove();
      }
    }
    this.bBc = false;
    al localal = this.sIu;
    long l = this.aJd;
    localal.J(l, l);
    while ((!this.bBc) && (localIterator.hasNext()))
    {
      this.sIt.a(this, (b)((Map.Entry)localIterator.next()).getValue());
      localIterator.remove();
    }
    if (this.bBc) {
      x.i("MicroMsg.RWCache", "summer appendAll timeout size[%d] hasNext[%b] end", new Object[] { Integer.valueOf(this.sIs.size()), Boolean.valueOf(localIterator.hasNext()) });
    }
    this.sIu.SO();
    this.sIt.Sd();
  }
  
  public final boolean s(K paramK, V paramV)
  {
    if (paramK == null) {
      throw new NullPointerException("key == null");
    }
    Object localObject = (a)this.ktS.get(paramK);
    a locala = new a(paramV);
    if (locala.equals(localObject)) {
      return false;
    }
    this.ktS.put(paramK, locala);
    localObject = new b();
    ((b)localObject).qSV = paramK;
    ((b)localObject).values = paramV;
    int i;
    if (paramV == null)
    {
      i = 2;
      ((b)localObject).sIz = i;
    }
    for (;;)
    {
      try
      {
        this.sIs.put(paramK, localObject);
        if ((!this.sIw) || (this.sIs.size() <= this.threshold)) {
          break label157;
        }
        this.bAZ.J(0L, 0L);
        this.sIw = false;
        return true;
      }
      finally {}
      i = 1;
      break;
      label157:
      if (this.bAZ.ciq())
      {
        paramK = this.bAZ;
        long l = this.sIv;
        paramK.J(l, l);
      }
    }
  }
  
  public final void setTag(Object paramObject)
  {
    this.tag = paramObject;
  }
  
  static final class a<V>
  {
    final V sIy;
    
    a(V paramV)
    {
      this.sIy = paramV;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (paramObject == null) {}
      do
      {
        do
        {
          return false;
        } while (!(paramObject instanceof a));
        paramObject = (a)paramObject;
        if (this.sIy != null) {
          break;
        }
      } while (((a)paramObject).sIy != null);
      return true;
      return this.sIy.equals(((a)paramObject).sIy);
    }
  }
  
  public static final class b<K, V>
  {
    public K qSV;
    public int sIz;
    public V values;
  }
  
  public static abstract interface c<K, V>
  {
    public abstract boolean Sc();
    
    public abstract void Sd();
    
    public abstract void a(av<K, V> paramav, av.b<K, V> paramb);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */