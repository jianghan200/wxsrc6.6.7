package com.tencent.pb.common.c;

public abstract class e<T>
{
  private T mInstance;
  
  public abstract T cEE();
  
  public final T get()
  {
    try
    {
      if (this.mInstance == null) {
        this.mInstance = cEE();
      }
      Object localObject1 = this.mInstance;
      return (T)localObject1;
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/pb/common/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */