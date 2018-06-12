package com.tencent.mm.plugin.walletlock.fingerprint.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.btl;
import com.tencent.mm.protocal.c.btm;
import com.tencent.mm.sdk.platformtools.x;

public final class e
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  String jgX;
  boolean pGF = false;
  
  public e(String paramString1, String paramString2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new btl();
    ((b.a)localObject).dIH = new btm();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/touchlockgetchallenge";
    ((b.a)localObject).dIF = 1548;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (btl)this.diG.dID.dIL;
    ((btl)localObject).scene = 1548;
    ((btl)localObject).onE = paramString1;
    ((btl)localObject).onF = paramString2;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGetTouchWalletLockChallenge", "alvinluo get touch wallet lock challenge errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramq = (btm)((b)paramq).dIE.dIL;
    this.jgX = paramq.jgX;
    x.d("MicroMsg.NetSceneGetTouchWalletLockChallenge", "alvinluo get touch lock challenge: %s", new Object[] { this.jgX });
    if (paramq.soi == 1) {}
    for (this.pGF = true;; this.pGF = false)
    {
      if (this.diJ != null) {
        this.diJ.a(paramInt2, paramInt3, paramString, this);
      }
      return;
    }
  }
  
  public final int getType()
  {
    return 1548;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/walletlock/fingerprint/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */