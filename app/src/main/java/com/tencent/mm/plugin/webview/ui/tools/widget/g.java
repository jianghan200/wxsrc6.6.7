package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.GeolocationPermissions.Callback;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.xweb.WebView;
import com.tencent.xweb.e;
import com.tencent.xweb.f;
import com.tencent.xweb.j;

public class g
  extends j
{
  private Activity bOb;
  private int jJE = 0;
  
  public g(MMWebViewWithJsApi paramMMWebViewWithJsApi)
  {
    this.bOb = ((Activity)paramMMWebViewWithJsApi.getContext());
  }
  
  public final boolean a(WebView paramWebView, String paramString1, String paramString2, f paramf)
  {
    this.jJE += 1;
    if (this.jJE > 2) {}
    for (c localc = h.a(this.bOb, paramString2, "", this.bOb.getString(R.l.wv_close_webview), this.bOb.getString(R.l.app_ok), new g.3(this, paramf), new g.4(this, paramf), R.e.link_color); localc != null; localc = h.a(this.bOb, paramString2, "", this.bOb.getString(R.l.app_ok), new g.5(this, paramf)))
    {
      localc.setCanceledOnTouchOutside(false);
      localc.cpX();
      return true;
    }
    return super.a(paramWebView, paramString1, paramString2, paramf);
  }
  
  public final boolean a(WebView paramWebView, String paramString1, String paramString2, String paramString3, e parame)
  {
    return super.a(paramWebView, paramString1, paramString2, paramString3, parame);
  }
  
  public final boolean b(WebView paramWebView, String paramString1, String paramString2, final f paramf)
  {
    this.jJE += 1;
    if (this.jJE > 2) {}
    for (c localc = h.a(this.bOb, paramString2, "", this.bOb.getString(R.l.wv_close_webview), this.bOb.getString(R.l.app_ok), new g.6(this, paramf), new g.7(this, paramf), R.e.btn_green_color_normal); localc != null; localc = h.a(this.bOb, false, paramString2, "", this.bOb.getString(R.l.app_ok), this.bOb.getString(R.l.app_cancel), new DialogInterface.OnClickListener()new g.9
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            paramf.confirm();
          }
        }, new g.9(this, paramf)))
    {
      localc.setCancelable(false);
      localc.setCanceledOnTouchOutside(false);
      return true;
    }
    return super.b(paramWebView, paramString1, paramString2, paramf);
  }
  
  public void d(WebView paramWebView, String paramString)
  {
    super.d(paramWebView, paramString);
  }
  
  public void onClose()
  {
    this.bOb.finish();
  }
  
  public final void onGeolocationPermissionsShowPrompt(final String paramString, final GeolocationPermissions.Callback paramCallback)
  {
    h.a(this.bOb, false, this.bOb.getString(R.l.wv_get_location_msg, new Object[] { paramString }), this.bOb.getString(R.l.wv_get_location_title), this.bOb.getString(R.l.app_ok), this.bOb.getString(R.l.app_cancel), new DialogInterface.OnClickListener()new g.2
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramCallback.invoke(paramString, true, true);
      }
    }, new g.2(this, paramCallback, paramString));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/widget/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */