package com.tencent.mm.plugin.scanner.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.id;
import com.tencent.mm.protocal.c.ie;
import com.tencent.mm.sdk.platformtools.x;

public final class d
  extends l
  implements k
{
  private String bKk;
  public b diG;
  private com.tencent.mm.ab.e diJ;
  private String hWu;
  private int scene;
  
  public d(String paramString1, int paramInt, String paramString2)
  {
    this.bKk = paramString1;
    this.scene = paramInt;
    this.hWu = paramString2;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = new b.a();
    parame1.dIG = new id();
    parame1.dIH = new ie();
    parame1.uri = "/cgi-bin/mmbiz-bin/usrmsg/bizscangetproductinfo";
    parame1.dIF = 1063;
    parame1.dII = 0;
    parame1.dIJ = 0;
    this.diG = parame1.KT();
    parame1 = (id)this.diG.dID.dIL;
    parame1.rem = this.bKk;
    parame1.otY = this.scene;
    parame1.rjh = this.hWu;
    return a(parame, this.diG, this);
  }
  
  protected final int a(q paramq)
  {
    paramq = (id)((b)paramq).dID.dIL;
    if ((paramq.otY < 0) || (paramq.rem == null) || (paramq.rem.length() <= 0))
    {
      x.e("MicroMsg.scanner.NetSceneGetProductInfo", "ERR: Security Check Failed, Scene = %s", new Object[] { Integer.valueOf(paramq.otY) });
      return l.b.dJn;
    }
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.scanner.NetSceneGetProductInfo", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1063;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/scanner/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */