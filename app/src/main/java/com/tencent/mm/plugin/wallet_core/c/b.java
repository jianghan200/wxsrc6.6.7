package com.tencent.mm.plugin.wallet_core.c;

import android.content.SharedPreferences;
import android.net.Uri;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.model.i;
import com.tencent.mm.pluginsdk.k;
import com.tencent.mm.protocal.c.os;
import com.tencent.mm.protocal.c.ot;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.m;

public final class b
  extends m
{
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public int piX = 0;
  public ot piY;
  
  public b(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt)
  {
    this(paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, paramString8, paramInt, (byte)0);
  }
  
  private b(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt, byte paramByte)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new os();
    ((b.a)localObject).dIH = new ot();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/checkuserauthjsapi";
    ((b.a)localObject).dIF = 2728;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (os)this.diG.dID.dIL;
    ((os)localObject).jQb = paramString1;
    ((os)localObject).rhq = paramString2;
    ((os)localObject).rsw = paramString3;
    ((os)localObject).rsx = paramString4;
    ((os)localObject).rsz = paramString5;
    ((os)localObject).rsy = paramString6;
    ((os)localObject).rrC = paramString7;
    ((os)localObject).rsA = 5;
    ((os)localObject).rmQ = i.bOL();
    ((os)localObject).rcd = 1;
    ((os)localObject).hbL = null;
    ((os)localObject).jTx = null;
    ((os)localObject).rsD = paramString8;
    ((os)localObject).rsC = paramInt;
    boolean bool = ((k)g.l(k.class)).aNa();
    paramString4 = ad.chZ();
    paramString3 = null;
    paramString2 = null;
    if (paramString4 != null)
    {
      paramString3 = paramString4.getString("cpu_id", null);
      paramString2 = paramString4.getString("uid", null);
    }
    ((os)localObject).rsW = 0;
    ((os)localObject).onE = paramString3;
    ((os)localObject).onF = paramString2;
    if (bool) {}
    for (paramInt = 1;; paramInt = 0)
    {
      ((os)localObject).rsX = paramInt;
      x.d("MicroMsg.NetSceneCheckUserAuthJsapi", "cpu_id: %s, uid: %s", new Object[] { paramString3, paramString2 });
      x.i("MicroMsg.NetSceneCheckUserAuthJsapi", "appId: %s, url: %s, jsapiScene: %s, isOpenTouchPay: %b", new Object[] { paramString1, paramString7, Integer.valueOf(5), Boolean.valueOf(bool) });
      return;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.d("MicroMsg.NetSceneCheckUserAuthJsapi", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    String str = paramString;
    if (paramInt1 == 0)
    {
      str = paramString;
      if (paramInt2 == 0)
      {
        this.piY = ((ot)((com.tencent.mm.ab.b)paramq).dIE.dIL);
        paramString = (os)((com.tencent.mm.ab.b)paramq).dID.dIL;
        if (paramString.rrC == null) {
          break label357;
        }
        paramq = Uri.parse(paramString.rrC).getQueryParameter("appid");
        if (paramq == paramString.jQb) {
          break label272;
        }
        h.mEJ.h(14954, new Object[] { this.piY.qUU, "", Integer.valueOf(paramString.rsA), paramString.rsD, paramString.jQb, Integer.valueOf(paramString.rcd), Integer.valueOf(paramString.rsC), paramString.rrC, paramq });
      }
    }
    for (;;)
    {
      x.i("MicroMsg.NetSceneCheckUserAuthJsapi", "CheckUserAuthJsapiResponse resp.ErrCode is " + this.piY.iwS + " resp.ErrMsg is " + this.piY.iwT);
      str = this.piY.iwT;
      this.diJ.a(paramInt1, paramInt2, str, this);
      return;
      label272:
      h.mEJ.h(14954, new Object[] { this.piY.qUU, "", Integer.valueOf(paramString.rsA), paramString.rsD, paramString.jQb, Integer.valueOf(paramString.rcd), Integer.valueOf(paramString.rsC), paramString.rrC });
      continue;
      label357:
      if ((paramString.hbL != null) && (paramString.jTx != null)) {
        h.mEJ.h(14954, new Object[] { this.piY.qUU, "", Integer.valueOf(paramString.rsA), paramString.rsD, paramString.jQb, Integer.valueOf(paramString.rcd), Integer.valueOf(paramString.rsC), paramString.jTx, paramString.hbL });
      }
    }
  }
  
  public final int getType()
  {
    return 580;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */