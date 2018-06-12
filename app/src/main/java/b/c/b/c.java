package b.c.b;

import b.c.a;

public final class c
  implements b, b.e.b<Object>
{
  private final Class<?> vGE;
  
  public c(Class<?> paramClass)
  {
    this.vGE = paramClass;
  }
  
  public final Class<?> cJL()
  {
    return this.vGE;
  }
  
  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof c)) && (e.i(a.a(this), a.a((b.e.b)paramObject)));
  }
  
  public final int hashCode()
  {
    return a.a(this).hashCode();
  }
  
  public final String toString()
  {
    return this.vGE.toString() + " (Kotlin reflection is not available)";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/b/c/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */