package com.tencent.mm.plugin.webview.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.c.ant;
import com.tencent.mm.protocal.c.apl;
import com.tencent.mm.protocal.c.apm;
import com.tencent.mm.protocal.c.apy;
import com.tencent.mm.protocal.c.apz;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class q
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  
  public q(List<apz> paramList)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new apl();
    ((b.a)localObject).dIH = new apm();
    ((b.a)localObject).uri = "/cgi-bin/mmux-bin/jslog";
    ((b.a)localObject).dIF = 1803;
    this.diG = ((b.a)localObject).KT();
    localObject = (apl)this.diG.dID.dIL;
    apy localapy = new apy();
    localapy.rjL = d.qVI;
    localapy.rjM = d.qVH;
    localapy.rjN = d.qVK;
    localapy.rjO = d.qVL;
    localapy.rjP = w.chP();
    localapy.rSA = ((int)(System.currentTimeMillis() / 1000L));
    ((apl)localObject).rbM = localapy;
    ((apl)localObject).rbN.addAll(paramList);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    x.d("MicroMsg.NetSceneJsLog", "doScene");
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneJsLog", "onGYNetEnd, netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (apm)((b)paramq).dIE.dIL;
      x.i("MicroMsg.NetSceneJsLog", "received InvalidLogList: ");
      paramArrayOfByte = new StringBuilder("{ ");
      if (!bi.cX(paramq.rSm)) {
        break label155;
      }
      paramArrayOfByte.append("{  }");
    }
    for (;;)
    {
      paramArrayOfByte.append(" }");
      x.i("MicroMsg.NetSceneJsLog", paramArrayOfByte.toString());
      f.a.bTW();
      f.cM(paramq.rSm);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      label155:
      Iterator localIterator = paramq.rSm.iterator();
      while (localIterator.hasNext())
      {
        ant localant = (ant)localIterator.next();
        paramArrayOfByte.append(String.format(" { logId(%d), interval(%d) },", new Object[] { Integer.valueOf(localant.rQv), Integer.valueOf(localant.rQw) }));
      }
    }
  }
  
  public final int getType()
  {
    return 1803;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/webview/model/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */