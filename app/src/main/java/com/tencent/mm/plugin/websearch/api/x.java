package com.tencent.mm.plugin.websearch.api;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Base64;
import com.tencent.mm.al.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.model.s;
import com.tencent.mm.protocal.c.avk;
import com.tencent.mm.protocal.c.avl;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public final class x
{
  public static avl pLP;
  
  public static void PZ(String paramString)
  {
    if (b.ml((String)g.Ei().DT().get(274436, null))) {}
    while (!s.hf(paramString)) {
      return;
    }
    if (pLP == null) {
      bTb();
    }
    long l1 = System.currentTimeMillis();
    Object localObject1 = null;
    int i = 0;
    Object localObject2;
    if (i < pLP.hbG.size())
    {
      localObject2 = (avk)pLP.hbG.get(i);
      long l2 = (l1 - ((avk)localObject2).rYi) / 86400000L;
      ((avk)localObject2).rYh *= Math.pow(0.98D, l2);
      ((avk)localObject2).rYi = (l2 * 86400000L + ((avk)localObject2).rYi);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.WebSearch.WebSearchMostSearchBizLogic", "after update: %.2f %d %s", new Object[] { Double.valueOf(((avk)localObject2).rYh), Long.valueOf(((avk)localObject2).rYi), ((avk)localObject2).rdS });
      if (!((avk)localObject2).rdS.equals(paramString)) {
        break label453;
      }
      localObject1 = localObject2;
    }
    label453:
    for (;;)
    {
      i += 1;
      break;
      if (localObject1 == null)
      {
        localObject1 = new avk();
        ((avk)localObject1).rYh = 1.0D;
        ((avk)localObject1).rYi = l1;
        ((avk)localObject1).rdS = paramString;
        pLP.hbG.add(localObject1);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WebSearch.WebSearchMostSearchBizLogic", "add new use %s", new Object[] { paramString });
      }
      for (;;)
      {
        Collections.sort(pLP.hbG, new Comparator() {});
        i = pLP.hbG.size() - 1;
        while ((i < pLP.hbG.size()) && (pLP.hbG.size() > 8))
        {
          if (((avk)pLP.hbG.get(i)).rYh < 0.5D) {
            pLP.hbG.remove(i);
          }
          i += 1;
        }
        ((avk)localObject1).rYh += 1.0D;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WebSearch.WebSearchMostSearchBizLogic", "update use %s %.2f", new Object[] { paramString, Double.valueOf(((avk)localObject1).rYh) });
      }
      paramString = ad.getContext().getSharedPreferences("fts_recent_biz_sp", 0);
      try
      {
        localObject1 = bSY();
        localObject2 = Base64.encodeToString(pLP.toByteArray(), 0);
        paramString.edit().putString((String)localObject1, (String)localObject2).commit();
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WebSearch.WebSearchMostSearchBizLogic", "useBiz pbListString %s", new Object[] { localObject2 });
        return;
      }
      catch (IOException paramString)
      {
        return;
      }
    }
  }
  
  public static String bSY()
  {
    return "key_pb_most_search_biz_list" + q.GF();
  }
  
  public static avl bTb()
  {
    Object localObject;
    if (pLP == null)
    {
      localObject = bSY();
      pLP = new avl();
      localObject = ad.getContext().getSharedPreferences("fts_recent_biz_sp", 0).getString((String)localObject, "");
      if (!bi.oW((String)localObject)) {
        localObject = Base64.decode(((String)localObject).getBytes(), 0);
      }
    }
    try
    {
      pLP.aG((byte[])localObject);
      if (b.ml((String)g.Ei().DT().get(274436, null))) {
        pLP.hbG.clear();
      }
      return pLP;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/websearch/api/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */