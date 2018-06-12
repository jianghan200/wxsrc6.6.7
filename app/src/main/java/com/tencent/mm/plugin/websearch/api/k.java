package com.tencent.mm.plugin.websearch.api;

import android.os.Build.VERSION;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.cfi;
import com.tencent.mm.protocal.c.cfj;
import com.tencent.mm.protocal.c.ps;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class k
  extends a
  implements com.tencent.mm.network.k
{
  private j dFC;
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public k(j paramj)
  {
    this.dFC = paramj;
    this.pKM = paramj.bHt;
    this.tH = paramj.offset;
    this.fdx = paramj.scene;
    this.pKL = paramj.bWo;
    this.dFC = paramj;
    this.pKN = paramj.pLg;
    Object localObject1 = new b.a();
    ((b.a)localObject1).dIF = 1943;
    ((b.a)localObject1).uri = "/cgi-bin/mmsearch-bin/mmwebrecommend";
    ((b.a)localObject1).dIG = new cfi();
    ((b.a)localObject1).dIH = new cfj();
    this.diG = ((b.a)localObject1).KT();
    localObject1 = (cfi)this.diG.dID.dIL;
    ((cfi)localObject1).rjC = paramj.offset;
    ((cfi)localObject1).rUH = p.zP(1);
    ((cfi)localObject1).shN = paramj.pKO;
    ((cfi)localObject1).rDH = paramj.bHt;
    ((cfi)localObject1).rUI = p.JU();
    ((cfi)localObject1).otY = paramj.scene;
    ((cfi)localObject1).rlo = paramj.iow;
    ((cfi)localObject1).szP = paramj.pKQ;
    ((cfi)localObject1).syI = paramj.pKV;
    ((cfi)localObject1).spQ = paramj.bxk;
    ((cfi)localObject1).szR = paramj.pLi;
    Object localObject2 = new ps();
    ((ps)localObject2).aAL = "client_system_version";
    ((ps)localObject2).rtU = Build.VERSION.SDK_INT;
    paramj.pKZ.add(localObject2);
    ((cfi)localObject1).szQ = paramj.pKZ;
    ((cfi)localObject1).syL = paramj.bJK;
    this.bWs = paramj.kJG;
    int i;
    String str;
    int j;
    if (paramj.pLj)
    {
      i = paramj.scene;
      localObject1 = paramj.bJK;
      localObject2 = paramj.bWr;
      str = paramj.iow;
      j = paramj.offset;
      if (paramj.pKO != 1) {
        break label361;
      }
    }
    for (;;)
    {
      o.a(i, (String)localObject1, (String)localObject2, str, j, bool, paramj.kJG, paramj.bHt, paramj.iPZ, paramj.pLf);
      return;
      label361:
      bool = false;
    }
  }
  
  private cfj bSJ()
  {
    return (cfj)this.diG.dIE.dIL;
  }
  
  public final String JS()
  {
    if (bSJ() != null) {
      return bSJ().rjK;
    }
    return "";
  }
  
  public final int JT()
  {
    if (bSJ() != null) {
      return bSJ().syR;
    }
    return 0;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    ad.reportIdKey649ForLook(this.fdx, 2);
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.FTS.NetSceneWebRecommend", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    boolean bool1;
    boolean bool2;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      bool1 = true;
      if (this.dFC.pLj)
      {
        paramInt1 = this.dFC.scene;
        paramq = this.dFC.bJK;
        paramArrayOfByte = this.dFC.bWr;
        String str = this.dFC.iow;
        int i = this.dFC.offset;
        if (this.dFC.pKO != 1) {
          break label196;
        }
        bool2 = true;
        label118:
        o.a(paramInt1, paramq, paramArrayOfByte, str, i, bool2, this.dFC.kJG, bool1, this.dFC.bHt, this.dFC.iPZ, this.dFC.pLf);
      }
      if (paramInt3 != -1) {
        break label202;
      }
      ad.reportIdKey649ForLook(this.fdx, 4);
    }
    for (;;)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      bool1 = false;
      break;
      label196:
      bool2 = false;
      break label118;
      label202:
      if ((paramInt2 != 0) || (paramInt3 != 0)) {
        ad.reportIdKey649ForLook(this.fdx, 8);
      } else {
        ad.reportIdKey649ForLook(this.fdx, 3);
      }
    }
  }
  
  public final int getType()
  {
    return 1943;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/websearch/api/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */