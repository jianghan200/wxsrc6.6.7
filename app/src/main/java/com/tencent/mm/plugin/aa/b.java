package com.tencent.mm.plugin.aa;

import com.tencent.mm.bt.h.d;
import com.tencent.mm.g.a.bo;
import com.tencent.mm.g.a.bp;
import com.tencent.mm.g.a.ml;
import com.tencent.mm.g.a.mm;
import com.tencent.mm.g.a.th;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.p;
import com.tencent.mm.plugin.aa.a.b.d;
import com.tencent.mm.plugin.messenger.foundation.a.n;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import java.util.HashMap;

public class b
  implements ar
{
  private static HashMap<Integer, h.d> cVM;
  private c<mm> ezp = new b.1(this);
  private c<ml> ezq = new b.2(this);
  private c<bo> ezr = new b.3(this);
  private c<bp> ezs = new b.4(this);
  private n ezt = new b.5(this);
  c<th> ezu = new b.6(this);
  private d ezv;
  private com.tencent.mm.plugin.aa.a.b.b ezw;
  
  static
  {
    HashMap localHashMap = new HashMap();
    cVM = localHashMap;
    localHashMap.put(Integer.valueOf("AARecord".hashCode()), new b.7());
    cVM.put(Integer.valueOf("AAPayRecord".hashCode()), new b.8());
  }
  
  private static b VP()
  {
    return (b)p.v(b.class);
  }
  
  public static d VQ()
  {
    if (VP().ezv == null)
    {
      b localb = VP();
      g.Ek();
      localb.ezv = new d(g.Ei().dqq);
    }
    return VP().ezv;
  }
  
  public static com.tencent.mm.plugin.aa.a.b.b VR()
  {
    if (VP().ezw == null)
    {
      b localb = VP();
      g.Ek();
      localb.ezw = new com.tencent.mm.plugin.aa.a.b.b(g.Ei().dqq);
    }
    return VP().ezw;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return cVM;
  }
  
  public final void bn(boolean paramBoolean)
  {
    a.sFg.b(this.ezp);
    a.sFg.b(this.ezq);
    a.sFg.b(this.ezr);
    a.sFg.b(this.ezs);
    a.sFg.b(this.ezu);
    ((o)g.n(o.class)).getSysCmdMsgExtension().a("paymsg", this.ezt);
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    a.sFg.c(this.ezp);
    a.sFg.c(this.ezq);
    a.sFg.c(this.ezr);
    a.sFg.c(this.ezs);
    a.sFg.c(this.ezu);
    ((o)g.n(o.class)).getSysCmdMsgExtension().b("paymsg", this.ezt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/aa/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */