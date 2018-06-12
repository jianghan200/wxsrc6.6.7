package com.tencent.mm.plugin.wenote.model;

import android.content.Context;
import com.tencent.mm.a.e;
import com.tencent.mm.g.a.fz;
import com.tencent.mm.g.a.fz.a;
import com.tencent.mm.g.a.fz.b;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class f
{
  public static String C(Context paramContext, int paramInt)
  {
    fz localfz = new fz();
    localfz.bOL.type = 21;
    localfz.bOL.context = paramContext;
    localfz.bOL.bOT = paramInt;
    a.sFg.m(localfz);
    return localfz.bOM.path;
  }
  
  public static String Sf(String paramString)
  {
    return com.tencent.mm.a.g.u((paramString + 18 + System.currentTimeMillis()).getBytes());
  }
  
  public static void W(ArrayList<String> paramArrayList)
  {
    int j = 0;
    if (c.bZb().qnC == null) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WNNoteFavLogic", "sortNoteDataList, getWnNoteBase() is null");
    }
    label434:
    label437:
    for (;;)
    {
      return;
      wl localwl = c.bZb().qnC.qnO;
      Object localObject1 = new ArrayList();
      Object localObject2 = new HashMap();
      if (localwl == null)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WNNoteFavLogic", "sortNoteDataList, protoItem is null");
        return;
      }
      Object localObject3 = localwl.rBI.iterator();
      while (((Iterator)localObject3).hasNext())
      {
        vx localvx = (vx)((Iterator)localObject3).next();
        if ((!bi.oW(localvx.rAq)) && (!localvx.rAq.contains("WeNoteHtmlFile")) && (!localvx.rAq.contains("-1")))
        {
          ((List)localObject1).add(localvx.rAq);
          ((HashMap)localObject2).put(localvx.rAq, localvx);
        }
      }
      if ((paramArrayList.size() == ((List)localObject1).size()) && (((List)localObject1).containsAll(paramArrayList)) && (paramArrayList.containsAll((Collection)localObject1)))
      {
        i = 0;
        if (i >= ((List)localObject1).size()) {
          break label434;
        }
        if (((String)((List)localObject1).get(i)).trim().equals(((String)paramArrayList.get(i)).trim())) {}
      }
      for (int i = 1;; i = 0)
      {
        if (i == 0) {
          break label437;
        }
        localObject1 = new LinkedList();
        i = j;
        for (;;)
        {
          if (i < paramArrayList.size())
          {
            ((LinkedList)localObject1).add(((HashMap)localObject2).get(paramArrayList.get(i)));
            i += 1;
            continue;
            i += 1;
            break;
          }
        }
        localwl.ar((LinkedList)localObject1);
        bZd();
        ((HashMap)localObject2).clear();
        return;
        ((List)localObject1).removeAll(paramArrayList);
        if (((List)localObject1).size() == 0) {
          break;
        }
        paramArrayList = new ArrayList();
        localObject2 = localwl.rBI.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (vx)((Iterator)localObject2).next();
          if (((List)localObject1).contains(((vx)localObject3).rAq)) {
            paramArrayList.add(localObject3);
          }
        }
        paramArrayList = paramArrayList.iterator();
        while (paramArrayList.hasNext())
        {
          localObject1 = (vx)paramArrayList.next();
          localwl.rBI.remove(localObject1);
        }
        bZd();
        return;
      }
    }
  }
  
  public static String aj(float paramFloat)
  {
    if (paramFloat < 1024.0F) {
      return String.format("%.1fB", new Object[] { Float.valueOf(paramFloat) });
    }
    if (paramFloat < 1048576.0F) {
      return String.format("%.1fKB", new Object[] { Float.valueOf(paramFloat / 1024.0F) });
    }
    if (paramFloat < 1.07374182E9F) {
      return String.format("%.1fMB", new Object[] { Float.valueOf(paramFloat / 1024.0F / 1024.0F) });
    }
    return String.format("%.1fGB", new Object[] { Float.valueOf(paramFloat / 1024.0F / 1024.0F / 1024.0F) });
  }
  
  public static float bD(long paramLong)
  {
    float f1 = 1.0F;
    float f2 = (float)paramLong / 1000.0F;
    if (f2 < 1.0F) {}
    for (;;)
    {
      return Math.round(f1 * 10.0F) / 10.0F;
      f1 = f2;
    }
  }
  
  private static void bZd()
  {
    fz localfz = new fz();
    localfz.bOL.type = 30;
    if (c.bZb().qnC != null)
    {
      localfz.bOL.bJH = c.bZb().qnC.qnO;
      a.sFg.m(localfz);
      c.bZb().qnC.Sd(localfz.bOM.path);
    }
  }
  
  public static String c(vx paramvx)
  {
    fz localfz = new fz();
    localfz.bOL.type = 27;
    localfz.bOL.bON = paramvx;
    a.sFg.m(localfz);
    return localfz.bOM.bOX;
  }
  
  public static com.tencent.mm.plugin.fav.a.g eo(long paramLong)
  {
    return ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramLong);
  }
  
  public static String o(vx paramvx)
  {
    fz localfz = new fz();
    localfz.bOL.type = 27;
    localfz.bOL.bON = paramvx;
    a.sFg.m(localfz);
    return localfz.bOM.path;
  }
  
  public static void t(long paramLong, String paramString)
  {
    if (paramLong <= 0L) {}
    do
    {
      do
      {
        return;
        localObject1 = new fz();
        ((fz)localObject1).bOL.type = 34;
        ((fz)localObject1).bOL.bJA = paramLong;
        a.sFg.m((b)localObject1);
      } while ((((fz)localObject1).bOL.bJH == null) || (((fz)localObject1).bOL.bJH.rBI == null) || (((fz)localObject1).bOL.bJH.rBI.size() <= 1) || (((vx)((fz)localObject1).bOL.bJH.rBI.get(0)).rAq != null));
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WNNoteFavLogic", "Note: Htmlid is null,  do updateFavItemHtmlIdStorage");
    } while ((bi.oW(paramString)) || (!e.cn(paramString)));
    for (;;)
    {
      try
      {
        localObject2 = com.tencent.mm.plugin.wenote.b.c.Sv(paramString);
        paramString = ((fz)localObject1).bOL.bJH;
        localObject1 = new ArrayList();
        if ((bi.oW((String)localObject2)) || (((String)localObject2).length() == 0)) {
          break;
        }
        localObject2 = Pattern.compile("<object[^>]*>", 2).matcher((CharSequence)localObject2);
        if (!((Matcher)localObject2).find()) {
          break label306;
        }
        localObject3 = ((Matcher)localObject2).group();
        int k = ((String)localObject3).indexOf("WeNote_");
        if (k == -1) {
          break label306;
        }
        i = ((String)localObject3).indexOf("\"", k + 1);
        if (i == -1) {
          break label306;
        }
        j = ((String)localObject3).indexOf(" ", k + 1);
        if (j == -1) {
          break label306;
        }
        if (i < j) {
          ((ArrayList)localObject1).add(((String)localObject3).substring(k, i));
        } else {
          i = j;
        }
      }
      catch (Exception paramString)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WNNoteFavLogic", "Note: FileNotFoundException :%s", new Object[] { paramString.getMessage() });
        return;
      }
    }
    label306:
    Object localObject2 = new LinkedList();
    Object localObject3 = paramString.rBI.iterator();
    int j = 0;
    int i = 0;
    while (((Iterator)localObject3).hasNext())
    {
      vx localvx = (vx)((Iterator)localObject3).next();
      if (i == 0)
      {
        localvx.UY("WeNoteHtmlFile");
        ((LinkedList)localObject2).add(localvx);
        i += 1;
      }
      else
      {
        if (localvx.bjS == 1) {
          localvx.UY("-1");
        }
        for (;;)
        {
          ((LinkedList)localObject2).add(localvx);
          break;
          localvx.UY((String)((ArrayList)localObject1).get(j));
          j += 1;
        }
      }
    }
    Object localObject1 = new fz();
    ((fz)localObject1).bOL.type = 33;
    ((fz)localObject1).bOL.bJH = paramString;
    ((fz)localObject1).bOL.bJH.rBI = ((LinkedList)localObject2);
    ((fz)localObject1).bOL.bJA = paramLong;
    a.sFg.m((b)localObject1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */