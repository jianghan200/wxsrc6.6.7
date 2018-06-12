package com.tencent.mm.plugin.product.a;

import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.p;
import com.tencent.mm.plugin.product.b.c;
import com.tencent.mm.plugin.product.b.d;
import java.util.HashMap;

public class a
  implements ar
{
  private c lQH = null;
  private d lQI = null;
  private com.tencent.mm.plugin.product.b.a lQJ = new com.tencent.mm.plugin.product.b.a();
  
  public static a bmF()
  {
    return (a)p.v(a.class);
  }
  
  public static c bmG()
  {
    g.Eg().Ds();
    if (bmF().lQH == null) {
      bmF().lQH = new c();
    }
    return bmF().lQH;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final d bmH()
  {
    g.Eg().Ds();
    if (this.lQI == null) {
      this.lQI = new d();
    }
    return this.lQI;
  }
  
  public final void bn(boolean paramBoolean)
  {
    this.lQH = null;
    com.tencent.mm.sdk.b.a.sFg.b(this.lQJ);
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    com.tencent.mm.sdk.b.a.sFg.c(this.lQJ);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/product/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */