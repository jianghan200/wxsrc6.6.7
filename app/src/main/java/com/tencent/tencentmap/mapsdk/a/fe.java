package com.tencent.tencentmap.mapsdk.a;

import java.net.InetAddress;
import java.util.Map;

public final class fe
  implements Runnable
{
  private fd a;
  
  public fe(fd paramfd)
  {
    this.a = paramfd;
  }
  
  public final void run()
  {
    for (;;)
    {
      try
      {
        if ((this.a != null) && (!this.a.x))
        {
          localObject1 = InetAddress.getByName(this.a.c);
          this.a.v = ((InetAddress)localObject1).getHostAddress();
          this.a.a = new ep(this.a.v, 80);
        }
        if ((this.a.k < -9) && (!ee.a("info.3g.qq.com", 80, 5000))) {
          this.a.k = -17;
        }
        if (this.a.k == 0)
        {
          localObject1 = this.a;
          if ((((fd)localObject1).a == null) || (!((fd)localObject1).a.a(((fd)localObject1).b))) {
            break label753;
          }
          i = 1;
          if (i == 0)
          {
            localObject1 = this.a;
            if (localObject1 != null) {
              er.a().a(((fd)localObject1).c, ((fd)localObject1).a);
            }
          }
        }
      }
      catch (Exception localException2)
      {
        Object localObject1;
        fd localfd;
        fm localfm;
        Object localObject2;
        continue;
      }
      try
      {
        if (!this.a.B) {
          break label752;
        }
        localfd = this.a;
        localObject1 = ed.a();
        if (localObject1 == null) {
          break label758;
        }
        localfm = ((du)localObject1).a();
        if ((localfm == null) || (localfm.a == null)) {
          break label758;
        }
        localObject2 = (Byte)localfm.a.get(Integer.valueOf(localfd.k));
        localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = Byte.valueOf((byte)localfm.b);
        }
        if (localfd != null) {
          localfd.t = ((Byte)localObject1).byteValue();
        }
        if (Math.random() * 100.0D <= ((Byte)localObject1).floatValue()) {
          break label758;
        }
        i = 0;
        if (i == 0) {
          break label752;
        }
        localObject1 = this.a;
        localObject2 = new fn();
        ((fn)localObject2).a = em.b();
        ((fn)localObject2).b = em.c();
        ((fn)localObject2).c = em.d();
        ((fn)localObject2).d = em.f();
        ((fn)localObject2).e = em.e();
        ((fn)localObject2).h = fw.c();
        if (((fn)localObject2).h == 1)
        {
          ((fn)localObject2).g = fw.a();
          ((fn)localObject2).i = fw.d();
          if (fw.e())
          {
            i = 1;
            ((fn)localObject2).m = i;
            if (localObject1 != null)
            {
              ((fn)localObject2).j = ((fd)localObject1).c;
              ((fn)localObject2).k = ((fd)localObject1).a;
              ((fn)localObject2).n = ((fd)localObject1).k;
              ((fn)localObject2).o = ((fd)localObject1).r;
              ((fn)localObject2).p = ((fd)localObject1).q;
              ((fn)localObject2).q = ((fd)localObject1).g;
              ((fn)localObject2).r = ((fd)localObject1).h;
              ((fn)localObject2).s = ((fd)localObject1).i;
              ((fn)localObject2).t = ((fd)localObject1).j;
              ((fn)localObject2).w = ((fd)localObject1).l;
              ((fn)localObject2).x = ((fd)localObject1).m;
              ((fn)localObject2).u = ((fd)localObject1).n;
              ((fn)localObject2).z = ((fd)localObject1).p;
              ((fn)localObject2).A = ((fd)localObject1).d;
              ((fn)localObject2).v = ((fd)localObject1).o;
              ((fn)localObject2).G = ((fd)localObject1).f;
              ((fn)localObject2).x = ((fd)localObject1).m;
              ((fn)localObject2).J = ((fd)localObject1).w;
              ((fn)localObject2).I = ((fd)localObject1).v;
              ((fn)localObject2).K = ((fd)localObject1).C;
              ((fn)localObject2).E = ((fd)localObject1).t;
              ((fn)localObject2).y = ((fd)localObject1).s;
              if (!((fd)localObject1).x) {
                continue;
              }
              i = 0;
              ((fn)localObject2).B = i;
              if (!((fd)localObject1).z) {
                continue;
              }
              i = 0;
              ((fn)localObject2).C = i;
              if (!ed.a) {
                continue;
              }
              i = 1;
              ((fn)localObject2).D = i;
              if (!((fd)localObject1).D) {
                continue;
              }
              i = 1;
              ((fn)localObject2).L = i;
              if (!((fd)localObject1).A) {
                continue;
              }
              i = 1;
              ((fn)localObject2).M = i;
              ((fn)localObject2).F = ((fd)localObject1).y;
              ((fn)localObject2).l = ((fd)localObject1).b;
              ((fn)localObject2).H = ((fd)localObject1).u;
            }
            if (eo.a() != null)
            {
              eo.a();
              eo.a((fn)localObject2);
            }
            fx.b("ReportTask", "finish report");
          }
        }
        else
        {
          ((fn)localObject2).f = fw.a();
          continue;
        }
        i = 0;
      }
      catch (Exception localException1)
      {
        return;
      }
      continue;
      int i = 1;
      continue;
      i = 1;
      continue;
      i = 0;
      continue;
      i = 0;
      continue;
      i = 0;
      continue;
      label752:
      return;
      label753:
      i = 0;
      continue;
      label758:
      i = 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/fe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */