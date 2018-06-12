package com.tencent.mm.bs;

import java.util.HashSet;
import java.util.Iterator;

public class a<T>
  implements b.b<T>
{
  private final String mName;
  private T sNA;
  private HashSet<b.a<T>> sNB;
  private final Object sNC = new Object();
  
  private a(String paramString)
  {
    this.mName = paramString;
    this.sNB = new HashSet();
  }
  
  a(String paramString, T paramT)
  {
    this(paramString);
    this.sNA = paramT;
  }
  
  public final void a(b.a<T> parama)
  {
    synchronized (this.sNC)
    {
      boolean bool = this.sNB.add(parama);
      if (bool) {
        c(parama);
      }
      return;
    }
  }
  
  public final void b(b.a<T> parama)
  {
    synchronized (this.sNC)
    {
      boolean bool = this.sNB.remove(parama);
      if (bool) {
        d(parama);
      }
      return;
    }
  }
  
  protected void c(b.a<T> parama) {}
  
  protected void d(b.a<T> parama) {}
  
  public final T get()
  {
    return (T)this.sNA;
  }
  
  public final String name()
  {
    return this.mName;
  }
  
  public final void removeAllListeners()
  {
    synchronized (this.sNC)
    {
      HashSet localHashSet = this.sNB;
      this.sNB = new HashSet();
      ??? = localHashSet.iterator();
      if (((Iterator)???).hasNext()) {
        d((b.a)((Iterator)???).next());
      }
    }
  }
  
  final void set(T paramT)
  {
    ??? = this.sNA;
    int i;
    if ((paramT == ???) || ((paramT != null) && (paramT.equals(???)))) {
      i = 1;
    }
    label88:
    while (i == 0)
    {
      this.sNA = paramT;
      synchronized (this.sNC)
      {
        Iterator localIterator = this.sNB.iterator();
        if (!localIterator.hasNext()) {
          break label88;
        }
        ((b.a)localIterator.next()).aZ(paramT);
      }
      i = 0;
    }
  }
  
  public String toString()
  {
    return "Status: " + this.mName;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/bs/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */