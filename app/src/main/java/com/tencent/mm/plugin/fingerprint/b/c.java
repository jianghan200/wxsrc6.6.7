package com.tencent.mm.plugin.fingerprint.b;

import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.k;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  implements com.tencent.mm.pluginsdk.j
{
  public static int a(com.tencent.mm.pluginsdk.wallet.c paramc, boolean paramBoolean)
  {
    return ((k)g.l(k.class)).a(paramc, paramBoolean);
  }
  
  public static boolean aNd()
  {
    boolean bool = ((k)g.l(k.class)).aNh();
    x.i("MicroMsg.FingerPrintAuthMgr", "isSupportFP is " + bool);
    return bool;
  }
  
  public static void aNe()
  {
    ((k)g.l(k.class)).aNe();
  }
  
  public static boolean aNf()
  {
    return ((k)g.l(k.class)).aNi();
  }
  
  public static com.tencent.mm.pluginsdk.wallet.j aNg()
  {
    return ((k)g.l(k.class)).aNg();
  }
  
  public static void abort()
  {
    ((k)g.l(k.class)).aNo();
  }
  
  public static void release()
  {
    ((k)g.l(k.class)).aNn();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/fingerprint/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */