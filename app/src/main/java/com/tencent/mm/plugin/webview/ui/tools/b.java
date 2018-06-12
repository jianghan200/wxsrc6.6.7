package com.tencent.mm.plugin.webview.ui.tools;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.http.SslCertificate;
import android.net.http.SslCertificate.DName;
import android.net.http.SslError;
import android.util.Base64;
import com.jg.JgClassChecked;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.xweb.WebView;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@JgClassChecked(author=20, fComment="checked", lastDate="20141210", reviewer=20, vComment={com.jg.EType.HTTPSCHECK})
public final class b
{
  Context context;
  private final SimpleDateFormat mvL = new SimpleDateFormat("yyyy-MM-dd HH:mmZ", Locale.getDefault());
  WebView pVK;
  Map<String, List<com.tencent.xweb.h>> pVL;
  Map<String, Boolean> pVM;
  
  public b(Context paramContext, WebView paramWebView)
  {
    this.context = paramContext;
    this.pVK = paramWebView;
    this.pVL = new HashMap();
    this.pVM = new HashMap();
  }
  
  @TargetApi(14)
  private String a(String paramString, SslError paramSslError)
  {
    try
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("<sslerror>");
      localStringBuilder.append("<primaryerror>");
      Object localObject;
      if (paramSslError == null)
      {
        localObject = "-1";
        localStringBuilder.append(localObject);
        localStringBuilder.append("</primaryerror>");
        localStringBuilder.append("<clienttime>");
        localStringBuilder.append(Base64.encodeToString(this.mvL.format(new Date()).getBytes(), 0));
        localStringBuilder.append("</clienttime>");
        localStringBuilder.append("<currenturl>");
        if (!bi.oW(paramString)) {
          localStringBuilder.append(bi.WS(paramString));
        }
        localStringBuilder.append("</currenturl>");
        if (paramSslError != null) {
          break label334;
        }
      }
      label334:
      for (paramString = null;; paramString = paramSslError.getCertificate())
      {
        if (paramString != null)
        {
          paramSslError = paramString.getIssuedBy();
          if (paramSslError != null)
          {
            localStringBuilder.append("<issuedby>");
            if (paramSslError.getDName() != null) {
              localStringBuilder.append(Base64.encodeToString(paramSslError.getDName().getBytes(), 0));
            }
            localStringBuilder.append("</issuedby>");
          }
          paramSslError = paramString.getIssuedTo();
          if (paramSslError != null)
          {
            localStringBuilder.append("<issuedto>");
            if (paramSslError.getDName() != null) {
              localStringBuilder.append(Base64.encodeToString(paramSslError.getDName().getBytes(), 0));
            }
            localStringBuilder.append("</issuedto>");
          }
          paramSslError = paramString.getValidNotAfter();
          if (paramSslError != null)
          {
            localStringBuilder.append("<getvalidnotafter>");
            localStringBuilder.append(Base64.encodeToString(paramSslError.getBytes(), 0));
            localStringBuilder.append("</getvalidnotafter>");
          }
          paramString = paramString.getValidNotBefore();
          if (paramString != null)
          {
            localStringBuilder.append("<getvalidnotbefore>");
            localStringBuilder.append(Base64.encodeToString(paramString.getBytes(), 0));
            localStringBuilder.append("</getvalidnotbefore>");
          }
        }
        localStringBuilder.append("</sslerror>");
        return localStringBuilder.toString();
        localObject = Integer.valueOf(paramSslError.getPrimaryError());
        break;
      }
      return "";
    }
    catch (Exception paramString)
    {
      x.w("MicroMsg.WebView.MMSslErrorHandler", "buildXml ex = %s", new Object[] { paramString.getMessage() });
    }
  }
  
  public final void a(String paramString, com.tencent.xweb.h paramh, SslError paramSslError)
  {
    x.e("MicroMsg.WebView.MMSslErrorHandler", "onReceiveSslError, currentUrl = %s", new Object[] { paramString });
    if (this.pVK == null)
    {
      x.e("MicroMsg.WebView.MMSslErrorHandler", "onReceiveSslError fail, has been detached");
      return;
    }
    if (bi.oW(paramString))
    {
      paramh.cancel();
      return;
    }
    URL localURL;
    try
    {
      localURL = new URL(paramString);
      if ((!localURL.getHost().endsWith(".qq.com")) && (!localURL.getHost().endsWith(".linkedin.com"))) {
        break label383;
      }
      localObject = (Boolean)this.pVM.get(paramString);
      if (localObject == null) {
        break label164;
      }
      x.v("MicroMsg.WebView.MMSslErrorHandler", "onReceiveSslError, already selected = %b", new Object[] { localObject });
      if (((Boolean)localObject).booleanValue())
      {
        paramh.proceed();
        return;
      }
    }
    catch (Exception paramString)
    {
      x.e("MicroMsg.WebView.MMSslErrorHandler", "create url fail : " + paramString.getLocalizedMessage());
      return;
    }
    paramh.cancel();
    return;
    label164:
    Object localObject = (List)this.pVL.get(paramString);
    if ((localObject == null) || (((List)localObject).size() == 0))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("1");
      ((StringBuilder)localObject).append(",");
      ((StringBuilder)localObject).append(a(paramString, paramSslError));
      paramSslError = ((StringBuilder)localObject).toString();
      x.i("MicroMsg.WebView.MMSslErrorHandler", "reportWebViewSslError, value = %s", new Object[] { paramSslError });
      com.tencent.mm.plugin.report.service.h.mEJ.k(11098, paramSslError);
      paramSslError = new ArrayList();
      paramSslError.add(paramh);
      this.pVL.put(paramString, paramSslError);
      com.tencent.mm.ui.base.h.a(this.context, false, this.context.getString(R.l.wv_alert_certificate_err, new Object[] { localURL.getHost() }), this.context.getString(R.l.wv_alert_certificate_err_title), this.context.getString(R.l.app_continue), this.context.getString(R.l.app_back), new b.1(this, paramString), new b.2(this, paramString));
      return;
    }
    ((List)localObject).add(paramh);
    return;
    label383:
    x.d("MicroMsg.WebView.MMSslErrorHandler", "host = " + localURL.getHost() + ", but it not end with '.qq.com' or '.linkedin.com'");
    paramh.cancel();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */