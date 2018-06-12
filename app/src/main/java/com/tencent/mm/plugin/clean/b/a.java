package com.tencent.mm.plugin.clean.b;

import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.clean.c.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class a
  implements Runnable
{
  private static final Long hQA = Long.valueOf(604800000L);
  private static final Long hQB = Long.valueOf(7776000000L);
  private long hQC;
  private long hQD;
  private long hQE;
  private long hQF;
  private HashMap<String, Long> hQG;
  private HashSet<String> hQH;
  private c hQI;
  private boolean isStop = false;
  
  public a(c paramc)
  {
    this.hQI = paramc;
    this.hQG = new HashMap();
    this.hQH = new HashSet();
  }
  
  private int a(List<String> paramList, HashSet<String> paramHashSet)
  {
    String str1 = g.Ei().dqo;
    String str2 = g.Ei().dqp;
    x.i("MicroMsg.CleanCalcLogic", "%s get MicroMsg path root[%s] acc[%s]", new Object[] { avy(), str1, str2 });
    int j = 0;
    int i = 0;
    Object localObject = new File(str1);
    int k = j;
    if (((File)localObject).isDirectory())
    {
      String[] arrayOfString = ((File)localObject).list();
      k = j;
      if (arrayOfString != null)
      {
        int m = arrayOfString.length;
        j = 0;
        k = i;
        if (j < m)
        {
          localObject = arrayOfString[j];
          String str3 = str1 + (String)localObject + "/";
          x.d("MicroMsg.CleanCalcLogic", "%s sub file path[%s] sub[%s]", new Object[] { avy(), str3, localObject });
          if (new File(str3).isDirectory()) {
            if (((String)localObject).length() >= 32) {
              if (!bi.fS(str2, str3))
              {
                paramHashSet.add(str3);
                paramList.add(str3);
                i += 1;
                this.hQH.add(localObject);
              }
            }
          }
          for (;;)
          {
            j += 1;
            break;
            if (str2.endsWith("/")) {}
            for (localObject = str2 + "music";; localObject = str2 + File.separator + "music")
            {
              paramList.add(localObject);
              au.HU();
              paramList.add(com.tencent.mm.model.c.Gg());
              au.HU();
              paramList.add(com.tencent.mm.model.c.getAccSnsPath());
              au.HU();
              paramList.add(com.tencent.mm.model.c.Gm());
              break;
            }
            paramList.add(str3);
            i += 1;
            continue;
            paramList.add(str3);
            i += 1;
          }
        }
      }
    }
    return k;
  }
  
  private String avy()
  {
    return hashCode();
  }
  
  private long yu(String paramString)
  {
    Object localObject = new File(paramString);
    if (((File)localObject).isDirectory())
    {
      String[] arrayOfString = ((File)localObject).list();
      if (arrayOfString != null)
      {
        long l1 = 0L;
        int j = arrayOfString.length;
        int i = 0;
        while (i < j)
        {
          localObject = arrayOfString[i];
          StringBuilder localStringBuilder = new StringBuilder().append(paramString);
          if (paramString.endsWith("/")) {}
          long l2;
          for (;;)
          {
            l2 = yu((String)localObject);
            if (l2 != -1L) {
              break;
            }
            return -1L;
            localObject = "/" + (String)localObject;
          }
          l1 += l2;
          i += 1;
        }
        return l1;
      }
    }
    return ((File)localObject).length();
  }
  
  private long yv(String paramString)
  {
    long l1 = 0L;
    int i = 0;
    Object localObject = new File(paramString);
    long l2;
    if (((File)localObject).isDirectory())
    {
      localObject = ((File)localObject).list();
      if (localObject != null)
      {
        int j = localObject.length;
        for (;;)
        {
          l2 = l1;
          if (i >= j) {
            break;
          }
          String str = localObject[i];
          l1 += yv(paramString + "/" + str);
          i += 1;
        }
      }
    }
    else if (System.currentTimeMillis() - ((File)localObject).lastModified() > hQA.longValue())
    {
      x.i("MicroMsg.CleanCalcLogic", "Clean 7 days file in sns rootPath=%s", new Object[] { paramString });
      long l3 = com.tencent.mm.a.e.cm(paramString);
      l2 = l1;
      if (((File)localObject).delete())
      {
        this.hQF += l3;
        l2 = l1;
      }
      return l2;
    }
    return com.tencent.mm.a.e.cm(paramString);
  }
  
  private long yw(String paramString)
  {
    long l1 = 0L;
    int i = 0;
    Object localObject = new File(paramString);
    long l2;
    if (((File)localObject).isDirectory())
    {
      localObject = ((File)localObject).list();
      if (localObject != null)
      {
        int j = localObject.length;
        for (;;)
        {
          l2 = l1;
          if (i >= j) {
            break;
          }
          String str = localObject[i];
          l1 += yw(paramString + "/" + str);
          i += 1;
        }
      }
    }
    else if (System.currentTimeMillis() - ((File)localObject).lastModified() > hQB.longValue())
    {
      x.i("MicroMsg.CleanCalcLogic", "Clean 90 days file in music rootPath=%s", new Object[] { paramString });
      long l3 = com.tencent.mm.a.e.cm(paramString);
      l2 = l1;
      if (((File)localObject).delete())
      {
        this.hQF += l3;
        l2 = l1;
      }
      return l2;
    }
    return com.tencent.mm.a.e.cm(paramString);
  }
  
  public final void run()
  {
    long l2 = bi.VG();
    if (this.isStop)
    {
      x.i("MicroMsg.CleanCalcLogic", "%s start run but stop", new Object[] { avy() });
      return;
    }
    Object localObject = new ArrayList();
    HashSet localHashSet = new HashSet();
    a((List)localObject, localHashSet);
    int j = ((List)localObject).size();
    int i = 0;
    while ((!this.isStop) && (i < j))
    {
      String str = (String)((List)localObject).get(i);
      if (!bi.oW(str))
      {
        if (str.endsWith(File.separator + "sns" + File.separator)) {
          l1 = yv(str);
        }
        for (;;)
        {
          this.hQG.put(str, Long.valueOf(l1));
          x.d("MicroMsg.CleanCalcLogic", "%s path[%s] size[%d]", new Object[] { avy(), str, Long.valueOf(l1) });
          this.hQC += l1;
          if (localHashSet.contains(str)) {
            this.hQE = (l1 + this.hQE);
          }
          i += 1;
          if (this.hQI != null) {
            this.hQI.co(i, j);
          }
          break;
          if (str.endsWith(File.separator + "music")) {
            l1 = yw(str);
          } else {
            l1 = yu(str);
          }
        }
      }
    }
    this.hQD = com.tencent.mm.plugin.j.b.avr().avs().avB();
    this.hQC += this.hQD;
    if (this.hQC <= 0L)
    {
      this.hQC = 1L;
      h.mEJ.a(714L, 60L, 1L, false);
    }
    x.i("MicroMsg.CleanCalcLogic", "%s scan finish cost[%d] micromsg[%d] acc[%d] otherAcc[%d]", new Object[] { avy(), Long.valueOf(bi.bI(l2)), Long.valueOf(this.hQC), Long.valueOf(this.hQD), Long.valueOf(this.hQE) });
    localObject = this.hQH;
    if (this.hQI != null) {
      this.hQI.a(this.hQC, this.hQD, this.hQE, (HashSet)localObject, this.hQG);
    }
    j.aBt();
    long l1 = j.aBa();
    j.aBt();
    l2 = j.aBb();
    i = (int)(this.hQC * 100L / l1);
    j = (int)(this.hQD * 100L / this.hQC);
    int k = (int)(this.hQE * 100L / this.hQC);
    long l3 = this.hQC - this.hQD - this.hQE;
    int m = (int)(100L * l3 / this.hQC);
    localObject = new StringBuffer();
    ((StringBuffer)localObject).append(this.hQF).append(",");
    ((StringBuffer)localObject).append(this.hQC).append(",");
    ((StringBuffer)localObject).append(i).append(",");
    ((StringBuffer)localObject).append(l1 - l2).append(",");
    ((StringBuffer)localObject).append(l2).append(",");
    ((StringBuffer)localObject).append(l1).append(",");
    ((StringBuffer)localObject).append(this.hQD).append(",");
    ((StringBuffer)localObject).append(j).append(",");
    ((StringBuffer)localObject).append(this.hQE).append(",");
    ((StringBuffer)localObject).append(k).append(",");
    ((StringBuffer)localObject).append(l3).append(",");
    ((StringBuffer)localObject).append(m);
    localObject = ((StringBuffer)localObject).toString();
    x.i("MicroMsg.CleanCalcLogic", "rpt content %s", new Object[] { localObject });
    h.mEJ.k(14762, (String)localObject);
    stop();
  }
  
  public final void stop()
  {
    this.isStop = true;
    this.hQI = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/clean/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */