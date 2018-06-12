package com.tencent.c.e.a.a;

import com.tencent.c.e.a.b.f;
import com.tencent.c.e.a.b.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class i
{
  final int dty;
  int iUy;
  Object[] tD;
  final int uVx;
  private final int vkg;
  
  public i(int paramInt1, int paramInt2, int paramInt3)
  {
    this.vkg = paramInt1;
    this.tD = new Object[(int)Math.ceil(1.0F * paramInt3 / paramInt2)];
    this.iUy = 0;
    this.dty = paramInt3;
    this.uVx = paramInt2;
  }
  
  private ArrayList<f> Ho(int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    List localList = (List)this.tD[paramInt];
    if (localList == null) {
      return localArrayList;
    }
    paramInt = 0;
    while (paramInt < localList.size())
    {
      j localj = (j)localList.get(paramInt);
      f localf = new f();
      localf.x = localj.values[0];
      localf.y = localj.values[1];
      localf.z = localj.values[2];
      localf.vkB = localj.timestamp;
      localArrayList.add(localf);
      paramInt += 1;
    }
    return localArrayList;
  }
  
  public final Object[] cFu()
  {
    return (Object[])this.tD.clone();
  }
  
  public final ArrayList<g> eg(List<k> paramList)
  {
    ArrayList localArrayList1 = new ArrayList();
    int j = 0;
    if (j < this.tD.length)
    {
      Object localObject = (List)this.tD[j];
      g localg;
      ArrayList localArrayList2;
      HashMap localHashMap;
      int i;
      if ((localObject != null) && (((List)localObject).size() != 0))
      {
        localg = new g();
        localArrayList2 = Ho(j);
        localHashMap = new HashMap();
        if (this.vkg != 1) {
          break label212;
        }
        i = 0;
      }
      for (;;)
      {
        localHashMap.put(Integer.valueOf(i), localArrayList2);
        localg.vkD = localHashMap;
        localObject = (j)((List)localObject).get(0);
        if (localObject != null)
        {
          localg.vkC = ((j)localObject).timestamp;
          if (paramList.size() > j)
          {
            localObject = (k)paramList.get(j);
            if (localObject != null)
            {
              localg.vki = ((k)localObject).vki;
              localg.vkj = ((k)localObject).vkj;
              localg.vkk = ((k)localObject).vkk;
              localg.vkl = ((k)localObject).vkl;
            }
          }
          localArrayList1.add(localg);
        }
        j += 1;
        break;
        label212:
        if (this.vkg == 4) {
          i = 2;
        } else if (this.vkg == 9) {
          i = 4;
        } else {
          i = -1;
        }
      }
    }
    return localArrayList1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/c/e/a/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */