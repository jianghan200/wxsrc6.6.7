package com.tencent.mm.plugin.appbrand.config;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.v;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.protocal.c.byl;
import com.tencent.mm.protocal.c.zc;
import com.tencent.mm.protocal.c.zd;
import com.tencent.mm.protocal.c.ze;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;

public final class m
{
  public static String a(String paramString, int paramInt1, int paramInt2, c paramc, boolean paramBoolean)
  {
    if (e.abf() == null) {
      return "";
    }
    int j = a.av(paramString, paramInt1);
    int i;
    String str;
    boolean bool;
    if (e.abf() == null)
    {
      i = 0;
      str = a.aw(paramString, paramInt1);
      if ((i == 0) || ((!bi.oW(str)) && (i <= j))) {
        break label208;
      }
      bool = true;
      label55:
      x.i("MicroMsg.CommonConfigManager", "getConfig the server_version is %d ,the local_version is %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      x.i("MicroMsg.CommonConfigManager", "the config is \n %s \n isShouldSyncFromServer:%b", new Object[] { str, Boolean.valueOf(bool) });
      if (!bool) {
        break label214;
      }
      if (paramBoolean)
      {
        paramc = new m.2(paramc, paramString);
        LinkedList localLinkedList = new LinkedList();
        zc localzc = new zc();
        localzc.jQb = paramString;
        localzc.hcE = paramInt1;
        localzc.rcV = i;
        localzc.rFj = paramInt2;
        localLinkedList.add(localzc);
        a(localLinkedList, paramc);
      }
    }
    for (;;)
    {
      return str;
      i = bi.getInt(e.abf().get(a.at(paramString, paramInt1), "0"), 0);
      break;
      label208:
      bool = false;
      break label55;
      label214:
      paramc.qR(str);
    }
  }
  
  public static void a(String paramString, LinkedList<byl> paramLinkedList)
  {
    a(paramString, paramLinkedList, true);
  }
  
  public static void a(String paramString, LinkedList<byl> paramLinkedList, boolean paramBoolean)
  {
    if (bi.oW(paramString)) {
      x.e("MicroMsg.CommonConfigManager", "setVersion, app_id is null");
    }
    LinkedList localLinkedList;
    do
    {
      return;
      if ((paramLinkedList == null) || (paramLinkedList.size() == 0))
      {
        x.e("MicroMsg.CommonConfigManager", "setVersion, versionItems is empty");
        return;
      }
      localLinkedList = new LinkedList();
      Iterator localIterator = paramLinkedList.iterator();
      while (localIterator.hasNext())
      {
        byl localbyl = (byl)localIterator.next();
        x.d("MicroMsg.CommonConfigManager", "versionItem.version:%d,version.type:%d", new Object[] { Integer.valueOf(localbyl.version), Integer.valueOf(localbyl.type) });
        int i = a.av(paramString, localbyl.type);
        int j = localbyl.version;
        a.B(paramString, localbyl.type, j);
        if (j != 0) {
          if (j > i)
          {
            localLinkedList.add(z(paramString, localbyl.type, localbyl.version));
          }
          else if (j == i)
          {
            if (bi.oW(a.aw(paramString, localbyl.type))) {
              localLinkedList.add(z(paramString, localbyl.type, localbyl.version));
            }
          }
          else
          {
            x.i("MicroMsg.CommonConfigManager", "local_version:%d, server_version:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
            if (bi.oW(a.aw(paramString, localbyl.type))) {
              localLinkedList.add(z(paramString, localbyl.type, localbyl.version));
            }
          }
        }
      }
      x.i("MicroMsg.CommonConfigManager", "setVersion appid:%s,versionItems.size:%d,getAppConfigItems.size:%d", new Object[] { paramString, Integer.valueOf(paramLinkedList.size()), Integer.valueOf(localLinkedList.size()) });
    } while ((!paramBoolean) || (localLinkedList.size() == 0));
    x.d("MicroMsg.CommonConfigManager", "setVersion appid:%s, need sync from server", new Object[] { paramString });
    a(localLinkedList, new m.1(paramString));
  }
  
  private static void a(LinkedList<zc> paramLinkedList, b paramb)
  {
    b.a locala = new b.a();
    locala.dIF = 1138;
    locala.uri = "/cgi-bin/mmbiz-bin/wxausrevent/getappconfig";
    locala.dIH = new ze();
    locala.dII = 0;
    locala.dIJ = 0;
    zd localzd = new zd();
    localzd.rFk = paramLinkedList;
    locala.dIG = localzd;
    v.a(locala.KT(), new m.3(paramb), true);
  }
  
  private static zc z(String paramString, int paramInt1, int paramInt2)
  {
    zc localzc = new zc();
    localzc.jQb = paramString;
    localzc.hcE = paramInt1;
    localzc.rcV = paramInt2;
    return localzc;
  }
  
  public static final class a
  {
    public static void A(String paramString, int paramInt1, int paramInt2)
    {
      if (e.abf() == null) {
        return;
      }
      e.abf().bd(as(paramString, paramInt1), String.valueOf(paramInt2));
    }
    
    public static void B(String paramString, int paramInt1, int paramInt2)
    {
      if (e.abf() == null) {
        return;
      }
      e.abf().bd(at(paramString, paramInt1), String.valueOf(paramInt2));
    }
    
    private static String as(String paramString, int paramInt)
    {
      return String.format("%s_%s_local_version", new Object[] { paramString, Integer.valueOf(paramInt) });
    }
    
    public static String at(String paramString, int paramInt)
    {
      return String.format("%s_%s_server_version", new Object[] { paramString, Integer.valueOf(paramInt) });
    }
    
    private static String au(String paramString, int paramInt)
    {
      return String.format("%s_%s_config", new Object[] { paramString, Integer.valueOf(paramInt) });
    }
    
    public static int av(String paramString, int paramInt)
    {
      if (e.abf() == null) {
        return 0;
      }
      return bi.getInt(e.abf().get(as(paramString, paramInt), "0"), 0);
    }
    
    public static String aw(String paramString, int paramInt)
    {
      if (e.abf() == null) {
        return "";
      }
      return e.abf().get(au(paramString, paramInt), "");
    }
    
    public static void h(String paramString1, int paramInt, String paramString2)
    {
      if (e.abf() == null) {
        return;
      }
      e.abf().bd(au(paramString1, paramInt), paramString2);
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(int paramInt1, int paramInt2, String paramString, b paramb);
  }
  
  public static abstract interface c
  {
    public abstract void qR(String paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */