package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.modelsimple.h;
import com.tencent.mm.plugin.scanner.b;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.p;

public final class r
  implements e
{
  Context context;
  p jnR;
  al lYo = new al(new r.1(this), false);
  h mMA;
  String url;
  
  public r(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    this.lYo.SO();
    if (this.jnR != null) {
      this.jnR.dismiss();
    }
    au.DF().b(233, this);
    paramString = (h)paraml;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paraml = paramString.QL();
      if ((paraml == null) || (paraml.length() == 0))
      {
        b(this.url, paramString.QS(), paramString.QT());
        return;
      }
      b(paraml, paramString.QS(), paramString.QT());
      return;
    }
    x.e("MicroMsg.scanner.ViewMMURL", "getA8Key fail, errType = " + paramInt1 + ", errCode = " + paramInt2);
    b(this.url, paramString.QS(), paramString.QT());
  }
  
  final void b(String paramString, int paramInt, byte[] paramArrayOfByte)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("useJs", true);
    localIntent.putExtra("vertical_scroll", true);
    localIntent.putExtra("geta8key_session_id", paramInt);
    localIntent.putExtra("geta8key_cookie", paramArrayOfByte);
    b.ezn.j(localIntent, this.context);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/scanner/ui/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */