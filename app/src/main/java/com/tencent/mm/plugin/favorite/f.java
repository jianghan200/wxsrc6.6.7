package com.tencent.mm.plugin.favorite;

import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.plugin.fav.a.ab;
import com.tencent.mm.plugin.fav.a.y;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

public final class f
  implements ar
{
  private com.tencent.mm.sdk.b.c jfX = new f.1(this);
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void bn(boolean paramBoolean)
  {
    x.i("MicroMsg.Fav.SubCoreFav", "onAccountPostReset updated:%b", new Object[] { Boolean.valueOf(paramBoolean) });
    a.sFg.a(this.jfX);
    g.a(y.class, new c());
    g.a(ab.class, new e());
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    a.sFg.c(this.jfX);
    ((n)g.n(n.class)).unregisterFTSUILogic(128);
    ((n)g.n(n.class)).unregisterFTSUILogic(4192);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/favorite/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */