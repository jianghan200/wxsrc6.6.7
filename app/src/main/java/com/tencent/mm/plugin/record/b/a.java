package com.tencent.mm.plugin.record.b;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.record.a.g;
import com.tencent.mm.protocal.c.btr;
import com.tencent.mm.protocal.c.gp;
import com.tencent.mm.protocal.c.gq;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.y.g.a;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ = null;
  private int iWL = 0;
  private int iWP = 0;
  String mrK = "";
  g mrL = null;
  private SparseArray<vx> mrM = new SparseArray();
  private SparseBooleanArray mrN = new SparseBooleanArray();
  
  public a(g paramg)
  {
    b.a locala = new b.a();
    locala.dIG = new gp();
    locala.dIH = new gq();
    locala.uri = "/cgi-bin/micromsg-bin/batchtranscdnitem";
    locala.dIF = 632;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    this.mrL = paramg;
  }
  
  private void bqr()
  {
    this.mrK = g.a.a(h.a(this.mrL.field_title, this.mrL.field_desc, this.mrL.field_dataProto), null, null);
  }
  
  protected final int Cc()
  {
    return 10;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = (gp)this.diG.dID.dIL;
    this.mrM.clear();
    this.mrN.clear();
    if (this.mrL.field_dataProto.rBI.size() == 0)
    {
      x.e("MicroMsg.NetSceneTransCDN", "doScene data list null");
      this.iWP = -100;
      return -100;
    }
    LinkedList localLinkedList = new LinkedList();
    int i = this.iWL;
    vx localvx;
    if (i < this.mrL.field_dataProto.rBI.size())
    {
      localvx = (vx)this.mrL.field_dataProto.rBI.get(i);
      if ((!localvx.rzG) || (!bi.oW(localvx.rzo))) {}
    }
    for (int j = 0;; j = 1)
    {
      this.iWL = (i + 1);
      parame1.hbF = localLinkedList.size();
      parame1.hbG.clear();
      parame1.hbG.addAll(localLinkedList);
      x.i("MicroMsg.NetSceneTransCDN", "ashutest::data list size %d, need check size %d, nextIndex %d", new Object[] { Integer.valueOf(this.mrL.field_dataProto.rBI.size()), Integer.valueOf(this.mrM.size()), Integer.valueOf(this.iWL) });
      if ((parame1.hbF <= 0) || (j == 0))
      {
        bqr();
        x.w("MicroMsg.NetSceneTransCDN", "doScene no more data");
        this.iWP = -100;
        return -100;
        btr localbtr;
        if (!bi.oW(localvx.rzo))
        {
          localbtr = new btr();
          localbtr.rmC = localvx.rzo;
          localbtr.rwn = localvx.rzq;
          localbtr.srj = localvx.bjS;
          localbtr.srk = ((int)localvx.rzJ);
          localbtr.sri = bi.aG(localvx.jdM, "").hashCode();
          x.d("MicroMsg.NetSceneTransCDN", "add cdnitem, clientID[%d] dataID[%s] datatype[%d] dataurl[%s] size[%d]", new Object[] { Integer.valueOf(localbtr.sri), localvx.jdM, Integer.valueOf(localbtr.srj), localvx.rzo, Long.valueOf(localvx.rzJ) });
          localLinkedList.add(localbtr);
          this.mrM.put(localbtr.sri, localvx);
          this.mrN.put(localbtr.sri, false);
        }
        if (!bi.oW(localvx.dwE))
        {
          localbtr = new btr();
          localbtr.rmC = localvx.dwE;
          localbtr.rwn = localvx.rzk;
          localbtr.srj = 2;
          localbtr.srk = ((int)localvx.rzU);
          localbtr.sri = (bi.aG(localvx.jdM, "") + "@thumb").hashCode();
          x.d("MicroMsg.NetSceneTransCDN", "add cdnitem, clientID[%d] thumbID[%s_t] datatype[%d] thumburl[%s] size[%d]", new Object[] { Integer.valueOf(localbtr.sri), localvx.jdM, Integer.valueOf(localbtr.srj), localvx.dwE, Long.valueOf(localvx.rzU) });
          localLinkedList.add(localbtr);
          this.mrM.put(localbtr.sri, localvx);
          this.mrN.put(localbtr.sri, true);
        }
        if (localLinkedList.size() >= 20) {
          continue;
        }
        i += 1;
        break;
      }
      return a(parame, this.diG, this);
    }
  }
  
  protected final int a(q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneTransCDN", "netId %d errType %d errCode %d localErrCode %d begIndex %d errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(this.iWP), Integer.valueOf(this.iWL), paramString });
    if ((paramInt2 == 3) && (this.iWP == -100))
    {
      bqr();
      this.diJ.a(0, 0, paramString, this);
    }
    label602:
    label607:
    label610:
    for (;;)
    {
      return;
      if ((paramInt2 != 0) || (paramInt3 != 0))
      {
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
      }
      paramq = ((gq)((b)paramq).dIE.dIL).hbG.iterator();
      while (paramq.hasNext())
      {
        paramArrayOfByte = (btr)paramq.next();
        vx localvx = (vx)this.mrM.get(paramArrayOfByte.sri);
        if (localvx != null) {
          if (this.mrN.get(paramArrayOfByte.sri))
          {
            x.i("MicroMsg.NetSceneTransCDN", "trans end, client id[%d], dataId[%s], isThumb[true], old thumb url[%s], new thumb url[%s], old size[%d], new size[%d]", new Object[] { Integer.valueOf(paramArrayOfByte.sri), localvx.jdM, localvx.dwE, paramArrayOfByte.rmC, Long.valueOf(localvx.rzU), Long.valueOf(paramArrayOfByte.srk) });
            localvx.UD(paramArrayOfByte.rmC);
            localvx.UE(paramArrayOfByte.rwn);
            if ((!bi.oW(paramArrayOfByte.rmC)) && (!bi.oW(paramArrayOfByte.rwn)) && (paramArrayOfByte.srk > 0L))
            {
              localvx.fP(paramArrayOfByte.srk);
            }
            else
            {
              x.w("MicroMsg.NetSceneTransCDN", "match error server return");
              paramInt2 = 3;
            }
          }
          else
          {
            x.i("MicroMsg.NetSceneTransCDN", "trans end, client id[%d], dataId[%s], isThumb[false], old url[%s], new url[%s], old size[%d], new size[%d]", new Object[] { Integer.valueOf(paramArrayOfByte.sri), localvx.jdM, localvx.rzo, paramArrayOfByte.rmC, Long.valueOf(localvx.rzJ), Long.valueOf(paramArrayOfByte.srk) });
            localvx.UF(paramArrayOfByte.rmC);
            localvx.UG(paramArrayOfByte.rwn);
            if ((!bi.oW(paramArrayOfByte.rmC)) && (!bi.oW(paramArrayOfByte.rwn)) && (paramArrayOfByte.srk > 0L))
            {
              localvx.fO(paramArrayOfByte.srk);
            }
            else
            {
              x.w("MicroMsg.NetSceneTransCDN", "match error server return");
              paramInt2 = 3;
            }
          }
        }
      }
      boolean bool;
      if (this.iWL < this.mrL.field_dataProto.rBI.size())
      {
        bool = true;
        x.i("MicroMsg.NetSceneTransCDN", "check need continue, indexOK %B", new Object[] { Boolean.valueOf(bool) });
        if (!bool) {
          break label607;
        }
        if (a(this.dIX, this.diJ) != -100) {
          break label602;
        }
        paramInt1 = 1;
      }
      for (;;)
      {
        if (paramInt1 == 0) {
          break label610;
        }
        x.i("MicroMsg.NetSceneTransCDN", "do callback");
        bqr();
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
        bool = false;
        break;
        paramInt1 = 0;
        continue;
        paramInt1 = 1;
      }
    }
  }
  
  public final int getType()
  {
    return 632;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/record/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */