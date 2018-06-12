package com.tencent.tencentmap.mapsdk.a;

import java.io.FileWriter;

public class fx
{
  private static volatile boolean a = false;
  private static volatile boolean b = false;
  private static volatile boolean c = false;
  private static FileWriter d = null;
  
  public static void a(String paramString1, String paramString2)
  {
    boolean bool = a;
    if (b) {
      a("D", "Hally-" + paramString1, paramString2, null);
    }
  }
  
  /* Error */
  private static void a(String paramString1, String paramString2, String paramString3, Throwable paramThrowable)
  {
    // Byte code:
    //   0: invokestatic 54	com/tencent/tencentmap/mapsdk/a/em:a	()Landroid/content/Context;
    //   3: ifnonnull +4 -> 7
    //   6: return
    //   7: new 29	java/lang/StringBuilder
    //   10: dup
    //   11: new 29	java/lang/StringBuilder
    //   14: dup
    //   15: invokespecial 55	java/lang/StringBuilder:<init>	()V
    //   18: aload_0
    //   19: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   22: ldc 57
    //   24: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: invokevirtual 42	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   30: invokespecial 34	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   33: astore_0
    //   34: aload_0
    //   35: new 29	java/lang/StringBuilder
    //   38: dup
    //   39: invokespecial 55	java/lang/StringBuilder:<init>	()V
    //   42: new 59	java/text/SimpleDateFormat
    //   45: dup
    //   46: ldc 61
    //   48: getstatic 67	java/util/Locale:US	Ljava/util/Locale;
    //   51: invokespecial 70	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;Ljava/util/Locale;)V
    //   54: new 72	java/util/Date
    //   57: dup
    //   58: invokestatic 78	java/lang/System:currentTimeMillis	()J
    //   61: invokespecial 81	java/util/Date:<init>	(J)V
    //   64: invokevirtual 85	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   67: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: ldc 57
    //   72: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: invokevirtual 42	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   78: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: pop
    //   82: aload_0
    //   83: new 29	java/lang/StringBuilder
    //   86: dup
    //   87: invokespecial 55	java/lang/StringBuilder:<init>	()V
    //   90: aload_1
    //   91: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: ldc 57
    //   96: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: invokevirtual 42	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   102: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: pop
    //   106: aload_2
    //   107: ifnull +29 -> 136
    //   110: aload_0
    //   111: new 29	java/lang/StringBuilder
    //   114: dup
    //   115: ldc 87
    //   117: invokespecial 34	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   120: aload_2
    //   121: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: ldc 57
    //   126: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: invokevirtual 42	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   132: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   135: pop
    //   136: aload_3
    //   137: ifnull +27 -> 164
    //   140: aload_0
    //   141: new 29	java/lang/StringBuilder
    //   144: dup
    //   145: ldc 89
    //   147: invokespecial 34	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   150: aload_3
    //   151: invokestatic 95	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   154: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: invokevirtual 42	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   160: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: pop
    //   164: aload_0
    //   165: ldc 97
    //   167: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   170: pop
    //   171: ldc 2
    //   173: monitorenter
    //   174: getstatic 20	com/tencent/tencentmap/mapsdk/a/fx:d	Ljava/io/FileWriter;
    //   177: astore_1
    //   178: aload_1
    //   179: ifnull +19 -> 198
    //   182: getstatic 20	com/tencent/tencentmap/mapsdk/a/fx:d	Ljava/io/FileWriter;
    //   185: aload_0
    //   186: invokevirtual 42	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   189: invokevirtual 102	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   192: getstatic 20	com/tencent/tencentmap/mapsdk/a/fx:d	Ljava/io/FileWriter;
    //   195: invokevirtual 105	java/io/FileWriter:flush	()V
    //   198: getstatic 20	com/tencent/tencentmap/mapsdk/a/fx:d	Ljava/io/FileWriter;
    //   201: ifnonnull +161 -> 362
    //   204: new 59	java/text/SimpleDateFormat
    //   207: dup
    //   208: ldc 107
    //   210: getstatic 67	java/util/Locale:US	Ljava/util/Locale;
    //   213: invokespecial 70	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;Ljava/util/Locale;)V
    //   216: new 72	java/util/Date
    //   219: dup
    //   220: invokestatic 78	java/lang/System:currentTimeMillis	()J
    //   223: invokespecial 81	java/util/Date:<init>	(J)V
    //   226: invokevirtual 85	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   229: astore_1
    //   230: new 29	java/lang/StringBuilder
    //   233: dup
    //   234: ldc 109
    //   236: invokespecial 34	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   239: aload_1
    //   240: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   243: invokevirtual 42	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   246: astore_1
    //   247: invokestatic 114	com/tencent/tencentmap/mapsdk/a/fz:a	()Z
    //   250: ifeq +112 -> 362
    //   253: new 29	java/lang/StringBuilder
    //   256: dup
    //   257: invokespecial 55	java/lang/StringBuilder:<init>	()V
    //   260: invokestatic 116	com/tencent/tencentmap/mapsdk/a/fz:b	()Ljava/lang/String;
    //   263: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   266: ldc 118
    //   268: invokevirtual 38	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   271: invokevirtual 42	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   274: astore_2
    //   275: new 120	java/io/File
    //   278: dup
    //   279: aload_2
    //   280: invokespecial 121	java/io/File:<init>	(Ljava/lang/String;)V
    //   283: astore_3
    //   284: aload_3
    //   285: invokevirtual 124	java/io/File:exists	()Z
    //   288: ifne +8 -> 296
    //   291: aload_3
    //   292: invokevirtual 127	java/io/File:mkdirs	()Z
    //   295: pop
    //   296: new 120	java/io/File
    //   299: dup
    //   300: aload_2
    //   301: aload_1
    //   302: invokespecial 129	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   305: astore_1
    //   306: aload_1
    //   307: invokevirtual 132	java/io/File:isDirectory	()Z
    //   310: ifeq +8 -> 318
    //   313: aload_1
    //   314: invokevirtual 135	java/io/File:delete	()Z
    //   317: pop
    //   318: aload_1
    //   319: invokevirtual 124	java/io/File:exists	()Z
    //   322: istore 4
    //   324: iload 4
    //   326: ifne +8 -> 334
    //   329: aload_1
    //   330: invokevirtual 138	java/io/File:createNewFile	()Z
    //   333: pop
    //   334: new 99	java/io/FileWriter
    //   337: dup
    //   338: aload_1
    //   339: iconst_1
    //   340: invokespecial 141	java/io/FileWriter:<init>	(Ljava/io/File;Z)V
    //   343: astore_1
    //   344: aload_1
    //   345: putstatic 20	com/tencent/tencentmap/mapsdk/a/fx:d	Ljava/io/FileWriter;
    //   348: aload_1
    //   349: aload_0
    //   350: invokevirtual 42	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   353: invokevirtual 102	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   356: getstatic 20	com/tencent/tencentmap/mapsdk/a/fx:d	Ljava/io/FileWriter;
    //   359: invokevirtual 105	java/io/FileWriter:flush	()V
    //   362: ldc 2
    //   364: monitorexit
    //   365: return
    //   366: astore_0
    //   367: ldc 2
    //   369: monitorexit
    //   370: aload_0
    //   371: athrow
    //   372: astore_1
    //   373: getstatic 20	com/tencent/tencentmap/mapsdk/a/fx:d	Ljava/io/FileWriter;
    //   376: invokevirtual 144	java/io/FileWriter:close	()V
    //   379: aconst_null
    //   380: putstatic 20	com/tencent/tencentmap/mapsdk/a/fx:d	Ljava/io/FileWriter;
    //   383: goto -185 -> 198
    //   386: astore_0
    //   387: getstatic 20	com/tencent/tencentmap/mapsdk/a/fx:d	Ljava/io/FileWriter;
    //   390: astore_0
    //   391: aload_0
    //   392: ifnull +13 -> 405
    //   395: getstatic 20	com/tencent/tencentmap/mapsdk/a/fx:d	Ljava/io/FileWriter;
    //   398: invokevirtual 144	java/io/FileWriter:close	()V
    //   401: aconst_null
    //   402: putstatic 20	com/tencent/tencentmap/mapsdk/a/fx:d	Ljava/io/FileWriter;
    //   405: ldc 2
    //   407: monitorexit
    //   408: return
    //   409: astore_0
    //   410: getstatic 20	com/tencent/tencentmap/mapsdk/a/fx:d	Ljava/io/FileWriter;
    //   413: astore_0
    //   414: aload_0
    //   415: ifnull -53 -> 362
    //   418: getstatic 20	com/tencent/tencentmap/mapsdk/a/fx:d	Ljava/io/FileWriter;
    //   421: invokevirtual 144	java/io/FileWriter:close	()V
    //   424: aconst_null
    //   425: putstatic 20	com/tencent/tencentmap/mapsdk/a/fx:d	Ljava/io/FileWriter;
    //   428: goto -66 -> 362
    //   431: astore_0
    //   432: goto -8 -> 424
    //   435: astore_0
    //   436: goto -35 -> 401
    //   439: astore_1
    //   440: goto -61 -> 379
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	443	0	paramString1	String
    //   0	443	1	paramString2	String
    //   0	443	2	paramString3	String
    //   0	443	3	paramThrowable	Throwable
    //   322	3	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   174	178	366	finally
    //   182	198	366	finally
    //   198	296	366	finally
    //   296	318	366	finally
    //   318	324	366	finally
    //   329	334	366	finally
    //   334	362	366	finally
    //   362	365	366	finally
    //   373	379	366	finally
    //   379	383	366	finally
    //   387	391	366	finally
    //   395	401	366	finally
    //   401	405	366	finally
    //   405	408	366	finally
    //   410	414	366	finally
    //   418	424	366	finally
    //   424	428	366	finally
    //   182	198	372	java/io/IOException
    //   329	334	386	java/io/IOException
    //   334	362	409	java/io/IOException
    //   418	424	431	java/lang/Exception
    //   395	401	435	java/lang/Exception
    //   373	379	439	java/io/IOException
  }
  
  public static void a(String paramString1, String paramString2, Throwable paramThrowable)
  {
    boolean bool = a;
    if (b) {
      a("W", "Hally-" + paramString1, paramString2, paramThrowable);
    }
  }
  
  public static void a(boolean paramBoolean)
  {
    a = paramBoolean;
    b = paramBoolean;
  }
  
  public static void b(String paramString1, String paramString2)
  {
    boolean bool = a;
    if (b) {
      a("I", "Hally-" + paramString1, paramString2, null);
    }
  }
  
  public static void b(boolean paramBoolean)
  {
    c = paramBoolean;
  }
  
  public static void c(String paramString1, String paramString2)
  {
    boolean bool = a;
    if (b) {
      a("W", "Hally-" + paramString1, paramString2, null);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/fx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */