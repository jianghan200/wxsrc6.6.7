package com.tencent.mm.plugin.wallet_core.model.mall;

import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.s.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.storage.aa.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public final class c
{
  private static c psl = null;
  public Map<String, MallNews> psm = new HashMap();
  
  private c()
  {
    Wj();
  }
  
  public static void Pd(String paramString)
  {
    Map localMap;
    if (!bi.oW(paramString))
    {
      localMap = bl.z(paramString, "sysmsg");
      if (localMap != null)
      {
        i = bi.getInt((String)localMap.get(".sysmsg.paymsg.PayMsgType"), -1);
        if (i != 31) {
          break label217;
        }
        paramString = (String)localMap.get(".sysmsg.paymsg.WalletRedDotWording");
        i = bi.getInt((String)localMap.get(".sysmsg.paymsg.WalletRedDot"), -1);
        j = bi.getInt((String)localMap.get(".sysmsg.paymsg.BalanceRedDot"), -1);
        int k = bi.getInt((String)localMap.get(".sysmsg.paymsg.LQTRedDot"), -1);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallNewsManager", "walletEntryWording: %s, balanceRedDot: %s, lqtRedDot: %s", new Object[] { paramString, Integer.valueOf(j), Integer.valueOf(k) });
        g.Ek();
        g.Ei().DT().a(aa.a.sXL, paramString);
        g.Ek();
        g.Ei().DT().a(aa.a.sXM, Integer.valueOf(i));
        g.Ek();
        g.Ei().DT().a(aa.a.sXN, Integer.valueOf(j));
        g.Ek();
        g.Ei().DT().a(aa.a.sXO, Integer.valueOf(k));
        bPN();
      }
    }
    label217:
    do
    {
      do
      {
        do
        {
          return;
          if (i != 34) {
            break;
          }
          localObject = localMap.keySet();
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallNewsManager", "receive menu ui reddot msg: %s, keys: %s", new Object[] { paramString, localObject.toString() });
        } while (((Set)localObject).size() <= 0);
        paramString = new JSONObject();
        Object localObject = ((Set)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          String str2 = (String)((Iterator)localObject).next();
          if (str2.startsWith(".sysmsg.paymsg.reddot.item"))
          {
            String str1 = (String)localMap.get(str2);
            str2 = (String)localMap.get(str2 + ".$wording");
            if (!bi.oW(str1))
            {
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallNewsManager", "mall menu ui, %s has reddot, wording: %s", new Object[] { str1, str2 });
              if ("mainentry_me".equals(str1))
              {
                g.Ek();
                g.Ei().DT().a(aa.a.sZt, Boolean.valueOf(true));
              }
              else if ("entry_wxpay_wallet".equals(str1))
              {
                g.Ek();
                g.Ei().DT().a(aa.a.sZu, Boolean.valueOf(true));
                if (!bi.oW(str2))
                {
                  g.Ek();
                  g.Ei().DT().a(aa.a.sZs, str2);
                }
                else
                {
                  g.Ek();
                  g.Ei().DT().a(aa.a.sZs, "");
                }
              }
              else if ("entry_wxpay_paycenter".equals(str1))
              {
                g.Ek();
                g.Ei().DT().a(aa.a.sZo, Boolean.valueOf(true));
              }
              else
              {
                try
                {
                  paramString.put(str1, 1);
                }
                catch (Exception localException)
                {
                  com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.MallNewsManager", localException, "put redDotConfig json failed: %s", new Object[] { localException.getMessage() });
                }
              }
            }
          }
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallNewsManager", "redDotConfig: %s", new Object[] { paramString.toString() });
      } while (paramString.length() <= 0);
      g.Ek();
      g.Ei().DT().a(aa.a.sZn, paramString.toString());
      g.Ek();
      g.Ei().DT().a(aa.a.sZo, Boolean.valueOf(true));
      return;
    } while (i != 36);
    paramString = (String)localMap.get(".sysmsg.paymsg.WalletRedDotWording");
    int i = bi.getInt((String)localMap.get(".sysmsg.paymsg.WalletRedDot"), -1);
    int j = bi.getInt((String)localMap.get(".sysmsg.paymsg.LQBRedDot"), -1);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallNewsManager", "walletEntryWording: %s, walletRedDot: %s, lqbRedDot: %s", new Object[] { paramString, Integer.valueOf(i), Integer.valueOf(j) });
    g.Ek();
    g.Ei().DT().a(aa.a.sXL, paramString);
    g.Ek();
    g.Ei().DT().a(aa.a.sXM, Integer.valueOf(i));
    g.Ek();
    g.Ei().DT().a(aa.a.sXP, Integer.valueOf(j));
    bPN();
  }
  
  public static MallNews Pg(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    Map localMap = bl.z(paramString, "sysmsg");
    if (localMap == null) {
      return null;
    }
    MallNews localMallNews;
    for (;;)
    {
      try
      {
        localMallNews = new MallNews((String)localMap.get(".sysmsg.mallactivity.functionid"));
        localMallNews.oqH = ((String)localMap.get(".sysmsg.mallactivity.activityid"));
        localMallNews.bLe = ((String)localMap.get(".sysmsg.mallactivity.ticket"));
        localMallNews.type = ((String)localMap.get(".sysmsg.mallactivity.type"));
        localMallNews.showType = bi.getInt((String)localMap.get(".sysmsg.mallactivity.showtype"), 0);
        if (localMap.containsKey(".sysmsg.mallactivity.showflag"))
        {
          localMallNews.psa = ((String)localMap.get(".sysmsg.mallactivity.showflag"));
          if (localMap.containsKey(".sysmsg.mallactivity.newsTipFlag"))
          {
            localMallNews.psb = ((String)localMap.get(".sysmsg.mallactivity.newsTipFlag"));
            localMallNews.psj = paramString;
            if (!bi.oW(localMallNews.psc)) {
              break;
            }
            return null;
          }
        }
        else
        {
          localMallNews.psa = "0";
          continue;
        }
        localMallNews.psb = "0";
      }
      catch (Exception paramString)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MallNewsManager", "cmdid error");
        return null;
      }
    }
    return localMallNews;
  }
  
  public static boolean a(MallNews paramMallNews)
  {
    g.Ek();
    String str = (String)g.Ei().DT().get(aa.a.sVG, "");
    ArrayList localArrayList = bi.F(str.split(","));
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallNewsManager", "tryCheckOutOfDateRedDot markedString %s", new Object[] { str });
    if (paramMallNews == null) {
      return false;
    }
    if (bi.oW(paramMallNews.oqH)) {
      return false;
    }
    return localArrayList.contains(paramMallNews.oqH);
  }
  
  public static c bPK()
  {
    if (psl == null) {
      psl = new c();
    }
    return psl;
  }
  
  public static void bPM()
  {
    g.Ek();
    g.Ei().DT().a(aa.a.sXL, "");
    g.Ek();
    g.Ei().DT().a(aa.a.sXM, Integer.valueOf(-1));
  }
  
  public static void bPN()
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MallNewsManager", "clearMallNew ");
    com.tencent.mm.s.c.Cp().aV(262156, 266248);
  }
  
  public static void c(MallFunction paramMallFunction)
  {
    try
    {
      if (!bi.oW(paramMallFunction.prU.oqH))
      {
        g.Ek();
        localObject = bi.F(((String)g.Ei().DT().get(aa.a.sVG, "")).split(","));
        while (((List)localObject).size() > 20) {
          ((List)localObject).remove(0);
        }
      }
      return;
    }
    catch (Exception paramMallFunction)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.MallNewsManager", paramMallFunction, "error in markedFunction", new Object[0]);
    }
    while (((List)localObject).contains(paramMallFunction.prU.oqH)) {}
    ((List)localObject).add(paramMallFunction.prU.oqH);
    Object localObject = bi.c((List)localObject, ",");
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallNewsManager", "doSelectFunction %s, markedString %s", new Object[] { paramMallFunction.prU.oqH, localObject });
    g.Ek();
    g.Ei().DT().a(aa.a.sVG, localObject);
  }
  
  public final String Pe(String paramString)
  {
    paramString = (MallNews)this.psm.get(paramString);
    if ((paramString != null) && (!bi.oW(paramString.bLe))) {
      return paramString.bLe;
    }
    return null;
  }
  
  public final MallNews Pf(String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MallNewsManager", "removeNewsInIndexUI : " + paramString);
    if ((!bi.oW(paramString)) && (this.psm.containsKey(paramString)))
    {
      paramString = (MallNews)this.psm.get(paramString);
      if ("0".equals(paramString.psa))
      {
        paramString.psa = "1";
        bna();
      }
      return paramString;
    }
    return null;
  }
  
  public final void Q(ArrayList<MallFunction> paramArrayList)
  {
    if (paramArrayList != null)
    {
      Object localObject = new HashSet(this.psm.keySet());
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext()) {
        ((Set)localObject).remove(((MallFunction)paramArrayList.next()).moy);
      }
      paramArrayList = ((Set)localObject).iterator();
      while (paramArrayList.hasNext())
      {
        localObject = (String)paramArrayList.next();
        this.psm.remove(localObject);
      }
      bna();
    }
  }
  
  public final void Wj()
  {
    this.psm.clear();
    g.Ek();
    Object localObject = (String)g.Ei().DT().get(270339, "");
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MallNewsManager", "data : " + (String)localObject);
    localObject = bi.F(((String)localObject).split(";")).iterator();
    while (((Iterator)localObject).hasNext())
    {
      MallNews localMallNews = Pg((String)((Iterator)localObject).next());
      if (localMallNews != null) {
        this.psm.put(localMallNews.psc, localMallNews);
      }
    }
  }
  
  public final List<String> bPL()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.psm.values().iterator();
    while (localIterator.hasNext())
    {
      MallNews localMallNews = (MallNews)localIterator.next();
      if (!bi.oW(localMallNews.bLe)) {
        localArrayList.add(localMallNews.bLe);
      }
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MallNewsManager", "tickets.size : " + localArrayList.size());
    return localArrayList;
  }
  
  public final boolean bna()
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MallNewsManager", "notifyNewsMap.size : " + this.psm.size());
    StringBuffer localStringBuffer = new StringBuffer();
    Iterator localIterator = this.psm.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      if (!bi.oW((String)localObject))
      {
        localObject = (MallNews)this.psm.get(localObject);
        localStringBuffer.append(((MallNews)localObject).psj.replace("</mallactivity></sysmsg>", "").replaceAll("<showflag>([^<]*)</showflag>", "").replaceAll("<newsTipFlag>([^<]*)</newsTipFlag>", "") + "<showflag>" + ((MallNews)localObject).psa + "</showflag><newsTipFlag>" + ((MallNews)localObject).psb + "</newsTipFlag></mallactivity></sysmsg>;");
      }
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MallNewsManager", "save data  : " + localStringBuffer.toString());
    g.Ek();
    g.Ei().DT().set(270339, localStringBuffer.toString());
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/mall/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */