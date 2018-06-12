package com.tencent.mm.plugin.ag;

import com.tencent.mm.kernel.api.bucket.b;
import com.tencent.mm.kernel.b.c;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import java.util.List;

public final class a
  implements b, c
{
  private static a mtL;
  
  public static a bqO()
  {
    try
    {
      if (mtL == null) {
        mtL = new a();
      }
      a locala = mtL;
      return locala;
    }
    finally {}
  }
  
  public static String bqP()
  {
    return g.Ei().dqp + "remark/";
  }
  
  public final List<String> collectStoragePaths()
  {
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/ag/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */