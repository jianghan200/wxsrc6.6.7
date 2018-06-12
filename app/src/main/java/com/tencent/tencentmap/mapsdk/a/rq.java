package com.tencent.tencentmap.mapsdk.a;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class rq
{
  private int a;
  private int b;
  private List<rp> c;
  
  public rq(int paramInt1, int paramInt2, List<rp> paramList)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramList;
    Collections.sort(paramList, new rq.1(this));
  }
  
  public final int a()
  {
    return this.a;
  }
  
  public final String[] a(rr paramrr)
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      rp localrp = (rp)localIterator.next();
      if (localrp.a(paramrr)) {
        return new String[] { localrp.b(), localrp.c() };
      }
    }
    return null;
  }
  
  public final int b()
  {
    return this.b;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/rq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */