package com.tencent.tencentmap.mapsdk.a;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class gm
  extends ar
{
  protected String[] b = { "findObjectById", "findObjectById4All", "findObjectById4Any", "findObjectByIdInSameGroup", "findObjectByIdInSameSet", "findObjectByIdInSameStation" };
  protected String c = "GBK";
  
  public final int _onDispatch(String paramString, jp paramjp)
  {
    int i = Arrays.binarySearch(this.b, paramString);
    if ((i < 0) || (i >= 6)) {
      return -1;
    }
    switch (i)
    {
    }
    for (;;)
    {
      return 0;
      if (paramjp.e != 0)
      {
        a(paramjp.e);
        return paramjp.e;
      }
      paramString = new md(paramjp.f);
      paramString.a(this.c);
      paramjp = new ArrayList();
      paramjp.add(new fl());
      a((ArrayList)paramString.a(paramjp, 0, true));
      continue;
      if (paramjp.e != 0)
      {
        b(paramjp.e);
        return paramjp.e;
      }
      paramString = new md(paramjp.f);
      paramString.a(this.c);
      i = paramString.a(0, 0, true);
      paramjp = new ArrayList();
      paramjp.add(new fl());
      paramjp = (ArrayList)paramString.a(paramjp, 2, true);
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(new fl());
      a(i, paramjp, (ArrayList)paramString.a(localArrayList, 3, true));
      continue;
      if (paramjp.e != 0)
      {
        f(paramjp.e);
        return paramjp.e;
      }
      paramString = new md(paramjp.f);
      paramString.a(this.c);
      i = paramString.a(0, 0, true);
      paramjp = new ArrayList();
      paramjp.add(new fl());
      paramjp = (ArrayList)paramString.a(paramjp, 2, true);
      localArrayList = new ArrayList();
      localArrayList.add(new fl());
      e(i, paramjp, (ArrayList)paramString.a(localArrayList, 3, true));
      continue;
      if (paramjp.e != 0)
      {
        c(paramjp.e);
        return paramjp.e;
      }
      paramString = new md(paramjp.f);
      paramString.a(this.c);
      i = paramString.a(0, 0, true);
      paramjp = new ArrayList();
      paramjp.add(new fl());
      paramjp = (ArrayList)paramString.a(paramjp, 2, true);
      localArrayList = new ArrayList();
      localArrayList.add(new fl());
      b(i, paramjp, (ArrayList)paramString.a(localArrayList, 3, true));
      continue;
      if (paramjp.e != 0)
      {
        e(paramjp.e);
        return paramjp.e;
      }
      paramString = new md(paramjp.f);
      paramString.a(this.c);
      i = paramString.a(0, 0, true);
      paramjp = new ArrayList();
      paramjp.add(new fl());
      paramjp = (ArrayList)paramString.a(paramjp, 3, true);
      localArrayList = new ArrayList();
      localArrayList.add(new fl());
      d(i, paramjp, (ArrayList)paramString.a(localArrayList, 4, true));
      continue;
      if (paramjp.e != 0)
      {
        d(paramjp.e);
        return paramjp.e;
      }
      paramString = new md(paramjp.f);
      paramString.a(this.c);
      i = paramString.a(0, 0, true);
      paramjp = new ArrayList();
      paramjp.add(new fl());
      paramjp = (ArrayList)paramString.a(paramjp, 3, true);
      localArrayList = new ArrayList();
      localArrayList.add(new fl());
      c(i, paramjp, (ArrayList)paramString.a(localArrayList, 4, true));
    }
  }
  
  public abstract void a(int paramInt);
  
  public abstract void a(int paramInt, ArrayList<fl> paramArrayList1, ArrayList<fl> paramArrayList2);
  
  public abstract void a(ArrayList<fl> paramArrayList);
  
  public abstract void b(int paramInt);
  
  public abstract void b(int paramInt, ArrayList<fl> paramArrayList1, ArrayList<fl> paramArrayList2);
  
  public abstract void c(int paramInt);
  
  public abstract void c(int paramInt, ArrayList<fl> paramArrayList1, ArrayList<fl> paramArrayList2);
  
  public abstract void d(int paramInt);
  
  public abstract void d(int paramInt, ArrayList<fl> paramArrayList1, ArrayList<fl> paramArrayList2);
  
  public abstract void e(int paramInt);
  
  public abstract void e(int paramInt, ArrayList<fl> paramArrayList1, ArrayList<fl> paramArrayList2);
  
  public abstract void f(int paramInt);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/gm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */