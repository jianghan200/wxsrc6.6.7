package com.tencent.mm.app;

import java.util.HashSet;
import java.util.Set;

public final class n
{
  private static final Set<String> bzc;
  
  static
  {
    HashSet localHashSet = new HashSet();
    bzc = localHashSet;
    localHashSet.add(":nospace");
    bzc.add(":cuploader");
    bzc.add(":dexopt");
    bzc.add(":recovery");
    bzc.add(":fallback");
  }
  
  public static boolean cP(String paramString)
  {
    int i = paramString.indexOf(':');
    if (i != -1) {}
    for (paramString = paramString.substring(i);; paramString = "") {
      return bzc.contains(paramString);
    }
  }
  
  public static boolean vd()
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/app/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */