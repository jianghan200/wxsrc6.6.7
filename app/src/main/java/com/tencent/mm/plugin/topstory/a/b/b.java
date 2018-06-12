package com.tencent.mm.plugin.topstory.a.b;

import com.tencent.mm.protocal.c.bti;

public final class b
{
  public long jyY;
  public boolean mGh;
  public bti ozj;
  public boolean ozk;
  
  public b(bti parambti)
  {
    this.ozj = parambti;
    this.jyY = System.currentTimeMillis();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    paramObject = (b)paramObject;
    return this.ozj.sqS.equals(((b)paramObject).ozj.sqS);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/topstory/a/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */