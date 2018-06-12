package com.tencent.mm.splash;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningServiceInfo;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.system.OsConstants;
import com.tencent.mm.a.e;
import com.tencent.mm.sdk.platformtools.bi;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

public final class a
{
  private static String sMl;
  private static String sMm;
  private static File sMn;
  private static long sMo;
  @SuppressLint({"HandlerLeak"})
  private static Handler sMp = new Handler(Looper.getMainLooper())
  {
    public final void handleMessage(Message paramAnonymousMessage)
    {
      paramAnonymousMessage = (a.a)paramAnonymousMessage.obj;
      if (a.yT()) {
        if (a.gf(a.sMo))
        {
          if (!a.fZ(h.sMx))
          {
            h.ckd().f(675L, 25L, 1L);
            paramAnonymousMessage.cjQ();
            return;
          }
          if (!a.ge(h.sMx)) {
            h.ckd().f(675L, 18L, 1L);
          }
          h.ckd().f(675L, 17L, 1L);
          paramAnonymousMessage.cjR();
        }
      }
      for (;;)
      {
        a.cjP();
        return;
        a.c(paramAnonymousMessage);
        return;
        if (!a.cD())
        {
          h.ckd().f(675L, 15L, 1L);
          paramAnonymousMessage.cjQ();
        }
        else if (!a.fZ(h.sMx))
        {
          h.ckd().f(675L, 26L, 1L);
          h.ckd().f(675L, 15L, 1L);
          paramAnonymousMessage.cjQ();
        }
        else
        {
          h.ckd().f(675L, 16L, 1L);
          paramAnonymousMessage.bxm();
        }
      }
    }
  };
  
  private static void XA(String paramString)
  {
    try
    {
      String str = cjM();
      File localFile = new File(str);
      if (!localFile.exists()) {
        localFile.mkdirs();
      }
      paramString = new File(str + "/" + paramString);
      if (paramString.exists()) {
        paramString.delete();
      }
      paramString.createNewFile();
      sMn = paramString;
      return;
    }
    finally {}
  }
  
  public static void a(a parama)
  {
    b(parama);
  }
  
  private static void b(a parama)
  {
    if (sMo == 0L) {
      sMo = System.currentTimeMillis();
    }
    Message localMessage = Message.obtain();
    localMessage.what = 0;
    localMessage.obj = parama;
    sMp.sendMessageDelayed(localMessage, 100L);
  }
  
  public static String cjM()
  {
    if (sMl == null) {
      throw new IllegalStateException("data directory should not be null, give one.");
    }
    File localFile = new File(sMl);
    if ((!localFile.exists()) && (!localFile.mkdirs())) {
      h.b("WxSplash.DexOpt", "data directory create failed.", new Object[0]);
    }
    return sMl;
  }
  
  private static boolean cjN()
  {
    if (sMn == null) {
      throw new IllegalStateException("tmp file field should not be null");
    }
    return sMn.exists();
  }
  
  private static boolean cjO()
  {
    String str = cjM();
    return new File(str + "/DexOpt_Failed").exists();
  }
  
  public static void e(Application paramApplication)
  {
    sMl = new File(paramApplication.getFilesDir(), "dexopt_service").getAbsolutePath();
  }
  
  public static boolean fZ(Context paramContext)
  {
    boolean bool = h.sMA.aZ(paramContext);
    h.b("WxSplash.DexOpt", "if need dexopt %s", new Object[] { Boolean.valueOf(bool) });
    return bool;
  }
  
  public static void ga(Context paramContext)
  {
    if (f.lY) {}
    for (;;)
    {
      return;
      h.ckd().f(675L, 22L, 1L);
      try
      {
        bool = h.sMA.aY(paramContext);
        h.b("WxSplash.DexOpt", "install multidex result %s", new Object[] { Boolean.valueOf(bool) });
        if (bool) {
          continue;
        }
        h.b("WxSplash.DexOpt", "install multidex failed, kill self.", new Object[0]);
        h.cjX();
        return;
      }
      catch (Throwable paramContext)
      {
        for (;;)
        {
          h.a(paramContext, "multidex install failed");
          boolean bool = false;
        }
      }
    }
  }
  
  public static void gb(Context paramContext)
  {
    h.b("WxSplash.DexOpt", "start dex opt service", new Object[0]);
    String str = bi.an(paramContext, Process.myPid());
    str.replace(':', '_');
    sMm = "DexOpt_Request_" + str;
    h.ckd().f(675L, 14L, 1L);
    try
    {
      XA(sMm);
      paramContext.startService(new Intent(paramContext, DexOptService.class));
      return;
    }
    catch (Exception localException)
    {
      if (Build.VERSION.SDK_INT > 19) {
        break label196;
      }
    }
    if (localException.getClass().getCanonicalName().equals("libcore.io.ErrnoException")) {}
    for (;;)
    {
      Object localObject;
      try
      {
        localObject = localException.getClass().getField("errno");
        ((Field)localObject).setAccessible(true);
        if (((Integer)((Field)localObject).get(localException)).intValue() == OsConstants.ENOSPC)
        {
          localObject = new File(cjM());
          if (((File)localObject).exists()) {
            break label205;
          }
          i = 1;
          if (i == 0) {
            break label242;
          }
          h.sMA.ba(paramContext);
        }
      }
      catch (Exception paramContext)
      {
        h.b("WxSplash.DexOpt", "%s, %s", new Object[] { paramContext.getMessage() });
      }
      for (;;)
      {
        label196:
        throw new RuntimeException(localException);
        label205:
        i = ((File)localObject).listFiles().length;
        h.b("WxSplash.DexOpt", "check dexopt directory size %s.", new Object[] { Integer.valueOf(i) });
        if (i >= 10000) {
          break label280;
        }
        i = 1;
        break;
        label242:
        h.b("WxSplash.DexOpt", "check dexopt directory size not ok, clean it and throw exception.", new Object[0]);
        paramContext = new File(cjM());
        if (paramContext.exists()) {
          e.l(paramContext);
        }
      }
      label280:
      int i = 0;
    }
  }
  
  private static boolean gc(Context paramContext)
  {
    paramContext = (ActivityManager)paramContext.getSystemService("activity");
    if (paramContext != null)
    {
      paramContext = paramContext.getRunningServices(Integer.MAX_VALUE);
      if (paramContext == null)
      {
        h.b("WxSplash.DexOpt", "dexopt service may dead, get running services return null.", new Object[0]);
        return false;
      }
      paramContext = paramContext.iterator();
      while (paramContext.hasNext()) {
        if ("com.tencent.mm.splash.DexOptService".equals(((ActivityManager.RunningServiceInfo)paramContext.next()).service.getClassName())) {
          return true;
        }
      }
    }
    h.b("WxSplash.DexOpt", "dexopt service may dead", new Object[0]);
    return false;
  }
  
  public static boolean gd(Context paramContext)
  {
    long l1 = 0L;
    long l3 = System.currentTimeMillis();
    h.b("WxSplash.DexOpt", "block checking dex opt result.", new Object[0]);
    while (cjN())
    {
      long l2 = l1 + 1L;
      Thread.sleep(100L);
      l1 = l2;
      if (l2 >= 5L)
      {
        l1 = 0L;
        if (System.currentTimeMillis() - l3 > 180000L)
        {
          h.b("WxSplash.DexOpt", "block checking dex opt timeout.", new Object[0]);
          if (!fZ(paramContext))
          {
            h.ckd().f(675L, 25L, 1L);
            h.ckd().f(675L, 15L, 1L);
            return true;
          }
          if (!gc(paramContext)) {
            h.ckd().f(675L, 18L, 1L);
          }
          h.ckd().f(675L, 17L, 1L);
          return false;
        }
      }
    }
    if (!cjO())
    {
      h.ckd().f(675L, 15L, 1L);
      return true;
    }
    if (!fZ(paramContext))
    {
      h.ckd().f(675L, 26L, 1L);
      h.ckd().f(675L, 15L, 1L);
      return true;
    }
    h.ckd().f(675L, 16L, 1L);
    return false;
  }
  
  public static abstract interface a
  {
    public abstract void bxm();
    
    public abstract void cjQ();
    
    public abstract void cjR();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/splash/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */