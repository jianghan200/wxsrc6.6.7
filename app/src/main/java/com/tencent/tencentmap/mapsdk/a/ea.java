package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArraySet;

public final class ea
  implements du, ej, Runnable
{
  private Set a = null;
  private BlockingQueue b = null;
  private en c;
  
  public ea(String paramString1, String paramString2, String paramString3)
  {
    fx.a("AccessSchedulerImpl", "new AccessSchedulerImpl...");
    this.a = new CopyOnWriteArraySet();
    this.a.add("dispatcher.3g.qq.com");
    this.b = new ArrayBlockingQueue(10);
    this.c = eo.a();
    try
    {
      if (c()) {
        a(true);
      }
      for (;;)
      {
        ef.a().a(this);
        return;
        a(false);
      }
    }
    catch (Exception paramString1)
    {
      for (;;) {}
    }
  }
  
  private static boolean c()
  {
    boolean bool2 = false;
    try
    {
      SharedPreferences localSharedPreferences = em.a().getSharedPreferences("Access_Preferences", 0);
      boolean bool1 = bool2;
      if (localSharedPreferences != null)
      {
        long l = localSharedPreferences.getLong("lastScheduleTime", 0L);
        bool1 = bool2;
        if (System.currentTimeMillis() - l > 86400000L)
        {
          localSharedPreferences.edit().putLong("lastScheduleTime", System.currentTimeMillis()).commit();
          fx.a("AccessSchedulerImpl", "force Schedule when init");
          bool1 = true;
        }
      }
      return bool1;
    }
    catch (Exception localException) {}
    return false;
  }
  
  public final eq.a a(String paramString)
  {
    if (this.a.contains(paramString))
    {
      eq.a locala = er.a().a(paramString);
      if (locala != null)
      {
        paramString = locala;
        if (!locala.g()) {
          return paramString;
        }
        fx.c("AccessSchedulerImpl", "iplist was expired");
        a(true);
      }
    }
    paramString = null;
    return paramString;
  }
  
  public final fm a()
  {
    return dx.a().b.f;
  }
  
  public final void a(List paramList)
  {
    if (paramList == null) {}
    for (;;)
    {
      return;
      try
      {
        paramList = paramList.iterator();
        while (paramList.hasNext())
        {
          String str = (String)paramList.next();
          this.a.add(str);
        }
        return;
      }
      catch (Exception paramList) {}
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    try
    {
      fx.a("AccessSchedulerImpl", "before add, queue size:" + this.b.size());
      paramBoolean = this.b.add(new ee(paramBoolean));
      fx.a("AccessSchedulerImpl", "addTask ret:" + paramBoolean);
      fx.a("AccessSchedulerImpl", "after add, queue size:" + this.b.size());
      return;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        fx.a("AccessSchedulerImpl", "addTask exception...", localThrowable);
      }
    }
  }
  
  public final void b()
  {
    fx.b("AccessSchedulerImpl", "onAccessSchedulerTriggered... try to addTask");
    a(false);
  }
  
  public final void run()
  {
    fx.b("AccessSchedulerImpl", "AccessSchedulerImpl run start...");
    for (;;)
    {
      try
      {
        er.a();
        fx.a("AccessSchedulerImpl", "try take a task...");
        Object localObject1 = (ee)this.b.take();
        fx.a("AccessSchedulerImpl", "task taked, try scheduler...");
        boolean bool1 = ((ee)localObject1).a();
        try
        {
          fx.b("AccessSchedulerImpl", "scheduler...begin, isForce:" + bool1);
          localObject1 = fw.a();
          if ((TextUtils.isEmpty((CharSequence)localObject1)) || (((String)localObject1).equals("unknown")))
          {
            fx.c("AccessSchedulerImpl", "can not get current apn, do not scheduler");
            continue;
          }
          if (!ed.a)
          {
            fx.b("AccessSchedulerImpl", "schedulerOn is off. return");
            continue;
          }
          if (!bool1)
          {
            bool1 = er.a().a(this.a);
            boolean bool2 = c();
            if (bool1) {
              break label559;
            }
            if (!bool2) {
              break label564;
            }
            break label559;
            if (i == 0)
            {
              fx.b("AccessSchedulerImpl", "scheduler...no need scheduler. return");
              continue;
            }
          }
          localObject1 = new eb();
          ((eb)localObject1).b(em.b());
          ((eb)localObject1).c(em.c());
          ((eb)localObject1).a(em.d());
          ((eb)localObject1).a(em.f());
          em.g();
          ((eb)localObject1).d(em.e());
          ((eb)localObject1).a(this.a);
          ((eb)localObject1).e(fw.a());
          ((eb)localObject1).b(fw.c());
          ((eb)localObject1).c(fw.d());
          Object localObject2 = ((eb)localObject1).j();
          if (localObject2 != null)
          {
            er.a().a(((ec)localObject2).a());
            dx localdx = dx.a();
            dz localdz = ((ec)localObject2).b();
            if (localdz != null)
            {
              fx.b("AccessSchedulerConfiguration", "updateSdkCfInfo...SdkCfgInfo:" + localdz);
              if ((localdz.a < 2000) || (localdz.a > 60000))
              {
                fx.c("AccessSchedulerConfiguration", "updateSdkCfInfo...connectTimeout:" + localdz.a + " is checked to 20s");
                localdz.a = 20000;
              }
              if ((localdz.b < 2000) || (localdz.b > 60000))
              {
                fx.c("AccessSchedulerConfiguration", "updateSdkCfInfo...readTimeout:" + localdz.b + " is checked to 20s");
                localdz.b = 20000;
              }
              localdx.b = localdz;
              localdx.b.b();
            }
            localdx = dx.a();
            localObject2 = ((ec)localObject2).c();
            if (localObject2 != null)
            {
              localdx.a = ((dy)localObject2);
              localdx.a.b();
            }
          }
          fx.b("AccessSchedulerImpl", "scheduler...end. apn:" + ((eb)localObject1).g() + ", retCode:" + ((eb)localObject1).m() + ",failInfo:" + ((eb)localObject1).n());
          this.c.a((eb)localObject1);
        }
        catch (Exception localException) {}
        continue;
        i = 1;
      }
      catch (Throwable localThrowable)
      {
        return;
      }
      label559:
      continue;
      label564:
      int i = 0;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */