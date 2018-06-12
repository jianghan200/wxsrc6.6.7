package com.tencent.mm.view;

import android.content.Context;
import com.tencent.mm.api.d;
import com.tencent.mm.api.m.a;

public final class b
  extends a
{
  public b(Context paramContext, m.a parama)
  {
    super(paramContext, parama);
  }
  
  protected final com.tencent.mm.view.b.a cBZ()
  {
    return new com.tencent.mm.view.b.b(getContext(), getPresenter());
  }
  
  protected final com.tencent.mm.view.footer.a cCa()
  {
    return new com.tencent.mm.view.footer.b(getContext(), getPresenter());
  }
  
  public final d[] getFeatures()
  {
    if (this.uSp == null) {
      this.uSp = new d[] { d.bwN, d.bwP, d.bwO, d.bwQ, d.bwR };
    }
    return this.uSp;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/view/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */