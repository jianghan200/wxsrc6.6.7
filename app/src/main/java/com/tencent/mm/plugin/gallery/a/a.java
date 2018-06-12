package com.tencent.mm.plugin.gallery.a;

import java.util.Collections;
import java.util.List;

public final class a
{
  public static void swap(List<?> paramList, int paramInt1, int paramInt2)
  {
    int i = paramInt1;
    if (paramInt1 > paramInt2) {
      while (paramInt1 > paramInt2)
      {
        Collections.swap(paramList, paramInt1, paramInt1 - 1);
        paramInt1 -= 1;
      }
    }
    while (i < paramInt2)
    {
      Collections.swap(paramList, i, i + 1);
      i += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/gallery/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */