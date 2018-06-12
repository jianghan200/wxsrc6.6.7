package com.tencent.mm.plugin.topstory.a.c;

import android.os.Build.VERSION;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.websearch.api.ad;
import com.tencent.mm.plugin.websearch.api.p;
import com.tencent.mm.protocal.c.bte;
import com.tencent.mm.protocal.c.cfi;
import com.tencent.mm.protocal.c.cfj;
import com.tencent.mm.protocal.c.ps;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
  extends l
  implements k
{
  public bte ccA;
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public a(bte parambte)
  {
    x.i("MicroMsg.TopStory.NetSceneTopStory", "Create NetSceneTopStory Home %s %s", new Object[] { parambte.sqA, parambte.bJK });
    this.ccA = parambte;
    Object localObject = new b.a();
    ((b.a)localObject).dIF = 1943;
    ((b.a)localObject).uri = "/cgi-bin/mmsearch-bin/mmwebrecommend";
    ((b.a)localObject).dIG = new cfi();
    ((b.a)localObject).dIH = new cfj();
    this.diG = ((b.a)localObject).KT();
    localObject = (cfi)this.diG.dID.dIL;
    ((cfi)localObject).rjC = parambte.offset;
    ((cfi)localObject).rUH = p.zP(1);
    ((cfi)localObject).rDH = parambte.bHt;
    ((cfi)localObject).rUI = p.JU();
    ((cfi)localObject).otY = parambte.scene;
    ((cfi)localObject).rlo = parambte.fuu;
    ((cfi)localObject).szQ.addAll(parambte.pKZ);
    ((cfi)localObject).spQ = parambte.bxk;
    ((cfi)localObject).szR = parambte.pLi;
    parambte = new ps();
    parambte.aAL = "client_system_version";
    parambte.rtU = Build.VERSION.SDK_INT;
    ((cfi)localObject).szQ.add(parambte);
    parambte = new ps();
    parambte.aAL = "nettype";
    parambte.rtV = p.bjC();
    ((cfi)localObject).szQ.add(parambte);
    parambte = new ps();
    parambte.aAL = "client_request_time";
    parambte.rtV = String.valueOf(System.currentTimeMillis());
    ((cfi)localObject).szQ.add(parambte);
    parambte = ((cfi)localObject).szQ.iterator();
    while (parambte.hasNext())
    {
      localObject = (ps)parambte.next();
      x.i("MicroMsg.TopStory.NetSceneTopStory", "key: %s unit_value %s text_value %s", new Object[] { ((ps)localObject).aAL, Long.valueOf(((ps)localObject).rtU), ((ps)localObject).rtV });
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    ad.reportIdKey649ForLook(this.ccA.scene, 2);
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.TopStory.NetSceneTopStory", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (paramInt3 == -1) {
      ad.reportIdKey649ForLook(this.ccA.scene, 4);
    }
    for (;;)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      if ((paramInt2 != 0) || (paramInt3 != 0)) {
        ad.reportIdKey649ForLook(this.ccA.scene, 8);
      } else {
        ad.reportIdKey649ForLook(this.ccA.scene, 3);
      }
    }
  }
  
  public final cfj bHD()
  {
    return (cfj)this.diG.dIE.dIL;
  }
  
  public final int getType()
  {
    return 1943;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/topstory/a/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */