package com.tencent.mm.plugin.wallet_core.model.mall;

import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class d
{
  private static d psn = null;
  public Map<String, MallNews> psm = new HashMap();
  
  private d()
  {
    Wj();
  }
  
  private static MallNews Pg(String paramString)
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
        localMallNews = new MallNews((String)localMap.get(".sysmsg.mallactivitynew.functionid"));
        localMallNews.oqH = ((String)localMap.get(".sysmsg.mallactivitynew.activityid"));
        localMallNews.type = ((String)localMap.get(".sysmsg.mallactivitynew.type"));
        localMallNews.showType = bi.getInt((String)localMap.get(".sysmsg.mallactivitynew.showtype"), 0);
        if (localMap.containsKey(".sysmsg.mallactivitynew.showflag"))
        {
          localMallNews.psa = ((String)localMap.get(".sysmsg.mallactivitynew.showflag"));
          if (localMap.containsKey(".sysmsg.mallactivitynew.newsTipFlag"))
          {
            localMallNews.psb = ((String)localMap.get(".sysmsg.mallactivitynew.newsTipFlag"));
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
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MallNewsManagerNewVersion", "cmdid error");
        return null;
      }
    }
    return localMallNews;
  }
  
  public static d bPO()
  {
    if (psn == null) {
      psn = new d();
    }
    return psn;
  }
  
  public final MallNews Pf(String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MallNewsManagerNewVersion", "removeNewsInIndexUI : " + paramString);
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
  
  public final MallNews Ph(String paramString)
  {
    return (MallNews)this.psm.get(paramString);
  }
  
  public final void Wj()
  {
    this.psm.clear();
    g.Ek();
    Object localObject = (String)g.Ei().DT().get(270341, "");
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MallNewsManagerNewVersion", "data : " + (String)localObject);
    localObject = bi.F(((String)localObject).split(";")).iterator();
    while (((Iterator)localObject).hasNext())
    {
      MallNews localMallNews = Pg((String)((Iterator)localObject).next());
      if (localMallNews != null) {
        this.psm.put(localMallNews.psc, localMallNews);
      }
    }
  }
  
  public final boolean bna()
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MallNewsManagerNewVersion", "notifyNewsMap.size : " + this.psm.size());
    StringBuffer localStringBuffer = new StringBuffer();
    Iterator localIterator = this.psm.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      if (!bi.oW((String)localObject))
      {
        localObject = (MallNews)this.psm.get(localObject);
        localStringBuffer.append(((MallNews)localObject).psj.replace("</mallactivitynew></sysmsg>;", "").replaceAll("<activityid>([^<]*)</activityid>", "").replaceAll("<type>([^<]*)</type>", "").replaceAll("<showflag>([^<]*)</showflag>", "").replaceAll("<newsTipFlag>([^<]*)</newsTipFlag>", "") + "<activityid>" + ((MallNews)localObject).oqH + "</activityid><type>" + ((MallNews)localObject).type + "</type><showflag>" + ((MallNews)localObject).psa + "</showflag><newsTipFlag>" + ((MallNews)localObject).psb + "</newsTipFlag></mallactivitynew></sysmsg>;");
      }
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MallNewsManagerNewVersion", "save data  : " + localStringBuffer.toString());
    g.Ek();
    g.Ei().DT().set(270341, localStringBuffer.toString());
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/mall/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */