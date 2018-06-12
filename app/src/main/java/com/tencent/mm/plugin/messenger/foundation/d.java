package com.tencent.mm.plugin.messenger.foundation;

import com.tencent.mm.a.f;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.aq.p;
import com.tencent.mm.kernel.api.bucket.c;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.storage.ah;
import com.tencent.mm.storage.aj;
import com.tencent.mm.storage.am;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bm;
import com.tencent.mm.storage.bp;
import com.tencent.mm.storage.br;
import com.tencent.mm.storage.bw;

public final class d
  implements c, i
{
  ah lbT;
  br lbU;
  be lbV;
  aj lbW;
  p lbX;
  bm lbY;
  am lbZ;
  au lca;
  as lcb;
  bb lcc;
  bp lcd;
  bw lce;
  
  public final void onAccountInitialized(e.c paramc) {}
  
  public final void onAccountRelease()
  {
    Object localObject;
    if (this.lbT != null)
    {
      localObject = this.lbT;
      ((ah)localObject).tas.clear();
      ((ah)localObject).tat.clear();
    }
    if (this.lbX != null)
    {
      localObject = this.lbX;
      g.Ek();
      g.Eh().dpP.b(681, (e)localObject);
      g.Ek();
      g.Eh().dpP.b(806, (e)localObject);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/messenger/foundation/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */