package com.tencent.f;

public abstract class d<T extends e>
{
  public final Object mLock = new Object();
  public int ndo;
  public T[] vwz = cHo();
  
  public abstract T[] cHo();
  
  public abstract T cHp();
  
  public final T cHq()
  {
    e locale = null;
    synchronized (this.mLock)
    {
      if (this.ndo > 0)
      {
        this.ndo -= 1;
        locale = this.vwz[this.ndo];
        this.vwz[this.ndo] = null;
      }
      return locale;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/f/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */