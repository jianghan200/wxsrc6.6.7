package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class d
  implements e
{
  public Map<Integer, Set<t>> dJw = new HashMap();
  
  public d()
  {
    g.Eh().dpP.a(452, this);
  }
  
  public static void a(int paramInt, x paramx)
  {
    paramx = new y(paramInt, paramx);
    g.Eh().dpP.a(paramx, 0);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if (!(paraml instanceof y)) {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppCenterNetSceneService", "onSceneEnd, the scene is not a instance of NetSceneAppCenter");
    }
    for (;;)
    {
      return;
      paraml = (y)paraml;
      Set localSet = (Set)this.dJw.get(Integer.valueOf(paraml.qAc));
      if ((localSet != null) && (localSet.size() > 0))
      {
        Object localObject = new HashSet();
        ((Set)localObject).addAll(localSet);
        localObject = ((Set)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          t localt = (t)((Iterator)localObject).next();
          if ((localt != null) && (localSet.contains(localt))) {
            localt.a(paramInt1, paramInt2, paramString, paraml.qAd);
          }
        }
      }
    }
  }
  
  public final void a(int paramInt, t paramt)
  {
    if (!this.dJw.containsKey(Integer.valueOf(paramInt))) {
      this.dJw.put(Integer.valueOf(paramInt), new HashSet());
    }
    if (!((Set)this.dJw.get(Integer.valueOf(paramInt))).contains(paramt)) {
      ((Set)this.dJw.get(Integer.valueOf(paramInt))).add(paramt);
    }
  }
  
  public final void b(int paramInt, t paramt)
  {
    if (this.dJw.get(Integer.valueOf(paramInt)) != null) {
      ((Set)this.dJw.get(Integer.valueOf(paramInt))).remove(paramt);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/pluginsdk/model/app/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */