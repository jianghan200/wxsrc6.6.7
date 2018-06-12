package com.tencent.tencentmap.mapsdk.a;

import com.tencent.map.lib.listener.a;
import com.tencent.map.lib.mapstructure.TappedElement;
import com.tencent.map.lib.util.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class hu
{
  private ArrayList<iw> a;
  private ArrayList<iw> b;
  private ArrayList<iw> c;
  private gy d;
  private it e;
  private List<is> f;
  private ip g;
  private iv h;
  private a i;
  private ArrayList<Integer> j;
  
  public hu(gy paramgy)
  {
    this.d = paramgy;
    this.a = new ArrayList();
    this.b = new ArrayList();
    this.c = new ArrayList();
    this.j = new ArrayList();
  }
  
  private void a()
  {
    for (;;)
    {
      int k;
      int m;
      synchronized (this.a)
      {
        ArrayList localArrayList2 = new ArrayList();
        int n = this.c.size();
        k = 0;
        Object localObject2;
        if (k < n)
        {
          localObject2 = (iw)this.c.get(k);
          if ((localObject2 instanceof ix))
          {
            localObject2 = (ix)localObject2;
            int i1 = ((ix)localObject2).c();
            m = 0;
            if (m >= i1) {
              break label245;
            }
            iw localiw = ((ix)localObject2).a(m);
            if ((localiw instanceof iy))
            {
              int i2 = ((iy)localiw).e();
              if (i2 >= 0) {
                localArrayList2.add(Integer.valueOf(i2));
              }
            }
          }
          else
          {
            if (!(localObject2 instanceof iy)) {
              break label245;
            }
            m = ((iy)localObject2).e();
            if (m < 0) {
              break label245;
            }
            localArrayList2.add(Integer.valueOf(m));
            break label245;
          }
        }
        else
        {
          m = localArrayList2.size();
          localObject2 = new int[m];
          k = 0;
          if (k < m)
          {
            localObject2[k] = ((Integer)localArrayList2.get(k)).intValue();
            k += 1;
            continue;
          }
          this.d.f().a((int[])localObject2, m);
          this.c.clear();
          return;
        }
      }
      m += 1;
      continue;
      label245:
      k += 1;
    }
  }
  
  private boolean b(float paramFloat1, float paramFloat2)
  {
    Object localObject = this.d.f().a(paramFloat1, paramFloat2);
    if (localObject == null) {}
    do
    {
      return false;
      if ((((TappedElement)localObject).type == 1) && (this.e != null))
      {
        this.e.a(new iu(((TappedElement)localObject).name, d.a(((TappedElement)localObject).pixelX, ((TappedElement)localObject).pixelY)));
        return true;
      }
      if ((((TappedElement)localObject).type == 6) && (this.f != null))
      {
        localObject = this.f.iterator();
        while (((Iterator)localObject).hasNext())
        {
          is localis = (is)((Iterator)localObject).next();
          if (localis != null) {
            localis.a();
          }
        }
        return true;
      }
      if ((((TappedElement)localObject).type == 7) && (this.g != null))
      {
        this.g.a(((TappedElement)localObject).param2, ((TappedElement)localObject).nameLen);
        return true;
      }
    } while (this.h == null);
    this.h.a();
    return false;
  }
  
  public void a(int paramInt1, int paramInt2) {}
  
  public void a(a parama)
  {
    this.i = parama;
  }
  
  public void a(iw paramiw)
  {
    synchronized (this.a)
    {
      if (this.a.contains(paramiw)) {
        return;
      }
      this.a.add(paramiw);
      this.d.a().z();
      return;
    }
  }
  
  public boolean a(float paramFloat1, float paramFloat2)
  {
    TappedElement localTappedElement = this.d.f().a(paramFloat1, paramFloat2);
    if (localTappedElement == null) {}
    while (localTappedElement.type != 3) {
      return false;
    }
    if (this.i != null) {
      this.i.e();
    }
    return true;
  }
  
  public boolean a(hh paramhh, float paramFloat1, float paramFloat2)
  {
    for (;;)
    {
      int k;
      synchronized (this.a)
      {
        k = this.a.size() - 1;
        if (k >= 0)
        {
          iw localiw = (iw)this.a.get(k);
          if ((localiw != null) && (localiw.a(paramhh, paramFloat1, paramFloat2))) {
            return true;
          }
        }
        else
        {
          return b(paramFloat1, paramFloat2);
        }
      }
      k -= 1;
    }
  }
  
  public boolean a(hs paramhs, hh paramhh)
  {
    a();
    this.b.clear();
    for (;;)
    {
      iw localiw;
      synchronized (this.a)
      {
        this.b.addAll(this.a);
        ??? = this.b.iterator();
        if (!((Iterator)???).hasNext()) {
          break;
        }
        localiw = (iw)((Iterator)???).next();
        if ((localiw instanceof in)) {
          ((in)localiw).a(paramhs, paramhh);
        }
      }
      localiw.b(paramhs, paramhh);
    }
    return true;
  }
  
  public void b(iw paramiw)
  {
    if (paramiw == null) {
      return;
    }
    synchronized (this.a)
    {
      if (this.a.remove(paramiw)) {
        this.d.a().z();
      }
      this.c.add(paramiw);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/hu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */