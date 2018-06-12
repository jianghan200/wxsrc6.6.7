package com.tencent.mm.plugin.wallet_ecard.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.gw;
import com.tencent.mm.protocal.c.gx;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public gx pBX;
  
  public c(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new gw();
    ((b.a)localObject).dIH = new gx();
    ((b.a)localObject).dIF = 1986;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/bindecard";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (gw)this.diG.dID.dIL;
    ((gw)localObject).rhb = paramString1;
    ((gw)localObject).rhc = paramString2;
    ((gw)localObject).pqM = paramString3;
    ((gw)localObject).rhd = paramString4;
    ((gw)localObject).bVB = paramInt;
    x.i("MicroMsg.NetSceneBindECard", "cardType: %s, reqSerial: %s, openScene: %s, verifyCode: %s, bindToken: %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt), paramString3, paramString4 });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneBindECard", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.pBX = ((gx)((b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneBindECard", "ret_code: %d, ret_msg: %s", new Object[] { Integer.valueOf(this.pBX.hwV), this.pBX.hwW });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1986;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_ecard/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */