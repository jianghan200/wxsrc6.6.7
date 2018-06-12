package com.tencent.mm.wallet_core.c;

import java.util.UUID;

public final class p
{
  private static boolean uXr = false;
  private static int uXs = -1;
  private static String uXt = "";
  
  public static void GZ(int paramInt)
  {
    if (!uXr)
    {
      uXr = true;
      uXs = paramInt;
      uXt = UUID.randomUUID().toString();
    }
  }
  
  public static boolean cDb()
  {
    return uXr;
  }
  
  public static int cDc()
  {
    return uXs;
  }
  
  public static String cDd()
  {
    return uXt;
  }
  
  public static void cDe()
  {
    uXr = false;
    uXs = -1;
    uXt = "";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/wallet_core/c/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */