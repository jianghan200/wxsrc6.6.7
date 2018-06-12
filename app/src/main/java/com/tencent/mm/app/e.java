package com.tencent.mm.app;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.mm.blink.b;
import com.tencent.mm.sdk.platformtools.x;
import java.util.concurrent.locks.ReentrantLock;

public final class e
  implements ServiceConnection
{
  private static boolean bye = false;
  private static Object lock = new Object();
  private ReentrantLock byf = new ReentrantLock();
  private boolean byg = false;
  private IBinder byh = null;
  private Runnable byi = new e.5(this);
  
  /* Error */
  private static int cL(String paramString)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: istore_1
    //   2: new 517	java/io/File
    //   5: dup
    //   6: ldc_w 519
    //   9: invokespecial 520	java/io/File:<init>	(Ljava/lang/String;)V
    //   12: invokevirtual 524	java/io/File:listFiles	()[Ljava/io/File;
    //   15: astore 9
    //   17: aload 9
    //   19: arraylength
    //   20: istore 4
    //   22: iconst_0
    //   23: istore_2
    //   24: aconst_null
    //   25: astore 7
    //   27: iload_1
    //   28: istore_3
    //   29: iload_2
    //   30: iload 4
    //   32: if_icmpge +199 -> 231
    //   35: aload 9
    //   37: iload_2
    //   38: aaload
    //   39: astore 8
    //   41: aload 8
    //   43: invokevirtual 527	java/io/File:getName	()Ljava/lang/String;
    //   46: iconst_m1
    //   47: invokestatic 531	com/tencent/mm/sdk/platformtools/bi:getInt	(Ljava/lang/String;I)I
    //   50: istore_3
    //   51: iload_3
    //   52: istore_1
    //   53: aload 7
    //   55: astore 6
    //   57: new 517	java/io/File
    //   60: dup
    //   61: aload 8
    //   63: ldc_w 533
    //   66: invokespecial 536	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   69: astore 8
    //   71: aload 7
    //   73: astore 6
    //   75: aload 8
    //   77: invokevirtual 539	java/io/File:canRead	()Z
    //   80: istore 5
    //   82: iload 5
    //   84: ifne +62 -> 146
    //   87: iload_1
    //   88: istore_3
    //   89: aload 7
    //   91: astore 6
    //   93: aload 7
    //   95: ifnull +13 -> 108
    //   98: aload 7
    //   100: invokevirtual 544	java/io/BufferedReader:close	()V
    //   103: aconst_null
    //   104: astore 6
    //   106: iload_1
    //   107: istore_3
    //   108: iload_2
    //   109: iconst_1
    //   110: iadd
    //   111: istore_2
    //   112: iload_3
    //   113: istore_1
    //   114: aload 6
    //   116: astore 7
    //   118: goto -91 -> 27
    //   121: astore 6
    //   123: ldc 116
    //   125: aload 6
    //   127: ldc_w 546
    //   130: iconst_0
    //   131: anewarray 4	java/lang/Object
    //   134: invokestatic 550	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   137: iload_1
    //   138: istore_3
    //   139: aload 7
    //   141: astore 6
    //   143: goto -35 -> 108
    //   146: aload 7
    //   148: astore 6
    //   150: new 541	java/io/BufferedReader
    //   153: dup
    //   154: new 552	java/io/FileReader
    //   157: dup
    //   158: aload 8
    //   160: invokespecial 555	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   163: invokespecial 558	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   166: astore 8
    //   168: aload 8
    //   170: invokevirtual 561	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   173: astore 6
    //   175: aload 6
    //   177: ifnull +111 -> 288
    //   180: aload 6
    //   182: aload_0
    //   183: invokevirtual 565	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   186: ifeq +102 -> 288
    //   189: aload 6
    //   191: invokevirtual 568	java/lang/String:length	()I
    //   194: aload_0
    //   195: invokevirtual 568	java/lang/String:length	()I
    //   198: if_icmpne +35 -> 233
    //   201: ldc 116
    //   203: ldc_w 570
    //   206: iconst_2
    //   207: anewarray 4	java/lang/Object
    //   210: dup
    //   211: iconst_0
    //   212: aload_0
    //   213: aastore
    //   214: dup
    //   215: iconst_1
    //   216: iload_1
    //   217: invokestatic 348	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   220: aastore
    //   221: invokestatic 426	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   224: aload 8
    //   226: invokevirtual 544	java/io/BufferedReader:close	()V
    //   229: iload_1
    //   230: istore_3
    //   231: iload_3
    //   232: ireturn
    //   233: aload 6
    //   235: aload_0
    //   236: invokevirtual 568	java/lang/String:length	()I
    //   239: invokevirtual 574	java/lang/String:charAt	(I)C
    //   242: istore_3
    //   243: iload_3
    //   244: bipush 32
    //   246: if_icmple +9 -> 255
    //   249: iload_3
    //   250: bipush 127
    //   252: if_icmplt +36 -> 288
    //   255: ldc 116
    //   257: ldc_w 570
    //   260: iconst_2
    //   261: anewarray 4	java/lang/Object
    //   264: dup
    //   265: iconst_0
    //   266: aload_0
    //   267: aastore
    //   268: dup
    //   269: iconst_1
    //   270: iload_1
    //   271: invokestatic 348	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   274: aastore
    //   275: invokestatic 426	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   278: aload 8
    //   280: invokevirtual 544	java/io/BufferedReader:close	()V
    //   283: iload_1
    //   284: ireturn
    //   285: astore_0
    //   286: iload_1
    //   287: ireturn
    //   288: aload 8
    //   290: invokevirtual 544	java/io/BufferedReader:close	()V
    //   293: aconst_null
    //   294: astore 6
    //   296: iload_1
    //   297: istore_3
    //   298: goto -190 -> 108
    //   301: astore 6
    //   303: aload 8
    //   305: astore 7
    //   307: aload 6
    //   309: astore 8
    //   311: aload 7
    //   313: astore 6
    //   315: ldc 116
    //   317: aload 8
    //   319: ldc_w 576
    //   322: iconst_0
    //   323: anewarray 4	java/lang/Object
    //   326: invokestatic 550	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   329: aload 7
    //   331: astore 6
    //   333: invokestatic 579	com/tencent/mm/sdk/platformtools/x:chR	()V
    //   336: iload_1
    //   337: istore_3
    //   338: aload 7
    //   340: astore 6
    //   342: aload 7
    //   344: ifnull -236 -> 108
    //   347: aload 7
    //   349: invokevirtual 544	java/io/BufferedReader:close	()V
    //   352: aconst_null
    //   353: astore 6
    //   355: iload_1
    //   356: istore_3
    //   357: goto -249 -> 108
    //   360: astore_0
    //   361: aload 8
    //   363: ifnull +8 -> 371
    //   366: aload 8
    //   368: invokevirtual 544	java/io/BufferedReader:close	()V
    //   371: aload_0
    //   372: athrow
    //   373: astore 6
    //   375: goto -272 -> 103
    //   378: astore_0
    //   379: iload_1
    //   380: ireturn
    //   381: astore 6
    //   383: goto -90 -> 293
    //   386: astore 6
    //   388: goto -36 -> 352
    //   391: astore 6
    //   393: goto -22 -> 371
    //   396: astore_0
    //   397: aload 6
    //   399: astore 8
    //   401: goto -40 -> 361
    //   404: astore 8
    //   406: goto -95 -> 311
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	409	0	paramString	String
    //   1	379	1	i	int
    //   23	89	2	j	int
    //   28	329	3	k	int
    //   20	13	4	m	int
    //   80	3	5	bool	boolean
    //   55	60	6	localObject1	Object
    //   121	5	6	localThrowable1	Throwable
    //   141	154	6	localObject2	Object
    //   301	7	6	localThrowable2	Throwable
    //   313	41	6	localObject3	Object
    //   373	1	6	localThrowable3	Throwable
    //   381	1	6	localThrowable4	Throwable
    //   386	1	6	localThrowable5	Throwable
    //   391	7	6	localThrowable6	Throwable
    //   25	323	7	localObject4	Object
    //   39	361	8	localObject5	Object
    //   404	1	8	localThrowable7	Throwable
    //   15	21	9	arrayOfFile	java.io.File[]
    // Exception table:
    //   from	to	target	type
    //   41	51	121	java/lang/Throwable
    //   278	283	285	java/lang/Throwable
    //   168	175	301	java/lang/Throwable
    //   180	224	301	java/lang/Throwable
    //   233	243	301	java/lang/Throwable
    //   255	278	301	java/lang/Throwable
    //   168	175	360	finally
    //   180	224	360	finally
    //   233	243	360	finally
    //   255	278	360	finally
    //   98	103	373	java/lang/Throwable
    //   224	229	378	java/lang/Throwable
    //   288	293	381	java/lang/Throwable
    //   347	352	386	java/lang/Throwable
    //   366	371	391	java/lang/Throwable
    //   57	71	396	finally
    //   75	82	396	finally
    //   150	168	396	finally
    //   315	329	396	finally
    //   333	336	396	finally
    //   57	71	404	java/lang/Throwable
    //   75	82	404	java/lang/Throwable
    //   150	168	404	java/lang/Throwable
  }
  
  /* Error */
  public final void aU(android.content.Context arg1)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: ldc_w 584
    //   5: invokestatic 114	com/tencent/mm/blink/a:ey	(Ljava/lang/String;)V
    //   8: aload_0
    //   9: getfield 32	com/tencent/mm/app/e:byf	Ljava/util/concurrent/locks/ReentrantLock;
    //   12: invokevirtual 46	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   15: iload_3
    //   16: istore_2
    //   17: aload_0
    //   18: getfield 36	com/tencent/mm/app/e:byh	Landroid/os/IBinder;
    //   21: ifnull +19 -> 40
    //   24: iload_3
    //   25: istore_2
    //   26: aload_0
    //   27: getfield 36	com/tencent/mm/app/e:byh	Landroid/os/IBinder;
    //   30: invokeinterface 589 1 0
    //   35: ifeq +5 -> 40
    //   38: iconst_1
    //   39: istore_2
    //   40: ldc 116
    //   42: ldc_w 591
    //   45: iconst_2
    //   46: anewarray 4	java/lang/Object
    //   49: dup
    //   50: iconst_0
    //   51: aload_0
    //   52: getfield 34	com/tencent/mm/app/e:byg	Z
    //   55: invokestatic 387	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   58: aastore
    //   59: dup
    //   60: iconst_1
    //   61: iload_2
    //   62: invokestatic 387	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   65: aastore
    //   66: invokestatic 426	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   69: aload_0
    //   70: getfield 34	com/tencent/mm/app/e:byg	Z
    //   73: ifne +7 -> 80
    //   76: iload_2
    //   77: ifeq +40 -> 117
    //   80: ldc 116
    //   82: ldc_w 593
    //   85: iconst_2
    //   86: anewarray 4	java/lang/Object
    //   89: dup
    //   90: iconst_0
    //   91: aload_0
    //   92: getfield 34	com/tencent/mm/app/e:byg	Z
    //   95: invokestatic 387	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   98: aastore
    //   99: dup
    //   100: iconst_1
    //   101: iload_2
    //   102: invokestatic 387	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   105: aastore
    //   106: invokestatic 389	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   109: aload_0
    //   110: getfield 32	com/tencent/mm/app/e:byf	Ljava/util/concurrent/locks/ReentrantLock;
    //   113: invokevirtual 49	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   116: return
    //   117: aload_0
    //   118: getfield 32	com/tencent/mm/app/e:byf	Ljava/util/concurrent/locks/ReentrantLock;
    //   121: invokevirtual 49	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   124: aload_1
    //   125: ldc_w 595
    //   128: invokestatic 601	com/tencent/mm/booter/b:v	(Landroid/content/Context;Ljava/lang/String;)Z
    //   131: ifne +22 -> 153
    //   134: ldc 116
    //   136: ldc_w 603
    //   139: invokestatic 124	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   142: return
    //   143: astore_1
    //   144: aload_0
    //   145: getfield 32	com/tencent/mm/app/e:byf	Ljava/util/concurrent/locks/ReentrantLock;
    //   148: invokevirtual 49	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   151: aload_1
    //   152: athrow
    //   153: new 605	android/content/Intent
    //   156: dup
    //   157: aload_1
    //   158: ldc_w 607
    //   161: invokespecial 610	android/content/Intent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   164: astore 4
    //   166: ldc 116
    //   168: ldc_w 612
    //   171: invokestatic 124	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   174: aload_1
    //   175: aload 4
    //   177: aload_0
    //   178: iconst_1
    //   179: invokevirtual 618	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   182: ifne +12 -> 194
    //   185: ldc 116
    //   187: ldc_w 620
    //   190: invokestatic 268	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   193: return
    //   194: aload_0
    //   195: getfield 32	com/tencent/mm/app/e:byf	Ljava/util/concurrent/locks/ReentrantLock;
    //   198: invokevirtual 46	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   201: aload_0
    //   202: iconst_1
    //   203: putfield 34	com/tencent/mm/app/e:byg	Z
    //   206: aload_0
    //   207: getfield 32	com/tencent/mm/app/e:byf	Ljava/util/concurrent/locks/ReentrantLock;
    //   210: invokevirtual 49	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   213: getstatic 26	com/tencent/mm/app/e:lock	Ljava/lang/Object;
    //   216: astore_1
    //   217: aload_1
    //   218: monitorenter
    //   219: getstatic 21	com/tencent/mm/app/e:bye	Z
    //   222: ifne +25 -> 247
    //   225: iconst_1
    //   226: putstatic 21	com/tencent/mm/app/e:bye	Z
    //   229: ldc 116
    //   231: ldc_w 622
    //   234: invokestatic 124	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   237: aload_0
    //   238: getfield 43	com/tencent/mm/app/e:byi	Ljava/lang/Runnable;
    //   241: ldc2_w 623
    //   244: invokestatic 627	com/tencent/mm/sdk/platformtools/ah:i	(Ljava/lang/Runnable;J)V
    //   247: aload_1
    //   248: monitorexit
    //   249: return
    //   250: astore 4
    //   252: aload_1
    //   253: monitorexit
    //   254: aload 4
    //   256: athrow
    //   257: astore_1
    //   258: aload_0
    //   259: getfield 32	com/tencent/mm/app/e:byf	Ljava/util/concurrent/locks/ReentrantLock;
    //   262: invokevirtual 49	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   265: aload_1
    //   266: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	267	0	this	e
    //   16	86	2	bool1	boolean
    //   1	24	3	bool2	boolean
    //   164	12	4	localIntent	android.content.Intent
    //   250	5	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   8	15	143	finally
    //   17	24	143	finally
    //   26	38	143	finally
    //   40	76	143	finally
    //   80	109	143	finally
    //   219	247	250	finally
    //   247	249	250	finally
    //   252	254	250	finally
    //   194	206	257	finally
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    x.w("MicroMsg.CoreServiceConnection", "onServiceConnected ");
    b.xi().g(new e.1(this, paramComponentName, paramIBinder));
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    x.w("MicroMsg.CoreServiceConnection", "onServiceDisconnected ");
    b.xi().g(new e.4(this, paramComponentName));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/app/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */