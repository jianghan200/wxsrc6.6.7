package com.tencent.c.f;

public abstract class j<T>
{
  private volatile T mInstance;
  
  public abstract T cEE();
  
  public final T get()
  {
    Object localObject1 = this.mInstance;
    if (localObject1 == null) {
      try
      {
        Object localObject2 = this.mInstance;
        localObject1 = localObject2;
        if (localObject2 == null)
        {
          localObject1 = cEE();
          this.mInstance = localObject1;
        }
        return (T)localObject1;
      }
      finally {}
    }
    return ?;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/c/f/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */