package com.tencent.mm.sdk.platformtools;

import java.util.HashSet;
import java.util.Set;

public final class af
{
  private static Set<String> sGD = new HashSet();
  
  public static boolean Wp(String paramString)
  {
    if (Wr(paramString))
    {
      x.d("MicroMsg.MMEntryLock", "locked-" + paramString);
      return false;
    }
    x.d("MicroMsg.MMEntryLock", "lock-" + paramString);
    return sGD.add(paramString);
  }
  
  public static void Wq(String paramString)
  {
    sGD.remove(paramString);
    x.d("MicroMsg.MMEntryLock", "unlock-" + paramString);
  }
  
  public static boolean Wr(String paramString)
  {
    return sGD.contains(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */