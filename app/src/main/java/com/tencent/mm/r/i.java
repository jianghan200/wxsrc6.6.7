package com.tencent.mm.r;

import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.p;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class i
  implements ar
{
  private static HashMap<Integer, h.d> cVM;
  private e diO;
  private c diP = new c();
  Map<Integer, List<f>> diQ = new HashMap();
  
  static
  {
    HashMap localHashMap = new HashMap();
    cVM = localHashMap;
    localHashMap.put(Integer.valueOf("FunctionMsgItem".hashCode()), new i.1());
  }
  
  static i Cf()
  {
    return (i)p.v(i.class);
  }
  
  public static e Cg()
  {
    if (Cf().diO == null) {
      Cf().diO = new e(g.Ei().dqq);
    }
    return Cf().diO;
  }
  
  public static c Ch()
  {
    if (Cf().diP == null) {
      Cf().diP = new c();
    }
    return Cf().diP;
  }
  
  public static void a(f paramf)
  {
    try
    {
      x.i("MicroMsg.SubCoreFunctionMsg", "removeUpdateCallback, msgType: %s, callback: %s", new Object[] { Integer.valueOf(12399999), paramf });
      if (paramf != null)
      {
        List localList = (List)Cf().diQ.get(Integer.valueOf(12399999));
        if ((localList != null) && (localList.contains(paramf)))
        {
          localList.remove(paramf);
          Cf().diQ.put(Integer.valueOf(12399999), localList);
        }
      }
      return;
    }
    finally {}
  }
  
  public static void b(f paramf)
  {
    try
    {
      x.i("MicroMsg.SubCoreFunctionMsg", "addUpdateCallback, msgType: %s, callback: %s", new Object[] { Integer.valueOf(12399999), paramf });
      if (paramf != null)
      {
        List localList = (List)Cf().diQ.get(Integer.valueOf(12399999));
        Object localObject = localList;
        if (localList == null) {
          localObject = new ArrayList();
        }
        if (!((List)localObject).contains(paramf)) {
          ((List)localObject).add(paramf);
        }
        Cf().diQ.put(Integer.valueOf(12399999), localObject);
      }
      return;
    }
    finally {}
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    x.i("MicroMsg.SubCoreFunctionMsg", "getBaseDBFactories");
    return cVM;
  }
  
  public final void bn(boolean paramBoolean)
  {
    x.i("MicroMsg.SubCoreFunctionMsg", "onAccountPostReset");
    g.Em().h(new a.1(), 10000L);
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    x.d("MicroMsg.SubCoreFunctionMsg", "onAccountRelease");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/r/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */