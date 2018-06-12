package com.tencent.mm.modelmulti;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.g.a.ox;
import com.tencent.mm.g.a.oz;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.o;
import com.tencent.mm.network.k;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.protocal.c.ato;
import com.tencent.mm.protocal.c.atp;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.bko;
import com.tencent.mm.protocal.c.bkp;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.wcdb.database.SQLiteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import junit.framework.Assert;

public final class i
  extends com.tencent.mm.ab.l
  implements k
{
  private static final List<Object> dZx = new ArrayList();
  public long bJC;
  private boolean dZA = false;
  private final List<com.tencent.mm.storage.bd> dZB = new ArrayList();
  private com.tencent.mm.storage.bd dZC = null;
  public com.tencent.mm.plugin.messenger.foundation.a.l dZD = null;
  private final List<com.tencent.mm.storage.bd> dZy = new LinkedList();
  private int dZz = 3;
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public i()
  {
    x.d("MicroMsg.NetSceneSendMsg", "dktext :%s", new Object[] { bi.cjd() });
    x.i("MicroMsg.NetSceneSendMsg", "empty msg sender created");
  }
  
  public i(long paramLong)
  {
    x.i("MicroMsg.NetSceneSendMsg", "resend msg , local id = " + paramLong);
    this.bJC = paramLong;
    this.dZC = ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().dW(paramLong);
    if (this.dZC == null) {
      x.e("MicroMsg.NetSceneSendMsg", "resend msg , msg is null localid:%d", new Object[] { Long.valueOf(paramLong) });
    }
  }
  
  public i(String paramString1, String paramString2, int paramInt)
  {
    x.d("MicroMsg.NetSceneSendMsg", "dktext :%s", new Object[] { bi.cjd() });
    com.tencent.mm.storage.bd localbd;
    if (!bi.oW(paramString1))
    {
      localbd = new com.tencent.mm.storage.bd();
      localbd.setStatus(1);
      localbd.ep(paramString1);
      localbd.ay(com.tencent.mm.model.bd.iD(paramString1));
      localbd.eX(1);
      localbd.setContent(paramString2);
      localbd.setType(paramInt);
      paramString1 = ((p)g.l(p.class)).v(localbd);
      if (!bi.oW(paramString1))
      {
        localbd.dt(paramString1);
        x.d("MicroMsg.NetSceneSendMsg", "NetSceneSendMsg:MsgSource:%s", new Object[] { localbd.cqb });
      }
    }
    try
    {
      this.bJC = ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().b(localbd, true);
      if (this.bJC == -1L) {
        com.tencent.mm.plugin.report.f.mDy.a(111L, 255L, 1L, false);
      }
      if (this.bJC != -1L) {
        bool = true;
      }
      Assert.assertTrue(bool);
      x.i("MicroMsg.NetSceneSendMsg", "new msg inserted to db , local id = " + this.bJC);
      return;
    }
    catch (SQLiteException paramString1)
    {
      com.tencent.mm.plugin.report.f.mDy.a(111L, 255L, 1L, false);
      throw paramString1;
    }
  }
  
  public i(String paramString1, String paramString2, int paramInt1, int paramInt2, Object paramObject)
  {
    x.d("MicroMsg.NetSceneSendMsg", "dktext :%s", new Object[] { bi.cjd() });
    com.tencent.mm.storage.bd localbd;
    if (!bi.oW(paramString1))
    {
      localbd = new com.tencent.mm.storage.bd();
      localbd.setStatus(1);
      localbd.ep(paramString1);
      localbd.ay(com.tencent.mm.model.bd.iD(paramString1));
      localbd.eX(1);
      localbd.setContent(paramString2);
      localbd.setType(paramInt1);
      paramString1 = a(((p)g.l(p.class)).v(localbd), paramObject, paramInt2);
      if (!bi.oW(paramString1))
      {
        localbd.dt(paramString1);
        x.d("MicroMsg.NetSceneSendMsg", "NetSceneSendMsg:MsgSource:%s", new Object[] { localbd.cqb });
      }
    }
    for (;;)
    {
      try
      {
        this.bJC = ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().b(localbd, true);
        if (this.bJC == -1L) {
          com.tencent.mm.plugin.report.f.mDy.a(111L, 255L, 1L, false);
        }
        if (this.bJC != -1L)
        {
          bool = true;
          Assert.assertTrue(bool);
          x.i("MicroMsg.NetSceneSendMsg", "new msg inserted to db , local id = " + this.bJC);
          return;
        }
      }
      catch (SQLiteException paramString1)
      {
        com.tencent.mm.plugin.report.f.mDy.a(111L, 255L, 1L, false);
        throw paramString1;
      }
      boolean bool = false;
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
  
  private static String a(String paramString, Object paramObject, int paramInt)
  {
    boolean bool;
    if (paramObject == null)
    {
      bool = true;
      x.i("MicroMsg.NetSceneSendMsg", "[mergeMsgSource] rawSource:%s args is null:%s flag:%s", new Object[] { paramString, Boolean.valueOf(bool), Integer.valueOf(paramInt) });
      if ((bi.oW(paramString)) || (paramString.startsWith("<msgsource>"))) {
        break label74;
      }
      x.w("MicroMsg.NetSceneSendMsg", "[mergeMsgSource] WTF the msgsource is right? %s", new Object[] { paramString });
    }
    label74:
    while ((paramInt != 291) || (!(paramObject instanceof HashMap)))
    {
      return paramString;
      bool = false;
      break;
    }
    StringBuffer localStringBuffer = new StringBuffer();
    if (bi.oW(paramString)) {
      localStringBuffer.append("<msgsource>");
    }
    paramObject = ((HashMap)paramObject).entrySet().iterator();
    while (((Iterator)paramObject).hasNext())
    {
      Object localObject = (Map.Entry)((Iterator)paramObject).next();
      String str = (String)((Map.Entry)localObject).getValue();
      localObject = (String)((Map.Entry)localObject).getKey();
      if ((bi.oW(str)) || (bi.oW((String)localObject)))
      {
        x.w("MicroMsg.NetSceneSendMsg", "%s %s", new Object[] { localObject, str });
      }
      else
      {
        localStringBuffer.append("<").append((String)localObject).append(">");
        localStringBuffer.append(str);
        localStringBuffer.append("</").append((String)localObject).append(">");
      }
    }
    if (bi.oW(paramString))
    {
      localStringBuffer.append("</msgsource>");
      return localStringBuffer.toString();
    }
    return paramString.replace("<msgsource>", "<msgsource>" + localStringBuffer.toString());
  }
  
  private void ib(int paramInt)
  {
    if (this.dZy == null)
    {
      x.e("MicroMsg.NetSceneSendMsg", "publishMsgSendFailEvent, sendingList is null");
      return;
    }
    if ((paramInt >= this.dZy.size()) || (paramInt < 0))
    {
      x.e("MicroMsg.NetSceneSendMsg", "publishMsgSendFailEvent, index:%d, sendingList.size:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.dZy.size()) });
      return;
    }
    t((com.tencent.mm.storage.bd)this.dZy.get(paramInt));
  }
  
  private void ic(int paramInt)
  {
    com.tencent.mm.storage.bd localbd = (com.tencent.mm.storage.bd)this.dZy.get(paramInt);
    x.d("MicroMsg.NetSceneSendMsg", "markMsgFailed for id:%d", new Object[] { Long.valueOf(localbd.field_msgId) });
    u(localbd);
  }
  
  private void mn(String paramString)
  {
    x.d("MicroMsg.NetSceneSendMsg", "continue send msg in list");
    int i = a(this.dIX, this.diJ);
    if (i == -2) {
      this.diJ.a(0, 0, paramString, this);
    }
    while (i >= 0) {
      return;
    }
    this.diJ.a(3, -1, paramString, this);
  }
  
  private static void t(com.tencent.mm.storage.bd parambd)
  {
    ox localox = new ox();
    localox.bZS.bGS = parambd;
    a.sFg.m(localox);
    x.d("MicroMsg.NetSceneSendMsg", "publishMsgSendFailEvent for msgId:%d", new Object[] { Long.valueOf(parambd.field_msgId) });
  }
  
  private static void u(com.tencent.mm.storage.bd parambd)
  {
    parambd.setStatus(5);
    com.tencent.mm.plugin.report.f.mDy.a(111L, 30L, 1L, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().a(parambd.field_msgId, parambd);
    Iterator localIterator = dZx.iterator();
    while (localIterator.hasNext())
    {
      localIterator.next();
      String str = parambd.field_talker;
      str = parambd.field_content;
    }
  }
  
  protected final int Cc()
  {
    return 10;
  }
  
  public final boolean KX()
  {
    return true;
  }
  
  public final boolean KY()
  {
    boolean bool = super.KY();
    if (bool) {
      com.tencent.mm.plugin.report.f.mDy.a(111L, 254L, 1L, false);
    }
    return bool;
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
    bko localbko = (bko)this.diG.dID.dIL;
    int i;
    if (this.dZC == null)
    {
      parame1 = ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().bdh();
      if (parame1.size() != 0) {
        break label244;
      }
      x.w("MicroMsg.NetSceneSendMsg", "no sending message");
      i = -2;
    }
    label244:
    int j;
    do
    {
      return i;
      if (this.dZC.field_status != 5) {
        x.w("MicroMsg.NetSceneSendMsg", "msg:%d status:%d should not be resend !", new Object[] { Long.valueOf(this.dZC.field_msgId), Integer.valueOf(this.dZC.field_status) });
      }
      this.dZC.setStatus(1);
      ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().a(this.bJC, this.dZC);
      parame1 = new ArrayList();
      parame1.add(this.dZC);
      this.dZC = null;
      break;
      this.dZy.clear();
      i = 0;
      while (i < parame1.size())
      {
        com.tencent.mm.storage.bd localbd = (com.tencent.mm.storage.bd)parame1.get(i);
        if (localbd.field_isSend == 1)
        {
          ato localato = new ato();
          localato.rck = new bhz().VO(localbd.field_talker);
          localato.lOH = ((int)(localbd.field_createTime / 1000L));
          localato.hcE = localbd.getType();
          localato.jSA = localbd.field_content;
          localato.rWU = o.l(com.tencent.mm.model.q.GF(), localbd.field_createTime).hashCode();
          if (this.dZD == null) {
            this.dZD = ((p)g.l(p.class)).PK();
          }
          x.i("MicroMsg.NetSceneSendMsg", "using message source assembler %s", new Object[] { this.dZD });
          this.dZD.a(localato, localbd);
          x.i("MicroMsg.NetSceneSendMsg", "reqCmd.MsgSource:%s", new Object[] { localato.rco });
          localbko.hbG.add(localato);
          localbko.hbF = localbko.hbG.size();
          this.dZy.add(localbd);
        }
        i += 1;
      }
      j = a(parame, this.diG, this);
      i = j;
    } while (j >= 0);
    x.i("MicroMsg.NetSceneSendMsg", "mark all failed. do scene %d", new Object[] { Integer.valueOf(j) });
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
      com.tencent.mm.plugin.report.f.mDy.a(111L, paramInt2 + 40, 1L, true);
      com.tencent.mm.plugin.report.f.mDy.a(111L, 253L, 1L, false);
      x.i("MicroMsg.NetSceneSendMsg", "mark all failed. onGYNetEnd. errType:%d errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      PG();
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      paramInt1 = 0;
      while (paramInt1 < this.dZy.size())
      {
        ib(paramInt1);
        paramInt1 += 1;
      }
      x.d("MicroMsg.NetSceneSendMsg", "send fail, continue send SENDING msg");
      mn(paramString);
      return;
    }
    paramq = ((bkp)this.diG.dIE.dIL).hbG;
    paramArrayOfByte = new ArrayList();
    if (this.dZy.size() == paramq.size())
    {
      paramInt1 = 0;
      if (paramInt1 < paramq.size())
      {
        Object localObject = (atp)paramq.get(paramInt1);
        if ((((atp)localObject).rfn != 0) || (af.exT))
        {
          com.tencent.mm.plugin.report.f.mDy.a(111L, 252L, 1L, false);
          if ((((atp)localObject).rfn == -49) || (af.exT))
          {
            x.i("MicroMsg.NetSceneSendMsg", "summerdktext send msg failed: item ret code[%d], index[%d], testVerifyPsw[%b], retryVerifyCount[%d]", new Object[] { Integer.valueOf(((atp)localObject).rfn), Integer.valueOf(paramInt1), Boolean.valueOf(af.exT), Integer.valueOf(this.dZz) });
            if (this.dZA)
            {
              localObject = (com.tencent.mm.storage.bd)this.dZy.get(paramInt1);
              this.dZB.add(localObject);
            }
            for (;;)
            {
              paramInt1 += 1;
              break;
              if (this.dZz < 0)
              {
                ic(paramInt1);
                this.diJ.a(4, ((atp)localObject).rfn, paramString, this);
                ib(paramInt1);
                return;
              }
              this.dZA = true;
              this.dZz -= 1;
              localObject = (com.tencent.mm.storage.bd)this.dZy.get(paramInt1);
              this.dZB.add(localObject);
              g.Em().H(new i.1(this, paramString));
            }
          }
          ic(paramInt1);
          this.diJ.a(4, ((atp)localObject).rfn, paramString, this);
          ib(paramInt1);
          return;
        }
        long l = ((com.tencent.mm.storage.bd)this.dZy.get(paramInt1)).field_msgId;
        x.i("MicroMsg.NetSceneSendMsg", "msg local id = " + l + ", SvrId = " + ((atp)localObject).rcq + " sent successfully!");
        com.tencent.mm.storage.bd localbd = ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().dW(l);
        localbd.ax(((atp)localObject).rcq);
        x.d("MicroMsg.NetSceneSendMsg", "dkmsgid  set svrmsgid %d -> %d", new Object[] { Long.valueOf(((atp)localObject).rcq), Integer.valueOf(af.exn) });
        if ((10007 == af.exm) && (af.exn != 0))
        {
          localbd.ax(af.exn);
          af.exn = 0;
        }
        localbd.setStatus(2);
        ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().a(l, localbd);
        if (this.dZy == null) {
          x.e("MicroMsg.NetSceneSendMsg", "publishMsgSendSuccessEvent, sendingList is null");
        }
        for (;;)
        {
          paramArrayOfByte.add(Integer.valueOf(paramInt1));
          if (1 != ((atp)localObject).hcE) {
            break;
          }
          com.tencent.mm.plugin.report.f.mDy.a(11942, true, false, new Object[] { Long.valueOf(((atp)localObject).rcq) });
          com.tencent.mm.plugin.report.f.mDy.a(11945, false, true, new Object[] { Long.valueOf(((atp)localObject).rcq) });
          com.tencent.mm.plugin.report.f.mDy.a(11946, false, false, new Object[] { Long.valueOf(((atp)localObject).rcq) });
          com.tencent.mm.plugin.report.f.mDy.a(90L, 0L, 1L, false);
          com.tencent.mm.plugin.report.f.mDy.a(90L, 1L, 1L, true);
          break;
          if ((paramInt1 >= this.dZy.size()) || (paramInt1 < 0))
          {
            x.e("MicroMsg.NetSceneSendMsg", "publishMsgSendSuccessEvent, index:%d, sendingList.size:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(this.dZy.size()) });
          }
          else
          {
            l = ((com.tencent.mm.storage.bd)this.dZy.get(paramInt1)).field_msgId;
            x.d("MicroMsg.NetSceneSendMsg", "publishMsgSendSuccessEvent for msgId:%d", new Object[] { Long.valueOf(l) });
            localbd = ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().dW(l);
            oz localoz = new oz();
            localoz.bZU.bGS = localbd;
            a.sFg.m(localoz);
          }
        }
      }
      x.i("MicroMsg.NetSceneSendMsg", "summerdktext total  [%d]msgs sent successfully, [%d]msgs need verifypsw", new Object[] { Integer.valueOf(paramInt1 - this.dZB.size()), Integer.valueOf(this.dZB.size()) });
    }
    x.d("MicroMsg.NetSceneSendMsg", "summerdktext send finish, continue send SENDING msg verifyingPsw[%b]", new Object[] { Boolean.valueOf(this.dZA) });
    if (this.dZA)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    mn(paramString);
  }
  
  public final int getType()
  {
    return 522;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/modelmulti/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */