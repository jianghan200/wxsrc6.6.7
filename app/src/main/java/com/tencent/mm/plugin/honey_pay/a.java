package com.tencent.mm.plugin.honey_pay;

import com.tencent.mm.bt.h.d;
import com.tencent.mm.by.h;
import com.tencent.mm.g.a.mn;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.p;
import com.tencent.mm.plugin.honey_pay.model.b;
import com.tencent.mm.plugin.messenger.foundation.a.n;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.sdk.b.c;
import java.util.HashMap;

public class a
  implements ar
{
  private static HashMap<Integer, h.d> cVM;
  private h<b> kjw = new h(new a.2(this));
  private c<mn> kjx = new a.3(this);
  private n kjy = new a.4(this);
  
  static
  {
    HashMap localHashMap = new HashMap();
    cVM = localHashMap;
    localHashMap.put(Integer.valueOf("HoneyPayMsgRecord".hashCode()), new a.1());
  }
  
  public static a aWa()
  {
    return (a)p.v(a.class);
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return cVM;
  }
  
  public final b aWb()
  {
    return (b)this.kjw.get();
  }
  
  public final void bn(boolean paramBoolean)
  {
    this.kjx.cht();
    ((o)g.n(o.class)).getSysCmdMsgExtension().a("paymsg", this.kjy);
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    this.kjx.dead();
    ((o)g.n(o.class)).getSysCmdMsgExtension().b("paymsg", this.kjy);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/honey_pay/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */