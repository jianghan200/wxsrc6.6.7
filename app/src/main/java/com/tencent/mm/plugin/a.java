package com.tencent.mm.plugin;

import com.tencent.mm.model.p;
import com.tencent.mm.modelstat.q;

public final class a
  extends p
{
  private static a ezm;
  
  private a()
  {
    super(q.class);
  }
  
  public static a VO()
  {
    try
    {
      if (ezm == null) {
        ezm = new a();
      }
      a locala = ezm;
      return locala;
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */