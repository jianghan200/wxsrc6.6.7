package com.tencent.mm.ipcinvoker.extension;

import com.tencent.mm.ipcinvoker.g.b;
import junit.framework.Assert;

public final class e<T>
{
  private volatile T dna;
  private Class<T> targetClass;
  
  public e(Class<T> paramClass)
  {
    Assert.assertNotNull(paramClass);
    this.targetClass = paramClass;
  }
  
  public final T get()
  {
    if (this.dna == null) {}
    try
    {
      if (this.dna == null) {
        this.dna = b.i(this.targetClass);
      }
      return (T)this.dna;
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ipcinvoker/extension/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */