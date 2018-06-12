package c.t.m.g;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class af
{
  private static w i = new w("direct_ip_black_list");
  URL a;
  int b;
  public String c;
  private boolean d;
  private boolean e;
  private int f;
  private String g;
  private s h;
  
  public af(URL paramURL, String paramString, s params)
  {
    if (w.a("direct_access_use_schedule", 0, 1, 1) == 1) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      this.d = bool1;
      bool1 = bool2;
      if (w.a("direct_https_use_sche", 0, 1, 1) == 1) {
        bool1 = true;
      }
      this.e = bool1;
      this.f = w.a("direct_access_domain_try_times", 1, 8, 2);
      this.c = "";
      this.a = paramURL;
      this.g = paramString;
      this.h = params;
      return;
    }
  }
  
  private List<n> a()
  {
    int k = 0;
    int j = 0;
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = null;
    if (this.h != null) {
      localObject1 = this.h.a(this.a.getHost());
    }
    if (localObject1 != null)
    {
      localObject2 = ((r)localObject1).c;
      this.c = ((r)localObject1).b;
      this.b = ((r)localObject1).d;
      if ((localObject2 != null) && (((List)localObject2).size() > 0)) {
        localArrayList.addAll((Collection)localObject2);
      }
    }
    Object localObject2 = new n(this.g, -1);
    localObject1 = new ArrayList();
    if (localArrayList.size() == 0)
    {
      while (j < this.f)
      {
        ((List)localObject1).add(localObject2);
        j += 1;
      }
      ((n)localObject2).c = 5;
      return (List<n>)localObject1;
    }
    if ((this.c != null) && (this.c.contains("bott")))
    {
      ((List)localObject1).add(localObject2);
      ((n)localObject2).c = 7;
      a(localArrayList, (List)localObject1);
    }
    while (((List)localObject1).size() <= 1)
    {
      localObject1 = new ArrayList();
      j = k;
      for (;;)
      {
        if (j < this.f)
        {
          ((List)localObject1).add(localObject2);
          j += 1;
          continue;
          a(localArrayList, (List)localObject1);
          ((List)localObject1).add(localObject2);
          ((n)localObject2).c = 6;
          break;
        }
      }
      ((n)localObject2).c = 9;
    }
    for (;;)
    {
      return (List<n>)localObject1;
    }
  }
  
  public static void a(n paramn)
  {
    i.a(paramn);
  }
  
  private static void a(List<n> paramList1, List<n> paramList2)
  {
    for (;;)
    {
      try
      {
        List localList = i.b();
        paramList1 = paramList1.iterator();
        if (paramList1.hasNext())
        {
          n localn = (n)paramList1.next();
          Iterator localIterator = localList.iterator();
          if (localIterator.hasNext())
          {
            if (!localn.a((n)localIterator.next())) {
              continue;
            }
            j = 1;
            if (j != 0) {
              continue;
            }
            paramList2.add(localn);
          }
        }
        else
        {
          return;
        }
      }
      catch (Throwable paramList1)
      {
        return;
      }
      int j = 0;
    }
  }
  
  public static void b(n paramn)
  {
    i.b(paramn);
  }
  
  public final List<n> a(boolean paramBoolean1, boolean paramBoolean2)
  {
    int k = 0;
    n localn = new n(this.g, -1);
    for (;;)
    {
      try
      {
        Object localObject = new ArrayList();
        if (!paramBoolean1)
        {
          ((List)localObject).add(localn);
          localn.c = 1;
          return (List<n>)localObject;
        }
        if ((!p.i()) && (this.d)) {
          if ((paramBoolean2) && (!this.e))
          {
            break label188;
            if (j < this.f)
            {
              ((List)localObject).add(localn);
              j += 1;
              continue;
            }
            if (p.i())
            {
              j = 2;
              localn.c = j;
              return (List<n>)localObject;
            }
            if (this.d) {
              break label193;
            }
            j = 3;
            continue;
          }
          else
          {
            localObject = a();
            return (List<n>)localObject;
          }
        }
      }
      catch (Exception localException)
      {
        ArrayList localArrayList = new ArrayList();
        j = k;
        if (j < this.f)
        {
          localArrayList.add(localn);
          j += 1;
          continue;
        }
        localn.c = 8;
        return localArrayList;
      }
      label188:
      int j = 0;
      continue;
      label193:
      j = 4;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/c/t/m/g/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */