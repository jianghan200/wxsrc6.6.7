package com.tencent.mm.plugin.luckymoney.b;

import android.net.Uri;
import android.os.Looper;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.to;
import com.tencent.mm.g.a.to.a;
import com.tencent.mm.g.a.to.b;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import com.tencent.mm.y.g.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class aj
  implements com.tencent.mm.ab.e
{
  boolean kRF;
  public ag kRG;
  public ad kRH;
  private w kRI;
  public c kRJ = new c()
  {
    private boolean a(to paramAnonymousto)
    {
      if ((paramAnonymousto instanceof to)) {
        switch (paramAnonymousto.cfd.action)
        {
        }
      }
      for (;;)
      {
        return false;
        aj localaj = aj.this;
        long l = paramAnonymousto.cfd.bIZ;
        if (!localaj.kRF)
        {
          localaj.kRF = true;
          bd localbd = ((i)g.l(i.class)).bcY().dW(l);
          paramAnonymousto = localbd.field_content;
          if (paramAnonymousto != null) {}
          for (paramAnonymousto = g.a.J(paramAnonymousto, localbd.field_reserved); paramAnonymousto != null; paramAnonymousto = null)
          {
            paramAnonymousto = bi.oV(paramAnonymousto.dyc);
            Uri localUri = Uri.parse(paramAnonymousto);
            String str = localUri.getQueryParameter("sendid");
            int i = bi.getInt(localUri.getQueryParameter("channelid"), 1);
            if (localaj.kRG != null)
            {
              g.Ek();
              g.Eh().dpP.c(localaj.kRG);
              localaj.kRG = null;
            }
            g.Ek();
            g.Eh().dpP.a(1581, localaj);
            localaj.kRG = new ag(i, str, paramAnonymousto, 3, "v1.0");
            localaj.kRG.talker = localbd.field_talker;
            localaj.kRG.bJC = l;
            g.Ek();
            g.Eh().dpP.a(localaj.kRG, 0);
            return false;
          }
        }
      }
    }
  };
  
  public aj()
  {
    a.sFg.b(this.kRJ);
  }
  
  private static void a(f paramf, long paramLong, String paramString)
  {
    to localto = new to();
    localto.cfd.action = 2;
    localto.cfe.bIZ = paramLong;
    localto.cfe.cfh = paramf.cfh;
    localto.cfe.cfi = paramf.kPW;
    localto.cfe.cfj = new ArrayList();
    if (s.fq(paramString))
    {
      paramf = paramf.kQe.iterator();
      while (paramf.hasNext())
      {
        paramString = (n)paramf.next();
        paramString = com.tencent.mm.aa.q.KJ().jR(paramString.kQD) + "=" + paramString.kQC + "=" + paramString.kQp;
        localto.cfe.cfj.add(paramString);
      }
    }
    a.sFg.a(localto, Looper.getMainLooper());
  }
  
  private static void dU(long paramLong)
  {
    to localto = new to();
    localto.cfd.action = 2;
    localto.cfe.bIZ = paramLong;
    localto.cfe.cfh = 0L;
    localto.cfe.cfi = "";
    a.sFg.a(localto, Looper.getMainLooper());
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    g.Ek();
    g.Eh().dpP.b(1581, this);
    g.Ek();
    g.Eh().dpP.b(1685, this);
    g.Ek();
    g.Eh().dpP.b(1585, this);
    if ((paraml instanceof ag))
    {
      paramString = (ag)paraml;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        this.kRF = false;
        dU(paramString.bJC);
      }
    }
    do
    {
      return;
      if (paramString.ceS == 4)
      {
        if (this.kRI != null)
        {
          g.Ek();
          g.Eh().dpP.c(this.kRI);
          this.kRI = null;
        }
        g.Ek();
        g.Eh().dpP.a(1585, this);
        this.kRI = new w(paramString.kLZ, 11, 0, paramString.ceR, "v1.0");
        this.kRI.talker = paramString.talker;
        this.kRI.bJC = paramString.bJC;
        g.Ek();
        g.Eh().dpP.a(this.kRI, 0);
        x.i("MicroMsg.Wear.WearLuckyLogic", "start to get detail");
        return;
      }
      if ((paramString.ceT != 1) && (paramString.ceS != 5) && (paramString.ceS != 1))
      {
        if (this.kRH != null)
        {
          g.Ek();
          g.Eh().dpP.c(this.kRH);
          this.kRH = null;
        }
        g.Ek();
        g.Eh().dpP.a(1685, this);
        this.kRH = new ad(paramString.msgType, paramString.bxk, paramString.kLZ, paramString.ceR, o.baX(), com.tencent.mm.model.q.GH(), paramString.talker, "v1.0", paramString.kRC);
        this.kRH.bJC = paramString.bJC;
        g.Ek();
        g.Eh().dpP.a(this.kRH, 0);
        x.i("MicroMsg.Wear.WearLuckyLogic", "start to open lucky");
        return;
      }
      this.kRF = false;
      x.i("MicroMsg.Wear.WearLuckyLogic", "receive lucky already");
      dU(paramString.bJC);
      return;
      if ((paraml instanceof ad))
      {
        this.kRF = false;
        paramString = (ad)paraml;
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          dU(paramString.bJC);
          return;
        }
        paraml = paramString.kQP;
        if (paraml.ceT == 2)
        {
          a(paraml, paramString.bJC, paramString.talker);
          return;
        }
        dU(paramString.bJC);
        return;
      }
    } while (!(paraml instanceof w));
    this.kRF = false;
    paramString = (w)paraml;
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      dU(paramString.bJC);
      return;
    }
    a(paramString.kQP, paramString.bJC, paramString.talker);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/b/aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */