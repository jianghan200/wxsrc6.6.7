package com.tencent.mm.plugin.account.friend.a;

import com.tencent.mm.aa.c;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.protocal.c.afh;
import com.tencent.mm.protocal.c.afi;
import com.tencent.mm.protocal.c.arr;
import com.tencent.mm.protocal.c.ars;
import com.tencent.mm.protocal.c.atu;
import com.tencent.mm.protocal.c.bhp;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.bqd;
import com.tencent.mm.protocal.c.fl;
import com.tencent.mm.protocal.c.qt;
import com.tencent.mm.protocal.c.va;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ay;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class ab
  extends l
  implements com.tencent.mm.network.k
{
  public com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ = null;
  private List<String> eHv;
  private List<String> eKV;
  
  public ab()
  {
    XN();
    afh localafh = (afh)this.diG.dID.dIL;
    localafh.rwt = "";
    localafh.rJq = null;
    localafh.rJp = 0;
    localafh.rJo = null;
    localafh.rJn = 0;
    localafh.jRb = 0;
    localafh.otY = 1;
  }
  
  public ab(List<String> paramList1, List<String> paramList2)
  {
    XN();
    if (((paramList1 == null) || (paramList1.size() == 0)) && ((paramList2 == null) || (paramList2.size() == 0))) {
      return;
    }
    this.eHv = paramList1;
    this.eKV = paramList2;
    paramList1 = (afh)this.diG.dID.dIL;
    paramList1.rwt = "";
    paramList1.jRb = 2;
    paramList1.otY = 1;
  }
  
  private void XN()
  {
    b.a locala = new b.a();
    locala.dIG = new afh();
    locala.dIH = new afi();
    locala.uri = "/cgi-bin/micromsg-bin/getmfriend";
    locala.dIF = 142;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
  }
  
  private static void a(a parama, ars paramars)
  {
    parama.eJG = paramars.eJG;
    parama.eJH = paramars.eJH;
    parama.eJI = paramars.eJI;
    parama.eJJ = paramars.eJJ;
    parama.eJK = paramars.eJK;
    parama.eJL = paramars.eJL;
    parama.eJM = paramars.eJM;
    parama.eJN = paramars.eJN;
    parama.eJP = paramars.eJP;
    parama.eJO = paramars.eJO;
    parama.eJQ = paramars.eJQ;
    parama.eJR = paramars.eJR;
    bqd localbqd = paramars.rTk;
    if (localbqd != null)
    {
      parama.eJS = localbqd.eJS;
      parama.eJT = localbqd.eJT;
      parama.eJU = localbqd.eJU;
    }
    paramars = paramars.rTl;
    if (paramars != null)
    {
      parama.eJV = paramars.eJV;
      parama.eJW = paramars.eJW;
      parama.eJX = paramars.eJX;
      parama.eJY = paramars.eJY;
    }
  }
  
  public final void XO()
  {
    afh localafh = (afh)this.diG.dID.dIL;
    localafh.rwt = ((String)com.tencent.mm.kernel.g.Ei().DT().get(65828, null));
    localafh.jRb = 1;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = (afh)this.diG.dID.dIL;
    if (parame1.jRb == 2)
    {
      if (((this.eHv == null) || (this.eHv.size() == 0)) && ((this.eKV == null) || (this.eKV.size() == 0)))
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetMFriend", "doScene failed, mobile list and email list empty.");
        return -1;
      }
      LinkedList localLinkedList;
      Iterator localIterator;
      String str;
      Object localObject;
      if ((this.eHv != null) && (this.eHv.size() > 0))
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetMFriend", "doScene get mobile list size:%d", new Object[] { Integer.valueOf(this.eHv.size()) });
        localLinkedList = new LinkedList();
        localIterator = this.eHv.iterator();
        while (localIterator.hasNext())
        {
          str = (String)localIterator.next();
          localObject = new atu();
          ((atu)localObject).v = str;
          localLinkedList.add(localObject);
        }
        parame1.rJo = localLinkedList;
        parame1.rJn = localLinkedList.size();
      }
      if ((this.eKV != null) && (this.eKV.size() > 0))
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetMFriend", "doScene get email list size:%d", new Object[] { Integer.valueOf(this.eKV.size()) });
        localLinkedList = new LinkedList();
        localIterator = this.eKV.iterator();
        while (localIterator.hasNext())
        {
          str = (String)localIterator.next();
          localObject = new arr();
          ((arr)localObject).v = str;
          localLinkedList.add(localObject);
        }
        parame1.rJq = localLinkedList;
        parame1.rJp = localLinkedList.size();
      }
    }
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    paramArrayOfByte = (afi)this.diG.dIE.dIL;
    afh localafh = (afh)this.diG.dID.dIL;
    if ((paramInt2 == 4) && (paramInt3 == -68))
    {
      this.diJ.a(paramInt2, paramInt3, paramArrayOfByte.six.rgv.siM, this);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetMFriend", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetMFriend", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    paramq = bi.oV((String)com.tencent.mm.kernel.g.Ei().DT().get(65828, null));
    if ((localafh.jRb == 1) && (!bi.oW(paramArrayOfByte.rwt)) && (!paramArrayOfByte.rwt.equals(paramq)))
    {
      com.tencent.mm.kernel.g.Ei().DT().set(65828, paramArrayOfByte.rwt);
      ((h)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.account.a.a.a.class)).getFacebookFrdStg()).Xw();
    }
    if (paramArrayOfByte.jTa == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetMFriend", "onGYNetEnd  friendlist null");
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetMFriend", "onGYNetEnd friend list size:%d", new Object[] { Integer.valueOf(paramArrayOfByte.jTa.size()) });
    long l = com.tencent.mm.kernel.g.Ei().dqq.dO(Thread.currentThread().getId());
    paramInt1 = 0;
    ars localars;
    a locala;
    g localg;
    label490:
    label665:
    j localj;
    if (paramInt1 < paramArrayOfByte.jTa.size())
    {
      localars = (ars)paramArrayOfByte.jTa.get(paramInt1);
      if (localars == null) {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetMFriend", "Err getFriendList null");
      }
      for (;;)
      {
        paramInt1 += 1;
        break;
        locala = ((b)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.account.a.a.a.class)).getAddrUploadStg()).pq(localars.eJG);
        if ((locala == null) && (localafh.jRb != 1))
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetMFriend", "Err MD5 not found is AddrUploadStg, nickName: " + localars.rTW + " md5: " + localars.eJG);
        }
        else
        {
          com.tencent.mm.plugin.d.a.ZN().Gw().fX(localars.rdS, localars.rEJ);
          localg = new g();
          if (localafh.jRb != 1) {
            break label955;
          }
          if (localars.rTX != null) {
            break label490;
          }
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetMFriend", "ERR: facebook friend return null info");
        }
      }
      localg.csC = localars.rTX.mFa;
      localg.eKb = localars.rTX.ryv;
      c.jH(localars.rTX.mFa);
      localg.eKa = localars.rTX.jPe;
      localg.cCR = localars.eJM;
      localg.csL = localars.eJJ;
      localg.csK = localars.eJI;
      localg.signature = localars.eJK;
      localg.csJ = localars.eJL;
      localg.sex = localars.eJH;
      localg.bgn = localars.rTW;
      localg.eJA = com.tencent.mm.platformtools.h.oJ(localars.rTX.jPe);
      localg.eJB = com.tencent.mm.platformtools.h.oI(localars.rTX.jPe);
      localg.username = localars.rdS;
      localj = new j();
      localj.username = localars.rdS;
      localj.csK = localars.eJI;
      localj.csL = localars.eJJ;
      localj.signature = localars.eJK;
      localj.sex = localars.eJH;
      localj.csJ = localars.eJL;
      paramq = null;
      if (!bi.oW(localars.rdS))
      {
        paramq = ((i)com.tencent.mm.kernel.g.l(i.class)).FR().Yg(localars.rdS);
        if ((paramq == null) || (!localars.rdS.equals(paramq.field_username))) {
          break label977;
        }
        if ((bi.oW(localars.eJM)) || (localars.eJM.equals(paramq.wM()))) {
          break label1412;
        }
        paramq.du(localars.eJM);
        ((i)com.tencent.mm.kernel.g.l(i.class)).FR().a(paramq.field_username, paramq);
      }
    }
    label859:
    label882:
    label955:
    label977:
    label1412:
    for (;;)
    {
      boolean bool;
      if (bi.oW(localars.rdS)) {
        if (localafh.jRb == 1)
        {
          bool = true;
          Assert.assertTrue("mobile friend never go here", bool);
          localg.status = 102;
        }
      }
      for (;;)
      {
        if (localafh.jRb == 1) {
          ((h)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.account.a.a.a.class)).getFacebookFrdStg()).a(localg);
        }
        ((k)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.account.a.a.a.class)).getFrdExtStg()).a(localj);
        break;
        if (!bi.oW(localars.rdS)) {
          break label665;
        }
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NetSceneGetMFriend", "username null for mobile");
        break;
        paramq = null;
        break label859;
        bool = false;
        break label882;
        if ((paramq == null) || (!com.tencent.mm.l.a.gd(paramq.field_type)))
        {
          localg.status = 100;
          if (locala != null)
          {
            com.tencent.mm.sdk.platformtools.x.v("MicroMsg.NetSceneGetMFriend", "onGYNetEnd update status on, nick:" + localars.rTW + " realName:" + locala.Xj() + "  MFriend:" + localars.toString());
            locala.status = 1;
            locala.username = localars.rdS;
            locala.bgn = localars.rTW;
            locala.eJA = com.tencent.mm.platformtools.h.oJ(localars.rTX.jPe);
            locala.eJB = com.tencent.mm.platformtools.h.oI(localars.rTX.jPe);
            locala.eJF = locala.AY();
            a(locala, localars);
            locala.bWA = -1;
            ((b)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.account.a.a.a.class)).getAddrUploadStg()).a(locala.Xh(), locala);
            paramq = new com.tencent.mm.aa.j();
            paramq.username = localars.rdS;
            paramq.dHR = localars.rqZ;
            paramq.dHQ = localars.rra;
            paramq.by(true);
            paramq.csA = 3;
            com.tencent.mm.aa.q.KH().a(paramq);
          }
        }
        else
        {
          localg.status = 101;
          if (locala != null)
          {
            com.tencent.mm.sdk.platformtools.x.v("MicroMsg.NetSceneGetMFriend", "onGYNetEnd update status friend, nick:" + localars.rTW + "  md5:" + localars.eJG);
            locala.status = 2;
            locala.username = localars.rdS;
            locala.bgn = localars.rTW;
            locala.eJF = locala.AY();
            a(locala, localars);
            locala.bWA = -1;
            ((b)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.account.a.a.a.class)).getAddrUploadStg()).a(locala.Xh(), locala);
            c.J(localars.rdS, 3);
          }
        }
      }
      com.tencent.mm.kernel.g.Ei().dqq.gp(l);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
  }
  
  public final int getType()
  {
    return 32;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/account/friend/a/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */