package com.tencent.mm.modelcdntran;

import android.net.wifi.WifiInfo;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.mars.cdn.CdnLogic.CdnInfoParams;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.a;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.abb;
import com.tencent.mm.protocal.c.abc;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.kf;
import com.tencent.mm.protocal.c.kg;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class e
  extends l
  implements k
{
  public static long dPt = 0L;
  private static Map<String, a> dPu = new HashMap();
  private String dPv = "";
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  int scene = 0;
  public long startTime = 0L;
  
  protected e(int paramInt)
  {
    x.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn init Scene:%d  [%s]", new Object[] { Integer.valueOf(paramInt), bi.cjd() });
    b.a locala = new b.a();
    locala.dIG = new abb();
    locala.dIH = new abc();
    locala.uri = "/cgi-bin/micromsg-bin/getcdndns";
    locala.dIF = 379;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    this.scene = paramInt;
    ((abb)this.diG.dID.dIL).rGh = "";
  }
  
  private static String Nz()
  {
    if (!ao.isConnected(ad.getContext())) {
      return null;
    }
    if (ao.isWifi(ad.getContext()))
    {
      localObject = ao.getWifiInfo(ad.getContext());
      if (localObject == null) {
        return null;
      }
    }
    for (Object localObject = "wifi_" + ((WifiInfo)localObject).getSSID();; localObject = "mobile_" + ao.getNetTypeString(ad.getContext()) + "_" + ao.getISPCode(ad.getContext()))
    {
      x.d("MicroMsg.NetSceneGetCDNDns", "cdntra getCurCacheFullPath file:%s", new Object[] { localObject });
      if ((localObject != null) && (((String)localObject).length() >= 2)) {
        break;
      }
      return null;
    }
    localObject = String.format("%x", new Object[] { Integer.valueOf(((String)localObject).hashCode()) });
    StringBuilder localStringBuilder = new StringBuilder();
    g.NA();
    return g.NB() + (String)localObject;
  }
  
  private static CdnLogic.CdnInfoParams a(kf paramkf)
  {
    CdnLogic.CdnInfoParams localCdnInfoParams = new CdnLogic.CdnInfoParams();
    localCdnInfoParams.c2CretryIntervalMs = paramkf.rlT;
    localCdnInfoParams.c2CrwtimeoutMs = paramkf.rlV;
    localCdnInfoParams.c2CshowErrorDelayMs = paramkf.rlR;
    localCdnInfoParams.snsretryIntervalMs = paramkf.rlU;
    localCdnInfoParams.snsrwtimeoutMs = paramkf.rlW;
    localCdnInfoParams.snsshowErrorDelayMs = paramkf.rlS;
    return localCdnInfoParams;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    com.tencent.mm.kernel.g.Eg();
    int i = a.Df();
    if (i == 0)
    {
      x.e("MicroMsg.NetSceneGetCDNDns", "has not set uin.");
      return -1;
    }
    if (dPt != i)
    {
      dPt = i;
      dPu.clear();
    }
    long l = bi.VE();
    a locala;
    if (this.scene == 0)
    {
      this.dPv = bi.aG(Nz(), "");
      locala = (a)dPu.get(this.dPv);
      parame1 = locala;
      if (locala == null)
      {
        parame1 = new a();
        dPu.put(this.dPv, parame1);
        x.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn doScene NEW lastGetResult[%s] path[%s]", new Object[] { parame1, this.dPv });
      }
      if (parame1.dPw)
      {
        parame1.dPx = l;
        parame1.dPy = l;
        parame1.dPz = 0L;
      }
      x.d("MicroMsg.NetSceneGetCDNDns", "cdntra doscene Sec:%d Hour[%d,%d]", new Object[] { Long.valueOf(l - parame1.dPx), Long.valueOf(l - parame1.dPy), Long.valueOf(parame1.dPz) });
      if ((l > parame1.dPx) && (l - parame1.dPx < 10L))
      {
        x.w("MicroMsg.NetSceneGetCDNDns", "Last get dns at %d ago . ignore!, lastGetResult[%s]", new Object[] { Long.valueOf(l - parame1.dPx), parame1 });
        return -1;
      }
      if ((l > parame1.dPy) && (l - parame1.dPy < 3600L) && (parame1.dPz >= 90L))
      {
        x.w("MicroMsg.NetSceneGetCDNDns", "in 1 hour , get dns more than 90  (%d). ignore!, lastGetResult[%s]", new Object[] { Long.valueOf(l - parame1.dPy), parame1 });
        return -1;
      }
      parame1.dPx = l;
      if ((l < parame1.dPy) || (l - parame1.dPz > 3600L))
      {
        parame1.dPy = l;
        parame1.dPz = 0L;
        this.startTime = l;
        parame1 = h.mEJ;
        if (this.scene != 0) {
          break label545;
        }
      }
    }
    label545:
    for (l = 0L;; l = 1L)
    {
      parame1.a(546L, l, 1L, true);
      return a(parame, this.diG, this);
      parame1.dPz += 1L;
      break;
      this.dPv = "";
      parame1 = dPu.values().iterator();
      if (parame1 == null) {
        break;
      }
      while (parame1.hasNext())
      {
        locala = (a)parame1.next();
        if (locala != null)
        {
          locala.dPx = l;
          if ((l < locala.dPy) || (l - locala.dPz > 3600L))
          {
            locala.dPy = l;
            locala.dPz = 0L;
          }
          else
          {
            locala.dPz += 1L;
          }
        }
      }
      break;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneGetCDNDns", "summersafecdn onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3);
    abc localabc = (abc)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    if ((paramInt2 != 0) || (paramInt3 != 0) || (localabc.roC == null))
    {
      h.mEJ.h(10769, new Object[] { Integer.valueOf(d.dPs), Integer.valueOf(0), Long.valueOf(this.startTime) });
      if (localabc.roC == null) {}
      for (boolean bool = true;; bool = false)
      {
        x.w("MicroMsg.NetSceneGetCDNDns", "onGYNetEnd: [%d ,%d]  info is null :%b", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Boolean.valueOf(bool) });
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
      }
    }
    paramq = Nz();
    if ((!bi.oW(paramq)) && (!bi.oW(this.dPv)) && (!paramq.equals(this.dPv)))
    {
      x.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn onGYNetEnd revised cacheFullPath[%s] to [%s]", new Object[] { paramq, this.dPv });
      h.mEJ.a(546L, 6L, 1L, true);
    }
    dPu.clear();
    paramArrayOfByte = null;
    paramq = paramArrayOfByte;
    if (localabc.roF != null)
    {
      paramq = paramArrayOfByte;
      if (localabc.roF.siI > 0)
      {
        x.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn onGYNetEnd cdnrule:%d", new Object[] { Integer.valueOf(localabc.roF.siI) });
        paramq = ab.a(localabc.roF);
      }
    }
    Object localObject = null;
    paramArrayOfByte = (byte[])localObject;
    if (localabc.roG != null)
    {
      paramArrayOfByte = (byte[])localObject;
      if (localabc.roG.siI > 0)
      {
        x.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn onGYNetEnd safecdnrule:%d", new Object[] { Integer.valueOf(localabc.roG.siI) });
        paramArrayOfByte = ab.a(localabc.roG);
      }
    }
    x.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn onGYNetEnd FakeDnsInfo:%s", new Object[] { localabc.roH });
    if (localabc.roH != null) {
      x.i("MicroMsg.NetSceneGetCDNDns", "summersafecdn onGYNetEnd FakeDnsInfo FakeUin:%d NewAuthKey:%s", new Object[] { Integer.valueOf(localabc.roH.iwE), localabc.roH.rmd });
    }
    if (!g.NE().a(localabc.roC, localabc.roD, localabc.roE, paramq, paramArrayOfByte, localabc.roH))
    {
      x.e("MicroMsg.NetSceneGetCDNDns", "onGYNetEnd setCDNDnsInfo failed ");
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    x.i("MicroMsg.NetSceneGetCDNDns", "getcdndns defaultcfg %s, disastercfg %s, getcdninterval %d", new Object[] { localabc.roJ, localabc.roK, Integer.valueOf(localabc.roI) });
    if ((localabc.roJ != null) && (localabc.roK != null)) {
      CdnLogic.setCdnInfoParams(a(localabc.roJ), a(localabc.roK), localabc.roI);
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 379;
  }
  
  static final class a
  {
    boolean dPw = false;
    long dPx = 0L;
    long dPy = 0L;
    long dPz = 0L;
    
    public final String toString()
    {
      return String.format("LastGetResult(%x){isTimeOut=%b, lastGetCDNDns_TenSecond=%d, lastTime_Hour=%d, lastCount_Hour=%d}", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(this.dPw), Long.valueOf(this.dPx), Long.valueOf(this.dPy), Long.valueOf(this.dPz) });
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/modelcdntran/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */