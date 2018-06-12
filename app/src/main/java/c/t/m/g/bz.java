package c.t.m.g;

import android.os.Handler;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class bz
  implements ax, bd
{
  private static bz c = new bz();
  public Map<String, ay> a = new ConcurrentHashMap();
  public bw b;
  private Runnable d = new cb(this);
  private Runnable e = new cc(this);
  
  private bz()
  {
    Object localObject = new bc();
    this.a.put(((ay)localObject).a(), localObject);
    localObject = new bb();
    this.a.put(((ay)localObject).a(), localObject);
    localObject = new az();
    this.a.put(((ay)localObject).a(), localObject);
    localObject = this.d;
    if ((!m.f()) && (m.e))
    {
      ac.a().a((Runnable)localObject);
      ac.a().a((Runnable)localObject, true, 30000L);
    }
    localObject = this.e;
    if ((!m.f()) && (m.e))
    {
      ac.a().a((Runnable)localObject);
      ac.a().a((Runnable)localObject, true, 30000L);
    }
  }
  
  public static bz c()
  {
    return c;
  }
  
  public final void a()
  {
    this.b.a();
  }
  
  public final void a(int paramInt)
  {
    m.i().post(new ca(this, paramInt));
  }
  
  public final void a(String paramString1, String paramString2)
  {
    Object localObject = this.d;
    long l = w.a("app_ipc_timertask_gap", 0, 3600000, 60000);
    if ((!m.f()) && (m.e))
    {
      ac.a().a((Runnable)localObject);
      ac.a().a((Runnable)localObject, true, l);
    }
    localObject = this.a.values().iterator();
    while (((Iterator)localObject).hasNext()) {
      ((ay)((Iterator)localObject).next()).a(paramString1, paramString2);
    }
  }
  
  public final void a(String paramString1, byte[] paramArrayOfByte, String paramString2)
  {
    Object localObject = this.e;
    long l = w.a("app_ipc_timertask_gap", 0, 3600000, 60000);
    if ((!m.f()) && (m.e))
    {
      ac.a().a((Runnable)localObject);
      ac.a().a((Runnable)localObject, true, l);
    }
    localObject = this.a.values().iterator();
    while (((Iterator)localObject).hasNext()) {
      ((ay)((Iterator)localObject).next()).a(paramString1, paramArrayOfByte, paramString2);
    }
  }
  
  public final void a_()
  {
    Iterator localIterator = this.a.values().iterator();
    while (localIterator.hasNext()) {
      ((ay)localIterator.next()).a_();
    }
  }
  
  public final void b()
  {
    this.b.b();
  }
  
  public final s d()
  {
    return (s)this.a.get("accessscheduler");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/c/t/m/g/bz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */