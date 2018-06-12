package com.tencent.mm.plugin.hardwareopt.b;

import com.tencent.mm.protocal.c.amg;

public class a
{
  private static volatile a kji = null;
  private amg kjj = null;
  
  public static a aVS()
  {
    if (kji == null) {
      try
      {
        if (kji == null) {
          kji = new a();
        }
        a locala = kji;
        return locala;
      }
      finally {}
    }
    return kji;
  }
  
  public final amg aVT()
  {
    if (this.kjj == null) {
      this.kjj = new amg();
    }
    return this.kjj;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/hardwareopt/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */