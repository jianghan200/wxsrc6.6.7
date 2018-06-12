package com.tencent.smtt.sdk;

import android.content.Context;
import android.util.Log;
import com.tencent.smtt.export.external.DexLoader;
import com.tencent.smtt.utils.TbsLog;
import java.nio.channels.FileLock;

class bv
{
  private static bv a;
  private static FileLock e = null;
  private bw b;
  private boolean c;
  private boolean d;
  
  public static bv a()
  {
    if (a == null) {}
    try
    {
      if (a == null) {
        a = new bv();
      }
      return a;
    }
    finally {}
  }
  
  public bw a(boolean paramBoolean)
  {
    if (paramBoolean) {
      return this.b;
    }
    return c();
  }
  
  /* Error */
  public FileLock a(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 17	com/tencent/smtt/sdk/bv:e	Ljava/nio/channels/FileLock;
    //   5: ifnull +11 -> 16
    //   8: getstatic 17	com/tencent/smtt/sdk/bv:e	Ljava/nio/channels/FileLock;
    //   11: astore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_1
    //   15: areturn
    //   16: aload_1
    //   17: invokestatic 36	com/tencent/smtt/utils/j:e	(Landroid/content/Context;)Ljava/nio/channels/FileLock;
    //   20: astore_1
    //   21: aload_1
    //   22: putstatic 17	com/tencent/smtt/sdk/bv:e	Ljava/nio/channels/FileLock;
    //   25: goto -13 -> 12
    //   28: astore_1
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_1
    //   32: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	33	0	this	bv
    //   0	33	1	paramContext	Context
    // Exception table:
    //   from	to	target	type
    //   2	12	28	finally
    //   16	25	28	finally
  }
  
  public void a(Context paramContext, am paramam)
  {
    Object localObject4 = null;
    if (paramam != null) {}
    for (;;)
    {
      o localo;
      StringBuilder localStringBuilder;
      bi localbi;
      try
      {
        paramam.a("x5_core_engine_init_sync", (byte)2);
        localo = o.a(true);
        localo.a(paramContext, false, false, paramam);
        localStringBuilder = new StringBuilder();
        if (paramam != null) {
          paramam.a("init_x5_core", (byte)1);
        }
        localbi = localo.a();
        if ((localo.b()) && (localbi != null))
        {
          if (this.d) {
            break label607;
          }
          if (paramam != null) {
            paramam.a = true;
          }
          this.b = new bw(localbi.b());
          try
          {
            this.c = this.b.a();
            if (!this.c) {
              localStringBuilder.append("can not use X5 by x5corewizard return false");
            }
            localObject1 = null;
          }
          catch (NoSuchMethodException localNoSuchMethodException)
          {
            Object localObject1;
            boolean bool;
            this.c = true;
            Object localObject2 = null;
            continue;
          }
          catch (Throwable localThrowable1)
          {
            this.c = false;
            localStringBuilder.append("can not use x5 by throwable " + Log.getStackTraceString(localThrowable1));
            continue;
          }
          localObject3 = localObject1;
          if (this.c)
          {
            CookieManager.getInstance().a(paramContext, true, true);
            CookieManager.getInstance().a();
            localObject3 = localObject1;
          }
          if (this.c) {
            break label587;
          }
          TbsLog.e("X5CoreEngine", "mCanUseX5 is false --> report");
          bool = localo.b();
          if ((!bool) || (localbi == null) || (localObject3 != null)) {
            break label505;
          }
        }
      }
      finally {}
      try
      {
        localObject3 = localbi.b();
        localObject1 = localObject4;
        if (localObject3 != null) {
          localObject1 = ((DexLoader)localObject3).invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "getLoadFailureDetails", new Class[0], new Object[0]);
        }
        if ((localObject1 instanceof Throwable))
        {
          localObject3 = (Throwable)localObject1;
          localStringBuilder.append("#" + ((Throwable)localObject3).getMessage() + "; cause: " + ((Throwable)localObject3).getCause() + "; th: " + localObject3);
        }
        if ((localObject1 instanceof String)) {
          localStringBuilder.append("failure detail:" + localObject1);
        }
      }
      catch (Throwable localThrowable2)
      {
        label505:
        label587:
        continue;
      }
      if (localStringBuilder.toString().contains("isPreloadX5Disabled:-10000"))
      {
        TbsCoreLoadStat.getInstance().a(paramContext, 408, new Throwable("X5CoreEngine::init, mCanUseX5=false, available true, details: " + localStringBuilder.toString()));
        this.d = true;
        if (paramam != null) {
          paramam.a("init_x5_core", (byte)2);
        }
        return;
        this.c = false;
        localStringBuilder.append("can not use X5 by !tbs available");
      }
      else
      {
        TbsCoreLoadStat.getInstance().a(paramContext, 407, new Throwable("X5CoreEngine::init, mCanUseX5=false, available true, details: " + localStringBuilder.toString()));
        continue;
        if (localo.b())
        {
          TbsCoreLoadStat.getInstance().a(paramContext, 409, new Throwable("mCanUseX5=false, available true, reason: " + localObject3));
          continue;
        }
        TbsCoreLoadStat.getInstance().a(paramContext, 410, new Throwable("mCanUseX5=false, available false, reason: " + localObject3));
        continue;
        if (e != null) {
          continue;
        }
        a(paramContext);
        continue;
      }
      label607:
      Object localObject3 = null;
    }
  }
  
  public boolean b()
  {
    if (QbSdk.a) {
      return false;
    }
    return this.c;
  }
  
  public bw c()
  {
    if (QbSdk.a) {
      return null;
    }
    return this.b;
  }
  
  boolean d()
  {
    return this.d;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/smtt/sdk/bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */