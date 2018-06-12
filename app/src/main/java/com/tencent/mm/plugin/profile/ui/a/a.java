package com.tencent.mm.plugin.profile.ui.a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.bg.d;
import com.tencent.mm.model.au;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.p;

public final class a
  implements e
{
  Activity bOb;
  p jnR;
  com.tencent.mm.plugin.profile.a.a lYn;
  private al lYo = new al(new a.1(this), false);
  
  public a(Activity paramActivity)
  {
    this.bOb = paramActivity;
  }
  
  private void JI(String paramString)
  {
    this.lYo.SO();
    if (this.jnR != null) {
      this.jnR.dismiss();
    }
    paramString = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
    paramString.putExtra("title", this.bOb.getString(R.l.contact_info_weibo));
    paramString.putExtra("zoom", true);
    paramString.putExtra("vertical_scroll", false);
    d.b(this.bOb, "webview", ".ui.tools.WebViewUI", paramString);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    au.DF().b(205, this);
    paramString = (com.tencent.mm.plugin.profile.a.a)paraml;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      JI(paramString.getURL());
      return;
    }
    if (paramInt1 != 4) {
      x.e("MicroMsg.ViewTWeibo", "view weibo failed: " + paramInt1 + ", " + paramInt2);
    }
    JI("http://t.qq.com/" + paramString.lUe);
  }
  
  public final void ef(String paramString1, String paramString2)
  {
    if (paramString1 == null)
    {
      x.e("MicroMsg.ViewTWeibo", "null weibo id");
      return;
    }
    au.DF().a(205, this);
    this.lYn = new com.tencent.mm.plugin.profile.a.a(bi.oV(paramString1).replace("http://t.qq.com/", "").trim(), paramString2);
    au.DF().a(this.lYn, 0);
    this.lYo.J(3000L, 3000L);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */