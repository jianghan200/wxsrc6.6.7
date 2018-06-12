package com.tencent.mm.plugin.mall.a;

import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.d.i;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.protocal.c.azr;
import com.tencent.mm.protocal.c.azs;
import com.tencent.mm.protocal.c.ccp;
import com.tencent.mm.protocal.c.ccr;
import com.tencent.mm.protocal.c.cct;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.aa.a;
import java.util.LinkedList;

public final class c
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public ccr kYf;
  
  public c()
  {
    Object localObject1 = new b.a();
    ((b.a)localObject1).dIG = new azr();
    ((b.a)localObject1).dIH = new azs();
    ((b.a)localObject1).uri = "/cgi-bin/mmpay-bin/payibggetoverseawallet";
    ((b.a)localObject1).dIF = 1577;
    this.diG = ((b.a)localObject1).KT();
    localObject1 = (azr)this.diG.dID.dIL;
    g.Ek();
    Object localObject2 = g.Ei().DT().get(aa.a.sSo, Boolean.valueOf(false));
    if (localObject2 != null) {}
    for (boolean bool = ((Boolean)localObject2).booleanValue();; bool = false)
    {
      if (bool) {}
      for (int i = 1;; i = 0)
      {
        ((azr)localObject1).scg = i;
        ((azr)localObject1).aem = w.chP();
        ((azr)localObject1).scj = Build.VERSION.RELEASE;
        ((azr)localObject1).sci = com.tencent.mm.sdk.platformtools.e.aj(null, d.qVN);
        ((azr)localObject1).sck = Build.MANUFACTURER;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetScenePayIBGGetOverseaWallet", "req IsShowTips %s language %s os_ver %s wxg_ver %s phone_type %s", new Object[] { Integer.valueOf(((azr)localObject1).scg), ((azr)localObject1).aem, ((azr)localObject1).scj, ((azr)localObject1).sci, ((azr)localObject1).sck });
        return;
      }
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetScenePayIBGGetOverseaWallet", "errCode " + paramInt3 + ", errMsg " + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (azs)((b)paramq).dIE.dIL;
      if ((paramq.scn == null) || (paramq.sco == null)) {
        break label232;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetScenePayIBGGetOverseaWallet", "onGYNetEnd wallet_region : %s wallet_gray_area: %s wallet_threepoint_area size: %s", new Object[] { Integer.valueOf(paramq.kYc), Integer.valueOf(paramq.scn.rFB.size()), Integer.valueOf(paramq.sco.rFB.size()) });
      if (paramq.scr != null)
      {
        this.kYf = paramq.scr;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetScenePayIBGGetOverseaWallet", "wallet_key_info flag %s wallet_key_info.url %s", new Object[] { Integer.valueOf(paramq.scr.syt), paramq.scr.url });
      }
    }
    for (;;)
    {
      g.Ek();
      g.Ei().DT().a(aa.a.sTs, Integer.valueOf(paramq.kYc));
      o.bPc().a(paramq.kYc, paramq);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      label232:
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetScenePayIBGGetOverseaWallet", "onGYNetEnd other is null " + paramq.kYc);
    }
  }
  
  public final String bbI()
  {
    if (this.kYf == null) {
      return "";
    }
    return this.kYf.url;
  }
  
  public final int getType()
  {
    return 1577;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/mall/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */