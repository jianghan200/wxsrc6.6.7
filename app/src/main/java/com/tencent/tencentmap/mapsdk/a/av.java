package com.tencent.tencentmap.mapsdk.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class av
  implements Runnable
{
  public static final av a = new av();
  private static int d = 60000;
  private ConcurrentHashMap<aq, au> b = new ConcurrentHashMap(128);
  private ConcurrentHashMap<aq, Object> c = new ConcurrentHashMap(128);
  
  public static int a()
  {
    return d;
  }
  
  private int a(boolean paramBoolean, String paramString1, hn paramhn, String paramString2, ly paramly1, ly paramly2)
  {
    if (paramBoolean) {
      return paramhn.a(paramString2, paramString1, paramly1, paramly2);
    }
    return paramhn.a(paramString2, paramly1, paramly2);
  }
  
  private au a(au paramau)
  {
    au localau = new au(paramau.j);
    localau.b((ArrayList)paramau.a(), (ArrayList)paramau.b());
    return localau;
  }
  
  private au a(String paramString, ArrayList<fl> paramArrayList1, ArrayList<fl> paramArrayList2)
  {
    if (paramArrayList1.size() > 0)
    {
      au localau = new au(paramString);
      localau.a(paramArrayList1, paramArrayList2);
      ax.c(paramString + " cacheServerData get config from " + localau);
      return localau;
    }
    ax.b(paramString + " callback_findObjectById4All get config from register active size = 0");
    return null;
  }
  
  private void a(aq paramaq, hn paramhn, String paramString)
  {
    try
    {
      ax.c(paramString + " asyncRefreshConfig, " + paramaq.b.k + ", " + paramaq.b.m + " " + paramaq.b.hashCode());
      a locala = new a(paramaq, paramString);
      a(paramaq.b.k, paramaq.b.m, paramhn, locala, paramString);
      return;
    }
    catch (Exception paramaq)
    {
      ax.b(paramString + " asyncRefreshConfig error", paramaq);
    }
  }
  
  private void a(boolean paramBoolean, String paramString1, hn paramhn, a parama, String paramString2)
  {
    if (paramBoolean)
    {
      paramhn.a(parama, paramString2, paramString1);
      return;
    }
    paramhn.a(parama, paramString2);
  }
  
  private au b(aq paramaq, hn paramhn, String paramString)
  {
    for (;;)
    {
      try
      {
        ax.c(paramString + " refreshConfig, " + paramaq.b.k + ", " + paramaq.b.m);
        localObject = new ly();
        ly locally = new ly();
        i = a(paramaq.b.k, paramaq.b.m, paramhn, paramString, (ly)localObject, locally);
        if (i != 0) {
          continue;
        }
        paramhn = a(paramString, ((ly)localObject).a(), locally.a());
        i = 1;
      }
      catch (Exception paramhn)
      {
        Object localObject;
        ax.b(paramString + " findObjectByQuery error " + paramhn, paramhn);
        paramhn = null;
        int i = 0;
        continue;
      }
      localObject = paramhn;
      if (i == 0)
      {
        paramaq = paramaq.b;
        paramaq = bw.a(paramaq.c(), paramaq.d, paramaq.c, paramaq.g);
        localObject = paramhn;
        if (paramaq != null) {
          localObject = b(paramString, (ArrayList)paramaq.a, (ArrayList)paramaq.b);
        }
      }
      return (au)localObject;
      ax.b(paramString + " findObjectByQuery error , return " + i);
      paramhn = null;
      i = 0;
    }
  }
  
  private au b(String paramString, ArrayList<bb> paramArrayList1, ArrayList<bb> paramArrayList2)
  {
    if (paramArrayList1.size() > 0)
    {
      au localau = new au(paramString);
      localau.b(paramArrayList1, paramArrayList2);
      ax.c(paramString + " cacheServerData get config from " + localau);
      return localau;
    }
    ax.b(paramString + " callback_findObjectById4All get config from register active size = 0");
    return null;
  }
  
  public void a(aq paramaq)
  {
    if (!this.c.contains(paramaq)) {
      this.c.putIfAbsent(paramaq, new Object());
    }
    if ((!this.b.contains(paramaq)) && (paramaq.d == null))
    {
      au localau = new au(paramaq.b.a);
      localau.b((ArrayList)paramaq.b.h.a(), (ArrayList)paramaq.b.h.b());
      this.b.putIfAbsent(paramaq, localau);
    }
  }
  
  public void b(aq paramaq)
  {
    if (paramaq.c())
    {
      a(paramaq, paramaq.d, paramaq.b.a);
      paramaq.b();
      return;
    }
    ax.a(paramaq.b.a + " can not async refresh config for refreshing in 2s or queryPrx is null");
  }
  
  public au c(aq paramaq)
  {
    au localau1 = (au)this.b.get(paramaq);
    if (localau1 != null) {
      return a(localau1);
    }
    synchronized (this.c.get(paramaq))
    {
      localau1 = (au)this.b.get(paramaq);
      au localau2 = localau1;
      if (localau1 == null)
      {
        if (!(paramaq instanceof hn)) {
          localau1 = b(paramaq, paramaq.d, paramaq.b.a);
        }
        if (localau1 != null)
        {
          this.b.putIfAbsent(paramaq, localau1);
          localau2 = localau1;
        }
      }
      else
      {
        if (localau2 == null) {
          break label145;
        }
        return a(localau2);
      }
      ax.b(paramaq.e.j + " sync get config is null");
      localau2 = localau1;
    }
    label145:
    return new au(paramaq.e.j);
  }
  
  public void run()
  {
    long l = System.currentTimeMillis();
    Iterator localIterator = this.c.keySet().iterator();
    while (localIterator.hasNext())
    {
      aq localaq = (aq)localIterator.next();
      if (localaq.d != null) {
        a(localaq, localaq.d, localaq.b.a);
      } else {
        ax.a(localaq.b.a + " proxy.queryFPrx is null, can not refresh serviceInfo");
      }
    }
    ax.a("ServiceInfosRefresher run(), use: " + (System.currentTimeMillis() - l));
  }
  
  class a
    extends gm
  {
    private aq d;
    private String e;
    
    public a(aq paramaq, String paramString)
    {
      this.d = paramaq;
      this.e = paramString;
    }
    
    private void a()
    {
      Object localObject = this.d.b;
      localObject = bw.a(((al)localObject).c(), ((al)localObject).d, ((al)localObject).c, ((al)localObject).g);
      if (localObject != null) {
        b((ArrayList)((ai)localObject).a, (ArrayList)((ai)localObject).b);
      }
    }
    
    private void a(ArrayList<fl> paramArrayList1, ArrayList<fl> paramArrayList2)
    {
      paramArrayList1 = av.a(av.this, this.e, paramArrayList1, paramArrayList2);
      if (paramArrayList1 != null)
      {
        av.a(av.this).put(this.d, paramArrayList1);
        paramArrayList2 = av.a(av.this, paramArrayList1);
        this.d.c.a(paramArrayList2);
        this.d.b.a(paramArrayList2);
        ax.c(this.e + " async refresh serviceinfos:" + paramArrayList1);
      }
    }
    
    private void b(ArrayList<bb> paramArrayList1, ArrayList<bb> paramArrayList2)
    {
      paramArrayList1 = av.b(av.this, this.e, paramArrayList1, paramArrayList2);
      if (paramArrayList1 != null)
      {
        av.a(av.this).put(this.d, paramArrayList1);
        paramArrayList2 = av.a(av.this, paramArrayList1);
        this.d.c.a(paramArrayList2);
        this.d.b.a(paramArrayList2);
        ax.c(this.e + " async refresh serviceinfos:" + paramArrayList1);
      }
    }
    
    public void a(int paramInt)
    {
      ax.a(this.e + " callback_findObjectById_exception " + paramInt);
    }
    
    public void a(int paramInt, ArrayList<fl> paramArrayList1, ArrayList<fl> paramArrayList2)
    {
      if (paramInt == 0)
      {
        a(paramArrayList1, paramArrayList2);
        bw.a(this.e, this.d.b.b());
        ax.c(this.e + " callback_findObjectById4All finish");
        return;
      }
      a();
      ax.b(this.e + "async findObjectById4All error , return " + paramInt);
    }
    
    public void a(ArrayList<fl> paramArrayList)
    {
      ax.a(this.e + "callback_findObjectById is not used");
    }
    
    public void b(int paramInt)
    {
      ax.a(this.e + " callback_findObjectById4All_exception " + paramInt);
    }
    
    public void b(int paramInt, ArrayList<fl> paramArrayList1, ArrayList<fl> paramArrayList2)
    {
      if (paramInt == 0)
      {
        a(paramArrayList1, paramArrayList2);
        bw.a(this.e, this.d.b.b());
        ax.c(this.e + " callback_findObjectByIdInSameGroup finish");
        return;
      }
      a();
      ax.b(this.e + "async findObjectByIdInSameGroup error , return " + paramInt);
    }
    
    public void c(int paramInt)
    {
      ax.a(this.e + " callback_findObjectByIdInSameGroup_exception " + paramInt);
    }
    
    public void c(int paramInt, ArrayList<fl> paramArrayList1, ArrayList<fl> paramArrayList2)
    {
      if (paramInt == 0)
      {
        a(paramArrayList1, paramArrayList2);
        bw.a(this.e, this.d.b.b());
        ax.c(this.e + " callback_findObjectByIdInSameStation finish");
        return;
      }
      a();
      ax.b(this.e + "async findObjectByIdInSameStation error , return " + paramInt);
    }
    
    public void d(int paramInt)
    {
      ax.a(this.e + " callback_findObjectByIdInSameStation_exception " + paramInt);
    }
    
    public void d(int paramInt, ArrayList<fl> paramArrayList1, ArrayList<fl> paramArrayList2)
    {
      if (paramInt == 0)
      {
        a(paramArrayList1, paramArrayList2);
        bw.a(this.e, this.d.b.b());
        ax.c(this.e + " callback_findObjectByIdInSameSet finish");
        return;
      }
      a();
      ax.b(this.e + " async findObjectByIdInSameSet error , return " + paramInt);
    }
    
    public void e(int paramInt)
    {
      ax.a(this.e + " callback_findObjectByIdInSameSet_exception " + paramInt);
    }
    
    public void e(int paramInt, ArrayList<fl> paramArrayList1, ArrayList<fl> paramArrayList2) {}
    
    public void f(int paramInt) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */