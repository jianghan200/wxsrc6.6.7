package com.tencent.mm.ac;

import android.net.Uri;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.protocal.c.pd;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bd;
import com.tencent.mm.y.l;
import com.tencent.mm.y.m;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;

public final class k
{
  private a.a cXs = new a.a()
  {
    long lastReportTime = 0L;
    
    public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
    {
      if (!paramAnonymousBoolean) {
        return true;
      }
      x.i("MicroMsg.ReportLocation", "LBSManager notify. lat:%f, lng:%f", new Object[] { Float.valueOf(paramAnonymousFloat2), Float.valueOf(paramAnonymousFloat1) });
      if (bi.VE() >= this.lastReportTime + k.this.dMo)
      {
        k.a(k.this.userName, 11, paramAnonymousFloat2, paramAnonymousFloat1, (int)paramAnonymousDouble2, null);
        this.lastReportTime = bi.VE();
      }
      if (k.this.dMl == 2) {
        k.this.MR();
      }
      if (!k.this.dMp)
      {
        k.this.dMp = true;
        com.tencent.mm.modelstat.o.a(2013, paramAnonymousFloat1, paramAnonymousFloat2, (int)paramAnonymousDouble2);
      }
      return true;
    }
  };
  int dMl = 0;
  private com.tencent.mm.modelgeo.c dMm;
  private int dMn = 2;
  int dMo = 10;
  boolean dMp = false;
  m.b dMq = new k.1(this);
  String userName = null;
  
  protected k()
  {
    if (this.dMo < this.dMn) {
      this.dMo = this.dMn;
    }
    x.i("MicroMsg.ReportLocation", "reportLocation interval %d", new Object[] { Integer.valueOf(this.dMo) });
  }
  
  private static void a(String paramString, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3, LinkedList<pd> paramLinkedList)
  {
    if (paramInt2 == 3) {}
    for (String str = "<event></event>";; str = String.format("<event><location><errcode>%d</errcode><data><latitude>%f</latitude><longitude>%f</longitude><precision>%d</precision></data></location></event>", new Object[] { Integer.valueOf(paramInt2), Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Integer.valueOf(paramInt3) }))
    {
      x.i("MicroMsg.ReportLocation", "doScene, info: %s", new Object[] { str });
      g.Eh().dpP.a(new q(paramString, paramInt1, str, paramLinkedList), 0);
      return;
    }
  }
  
  public static void kS(String paramString)
  {
    a(paramString, 12, 0, 0.0F, 0.0F, 0, null);
  }
  
  public final void MR()
  {
    x.i("MicroMsg.ReportLocation", "Stop report");
    this.dMl = 0;
    if (this.dMm != null) {
      this.dMm.c(this.cXs);
    }
    if (g.Eg().Dx()) {
      ((i)g.l(i.class)).FR().b(this.dMq);
    }
  }
  
  public final void b(final String paramString, final bd parambd)
  {
    if ((parambd == null) || (!parambd.cky()))
    {
      a(paramString, 10, 0, 0.0F, 0.0F, 0, null);
      return;
    }
    g.Em().H(new Runnable()
    {
      public final void run()
      {
        LinkedList localLinkedList = new LinkedList();
        Object localObject1 = ((com.tencent.mm.plugin.biz.a.a)g.l(com.tencent.mm.plugin.biz.a.a.class)).wS(parambd.field_content);
        if ((localObject1 == null) || (bi.cX(((l)localObject1).dzs)))
        {
          k.a(paramString, 10, 0.0F, 0.0F, 0, null);
          return;
        }
        localObject1 = ((l)localObject1).dzs.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          m localm = (m)((Iterator)localObject1).next();
          String str = localm.url;
          if (!bi.oW(str))
          {
            Object localObject2 = Uri.parse(str);
            try
            {
              str = ((Uri)localObject2).getQueryParameter("mid");
              localObject2 = ((Uri)localObject2).getQueryParameter("idx");
              pd localpd = new pd();
              localpd.rty = bi.getLong(str, 0L);
              localpd.mQH = bi.getInt((String)localObject2, 0);
              localpd.bPS = localm.dzH;
              localpd.path = localm.dzE;
              localLinkedList.add(localpd);
            }
            catch (UnsupportedOperationException localUnsupportedOperationException)
            {
              x.w("MicroMsg.ReportLocation", "UnsupportedOperationException %s", new Object[] { localUnsupportedOperationException.getMessage() });
            }
          }
        }
        k.a(paramString, 10, 0.0F, 0.0F, 0, localLinkedList);
      }
    });
  }
  
  public final void kT(String paramString)
  {
    x.i("MicroMsg.ReportLocation", "Start report");
    this.userName = paramString;
    Object localObject = f.kH(paramString);
    if (localObject == null) {}
    d.b localb;
    label190:
    label195:
    do
    {
      do
      {
        return;
        if (this.dMl != 0) {
          MR();
        }
        this.dMl = 0;
        if (((d)localObject).LS())
        {
          x.i("MicroMsg.ReportLocation", "need update contact %s", new Object[] { paramString });
          com.tencent.mm.aa.c.jN(paramString);
        }
        localb = ((d)localObject).bG(false);
      } while (localb == null);
      if ((localb.LU()) && (((d)localObject).LR()))
      {
        this.dMm = com.tencent.mm.modelgeo.c.OB();
        localObject = ((d)localObject).bG(false);
        boolean bool;
        if (((d.b)localObject).dKT != null)
        {
          if (bi.getInt(((d.b)localObject).dKT.optString("ReportLocationType"), 0) == 2)
          {
            bool = true;
            ((d.b)localObject).dLg = bool;
          }
        }
        else {
          if (!((d.b)localObject).dLg) {
            break label190;
          }
        }
        for (int i = 3;; i = 2)
        {
          this.dMl = i;
          if ((!com.tencent.mm.modelgeo.c.OC()) && (!com.tencent.mm.modelgeo.c.OD())) {
            break label195;
          }
          this.dMm.a(this.cXs, true);
          return;
          bool = false;
          break;
        }
        a(paramString, 11, 2, 0.0F, 0.0F, 0, null);
        return;
      }
    } while ((!localb.LU()) || (((d)localObject).LR()));
    a(paramString, 11, 1, 0.0F, 0.0F, 0, null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ac/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */