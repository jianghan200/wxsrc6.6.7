package com.tencent.mm.plugin.bbom;

public final class p
{
  private static boolean hez = false;
  
  /* Error */
  public static void cF(android.content.Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 10	com/tencent/mm/plugin/bbom/p:hez	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +7 -> 15
    //   11: ldc 2
    //   13: monitorexit
    //   14: return
    //   15: iconst_1
    //   16: putstatic 10	com/tencent/mm/plugin/bbom/p:hez	Z
    //   19: invokestatic 125	com/tencent/mm/kernel/g:Eh	()Lcom/tencent/mm/kernel/b;
    //   22: new 127	com/tencent/mm/plugin/bbom/p$1
    //   25: dup
    //   26: aload_0
    //   27: invokespecial 129	com/tencent/mm/plugin/bbom/p$1:<init>	(Landroid/content/Context;)V
    //   30: invokevirtual 135	com/tencent/mm/kernel/b:a	(Lcom/tencent/mm/network/n;)V
    //   33: goto -22 -> 11
    //   36: astore_0
    //   37: ldc 2
    //   39: monitorexit
    //   40: aload_0
    //   41: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	42	0	paramContext	android.content.Context
    //   6	2	1	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   3	7	36	finally
    //   15	33	36	finally
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/bbom/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */