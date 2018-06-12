package com.tencent.mm.plugin.ext.b;

import com.tencent.mm.storage.bd;

public final class b
{
  public static int P(bd parambd)
  {
    int i = 1;
    if (parambd.getType() == 34) {
      i = 2;
    }
    while (parambd.getType() == 1) {
      return i;
    }
    return 3;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/ext/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */