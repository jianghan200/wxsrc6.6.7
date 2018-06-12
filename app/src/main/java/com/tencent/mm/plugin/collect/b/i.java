package com.tencent.mm.plugin.collect.b;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.lu;
import com.tencent.mm.protocal.c.lv;
import com.tencent.mm.sdk.platformtools.x;

public final class i
  extends l
  implements k
{
  public String bJh;
  private com.tencent.mm.ab.e diJ;
  private com.tencent.mm.ab.b eAN;
  public lv hUi;
  
  public i(int paramInt, com.tencent.mm.bk.b paramb, String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new lu();
    ((b.a)localObject).dIH = new lv();
    ((b.a)localObject).dIF = 1384;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/getf2frcvvoice";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.eAN = ((b.a)localObject).KT();
    localObject = (lu)this.eAN.dID.dIL;
    ((lu)localObject).amount = paramInt;
    ((lu)localObject).rpW = 1;
    ((lu)localObject).hUM = paramString;
    ((lu)localObject).rpU = null;
    ((lu)localObject).rpV = paramb;
    this.bJh = paramString;
    x.i("MicroMsg.NetSceneF2FRcvVoice", "amount: %d, outtradeno: %s", new Object[] { Integer.valueOf(paramInt), paramString });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.eAN, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneF2FRcvVoice", "errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.hUi = ((lv)((com.tencent.mm.ab.b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneF2FRcvVoice", "ret_code: %d, ret_msg: %s，voice_type: %d", new Object[] { Integer.valueOf(this.hUi.hUm), this.hUi.hUn, Integer.valueOf(this.hUi.rpW) });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1384;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/collect/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */