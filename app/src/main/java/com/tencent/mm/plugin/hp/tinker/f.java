package com.tencent.mm.plugin.hp.tinker;

import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.boots.a.c;
import com.tencent.mm.plugin.hp.b.b;
import com.tencent.mm.protocal.c.bsw;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class f
  extends com.tinkerboots.sdk.a.a.a
{
  public final void E(Map<String, String> paramMap)
  {
    super.E(paramMap);
    b.rl(2);
    String str2 = "tinker_id_" + com.tencent.mm.loader.stub.a.baseRevision();
    if (com.tencent.mm.loader.stub.a.PATCH_REV == null) {}
    LinkedList localLinkedList;
    Object localObject;
    for (String str1 = "";; str1 = "tinker_id_" + com.tencent.mm.loader.stub.a.PATCH_REV)
    {
      localLinkedList = new LinkedList();
      localIterator = paramMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        localObject = (String)localIterator.next();
        bsw localbsw = new bsw();
        localbsw.aAL = ((String)localObject);
        localbsw.value = ((String)paramMap.get(localObject));
        localLinkedList.add(localbsw);
      }
    }
    paramMap = new StringBuilder();
    Iterator localIterator = localLinkedList.iterator();
    while (localIterator.hasNext())
    {
      localObject = (bsw)localIterator.next();
      paramMap.append(((bsw)localObject).aAL).append(":").append(((bsw)localObject).value).append("\n");
    }
    x.i("Tinker.TinkerPatchRequestCallback", "checkAvailableUpdate BaseID:%s PatchID:%s config:%s", new Object[] { str2, str1, paramMap.toString() });
    paramMap = new com.tencent.mm.plugin.hp.c.a(str2, str1, localLinkedList);
    au.DF().a(paramMap, 0);
  }
  
  public final boolean aWu()
  {
    return super.aWu();
  }
  
  public final void aWv()
  {
    super.aWv();
    long l = com.tencent.mm.kernel.a.Dz();
    Object localObject = com.tinkerboots.sdk.a.cJC().gy("uin", String.valueOf(l & 0xFFFFFFFF));
    if (ao.isWifi(ad.getContext())) {}
    for (int i = 3;; i = 2)
    {
      ((com.tinkerboots.sdk.a)localObject).gy("network", String.valueOf(i));
      localObject = ((c)g.l(c.class)).aua();
      if (localObject == null) {
        break;
      }
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        com.tencent.mm.plugin.boots.a.a locala = (com.tencent.mm.plugin.boots.a.a)((Iterator)localObject).next();
        com.tinkerboots.sdk.a.cJC().gy(Integer.toHexString(locala.field_key), String.valueOf(locala.field_dau));
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/hp/tinker/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */