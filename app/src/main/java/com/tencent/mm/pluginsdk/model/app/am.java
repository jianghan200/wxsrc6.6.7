package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.yf;
import com.tencent.mm.protocal.c.yg;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;

public final class am
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  private int eiF;
  private String jOg;
  
  public am(int paramInt, String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new yf();
    ((b.a)localObject).dIH = new yg();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/gamereportkv";
    ((b.a)localObject).dIF = 427;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (yf)this.diG.dID.dIL;
    ((yf)localObject).rjL = d.qVI;
    ((yf)localObject).rjM = d.qVH;
    ((yf)localObject).rjN = d.qVK;
    ((yf)localObject).rjO = d.qVL;
    ((yf)localObject).rjP = w.chP();
    ((yf)localObject).mEk = paramInt;
    ((yf)localObject).rjQ = paramString;
    this.eiF = paramInt;
    this.jOg = paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MircoMsg.NetsceneGameKVReport", "errType = " + paramInt2 + ", errCode = " + paramInt3 + ", logId = " + this.eiF + ", logExt = " + this.jOg);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 427;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/pluginsdk/model/app/am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */