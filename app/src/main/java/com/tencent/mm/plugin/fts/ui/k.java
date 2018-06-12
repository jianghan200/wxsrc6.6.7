package com.tencent.mm.plugin.fts.ui;

import com.tencent.mars.smc.IDKey;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.e;
import com.tencent.mm.plugin.fts.ui.c.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;

public final class k
{
  public static void a(com.tencent.mm.plugin.fts.a.d.a.a parama, com.tencent.mm.plugin.fts.ui.c.a parama1)
  {
    int j = parama.jtl;
    String str3 = parama.jtn;
    long l2 = parama.jto;
    int k = i(parama.jtq, parama.jtr, parama.aQi());
    int i;
    switch (parama.hER)
    {
    case 10: 
    case 11: 
    case 12: 
    case 15: 
    case 18: 
    case 19: 
    default: 
      return;
    case 1: 
      i = 3;
    }
    for (;;)
    {
      long l1 = System.currentTimeMillis() - parama1.jyY;
      if ((l1 < 0L) || (parama1.jyY == 0L)) {
        l1 = 0L;
      }
      parama = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[] { Integer.valueOf(parama.jsZ), Integer.valueOf(i), Integer.valueOf(j), bi.aG(str3, ""), Long.valueOf(l2), Integer.valueOf(k), Integer.valueOf(parama.afF()), Integer.valueOf(ql(parama.aQh())), parama.afE(), Long.valueOf(l1), Integer.valueOf(parama1.jyZ) });
      x.d("MicroMsg.FTS.FTSReportLogic", "report detail page click: %s", new Object[] { parama });
      h.mEJ.k(11310, parama);
      return;
      i = 4;
      continue;
      i = 5;
      continue;
      i = 10;
      continue;
      i = 11;
      continue;
      i = 12;
      continue;
      i = 13;
      continue;
      i = 14;
      continue;
      i = 16;
      continue;
      i = 15;
      continue;
      i = 17;
      continue;
      i = 20;
      continue;
      d locald = new d();
      String str2 = parama.jrx.jrV;
      String str1 = str2;
      if (str2 != null) {
        str1 = str2.replaceAll(",", " ");
      }
      locald.r("20KeyWordId", str1 + ",");
      locald.r("21ViewType", "2,");
      locald.r("22OpType", "2,");
      locald.r("23ResultCount", ",");
      locald.r("24ClickPos", parama.jtm + ",");
      locald.r("25ClickAppUserName", parama.info + ",");
      x.i("MicroMsg.FTS.FTSReportLogic", "report oreh LocalSearchWeApp(13963), %s", new Object[] { locald.wF() });
      h.mEJ.h(13963, new Object[] { locald });
      i = 19;
      continue;
      i = 21;
    }
  }
  
  public static void a(com.tencent.mm.plugin.fts.a.d.a.a parama, b paramb)
  {
    int j = 1;
    int m = parama.jtl;
    int n = parama.jtm;
    String str4 = parama.jtn;
    long l2 = parama.jto;
    String str1 = parama.afE();
    int i1 = i(parama.jtq, parama.jtr, parama.aQi());
    int i;
    if (parama.jtk == -8)
    {
      int k = 2;
      i = 0;
      switch (parama.hER)
      {
      default: 
        str1 = i + "$" + str1;
        i = k;
      }
    }
    for (;;)
    {
      long l1 = System.currentTimeMillis() - paramb.jyY;
      if ((l1 < 0L) || (paramb.jyY == 0L)) {
        l1 = 0L;
      }
      parama = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[] { Integer.valueOf(parama.jsZ), Integer.valueOf(i), Integer.valueOf(m), Integer.valueOf(j), Integer.valueOf(n), bi.aG(str4, ""), Long.valueOf(l2), Integer.valueOf(i1), Integer.valueOf(0), Integer.valueOf(parama.afF()), Integer.valueOf(ql(parama.aQh())), str1, Long.valueOf(l1), Integer.valueOf(paramb.jzb), Integer.valueOf(paramb.jzc), Integer.valueOf(paramb.jzd), Integer.valueOf(paramb.jze), Integer.valueOf(paramb.jzf), Integer.valueOf(paramb.jzg), Integer.valueOf(paramb.jzh), Integer.valueOf(paramb.jzj), Integer.valueOf(paramb.jzk), e.jqM, parama.jrx.jrV, Integer.valueOf(paramb.jzi), Integer.valueOf(paramb.jzl) });
      x.v("MicroMsg.FTS.FTSReportLogic", "report home page click: %d, %s", new Object[] { Integer.valueOf(10991), parama });
      x.i("MicroMsg.FTS.FTSReportLogic", "lxl, click blockpos:" + paramb.jzl);
      h.mEJ.k(10991, parama);
      do
      {
        return;
        i = 3;
        break;
        i = 4;
        break;
        i = 5;
        break;
        i = 10;
        break;
        switch (parama.hER)
        {
        case 11: 
        case 15: 
        case 18: 
        default: 
          return;
        case 1: 
          i = 3;
          break;
        case 2: 
          i = 4;
          break;
        case 4: 
          i = 5;
          break;
        case 3: 
          i = 10;
          break;
        case 6: 
          i = 11;
          break;
        case 14: 
          i = 15;
          break;
        case 5: 
          i = 16;
          break;
        case 13: 
          i = 17;
          break;
        case 7: 
          i = 12;
          break;
        case 8: 
          i = 13;
          break;
        case 9: 
          i = 14;
          break;
        case 17: 
          i = 20;
          break;
        case 12: 
          j = 2;
          if (parama.jtk == -5)
          {
            i = 16;
            break;
          }
          if (parama.jtk == -3)
          {
            i = 4;
            break;
          }
          if (parama.jtk == -4)
          {
            i = 3;
            break;
          }
          if (parama.jtk == -1)
          {
            i = 12;
            break;
          }
          if (parama.jtk == -2)
          {
            i = 11;
            break;
          }
          if (parama.jtk == -15)
          {
            i = 21;
            break;
          }
          if (parama.jtk == -6)
          {
            i = 10;
            break;
          }
          if (parama.jtk == -13)
          {
            i = 19;
            break;
          }
          break;
        }
      } while (parama.jtk != -7);
      i = 5;
      continue;
      if (parama.jtp)
      {
        i = 8;
      }
      else
      {
        i = 9;
        continue;
        i = 19;
        d locald = new d();
        String str3 = parama.jrx.jrV;
        String str2 = str3;
        if (str3 != null) {
          str2 = str3.replaceAll(",", " ");
        }
        locald.r("20KeyWordId", str2 + ",");
        locald.r("21ViewType", "1,");
        locald.r("22OpType", "2,");
        locald.r("23ResultCount", ",");
        locald.r("24ClickPos", parama.jtm + ",");
        locald.r("25ClickAppUserName", parama.info + ",");
        x.i("MicroMsg.FTS.FTSReportLogic", "report oreh LocalSearchWeApp(13963), %s", new Object[] { locald.wF() });
        h.mEJ.h(13963, new Object[] { locald });
        continue;
        i = 21;
        continue;
        i = 22;
      }
    }
  }
  
  public static void a(String paramString, boolean paramBoolean, int paramInt1, int paramInt2, b paramb)
  {
    switch (paramInt2)
    {
    case -14: 
    case -13: 
    case -12: 
    case -11: 
    case -10: 
    case -9: 
    case -8: 
    case -7: 
    case -6: 
    default: 
      paramInt2 = 0;
      if (paramBoolean) {
        paramString = String.format("%s,%s,%s,%s,%s,%s,%s,%s", new Object[] { paramString, Integer.valueOf(3), Integer.valueOf(paramInt2), Integer.valueOf(paramb.jza), Integer.valueOf(paramb.jzd), Integer.valueOf(paramb.jzk), Integer.valueOf(paramb.jzh), Integer.valueOf(paramb.jzi) });
      }
      break;
    }
    for (;;)
    {
      x.i("MicroMsg.FTS.FTSReportLogic", "reportKvQuery %d %s", new Object[] { Integer.valueOf(11062), paramString });
      h.mEJ.k(11062, paramString);
      return;
      paramInt2 = 2;
      break;
      paramInt2 = 1;
      break;
      if (paramInt1 > 0) {
        paramString = String.format("%s,%s,%s,%s,%s,%s,%s,%s", new Object[] { paramString, Integer.valueOf(2), Integer.valueOf(paramInt2), Integer.valueOf(paramb.jza), Integer.valueOf(paramb.jzd), Integer.valueOf(paramb.jzk), Integer.valueOf(paramb.jzh), Integer.valueOf(paramb.jzi) });
      } else {
        paramString = String.format("%s,%s,%s,%s,%s,%s,%s,%s", new Object[] { paramString, Integer.valueOf(1), Integer.valueOf(paramInt2), Integer.valueOf(paramb.jza), Integer.valueOf(paramb.jzd), Integer.valueOf(paramb.jzk), Integer.valueOf(paramb.jzh), Integer.valueOf(paramb.jzi) });
      }
    }
  }
  
  public static void c(String paramString, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    a(paramString, paramBoolean, paramInt1, paramInt2, new b());
  }
  
  public static final void fh(boolean paramBoolean)
  {
    int j = 1;
    h localh;
    if (paramBoolean)
    {
      i = 1;
      x.v("MicroMsg.FTS.FTSReportLogic", "reportFTSCreateChatroom: %d %d", new Object[] { Integer.valueOf(13970), Integer.valueOf(i) });
      localh = h.mEJ;
      if (!paramBoolean) {
        break label70;
      }
    }
    label70:
    for (int i = j;; i = 0)
    {
      localh.h(13970, new Object[] { Integer.valueOf(i) });
      return;
      i = 0;
      break;
    }
  }
  
  private static int i(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = 0;
    if (paramBoolean) {
      paramInt2 = 15;
    }
    do
    {
      return paramInt2;
      if (paramInt1 == 131072)
      {
        switch (paramInt2)
        {
        case 8: 
        case 9: 
        case 10: 
        case 12: 
        case 13: 
        case 14: 
        default: 
          return 0;
        case 1: 
          return 1;
        case 2: 
          return 2;
        case 3: 
          return 3;
        case 4: 
          return 4;
        case 5: 
          return 5;
        case 6: 
          return 6;
        case 7: 
          return 7;
        case 11: 
          return 8;
        case 16: 
          return 10;
        case 17: 
        case 18: 
          return 9;
        }
        return 16;
      }
      if (paramInt1 == 131075)
      {
        switch (paramInt2)
        {
        default: 
          return 0;
        case 1: 
        case 5: 
          return 12;
        case 2: 
        case 6: 
          return 13;
        case 3: 
        case 7: 
          return 14;
        }
        return 11;
      }
      if (paramInt1 == 131081) {
        return 19;
      }
      paramInt2 = i;
    } while (paramInt1 != 65536);
    return 17;
  }
  
  private static int ql(int paramInt)
  {
    int i = 6;
    switch (paramInt)
    {
    case 33: 
    default: 
      i = 0;
    case 35: 
    case 36: 
      return i;
    case 37: 
      return 16;
    case 32: 
      return 4;
    case 34: 
      return 5;
    case 29: 
      return 1;
    case 30: 
      return 2;
    }
    return 3;
  }
  
  public static void w(int paramInt, long paramLong)
  {
    x.v("MicroMsg.FTS.FTSReportLogic", "reportIDKey: type=%d time=%d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong) });
    switch (paramInt)
    {
    default: 
      return;
    }
    IDKey localIDKey1 = new IDKey();
    localIDKey1.SetID(79);
    localIDKey1.SetKey(paramInt + 1);
    localIDKey1.SetValue((int)paramLong);
    IDKey localIDKey2 = new IDKey();
    localIDKey2.SetID(79);
    localIDKey2.SetKey(paramInt + 2);
    localIDKey2.SetValue(1L);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(localIDKey1);
    localArrayList.add(localIDKey2);
    h.mEJ.b(localArrayList, false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/fts/ui/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */