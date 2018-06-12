package com.tencent.mm.plugin.emoji.a.a;

import com.tencent.mm.protocal.c.ts;

public final class e
{
  public static boolean a(ts paramts)
  {
    if (paramts == null) {
      return false;
    }
    return cs(paramts.rwV, 1);
  }
  
  public static boolean b(ts paramts)
  {
    boolean bool2 = false;
    if (paramts == null)
    {
      bool1 = false;
      if (!bool1) {
        if (paramts != null) {
          break label38;
        }
      }
    }
    label38:
    for (boolean bool1 = false;; bool1 = cs(paramts.rwU, 8))
    {
      if (bool1) {
        bool2 = true;
      }
      return bool2;
      bool1 = cs(paramts.rwU, 4);
      break;
    }
  }
  
  public static boolean cs(int paramInt1, int paramInt2)
  {
    return (paramInt1 & paramInt2) == paramInt2;
  }
  
  public static boolean oK(int paramInt)
  {
    return (cs(paramInt, 4)) || (cs(paramInt, 8));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/emoji/a/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */