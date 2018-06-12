package com.tencent.mm.plugin.wallet_core.c.a;

import android.content.Context;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.wallet_core.c.m;

public final class b
  extends m
{
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public String jumpUrl;
  public int pjQ = 0;
  
  public b()
  {
    b.a locala = new b.a();
    azp localazp = new azp();
    g.Ek();
    Object localObject = g.Ei().DT().get(aa.a.sSo, Boolean.valueOf(false));
    if (localObject != null) {}
    for (boolean bool = ((Boolean)localObject).booleanValue();; bool = false)
    {
      if (bool) {}
      for (int i = 1;; i = 0)
      {
        localazp.scg = i;
        locala.dIG = localazp;
        locala.dIH = new azq();
        locala.uri = "/cgi-bin/mmpay-bin/payibggetjumpurl";
        locala.dIF = 1564;
        locala.dII = 0;
        locala.dIJ = 0;
        this.diG = locala.KT();
        return;
      }
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneIbgPayGetJumpUrl", "hy: get ibg jump url raw net errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    paramq = (azq)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneIbgPayGetJumpUrl", "hy: get ibg pay jump url. biz_errcode: %d, biz_errmsg: %s", new Object[] { Integer.valueOf(paramq.iwS), paramq.iwT });
      paramString = paramq.iwT;
      paramInt2 = paramq.iwS;
      this.jumpUrl = paramq.jOU;
      this.pjQ = paramq.sch;
    }
    for (;;)
    {
      paramq = paramString;
      if (bi.oW(paramString)) {
        paramq = ad.getContext().getString(a.i.wallet_data_err);
      }
      this.diJ.a(paramInt1, paramInt2, paramq, this);
      return;
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneIbgPayGetJumpUrl", "hy: get ibg pay jump url failed");
      this.jumpUrl = null;
    }
  }
  
  public final int getType()
  {
    return 1564;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */