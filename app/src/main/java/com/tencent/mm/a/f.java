package com.tencent.mm.a;

import com.tencent.mm.sdk.platformtools.aa;

public class f<K, O>
  extends aa<K, O>
{
  private b<K, O> bwc = null;
  
  public f(int paramInt)
  {
    super(paramInt);
  }
  
  public f(int paramInt, b<K, O> paramb)
  {
    super(paramInt);
    this.bwc = paramb;
  }
  
  public void a(a<K, O> parama)
  {
    clear();
  }
  
  public void clear()
  {
    super.trimToSize(-1);
  }
  
  protected final O create(K paramK)
  {
    return (O)super.create(paramK);
  }
  
  public void entryRemoved(boolean paramBoolean, K paramK, O paramO1, O paramO2)
  {
    super.entryRemoved(paramBoolean, paramK, paramO1, paramO2);
    if ((this.bwc != null) && (paramO2 == null)) {
      this.bwc.n(paramK, paramO1);
    }
  }
  
  public final void m(K paramK, O paramO)
  {
    if (paramO == null) {
      return;
    }
    put(paramK, paramO);
  }
  
  public int sizeOf(K paramK, O paramO)
  {
    return super.sizeOf(paramK, paramO);
  }
  
  public final void trimToSize(int paramInt)
  {
    super.trimToSize(paramInt);
  }
  
  public static abstract interface a<K, O> {}
  
  public static abstract interface b<K, O>
  {
    public abstract void n(K paramK, O paramO);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */