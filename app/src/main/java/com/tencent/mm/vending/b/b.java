package com.tencent.mm.vending.b;

import com.tencent.mm.vending.h.d;
import junit.framework.Assert;

public final class b<_Callback>
  implements com.tencent.mm.vending.e.a
{
  public d byz;
  private int mPriority = -1;
  private a uQA;
  public _Callback uQB;
  private int uQC;
  
  public b(_Callback param_Callback, a parama)
  {
    Assert.assertNotNull("Callback should not be null!", param_Callback);
    this.uQC = param_Callback.hashCode();
    this.uQB = param_Callback;
    this.uQA = parama;
  }
  
  public final b<_Callback> a(com.tencent.mm.vending.e.b paramb)
  {
    Assert.assertNotNull(paramb);
    paramb.keep(this);
    return this;
  }
  
  public final void dead()
  {
    Assert.assertNotNull(this.uQA);
    this.uQA.b(this);
  }
  
  public final boolean equals(Object paramObject)
  {
    return (paramObject != null) && (paramObject.hashCode() == this.uQC);
  }
  
  public final int hashCode()
  {
    return this.uQC;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/vending/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */