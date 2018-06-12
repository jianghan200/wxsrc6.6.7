package com.tencent.mm.plugin.expt.b;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.expt.c.c;
import com.tencent.mm.plugin.expt.c.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.adm;
import com.tencent.mm.protocal.c.adn;
import com.tencent.mm.protocal.c.bhp;
import com.tencent.mm.protocal.c.fl;
import com.tencent.mm.protocal.c.un;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class b
  extends l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  private int iHZ = 0;
  
  private static void po(int paramInt)
  {
    int i = (int)bi.VE();
    if (i > paramInt)
    {
      g.Ei().DT().a(aa.a.sZW, Integer.valueOf(i));
      return;
    }
    g.Ei().DT().a(aa.a.sZW, Integer.valueOf(paramInt));
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    int i = 0;
    this.diJ = parame1;
    long l = bi.VG();
    parame1 = new b.a();
    parame1.dIG = new adm();
    parame1.dIH = new adn();
    parame1.uri = "/cgi-bin/mmexptappsvr-bin/getexptconfig";
    parame1.dIF = 2738;
    parame1.dII = 0;
    parame1.dIJ = 0;
    parame1 = parame1.KT();
    adm localadm = (adm)parame1.dID.dIL;
    localadm.otY = this.iHZ;
    localadm.rHT = ((Integer)g.Ei().DT().get(aa.a.sZW, Integer.valueOf(0))).intValue();
    List localList = a.aIu().iHQ.aIH();
    if ((localList != null) && (localList.size() > 0))
    {
      localadm.rHU = new LinkedList();
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.expt.c.a locala = (com.tencent.mm.plugin.expt.c.a)localIterator.next();
        un localun = new un();
        localun.rxV = locala.field_exptId;
        localun.rxW = locala.field_groupId;
        localun.rxX = locala.field_exptSeq;
        localadm.rHU.add(localun);
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetExpt", "req local exptList [%s] ", new Object[] { Arrays.toString(localList.toArray()) });
    }
    h.mEJ.a(863L, 0L, 1L, false);
    int j = localadm.otY;
    int k = localadm.rHT;
    if (localadm.rHU != null) {
      i = localadm.rHU.size();
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetExpt", "get expt config scene[%d] lastGetSvrSec[%d] localExptList[%d] cost[%d]", new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i), Long.valueOf(bi.bI(l)) });
    return a(parame, parame1, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetExpt", "get expt on gy end. errType[%d] erroCode[%d] errMsg[%s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    long l1;
    int m;
    int j;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (adn)((com.tencent.mm.ab.b)paramq).dIE.dIL;
      if (paramq != null)
      {
        if (paramq.six.rfn != 0)
        {
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NetSceneGetExpt", "get expt error. resp baseResp [%d] [%s]", new Object[] { Integer.valueOf(paramq.six.rfn), paramq.six.rgv });
          h.mEJ.a(863L, 2L, 1L, false);
        }
      }
      else
      {
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
      }
      l1 = bi.VG();
      po(paramq.rHV);
      m = paramq.rHW;
      g.Ei().DT().a(aa.a.sZV, Integer.valueOf(m));
      if (paramq.rHZ == 1)
      {
        h.mEJ.a(863L, 7L, 1L, false);
        long l2 = bi.VG();
        paramArrayOfByte = a.aIu();
        paramInt1 = paramArrayOfByte.iHQ.aIG();
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExptService", "delete all expt count[%d] map count[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramArrayOfByte.iHR.aIG()) });
        paramArrayOfByte.aIt();
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetExpt", "check need del all expt count[%d] cost[%d]", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(bi.bI(l2)) });
        j = 1;
        paramArrayOfByte = paramq.rHX;
        if ((paramArrayOfByte == null) || (paramArrayOfByte.size() <= 0)) {
          break label815;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetExpt", "delete expt [%s]", new Object[] { Arrays.toString(paramArrayOfByte.toArray()) });
      }
    }
    label667:
    label771:
    label815:
    for (paramInt1 = a.aIu().aV(paramArrayOfByte);; paramInt1 = 0)
    {
      LinkedList localLinkedList1 = paramq.rHY;
      LinkedList localLinkedList2;
      if ((localLinkedList1 != null) && (localLinkedList1.size() > 0))
      {
        localLinkedList2 = new LinkedList();
        Iterator localIterator = localLinkedList1.iterator();
        for (;;)
        {
          if (localIterator.hasNext())
          {
            un localun = (un)localIterator.next();
            com.tencent.mm.plugin.expt.c.a locala = new com.tencent.mm.plugin.expt.c.a();
            locala.AC(localun.rxY);
            if ((locala.field_exptId != localun.rxV) || (locala.field_groupId != localun.rxW) || (locala.field_exptSeq != localun.rxX))
            {
              com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NetSceneGetExpt", "expt item proto[%d %d %d] is different expt content[%d %d %d]", new Object[] { Integer.valueOf(localun.rxV), Integer.valueOf(localun.rxW), Integer.valueOf(localun.rxX), Integer.valueOf(locala.field_exptId), Integer.valueOf(locala.field_groupId), Integer.valueOf(locala.field_exptSeq) });
              h.mEJ.a(863L, 6L, 1L, false);
            }
            localLinkedList2.add(locala);
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetExpt", "get expt item [%s]", new Object[] { locala.toString() });
            continue;
            j = 0;
            break;
          }
        }
      }
      for (int i = a.aIu().aU(localLinkedList2);; i = 0)
      {
        if ((j != 0) || (paramInt1 > 0) || (i > 0))
        {
          a.aIu();
          a.aIv();
        }
        h.mEJ.a(863L, 1L, 1L, false);
        int n = paramq.rHV;
        int i1 = paramq.rHZ;
        if (paramArrayOfByte != null)
        {
          j = paramArrayOfByte.size();
          if (localLinkedList1 == null) {
            break label771;
          }
        }
        for (int k = localLinkedList1.size();; k = 0)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetExpt", "update expt svrTime:%d interval:%d exptFlag:%d  deleteCount:[svr:%d local:%d] replaceCount:[svr:%d local:%d] cost[%d]", new Object[] { Integer.valueOf(n), Integer.valueOf(m), Integer.valueOf(i1), Integer.valueOf(j), Integer.valueOf(paramInt1), Integer.valueOf(k), Integer.valueOf(i), Long.valueOf(bi.bI(l1)) });
          break;
          j = 0;
          break label667;
        }
        h.mEJ.a(863L, 2L, 1L, false);
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NetSceneGetExpt", "get expt error");
        po((int)bi.VE());
        break;
      }
    }
  }
  
  public final int getType()
  {
    return 2738;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/expt/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */