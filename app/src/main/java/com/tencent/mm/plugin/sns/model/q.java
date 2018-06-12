package com.tencent.mm.plugin.sns.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.boy;
import com.tencent.mm.protocal.c.boz;
import com.tencent.mm.protocal.c.bpa;
import com.tencent.mm.sdk.platformtools.x;
import java.util.List;
import java.util.Vector;

public final class q
  extends l
  implements k
{
  public static List<Long> nnQ = new Vector();
  public b diG;
  public com.tencent.mm.ab.e diJ;
  private long nkI;
  
  public q(long paramLong)
  {
    this.nkI = paramLong;
    b.a locala = new b.a();
    locala.dIG = new boz();
    locala.dIH = new bpa();
    locala.uri = "/cgi-bin/micromsg-bin/mmsnsobjectdetail";
    locala.dIF = 210;
    locala.dII = 101;
    locala.dIJ = 1000000101;
    this.diG = locala.KT();
    ((boz)this.diG.dID.dIL).rlK = paramLong;
    x.d("MicroMsg.NetSceneSnsObjectDetial", "req snsId " + paramLong);
  }
  
  public static boolean eK(long paramLong)
  {
    if (nnQ.contains(Long.valueOf(paramLong))) {
      return false;
    }
    nnQ.add(Long.valueOf(paramLong));
    return true;
  }
  
  private static boolean eL(long paramLong)
  {
    nnQ.remove(Long.valueOf(paramLong));
    return true;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      eL(this.nkI);
      return;
    }
    paramq = ((bpa)this.diG.dIE.dIL).snd;
    if (paramq != null) {
      x.i("MicroMsg.NetSceneSnsObjectDetial", "snsdetail xml " + ab.b(paramq.smH));
    }
    aj.d(paramq);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
    eL(this.nkI);
  }
  
  public final int getType()
  {
    return 210;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/model/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */