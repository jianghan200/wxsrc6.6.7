package com.tencent.mm.plugin.topstory.ui.webview;

import android.content.Intent;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.tencent.mm.ab.o;
import com.tencent.mm.plugin.report.f;
import com.tencent.mm.plugin.topstory.ui.d.3;
import com.tencent.mm.plugin.topstory.ui.d.a;
import com.tencent.mm.plugin.topstory.ui.home.a;
import com.tencent.mm.plugin.websearch.api.n;
import com.tencent.mm.plugin.websearch.api.p;
import com.tencent.mm.protocal.c.bgx;
import com.tencent.mm.protocal.c.bte;
import com.tencent.mm.protocal.c.btg;
import com.tencent.mm.protocal.c.ps;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
{
  bte ccA;
  private b oCA;
  TopStoryWebView oCB;
  private boolean oCC = true;
  public a oCq;
  
  public d(TopStoryWebView paramTopStoryWebView, bte parambte, b paramb)
  {
    this.oCB = paramTopStoryWebView;
    this.ccA = parambte;
    this.oCA = paramb;
  }
  
  private static JSONObject bIG()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("ret", 0);
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
    return localJSONObject;
  }
  
  private static JSONObject bIH()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("ret", -1);
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
    return localJSONObject;
  }
  
  public final void Ot(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("json", paramString);
      localJSONObject.put("newQuery", this.oCC);
      localJSONObject.put("isCache", false);
      ah.A(new d.1(this, localJSONObject));
      return;
    }
    catch (Exception paramString) {}
  }
  
  public final void Ox(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("state", paramString);
      localJSONObject.put("sessionId", this.ccA.bJK);
      localJSONObject.put("subSessionId", this.ccA.bWr);
      localJSONObject.put("scene", this.ccA.scene);
      ah.A(new d.2(this, localJSONObject));
      return;
    }
    catch (Exception paramString) {}
  }
  
  /* Error */
  @JavascriptInterface
  public final String doGoToRecVideoList(String paramString)
  {
    // Byte code:
    //   0: ldc 100
    //   2: ldc 102
    //   4: iconst_1
    //   5: anewarray 4	java/lang/Object
    //   8: dup
    //   9: iconst_0
    //   10: aload_1
    //   11: aastore
    //   12: invokestatic 108	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   15: new 34	org/json/JSONObject
    //   18: dup
    //   19: aload_1
    //   20: invokespecial 110	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   23: invokestatic 116	com/tencent/mm/plugin/topstory/a/g:ab	(Lorg/json/JSONObject;)Lcom/tencent/mm/protocal/c/bth;
    //   26: astore_2
    //   27: new 118	android/content/Intent
    //   30: dup
    //   31: invokespecial 119	android/content/Intent:<init>	()V
    //   34: astore_1
    //   35: aload_1
    //   36: ldc 121
    //   38: aload_2
    //   39: invokevirtual 127	com/tencent/mm/protocal/c/bth:toByteArray	()[B
    //   42: invokevirtual 131	android/content/Intent:putExtra	(Ljava/lang/String;[B)Landroid/content/Intent;
    //   45: pop
    //   46: aload_0
    //   47: getfield 133	com/tencent/mm/plugin/topstory/ui/webview/d:oCq	Lcom/tencent/mm/plugin/topstory/ui/home/a;
    //   50: ifnull +18 -> 68
    //   53: aload_0
    //   54: getfield 133	com/tencent/mm/plugin/topstory/ui/webview/d:oCq	Lcom/tencent/mm/plugin/topstory/ui/home/a;
    //   57: invokeinterface 139 1 0
    //   62: ldc -115
    //   64: aload_1
    //   65: invokestatic 147	com/tencent/mm/plugin/websearch/api/p:c	(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V
    //   68: invokestatic 149	com/tencent/mm/plugin/topstory/ui/webview/d:bIG	()Lorg/json/JSONObject;
    //   71: invokevirtual 153	org/json/JSONObject:toString	()Ljava/lang/String;
    //   74: astore_1
    //   75: aload_1
    //   76: areturn
    //   77: astore_1
    //   78: ldc 100
    //   80: aload_1
    //   81: ldc -102
    //   83: iconst_0
    //   84: anewarray 4	java/lang/Object
    //   87: invokestatic 158	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   90: invokestatic 160	com/tencent/mm/plugin/topstory/ui/webview/d:bIH	()Lorg/json/JSONObject;
    //   93: invokevirtual 153	org/json/JSONObject:toString	()Ljava/lang/String;
    //   96: areturn
    //   97: astore_2
    //   98: goto -52 -> 46
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	101	0	this	d
    //   0	101	1	paramString	String
    //   26	13	2	localbth	com.tencent.mm.protocal.c.bth
    //   97	1	2	localIOException	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   15	35	77	java/lang/Exception
    //   35	46	77	java/lang/Exception
    //   46	68	77	java/lang/Exception
    //   68	75	77	java/lang/Exception
    //   35	46	97	java/io/IOException
  }
  
  @JavascriptInterface
  public final String getNetworkType(String paramString)
  {
    x.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "getNetworkType %s", new Object[] { paramString });
    for (;;)
    {
      try
      {
        paramString = bIG();
        String str = p.bjC();
        paramString.put("subtype", str);
        if (str.equals("wifi"))
        {
          paramString.put("err_msg", "network_type:wifi");
          return paramString.toString();
        }
        if (str.equals("fail")) {
          paramString.put("err_msg", "network_type:fail");
        } else {
          paramString.put("err_msg", "network_type:wwan");
        }
      }
      catch (Exception paramString)
      {
        return bIH().toString();
      }
    }
  }
  
  @JavascriptInterface
  public final String getSearchData(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    x.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "getSearchData %s", new Object[] { paramString });
    com.tencent.mm.plugin.topstory.ui.d.c(this.ccA, "getSearchData", System.currentTimeMillis());
    for (;;)
    {
      bte localbte;
      try
      {
        paramString = new JSONObject(paramString);
        localbte = new bte();
        localbte.sqA = this.ccA.sqA;
        localbte.bHt = paramString.optString("query", "");
        localbte.offset = paramString.optInt("offset", 0);
        localbte.scene = paramString.optInt("scene", 21);
        localbte.bJK = paramString.optString("sessionId", "");
        localbte.bWr = paramString.optString("subSessionId", "");
        localbte.fuu = paramString.optString("searchId", "");
        localbte.kJG = paramString.optString("requestId", "");
        localbte.bxk = paramString.optInt("tagId", 0);
        localbte.pLi = paramString.optString("navigationId", "");
        paramString = paramString.optString("extReqParams", "");
        if (!bi.oW(paramString))
        {
          paramString = new JSONArray(paramString);
          int i = 0;
          if (i < paramString.length())
          {
            localObject3 = paramString.getJSONObject(i);
            ps localps = new ps();
            localps.aAL = ((JSONObject)localObject3).optString("key", "");
            localps.rtU = ((JSONObject)localObject3).optInt("uintValue", 0);
            localps.rtV = ((JSONObject)localObject3).optString("textValue", "");
            localbte.pKZ.add(localps);
            i += 1;
            continue;
          }
        }
        Object localObject3 = this.oCA;
        if (((b)localObject3).oCs == null)
        {
          paramString = (String)localObject2;
          if (bi.oW(paramString)) {
            break label452;
          }
          Ot(paramString);
          return bIG().toString();
        }
        paramString = (String)localObject1;
        if (((b)localObject3).oCs.oCz.bJK.equals(localbte.bJK))
        {
          paramString = (String)localObject1;
          if (System.currentTimeMillis() - ((b)localObject3).oCs.hnN <= 60000L) {
            paramString = ((b)localObject3).oCs.oCy;
          }
        }
        ((b)localObject3).oCs = null;
        if (bi.oW(paramString))
        {
          x.i("MicroMsg.TopStory.TopStoryWebData", "load data from cache fail");
          continue;
        }
      }
      catch (Exception paramString)
      {
        x.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", paramString, "getSearchData", new Object[0]);
        return bIH().toString();
      }
      tmp436_433[0] = Integer.valueOf(paramString.length());
      x.i("MicroMsg.TopStory.TopStoryWebData", "load data from cache success %d", tmp436_433);
      continue;
      label452:
      this.oCA.a(localbte, true);
    }
  }
  
  @JavascriptInterface
  public final String log(String paramString)
  {
    x.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "log: %s", new Object[] { paramString });
    return bIG().toString();
  }
  
  @JavascriptInterface
  public final String openSearchWebView(String paramString)
  {
    x.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "openSearchWebView %s", new Object[] { paramString });
    String str1;
    for (;;)
    {
      try
      {
        paramString = new JSONObject(paramString);
        i = paramString.optInt("actionType");
        localObject1 = paramString.optString("extParams", "");
        str1 = paramString.optString("publishId", "");
        switch (i)
        {
        case 4: 
          return bIG().toString();
        }
      }
      catch (Exception paramString)
      {
        return bIH().toString();
      }
      Object localObject1 = new Intent();
      paramString = paramString.optString("jumpUrl", "");
      ((Intent)localObject1).putExtra("rawUrl", paramString);
      ((Intent)localObject1).putExtra("KPublisherId", str1);
      x.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "jump url = %s, publishId = %s", new Object[] { paramString, str1 });
      com.tencent.mm.bg.d.b(this.oCq.baA(), "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
      continue;
      String str2 = paramString.optString("query", "");
      int i = paramString.optInt("scene", 0);
      String str3 = paramString.optString("sessionId", "");
      String str4 = p.zK(i);
      int j = paramString.optInt("tagId", 0);
      Object localObject2 = paramString.optString("nativeConfig", "");
      str1 = null;
      boolean bool = TextUtils.isEmpty((CharSequence)localObject2);
      paramString = str1;
      if (!bool) {}
      try
      {
        localObject2 = new JSONObject((String)localObject2);
        paramString = str1;
        if (((JSONObject)localObject2).has("title")) {
          paramString = ((JSONObject)localObject2).optString("title");
        }
      }
      catch (JSONException paramString)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", paramString, "", new Object[0]);
          paramString = str1;
        }
      }
      str1 = String.valueOf(System.currentTimeMillis());
      localObject2 = new HashMap();
      ((HashMap)localObject2).put("scene", String.valueOf(i));
      ((HashMap)localObject2).put("query", str2);
      ((HashMap)localObject2).put("sessionId", str3);
      ((HashMap)localObject2).put("extParams", localObject1);
      ((HashMap)localObject2).put("subSessionId", str4);
      ((HashMap)localObject2).put("requestId", str1);
      ((HashMap)localObject2).put("pRequestId", str1);
      ((HashMap)localObject2).put("seq", str1);
      localObject1 = new bte();
      ((bte)localObject1).sqA = com.tencent.mm.plugin.topstory.ui.d.bHF();
      ((bte)localObject1).scene = i;
      ((bte)localObject1).fuu = "";
      ((bte)localObject1).bHt = str2;
      ((bte)localObject1).bJK = str3;
      ((bte)localObject1).bWr = str3;
      ((bte)localObject1).sqC = 2;
      ((bte)localObject1).url = com.tencent.mm.plugin.topstory.a.g.n((HashMap)localObject2);
      ((bte)localObject1).sqD = paramString;
      ((bte)localObject1).bxk = j;
      ((bte)localObject1).kJG = str1;
      paramString = new ps();
      paramString.aAL = "rec_category";
      paramString.rtU = j;
      paramString.rtV = String.valueOf(j);
      ((bte)localObject1).pKZ.add(paramString);
      com.tencent.mm.plugin.topstory.ui.d.a(ad.getContext(), (bte)localObject1, str1);
    }
  }
  
  @JavascriptInterface
  public final String reportSearchRealTimeStatistics(String paramString)
  {
    x.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "reportSearchRealTimeStatistics %s", new Object[] { paramString });
    try
    {
      paramString = new JSONObject(paramString);
      bgx localbgx = new bgx();
      localbgx.shQ = paramString.optString("logString", "");
      paramString = new n(localbgx);
      com.tencent.mm.kernel.g.DF().a(paramString, 0);
      paramString = bIG().toString();
      return paramString;
    }
    catch (Exception paramString)
    {
      x.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", paramString, "reportSearchRealTimeStatistics", new Object[0]);
    }
    return bIH().toString();
  }
  
  @JavascriptInterface
  public final String reportSearchStatistics(String paramString)
  {
    x.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "reportSearchStatistics %s", new Object[] { paramString });
    try
    {
      paramString = new JSONObject(paramString);
      int i = paramString.optInt("logId", 0);
      if (i != 14904)
      {
        paramString = paramString.optString("logString", "");
        f.mDy.k(i, paramString);
      }
      paramString = bIG().toString();
      return paramString;
    }
    catch (Exception paramString)
    {
      x.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", paramString, "reportSearchStatistics", new Object[0]);
    }
    return bIH().toString();
  }
  
  @JavascriptInterface
  public final String stage(String paramString)
  {
    try
    {
      x.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "stage %s", new Object[] { paramString });
      paramString = new JSONObject(paramString);
      if (paramString.keys() != null)
      {
        Iterator localIterator = paramString.keys();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          long l = paramString.optLong(str);
          com.tencent.mm.plugin.topstory.ui.d.c(this.ccA, str, l);
        }
      }
      paramString = bIG().toString();
    }
    catch (Exception paramString)
    {
      x.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", paramString, "stage", new Object[0]);
      return bIH().toString();
    }
    return paramString;
  }
  
  @JavascriptInterface
  public final String startSearchItemDetailPage(String paramString)
  {
    x.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "startSearchItemDetailPage %s", new Object[] { paramString });
    try
    {
      Object localObject = new JSONObject(paramString);
      paramString = ((JSONObject)localObject).optString("jumpUrl", "");
      localObject = ((JSONObject)localObject).optString("publishId", "");
      Intent localIntent = new Intent();
      localIntent.putExtra("rawUrl", paramString);
      localIntent.putExtra("KPublisherId", (String)localObject);
      x.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "jump url = %s, publishId = %s", new Object[] { paramString, localObject });
      com.tencent.mm.bg.d.b(this.oCq.baA(), "webview", ".ui.tools.WebViewUI", localIntent);
      paramString = bIG().toString();
      return paramString;
    }
    catch (Exception paramString)
    {
      x.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", paramString, "reportSearchRealTimeReport", new Object[0]);
    }
    return bIH().toString();
  }
  
  @JavascriptInterface
  public final String updateReddotTimeStamps(String paramString)
  {
    x.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "updateReddotTimeStamps %s", new Object[] { paramString });
    try
    {
      paramString = new JSONObject(paramString);
      ((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().fu(paramString.optLong("reddotTimeStamps", 0L));
      paramString = bIG().toString();
      return paramString;
    }
    catch (Exception paramString)
    {
      x.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", paramString, "updateReddotTimeStamps", new Object[0]);
    }
    return bIH().toString();
  }
  
  @JavascriptInterface
  public final String webViewUIReady(String paramString)
  {
    try
    {
      if (this.oCC)
      {
        this.oCC = false;
        if (this.oCq != null) {
          this.oCq.bHG();
        }
        com.tencent.mm.plugin.topstory.ui.d.c(this.ccA, "webViewUIReady", System.currentTimeMillis());
        paramString = this.ccA;
        Collections.sort(paramString.sqB, new d.3());
        StringBuffer localStringBuffer = new StringBuffer();
        int i = 1;
        while (i < paramString.sqB.size())
        {
          localStringBuffer.append(((btg)paramString.sqB.get(i - 1)).name);
          localStringBuffer.append("->");
          localStringBuffer.append(((btg)paramString.sqB.get(i)).name);
          localStringBuffer.append(":");
          localStringBuffer.append(((btg)paramString.sqB.get(i)).timestamp - ((btg)paramString.sqB.get(i - 1)).timestamp);
          localStringBuffer.append("\n");
          i += 1;
        }
        if (paramString.sqB.size() > 2)
        {
          localStringBuffer.append("TotalUseTime:");
          localStringBuffer.append(((btg)paramString.sqB.get(paramString.sqB.size() - 1)).timestamp - ((btg)paramString.sqB.get(0)).timestamp);
          localStringBuffer.append("\n");
        }
        paramString.sqB.clear();
        localStringBuffer.append("============");
        localStringBuffer.append("\n");
        if (com.tencent.mm.plugin.topstory.a.g.bHC()) {
          com.tencent.mm.sdk.f.e.post(new d.a(localStringBuffer.toString()), "TopStory.SaveTraceTask");
        }
        x.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "traceResult:\n%s", new Object[] { localStringBuffer.toString() });
      }
      paramString = bIG().toString();
      return paramString;
    }
    catch (Exception paramString) {}
    return bIH().toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/topstory/ui/webview/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */