package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.mm.plugin.websearch.api.ab;
import com.tencent.mm.plugin.websearch.api.af;
import com.tencent.mm.plugin.websearch.api.w;
import com.tencent.mm.plugin.websearch.api.z;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI.i;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.s;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.mm.ui.widget.MMWebView.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public abstract class PreLoadWebViewUI
  extends WebViewUI
{
  protected String bJK;
  protected String bWr;
  private int pMb = -1;
  boolean qeP;
  CountDownLatch qeQ = new CountDownLatch(bXt() + 2);
  private w qeR;
  
  private void bXA()
  {
    if (this.qeP) {
      new Thread(new PreLoadWebViewUI.2(this)).start();
    }
  }
  
  public void ant()
  {
    super.ant();
    this.qeQ.countDown();
    if ((this.pNV != null) && (!this.pNV.qhq)) {
      this.pNV.a(new PreLoadWebViewUI.1(this));
    }
    for (;;)
    {
      if (b.chp())
      {
        if (!this.qeP) {
          break;
        }
        s.makeText(ad.getContext(), "use preloaded webview(安装coolassist时弹出), sys " + af.bTr().bTs(), 1).show();
      }
      return;
      bXA();
    }
    s.makeText(ad.getContext(), "no preloaded webview(安装coolassist时弹出), sys " + af.bTr().bTs(), 1).show();
  }
  
  protected final MMWebView bTf()
  {
    Object localObject1 = getIntent();
    if (localObject1 != null)
    {
      this.pMb = ((Intent)localObject1).getIntExtra("key_preload_biz", -1);
      x.i("PreLoadWebViewUI", "getting preloaded  webview, biz %d", new Object[] { Integer.valueOf(this.pMb) });
    }
    for (Object localObject2 = (ab)z.bTc().Aa(this.pMb).ev(this);; localObject2 = null)
    {
      label73:
      int i;
      if (localObject2 == null)
      {
        localObject1 = null;
        if (localObject2 != null) {
          break label189;
        }
        localObject2 = null;
        this.qeR = ((w)localObject2);
        if (localObject1 != null) {
          break label234;
        }
        x.i("PreLoadWebViewUI", "no available preloaded webview");
        this.qeP = false;
        localObject1 = getRawUrl();
        if (TextUtils.isEmpty((CharSequence)localObject1)) {
          break label202;
        }
        if (bi.WU(Uri.parse((String)localObject1).getQueryParameter("isOpenPreload")) != 1) {
          break label197;
        }
        i = 1;
      }
      for (;;)
      {
        if (i != 0) {
          com.tencent.mm.plugin.report.service.h.mEJ.h(15005, new Object[] { Integer.valueOf(this.pMb), Integer.valueOf(4), Integer.valueOf(0) });
        }
        if (this.pMb != 2) {
          break label207;
        }
        return MMWebView.a.cS(this);
        localObject1 = (MMWebView)((ab)localObject2).pMi;
        break;
        label189:
        localObject2 = ((ab)localObject2).pMj;
        break label73;
        label197:
        i = 0;
        continue;
        label202:
        i = 0;
      }
      try
      {
        label207:
        if (af.bTr().bTs()) {
          return MMWebView.a.hf(this);
        }
        localObject1 = MMWebView.a.cS(this);
        return (MMWebView)localObject1;
      }
      catch (Exception localException)
      {
        return MMWebView.a.cS(this);
      }
      label234:
      x.i("PreLoadWebViewUI", "use preloaded webview ,%s ", new Object[] { localException.toString() });
      this.qeP = true;
      com.tencent.mm.plugin.report.service.h.mEJ.h(15005, new Object[] { Integer.valueOf(this.pMb), Integer.valueOf(3), Integer.valueOf(0) });
      return localException;
    }
  }
  
  protected final void bWB()
  {
    com.tencent.mm.plugin.report.service.h.mEJ.h(15005, new Object[] { Integer.valueOf(this.pMb), Integer.valueOf(5), Integer.valueOf(0) });
  }
  
  protected final w bWi()
  {
    return this.qeR;
  }
  
  protected final boolean bWj()
  {
    return this.qeP;
  }
  
  protected final void bWk()
  {
    this.qeP = false;
  }
  
  public final Map<String, Object> bXB()
  {
    Object localObject2 = getRawUrl();
    Object localObject1;
    if (!TextUtils.isEmpty((CharSequence)localObject2))
    {
      localObject1 = new HashMap();
      localObject2 = Uri.parse((String)localObject2);
      Iterator localIterator = ((Uri)localObject2).getQueryParameterNames().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        ((Map)localObject1).put(str, ((Uri)localObject2).getQueryParameter(str));
      }
    }
    for (;;)
    {
      localObject2 = bXu();
      if (localObject2 != null) {
        ((Map)localObject1).putAll((Map)localObject2);
      }
      x.i("PreLoadWebViewUI", "buildOnUiInitParams %s", new Object[] { localObject1.toString() });
      return (Map<String, Object>)localObject1;
      localObject1 = Collections.emptyMap();
    }
  }
  
  protected void bXr() {}
  
  public int bXt()
  {
    return 0;
  }
  
  protected Map<String, Object> bXu()
  {
    return null;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (TextUtils.isEmpty(this.bJK))
    {
      this.bJK = getIntent().getStringExtra("sessionId");
      this.bWr = getIntent().getStringExtra("subSessionId");
      if (TextUtils.isEmpty(this.bWr)) {
        this.bWr = this.bJK;
      }
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    this.qeQ.countDown();
  }
  
  protected class a
    extends WebViewUI.i
  {
    protected a()
    {
      super();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/fts/PreLoadWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */