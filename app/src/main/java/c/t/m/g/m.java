package c.t.m.g;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;

public final class m
{
  public static String a;
  public static String b;
  public static String c;
  public static String d;
  public static boolean e = true;
  private static Context f = null;
  private static String g;
  private static long h;
  private static int i = 0;
  private static boolean j = false;
  private static String k = "";
  private static int l;
  private static String m;
  private static String n;
  private static int o;
  private static boolean p;
  private static String q;
  private static Handler r;
  private static volatile boolean s;
  
  static
  {
    a = "null";
    b = "";
    l = 0;
    c = "";
    d = "";
    m = "3.4.1.6";
    n = "";
    o = -1;
    p = false;
    q = "";
    s = false;
  }
  
  public static Context a()
  {
    return f;
  }
  
  public static void a(int paramInt, b paramb, String paramString)
  {
    h = SystemClock.elapsedRealtime();
    o = Process.myPid();
    Context localContext = paramb.a;
    f = localContext.getApplicationContext();
    k = localContext.getPackageName();
    i = paramInt;
    j = paramb.c;
    String str2 = paramb.d;
    String str1 = str2;
    if (ci.a(str2)) {
      str1 = "";
    }
    c = str1;
    str1 = paramb.e;
    paramb = str1;
    if (ci.a(str1)) {
      paramb = "";
    }
    d = paramb;
    m = "3.4.1.6";
    new Handler(f.getMainLooper());
    try
    {
      paramb = localContext.getPackageManager().getPackageInfo(localContext.getPackageName(), 0);
      a = paramb.versionName;
      l = paramb.versionCode;
      b = paramb.applicationInfo.loadLabel(localContext.getPackageManager()).toString();
      n = paramString;
      p = k.equals(n);
      g = ci.d();
      paramb = new HandlerThread("HalleyTempTaskThread");
      paramb.start();
      r = new Handler(paramb.getLooper());
      p.a();
      paramb = new StringBuilder();
      paramb.append("Print SDKBaseInfo on tag:" + "after initSDKBaseInfo");
      paramb.append("\r\nPlatformProtocalType:2");
      paramb.append("\r\nappContext:" + f);
      paramb.append("\r\nbootSessionId:" + g);
      paramb.append("\r\nbootTime:" + h);
      paramb.append("\r\nappId:" + i);
      paramb.append("\r\nisSDKMode:" + j);
      paramb.append("\r\nbundle:" + k);
      paramb.append("\r\nappVersionName:" + a);
      paramb.append("\r\nappVersionCode:" + l);
      paramb.append("\r\nappLabelName:" + b);
      paramb.append("\r\nuuid:" + c);
      paramb.append("\r\nchannelId:" + d);
      paramb.append("\r\nsdkVersion:" + m);
      paramb.append("\r\nsProcessName:" + n);
      paramb.append("\r\npid:" + o);
      paramb.append("\r\nsProcessNameSubfix:" + q);
      paramb.append("\r\nsIsMainProcess:" + p);
      paramb.append("\r\npsInRemoteProcess:" + e);
      paramb.append("\r\nisTestMode:false");
      if (f != null) {
        paramb.append("\r\ndeviceid:" + cd.a());
      }
      paramb.append("\r\nfinger:" + Build.FINGERPRINT);
      return;
    }
    catch (Throwable paramb)
    {
      for (;;) {}
    }
  }
  
  public static int b()
  {
    return i;
  }
  
  public static String c()
  {
    return g;
  }
  
  public static int d()
  {
    return (int)(SystemClock.elapsedRealtime() - h);
  }
  
  public static String e()
  {
    return k;
  }
  
  public static boolean f()
  {
    return j;
  }
  
  public static String g()
  {
    return m;
  }
  
  public static String h()
  {
    if (!ci.a(q)) {
      return q;
    }
    if ((!ci.a(n)) && (n.contains(":")))
    {
      int i1 = n.indexOf(":");
      return n.substring(i1 + 1);
    }
    return "";
  }
  
  public static Handler i()
  {
    return r;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/c/t/m/g/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */