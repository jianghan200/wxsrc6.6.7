package com.tencent.mm.plugin.search.a;

import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.search.b.a.a.a;
import java.util.HashMap;

public final class b
  implements ar
{
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void bn(boolean paramBoolean)
  {
    Object localObject = new a();
    ((n)g.n(n.class)).registerItemClickHandler(3, (com.tencent.mm.plugin.fts.a.d.a.b)localObject);
    localObject = new com.tencent.mm.plugin.search.b.a.a.b();
    ((n)g.n(n.class)).registerItemClickHandler(6, (com.tencent.mm.plugin.fts.a.d.a.b)localObject);
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    ((n)g.n(n.class)).unregisterItemClickHandler(3);
    ((n)g.n(n.class)).unregisterItemClickHandler(6);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/search/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */