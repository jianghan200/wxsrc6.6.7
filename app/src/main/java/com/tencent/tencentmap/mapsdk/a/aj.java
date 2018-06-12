package com.tencent.tencentmap.mapsdk.a;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class aj
{
  public static final List<Integer> a;
  private ConcurrentHashMap<lb, an> b = new ConcurrentHashMap();
  
  static
  {
    ArrayList localArrayList = new ArrayList();
    a = localArrayList;
    localArrayList.add(Integer.valueOf(5));
    a.add(Integer.valueOf(10));
    a.add(Integer.valueOf(50));
    a.add(Integer.valueOf(100));
    a.add(Integer.valueOf(200));
    a.add(Integer.valueOf(500));
    a.add(Integer.valueOf(1000));
    a.add(Integer.valueOf(2000));
    a.add(Integer.valueOf(3000));
  }
  
  public an a(lb paramlb)
  {
    an localan2 = (an)this.b.get(paramlb);
    an localan1 = localan2;
    if (localan2 == null)
    {
      localan1 = new an(a);
      this.b.putIfAbsent(paramlb, localan1);
    }
    return localan1;
  }
  
  public ConcurrentHashMap<lb, an> a()
  {
    return this.b;
  }
  
  public void a(lb paramlb, int paramInt)
  {
    a(paramlb).a(paramInt, 2);
  }
  
  public void a(lb paramlb, long paramLong, int paramInt)
  {
    if (paramInt == 0) {
      a(paramlb).a(paramLong, 0);
    }
    do
    {
      return;
      if (paramInt == 1)
      {
        a(paramlb).a(paramLong, 1);
        return;
      }
    } while (paramInt != 2);
    a(paramlb).a(paramLong, 2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */