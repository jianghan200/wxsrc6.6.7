package com.tencent.mm.plugin.webview.fts;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.websearch.api.j;
import com.tencent.mm.plugin.websearch.api.p;
import com.tencent.mm.protocal.c.cfk;
import com.tencent.mm.protocal.c.cfo;
import com.tencent.mm.protocal.c.cfp;
import com.tencent.mm.protocal.c.chk;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.LinkedList;
import org.json.JSONArray;

public final class g
  extends com.tencent.mm.plugin.websearch.api.b
  implements k
{
  j dFC;
  private com.tencent.mm.ab.b dZf;
  private com.tencent.mm.ab.e diJ;
  private cfp pOX;
  
  public g(j paramj)
  {
    this.dFC = paramj;
    this.fur = paramj.bHt;
    this.fdx = paramj.scene;
    this.pKL = paramj.bWo;
    Object localObject;
    if (!bi.oW(paramj.bHt))
    {
      x.i("MicroMsg.FTS.NetSceneWebSuggest", "Constructors: query=%s", new Object[] { paramj.bHt });
      localObject = new b.a();
      ((b.a)localObject).dIF = 1161;
      ((b.a)localObject).uri = "/cgi-bin/mmsearch-bin/searchsuggestion";
      ((b.a)localObject).dIG = new cfo();
      ((b.a)localObject).dIH = new cfp();
      this.dZf = ((b.a)localObject).KT();
      localObject = (cfo)this.dZf.dID.dIL;
      ((cfo)localObject).rDH = paramj.bHt;
      ((cfo)localObject).rll = paramj.iPZ;
      ((cfo)localObject).syH = p.zP(0);
      ((cfo)localObject).shN = paramj.pKO;
      ((cfo)localObject).rUI = p.JU();
      ((cfo)localObject).otY = paramj.scene;
      ((cfo)localObject).syL = paramj.bJK;
      if (paramj.pLd == null) {}
    }
    try
    {
      ((cfo)localObject).sAd = new com.tencent.mm.bk.b(paramj.pLd.toByteArray());
      if (paramj.pLc != null) {}
      try
      {
        ((cfo)localObject).sAc = new com.tencent.mm.bk.b(paramj.pLc.toByteArray());
        int i;
        try
        {
          JSONArray localJSONArray = new JSONArray(paramj.pKU);
          ((cfo)localObject).sAa = new LinkedList();
          i = 0;
          while (i < localJSONArray.length())
          {
            String str = URLDecoder.decode(localJSONArray.getString(i), "UTF-8");
            ((cfo)localObject).sAa.add(str);
            i += 1;
          }
          bool = true;
        }
        catch (Exception localException1)
        {
          x.printErrStackTrace("MicroMsg.FTS.NetSceneWebSuggest", localException1, "decode json error", new Object[0]);
          i = paramj.iPZ;
          if (((cfo)localObject).rUI == null) {}
        }
        for (;;)
        {
          x.i("MicroMsg.FTS.NetSceneWebSuggest", "businessTypeList is %d | contains location = %b | scene=%d | businessType=%d | isHomePage=%b | webViewId=%d", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool), Integer.valueOf(paramj.scene), Integer.valueOf(paramj.iPZ), Integer.valueOf(paramj.pKO), Integer.valueOf(paramj.bWo) });
          return;
          boolean bool = false;
        }
        x.e("MicroMsg.FTS.NetSceneWebSuggest", "keyword is unavailable");
        return;
      }
      catch (IOException localIOException)
      {
        for (;;) {}
      }
    }
    catch (Exception localException2)
    {
      for (;;) {}
    }
  }
  
  public final String JS()
  {
    if (this.pOX != null) {
      return this.pOX.rjK;
    }
    return "";
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.dZf, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.FTS.NetSceneWebSuggest", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    this.pOX = ((cfp)this.dZf.dIE.dIL);
    if (this.pOX != null) {
      x.v("MicroMsg.FTS.NetSceneWebSuggest", "return data\n%s", new Object[] { this.pOX.rjK });
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1161;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/webview/fts/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */