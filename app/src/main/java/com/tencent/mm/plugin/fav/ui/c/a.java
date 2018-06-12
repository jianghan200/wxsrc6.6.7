package com.tencent.mm.plugin.fav.ui.c;

import com.tencent.mm.g.a.fw;
import com.tencent.mm.g.a.fw.a;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.ui.k;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.aa;

public final class a
  extends c<fw>
{
  private k iYh;
  private aa<Long, com.tencent.mm.plugin.fav.a.g> jel = new aa(10);
  
  public a()
  {
    this.sFo = fw.class.getName().hashCode();
  }
  
  private boolean a(fw paramfw)
  {
    com.tencent.mm.plugin.fav.a.g localg2;
    com.tencent.mm.plugin.fav.a.g localg1;
    if (paramfw.bOx.bJA != 0L) {
      if (paramfw.bOx.bOE)
      {
        localg2 = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramfw.bOx.bJA);
        localg1 = localg2;
        if (localg2 != null)
        {
          this.jel.put(Long.valueOf(paramfw.bOx.bJA), localg2);
          localg1 = localg2;
        }
      }
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FavImageServiceListener", "image serivce callback type %d, localId %d", new Object[] { Integer.valueOf(paramfw.bOx.opType), Long.valueOf(paramfw.bOx.bJA) });
      if ((localg1 == null) && (paramfw.bOx.opType != 3) && (paramfw.bOx.opType != 4)) {}
      do
      {
        return false;
        localg1 = (com.tencent.mm.plugin.fav.a.g)this.jel.get(Long.valueOf(paramfw.bOx.bJA));
        if (localg1 == null) {}
        for (boolean bool = true;; bool = false)
        {
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FavImageServiceListener", "get item from cache itemInfo is null? %B", new Object[] { Boolean.valueOf(bool) });
          if (localg1 != null) {
            break label534;
          }
          localg2 = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramfw.bOx.bJA);
          localg1 = localg2;
          if (localg2 == null) {
            break;
          }
          this.jel.put(Long.valueOf(paramfw.bOx.bJA), localg2);
          localg1 = localg2;
          break;
        }
        switch (paramfw.bOx.opType)
        {
        default: 
          return false;
        case 0: 
          paramfw.bOy.bOF = k.a(paramfw.bOx.bOz, localg1);
          return false;
        case 2: 
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FavImageServiceListener", "get img from Cache %s", new Object[] { Boolean.valueOf(paramfw.bOx.bOC) });
          if (paramfw.bOx.bOC)
          {
            paramfw.bOy.bOF = k.j(paramfw.bOx.bOz);
            return false;
          }
          paramfw.bOy.bOF = k.b(paramfw.bOx.bOz, localg1, paramfw.bOx.maxWidth);
          return false;
        case 1: 
          if (this.iYh == null)
          {
            com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavImageServiceListener", "imageServer is null");
            return false;
          }
          this.iYh.b(paramfw.bOx.bOA, paramfw.bOx.bOz, localg1, paramfw.bOx.bOB, paramfw.bOx.width, paramfw.bOx.height);
          return false;
        case 3: 
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FavImageServiceListener", "create image server");
          if (this.iYh != null) {
            this.iYh.destory();
          }
          this.iYh = new k(paramfw.bOx.context, 16);
          return false;
        }
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FavImageServiceListener", "destroy image server");
      } while (this.iYh == null);
      this.iYh.destory();
      this.iYh = null;
      return false;
      label534:
      continue;
      localg1 = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */