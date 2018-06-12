package com.tencent.mars.smc;

import com.tencent.mm.protocal.a.a.a;
import com.tencent.mm.protocal.a.a.c;
import com.tencent.mm.protocal.a.a.d;
import com.tencent.mm.protocal.a.a.e;
import com.tencent.mm.protocal.a.a.f;
import com.tencent.mm.protocal.a.a.g;
import com.tencent.mm.protocal.a.a.h;
import com.tencent.mm.protocal.a.a.i;
import com.tencent.mm.protocal.a.a.j;
import com.tencent.mm.protocal.a.a.k;
import com.tencent.mm.protocal.a.a.l;
import com.tencent.mm.protocal.a.a.m;
import com.tencent.mm.protocal.a.a.n;
import com.tencent.mm.protocal.a.a.o;
import com.tencent.mm.protocal.c.ace;
import com.tencent.mm.protocal.c.acf;
import com.tencent.mm.protocal.c.ank;
import com.tencent.mm.protocal.c.anl;
import com.tencent.mm.protocal.c.apv;
import com.tencent.mm.protocal.c.awc;
import com.tencent.mm.protocal.c.brg;
import com.tencent.mm.protocal.c.pa;
import com.tencent.mm.protocal.c.pb;
import com.tencent.mm.protocal.c.pc;
import java.util.ArrayList;
import java.util.LinkedList;

public class SmcProtoBufUtil
{
  private static o fillStrategyTable(LinkedList<brg> paramLinkedList)
  {
    o localo = new o();
    int i = 0;
    while (i < paramLinkedList.size())
    {
      brg localbrg = (brg)paramLinkedList.get(i);
      m localm = new m();
      localm.qXM = localbrg.spu;
      localm.qXN = localbrg.spv;
      int j = 0;
      while (j < localbrg.spw.size())
      {
        awc localawc = (awc)localbrg.spw.get(j);
        n localn = new n();
        localn.qXg = localawc.rSt;
        localn.qXP = localawc.rZr;
        localn.qXQ = localawc.rZp;
        localn.qXR = localawc.rZq;
        localn.qXS = localawc.rZs;
        localn.qXT = localawc.rZt;
        localn.qXU = localawc.rZu;
        localm.qXO.add(localn);
        j += 1;
      }
      localo.qXV.add(localm);
      i += 1;
    }
    return localo;
  }
  
  public static ace toMMGetStrategyReq()
  {
    ace localace = new ace();
    ArrayList localArrayList = SmcLogic.getStrategyVersions();
    if (localArrayList.size() != 6) {
      return null;
    }
    localace.rti = ((Integer)localArrayList.get(0)).intValue();
    localace.rtj = ((Integer)localArrayList.get(1)).intValue();
    localace.rtk = ((Integer)localArrayList.get(2)).intValue();
    localace.rGN = ((Integer)localArrayList.get(3)).intValue();
    localace.rGO = ((Integer)localArrayList.get(4)).intValue();
    localace.rGP = ((Integer)localArrayList.get(5)).intValue();
    return localace;
  }
  
  public static pb toMMReportIdkeyReq(g paramg)
  {
    pb localpb = new pb();
    localpb.rti = paramg.qXj;
    localpb.rtj = paramg.qXz;
    localpb.rtk = 0;
    int i = 0;
    while (i < paramg.qXA.size())
    {
      com.tencent.mm.protocal.a.a.b localb = (com.tencent.mm.protocal.a.a.b)paramg.qXA.get(i);
      pa localpa = new pa();
      localpa.iwE = localb.uin;
      localpa.rgt = localb.qXh;
      localpa.rth = localb.nettype;
      int j = 0;
      while (j < localb.qXi.size())
      {
        a locala = (a)localb.qXi.get(j);
        apv localapv = new apv();
        localapv.rSt = locala.qXg;
        localapv.rvJ = 0;
        localapv.rSv = 0;
        localapv.hbF = locala.count;
        localapv.rSu = com.tencent.mm.bk.b.bi(Integer.toString(locala.value).getBytes());
        localpa.jQF.add(localapv);
        j += 1;
      }
      localpb.rtl.add(localpa);
      i += 1;
    }
    return localpb;
  }
  
  public static pb toMMReportKvReq(i parami)
  {
    pb localpb = new pb();
    localpb.rti = parami.qXj;
    localpb.rtj = parami.qXz;
    localpb.rtk = parami.qXx;
    int i = 0;
    while (i < parami.qXA.size())
    {
      e locale = (e)parami.qXA.get(i);
      pa localpa = new pa();
      localpa.iwE = locale.uin;
      localpa.rgt = locale.qXh;
      localpa.rth = locale.nettype;
      localpa.rjN = locale.qXt;
      localpa.rjL = locale.qXr;
      localpa.rjM = locale.qXs;
      localpa.rjO = locale.qXu;
      localpa.rjP = locale.qXv;
      localpa.hcJ = locale.qXw;
      int j = 0;
      while (j < locale.qXi.size())
      {
        d locald = (d)locale.qXi.get(j);
        apv localapv = new apv();
        localapv.rSt = locald.qXg;
        localapv.rSu = locald.qXp;
        localapv.rSv = locald.qXq;
        localapv.rvJ = locald.mXw;
        localapv.hbF = locald.count;
        localpa.jQF.add(localapv);
        j += 1;
      }
      localpb.rtl.add(localpa);
      i += 1;
    }
    return localpb;
  }
  
  public static ank toMMSelfMonitor(k paramk)
  {
    ank localank = new ank();
    localank.rPZ = paramk.qXD;
    int i = 0;
    while (i < paramk.qXE.size())
    {
      anl localanl = new anl();
      l locall = (l)paramk.qXE.get(i);
      localanl.rQa = locall.qXF;
      localanl.bHC = locall.action;
      localanl.rQb = locall.qXG;
      localanl.rQc = locall.qXH;
      localanl.rQd = locall.qXI;
      localanl.rQe = locall.qXJ;
      localanl.rQf = locall.qXK;
      localanl.rQg = locall.qXL;
      localank.jQF.add(localanl);
      i += 1;
    }
    return localank;
  }
  
  public static c toSmcIdkeyStrategyResp(acf paramacf)
  {
    c localc = new c();
    localc.ret = paramacf.rfn;
    localc.qXj = paramacf.rto;
    localc.qXk = paramacf.rtp;
    localc.qXn = paramacf.rtu;
    localc.qXo = paramacf.rtw;
    localc.qXl = fillStrategyTable(paramacf.rtr);
    localc.qXm = fillStrategyTable(paramacf.rts);
    return localc;
  }
  
  public static f toSmcKVStrategyResp(acf paramacf)
  {
    f localf = new f();
    localf.ret = paramacf.rfn;
    localf.qXj = paramacf.rGN;
    localf.qXk = paramacf.rGO;
    localf.qXx = paramacf.rGP;
    localf.qXn = paramacf.rtu;
    localf.qXo = paramacf.rtw;
    localf.qXl = fillStrategyTable(paramacf.rGQ);
    localf.qXm = fillStrategyTable(paramacf.rGR);
    localf.qXy = fillStrategyTable(paramacf.rGS);
    return localf;
  }
  
  public static h toSmcReportIdkeyResp(pc parampc)
  {
    h localh = new h();
    localh.ret = parampc.rfn;
    localh.qXj = parampc.rto;
    localh.qXk = parampc.rtp;
    localh.qXn = parampc.rtu;
    localh.qXC = parampc.rtv;
    localh.qXo = parampc.rtw;
    localh.qXl = fillStrategyTable(parampc.rtr);
    localh.qXm = fillStrategyTable(parampc.rts);
    return localh;
  }
  
  public static j toSmcReportKvResp(pc parampc)
  {
    j localj = new j();
    localj.ret = parampc.rfn;
    localj.qXj = parampc.rto;
    localj.qXk = parampc.rtp;
    localj.qXx = parampc.rtq;
    localj.qXn = parampc.rtu;
    localj.qXC = parampc.rtv;
    localj.qXo = parampc.rtw;
    localj.qXl = fillStrategyTable(parampc.rtr);
    localj.qXm = fillStrategyTable(parampc.rts);
    localj.qXy = fillStrategyTable(parampc.rtt);
    return localj;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mars/smc/SmcProtoBufUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */