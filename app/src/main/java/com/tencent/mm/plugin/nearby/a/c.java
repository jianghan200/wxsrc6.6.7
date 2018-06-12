package com.tencent.mm.plugin.nearby.a;

import com.tencent.mm.aa.j;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.model.au;
import com.tencent.mm.modelstat.o;
import com.tencent.mm.protocal.c.aqp;
import com.tencent.mm.protocal.c.aqt;
import com.tencent.mm.protocal.c.aqu;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.storage.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class c
  extends l
  implements com.tencent.mm.network.k
{
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  
  public c(int paramInt1, float paramFloat1, float paramFloat2, int paramInt2, int paramInt3, String paramString1, String paramString2)
  {
    if ((paramInt1 != 1) && (paramInt1 != 2) && (paramInt1 != 3) && (paramInt1 != 4)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneLbsP", "OpCode Error :" + paramInt1);
    }
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new aqt();
    ((b.a)localObject).dIH = new aqu();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/lbsfind";
    ((b.a)localObject).dIF = 148;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (aqt)this.diG.dID.dIL;
    ((aqt)localObject).qZc = paramInt1;
    ((aqt)localObject).rmr = paramFloat1;
    ((aqt)localObject).rms = paramFloat2;
    ((aqt)localObject).ryV = paramInt2;
    ((aqt)localObject).ryW = paramString1;
    ((aqt)localObject).ryX = paramString2;
    ((aqt)localObject).ryY = paramInt3;
    ((aqt)localObject).rTr = new bhy().bq(com.tencent.mm.plugin.normsg.a.b.lFJ.bjE());
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneLbsP", "Req: opcode:" + paramInt1 + " lon:" + paramFloat1 + " lat:" + paramFloat2 + " pre:" + paramInt2 + " gpsSource:" + paramInt3 + " mac" + paramString1 + " cell:" + paramString2 + " ccdLen:" + ((aqt)localObject).rTr.siI);
    o.a(2001, paramFloat1, paramFloat2, paramInt2);
  }
  
  public final int Oh()
  {
    return ((aqt)this.diG.dID.dIL).qZc;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneLbsP", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    paramq = (aqu)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    paramArrayOfByte = new ArrayList();
    paramInt1 = 0;
    while (paramInt1 < paramq.rHc.size())
    {
      j localj = new j();
      localj.username = ((aqp)paramq.rHc.get(paramInt1)).hbL;
      localj.csA = ((aqp)paramq.rHc.get(paramInt1)).rcm;
      localj.dHR = ((aqp)paramq.rHc.get(paramInt1)).rqZ;
      localj.dHQ = ((aqp)paramq.rHc.get(paramInt1)).rra;
      localj.by(true);
      paramArrayOfByte.add(localj);
      paramInt1 += 1;
    }
    com.tencent.mm.aa.q.KH().L(paramArrayOfByte);
    if ((Oh() == 1) || (Oh() == 3) || (Oh() == 4))
    {
      if ((paramInt2 != 0) && (paramInt3 == 63535))
      {
        au.HU();
        com.tencent.mm.model.c.DT().set(8210, Long.valueOf(0L));
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
      }
      au.HU();
      com.tencent.mm.model.c.DT().set(8210, Long.valueOf(System.currentTimeMillis() + paramq.rTs * 1000));
    }
    for (;;)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      if (Oh() == 2)
      {
        au.HU();
        com.tencent.mm.model.c.DT().set(8210, Long.valueOf(0L));
      }
    }
  }
  
  public final boolean biQ()
  {
    return ((aqu)this.diG.dIE.dIL).rTt == 1;
  }
  
  public final int biR()
  {
    return ((aqu)this.diG.dIE.dIL).rTu;
  }
  
  public final List<aqp> biS()
  {
    LinkedList localLinkedList = ((aqu)this.diG.dIE.dIL).rHc;
    if (localLinkedList != null)
    {
      Iterator localIterator = localLinkedList.iterator();
      while (localIterator.hasNext())
      {
        aqp localaqp = (aqp)localIterator.next();
        au.HU();
        com.tencent.mm.model.c.Gw().fX(localaqp.hbL, localaqp.rEJ);
      }
    }
    return localLinkedList;
  }
  
  public final int getType()
  {
    return 148;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/nearby/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */