package com.tencent.mm.plugin.ipcall.a;

import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;

public final class b
{
  private static c kog = new b.1();
  
  public static void init()
  {
    a.sFg.b(kog);
  }
  
  public static void release()
  {
    a.sFg.c(kog);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */