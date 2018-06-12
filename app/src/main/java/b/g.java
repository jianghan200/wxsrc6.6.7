package b;

import b.c.a.a;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class g<T>
  implements b<T>, Serializable
{
  private static final AtomicReferenceFieldUpdater<g<?>, Object> vGx = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "vGv");
  public static final a vGy = new a((byte)0);
  private volatile a<? extends T> vGu;
  private volatile Object vGv;
  private final Object vGw;
  
  public g(a<? extends T> parama)
  {
    this.vGu = parama;
    this.vGv = j.vGz;
    this.vGw = j.vGz;
  }
  
  public final T getValue()
  {
    Object localObject = this.vGv;
    if (localObject != j.vGz) {
      return (T)localObject;
    }
    localObject = this.vGu;
    if (localObject != null)
    {
      localObject = ((a)localObject).invoke();
      if (vGx.compareAndSet(this, j.vGz, localObject))
      {
        this.vGu = null;
        return (T)localObject;
      }
    }
    return (T)this.vGv;
  }
  
  public final String toString()
  {
    if (this.vGv != j.vGz) {}
    for (int i = 1; i != 0; i = 0) {
      return String.valueOf(getValue());
    }
    return "Lazy value not initialized yet.";
  }
  
  public static final class a {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */