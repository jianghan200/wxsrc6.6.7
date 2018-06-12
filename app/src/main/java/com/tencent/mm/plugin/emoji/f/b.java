package com.tencent.mm.plugin.emoji.f;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.dz;
import com.tencent.mm.protocal.c.ea;
import com.tencent.mm.protocal.c.tq;
import com.tencent.mm.sdk.platformtools.x;
import java.text.DecimalFormat;

public final class b
  extends l
  implements k
{
  public static int iii = 6;
  public static int iij = 7;
  public static int iik = 10;
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e doG;
  private String iil;
  private tq iim;
  
  public b(String paramString, tq paramtq)
  {
    b.a locala = new b.a();
    locala.dIG = new dz();
    locala.dIH = new ea();
    locala.uri = "/cgi-bin/micromsg-bin/mmaskforreward";
    locala.dIF = 830;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    this.iil = paramString;
    this.iim = paramtq;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.doG = parame1;
    parame1 = (dz)this.diG.dID.dIL;
    parame1.rem = this.iil;
    tq localtq = new tq();
    localtq.jTh = this.iim.jTh;
    localtq.rxo = this.iim.rxo;
    localtq.rxn = new DecimalFormat("0.00").format(Float.valueOf(this.iim.rxn));
    parame1.ren = localtq;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.emoji.NetSceneAskForReward", "onGYNetEnd ErrType:%d, errCode:%d, errMsg", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.doG.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final ea aEJ()
  {
    return (ea)this.diG.dIE.dIL;
  }
  
  public final int getType()
  {
    return 830;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/emoji/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */