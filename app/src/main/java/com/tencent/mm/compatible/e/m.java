package com.tencent.mm.compatible.e;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class m
{
  static int dev = 0;
  static String dew = null;
  
  public static int zj()
  {
    int m = 15;
    int i;
    int j;
    int k;
    if (n.zq())
    {
      i = 7;
      j = i;
      if (q.deL.dey)
      {
        j = i;
        if (q.deL.deA == 0)
        {
          x.d("MicroMsg.CpuChecker", "disable armv6 by server ");
          j = i & 0xFFFFFFFD;
        }
      }
      k = j;
      if (q.deL.dey)
      {
        k = j;
        if (q.deL.dez == 0)
        {
          x.d("MicroMsg.CpuChecker", "disable armv7 by server ");
          k = j & 0xFFFFFFFB;
        }
      }
      i = n.zs();
      if (i <= 16) {
        break label175;
      }
      j = 15;
      label93:
      i = bi.getInt(zk(), 0) / 1000;
      if (j <= 4) {
        break label186;
      }
      i *= 4;
    }
    label114:
    label130:
    label175:
    label186:
    label226:
    label229:
    for (;;)
    {
      int n = i / 100;
      if (n > 30)
      {
        i = 30;
        if ((i > 5) || (j < 4)) {
          break label226;
        }
        i = m;
      }
      for (;;)
      {
        i = (k + (j << 4) << 8) + i;
        dev = i;
        return i;
        if (n.zr())
        {
          i = 3;
          break;
        }
        i = 1;
        break;
        j = i;
        if (i > 0) {
          break label93;
        }
        j = 1;
        break label93;
        if (j > 2)
        {
          i *= 2;
          break label114;
        }
        if (j <= 1) {
          break label229;
        }
        i = i * 3 >> 1;
        break label114;
        i = n;
        if (n >= 5) {
          break label130;
        }
        i = 5;
        break label130;
      }
    }
  }
  
  /* Error */
  public static String zk()
  {
    // Byte code:
    //   0: new 73	java/io/BufferedReader
    //   3: dup
    //   4: new 75	java/io/FileReader
    //   7: dup
    //   8: ldc 77
    //   10: invokespecial 81	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   13: invokespecial 84	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   16: astore_1
    //   17: aload_1
    //   18: astore_0
    //   19: aload_1
    //   20: invokevirtual 87	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   23: astore_2
    //   24: aload_2
    //   25: ifnonnull +37 -> 62
    //   28: aload_1
    //   29: astore_0
    //   30: new 89	java/lang/NullPointerException
    //   33: dup
    //   34: ldc 91
    //   36: invokespecial 92	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   39: athrow
    //   40: astore_2
    //   41: aload_1
    //   42: astore_0
    //   43: ldc 40
    //   45: aload_2
    //   46: ldc 94
    //   48: iconst_0
    //   49: anewarray 4	java/lang/Object
    //   52: invokestatic 98	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   55: aload_1
    //   56: invokestatic 101	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   59: ldc 103
    //   61: areturn
    //   62: aload_1
    //   63: astore_0
    //   64: aload_2
    //   65: invokevirtual 108	java/lang/String:trim	()Ljava/lang/String;
    //   68: astore_2
    //   69: aload_1
    //   70: invokestatic 101	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   73: aload_2
    //   74: areturn
    //   75: astore_1
    //   76: aconst_null
    //   77: astore_0
    //   78: aload_0
    //   79: invokestatic 101	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   82: aload_1
    //   83: athrow
    //   84: astore_1
    //   85: goto -7 -> 78
    //   88: astore_2
    //   89: aconst_null
    //   90: astore_1
    //   91: goto -50 -> 41
    // Local variable table:
    //   start	length	slot	name	signature
    //   18	61	0	localBufferedReader1	java.io.BufferedReader
    //   16	54	1	localBufferedReader2	java.io.BufferedReader
    //   75	8	1	localObject1	Object
    //   84	1	1	localObject2	Object
    //   90	1	1	localObject3	Object
    //   23	2	2	str1	String
    //   40	25	2	localThrowable1	Throwable
    //   68	6	2	str2	String
    //   88	1	2	localThrowable2	Throwable
    // Exception table:
    //   from	to	target	type
    //   19	24	40	java/lang/Throwable
    //   30	40	40	java/lang/Throwable
    //   64	69	40	java/lang/Throwable
    //   0	17	75	finally
    //   19	24	84	finally
    //   30	40	84	finally
    //   43	55	84	finally
    //   64	69	84	finally
    //   0	17	88	java/lang/Throwable
  }
  
  /* Error */
  public static String zl()
  {
    // Byte code:
    //   0: new 73	java/io/BufferedReader
    //   3: dup
    //   4: new 75	java/io/FileReader
    //   7: dup
    //   8: ldc 111
    //   10: invokespecial 81	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   13: invokespecial 84	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   16: astore_1
    //   17: aload_1
    //   18: astore_0
    //   19: aload_1
    //   20: invokevirtual 87	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   23: astore_2
    //   24: aload_2
    //   25: ifnonnull +37 -> 62
    //   28: aload_1
    //   29: astore_0
    //   30: new 89	java/lang/NullPointerException
    //   33: dup
    //   34: ldc 113
    //   36: invokespecial 92	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   39: athrow
    //   40: astore_2
    //   41: aload_1
    //   42: astore_0
    //   43: ldc 40
    //   45: aload_2
    //   46: ldc 94
    //   48: iconst_0
    //   49: anewarray 4	java/lang/Object
    //   52: invokestatic 98	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   55: aload_1
    //   56: invokestatic 101	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   59: ldc 103
    //   61: areturn
    //   62: aload_1
    //   63: astore_0
    //   64: aload_2
    //   65: invokevirtual 108	java/lang/String:trim	()Ljava/lang/String;
    //   68: astore_2
    //   69: aload_1
    //   70: invokestatic 101	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   73: aload_2
    //   74: areturn
    //   75: astore_1
    //   76: aconst_null
    //   77: astore_0
    //   78: aload_0
    //   79: invokestatic 101	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   82: aload_1
    //   83: athrow
    //   84: astore_1
    //   85: goto -7 -> 78
    //   88: astore_2
    //   89: aconst_null
    //   90: astore_1
    //   91: goto -50 -> 41
    // Local variable table:
    //   start	length	slot	name	signature
    //   18	61	0	localBufferedReader1	java.io.BufferedReader
    //   16	54	1	localBufferedReader2	java.io.BufferedReader
    //   75	8	1	localObject1	Object
    //   84	1	1	localObject2	Object
    //   90	1	1	localObject3	Object
    //   23	2	2	str1	String
    //   40	25	2	localThrowable1	Throwable
    //   68	6	2	str2	String
    //   88	1	2	localThrowable2	Throwable
    // Exception table:
    //   from	to	target	type
    //   19	24	40	java/lang/Throwable
    //   30	40	40	java/lang/Throwable
    //   64	69	40	java/lang/Throwable
    //   0	17	75	finally
    //   19	24	84	finally
    //   30	40	84	finally
    //   43	55	84	finally
    //   64	69	84	finally
    //   0	17	88	java/lang/Throwable
  }
  
  /* Error */
  public static String zm()
  {
    // Byte code:
    //   0: new 73	java/io/BufferedReader
    //   3: dup
    //   4: new 75	java/io/FileReader
    //   7: dup
    //   8: ldc 118
    //   10: invokespecial 81	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   13: invokespecial 84	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   16: astore_1
    //   17: aload_1
    //   18: astore_0
    //   19: aload_1
    //   20: invokevirtual 87	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   23: astore_2
    //   24: aload_2
    //   25: ifnonnull +37 -> 62
    //   28: aload_1
    //   29: astore_0
    //   30: new 89	java/lang/NullPointerException
    //   33: dup
    //   34: ldc 120
    //   36: invokespecial 92	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   39: athrow
    //   40: astore_2
    //   41: aload_1
    //   42: astore_0
    //   43: ldc 40
    //   45: aload_2
    //   46: ldc 94
    //   48: iconst_0
    //   49: anewarray 4	java/lang/Object
    //   52: invokestatic 98	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   55: aload_1
    //   56: invokestatic 101	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   59: ldc 103
    //   61: areturn
    //   62: aload_1
    //   63: astore_0
    //   64: aload_2
    //   65: invokevirtual 108	java/lang/String:trim	()Ljava/lang/String;
    //   68: astore_2
    //   69: aload_1
    //   70: invokestatic 101	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   73: aload_2
    //   74: areturn
    //   75: astore_1
    //   76: aconst_null
    //   77: astore_0
    //   78: aload_0
    //   79: invokestatic 101	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   82: aload_1
    //   83: athrow
    //   84: astore_1
    //   85: goto -7 -> 78
    //   88: astore_2
    //   89: aconst_null
    //   90: astore_1
    //   91: goto -50 -> 41
    // Local variable table:
    //   start	length	slot	name	signature
    //   18	61	0	localBufferedReader1	java.io.BufferedReader
    //   16	54	1	localBufferedReader2	java.io.BufferedReader
    //   75	8	1	localObject1	Object
    //   84	1	1	localObject2	Object
    //   90	1	1	localObject3	Object
    //   23	2	2	str1	String
    //   40	25	2	localException1	Exception
    //   68	6	2	str2	String
    //   88	1	2	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   19	24	40	java/lang/Exception
    //   30	40	40	java/lang/Exception
    //   64	69	40	java/lang/Exception
    //   0	17	75	finally
    //   19	24	84	finally
    //   30	40	84	finally
    //   43	55	84	finally
    //   64	69	84	finally
    //   0	17	88	java/lang/Exception
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/compatible/e/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */