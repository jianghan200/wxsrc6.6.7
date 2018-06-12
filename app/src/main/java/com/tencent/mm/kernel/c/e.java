package com.tencent.mm.kernel.c;

public final class e<T extends a>
  implements b, c<T>
{
  private T dta;
  
  public e(T paramT)
  {
    this.dta = paramT;
  }
  
  public final void ET()
  {
    if ((this.dta instanceof b)) {
      ((b)this.dta).ET();
    }
  }
  
  public final void EU()
  {
    if ((this.dta instanceof b)) {
      ((b)this.dta).EU();
    }
  }
  
  public final T EV()
  {
    return this.dta;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/kernel/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */