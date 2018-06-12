package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class dg
{
  private di a;
  private Context b;
  private int c = 20000;
  private int d = 0;
  private Runnable e = new dg.1(this);
  
  public dg(Context paramContext)
  {
    this.b = paramContext;
    HashMap localHashMap = new HashMap(2);
    boolean bool = a.g(this.b);
    e.a(paramContext);
    localHashMap.put("A33", e.g(paramContext));
    if (bool)
    {
      localHashMap.put("A66", "F");
      localHashMap.put("A68", a.h(this.b));
      if (!a.b) {
        break label164;
      }
    }
    label164:
    for (paramContext = "Y";; paramContext = "N")
    {
      localHashMap.put("A85", paramContext);
      this.a = e.a(this.b, "rqd_heartbeat", true, 0L, 0L, localHashMap, false);
      return;
      localHashMap.put("A66", "B");
      break;
    }
  }
  
  private void a(int paramInt)
  {
    try
    {
      this.d = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private int c()
  {
    try
    {
      int i = this.d;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  protected final void a()
  {
    if (!e.m(this.b)) {}
    do
    {
      return;
      ds localds = dl.d().f();
      if (localds != null)
      {
        ArrayList localArrayList = new ArrayList(2);
        localArrayList.add(this.a);
        localds.a(new dk.a(this.b, localArrayList));
      }
      a(c() + 1);
    } while (c() % 10 != 0);
    b.a().a(108, this.e, 600000L, this.c);
    a(0);
  }
  
  public final void b()
  {
    String str = a.b(this.b, "HEART_DENGTA", "");
    if (e.g().equals(str))
    {
      ct.a("heartbeat has been uploaded today!", new Object[0]);
      return;
    }
    b.a().a(108, this.e, 0L, this.c);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/dg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */