package com.tencent.mm.plugin.webview.model;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.mm.plugin.webview.modelcache.p;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.xweb.m;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ah
{
  private int pRQ = -1;
  public ArrayList<String> pRR = new ArrayList();
  public ArrayList<String> pRS = new ArrayList();
  public List<Integer> pRT = new ArrayList();
  public final Map<String, Boolean> pRU = new HashMap();
  public final Set<String> pRV = new HashSet();
  public String pRW = null;
  
  private m b(d paramd)
  {
    try
    {
      paramd = paramd.g(98, null);
      if (paramd == null) {
        return null;
      }
      try
      {
        Object localObject = bi.convertStreamToString(ad.getContext().getAssets().open("jsapi/wxjs.js"));
        paramd = (d)localObject;
        if (!TextUtils.isEmpty(this.pRW)) {
          paramd = ((String)localObject).replace("__wx._getDgtVerifyRandomStr()", this.pRW).replace("__wx._isDgtVerifyEnabled()", "true");
        }
        paramd = new ByteArrayInputStream(paramd.getBytes("UTF-8"));
        paramd = new m("application/javascript", "utf-8", paramd);
        localObject = new HashMap();
        ((HashMap)localObject).put("Cache-Control", "no-cache, no-store, must-revalidate");
        ((HashMap)localObject).put("Pragma", "no-cache");
        ((HashMap)localObject).put("Expires", "0");
        paramd.mResponseHeaders = ((Map)localObject);
        return paramd;
      }
      catch (Exception paramd)
      {
        x.e("MicroMsg.WebViewResourceInterrupter", "tryInterceptBridgeScriptRequest, failed, ", new Object[] { paramd });
        return null;
      }
      return null;
    }
    catch (Exception paramd) {}
  }
  
  private boolean c(String paramString, d paramd)
  {
    Iterator localIterator;
    if (this.pRQ == -1) {
      try
      {
        paramd = paramd.g(31, null);
        if (paramd != null)
        {
          this.pRQ = paramd.getInt("webview_ad_intercept_control_flag");
          this.pRR = paramd.getStringArrayList("webview_ad_intercept_whitelist_domins");
          this.pRS = paramd.getStringArrayList("webview_ad_intercept_blacklist_domins");
          paramd = new StringBuilder();
          paramd.append("white domain list :\n");
          localIterator = this.pRR.iterator();
          while (localIterator.hasNext()) {
            paramd.append((String)localIterator.next()).append("\n");
          }
        }
        if (this.pRQ != 0) {
          break label197;
        }
      }
      catch (Exception paramd)
      {
        x.e("MicroMsg.WebViewResourceInterrupter", "get ad domain failed : %s", new Object[] { paramd.getMessage() });
        this.pRQ = 0;
      }
    }
    for (;;)
    {
      return false;
      paramd.append("black list domain list : \n");
      localIterator = this.pRS.iterator();
      while (localIterator.hasNext()) {
        paramd.append((String)localIterator.next()).append("\n");
      }
      x.i("MicroMsg.WebViewResourceInterrupter", paramd.toString());
    }
    label197:
    paramd = Uri.parse(paramString).getHost();
    x.d("MicroMsg.WebViewResourceInterrupter", "check has verified this domain : %s, is in black list = %b", new Object[] { paramd, this.pRU.get(paramd) });
    if (bi.oW(paramd)) {
      return false;
    }
    if (this.pRU.containsKey(paramd)) {
      return ((Boolean)this.pRU.get(paramd)).booleanValue();
    }
    if ((this.pRR != null) && (this.pRR.size() > 0))
    {
      localIterator = this.pRR.iterator();
      while (localIterator.hasNext()) {
        if (paramd.contains((String)localIterator.next()))
        {
          this.pRU.put(paramd, Boolean.valueOf(false));
          x.i("MicroMsg.WebViewResourceInterrupter", "white list, ignore check the url");
          return false;
        }
      }
    }
    if ((this.pRS != null) && (this.pRS.size() > 0))
    {
      localIterator = this.pRS.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if ((!bi.oW(str)) && (paramd.contains(str)))
        {
          if (this.pRQ == 1)
          {
            this.pRU.put(paramd, Boolean.valueOf(true));
            x.e("MicroMsg.WebViewResourceInterrupter", "black list, should stop the request, domain = %s, url = %s", new Object[] { str, paramString });
            return true;
          }
          if (this.pRQ == 2)
          {
            x.i("MicroMsg.WebViewResourceInterrupter", "black list, just get html content and report, domain = %s, url = %s", new Object[] { str, paramString });
            this.pRV.add(paramd);
            this.pRU.put(paramd, Boolean.valueOf(false));
            return false;
          }
        }
      }
    }
    this.pRU.put(paramd, Boolean.valueOf(false));
    return false;
  }
  
  public final m a(String paramString, boolean paramBoolean, d paramd)
  {
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.WebViewResourceInterrupter", "url is null, return ");
      return null;
    }
    if (paramString.startsWith("weixin://bridge.js")) {
      return b(paramd);
    }
    if (paramString.startsWith("weixin://resourceid/"))
    {
      x.i("MicroMsg.WebViewResourceInterrupter", "it is wechat resource is, should intercept");
      try
      {
        paramString = new m("image/*", "utf-8", aj.Qw(paramd.cx(paramString, 1)));
        return paramString;
      }
      catch (Exception paramString)
      {
        x.e("MicroMsg.WebViewResourceInterrupter", "get webview jssdk resource failed %s", new Object[] { paramString.getMessage() });
        return null;
      }
    }
    if (paramBoolean)
    {
      int i;
      if ((bi.oW(paramString)) || (!p.vN(paramString))) {
        i = 0;
      }
      while (i != 0)
      {
        x.f("MicroMsg.WebViewResourceInterrupter", "local url, interrupt request : %s", new Object[] { paramString });
        return new m("image/*", "utf-8", new ByteArrayInputStream(new byte[0]));
        String str = paramString.toLowerCase();
        Iterator localIterator;
        if ((str.contains("localhost")) || (str.contains("127.0.0.1")) || (str.contains("::1")) || (str.contains(s.cfB())))
        {
          if ((this.pRT != null) && (this.pRT.size() > 0)) {
            localIterator = this.pRT.iterator();
          }
        }
        else {
          for (;;)
          {
            if (localIterator.hasNext())
            {
              i = ((Integer)localIterator.next()).intValue();
              if ((str.contains("localhost:" + i)) || (str.contains("127.0.0.1:" + i)))
              {
                x.i("MicroMsg.WebViewResourceInterrupter", "int white list : %s, port = %d", new Object[] { str, Integer.valueOf(i) });
                i = 0;
                break;
              }
            }
          }
        }
        x.e("MicroMsg.WebViewResourceInterrupter", "not allowed to load local url : %s", new Object[] { str });
        i = 1;
      }
    }
    if (c(paramString, paramd))
    {
      x.e("MicroMsg.WebViewResourceInterrupter", "this is a ad request, interrupt request : %s", new Object[] { paramString });
      return new m("image/*", "utf-8", new ByteArrayInputStream(new byte[0]));
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/webview/model/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */