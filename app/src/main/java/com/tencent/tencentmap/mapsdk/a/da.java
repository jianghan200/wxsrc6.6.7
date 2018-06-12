package com.tencent.tencentmap.mapsdk.a;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import java.util.Date;
import java.util.Map;

public class da
{
  protected static Map<String, String> a = null;
  private static Context b = null;
  private static String c = "";
  private static String d = "10000";
  private static String e = "";
  private static Runnable f = new da.1();
  
  public static String a()
  {
    return d;
  }
  
  public static void a(Context paramContext)
  {
    a(paramContext, null, true, 0L);
  }
  
  @TargetApi(14)
  private static void a(Context paramContext, dm paramdm, boolean paramBoolean, long paramLong)
  {
    if (paramContext == null)
    {
      ct.c(" the context is null! init beacon sdk failed!", new Object[0]);
      return;
    }
    Context localContext = paramContext.getApplicationContext();
    if (localContext != null) {}
    for (b = localContext;; b = paramContext)
    {
      if (paramLong > 0L)
      {
        long l = paramLong;
        if (paramLong > 10000L) {
          l = 10000L;
        }
        cg.a(l);
      }
      paramLong = new Date().getTime();
      if (Integer.valueOf(Build.VERSION.SDK).intValue() >= 14)
      {
        paramContext = new f();
        ((Application)b).registerActivityLifecycleCallbacks(paramContext);
      }
      ct.a("initUserAction t1:" + (new Date().getTime() - paramLong), new Object[0]);
      paramContext = dl.a(b, a(paramBoolean));
      dl.a(b, paramContext, paramdm);
      ct.a("initUserAction t1:" + (new Date().getTime() - paramLong), new Object[0]);
      return;
    }
  }
  
  public static void a(String paramString)
  {
    if ((paramString != null) && (!paramString.trim().equals(""))) {
      a.a(paramString);
    }
  }
  
  public static void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    ct.a = paramBoolean1;
    ct.b = paramBoolean2;
  }
  
  public static boolean a(String paramString, boolean paramBoolean1, long paramLong1, long paramLong2, Map<String, String> paramMap, boolean paramBoolean2)
  {
    return a(paramString, paramBoolean1, paramLong1, paramLong2, paramMap, paramBoolean2, false);
  }
  
  public static boolean a(String paramString, boolean paramBoolean1, long paramLong1, long paramLong2, Map<String, String> paramMap, boolean paramBoolean2, boolean paramBoolean3)
  {
    if ((paramString == null) || ("".equals(paramString.trim())))
    {
      ct.c("param eventName is null or \"\", please check it, return false! ", new Object[0]);
      return false;
    }
    String str2 = paramString.replace('|', '_').trim();
    String str1;
    if (str2.length() == 0)
    {
      ct.c("eventName is invalid!! eventName length == 0!", new Object[0]);
      str1 = null;
    }
    while (str1 == null)
    {
      return false;
      if (e.c(str2))
      {
        str1 = str2;
        if (str2.length() > 128)
        {
          ct.c("eventName is invalid!! eventName length should be less than 128! eventName:" + paramString, new Object[0]);
          str1 = str2.substring(0, 128);
        }
      }
      else
      {
        ct.c("eventName is invalid!! eventName should be ASCII code in 32-126! eventName:" + paramString, new Object[0]);
        str1 = null;
      }
    }
    return dl.a(str1, paramBoolean1, paramLong1, paramLong2, paramMap, paramBoolean2, paramBoolean3);
  }
  
  private static boolean a(boolean paramBoolean)
  {
    boolean bool = true;
    if (!paramBoolean) {
      paramBoolean = false;
    }
    String str;
    int k;
    int i;
    do
    {
      return paramBoolean;
      str = a.b(b, "pid_stat", "");
      k = Process.myPid();
      if ("".equals(str))
      {
        a.c(b, String.valueOf(k));
        return true;
      }
      i = -1;
      try
      {
        int j = Integer.valueOf(str).intValue();
        i = j;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
      paramBoolean = bool;
    } while (i == k);
    if (!a.a(b, i))
    {
      a.c(b, str);
      return true;
    }
    return false;
  }
  
  public static String b()
  {
    return c;
  }
  
  public static void b(String paramString)
  {
    if ((paramString != null) && (!paramString.equals(""))) {
      e = paramString;
    }
  }
  
  public static Map<String, String> c()
  {
    return a;
  }
  
  public static void c(String paramString)
  {
    c localc2 = c.m();
    c localc1 = localc2;
    if (localc2 == null)
    {
      c.a(b);
      localc1 = c.m();
    }
    if (localc1 == null)
    {
      ct.d("please set the channelID after call initUserAction!", new Object[0]);
      return;
    }
    localc1.c(e.b(paramString));
  }
  
  public static String d()
  {
    return e;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/da.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */