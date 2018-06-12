package com.tencent.mm.plugin.normsg.b;

public final class g
{
  public static boolean lHd = false;
  
  /* Error */
  static
  {
    // Byte code:
    //   0: iconst_0
    //   1: putstatic 12	com/tencent/mm/plugin/normsg/b/g:lHd	Z
    //   4: invokestatic 18	java/lang/System:nanoTime	()J
    //   7: lstore_0
    //   8: iconst_0
    //   9: putstatic 12	com/tencent/mm/plugin/normsg/b/g:lHd	Z
    //   12: getstatic 24	android/os/Build$VERSION:SDK_INT	I
    //   15: bipush 21
    //   17: if_icmpge +39 -> 56
    //   20: iconst_0
    //   21: putstatic 12	com/tencent/mm/plugin/normsg/b/g:lHd	Z
    //   24: ldc 26
    //   26: ldc 28
    //   28: iconst_2
    //   29: anewarray 4	java/lang/Object
    //   32: dup
    //   33: iconst_0
    //   34: getstatic 12	com/tencent/mm/plugin/normsg/b/g:lHd	Z
    //   37: invokestatic 34	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   40: aastore
    //   41: dup
    //   42: iconst_1
    //   43: invokestatic 18	java/lang/System:nanoTime	()J
    //   46: lload_0
    //   47: lsub
    //   48: invokestatic 39	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   51: aastore
    //   52: invokestatic 45	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   55: return
    //   56: ldc 47
    //   58: ldc 49
    //   60: invokevirtual 55	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   63: astore_2
    //   64: aload_2
    //   65: iconst_1
    //   66: invokevirtual 61	java/lang/reflect/Field:setAccessible	(Z)V
    //   69: invokestatic 67	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   72: invokevirtual 72	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   75: ldc 74
    //   77: invokevirtual 78	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   80: checkcast 80	android/app/ActivityManager
    //   83: iconst_1
    //   84: iconst_2
    //   85: invokevirtual 84	android/app/ActivityManager:getRecentTasks	(II)Ljava/util/List;
    //   88: astore_3
    //   89: aload_3
    //   90: ifnull +12 -> 102
    //   93: aload_3
    //   94: invokeinterface 90 1 0
    //   99: ifne +47 -> 146
    //   102: iconst_0
    //   103: putstatic 12	com/tencent/mm/plugin/normsg/b/g:lHd	Z
    //   106: goto -82 -> 24
    //   109: astore_2
    //   110: iconst_0
    //   111: putstatic 12	com/tencent/mm/plugin/normsg/b/g:lHd	Z
    //   114: ldc 26
    //   116: ldc 28
    //   118: iconst_2
    //   119: anewarray 4	java/lang/Object
    //   122: dup
    //   123: iconst_0
    //   124: getstatic 12	com/tencent/mm/plugin/normsg/b/g:lHd	Z
    //   127: invokestatic 34	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   130: aastore
    //   131: dup
    //   132: iconst_1
    //   133: invokestatic 18	java/lang/System:nanoTime	()J
    //   136: lload_0
    //   137: lsub
    //   138: invokestatic 39	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   141: aastore
    //   142: invokestatic 45	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   145: return
    //   146: aload_2
    //   147: aload_3
    //   148: iconst_0
    //   149: invokeinterface 94 2 0
    //   154: checkcast 47	android/app/ActivityManager$RecentTaskInfo
    //   157: invokevirtual 98	java/lang/reflect/Field:getInt	(Ljava/lang/Object;)I
    //   160: ifle -136 -> 24
    //   163: iconst_1
    //   164: putstatic 12	com/tencent/mm/plugin/normsg/b/g:lHd	Z
    //   167: goto -143 -> 24
    //   170: astore_2
    //   171: ldc 26
    //   173: ldc 28
    //   175: iconst_2
    //   176: anewarray 4	java/lang/Object
    //   179: dup
    //   180: iconst_0
    //   181: getstatic 12	com/tencent/mm/plugin/normsg/b/g:lHd	Z
    //   184: invokestatic 34	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   187: aastore
    //   188: dup
    //   189: iconst_1
    //   190: invokestatic 18	java/lang/System:nanoTime	()J
    //   193: lload_0
    //   194: lsub
    //   195: invokestatic 39	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   198: aastore
    //   199: invokestatic 45	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   202: aload_2
    //   203: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   7	187	0	l	long
    //   63	2	2	localField	java.lang.reflect.Field
    //   109	38	2	localThrowable	Throwable
    //   170	33	2	localObject	Object
    //   88	60	3	localList	java.util.List
    // Exception table:
    //   from	to	target	type
    //   8	24	109	java/lang/Throwable
    //   56	89	109	java/lang/Throwable
    //   93	102	109	java/lang/Throwable
    //   102	106	109	java/lang/Throwable
    //   146	167	109	java/lang/Throwable
    //   8	24	170	finally
    //   56	89	170	finally
    //   93	102	170	finally
    //   102	106	170	finally
    //   110	114	170	finally
    //   146	167	170	finally
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/normsg/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */