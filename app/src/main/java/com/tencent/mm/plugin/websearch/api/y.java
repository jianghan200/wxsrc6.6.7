package com.tencent.mm.plugin.websearch.api;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Pair;
import com.jg.JgClassChecked;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.e;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.xweb.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import junit.framework.Assert;

@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.JSEXECUTECHECK})
public final class y
{
  private static at ewg = null;
  private static final Pattern pLQ = Pattern.compile("data:(image|img)/\\S+;base64,\\S+");
  private static final Map<String, String> pLR;
  private static final Map<String, String> pLS;
  
  static
  {
    Object localObject = new ArrayList();
    ((ArrayList)localObject).add(new Pair("silk", "audio/silk"));
    ((ArrayList)localObject).add(new Pair("jpg", "image/jpg"));
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    localObject = ((ArrayList)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      Pair localPair = (Pair)((Iterator)localObject).next();
      localHashMap1.put(localPair.first, localPair.second);
      localHashMap2.put(localPair.second, localPair.first);
    }
    pLR = Collections.unmodifiableMap(localHashMap1);
    pLS = Collections.unmodifiableMap(localHashMap2);
  }
  
  public static void a(WebView paramWebView)
  {
    x.d("MicroMsg.WebSearch.WebSearchPreloadApiLogic", "initIFrame");
    paramWebView.evaluateJavascript("javascript:var edw_iframe = document.getElementById('_edw_iframe_');if (edw_iframe === null) {edw_iframe = document.createElement('iframe');edw_iframe.id = '_edw_iframe_';edw_iframe.style.display = 'none';document.documentElement.appendChild(edw_iframe); console.log('init frame')}", new y.1());
  }
  
  public static String aV(Context paramContext, String paramString)
  {
    Object localObject = "MicroMsg.WebSearch.WebSearchPreloadApiLogic, appendUserAgent fail, context is null, stack = " + bi.cjd();
    boolean bool;
    if (paramContext != null)
    {
      bool = true;
      Assert.assertTrue((String)localObject, bool);
      if (paramString != null) {
        break label191;
      }
    }
    label191:
    for (paramString = " MicroMessenger/";; paramString = paramString + " MicroMessenger/")
    {
      localObject = getPackageInfo(paramContext, ad.getPackageName());
      paramContext = paramString;
      if (localObject != null)
      {
        paramContext = paramString + e.aj(null, d.qVN);
        paramContext = paramContext + "." + ((PackageInfo)localObject).versionCode;
      }
      paramString = ao.fH(ad.getContext());
      paramContext = paramContext + " NetType/" + paramString;
      paramContext = paramContext + " Language/" + w.fD(ad.getContext());
      x.i("MicroMsg.WebSearch.WebSearchPreloadApiLogic", "appendUserAgent, uaStr = " + paramContext);
      return paramContext;
      bool = false;
      break;
    }
  }
  
  public static boolean fj(String paramString1, String paramString2)
  {
    x.i("MicroMsg.WebSearch.WebSearchPreloadApiLogic", "url %s,prefix %s", new Object[] { paramString1, paramString2 });
    if ((paramString1 == null) || (paramString1.length() < 0) || (paramString2.length() < 0)) {}
    while (paramString2.length() > paramString1.length()) {
      return false;
    }
    if (paramString2.equalsIgnoreCase(paramString1.substring(0, paramString2.length())))
    {
      x.i("MicroMsg.WebSearch.WebSearchPreloadApiLogic", "true url %s,prefix %s", new Object[] { paramString1, paramString2 });
      return true;
    }
    x.i("MicroMsg.WebSearch.WebSearchPreloadApiLogic", "false %s,prefix %s", new Object[] { paramString1, paramString2 });
    return false;
  }
  
  private static PackageInfo getPackageInfo(Context paramContext, String paramString)
  {
    if (paramString == null)
    {
      x.e("MicroMsg.WebSearch.WebSearchPreloadApiLogic", "getPackageInfo fail, packageName is null");
      return null;
    }
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 0);
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      x.printErrStackTrace("MicroMsg.WebSearch.WebSearchPreloadApiLogic", paramContext, "", new Object[0]);
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/websearch/api/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */