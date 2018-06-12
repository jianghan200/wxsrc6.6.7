package com.tencent.mm.plugin.voip.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.c;
import com.tencent.mm.model.o;
import com.tencent.mm.network.k;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.protocal.c.ato;
import com.tencent.mm.protocal.c.atp;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.bko;
import com.tencent.mm.protocal.c.bkp;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import junit.framework.Assert;

public final class g
  extends l
  implements k
{
  private static final List<Object> dZx = new ArrayList();
  private static final Set<Long> oJf = new HashSet();
  private long bJC;
  private final List<com.tencent.mm.storage.bd> dZy = new LinkedList();
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public g()
  {
    x.d("MicroMsg.NetSceneSendMsg", "dktext :" + bi.cjd());
    x.i("MicroMsg.NetSceneSendMsg", "empty msg sender created");
  }
  
  public g(String paramString1, String paramString2, int paramInt)
  {
    x.d("MicroMsg.NetSceneSendMsg", "dktext :" + bi.cjd());
    if (!bi.oW(paramString1))
    {
      com.tencent.mm.storage.bd localbd = new com.tencent.mm.storage.bd();
      localbd.setStatus(1);
      localbd.ep(paramString1);
      localbd.ay(com.tencent.mm.model.bd.iD(paramString1));
      localbd.eX(1);
      localbd.setContent(paramString2);
      localbd.setType(paramInt);
      au.HU();
      this.bJC = c.FT().T(localbd);
      if (this.bJC == -1L) {
        break label155;
      }
    }
    for (;;)
    {
      Assert.assertTrue(bool);
      x.i("MicroMsg.NetSceneSendMsg", "new msg inserted to db , local id = " + this.bJC);
      return;
      label155:
      bool = false;
    }
  }
  
  private void PG()
  {
    int i = 0;
    while (i < this.dZy.size())
    {
      ic(i);
      i += 1;
    }
  }
  
  private void ic(int paramInt)
  {
    com.tencent.mm.storage.bd localbd = (com.tencent.mm.storage.bd)this.dZy.get(paramInt);
    localbd.setStatus(5);
    au.HU();
    c.FT().a(localbd.field_msgId, localbd);
    Iterator localIterator = dZx.iterator();
    while (localIterator.hasNext())
    {
      localIterator.next();
      String str = localbd.field_talker;
      str = localbd.field_content;
    }
  }
  
  protected final int Cc()
  {
    return 10;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = new b.a();
    parame1.dIG = new bko();
    parame1.dIH = new bkp();
    parame1.uri = "/cgi-bin/micromsg-bin/newsendmsg";
    parame1.dIF = 522;
    parame1.dII = 237;
    parame1.dIJ = 1000000237;
    this.diG = parame1.KT();
    parame1 = (bko)this.diG.dID.dIL;
    au.HU();
    List localList = c.FT().bdh();
    int i;
    if (localList.size() == 0)
    {
      x.i("MicroMsg.NetSceneSendMsg", "no sending message");
      i = -2;
    }
    int j;
    do
    {
      return i;
      this.dZy.clear();
      i = 0;
      while (i < localList.size())
      {
        com.tencent.mm.storage.bd localbd = (com.tencent.mm.storage.bd)localList.get(i);
        if (localbd.field_isSend == 1)
        {
          ato localato = new ato();
          localato.rck = new bhz().VO(localbd.field_talker);
          localato.lOH = ((int)(localbd.field_createTime / 1000L));
          localato.hcE = localbd.getType();
          localato.jSA = localbd.field_content;
          localato.rWU = o.l(com.tencent.mm.model.q.GF(), localbd.field_createTime).hashCode();
          localato.rco = bf.Is();
          parame1.hbG.add(localato);
          parame1.hbF = parame1.hbG.size();
          this.dZy.add(localbd);
        }
        i += 1;
      }
      j = a(parame, this.diG, this);
      i = j;
    } while (j >= 0);
    PG();
    return j;
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    if (this.dZy.size() > 0) {
      return l.b.dJm;
    }
    return l.b.dJn;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      PG();
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
    do
    {
      return;
      paramq = ((bkp)this.diG.dIE.dIL).hbG;
      if (this.dZy.size() == paramq.size())
      {
        paramInt1 = 0;
        while (paramInt1 < paramq.size())
        {
          paramArrayOfByte = (atp)paramq.get(paramInt1);
          if (paramArrayOfByte.rfn != 0)
          {
            x.e("MicroMsg.NetSceneSendMsg", "send msg failed: item ret code=" + paramArrayOfByte.rfn);
            ic(paramInt1);
            this.diJ.a(4, paramArrayOfByte.rfn, paramString, this);
            return;
          }
          long l = ((com.tencent.mm.storage.bd)this.dZy.get(paramInt1)).field_msgId;
          x.i("MicroMsg.NetSceneSendMsg", "msg local id = " + l + ", SvrId = " + paramArrayOfByte.rcq + " sent successfully!");
          au.HU();
          com.tencent.mm.storage.bd localbd = c.FT().dW(l);
          localbd.ax(paramArrayOfByte.rcq);
          localbd.setStatus(2);
          au.HU();
          c.FT().a(l, localbd);
          paramInt1 += 1;
        }
        x.i("MicroMsg.NetSceneSendMsg", "total " + paramInt1 + " msgs sent successfully");
      }
      paramInt1 = a(this.dIX, this.diJ);
      if (paramInt1 == -2)
      {
        this.diJ.a(0, 0, paramString, this);
        return;
      }
    } while (paramInt1 >= 0);
    this.diJ.a(3, -1, paramString, this);
  }
  
  public final int getType()
  {
    return 522;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/voip/model/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */