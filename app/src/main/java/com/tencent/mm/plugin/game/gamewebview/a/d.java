package com.tencent.mm.plugin.game.gamewebview.a;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.webkit.URLUtil;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.game.gamewebview.ipc.CommonLogicTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameWebViewMainProcessService;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.mm.plugin.webview.model.ae;
import com.tencent.mm.plugin.webview.modeltools.e;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMFragmentActivity.a;
import com.tencent.mm.ui.ak;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class d
{
  private static volatile ah dJt;
  private static final Set<Object> fEy = new HashSet();
  private static final Object gBw = new Object();
  
  public static String Da(String paramString)
  {
    return f(paramString, null);
  }
  
  public static WebViewJSSDKFileItem Db(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.GameWebViewUtil", "get by local id error, local id is null or nil");
      return null;
    }
    if (ad.cic()) {
      return e.bUX().Qq(paramString);
    }
    CommonLogicTask localCommonLogicTask = new CommonLogicTask();
    localCommonLogicTask.type = 3;
    Bundle localBundle = new Bundle();
    localBundle.putString("localId", paramString);
    localCommonLogicTask.jfZ = localBundle;
    GameWebViewMainProcessService.b(localCommonLogicTask);
    return (WebViewJSSDKFileItem)localCommonLogicTask.jfZ.getParcelable("item");
  }
  
  public static String Dc(String paramString)
  {
    Object localObject = null;
    try
    {
      Matcher localMatcher = Pattern.compile("(?i)^.*filename=\"?([^\"]+)\"?.*$").matcher(paramString);
      paramString = (String)localObject;
      if (localMatcher.find())
      {
        paramString = (String)localObject;
        if (localMatcher.groupCount() == 1) {
          paramString = localMatcher.group(1);
        }
      }
      return paramString;
    }
    catch (Exception paramString)
    {
      x.e("MicroMsg.GameWebViewUtil", "getFileNameFromContentDisposition error " + paramString.getMessage());
    }
    return null;
  }
  
  public static ah Em()
  {
    if (dJt == null) {}
    synchronized (gBw)
    {
      if (dJt == null) {
        dJt = new ah("SubCoreAppBrand#WorkerThread");
      }
      return dJt;
    }
  }
  
  public static boolean aSn()
  {
    if (ad.cic()) {
      return au.HX();
    }
    CommonLogicTask localCommonLogicTask = new CommonLogicTask();
    localCommonLogicTask.type = 6;
    GameWebViewMainProcessService.b(localCommonLogicTask);
    return localCommonLogicTask.jfZ.getBoolean("has_set_uin", false);
  }
  
  public static String ag(Context paramContext, String paramString)
  {
    paramContext = s.aV(paramContext, paramString);
    return paramContext + " GameWebView";
  }
  
  public static int am(int paramInt, String paramString)
  {
    int i = paramInt;
    if (paramInt == 0) {
      if ((paramString == null) || (paramString.length() <= 0)) {
        break label39;
      }
    }
    label39:
    for (i = 1;; i = 0)
    {
      x.i("MicroMsg.GameWebViewUtil", "KGetA8KeyScene = %s", new Object[] { Integer.valueOf(i) });
      return i;
    }
  }
  
  public static void b(Context paramContext, int paramInt, String paramString)
  {
    if (!(paramContext instanceof Activity)) {
      return;
    }
    paramContext = ((Activity)paramContext).getWindow();
    int i;
    if ((Build.VERSION.SDK_INT >= 23) && (!h.Ae()))
    {
      i = paramContext.getDecorView().getSystemUiVisibility();
      if ("black".equals(paramString))
      {
        i |= 0x2000;
        label53:
        paramContext.getDecorView().setSystemUiVisibility(i);
        i = paramInt;
      }
    }
    for (;;)
    {
      paramContext.setStatusBarColor(i);
      return;
      i &= 0xDFFF;
      break label53;
      if (Build.VERSION.SDK_INT < 21) {
        break;
      }
      i = paramInt;
      if ("black".equals(paramString)) {
        i = ak.AD(paramInt);
      }
    }
  }
  
  public static void jdMethod_do(Context paramContext)
  {
    if (!(paramContext instanceof Activity)) {
      return;
    }
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(16973825, new int[] { 16842936, 16842937 });
    int i = localTypedArray.getResourceId(0, 0);
    int j = localTypedArray.getResourceId(1, 0);
    localTypedArray.recycle();
    ((Activity)paramContext).overridePendingTransition(i, j);
  }
  
  public static void dp(Context paramContext)
  {
    if (!(paramContext instanceof Activity)) {
      return;
    }
    ((Activity)paramContext).overridePendingTransition(MMFragmentActivity.a.tnG, MMFragmentActivity.a.tnH);
  }
  
  public static String f(String paramString, Map<String, ? extends Object> paramMap)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("err_msg", paramString);
    if (paramMap != null) {
      localHashMap.putAll(paramMap);
    }
    m(localHashMap);
    return new JSONObject(localHashMap).toString();
  }
  
  public static void m(Map paramMap)
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject2 = (Map.Entry)localIterator.next();
      Object localObject1 = ((Map.Entry)localObject2).getKey();
      localObject2 = ((Map.Entry)localObject2).getValue();
      if (((localObject1 instanceof String)) && ((localObject2 instanceof Map)))
      {
        m((Map)localObject2);
        paramMap.put(localObject1, new JSONObject((Map)localObject2));
      }
    }
  }
  
  public static void runOnUiThread(Runnable paramRunnable)
  {
    if (Thread.currentThread() != Looper.getMainLooper().getThread())
    {
      ah.A(paramRunnable);
      return;
    }
    paramRunnable.run();
  }
  
  public static JSONObject ti(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    try
    {
      paramString = new JSONObject(paramString);
      return paramString;
    }
    catch (Exception paramString)
    {
      x.e("MicroMsg.GameWebViewUtil", paramString.getMessage());
    }
    return null;
  }
  
  public static boolean vN(String paramString)
  {
    return (!bi.oW(paramString)) && ((URLUtil.isHttpsUrl(paramString)) || (URLUtil.isHttpUrl(paramString)));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */