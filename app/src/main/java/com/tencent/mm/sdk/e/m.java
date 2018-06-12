package com.tencent.mm.sdk.e;

import android.os.Looper;

public abstract class m
  implements g
{
  private final k<b, a> sKC = new k() {};
  
  public abstract boolean Xu();
  
  public final void a(b paramb)
  {
    if (paramb != null) {
      this.sKC.a(paramb, Looper.getMainLooper());
    }
  }
  
  public final void b(int paramInt, m paramm, Object paramObject)
  {
    this.sKC.ci(new a(paramInt, paramm, paramObject));
    this.sKC.doNotify();
  }
  
  public final void b(b paramb)
  {
    if (paramb != null) {
      this.sKC.remove(paramb);
    }
  }
  
  private final class a
  {
    Object obj;
    int sKN;
    m sKO;
    
    a(int paramInt, m paramm, Object paramObject)
    {
      this.sKN = paramInt;
      this.obj = paramObject;
      this.sKO = paramm;
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(int paramInt, m paramm, Object paramObject);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/e/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */