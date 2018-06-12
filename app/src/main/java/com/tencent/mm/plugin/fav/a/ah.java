package com.tencent.mm.plugin.fav.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ga;
import com.tencent.mm.protocal.c.gb;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.wg;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class ah
  extends l
  implements k
{
  private static AtomicInteger iWO = new AtomicInteger(0);
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ = null;
  private LinkedList<Integer> iWK;
  private int iWL = 0;
  private boolean iWM = false;
  private boolean iWN = false;
  
  public ah(LinkedList<Integer> paramLinkedList)
  {
    b.a locala = new b.a();
    locala.dIG = new ga();
    locala.dIH = new gb();
    locala.uri = "/cgi-bin/micromsg-bin/batchgetfavitem";
    locala.dIF = 402;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    this.iWK = paramLinkedList;
    iWO.incrementAndGet();
  }
  
  private boolean aLK()
  {
    boolean bool1;
    if (bi.f((Integer)com.tencent.mm.kernel.g.Ei().DT().get(8217, null)) == 0)
    {
      bool1 = true;
      if ((this.iWK == null) || (this.iWL >= this.iWK.size())) {
        break label87;
      }
    }
    label87:
    for (boolean bool2 = true;; bool2 = false)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneBatchgetFav", "check needContinue, notInit %B indexOK %B", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if ((bool1) || (!bool2)) {
        break label92;
      }
      return true;
      bool1 = false;
      break;
    }
    label92:
    return false;
  }
  
  public static void aLL()
  {
    iWO.set(0);
  }
  
  public static void aLM()
  {
    iWO.decrementAndGet();
  }
  
  public static int aLN()
  {
    return iWO.get();
  }
  
  protected final int Cc()
  {
    return 10;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneBatchgetFav", "ashutest::doscene count:%d", new Object[] { Integer.valueOf(iWO.get()) });
    if ((this.iWK == null) || (this.iWK.isEmpty()) || (this.iWL >= this.iWK.size()))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneBatchgetFav", "klem doScene, idlist null, begIndex %d", new Object[] { Integer.valueOf(this.iWL) });
      return -1;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneBatchgetFav", "ashutest::do netscene size %d, begIndex %d, total %s", new Object[] { Integer.valueOf(this.iWK.size()), Integer.valueOf(this.iWL), this.iWK });
    if (bi.f((Integer)com.tencent.mm.kernel.g.Ei().DT().get(8217, null)) == 0)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NetSceneBatchgetFav", "klem doScene, init not done, do not batchget");
      return -1;
    }
    ga localga = (ga)this.diG.dID.dIL;
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.addAll(this.iWK.subList(this.iWL, Math.min(this.iWL + 15, this.iWK.size())));
    localga.rgy = localLinkedList;
    localga.hbF = localLinkedList.size();
    this.iWL += 15;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneBatchgetFav", "ashutest::do netscene checkd size %d, %s", new Object[] { Integer.valueOf(localLinkedList.size()), localLinkedList });
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  protected final int a(q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneBatchgetFav", "netId %d errType %d errCode %d begIndex %d idListSize %d errMsg[%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(this.iWL), Integer.valueOf(this.iWK.size()), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      if (aLK())
      {
        a(this.dIX, this.diJ);
        return;
      }
      iWO.decrementAndGet();
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramq = (gb)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    int i = paramq.hbF;
    int j = paramq.rgH.size();
    if (i != j)
    {
      if (this.iWL > this.iWK.size()) {}
      for (paramInt1 = this.iWK.size() % 15;; paramInt1 = 15)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneBatchgetFav", "klem onGYNet resp list size:%d, return count %d, request count %d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(paramInt1) });
        if (!aLK()) {
          break;
        }
        a(this.dIX, this.diJ);
        return;
      }
      iWO.decrementAndGet();
      this.diJ.a(paramInt2, -1, paramString, this);
      return;
    }
    paramInt1 = 0;
    while (paramInt1 < j)
    {
      paramArrayOfByte = (wg)paramq.rgH.get(paramInt1);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneBatchgetFav", "klem onGYNet favid:%d, status:%d", new Object[] { Integer.valueOf(paramArrayOfByte.rbY), Integer.valueOf(paramArrayOfByte.hcd) });
      g localg;
      if (paramArrayOfByte.hcd == 0)
      {
        localg = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dz(paramArrayOfByte.rbY);
        if (localg == null)
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneBatchgetFav", "klem onGYNet favid:%d not exist!", new Object[] { Integer.valueOf(paramArrayOfByte.rbY) });
          paramInt1 += 1;
          continue;
        }
        localg.field_xml = paramArrayOfByte.rcf;
        localg.Bh(paramArrayOfByte.rcf);
        localg.field_flag = paramArrayOfByte.rbZ;
        localg.field_localSeq = paramArrayOfByte.rcb;
        localg.field_updateTime = (paramArrayOfByte.rca * 1000L + paramInt1);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneBatchgetFav", "huahuahailang:item field_xml batgch get :\n %s", new Object[] { localg.field_xml });
        i = localg.field_favProto.rBI.size();
        if (i != 0) {
          break label679;
        }
        com.tencent.mm.sdk.platformtools.x.v("MicroMsg.NetSceneBatchgetFav", "this item has no data, favId:%d", new Object[] { Integer.valueOf(localg.field_id) });
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneBatchgetFav", "data dealed needUpload:%b  needDownload:%b", new Object[] { Boolean.valueOf(this.iWN), Boolean.valueOf(this.iWM) });
        if (!this.iWN) {
          break label1100;
        }
        localg.field_itemStatus = 15;
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().a(localg, new String[] { "localId" });
        ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnService().run();
      }
      for (;;)
      {
        b.j(localg);
        localg.Bi("MicroMsg.NetSceneBatchgetFav");
        if ((paramArrayOfByte.rbZ & 0x1) == 0) {
          break;
        }
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneBatchgetFav", "klem onGYNet favId: %d status not exist, delete local item", new Object[] { Integer.valueOf(paramArrayOfByte.rbY) });
        b.i(((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dz(paramArrayOfByte.rbY));
        break;
        label679:
        LinkedList localLinkedList = localg.field_favProto.rBI;
        i -= 1;
        label695:
        vx localvx;
        if (i >= 0)
        {
          localvx = (vx)localLinkedList.get(i);
          if (!bi.oW(localvx.rzF))
          {
            com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(b.b(localvx));
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneBatchgetFav", "dataFIle: %s", new Object[] { localb.getName() });
            if (localb.exists()) {
              break label943;
            }
            if ((!bi.oW(localvx.rzq)) && (!bi.oW(localvx.rzo))) {
              break label895;
            }
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneBatchgetFav", "data key or url null. favId:%d", new Object[] { Integer.valueOf(localg.field_id) });
          }
          label812:
          if (!bi.oW(localvx.rzQ))
          {
            if (new com.tencent.mm.vfs.b(b.c(localvx)).exists()) {
              break label1066;
            }
            if ((!bi.oW(localvx.rzk)) && (!bi.oW(localvx.dwE))) {
              break label1019;
            }
            com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NetSceneBatchgetFav", "thumb key or url null. favId:%d", new Object[] { Integer.valueOf(localg.field_id) });
          }
        }
        for (;;)
        {
          i -= 1;
          break label695;
          break;
          label895:
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneBatchgetFav", "local data not exist, insert cdninfo, favId:%d, dataIndex:%d", new Object[] { Integer.valueOf(localg.field_id), Integer.valueOf(i) });
          b.a(localvx, localg, 1, false);
          this.iWM = true;
          break label812;
          label943:
          if (localvx.rAe != 0)
          {
            com.tencent.mm.sdk.platformtools.x.v("MicroMsg.NetSceneBatchgetFav", "server upload data failed, client upload, md5%s", new Object[] { localvx.rzF });
            this.iWN = true;
            b.a(localvx, localg, 0, false);
          }
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneBatchgetFav", "data exist, favId:%d, dataIndex:%d", new Object[] { Integer.valueOf(localg.field_id), Integer.valueOf(i) });
          break label812;
          label1019:
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneBatchgetFav", "local thumb not exist, insert cdninfo, favId:%d, dataIndex:%d", new Object[] { Integer.valueOf(localg.field_id), Integer.valueOf(i) });
          b.a(localvx, localg, 1);
          this.iWM = true;
          continue;
          label1066:
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneBatchgetFav", "thumb exist, favId:%d, dataIndex:%d", new Object[] { Integer.valueOf(localg.field_id), Integer.valueOf(i) });
        }
        label1100:
        if (this.iWM)
        {
          localg.field_itemStatus = 10;
          ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().a(localg, new String[] { "localId" });
        }
        else
        {
          localg.field_itemStatus = 10;
          ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().a(localg, new String[] { "localId" });
        }
      }
    }
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnService().run();
    if (aLK())
    {
      a(this.dIX, this.diJ);
      return;
    }
    iWO.decrementAndGet();
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 402;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/fav/a/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */