package com.tencent.mm.plugin.fav.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.nh;
import com.tencent.mm.protocal.c.ni;
import com.tencent.mm.protocal.c.nj;
import com.tencent.mm.protocal.c.vw;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class ai
  extends l
  implements k
{
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ = null;
  private int iWP = 0;
  public g iWQ;
  private boolean iWR = true;
  private boolean iWS = false;
  HashMap<vx, Boolean> iWT = new HashMap();
  
  public ai(g paramg)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new ni();
    ((b.a)localObject).dIH = new nj();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/checkcdn";
    ((b.a)localObject).dIF = 404;
    ((b.a)localObject).dII = 197;
    ((b.a)localObject).dIJ = 1000000197;
    this.diG = ((b.a)localObject).KT();
    this.iWQ = paramg;
    paramg = paramg.field_favProto.rBI.iterator();
    while (paramg.hasNext())
    {
      localObject = (vx)paramg.next();
      this.iWT.put(localObject, Boolean.valueOf(false));
    }
  }
  
  protected final int Cc()
  {
    return 10;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = this.iWT.keySet().iterator();
    int j = 0;
    Object localObject;
    if (parame1.hasNext())
    {
      localObject = (vx)parame1.next();
      if (((Boolean)this.iWT.get(localObject)).booleanValue()) {
        break label634;
      }
    }
    label527:
    label548:
    label625:
    label631:
    label634:
    for (int i = j + 1;; i = j)
    {
      j = i;
      break;
      if (j == 0)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneCheckCDN", "klem doScene data list null");
        this.iWP = -100;
        return -100;
      }
      parame1 = (ni)this.diG.dID.dIL;
      parame1.hbG.clear();
      localObject = this.iWQ.field_favProto.rBI;
      int m = 0;
      i = 0;
      int k;
      if (m < ((List)localObject).size())
      {
        vx localvx = (vx)((List)localObject).get(m);
        if (((Boolean)this.iWT.get(localvx)).booleanValue()) {
          break label631;
        }
        k = i;
        if (!localvx.rAa)
        {
          localnh = new nh();
          localnh.rrr = ((int)localvx.rzJ);
          localnh.rrp = localvx.rzF;
          localnh.rrq = localvx.rzH;
          localnh.rro = String.valueOf(m);
          localnh.rrt = localvx.rzW;
          localnh.rrs = this.iWQ.field_sourceType;
          localnh.rru = 0;
          parame1.hbG.add(localnh);
          k = i + 1;
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneCheckCDN", "check CDN, dataId %s, dataSourceId %s, DataSourceType %s, FullSize %d, FullMd5 %s, Head256Md5 %s", new Object[] { localnh.rro, localnh.rrt, Integer.valueOf(localnh.rrs), Integer.valueOf(localnh.rrr), localnh.rrp, localnh.rrq });
        }
        if (localvx.rAc) {
          break label625;
        }
        nh localnh = new nh();
        localnh.rrr = ((int)localvx.rzU);
        localnh.rrp = localvx.rzQ;
        localnh.rrq = localvx.rzS;
        localnh.rrt = localvx.rzW;
        localnh.rrs = this.iWQ.field_sourceType;
        localnh.rro = (m + "t");
        localnh.rru = 1;
        parame1.hbG.add(localnh);
        i = k + 1;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneCheckCDN", "check CDN thumb, dataId %s, dataSourceId %s, DataSourceType %s, FullSize %d, FullMd5 %s, Head256Md5 %s", new Object[] { localnh.rro, localnh.rrt, Integer.valueOf(localnh.rrs), Integer.valueOf(localnh.rrr), localnh.rrp, localnh.rrq });
        k = i;
        if (i >= 19) {
          break label548;
        }
      }
      for (;;)
      {
        m += 1;
        break;
        k = i;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneCheckCDN", "doScene:  usedCount %d, dataSize %d, nextBegIndex %d", new Object[] { Integer.valueOf(k), Integer.valueOf(j), Integer.valueOf(m + 1) });
        parame1.hbF = k;
        if (k == 0)
        {
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NetSceneCheckCDN", "no more data, must not check cdn!");
          this.iWP = -101;
          return -101;
        }
        return a(parame, this.diG, this);
        i = k;
        break label527;
      }
    }
  }
  
  protected final int a(q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneCheckCDN", "netId %d errType %d errCode %d localErrCode %d errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(this.iWP), paramString });
    int i;
    if (paramInt2 == 0)
    {
      i = paramInt3;
      if (paramInt3 == 0) {}
    }
    else
    {
      if ((paramInt2 == 3) && (this.iWP == -100))
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneCheckCDN", "need not check cdn, add fav now");
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().t(9, this.iWQ.field_localId);
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getSendService().run();
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
      }
      if ((paramInt2 != 3) || (this.iWP != -101)) {
        break label827;
      }
      i = 0;
    }
    if ((this.iWP != -101) && (paramInt2 == 0) && (i == 0))
    {
      paramq = ((nj)((com.tencent.mm.ab.b)paramq).dIE.dIL).hbG;
      paramArrayOfByte = this.iWQ.field_favProto.rBI;
      paramInt1 = 0;
      Object localObject2;
      if (paramInt1 < paramq.size())
      {
        localObject1 = (vw)paramq.get(paramInt1);
        localObject2 = ((vw)localObject1).rro;
        vx localvx;
        if (!bi.oW((String)localObject2))
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneCheckCDN", "klem OnGYNet status:%d, tmpId %s", new Object[] { Integer.valueOf(((vw)localObject1).hcd), localObject2 });
          if (((vw)localObject1).hcd == 1)
          {
            if (((String)localObject2).endsWith("t")) {
              break label842;
            }
            localvx = (vx)paramArrayOfByte.get(bi.getInt((String)localObject2, 0));
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneCheckCDN", "klem OnGYNet cdn data exist, update url:%s, key:%s, DataId %s, FullMd5 %s, FullSize %d, Head256Md5 %s", new Object[] { ((vw)localObject1).rze, ((vw)localObject1).rmy, ((vw)localObject1).rro, ((vw)localObject1).rrp, Integer.valueOf(((vw)localObject1).rrr), ((vw)localObject1).rrq });
            localvx.UG(((vw)localObject1).rmy);
            localvx.UF(((vw)localObject1).rze);
            if (!bi.oW(((vw)localObject1).rzf)) {
              localvx.UU(((vw)localObject1).rzf);
            }
            if (bi.oW(localvx.rzF))
            {
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneCheckCDN", "klem OnGYNet cdn exist, local not exist");
              localvx.UM(((vw)localObject1).rrp);
              localvx.fO(((vw)localObject1).rrr);
              localvx.UN(((vw)localObject1).rrq);
              b.a(localvx, this.iWQ, 1, false);
            }
            if ((!bi.oW(((vw)localObject1).rrp)) && (!((vw)localObject1).rrp.equals(localvx.rzF)))
            {
              com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NetSceneCheckCDN", "svrFullMd5 %s, localMd5 %s", new Object[] { ((vw)localObject1).rrp, localvx.rzF });
              localvx.UM(((vw)localObject1).rrp);
            }
            if ((!bi.oW(((vw)localObject1).rrq)) && (!((vw)localObject1).rrq.equals(localvx.rzH)))
            {
              com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NetSceneCheckCDN", "svrHead256md5 %s, localHead256md5 %s", new Object[] { ((vw)localObject1).rrq, localvx.rzH });
              localvx.UN(((vw)localObject1).rrq);
            }
            if ((((vw)localObject1).rrr > 0) && (((vw)localObject1).rrr != localvx.rzJ))
            {
              com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NetSceneCheckCDN", "svrFullSize %d, localFullSize %d", new Object[] { Integer.valueOf(((vw)localObject1).rrr), Long.valueOf(localvx.rzJ) });
              localvx.fO(((vw)localObject1).rrr);
            }
          }
          label689:
          if (((String)localObject2).endsWith("t")) {
            break label1112;
          }
          localvx = (vx)paramArrayOfByte.get(bi.getInt((String)localObject2, 0));
          this.iWT.put(localvx, Boolean.valueOf(true));
          label732:
          if ((((vw)localObject1).hcd != 3) && (((vw)localObject1).hcd != -2) && (((vw)localObject1).hcd != -1)) {
            break label1247;
          }
          if (((String)localObject2).endsWith("t")) {
            break label1588;
          }
          localvx = (vx)paramArrayOfByte.get(bi.getInt((String)localObject2, 0));
          if (!bi.oW(localvx.rzF)) {
            break label1158;
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneCheckCDN", "klem OnGYNet data cdn not exist, local not exist ", new Object[] { localvx.rzF });
        }
        for (;;)
        {
          paramInt1 += 1;
          break;
          label827:
          this.diJ.a(paramInt2, paramInt3, paramString, this);
          return;
          label842:
          localvx = (vx)paramArrayOfByte.get(bi.getInt(((String)localObject2).substring(0, ((String)localObject2).length() - 1), 0));
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneCheckCDN", "klem OnGYNet cdn thumb exist, update url:%s, key:%s, DataId %s, FullMd5 %s, FullSize %d, Head256Md5 %s", new Object[] { ((vw)localObject1).rze, ((vw)localObject1).rmy, ((vw)localObject1).rro, ((vw)localObject1).rrp, Integer.valueOf(((vw)localObject1).rrr), ((vw)localObject1).rrq });
          localvx.UE(((vw)localObject1).rmy);
          localvx.UD(((vw)localObject1).rze);
          if (((vw)localObject1).rrr <= 0) {
            break label689;
          }
          localvx.fP(((vw)localObject1).rrr);
          if ((!bi.oW(((vw)localObject1).rrp)) && (!((vw)localObject1).rrp.equals(localvx.rzQ)))
          {
            com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NetSceneCheckCDN", "svrThumbMd5 %s, localThumbMd5 %s", new Object[] { ((vw)localObject1).rrp, localvx.rzQ });
            localvx.UR(((vw)localObject1).rrp);
          }
          if ((bi.oW(((vw)localObject1).rrq)) || (((vw)localObject1).rrq.equals(localvx.rzS))) {
            break label689;
          }
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NetSceneCheckCDN", "svrThumbHead256md5 %s, localThumbHead256md5 %s", new Object[] { ((vw)localObject1).rrq, localvx.rzS });
          localvx.US(((vw)localObject1).rrq);
          break label689;
          label1112:
          localvx = (vx)paramArrayOfByte.get(bi.getInt(((String)localObject2).substring(0, ((String)localObject2).length() - 1), 0));
          this.iWT.put(localvx, Boolean.valueOf(true));
          break label732;
          label1158:
          this.iWR = false;
          String str;
          if (bi.oW(localvx.rzq))
          {
            com.tencent.mm.modelcdntran.g.NE();
            str = com.tencent.mm.modelcdntran.b.Nw();
            localvx.UG(str);
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneCheckCDN", "local not exist cdn data key, generate %s", new Object[] { str });
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneCheckCDN", "klem OnGYNet cdn not exist, insert data md5:%s cdnkey:%s", new Object[] { localvx.rzF, localvx.rzq });
          b.a(localvx, this.iWQ, 0, false);
          for (;;)
          {
            label1247:
            if (((vw)localObject1).hcd != 2) {
              break label1740;
            }
            this.iWS = true;
            if (((String)localObject2).endsWith("t")) {
              break label1742;
            }
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneCheckCDN", "klem OnGYNet data cdn not exist svr upload, dataStatus:%d, CdnUrl:%s, CdnKey:%s", new Object[] { Integer.valueOf(((vw)localObject1).rzg), ((vw)localObject1).rze, ((vw)localObject1).rmy });
            localObject2 = (vx)paramArrayOfByte.get(bi.getInt((String)localObject2, 0));
            ((vx)localObject2).CG(((vw)localObject1).rzg);
            ((vx)localObject2).UG(((vw)localObject1).rmy);
            ((vx)localObject2).UF(((vw)localObject1).rze);
            if (!bi.oW(((vw)localObject1).rzf)) {
              ((vx)localObject2).UU(((vw)localObject1).rzf);
            }
            if ((!bi.oW(((vw)localObject1).rrp)) && (!((vw)localObject1).rrp.equals(((vx)localObject2).rzF)))
            {
              com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NetSceneCheckCDN", "SVR_UPLOADING::svrFullMd5 %s, localMd5 %s", new Object[] { ((vw)localObject1).rrp, ((vx)localObject2).rzF });
              ((vx)localObject2).UM(((vw)localObject1).rrp);
            }
            if ((!bi.oW(((vw)localObject1).rrq)) && (!((vw)localObject1).rrq.equals(((vx)localObject2).rzH)))
            {
              com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NetSceneCheckCDN", "SVR_UPLOADING::svrHead256md5 %s, localHead256md5 %s", new Object[] { ((vw)localObject1).rrq, ((vx)localObject2).rzH });
              ((vx)localObject2).UN(((vw)localObject1).rrq);
            }
            if ((((vw)localObject1).rrr <= 0) || (((vw)localObject1).rrr == ((vx)localObject2).rzJ)) {
              break;
            }
            com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NetSceneCheckCDN", "SVR_UPLOADING::svrFullSize %d, localFullSize %d", new Object[] { Integer.valueOf(((vw)localObject1).rrr), Long.valueOf(((vx)localObject2).rzJ) });
            ((vx)localObject2).fO(((vw)localObject1).rrr);
            break;
            label1588:
            localvx = (vx)paramArrayOfByte.get(bi.getInt(((String)localObject2).substring(0, ((String)localObject2).length() - 1), 0));
            if (bi.oW(localvx.rzQ))
            {
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneCheckCDN", "klem OnGYNet thumb cdn not exist, local not exist ", new Object[] { localvx.rzQ });
              break;
            }
            this.iWR = false;
            if (bi.oW(localvx.rzq))
            {
              com.tencent.mm.modelcdntran.g.NE();
              str = com.tencent.mm.modelcdntran.b.Nw();
              localvx.UG(str);
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneCheckCDN", "local not exist cdn data key, generate %s", new Object[] { str });
            }
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneCheckCDN", "klem OnGYNet cdn not exist, insert thumb md5:%s cdnkey:%s", new Object[] { localvx.rzF, localvx.rzq });
            b.a(localvx, this.iWQ, 0);
          }
          label1740:
          continue;
          label1742:
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneCheckCDN", "klem OnGYNet svr uploading thumb?! should not reach here!!");
        }
      }
      Object localObject1 = this.iWT.keySet().iterator();
      paramInt1 = 0;
      label1769:
      if (((Iterator)localObject1).hasNext())
      {
        localObject2 = (vx)((Iterator)localObject1).next();
        if (((Boolean)this.iWT.get(localObject2)).booleanValue()) {
          break label2286;
        }
        paramInt1 += 1;
      }
    }
    label2286:
    for (;;)
    {
      break label1769;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneCheckCDN", "onGYSceneEnd:  resultCount %d, dataSize %d", new Object[] { Integer.valueOf(paramq.size()), Integer.valueOf(paramArrayOfByte.size()) });
      if (paramInt1 > 0)
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NetSceneCheckCDN", "check cdn list not end, continues");
        paramInt1 = a(this.dIX, this.diJ);
        if ((paramInt1 != -100) && (paramInt1 != -101)) {
          break;
        }
      }
      if (this.iWS)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneCheckCDN", "klem onGYNet waitServerUpload, send item now");
        this.iWQ.field_itemStatus = 12;
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().a(this.iWQ, new String[] { "localId" });
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getSendService().run();
        this.diJ.a(paramInt2, i, paramString, this);
        return;
      }
      if (this.iWR)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneCheckCDN", "klem onGYNet all data exist, start send item");
        if (this.iWQ.field_id > 0)
        {
          this.iWQ.field_itemStatus = 17;
          ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().a(this.iWQ, new String[] { "localId" });
          ((ae)com.tencent.mm.kernel.g.n(ae.class)).getModService().run();
        }
        for (;;)
        {
          this.diJ.a(paramInt2, i, paramString, this);
          return;
          if (this.iWQ.field_type == 18) {
            this.iWQ.field_favProto.CN(1);
          }
          this.iWQ.field_itemStatus = 9;
          ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().a(this.iWQ, new String[] { "localId" });
          ((ae)com.tencent.mm.kernel.g.n(ae.class)).getSendService().run();
        }
      }
      if (this.iWQ.field_id > 0) {}
      for (this.iWQ.field_itemStatus = 15;; this.iWQ.field_itemStatus = 4)
      {
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().a(this.iWQ, new String[] { "localId" });
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnService().run();
        break;
        if (this.iWQ.field_type == 18) {
          this.iWQ.field_favProto.CN(1);
        }
      }
    }
  }
  
  public final int getType()
  {
    return 404;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/fav/a/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */