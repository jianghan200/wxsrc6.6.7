package com.tencent.mm.sdk;

import com.tencent.mm.sdk.platformtools.ba;

public class b<T>
  extends ba<T>
{
  private final Object mLock = new Object();
  
  public b()
  {
    super(20);
  }
  
  public final T bW()
  {
    synchronized (this.mLock)
    {
      Object localObject2 = super.bW();
      return (T)localObject2;
    }
  }
  
  public final boolean j(T paramT)
  {
    synchronized (this.mLock)
    {
      boolean bool = super.j(paramT);
      return bool;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/sdk/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */