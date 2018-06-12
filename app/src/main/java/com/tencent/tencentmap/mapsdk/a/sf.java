package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Canvas;
import android.view.MotionEvent;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class sf
{
  private static int e = 0;
  private sl a;
  private CopyOnWriteArrayList<sv> b = new CopyOnWriteArrayList();
  private SortedMap<String, sr> c = new TreeMap();
  private a d = new a((byte)0);
  private int f = 0;
  
  public sf(sl paramsl)
  {
    this.a = paramsl;
  }
  
  public static String a(String paramString)
  {
    e += 1;
    return paramString + e;
  }
  
  public final so a(qu paramqu)
  {
    paramqu = new so(this.a, paramqu);
    a(paramqu);
    return paramqu;
  }
  
  public final sr a(qz paramqz)
  {
    paramqz = new sr(this.a, paramqz);
    this.c.put(paramqz.m(), paramqz);
    return paramqz;
  }
  
  public final sw a(rb paramrb)
  {
    paramrb = new sw(this.a, paramrb);
    a(paramrb);
    return paramrb;
  }
  
  public final sx a(rd paramrd)
  {
    paramrd = new ss(this.a, paramrd);
    a(paramrd);
    return paramrd;
  }
  
  public final void a()
  {
    try
    {
      Iterator localIterator = this.c.entrySet().iterator();
      while (localIterator.hasNext()) {
        ((sr)((Map.Entry)localIterator.next()).getValue()).c();
      }
      this.c.clear();
      localIterator = this.b.iterator();
      while (localIterator.hasNext()) {
        ((sv)localIterator.next()).n();
      }
      this.b.clear();
      sz.a(this.a.c(), 2);
      return;
    }
    catch (Exception localException) {}
  }
  
  public final void a(Canvas paramCanvas)
  {
    int i = this.b.size();
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      sv localsv = (sv)localIterator.next();
      if ((localsv.l()) && ((i <= 20) || (localsv.h()))) {
        localsv.a(paramCanvas);
      }
    }
  }
  
  public final void a(sv paramsv)
  {
    b(paramsv.j());
    this.b.add(paramsv);
    if (!(paramsv instanceof so))
    {
      int i = this.f + 1;
      this.f = i;
      if (i > 0) {
        sz.a(this.a.c(), 1);
      }
    }
    if (this.f > 0) {
      this.a.f(false);
    }
    c();
    this.a.a(false, false);
  }
  
  public final boolean a(MotionEvent paramMotionEvent)
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      sv localsv = (sv)localIterator.next();
      if ((localsv instanceof tx)) {
        ((tx)localsv).a(paramMotionEvent, this.a.d());
      }
    }
    return false;
  }
  
  public final boolean a(qv paramqv)
  {
    boolean bool2 = false;
    Iterator localIterator = this.b.iterator();
    sv localsv;
    do
    {
      bool1 = bool2;
      if (!localIterator.hasNext()) {
        break;
      }
      localsv = (sv)localIterator.next();
    } while ((!(localsv instanceof tx)) || (!((tx)localsv).a(paramqv, this.a.d())));
    boolean bool1 = true;
    if (!bool1)
    {
      localIterator = this.b.iterator();
      while (localIterator.hasNext())
      {
        localsv = (sv)localIterator.next();
        if ((localsv instanceof tx)) {
          ((tx)localsv).a(paramqv);
        }
      }
    }
    return bool1;
  }
  
  public final boolean a(qv paramqv, MotionEvent paramMotionEvent)
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      sv localsv = (sv)localIterator.next();
      if (((localsv instanceof tx)) && (((tx)localsv).a(paramqv, paramMotionEvent, this.a.d()))) {
        return true;
      }
    }
    return false;
  }
  
  protected final void b()
  {
    a();
  }
  
  public final boolean b(String paramString)
  {
    Iterator localIterator = this.b.iterator();
    sv localsv;
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      localsv = (sv)localIterator.next();
    } while ((localsv == null) || (!localsv.j().equals(paramString)));
    for (paramString = localsv; paramString != null; paramString = null)
    {
      boolean bool = this.b.remove(paramString);
      if ((bool) && (!(paramString instanceof so)))
      {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
          sz.a(this.a.c(), 2);
        }
      }
      if (this.f <= 0) {
        this.a.f(true);
      }
      this.a.a(false, false);
      return bool;
    }
    return false;
  }
  
  public final void c()
  {
    Object[] arrayOfObject = this.b.toArray();
    Arrays.sort(arrayOfObject, this.d);
    this.b.clear();
    int j = arrayOfObject.length;
    int i = 0;
    while (i < j)
    {
      Object localObject = arrayOfObject[i];
      this.b.add((sv)localObject);
      i += 1;
    }
  }
  
  public final boolean c(String paramString)
  {
    paramString = (sr)this.c.remove(paramString);
    if (paramString == null) {
      return false;
    }
    paramString.c();
    return true;
  }
  
  final class a
    implements Comparator<Object>
  {
    private a() {}
    
    public final int compare(Object paramObject1, Object paramObject2)
    {
      paramObject1 = (sv)paramObject1;
      paramObject2 = (sv)paramObject2;
      if ((paramObject1 != null) && (paramObject2 != null)) {
        try
        {
          if (((sv)paramObject1).k() > ((sv)paramObject2).k()) {
            return 1;
          }
          float f1 = ((sv)paramObject1).k();
          float f2 = ((sv)paramObject2).k();
          if (f1 < f2) {
            return -1;
          }
        }
        catch (Exception paramObject1) {}
      }
      return 0;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/sf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */