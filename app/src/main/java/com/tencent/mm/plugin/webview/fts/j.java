package com.tencent.mm.plugin.webview.fts;

import android.content.Context;
import com.tencent.mm.modelappbrand.r;
import com.tencent.mm.modelappbrand.t;
import com.tencent.mm.sdk.platformtools.ah;

public final class j
  extends t
{
  Context context;
  
  public j(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public final void a(String paramString1, String paramString2, r paramr)
  {
    ah.A(new j.1(this, paramString2, paramString1, paramr));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/webview/fts/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */