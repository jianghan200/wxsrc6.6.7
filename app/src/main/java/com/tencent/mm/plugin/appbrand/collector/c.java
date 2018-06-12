package com.tencent.mm.plugin.appbrand.collector;

import java.util.HashSet;
import java.util.Set;

public final class c
{
  private static b foc = new h();
  private static boolean fod;
  private static final Set<String> foe = new HashSet();
  
  public static void a(CollectSession paramCollectSession)
  {
    if (paramCollectSession == null) {}
    while (!rB(paramCollectSession.groupId)) {
      return;
    }
    foc.a(paramCollectSession);
  }
  
  public static CollectSession aZ(String paramString1, String paramString2)
  {
    if (!rC(paramString1)) {
      return null;
    }
    return foc.aZ(paramString1, paramString2);
  }
  
  public static boolean adr()
  {
    return fod;
  }
  
  public static void ba(String paramString1, String paramString2)
  {
    if (!rC(paramString1)) {
      return;
    }
    foc.ba(paramString1, paramString2);
  }
  
  public static int bb(String paramString1, String paramString2)
  {
    if (!rB(paramString1)) {
      return 0;
    }
    return foc.bb(paramString1, paramString2);
  }
  
  public static void c(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    if (!rB(paramString1)) {
      return;
    }
    foc.c(paramString1, paramString2, paramString3, paramBoolean);
  }
  
  public static void c(String paramString1, String paramString2, boolean paramBoolean)
  {
    if (!rC(paramString1)) {
      return;
    }
    foc.c(paramString1, paramString2, paramBoolean);
  }
  
  public static void clear()
  {
    if (!fod) {
      return;
    }
    foc.clear();
  }
  
  public static void cx(boolean paramBoolean)
  {
    fod = paramBoolean;
  }
  
  public static void print(String paramString)
  {
    if (!rC(paramString)) {
      return;
    }
    foc.print(paramString);
  }
  
  public static boolean rA(String paramString)
  {
    if (paramString.length() == 0) {
      return false;
    }
    return foe.contains(paramString);
  }
  
  private static boolean rB(String paramString)
  {
    return (fod) && (foe.contains(paramString));
  }
  
  private static boolean rC(String paramString)
  {
    if (!fod) {}
    do
    {
      return false;
      paramString = foc.rv(paramString);
    } while ((paramString == null) || (!foe.contains(paramString.groupId)));
    return true;
  }
  
  public static CollectSession rv(String paramString)
  {
    if (!rC(paramString)) {
      return null;
    }
    return foc.rv(paramString);
  }
  
  public static CollectSession rw(String paramString)
  {
    if (!fod) {
      return null;
    }
    return foc.rw(paramString);
  }
  
  public static StringBuilder rx(String paramString)
  {
    if (!rB(paramString)) {
      return new StringBuilder();
    }
    return foc.rx(paramString);
  }
  
  public static void ry(String paramString)
  {
    if (paramString.length() == 0) {
      return;
    }
    foe.add(paramString);
  }
  
  public static void rz(String paramString)
  {
    if (paramString.length() == 0) {
      return;
    }
    foe.remove(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/collector/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */