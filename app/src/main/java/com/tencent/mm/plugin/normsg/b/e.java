package com.tencent.mm.plugin.normsg.b;

public final class e
{
  public static boolean lGW = false;
  
  /* Error */
  static
  {
    // Byte code:
    //   0: iconst_0
    //   1: putstatic 12	com/tencent/mm/plugin/normsg/b/e:lGW	Z
    //   4: invokestatic 18	java/lang/System:nanoTime	()J
    //   7: lstore_0
    //   8: invokestatic 24	com/tencent/mm/plugin/normsg/Normsg$b:bjB	()Z
    //   11: putstatic 12	com/tencent/mm/plugin/normsg/b/e:lGW	Z
    //   14: ldc 26
    //   16: ldc 28
    //   18: iconst_2
    //   19: anewarray 4	java/lang/Object
    //   22: dup
    //   23: iconst_0
    //   24: getstatic 12	com/tencent/mm/plugin/normsg/b/e:lGW	Z
    //   27: invokestatic 34	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   30: aastore
    //   31: dup
    //   32: iconst_1
    //   33: invokestatic 18	java/lang/System:nanoTime	()J
    //   36: lload_0
    //   37: lsub
    //   38: invokestatic 39	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   41: aastore
    //   42: invokestatic 45	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   45: return
    //   46: astore_2
    //   47: ldc 26
    //   49: aload_2
    //   50: ldc 47
    //   52: iconst_0
    //   53: anewarray 4	java/lang/Object
    //   56: invokestatic 51	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   59: iconst_0
    //   60: putstatic 12	com/tencent/mm/plugin/normsg/b/e:lGW	Z
    //   63: ldc 26
    //   65: ldc 28
    //   67: iconst_2
    //   68: anewarray 4	java/lang/Object
    //   71: dup
    //   72: iconst_0
    //   73: getstatic 12	com/tencent/mm/plugin/normsg/b/e:lGW	Z
    //   76: invokestatic 34	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   79: aastore
    //   80: dup
    //   81: iconst_1
    //   82: invokestatic 18	java/lang/System:nanoTime	()J
    //   85: lload_0
    //   86: lsub
    //   87: invokestatic 39	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   90: aastore
    //   91: invokestatic 45	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   94: return
    //   95: astore_2
    //   96: ldc 26
    //   98: ldc 28
    //   100: iconst_2
    //   101: anewarray 4	java/lang/Object
    //   104: dup
    //   105: iconst_0
    //   106: getstatic 12	com/tencent/mm/plugin/normsg/b/e:lGW	Z
    //   109: invokestatic 34	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   112: aastore
    //   113: dup
    //   114: iconst_1
    //   115: invokestatic 18	java/lang/System:nanoTime	()J
    //   118: lload_0
    //   119: lsub
    //   120: invokestatic 39	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   123: aastore
    //   124: invokestatic 45	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   127: aload_2
    //   128: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   7	112	0	l	long
    //   46	4	2	localThrowable	Throwable
    //   95	33	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   8	14	46	java/lang/Throwable
    //   8	14	95	finally
    //   47	63	95	finally
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/normsg/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */