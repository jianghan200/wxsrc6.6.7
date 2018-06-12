package com.tencent.mm.plugin.websearch;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.v;
import com.tencent.mm.ab.v.a;
import com.tencent.mm.bg.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.websearch.api.i;
import com.tencent.mm.protocal.c.biw;
import com.tencent.mm.protocal.c.bix;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.w;

public final class c
  implements i
{
  private static String pKH = "websearch_";
  private static String pKI;
  private static String pKJ;
  private Runnable pKF;
  private Runnable pKG;
  
  private static void aU(Context paramContext, String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("showShare", true);
    localIntent.putExtra("rawUrl", paramString);
    d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
  }
  
  private static SharedPreferences bSE()
  {
    init();
    com.tencent.mm.sdk.platformtools.x.i("WebSearchPrivacyMgr", " sp name %s ", new Object[] { pKH });
    return an.m(ad.getContext(), pKH, 0);
  }
  
  public static void bSF()
  {
    com.tencent.mm.sdk.platformtools.x.i("WebSearchPrivacyMgr", "reInit");
    Object localObject = new StringBuilder("websearch_");
    g.Eg();
    pKH = com.tencent.mm.kernel.a.Dg();
    localObject = g.Ei().DT().get(274436, "").toString();
    pKI = ad.getContext().getString(a.a.open_confirm_url, new Object[] { w.chP(), localObject });
    pKJ = ad.getContext().getString(a.a.close_confirm_url, new Object[] { w.chP(), localObject });
  }
  
  public static void init()
  {
    if (pKI == null) {
      bSF();
    }
  }
  
  public final void a(Context paramContext, Runnable paramRunnable)
  {
    
    if ((!bSE().getBoolean("websearch_confirmed", false)) && (com.tencent.mm.al.b.ml((String)g.Ei().DT().get(274436, null))))
    {
      this.pKF = paramRunnable;
      aU(paramContext, pKI);
      return;
    }
    paramRunnable.run();
  }
  
  public final boolean b(Context paramContext, Runnable paramRunnable)
  {
    
    if (com.tencent.mm.al.b.ml((String)g.Ei().DT().get(274436, null)))
    {
      this.pKG = paramRunnable;
      aU(paramContext, pKJ);
      return true;
    }
    paramRunnable.run();
    return false;
  }
  
  public final void bSG()
  {
    com.tencent.mm.sdk.platformtools.x.i("WebSearchPrivacyMgr", "openSearch ");
    init();
    if (this.pKF != null)
    {
      this.pKF.run();
      if (this.pKF == this.pKF) {
        this.pKF = null;
      }
    }
    bSE().edit().putBoolean("websearch_confirmed", true).commit();
    biw localbiw = new biw();
    localbiw.sji = 1;
    localbiw.rxy = ((int)(System.currentTimeMillis() / 1000L));
    localbiw.jRb = 1;
    b.a locala = new b.a();
    locala.dIG = localbiw;
    locala.dIH = new bix();
    locala.uri = "/cgi-bin/mmsearch-bin/searchconfirm";
    locala.dIF = 2957;
    v.a(locala.KT(), new c.1(this));
  }
  
  public final void bSH()
  {
    com.tencent.mm.sdk.platformtools.x.i("WebSearchPrivacyMgr", "closeSearch ");
    init();
    if (this.pKG != null)
    {
      this.pKG.run();
      if (this.pKG == this.pKG) {
        this.pKG = null;
      }
    }
    bSE().edit().putBoolean("websearch_confirmed", false).commit();
    Object localObject = new biw();
    ((biw)localObject).sji = 1;
    ((biw)localObject).rxy = ((int)(System.currentTimeMillis() / 1000L));
    ((biw)localObject).jRb = 2;
    b.a locala = new b.a();
    locala.dIG = ((com.tencent.mm.bk.a)localObject);
    locala.dIH = new bix();
    locala.uri = "/cgi-bin/mmsearch-bin/searchconfirm";
    locala.dIF = 2957;
    v.a(locala.KT(), new v.a()
    {
      public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ab.b paramAnonymousb, l paramAnonymousl)
      {
        return 0;
      }
    });
    ((n)g.n(n.class)).deleteSOSHistory();
    if (com.tencent.mm.plugin.websearch.api.x.pLP != null) {
      com.tencent.mm.plugin.websearch.api.x.pLP = null;
    }
    localObject = com.tencent.mm.plugin.websearch.api.x.bSY();
    ad.getContext().getSharedPreferences("fts_recent_biz_sp", 0).edit().remove((String)localObject).commit();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/websearch/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */