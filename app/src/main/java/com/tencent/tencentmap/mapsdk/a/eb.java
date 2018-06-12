package com.tencent.tencentmap.mapsdk.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class eb
{
  private String a;
  private String b;
  private String c;
  private int d;
  private String e;
  private String f;
  private String g;
  private ArrayList h;
  private int i;
  private int j;
  private int k;
  private String l;
  private String m;
  private ep n;
  private boolean o;
  private int p;
  private int q;
  private int r;
  private int s;
  private int t;
  
  public String a()
  {
    return this.a;
  }
  
  public void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public void a(Set paramSet)
  {
    this.h = new ArrayList();
    this.h.addAll(paramSet);
  }
  
  public String b()
  {
    return this.b;
  }
  
  public void b(int paramInt)
  {
    this.i = paramInt;
  }
  
  public void b(String paramString)
  {
    this.b = paramString;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public void c(int paramInt)
  {
    this.j = paramInt;
  }
  
  public void c(String paramString)
  {
    this.c = paramString;
  }
  
  public int d()
  {
    return this.d;
  }
  
  public void d(String paramString)
  {
    this.e = paramString;
  }
  
  public String e()
  {
    return this.e;
  }
  
  public void e(String paramString)
  {
    this.g = paramString;
  }
  
  public ArrayList f()
  {
    return this.h;
  }
  
  public String g()
  {
    return this.g;
  }
  
  public int h()
  {
    return this.i;
  }
  
  public int i()
  {
    return this.j;
  }
  
  public ec j()
  {
    long l1 = System.currentTimeMillis();
    Object localObject1 = new gd();
    fw.b();
    if (!fw.e())
    {
      this.k = -4;
      this.l = "Network fail before schedule";
      return null;
    }
    this.f = fz.b(this.h.toString());
    Object localObject2 = new HashMap();
    ((Map)localObject2).put("imei", fz.c());
    ((Map)localObject2).put("reqKey", this.f);
    localObject2 = new fh(this.a, this.b, this.h, this.e, this.c, this.d, this.i, this.j, this.g, (Map)localObject2);
    ((gd)localObject1).b("#halley-proxy.HalleyDispatchService");
    ((gd)localObject1).a("srvDispatch");
    ((gd)localObject1).a("request", localObject2);
    localObject1 = ee.a((gd)localObject1);
    ((fp)localObject1).a(22);
    this.o = fw.e();
    this.n = ((fp)localObject1).d();
    this.p = ((fp)localObject1).g();
    this.q = ((fp)localObject1).e();
    this.r = ((fp)localObject1).h();
    this.s = ((fp)localObject1).f();
    if ((((fp)localObject1).b() == 0) && (((fp)localObject1).a() != null))
    {
      localObject1 = ((fp)localObject1).a();
      localObject2 = new fi();
      try
      {
        localObject1 = (fi)((gd)localObject1).b("response", localObject2);
        if (localObject1 == null)
        {
          this.k = -8;
          this.l = "Response is Null";
          return null;
        }
      }
      catch (Exception localException)
      {
        fx.a("ScheduleRequestImpl", "wup decode fail.", localException);
        this.k = -8;
        this.m = localException.getClass().getSimpleName();
        this.l = fz.a(localException);
        return null;
      }
      localObject2 = new ec();
      Object localObject3 = fw.a();
      long l2 = System.currentTimeMillis();
      if ((!((String)localObject3).equals("unkonwn")) && (((String)localObject3).equals(this.g)))
      {
        localObject3 = localException.a;
        if ((localObject3 != null) && (((Map)localObject3).size() > 0))
        {
          eq localeq = new eq(this.g);
          Iterator localIterator = ((Map)localObject3).keySet().iterator();
          while (localIterator.hasNext())
          {
            Object localObject4 = (String)localIterator.next();
            if (((Map)localObject3).get(localObject4) != null)
            {
              Object localObject5 = ((fj)((Map)localObject3).get(localObject4)).a;
              localObject4 = new eq.a((String)localObject4, l2, ((fj)localException.a.get(localObject4)).b);
              localObject5 = ((ArrayList)localObject5).iterator();
              while (((Iterator)localObject5).hasNext())
              {
                String str = (String)((Iterator)localObject5).next();
                ep localep = new ep();
                if (localep.a(str)) {
                  ((eq.a)localObject4).a(localep);
                }
              }
              localeq.a((eq.a)localObject4);
            }
          }
          ((ec)localObject2).a(localeq);
        }
      }
      for (;;)
      {
        if (localException.c != null) {
          ((ec)localObject2).a(new dz(localException.c));
        }
        if (localException.b != null) {
          ((ec)localObject2).a(new dy(localException.b));
        }
        this.t = ((int)(System.currentTimeMillis() - l1));
        return (ec)localObject2;
        ((ec)localObject2).a(null);
        this.k = -9;
        this.l = ("req apn:" + this.g + ",current apn:" + (String)localObject3);
      }
    }
    this.k = localException.b();
    this.m = localException.c();
    return null;
  }
  
  public ep k()
  {
    return this.n;
  }
  
  public boolean l()
  {
    return this.o;
  }
  
  public int m()
  {
    return this.k;
  }
  
  public String n()
  {
    return this.l;
  }
  
  public String o()
  {
    return this.m;
  }
  
  public int p()
  {
    return this.p;
  }
  
  public int q()
  {
    return this.q;
  }
  
  public int r()
  {
    return this.r;
  }
  
  public int s()
  {
    return this.s;
  }
  
  public int t()
  {
    return this.t;
  }
  
  public String u()
  {
    return this.f;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/eb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */