package com.tencent.tencentmap.mapsdk.a;

import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public final class ft
  implements fs
{
  private int a = 1;
  private int b = 1;
  private int c = 20000;
  private int d = 3;
  private ArrayList e = null;
  private int f = 0;
  private boolean g = false;
  private ArrayList h = null;
  private int i = 0;
  private boolean j = false;
  private String k = "dispatcher.3g.qq.com";
  private Socket l;
  private int m;
  private String n;
  private int o;
  private int p;
  private int q;
  private ep r;
  
  public ft()
  {
    int[] arrayOfInt = dy.a;
    this.l = null;
    this.m = 0;
    this.o = 0;
    this.p = -1;
    this.q = -1;
  }
  
  private static ArrayList a(ArrayList paramArrayList, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if ((paramArrayList == null) || (paramArrayList.size() <= 0) || (paramInt1 >= paramArrayList.size())) {}
    do
    {
      return paramArrayList;
      paramInt2 = Math.min(paramInt2, paramArrayList.size() - paramInt1);
    } while (paramInt2 <= 0);
    ArrayList localArrayList = new ArrayList(paramInt2);
    paramArrayList = paramArrayList.subList(paramInt1, paramInt1 + paramInt2);
    paramInt1 = 0;
    while (paramInt1 < paramInt2)
    {
      ep localep = (ep)paramArrayList.get(paramInt1);
      localArrayList.add(new ep(localep.a(), localep.b()));
      paramInt1 += 1;
    }
    return localArrayList;
  }
  
  public final void a()
  {
    boolean bool;
    if ((this.e == null) || (this.e.size() <= 0))
    {
      bool = true;
      this.g = bool;
      if (this.h != null) {
        break label188;
      }
      bool = true;
      label33:
      this.j = bool;
      fx.a("SocketConnectorImpl", "doConnect...");
    }
    for (;;)
    {
      Object localObject;
      if (((!this.g) || (!this.j)) && (this.o <= this.d))
      {
        this.o += 1;
        if (!fw.f()) {
          break label193;
        }
        localObject = fr.a(this.k, this.c);
        if (localObject != null)
        {
          this.l = ((fq)localObject).c();
          this.n = ((fq)localObject).d();
        }
      }
      for (;;)
      {
        if ((this.l != null) && (this.l.isConnected()) && (!this.l.isClosed()))
        {
          this.r = new ep(this.l.getInetAddress().getHostAddress(), this.l.getPort());
          this.m = 0;
          return;
          bool = false;
          break;
          label188:
          bool = false;
          break label33;
          label193:
          if (!this.g)
          {
            long l1 = System.currentTimeMillis();
            localObject = a(this.e, this.f, this.a, true);
            if ((localObject != null) && (((ArrayList)localObject).size() > 0))
            {
              this.f += ((ArrayList)localObject).size();
              if (this.f < this.e.size()) {}
            }
            else
            {
              this.g = true;
            }
            localObject = fr.a((ArrayList)localObject, this.c);
            if (localObject != null)
            {
              this.l = ((fq)localObject).c();
              this.n = ((fq)localObject).d();
            }
            this.p = 0;
            this.q = ((int)(System.currentTimeMillis() - l1));
            fx.a("SocketConnectorImpl", "use IpList, dnsTime: 0 ,connectTime：" + this.q);
          }
          else
          {
            ArrayList localArrayList = new ArrayList();
            localObject = localArrayList;
            if (!this.j)
            {
              localObject = localArrayList;
              if (this.h != null)
              {
                localObject = localArrayList;
                if (this.h.size() > 0)
                {
                  localObject = localArrayList;
                  if (this.i < this.h.size())
                  {
                    localArrayList = a(this.h, this.i, this.b, true);
                    if ((localArrayList == null) || (localArrayList.size() <= 0)) {
                      break label570;
                    }
                    this.i += localArrayList.size();
                    localObject = localArrayList;
                    if (this.i < this.h.size()) {
                      break label479;
                    }
                    localObject = localArrayList;
                  }
                }
              }
              this.j = true;
            }
            for (;;)
            {
              label479:
              localObject = fr.a((ArrayList)localObject, this.k, this.c);
              if (localObject != null)
              {
                this.l = ((fq)localObject).c();
                this.n = ((fq)localObject).d();
              }
              this.p = fr.a;
              this.q = fr.b;
              fx.a("SocketConnectorImpl", "use IpList DNS parallel , dnsTime:" + this.p + ",connectTime：" + this.q);
              break;
              label570:
              this.j = true;
              localObject = localArrayList;
            }
          }
        }
      }
      if (fw.e()) {
        this.m = -3;
      }
      try
      {
        Thread.sleep(3000L);
        for (;;)
        {
          this.l = null;
          break;
          this.m = -4;
          this.n = "netWork  Fail when Connect";
          try
          {
            Thread.sleep(5000L);
          }
          catch (Exception localException1) {}
        }
      }
      catch (Exception localException2)
      {
        for (;;) {}
      }
    }
  }
  
  public final void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  public final void a(String paramString)
  {
    this.k = paramString;
  }
  
  public final void a(ArrayList paramArrayList)
  {
    this.e = paramArrayList;
  }
  
  public final void a(ArrayList paramArrayList, boolean paramBoolean)
  {
    this.h = paramArrayList;
  }
  
  public final void a(int[] paramArrayOfInt)
  {
    paramArrayOfInt.clone();
  }
  
  public final int b()
  {
    return this.m;
  }
  
  public final void b(int paramInt)
  {
    if ((paramInt > 0) && (paramInt < 4))
    {
      this.a = paramInt;
      this.b = paramInt;
    }
  }
  
  public final Socket c()
  {
    return this.l;
  }
  
  public final String d()
  {
    return this.n;
  }
  
  public final int e()
  {
    return this.p;
  }
  
  public final int f()
  {
    return this.q;
  }
  
  public final ep g()
  {
    return this.r;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ft.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */