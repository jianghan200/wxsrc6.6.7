package com.tencent.mm.plugin.shake.d.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aii;
import com.tencent.mm.protocal.c.aij;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  extends l
  implements k
{
  public com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  private String mYD;
  private int scene;
  
  public b(String paramString, int paramInt)
  {
    this.mYD = paramString;
    this.scene = paramInt;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = new b.a();
    parame1.dIG = new aii();
    parame1.dIH = new aij();
    parame1.uri = "/cgi-bin/micromsg-bin/gettvinfo";
    parame1.dIF = 552;
    parame1.dII = 0;
    parame1.dIJ = 0;
    this.diG = parame1.KT();
    parame1 = (aii)this.diG.dID.dIL;
    parame1.rLk = this.mYD;
    parame1.otY = this.scene;
    return a(parame, this.diG, this);
  }
  
  protected final int a(q paramq)
  {
    paramq = (aii)((com.tencent.mm.ab.b)paramq).dID.dIL;
    if ((paramq.otY < 0) || (paramq.rLk == null) || (paramq.rLk.length() <= 0))
    {
      x.e("MicroMsg.scanner.NetSceneGetTVInfo", "ERR: Security Check Failed, Scene = %s", new Object[] { Integer.valueOf(paramq.otY) });
      return l.b.dJn;
    }
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.scanner.NetSceneGetTVInfo", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 552;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/shake/d/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */