package b;

import b.c.a.a;
import b.c.b.e;
import java.io.Serializable;

public final class l<T>
  implements b<T>, Serializable
{
  private a<? extends T> vGu;
  private Object vGv;
  
  public l(a<? extends T> parama)
  {
    this.vGu = parama;
    this.vGv = j.vGz;
  }
  
  public final T getValue()
  {
    if (this.vGv == j.vGz)
    {
      a locala = this.vGu;
      if (locala == null) {
        e.cJM();
      }
      this.vGv = locala.invoke();
      this.vGu = null;
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
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/b/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */