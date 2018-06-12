package com.tencent.mm.plugin.emoji.a.a;

import com.tencent.mm.model.q;
import com.tencent.mm.pluginsdk.model.h;
import com.tencent.mm.pluginsdk.model.h.a;
import com.tencent.mm.pluginsdk.model.n;
import com.tencent.mm.protocal.c.ts;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.storage.ao;
import java.util.ArrayList;
import java.util.Iterator;

public final class b
{
  public static void a(c paramc, h.a parama)
  {
    if (!q.GR()) {}
    ArrayList localArrayList;
    do
    {
      do
      {
        return;
      } while ((paramc == null) || (paramc.size() <= 0) || (parama == null));
      localArrayList = new ArrayList();
      Iterator localIterator = paramc.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (f)localIterator.next();
        if ((localObject != null) && (((f)localObject).iey != f.a.ieH))
        {
          localObject = ((f)localObject).iez;
          boolean bool1 = e.b((ts)localObject);
          boolean bool2 = e.a((ts)localObject);
          if ((!bool1) && (!bool2))
          {
            localArrayList.add(((ts)localObject).rem);
            localObject = paramc.zd(((ts)localObject).rem);
            if (localObject != null) {
              ((ao)localObject).taW = 11;
            }
          }
        }
      }
      paramc = ad.getContext();
    } while (localArrayList.size() <= 0);
    h.a(paramc, (String[])localArrayList.toArray(new String[localArrayList.size()]), parama);
  }
  
  public static void a(ArrayList<n> paramArrayList, c paramc)
  {
    if (!q.GR()) {}
    while ((paramc == null) || (paramArrayList == null) || (paramArrayList.size() <= 0)) {
      return;
    }
    paramArrayList = paramArrayList.iterator();
    label27:
    label177:
    label180:
    for (;;)
    {
      ao localao;
      if (paramArrayList.hasNext())
      {
        n localn = (n)paramArrayList.next();
        if (localn == null) {
          continue;
        }
        localao = paramc.zd(localn.bKk);
        if (localao == null) {
          continue;
        }
        if (localn.qzg == 10232)
        {
          localao.taY = localn.qzd;
          localao.taW = 12;
          i = localao.taU;
          if ((oH(i)) || (oI(i))) {
            continue;
          }
          localao.Dl(4);
          continue;
        }
        localao.taW = 10;
        localao.taX = localn.qzg;
        i = localao.taU;
        if ((oH(i)) || (oI(i))) {
          continue;
        }
        if (i != 3) {
          break label177;
        }
      }
      for (int i = 1;; i = 0)
      {
        if (i != 0) {
          break label180;
        }
        localao.Dl(10);
        break label27;
        break;
      }
    }
  }
  
  private static boolean oH(int paramInt)
  {
    return paramInt == 7;
  }
  
  private static boolean oI(int paramInt)
  {
    return paramInt == 6;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/emoji/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */