package com.tencent.mm.plugin.card.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bbh;
import com.tencent.mm.protocal.c.bbi;
import com.tencent.mm.sdk.platformtools.x;

public final class ag
  extends l
  implements k
{
  public String bYo;
  public String content;
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  public String fpc;
  public String hxm;
  public String hxn;
  public boolean hxo;
  public String hxp;
  public String hxq;
  public String hxr;
  public String hxs;
  public int status;
  
  public ag(int paramInt, String paramString1, String paramString2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bbh();
    ((b.a)localObject).dIH = new bbi();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/preacceptgiftcard";
    ((b.a)localObject).dIF = 1171;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bbh)this.diG.dID.dIL;
    ((bbh)localObject).qZT = paramInt;
    ((bbh)localObject).qZU = paramString1;
    ((bbh)localObject).qZV = paramString2;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetScenePreAcceptGiftCard", "onGYNetEnd, errType = %d, errCode = %d ,errMsg:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (bbi)this.diG.dIE.dIL;
      this.bYo = paramq.qZY;
      this.hxm = paramq.qZZ;
      this.status = paramq.status;
      this.content = paramq.content;
      this.hxn = paramq.hwH;
      this.fpc = paramq.sdu;
      this.hxo = paramq.hxo;
      this.hxp = paramq.sdv;
      this.hxq = paramq.sdw;
      this.hxr = paramq.sdx;
      this.hxs = paramq.sdy;
      x.d("MicroMsg.NetScenePreAcceptGiftCard", "fromUserName:%s, fromUserHeadImgUrl:%s, status:%d, content:%s,buttonWording:%s, backgroundColor:%s, ignore:%b", new Object[] { this.bYo, this.hxm, Integer.valueOf(this.status), this.content, this.hxn, this.fpc, Boolean.valueOf(this.hxo) });
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1171;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/card/model/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */