package com.tencent.mm.sdk.a;

import com.tencent.mm.sdk.platformtools.bj;

public final class b
{
  public static boolean foreground = false;
  public static String sFc = "unknow";
  private static c sFd = null;
  private static boolean sFe = false;
  
  public static void A(String paramString1, String paramString2)
  {
    if (sFd != null) {
      sFd.A(paramString1, paramString2);
    }
  }
  
  public static void VV(String paramString)
  {
    sFc = paramString;
  }
  
  @Deprecated
  public static void VW(String paramString)
  {
    bj.Xm(paramString);
  }
  
  public static void a(a parama)
  {
    if (sFd != null) {
      sFd.a(parama);
    }
  }
  
  public static void a(c paramc)
  {
    sFd = paramc;
  }
  
  public static void bB(boolean paramBoolean)
  {
    foreground = paramBoolean;
  }
  
  @Deprecated
  public static boolean chn()
  {
    return bj.chn();
  }
  
  @Deprecated
  public static void cho() {}
  
  @Deprecated
  public static boolean chp()
  {
    return bj.cjh();
  }
  
  @Deprecated
  public static String chq()
  {
    return bj.cji();
  }
  
  public static boolean chr()
  {
    return sFe;
  }
  
  public static void l(int paramInt, String paramString)
  {
    if (sFd != null) {
      sFd.l(paramInt, paramString);
    }
  }
  
  public static void ld(boolean paramBoolean)
  {
    sFe = paramBoolean;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */