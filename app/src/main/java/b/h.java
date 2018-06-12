package b;

import b.c.a.a;
import b.c.b.e;
import java.io.Serializable;

public final class h<T>
  implements b<T>, Serializable
{
  private final Object lock;
  private a<? extends T> vGu;
  private volatile Object vGv;
  
  private h(a<? extends T> parama)
  {
    this.vGu = parama;
    this.vGv = j.vGz;
    this.lock = this;
  }
  
  public final T getValue()
  {
    Object localObject1 = this.vGv;
    if (localObject1 != j.vGz) {
      return (T)localObject1;
    }
    synchronized (this.lock)
    {
      localObject1 = this.vGv;
      j localj = j.vGz;
      if (localObject1 != localj) {
        return (T)localObject1;
      }
      localObject1 = this.vGu;
      if (localObject1 == null) {
        e.cJM();
      }
      localObject1 = ((a)localObject1).invoke();
      this.vGv = localObject1;
      this.vGu = null;
    }
  }
  
  public final String toString()
  {
    if (this.vGv != j.vGz) {}
    for (int i = 1; i != 0; i = 0) {
      return String.valueOf(getValue());
    }
    return "Lazy value not initialized yet.";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */