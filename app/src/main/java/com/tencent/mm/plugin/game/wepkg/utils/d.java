package com.tencent.mm.plugin.game.wepkg.utils;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.HandlerThread;
import com.tencent.mm.a.g;
import com.tencent.mm.plugin.game.wepkg.ipc.WepkgMainProcessService;
import com.tencent.mm.plugin.game.wepkg.model.WepkgCrossProcessTask;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class d
{
  private static volatile ah dJt;
  private static final Set<Object> fEy = new HashSet();
  private static final Object gBw = new Object();
  
  public static ah Em()
  {
    if (dJt == null) {}
    synchronized (gBw)
    {
      if (dJt == null) {
        dJt = new ah("WebviewCache#WorkerThread");
      }
      return dJt;
    }
  }
  
  public static String Et(String paramString)
  {
    if (bi.oW(paramString)) {
      return "";
    }
    return b.OBJECT_ROOT_DIR_PATH + paramString + "/";
  }
  
  public static String Eu(String paramString)
  {
    if (bi.oW(paramString)) {
      return "";
    }
    try
    {
      paramString = bi.oV(Uri.parse(paramString).getQueryParameter("wechat_pkgid"));
      return paramString;
    }
    catch (UnsupportedOperationException paramString)
    {
      x.e("MicroMsg.Wepkg.WepkgUtil", paramString.getMessage());
    }
    return "";
  }
  
  public static String Ev(String paramString)
  {
    if (bi.oW(paramString)) {
      return "";
    }
    return Uri.parse(paramString).getHost();
  }
  
  /* Error */
  public static String Ew(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 43	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   4: ifne +10 -> 14
    //   7: aload_0
    //   8: invokestatic 104	android/webkit/URLUtil:isNetworkUrl	(Ljava/lang/String;)Z
    //   11: ifne +8 -> 19
    //   14: ldc 45
    //   16: astore_1
    //   17: aload_1
    //   18: areturn
    //   19: aload_0
    //   20: invokestatic 73	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   23: astore_1
    //   24: aload_0
    //   25: new 47	java/lang/StringBuilder
    //   28: dup
    //   29: invokespecial 48	java/lang/StringBuilder:<init>	()V
    //   32: aload_1
    //   33: invokevirtual 107	android/net/Uri:getScheme	()Ljava/lang/String;
    //   36: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: ldc 109
    //   41: invokevirtual 58	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: invokevirtual 64	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   47: ldc 45
    //   49: invokevirtual 115	java/lang/String:replaceFirst	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   52: astore_1
    //   53: aload_1
    //   54: astore_0
    //   55: aload_0
    //   56: astore_1
    //   57: aload_0
    //   58: ldc 117
    //   60: invokevirtual 121	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   63: ifeq -46 -> 17
    //   66: aload_0
    //   67: iconst_0
    //   68: aload_0
    //   69: ldc 117
    //   71: invokevirtual 125	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   74: invokevirtual 129	java/lang/String:substring	(II)Ljava/lang/String;
    //   77: astore_1
    //   78: aload_1
    //   79: areturn
    //   80: astore_1
    //   81: aload_0
    //   82: areturn
    //   83: astore_1
    //   84: aload_0
    //   85: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	paramString	String
    //   16	63	1	localObject	Object
    //   80	1	1	localException1	Exception
    //   83	1	1	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   19	53	80	java/lang/Exception
    //   57	78	83	java/lang/Exception
  }
  
  public static boolean Ex(String paramString)
  {
    if (!bi.oW(Eu(paramString)))
    {
      SharedPreferences localSharedPreferences = ad.getContext().getSharedPreferences("we_pkg_sp", 4);
      if ((localSharedPreferences != null) && (localSharedPreferences.getBoolean("disable_we_pkg", false)))
      {
        x.i("MicroMsg.Wepkg.WepkgUtil", "disable wepkg");
        a.b("EnterWeb", paramString, Eu(paramString), null, 0L, 0L, a.rd(11));
        return false;
      }
      if (b.kgl)
      {
        x.i("MicroMsg.Wepkg.WepkgUtil", "config wepkg disable");
        a.b("EnterWeb", paramString, Eu(paramString), null, 0L, 0L, a.rd(12));
        return false;
      }
      return true;
    }
    return false;
  }
  
  public static boolean Ey(String paramString)
  {
    try
    {
      paramString = new File(paramString);
      if ((!paramString.exists()) || (!paramString.isDirectory())) {
        paramString.mkdirs();
      }
      return true;
    }
    catch (Exception paramString) {}
    return false;
  }
  
  public static void a(String paramString, com.tencent.mm.plugin.game.wepkg.model.a parama)
  {
    long l = System.currentTimeMillis();
    WepkgCrossProcessTask localWepkgCrossProcessTask = new WepkgCrossProcessTask();
    localWepkgCrossProcessTask.nc = 1001;
    localWepkgCrossProcessTask.kfj = paramString;
    if (ad.cic())
    {
      Em().H(new d.1(localWepkgCrossProcessTask, parama));
      return;
    }
    localWepkgCrossProcessTask.fFC = new d.2(l, parama, localWepkgCrossProcessTask);
    localWepkgCrossProcessTask.ahA();
    WepkgMainProcessService.a(localWepkgCrossProcessTask);
  }
  
  public static boolean aVC()
  {
    GregorianCalendar localGregorianCalendar = new GregorianCalendar();
    int i = localGregorianCalendar.get(11);
    int j = localGregorianCalendar.get(12);
    if ((i >= 12) && (i < 14)) {}
    do
    {
      return true;
      if (i != 14) {
        break;
      }
    } while (j <= 30);
    while ((i < 18) || (i > 24)) {
      return false;
    }
    return true;
  }
  
  public static long aow()
  {
    return bi.VE();
  }
  
  public static void aox()
  {
    if (dJt == null) {
      return;
    }
    synchronized (gBw)
    {
      if (dJt != null)
      {
        dJt.lnJ.quit();
        dJt = null;
      }
      return;
    }
  }
  
  public static void az(Object paramObject)
  {
    if (paramObject == null) {
      return;
    }
    fEy.remove(paramObject);
  }
  
  public static <T> T br(T paramT)
  {
    fEy.add(paramT);
    return paramT;
  }
  
  public static boolean dE(Context paramContext)
  {
    paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
    if (paramContext == null) {
      return false;
    }
    paramContext = paramContext.iterator();
    while (paramContext.hasNext())
    {
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)paramContext.next();
      if ((localRunningAppProcessInfo.importance == 100) && ((localRunningAppProcessInfo.processName.equals("com.tencent.mm")) || (localRunningAppProcessInfo.processName.equals("com.tencent.mm:tools")))) {
        return true;
      }
    }
    return false;
  }
  
  public static String dh(String paramString1, String paramString2)
  {
    if ((bi.oW(paramString1)) || (bi.oW(paramString2))) {
      return "";
    }
    return Et(paramString1) + paramString2;
  }
  
  public static String di(String paramString1, String paramString2)
  {
    return g.u((paramString1 + "_" + paramString2).getBytes());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/wepkg/utils/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */