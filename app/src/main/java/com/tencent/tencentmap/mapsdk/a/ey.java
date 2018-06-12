package com.tencent.tencentmap.mapsdk.a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class ey
{
  private static String d = "bott";
  public ep a;
  public String b;
  public List c = new ArrayList();
  
  public ey(fb paramfb)
  {
    if ((paramfb.j() == 0) || (!paramfb.r()))
    {
      this.c.add(a(paramfb));
      return;
    }
    if (!fw.c)
    {
      Object localObject = ed.a();
      if (localObject != null)
      {
        localObject = ((du)localObject).a(paramfb.c());
        if (localObject != null)
        {
          this.a = ((eq.a)localObject).f();
          List localList = ((eq.a)localObject).c();
          this.b = ((eq.a)localObject).e();
          localObject = localList;
          if (localList != null)
          {
            localObject = localList;
            if (localList.size() > paramfb.j()) {
              localObject = localList.subList(0, paramfb.j());
            }
          }
          boolean bool = a((List)localObject, this.a);
          if ((this.b != null) && (!this.b.contains(d)))
          {
            this.c.addAll((Collection)localObject);
            if ((this.a != null) && (!bool)) {
              this.c.add(this.a);
            }
            this.c.add(a(paramfb));
            return;
          }
          if ((this.a != null) && (!bool)) {
            this.c.add(this.a);
          }
          this.c.add(a(paramfb));
          this.c.addAll((Collection)localObject);
          return;
        }
        this.c.add(a(paramfb));
        return;
      }
      this.c.add(a(paramfb));
      return;
    }
    this.c.add(a(paramfb));
  }
  
  private static ep a(fb paramfb)
  {
    if (paramfb.d() != null) {
      return new ep(paramfb.c(), paramfb.d()[0]);
    }
    return new ep(paramfb.c(), -1);
  }
  
  private static boolean a(List paramList, ep paramep)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      if (((ep)paramList.next()).a(paramep)) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */