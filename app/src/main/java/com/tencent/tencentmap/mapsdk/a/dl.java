package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Set;

public final class dl
  extends Observable
  implements ce, cj, ck
{
  private static dl a = null;
  private df b = null;
  private dh c = null;
  private dh d = null;
  private boolean e = true;
  private boolean f = false;
  private Context g;
  private ds h;
  private boolean i;
  private int j = 0;
  private List<de> k = null;
  private Object l = new Object();
  private g m = null;
  
  private dl(Context paramContext, ds paramds, dm paramdm)
  {
    if (paramContext == null)
    {
      ct.c(" the context is null! init UserActionRecord failed!", new Object[0]);
      this.g = null;
      return;
    }
    Context localContext = paramContext.getApplicationContext();
    if (localContext != null) {}
    for (this.g = localContext;; this.g = paramContext)
    {
      if (c.m() == null) {
        c.a(this.g);
      }
      if (this.k == null) {
        this.k = Collections.synchronizedList(new ArrayList(5));
      }
      this.h = paramds;
      if (paramds != null) {
        paramds.a(paramdm);
      }
      paramdm = cf.a(this.g);
      paramdm.a(this);
      paramdm.a(this);
      paramdm.a(this);
      paramdm.a(0, paramds);
      paramdm.a(1, paramds);
      this.b = new df();
      this.c = new db(paramContext);
      this.d = new dk(paramContext);
      this.e = true;
      new d().a(this.g);
      this.m = new g();
      return;
    }
  }
  
  public static dl a(Context paramContext, ds paramds, dm paramdm)
  {
    try
    {
      if (a == null)
      {
        ct.e(" create ua instance ", new Object[0]);
        a = new dl(paramContext, paramds, paramdm);
      }
      ct.e(" return ua instance ", new Object[0]);
      paramContext = a;
      return paramContext;
    }
    finally {}
  }
  
  public static ds a(Context paramContext, boolean paramBoolean)
  {
    try
    {
      paramContext = dt.a(paramContext, paramBoolean);
      return paramContext;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  private void a(int paramInt)
  {
    try
    {
      this.j = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static boolean a(String paramString, boolean paramBoolean1, long paramLong1, long paramLong2, Map<String, String> paramMap, boolean paramBoolean2, boolean paramBoolean3)
  {
    ct.e(" onUA: %s,%b,%d,%d,%b,%b", new Object[] { paramString, Boolean.valueOf(paramBoolean1), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Boolean.valueOf(paramBoolean2), Boolean.valueOf(paramBoolean3) });
    dl localdl = d();
    if ((localdl != null) && (!localdl.m()))
    {
      localdl.k.add(new de(paramString, paramBoolean1, paramLong1, paramLong2, paramMap, paramBoolean2));
      return true;
    }
    if (!i()) {
      return false;
    }
    if (localdl.b.a(paramString))
    {
      ct.c("onUserAction return false, because eventName:[%s] is not allowed in server strategy!", new Object[] { paramString });
      return false;
    }
    dh localdh;
    if ((!paramBoolean1) || ((paramBoolean1) && (localdl.b.b(paramString)))) {
      if (paramBoolean2) {
        localdh = localdl.k();
      }
    }
    while (localdh != null)
    {
      paramString = e.a(localdl.g, paramString, paramBoolean1, paramLong1, paramLong2, paramMap, paramBoolean3);
      if (paramString == null)
      {
        ct.c("createdRecordBean bean is null, return false!", new Object[0]);
        return false;
        localdh = localdl.j();
      }
      else
      {
        return localdh.a(paramString);
        ct.c("onUserAction return false, because eventName:[%s] is sampled by svr rate!", new Object[] { paramString });
        return false;
      }
    }
    return false;
  }
  
  public static boolean a(boolean paramBoolean)
  {
    dl localdl = d();
    if (localdl == null) {
      ct.c(" ua module not ready!", new Object[0]);
    }
    while (!i()) {
      return false;
    }
    return localdl.b(paramBoolean);
  }
  
  private void c(boolean paramBoolean)
  {
    try
    {
      if (paramBoolean != e())
      {
        dh localdh = j();
        if (localdh != null) {
          localdh.a(paramBoolean);
        }
        localdh = k();
        if (localdh != null) {
          localdh.a(paramBoolean);
        }
        this.i = paramBoolean;
      }
      return;
    }
    finally {}
  }
  
  public static dl d()
  {
    try
    {
      dl localdl = a;
      return localdl;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private static boolean i()
  {
    boolean bool1 = false;
    dl localdl = d();
    if (localdl == null) {
      ct.d("isModuleAble:not init ua", new Object[0]);
    }
    do
    {
      boolean bool2;
      do
      {
        return bool1;
        bool2 = localdl.e();
        bool1 = bool2;
      } while (!bool2);
      bool1 = bool2;
    } while (!localdl.l());
    return localdl.m();
  }
  
  private dh j()
  {
    try
    {
      dh localdh = this.c;
      return localdh;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private dh k()
  {
    try
    {
      dh localdh = this.d;
      return localdh;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private boolean l()
  {
    try
    {
      boolean bool = this.e;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private boolean m()
  {
    try
    {
      boolean bool = this.f;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void n()
  {
    try
    {
      this.f = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void o()
  {
    try
    {
      if ((this.k != null) && (this.k.size() > 0))
      {
        Iterator localIterator = this.k.iterator();
        while (localIterator.hasNext())
        {
          de localde = (de)localIterator.next();
          a(localde.a, localde.b, localde.c, localde.d, localde.e, localde.f, false);
        }
        this.k.clear();
      }
    }
    finally {}
  }
  
  private void p()
  {
    try
    {
      if ((!e()) && (!this.b.f())) {
        return;
      }
      Object localObject = cf.a(this.g);
      if (localObject != null)
      {
        localObject = ((cf)localObject).e().b(1);
        if (localObject != null)
        {
          localObject = ((ch.a)localObject).b();
          if ((localObject != null) && (!"".equals(((String)localObject).trim())))
          {
            new dg(this.g).b();
            return;
          }
        }
      }
    }
    catch (Exception localException)
    {
      ct.c(" startHeart failed! " + localException.getMessage(), new Object[0]);
    }
  }
  
  private void q()
  {
    if (this.b.i()) {
      if (!"".equals(a.b(this.g, "LAUEVE_DENGTA", "")))
      {
        ct.a("AppLaunchedEvent has been uploaded!", new Object[0]);
        return;
      }
    }
    for (int n = 1;; n = 0)
    {
      if (e.a(this.g) == null)
      {
        ct.c(" DeviceInfo == null?,return", new Object[0]);
        return;
      }
      HashMap localHashMap = new HashMap();
      localHashMap.put("A33", e.g(this.g));
      localHashMap.put("A63", "Y");
      if (a.b(this.g))
      {
        localHashMap.put("A21", "Y");
        label131:
        if (!cf.a(this.g).g()) {
          break label317;
        }
        localHashMap.put("A45", "Y");
        label158:
        if (!a.g(this.g)) {
          break label334;
        }
        localHashMap.put("A66", "F");
        label182:
        localHashMap.put("A68", a.h(this.g));
        if (!a.b) {
          break label351;
        }
      }
      label317:
      label334:
      label351:
      for (String str = "Y";; str = "N")
      {
        localHashMap.put("A85", str);
        localHashMap.put("A9", e.d());
        localHashMap.put("A14", e.e());
        boolean bool = a("rqd_applaunched", true, 0L, 0L, localHashMap, true, false);
        if ((n == 0) || (!bool)) {
          break;
        }
        a.a(this.g, "LAUEVE_DENGTA", e.g());
        return;
        localHashMap.put("A21", "N");
        break label131;
        localHashMap.put("A45", "N");
        break label158;
        localHashMap.put("A66", "B");
        break label182;
      }
    }
  }
  
  public final void a()
  {
    a(h() + 1);
  }
  
  public final void a(ch paramch)
  {
    if (paramch != null)
    {
      paramch = paramch.b(1);
      if (paramch != null)
      {
        boolean bool = paramch.a();
        if (e() != bool)
        {
          ct.f("UAR onCommonStrategyChange setUsable:%b ", new Object[] { Boolean.valueOf(bool) });
          c(bool);
        }
      }
    }
  }
  
  public final void a(Map<String, String> paramMap)
  {
    if ((paramMap != null) && (paramMap.size() > 0) && (this.b != null)) {
      this.b.a(paramMap);
    }
  }
  
  public final void b()
  {
    n();
    for (;;)
    {
      try
      {
        localObject = cf.a(this.g).e();
        if (localObject != null) {
          continue;
        }
      }
      catch (Throwable localThrowable)
      {
        Object localObject;
        Set localSet;
        ct.a(localThrowable);
        ct.d(" common query end error %s", new Object[] { localThrowable.toString() });
        continue;
        int n = -1;
        continue;
        n = 0;
        continue;
        ct.b("event module is disable", new Object[0]);
        continue;
        if (n <= 0) {
          continue;
        }
        n = 1;
        continue;
      }
      o();
      if (h() < 2)
      {
        localObject = dt.a(this.g);
        if ((((dt)localObject).a()) && (((dt)localObject).b()))
        {
          p();
          q();
          if (this.b.j())
          {
            this.m.setChanged();
            this.m.notifyObservers(this.g);
          }
        }
      }
      return;
      localObject = ((ch)localObject).b(1);
      if ((localObject != null) && (this.b != null))
      {
        localSet = ((ch.a)localObject).d();
        if ((localSet != null) && (localSet.size() > 0)) {
          this.b.a(localSet);
        }
        localSet = ((ch.a)localObject).f();
        if ((localSet != null) && (localSet.size() > 0)) {
          this.b.b(localSet);
        }
      }
      if ((!e()) || (localObject == null)) {
        continue;
      }
      if (!e()) {
        continue;
      }
      n = e.j(this.g);
      continue;
      if (n != 0)
      {
        ct.e(" asyn up module %d", new Object[] { Integer.valueOf(1) });
        b.a().a(new dl.1(this));
      }
    }
  }
  
  public final boolean b(boolean paramBoolean)
  {
    for (;;)
    {
      synchronized (this.l)
      {
        if (e())
        {
          n = e.j(this.g);
          if (n > 0) {
            try
            {
              if (this.h != null)
              {
                dc localdc = new dc(this.g);
                localdc.a(paramBoolean);
                this.h.a(localdc);
              }
              return true;
            }
            catch (Throwable localThrowable)
            {
              ct.c(" up common error: %s", new Object[] { localThrowable.toString() });
              ct.a(localThrowable);
            }
          }
          return false;
        }
      }
      int n = -1;
    }
  }
  
  public final void c()
  {
    Context localContext = this.g;
    ct.a(" RecordDAO.deleteRecords() start", new Object[0]);
    ct.e(" ua first clean :%d", new Object[] { Integer.valueOf(cb.a(localContext, new int[] { 1 })) });
    ct.e(" ua remove strategy :%d", new Object[] { Integer.valueOf(e.i(this.g)) });
  }
  
  public final boolean e()
  {
    try
    {
      boolean bool = this.i;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final ds f()
  {
    return this.h;
  }
  
  public final df g()
  {
    return this.b;
  }
  
  public final int h()
  {
    try
    {
      int n = this.j;
      return n;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/dl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */