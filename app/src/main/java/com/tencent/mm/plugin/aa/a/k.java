package com.tencent.mm.plugin.aa.a;

import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.plugin.aa.a.a.f;
import com.tencent.mm.protocal.c.i;
import com.tencent.mm.protocal.c.y;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.List;
import java.util.Map;

public final class k
  implements e
{
  public static String eAA = "totalUserNumber";
  public static String eAB = "perAmount";
  public static String eAC = "chatRoomName";
  public static String eAD = "launchScene";
  public static String eAE = "payerlist";
  public static String eAF = "timestamp";
  private static int eAG = 131100026;
  public static String eAy = "title";
  public static String eAz = "totalPayAmount";
  private com.tencent.mm.vending.g.b dIz;
  private boolean eAH = false;
  private Map<String, Object> eAI;
  private int mode = 0;
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.d("MicroMsg.LaunchAALogic", "onSceneEnd, errType: %s, errCode: %s, scene: %s, mode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paraml, Integer.valueOf(this.mode) });
    String str;
    boolean bool;
    if (paraml.getType() == 1624)
    {
      this.eAH = false;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paraml = (f)paraml;
        paramString = paraml.eAR;
        paramInt1 = paramString.hUm;
        str = paramString.hUn;
        if (paramString.qYe == null)
        {
          bool = true;
          x.i("MicroMsg.LaunchAALogic", "launchAAByMoney, onSceneEnd, retCode: %s, retmsg: %s, msgXml==null: %s, billNo: %s", new Object[] { Integer.valueOf(paramInt1), str, Boolean.valueOf(bool), paramString.qYc });
          if (paramString.hUm != 0) {
            break label241;
          }
          if (paramString.qYe == null) {
            break label211;
          }
          h.v(paramString.qYc, paraml.chatroomName, paramString.qYe);
          com.tencent.mm.vending.g.g.a(this.dIz, new Object[] { Boolean.valueOf(true) });
          h.pc(paraml.chatroomName);
          com.tencent.mm.plugin.report.service.h.mEJ.a(407L, 0L, 1L, false);
        }
      }
    }
    label211:
    label241:
    label300:
    label342:
    while (paraml.getType() != 1655)
    {
      for (;;)
      {
        return;
        bool = false;
        continue;
        h.a(paramString.qYc, false, 0L);
        com.tencent.mm.vending.g.g.a(this.dIz, new Object[] { Boolean.valueOf(true) });
      }
      if (this.dIz != null)
      {
        if (paramString.hUm <= 0) {
          break label342;
        }
        paraml = paramString.qYk;
        if ((paraml == null) || (paraml.qYW <= 0)) {
          break label300;
        }
        this.dIz.ct(paraml);
      }
      for (;;)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.a(407L, 2L, 1L, false);
        return;
        if (!bi.oW(paramString.hUn))
        {
          this.dIz.ct(paramString.hUn);
        }
        else
        {
          this.dIz.ct(Boolean.valueOf(false));
          continue;
          this.dIz.ct(Boolean.valueOf(false));
        }
      }
      if (this.dIz != null) {
        this.dIz.ct(Boolean.valueOf(false));
      }
      com.tencent.mm.plugin.report.service.h.mEJ.a(407L, 1L, 1L, false);
      return;
    }
    this.eAH = false;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paraml = (com.tencent.mm.plugin.aa.a.a.g)paraml;
      paramString = paraml.eAT;
      paramInt1 = paramString.hUm;
      str = paramString.hUn;
      if (paramString.qYe == null)
      {
        bool = true;
        x.i("MicroMsg.LaunchAALogic", "launchAAByPerson, onSceneEnd, retCode: %s, retmsg: %s, msgxml==null: %s", new Object[] { Integer.valueOf(paramInt1), str, Boolean.valueOf(bool) });
        x.d("MicroMsg.LaunchAALogic", "launchAAByPerson, onSceneEnd, retMsg: %s, billNo: %s", new Object[] { paramString.hUn, paramString.qYc });
        if (paramString.hUm != 0) {
          break label626;
        }
        if (paramString.qYe == null) {
          break label589;
        }
        h.v(paramString.qYc, paraml.chatroomName, paramString.qYe);
        com.tencent.mm.vending.g.g.a(this.dIz, new Object[] { Boolean.valueOf(true), paramString.qYc });
      }
      for (;;)
      {
        h.pc(paraml.chatroomName);
        com.tencent.mm.plugin.report.service.h.mEJ.a(407L, 3L, 1L, false);
        return;
        bool = false;
        break;
        label589:
        h.a(paramString.qYc, false, 0L);
        com.tencent.mm.vending.g.g.a(this.dIz, new Object[] { Boolean.valueOf(true), paramString.qYc });
      }
      label626:
      if (paramString.hUm > 0)
      {
        paraml = paramString.qYk;
        if ((paraml != null) && (paraml.qYW > 0)) {
          this.dIz.ct(paraml);
        }
      }
      for (;;)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.a(407L, 5L, 1L, false);
        return;
        if (!bi.oW(paramString.hUn))
        {
          this.dIz.ct(paramString.hUn);
        }
        else
        {
          this.dIz.ct(Boolean.valueOf(false));
          continue;
          this.dIz.ct(Boolean.valueOf(false));
        }
      }
    }
    if (this.dIz != null) {
      this.dIz.ct(Boolean.valueOf(false));
    }
    com.tencent.mm.plugin.report.service.h.mEJ.a(407L, 4L, 1L, false);
  }
  
  public final boolean c(int paramInt, Map<String, Object> paramMap)
  {
    this.dIz = com.tencent.mm.vending.g.g.cBF();
    if (this.eAH)
    {
      x.e("MicroMsg.LaunchAALogic", "launchAA, isLaunching!!! ignore it");
      this.dIz.ct(Boolean.valueOf(false));
      return false;
    }
    if ((paramMap == null) || (paramMap.size() == 0))
    {
      this.dIz.ct(Boolean.valueOf(false));
      return false;
    }
    x.i("MicroMsg.LaunchAALogic", "launchAAByMoney, data.keySet: %s", new Object[] { paramMap.keySet() });
    this.eAH = true;
    this.eAI = paramMap;
    this.mode = paramInt;
    long l1;
    Object localObject;
    long l2;
    if (paramInt == a.ezC)
    {
      if ((this.eAI.containsKey(eAy)) && (this.eAI.containsKey(eAB)) && (this.eAI.containsKey(eAA)) && (this.eAI.containsKey(eAD)) && (this.eAI.containsKey(eAC)) && (this.eAI.containsKey(eAF))) {
        try
        {
          paramMap = (String)this.eAI.get(eAy);
          l1 = ((Long)this.eAI.get(eAB)).longValue();
          paramInt = ((Integer)this.eAI.get(eAA)).intValue();
          int i = ((Integer)this.eAI.get(eAD)).intValue();
          localObject = (String)this.eAI.get(eAC);
          l2 = ((Long)this.eAI.get(eAF)).longValue();
          x.i("MicroMsg.LaunchAALogic", "launchAAByMoney");
          com.tencent.mm.kernel.g.Ek();
          com.tencent.mm.kernel.g.Eh().dpP.a(new f(l1, paramMap, paramInt, i, l2, (String)localObject), 0);
          if ((paramInt > 0) && (paramInt <= 10)) {
            paramInt = 13;
          }
          for (;;)
          {
            com.tencent.mm.plugin.report.service.h.mEJ.a(407L, paramInt, 1L, false);
            this.dIz.cBE();
            return true;
            if ((paramInt > 10) && (paramInt <= 20)) {
              paramInt = 14;
            } else if ((paramInt > 20) && (paramInt <= 50)) {
              paramInt = 15;
            } else {
              paramInt = 16;
            }
          }
          this.dIz.ct(Boolean.valueOf(false));
        }
        catch (Exception paramMap)
        {
          x.e("MicroMsg.LaunchAALogic", "launchAAByMoney, without specific user error: %s", new Object[] { paramMap.getMessage() });
          this.dIz.ct(Boolean.valueOf(false));
          this.eAH = false;
          return false;
        }
      }
      this.eAH = false;
      return false;
    }
    if (paramInt == a.ezD)
    {
      if ((this.eAI.containsKey(eAy)) && (this.eAI.containsKey(eAB)) && (this.eAI.containsKey(eAE)) && (this.eAI.containsKey(eAD)) && (this.eAI.containsKey(eAC)) && (this.eAI.containsKey(eAF))) {
        try
        {
          paramMap = (String)this.eAI.get(eAy);
          l1 = ((Long)this.eAI.get(eAB)).longValue();
          localObject = (List)this.eAI.get(eAE);
          paramInt = ((Integer)this.eAI.get(eAD)).intValue();
          String str = (String)this.eAI.get(eAC);
          l2 = ((Long)this.eAI.get(eAF)).longValue();
          com.tencent.mm.kernel.g.Ek();
          com.tencent.mm.kernel.g.Eh().dpP.a(new f(l1, paramMap, (List)localObject, paramInt, l2, str), 0);
          paramInt = ((List)localObject).size();
          if ((paramInt > 0) && (paramInt <= 10)) {
            paramInt = 13;
          }
          for (;;)
          {
            com.tencent.mm.plugin.report.service.h.mEJ.a(407L, paramInt, 1L, false);
            this.dIz.cBE();
            return true;
            if ((paramInt > 10) && (paramInt <= 20)) {
              paramInt = 14;
            } else if ((paramInt > 20) && (paramInt <= 50)) {
              paramInt = 15;
            } else {
              paramInt = 16;
            }
          }
          this.dIz.ct(Boolean.valueOf(false));
        }
        catch (Exception paramMap)
        {
          x.e("MicroMsg.LaunchAALogic", "launchAAByMoney, specific user error: %", new Object[] { paramMap.getMessage() });
          this.dIz.ct(Boolean.valueOf(false));
          this.eAH = false;
          return false;
        }
      }
      this.eAH = false;
      return false;
    }
    return false;
  }
  
  public final boolean t(Map<String, Object> paramMap)
  {
    this.dIz = com.tencent.mm.vending.g.g.cBF();
    x.i("MicroMsg.LaunchAALogic", "launchAAByPerson");
    if (this.eAH)
    {
      x.e("MicroMsg.LaunchAALogic", "launchAA, isLaunching!!! ignore it");
      this.dIz.ct(Boolean.valueOf(false));
      return false;
    }
    if ((paramMap == null) || (paramMap.size() == 0))
    {
      this.dIz.ct(Boolean.valueOf(false));
      return false;
    }
    this.eAH = true;
    this.eAI = paramMap;
    this.mode = a.ezE;
    if (this.mode != a.ezE)
    {
      this.dIz.ct(Boolean.valueOf(false));
      return false;
    }
    if ((this.eAI.containsKey(eAy)) && (this.eAI.containsKey(eAz)) && (this.eAI.containsKey(eAE)) && (this.eAI.containsKey(eAD)) && (this.eAI.containsKey(eAC)) && (this.eAI.containsKey(eAF))) {
      try
      {
        paramMap = (String)this.eAI.get(eAy);
        long l1 = ((Long)this.eAI.get(eAz)).longValue();
        List localList = (List)this.eAI.get(eAE);
        int i = ((Integer)this.eAI.get(eAD)).intValue();
        String str = (String)this.eAI.get(eAC);
        long l2 = ((Long)this.eAI.get(eAF)).longValue();
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.kernel.g.Eh().dpP.a(new com.tencent.mm.plugin.aa.a.a.g(paramMap, l1, localList, i, str, l2), 0);
        i = localList.size();
        if ((i > 0) && (i <= 10)) {
          i = 17;
        }
        for (;;)
        {
          com.tencent.mm.plugin.report.service.h.mEJ.a(407L, i, 1L, false);
          this.dIz.cBE();
          return true;
          if ((i > 10) && (i <= 20)) {
            i = 18;
          } else if ((i > 20) && (i <= 50)) {
            i = 19;
          } else {
            i = 20;
          }
        }
        this.dIz.ct(Boolean.valueOf(false));
      }
      catch (Exception paramMap)
      {
        x.e("MicroMsg.LaunchAALogic", "launchAAByPerson error: %s", new Object[] { paramMap.getMessage() });
      }
    }
    this.eAH = false;
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/aa/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */