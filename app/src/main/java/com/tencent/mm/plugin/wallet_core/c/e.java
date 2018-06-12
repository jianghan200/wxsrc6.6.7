package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.zv;
import com.tencent.mm.protocal.c.zw;
import com.tencent.mm.sdk.platformtools.x;

public final class e
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public zw pja;
  
  public e(String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new zv();
    ((b.a)localObject).dIH = new zw();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/tenpay/getbanpaymobileinfo";
    ((b.a)localObject).dIF = 1667;
    this.diG = ((b.a)localObject).KT();
    localObject = (zv)this.diG.dID.dIL;
    x.d("MicroMsg.NetSceneGetBanpayMobileInfo", "req_key: %s", new Object[] { paramString });
    ((zv)localObject).bQa = paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGetBanpayMobileInfo", "NetSceneGetBanpayMobileInfo, netId: %s, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.pja = ((zw)this.diG.dIE.dIL);
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1667;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */