package com.tencent.mm.plugin.ad;

import com.tencent.mm.model.p;
import com.tencent.mm.modelcontrol.c;

public final class a
  extends p
{
  private static a lQG;
  
  private a()
  {
    super(c.class);
  }
  
  public static a bmE()
  {
    try
    {
      if (lQG == null) {
        lQG = new a();
      }
      a locala = lQG;
      return locala;
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/ad/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */