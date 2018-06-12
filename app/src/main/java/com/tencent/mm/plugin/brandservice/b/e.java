package com.tencent.mm.plugin.brandservice.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.brandservice.a;
import com.tencent.mm.protocal.c.ai;
import com.tencent.mm.protocal.c.yu;
import com.tencent.mm.protocal.c.yv;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Iterator;
import java.util.LinkedList;

public final class e
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  LinkedList<String> hnM;
  
  public e()
  {
    Object localObject1 = new b.a();
    ((b.a)localObject1).dIG = new yu();
    ((b.a)localObject1).dIH = new yv();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/getapplist";
    ((b.a)localObject1).dIF = 387;
    ((b.a)localObject1).dII = 0;
    ((b.a)localObject1).dIJ = 0;
    this.diG = ((b.a)localObject1).KT();
    this.hnM = new LinkedList();
    yu localyu = (yu)this.diG.dID.dIL;
    g.Ek();
    Object localObject2 = g.Ei().DT().get(196610, null);
    if (localObject2 == null) {}
    for (localObject1 = "null";; localObject1 = localObject2.toString())
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BrandService.BrandServiceApplication", "get config, key[%d], value[%s]", new Object[] { Integer.valueOf(196610), localObject1 });
      localyu.rEY = bi.a((Integer)localObject2, 0);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BrandService.NetSceneGetAppList", "info: request hash code %d", new Object[] { Integer.valueOf(localyu.rEY) });
      return;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BrandService.NetSceneGetAppList", "do scene");
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BrandService.NetSceneGetAppList", "on scene end code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (yv)this.diG.dIE.dIL;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BrandService.NetSceneGetAppList", "ok, hash code is %d, count is %d", new Object[] { Integer.valueOf(paramq.rEY), Integer.valueOf(paramq.hbF) });
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BrandService.NetSceneGetAppList", "result list is %s", new Object[] { paramq.hbG.toString() });
      a.g(196610, Integer.valueOf(paramq.rEY));
      paramq = paramq.hbG.iterator();
      while (paramq.hasNext())
      {
        paramArrayOfByte = (ai)paramq.next();
        this.hnM.add(paramArrayOfByte.hbL);
      }
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 387;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/brandservice/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */