package com.tencent.mm.plugin.sport.c;

import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.fh;
import com.tencent.mm.g.a.fh.a;
import com.tencent.mm.g.a.fh.b;
import com.tencent.mm.g.a.qt;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bn;
import java.util.Calendar;
import org.json.JSONObject;

public final class b
{
  public c<qt> ooJ = new c() {};
  public f ooK;
  public c ooQ = new b.1(this);
  private long ooR;
  private long ooS;
  
  public b()
  {
    this.ooQ.cht();
    this.ooJ.cht();
  }
  
  public final long bFG()
  {
    if (this.ooS == 0L) {
      this.ooS = i.L(516, 0L);
    }
    return this.ooS;
  }
  
  final boolean ft(long paramLong)
  {
    if (this.ooK != null) {
      com.tencent.mm.kernel.g.DF().c(this.ooK);
    }
    long l = System.currentTimeMillis();
    Calendar localCalendar = Calendar.getInstance();
    localCalendar.set(11, 0);
    localCalendar.set(12, 0);
    localCalendar.set(13, 0);
    x.i("MicroMsg.Sport.ExtApiStepManager", "update Api Step time: %s stepCount: %s", new Object[] { n.bx(l), Long.valueOf(paramLong) });
    this.ooK = new f("", "gh_43f2581f6fd6", (int)(localCalendar.getTimeInMillis() / 1000L), (int)(l / 1000L), (int)paramLong, bn.cmZ(), 2);
    com.tencent.mm.kernel.g.DF().a(this.ooK, 0);
    this.ooR = l;
    i.M(515, l);
    this.ooS = paramLong;
    i.L(516, this.ooS);
    return true;
  }
  
  final boolean i(com.tencent.mm.sdk.b.b paramb)
  {
    paramb = (fh)paramb;
    switch (paramb.bNx.action)
    {
    default: 
      return true;
    case 3: 
      for (;;)
      {
        try
        {
          JSONObject localJSONObject1 = g.bFJ().optJSONObject("extStepApiConfig");
          if (localJSONObject1 != null) {
            paramb.bNy.bNC = localJSONObject1.toString();
          }
          if (!bi.oW(paramb.bNy.bNC)) {
            continue;
          }
          paramb.bNy.bNE = 3905;
        }
        catch (Exception localException)
        {
          paramb.bNy.bNE = 3905;
          continue;
        }
        paramb.bNy.bND = true;
        break;
        paramb.bNy.bNE = 1;
      }
    }
    long l4 = paramb.bNx.bNA;
    long l5 = System.currentTimeMillis();
    long l6 = paramb.bNx.bNB;
    fh.b localb = paramb.bNy;
    int i;
    if (!n.bFv()) {
      i = 3906;
    }
    for (;;)
    {
      localb.bNE = i;
      if (paramb.bNy.bNE == 1)
      {
        if (this.ooR == 0L) {
          this.ooR = i.L(515, 0L);
        }
        boolean bool1 = n.E(this.ooR, System.currentTimeMillis());
        boolean bool2 = n.F(bFG(), l4);
        if ((bool1) && (bool2)) {
          ft(l4);
        }
      }
      paramb.bNy.bND = true;
      break;
      if (!n.bFQ())
      {
        i = 3902;
      }
      else
      {
        long l3 = i.L(513, 0L);
        long l2 = i.L(512, 0L);
        x.v("MicroMsg.Sport.ExtApiStepManager", "lastUpdateTime:%d lastUpdateStep:%d newUpdateTime:%d newUpdateStep:%d", new Object[] { Long.valueOf(l3), Long.valueOf(l2), Long.valueOf(l5), Long.valueOf(l4) });
        if (l5 - l3 < 300000L)
        {
          x.w("MicroMsg.Sport.ExtApiStepManager", "update interval must larger than 5 minute");
          i = 3903;
        }
        else
        {
          JSONObject localJSONObject2 = g.bFJ();
          long l1 = l3;
          if (!bi.u(l5, l3))
          {
            l1 = bi.ciZ();
            l2 = 0L;
          }
          l3 = l5 - l1;
          long l7 = l3 / 300000L;
          if (l3 % 300000L > 0L) {}
          for (i = 1;; i = 0)
          {
            long l8 = l7 + i;
            l7 = localJSONObject2.optInt("stepCounterMaxStep5m") * l8;
            x.v("MicroMsg.Sport.ExtApiStepManager", "interval5m %d intervalTime %d newUpdateTime:%d compareUpdateTime:%d maxIncreaseStep:%d", new Object[] { Long.valueOf(l8), Long.valueOf(l3), Long.valueOf(l5), Long.valueOf(l1), Long.valueOf(l7) });
            l1 = l4 - l2;
            if ((l1 >= 0L) && (l1 <= l7)) {
              break label531;
            }
            x.w("MicroMsg.Sport.ExtApiStepManager", "invalid step in 5 minute actual: %d max: %d", new Object[] { Long.valueOf(l1), Long.valueOf(l7) });
            i = 3904;
            break;
          }
          label531:
          x.i("MicroMsg.Sport.ExtApiStepManager", "can update time: %s, step: %d", new Object[] { n.bx(l5), Long.valueOf(l4) });
          i.M(513, l5);
          i.M(512, l4);
          i.M(514, l6);
          i = 1;
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sport/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */