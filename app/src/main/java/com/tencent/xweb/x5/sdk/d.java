package com.tencent.xweb.x5.sdk;

import android.content.Context;
import android.webkit.ValueCallback;
import com.tencent.xweb.r;
import java.util.HashMap;
import java.util.Map;
import org.xwalk.core.Log;

public final class d
{
  static a vDZ;
  
  static {}
  
  /* Error */
  public static void a(Context paramContext, a parama)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 20	com/tencent/xweb/x5/sdk/d:vDZ	Lcom/tencent/xweb/x5/sdk/a;
    //   6: ifnull +17 -> 23
    //   9: getstatic 20	com/tencent/xweb/x5/sdk/d:vDZ	Lcom/tencent/xweb/x5/sdk/a;
    //   12: aload_0
    //   13: aload_1
    //   14: invokeinterface 24 3 0
    //   19: ldc 2
    //   21: monitorexit
    //   22: return
    //   23: ldc 26
    //   25: ldc 28
    //   27: invokestatic 34	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   30: goto -11 -> 19
    //   33: astore_0
    //   34: ldc 2
    //   36: monitorexit
    //   37: aload_0
    //   38: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	39	0	paramContext	Context
    //   0	39	1	parama	a
    // Exception table:
    //   from	to	target	type
    //   3	19	33	finally
    //   23	30	33	finally
  }
  
  public static void a(Context paramContext, String paramString, ValueCallback<Boolean> paramValueCallback)
  {
    if (vDZ != null)
    {
      vDZ.a(paramContext, paramString, paramValueCallback);
      return;
    }
    Log.e("TbsDownloader", "canOpenFile: sImp is null");
  }
  
  public static void a(a parama)
  {
    vDZ = parama;
  }
  
  public static void a(h paramh)
  {
    if (vDZ != null)
    {
      vDZ.a(paramh);
      return;
    }
    Log.e("TbsDownloader", "setTbsListener: sImp is null");
  }
  
  public static boolean a(Context paramContext, String paramString, HashMap<String, String> paramHashMap, ValueCallback<String> paramValueCallback)
  {
    if (vDZ != null) {
      return vDZ.a(paramContext, paramString, paramHashMap, paramValueCallback);
    }
    Log.e("TbsDownloader", "startQbOrMiniQBToLoadUrl: sImp is null");
    return false;
  }
  
  public static boolean canOpenWebPlus(Context paramContext)
  {
    if (vDZ != null) {
      return vDZ.canOpenWebPlus(paramContext);
    }
    Log.e("TbsDownloader", "canOpenWebPlus: sImp is null");
    return false;
  }
  
  public static void clearAllWebViewCache(Context paramContext, boolean paramBoolean)
  {
    if (vDZ != null)
    {
      vDZ.clearAllWebViewCache(paramContext, paramBoolean);
      return;
    }
    Log.e("TbsDownloader", "clearAllWebViewCache: sImp is null");
  }
  
  public static void closeFileReader(Context paramContext)
  {
    if (vDZ != null)
    {
      vDZ.closeFileReader(paramContext);
      return;
    }
    Log.e("TbsDownloader", "closeFileReader: sImp is null");
  }
  
  public static void forceSysWebView()
  {
    if (vDZ != null)
    {
      vDZ.forceSysWebView();
      return;
    }
    Log.e("TbsDownloader", "forceSysWebView: sImp is null");
  }
  
  public static boolean getTBSInstalling()
  {
    if (vDZ != null) {
      return vDZ.getTBSInstalling();
    }
    Log.e("TbsDownloader", "getTBSInstalling: sImp is null");
    return false;
  }
  
  public static int getTbsVersion(Context paramContext)
  {
    if (vDZ != null) {
      return vDZ.getTbsVersion(paramContext);
    }
    Log.e("TbsDownloader", "getTbsVersion: sImp is null");
    return 0;
  }
  
  public static void initTbsSettings(Map<String, Object> paramMap)
  {
    if (vDZ != null)
    {
      vDZ.initTbsSettings(paramMap);
      return;
    }
    Log.e("TbsDownloader", "initTbsSettings: sImp is null");
  }
  
  public static boolean isTbsCoreInited()
  {
    if (vDZ != null) {
      return vDZ.isTbsCoreInited();
    }
    Log.e("TbsDownloader", "isTbsCoreInited: sImp is null");
    return false;
  }
  
  public static void reset(Context paramContext)
  {
    if (vDZ != null)
    {
      vDZ.reset(paramContext);
      return;
    }
    Log.e("TbsDownloader", "reset: sImp is null");
  }
  
  public static int startMiniQBToLoadUrl(Context paramContext, String paramString, HashMap<String, String> paramHashMap, ValueCallback<String> paramValueCallback)
  {
    if (vDZ != null) {
      return vDZ.startMiniQBToLoadUrl(paramContext, paramString, paramHashMap, paramValueCallback);
    }
    Log.e("TbsDownloader", "startMiniQBToLoadUrl: sImp is null");
    return 0;
  }
  
  public static abstract interface a
  {
    public abstract void onViewInitFinished(boolean paramBoolean);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/xweb/x5/sdk/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */