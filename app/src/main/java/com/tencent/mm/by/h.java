package com.tencent.mm.by;

public final class h<T>
{
  private byte[] dol = new byte[0];
  private volatile T mInstance;
  private c<T> uZM;
  
  public h(c<T> paramc)
  {
    this.uZM = paramc;
  }
  
  public final T get()
  {
    if (this.mInstance == null) {}
    synchronized (this.dol)
    {
      if (this.mInstance == null) {
        this.mInstance = this.uZM.get();
      }
      return (T)this.mInstance;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/by/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */