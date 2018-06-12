package com.tencent.mm.plugin.sns.a.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.apy;
import com.tencent.mm.protocal.c.apz;
import com.tencent.mm.protocal.c.bk;
import com.tencent.mm.protocal.c.bl;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.aa.a;
import java.util.LinkedList;
import java.util.List;

public final class e
  extends l
  implements k
{
  private b diG;
  public com.tencent.mm.ab.e diJ;
  public List<apz> gxs;
  
  public e(List<apz> paramList)
  {
    Object localObject = new b.a();
    this.gxs = paramList;
    ((b.a)localObject).dIG = new bk();
    ((b.a)localObject).dIH = new bl();
    ((b.a)localObject).uri = "/cgi-bin/mmux-bin/adlog";
    ((b.a)localObject).dIF = 1802;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bk)this.diG.dID.dIL;
    apy localapy = new apy();
    localapy.rjL = d.qVI;
    localapy.rjM = d.qVH;
    localapy.rjN = d.qVK;
    localapy.rjO = d.qVL;
    localapy.rjP = w.chP();
    localapy.rSA = ((int)(System.currentTimeMillis() / 1000L));
    ((bk)localObject).rbM = localapy;
    while (i < paramList.size())
    {
      ((bk)localObject).rbN.add(paramList.get(i));
      i += 1;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneAdLog", "report count: " + ((bk)localObject).rbN.size());
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneAdLog", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramInt1 = ((bl)((b)paramq).dIE.dIL).rbO;
      g.Ek();
      g.Ei().DT().a(aa.a.sQI, Integer.valueOf(paramInt1));
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1802;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/a/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */