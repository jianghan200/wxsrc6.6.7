package com.tencent.mm.plugin.qmessage.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.g.a.rk;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.fy;
import com.tencent.mm.protocal.c.fz;
import com.tencent.mm.protocal.c.pz;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import junit.framework.Assert;

public final class b
  extends l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  private Set<String> mbt;
  
  public b(Set<String> paramSet)
  {
    Assert.assertTrue(true);
    this.mbt = paramSet;
  }
  
  private boolean h(q paramq)
  {
    Object localObject1 = (fz)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    if (localObject1 == null) {
      x.e("MicroMsg.NetSceneBatchGetContactProfile", "dealResp: resp is null");
    }
    for (;;)
    {
      return false;
      if (paramq.Id().qWB == 1)
      {
        x.e("MicroMsg.NetSceneBatchGetContactProfile", "dealResp : endless loop, should stop");
        return false;
      }
      if (paramq.Id().qWB == -1)
      {
        x.e("MicroMsg.NetSceneBatchGetContactProfile", "dealResp : server err, can try again");
        return true;
      }
      localObject1 = ((fz)localObject1).rgG;
      if (localObject1 != null)
      {
        int j = 0;
        if (j < ((List)localObject1).size()) {
          try
          {
            paramq = (pz)new pz().aG(com.tencent.mm.platformtools.ab.a((bhy)((List)localObject1).get(j)));
            if ((paramq == null) || (paramq.hbL == null))
            {
              x.e("MicroMsg.NetSceneBatchGetContactProfile", "processContactProfile: profile name is null");
              i = 0;
              if (i == 0) {
                continue;
              }
              j += 1;
            }
          }
          catch (IOException paramq)
          {
            for (;;)
            {
              int i;
              x.printErrStackTrace("MicroMsg.NetSceneBatchGetContactProfile", paramq, "", new Object[0]);
              x.e("MicroMsg.NetSceneBatchGetContactProfile", "ContactProfile.parseFrom fail");
              paramq = null;
              continue;
              if (!this.mbt.contains(paramq.hbL))
              {
                x.e("MicroMsg.NetSceneBatchGetContactProfile", "processContactProfile: resp data not in req");
                i = 0;
              }
              else
              {
                this.mbt.remove(paramq.hbL);
                au.HU();
                Object localObject2 = c.FR().Yg(paramq.hbL);
                if ((localObject2 == null) || ((int)((com.tencent.mm.l.a)localObject2).dhP == 0))
                {
                  x.e("MicroMsg.NetSceneBatchGetContactProfile", "processContactProfile: did not find this contact");
                  i = 0;
                }
                else
                {
                  ((com.tencent.mm.storage.ab)localObject2).setUsername(paramq.hbL);
                  ((com.tencent.mm.storage.ab)localObject2).du(paramq.eJM);
                  ((com.tencent.mm.storage.ab)localObject2).setType(paramq.ruj & paramq.ruk);
                  ((com.tencent.mm.storage.ab)localObject2).dx(paramq.hcS);
                  ((com.tencent.mm.storage.ab)localObject2).dy(paramq.ruh);
                  ((com.tencent.mm.storage.ab)localObject2).dz(paramq.rui);
                  ((com.tencent.mm.storage.ab)localObject2).eJ(paramq.eJH);
                  ((com.tencent.mm.storage.ab)localObject2).dv(paramq.rul);
                  ((com.tencent.mm.storage.ab)localObject2).dB(paramq.ruo);
                  ((com.tencent.mm.storage.ab)localObject2).dC(paramq.run);
                  ((com.tencent.mm.storage.ab)localObject2).eM(paramq.rup);
                  ((com.tencent.mm.storage.ab)localObject2).dw(paramq.rus);
                  ((com.tencent.mm.storage.ab)localObject2).eN(paramq.rut);
                  au.HU();
                  if (c.FR().a(((ai)localObject2).field_username, (com.tencent.mm.storage.ab)localObject2) == -1) {
                    x.e("MicroMsg.NetSceneBatchGetContactProfile", "processContactProfile:update contact failed");
                  }
                  if (com.tencent.mm.storage.ab.XQ(paramq.hbL))
                  {
                    localObject2 = g.boc().JM(paramq.hbL);
                    if ((localObject2 == null) || (bi.oV(((d)localObject2).getUsername()).length() <= 0))
                    {
                      x.e("MicroMsg.NetSceneBatchGetContactProfile", "processContactProfile: did not find qcontact");
                      i = 0;
                      continue;
                    }
                    ((d)localObject2).extInfo = paramq.jTB;
                    ((d)localObject2).mbw = paramq.ruv;
                    ((d)localObject2).mbx = paramq.ruw;
                    ((d)localObject2).bWA = 52;
                    if (!g.boc().a(paramq.hbL, (d)localObject2)) {
                      x.e("MicroMsg.NetSceneBatchGetContactProfile", "processContactProfile:update qcontact failed");
                    }
                  }
                  if (com.tencent.mm.storage.ab.XO(paramq.hbL))
                  {
                    localObject2 = new rk();
                    ((rk)localObject2).ccg.opType = 0;
                    ((rk)localObject2).ccg.bWJ = paramq.hbL;
                    ((rk)localObject2).ccg.bWK = paramq.ruv;
                    ((rk)localObject2).ccg.bWL = paramq.rum;
                    com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject2);
                  }
                  i = 1;
                }
              }
            }
          }
        }
      }
    }
    return true;
  }
  
  protected final int Cc()
  {
    return 50;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = new LinkedList();
    Object localObject = this.mbt.iterator();
    while (((Iterator)localObject).hasNext()) {
      parame1.add((String)((Iterator)localObject).next());
    }
    if (parame1.size() == 0)
    {
      x.e("MicroMsg.NetSceneBatchGetContactProfile", com.tencent.mm.compatible.util.g.Ac() + "doScene reqSize ==0");
      return -1;
    }
    localObject = new b.a();
    ((b.a)localObject).dIG = new fy();
    ((b.a)localObject).dIH = new fz();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/batchgetcontactprofile";
    ((b.a)localObject).dIF = 140;
    ((b.a)localObject).dII = 28;
    ((b.a)localObject).dIJ = 1000000028;
    localObject = ((b.a)localObject).KT();
    LinkedList localLinkedList = new LinkedList();
    parame1 = parame1.iterator();
    while (parame1.hasNext()) {
      localLinkedList.add(com.tencent.mm.platformtools.ab.oT((String)parame1.next()));
    }
    ((fy)((com.tencent.mm.ab.b)localObject).dID.dIL).rgF = localLinkedList;
    ((fy)((com.tencent.mm.ab.b)localObject).dID.dIL).rgE = 1;
    ((fy)((com.tencent.mm.ab.b)localObject).dID.dIL).hbF = localLinkedList.size();
    return a(parame, (q)localObject, this);
  }
  
  protected final int a(q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((h(paramq)) && (this.mbt.size() > 0)) {
      a(this.dIX, this.diJ);
    }
    x.d("MicroMsg.NetSceneBatchGetContactProfile", "left cnt = " + this.mbt.size());
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 140;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/qmessage/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */