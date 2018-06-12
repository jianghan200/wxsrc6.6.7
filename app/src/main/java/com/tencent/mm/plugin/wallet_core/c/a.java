package com.tencent.mm.plugin.wallet_core.c;

import android.net.Uri;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.model.i;
import com.tencent.mm.protocal.c.og;
import com.tencent.mm.protocal.c.oh;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.m;
import com.tencent.mm.wallet_core.c.p;

public final class a
  extends m
{
  public b diG;
  private com.tencent.mm.ab.e diJ;
  public int piX = 0;
  
  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, int paramInt1, String paramString8, int paramInt2)
  {
    this.piX = paramInt1;
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new og();
    ((b.a)localObject).dIH = new oh();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/checkpayjsapi";
    ((b.a)localObject).dIF = 580;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (og)this.diG.dID.dIL;
    ((og)localObject).jQb = paramString1;
    ((og)localObject).rhq = paramString2;
    ((og)localObject).rsw = paramString3;
    ((og)localObject).rsx = paramString4;
    ((og)localObject).rsz = paramString5;
    ((og)localObject).rsy = paramString6;
    ((og)localObject).rrC = paramString7;
    ((og)localObject).rsA = paramInt1;
    ((og)localObject).rmQ = i.bOL();
    if (p.cDb()) {
      ((og)localObject).rsB = p.cDd();
    }
    ((og)localObject).rcd = 1;
    ((og)localObject).rsD = paramString8;
    ((og)localObject).rsC = paramInt2;
    x.i("MicroMsg.NetSceneCheckPayJsapi", "appId: %s, url: %s, jsapiScene: %s", new Object[] { paramString1, paramString7, Integer.valueOf(paramInt1) });
  }
  
  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, int paramInt)
  {
    this.piX = 16;
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new og();
    ((b.a)localObject).dIH = new oh();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/checkpayjsapi";
    ((b.a)localObject).dIF = 580;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (og)this.diG.dID.dIL;
    ((og)localObject).jQb = paramString1;
    ((og)localObject).rhq = paramString2;
    ((og)localObject).rsw = paramString3;
    ((og)localObject).rsx = paramString4;
    ((og)localObject).rsz = paramString5;
    ((og)localObject).rsy = paramString6;
    ((og)localObject).rsA = 16;
    ((og)localObject).hbL = paramString7;
    ((og)localObject).jTx = paramString8;
    ((og)localObject).rcd = 2;
    ((og)localObject).rsD = paramString9;
    ((og)localObject).rsC = paramInt;
    ((og)localObject).rmQ = i.bOL();
    if (p.cDb()) {
      ((og)localObject).rsB = p.cDd();
    }
    x.i("MicroMsg.NetSceneCheckPayJsapi", "appId: %s, UserName: %s, path: %s", new Object[] { paramString1, paramString7, paramString8 });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final String bOj()
  {
    return ((oh)this.diG.dIE.dIL).qUU;
  }
  
  public final String blM()
  {
    return ((oh)this.diG.dIE.dIL).token;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.d("MicroMsg.NetSceneCheckPayJsapi", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    String str = paramString;
    if (paramInt1 == 0)
    {
      str = paramString;
      if (paramInt2 == 0)
      {
        paramString = (oh)((b)paramq).dIE.dIL;
        x.i("MicroMsg.NetSceneCheckPayJsapi", "NetSceneCheckPayJsapi resp.ErrCode is " + paramString.iwS + " resp.ErrMsg is " + paramString.iwT);
        paramq = (og)((b)paramq).dID.dIL;
        if (paramq.rrC == null) {
          break label389;
        }
        str = Uri.parse(paramq.rrC).getQueryParameter("appid");
        if (str == paramq.jQb) {
          break label301;
        }
        h.mEJ.h(14954, new Object[] { paramString.qUU, "", Integer.valueOf(paramq.rsA), paramq.rsD, paramq.jQb, Integer.valueOf(paramq.rcd), Integer.valueOf(paramq.rsC), paramq.rrC, str });
      }
    }
    for (;;)
    {
      x.i("MicroMsg.NetSceneCheckPayJsapi", "NetSceneCheckPayJsapi resp.ErrCode is " + paramString.iwS + " resp.ErrMsg is " + paramString.iwT);
      str = paramString.iwT;
      this.diJ.a(paramInt1, paramInt2, str, this);
      return;
      label301:
      h.mEJ.h(14954, new Object[] { paramString.qUU, "", Integer.valueOf(paramq.rsA), paramq.rsD, paramq.jQb, Integer.valueOf(paramq.rcd), Integer.valueOf(paramq.rsC), paramq.rrC });
      continue;
      label389:
      if ((paramq.hbL != null) && (paramq.jTx != null)) {
        h.mEJ.h(14954, new Object[] { paramString.qUU, "", Integer.valueOf(paramq.rsA), paramq.rsD, paramq.jQb, Integer.valueOf(paramq.rcd), Integer.valueOf(paramq.rsC), paramq.jTx, paramq.hbL });
      }
    }
  }
  
  public final int getType()
  {
    return 580;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */