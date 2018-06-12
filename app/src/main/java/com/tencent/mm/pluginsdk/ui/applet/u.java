package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.bg.d;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.modelsimple.h;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.base.p;

public final class u
  implements e
{
  Context context;
  p jnR;
  private al lYo = new al(new u.1(this), false);
  h mMA;
  private String qJP;
  
  public u(Context paramContext)
  {
    this.context = paramContext;
  }
  
  private void TN(String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", this.context.getString(R.l.contact_info_qzone_url, new Object[] { paramString }));
    localIntent.putExtra("useJs", true);
    localIntent.putExtra("vertical_scroll", true);
    localIntent.putExtra("neverGetA8Key", true);
    d.b(this.context, "webview", ".ui.tools.ContactQZoneWebView", localIntent);
  }
  
  public final void TM(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ViewQZone", "go fail, qqNum is null");
      return;
    }
    this.qJP = paramString;
    au.HU();
    String str1 = (String)c.DT().get(46, null);
    au.HU();
    String str2 = bi.oV((String)c.DT().get(72, null));
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ViewQZone", "get a2key:[%s], get new a2key:[%s]", new Object[] { str1, str2 });
    if ((bi.oW(str1)) && (bi.oW(str2)))
    {
      TN(paramString);
      return;
    }
    au.DF().a(233, this);
    this.mMA = new h(com.tencent.mm.a.o.cx(paramString), (int)System.currentTimeMillis());
    au.DF().a(this.mMA, 0);
    this.lYo.J(3000L, 3000L);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    this.lYo.SO();
    if (this.jnR != null) {
      this.jnR.dismiss();
    }
    au.DF().b(233, this);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = (h)paraml;
      paraml = paramString.QL();
      if ((paraml == null) || (paraml.length() == 0))
      {
        TN(this.qJP);
        return;
      }
      Intent localIntent = new Intent();
      localIntent.putExtra("rawUrl", paraml);
      localIntent.putExtra("useJs", true);
      localIntent.putExtra("vertical_scroll", true);
      localIntent.putExtra("neverGetA8Key", true);
      localIntent.putExtra("geta8key_session_id", paramString.QS());
      d.b(this.context, "webview", ".ui.tools.ContactQZoneWebView", localIntent);
      return;
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ViewQZone", "getA8Key fail, errType = " + paramInt1 + ", errCode = " + paramInt2);
    TN(this.qJP);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/applet/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */