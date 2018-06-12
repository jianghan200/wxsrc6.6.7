package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.mm.g.a.bc;
import com.tencent.mm.pluginsdk.g.a.a.b.c;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.x;

public final class b
{
  private static String kPy = null;
  private static c<bc> kPz = new b.1();
  
  public static void Wa()
  {
    x.i("MicroMsg.LuckMoneyEffectResourceMgr", "unInit");
    a.sFg.c(kPz);
  }
  
  /* Error */
  private static boolean dB(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 118	java/io/File
    //   5: dup
    //   6: aload_1
    //   7: invokespecial 121	java/io/File:<init>	(Ljava/lang/String;)V
    //   10: astore 7
    //   12: aload 7
    //   14: invokevirtual 125	java/io/File:mkdirs	()Z
    //   17: pop
    //   18: new 127	java/util/zip/ZipFile
    //   21: dup
    //   22: new 118	java/io/File
    //   25: dup
    //   26: aload_0
    //   27: invokespecial 121	java/io/File:<init>	(Ljava/lang/String;)V
    //   30: iconst_1
    //   31: invokespecial 130	java/util/zip/ZipFile:<init>	(Ljava/io/File;I)V
    //   34: astore 8
    //   36: aload 8
    //   38: invokevirtual 134	java/util/zip/ZipFile:entries	()Ljava/util/Enumeration;
    //   41: astore 9
    //   43: aconst_null
    //   44: astore_0
    //   45: aload 9
    //   47: invokeinterface 139 1 0
    //   52: ifeq +247 -> 299
    //   55: aload 9
    //   57: invokeinterface 143 1 0
    //   62: checkcast 145	java/util/zip/ZipEntry
    //   65: astore_1
    //   66: ldc 25
    //   68: ldc -109
    //   70: iconst_1
    //   71: anewarray 4	java/lang/Object
    //   74: dup
    //   75: iconst_0
    //   76: aload_1
    //   77: invokevirtual 150	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   80: aastore
    //   81: invokestatic 39	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   84: aload_1
    //   85: invokevirtual 150	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   88: ldc -104
    //   90: invokevirtual 158	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   93: ifne -48 -> 45
    //   96: aload_1
    //   97: invokevirtual 150	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   100: ldc -96
    //   102: invokevirtual 158	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   105: ifne -60 -> 45
    //   108: new 118	java/io/File
    //   111: dup
    //   112: aload 7
    //   114: aload_1
    //   115: invokevirtual 150	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   118: invokespecial 163	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   121: astore_3
    //   122: aload_3
    //   123: invokevirtual 167	java/io/File:getParentFile	()Ljava/io/File;
    //   126: invokevirtual 125	java/io/File:mkdirs	()Z
    //   129: pop
    //   130: aload_1
    //   131: invokevirtual 170	java/util/zip/ZipEntry:isDirectory	()Z
    //   134: ifne -89 -> 45
    //   137: new 172	java/io/BufferedInputStream
    //   140: dup
    //   141: aload 8
    //   143: aload_1
    //   144: invokevirtual 176	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   147: invokespecial 179	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   150: astore_1
    //   151: sipush 4096
    //   154: newarray <illegal type>
    //   156: astore 6
    //   158: new 181	java/io/FileOutputStream
    //   161: dup
    //   162: aload_3
    //   163: invokespecial 184	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   166: astore_3
    //   167: new 186	java/io/BufferedOutputStream
    //   170: dup
    //   171: aload_3
    //   172: sipush 4096
    //   175: invokespecial 189	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;I)V
    //   178: astore_0
    //   179: aload_0
    //   180: astore 5
    //   182: aload_3
    //   183: astore 4
    //   185: aload_1
    //   186: aload 6
    //   188: iconst_0
    //   189: sipush 4096
    //   192: invokevirtual 193	java/io/BufferedInputStream:read	([BII)I
    //   195: istore_2
    //   196: iload_2
    //   197: iconst_m1
    //   198: if_icmpeq +54 -> 252
    //   201: aload_0
    //   202: astore 5
    //   204: aload_3
    //   205: astore 4
    //   207: aload_0
    //   208: aload 6
    //   210: iconst_0
    //   211: iload_2
    //   212: invokevirtual 197	java/io/BufferedOutputStream:write	([BII)V
    //   215: goto -36 -> 179
    //   218: astore 6
    //   220: aload_0
    //   221: astore 5
    //   223: aload_3
    //   224: astore 4
    //   226: ldc 25
    //   228: aload 6
    //   230: ldc -57
    //   232: iconst_0
    //   233: anewarray 4	java/lang/Object
    //   236: invokestatic 100	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   239: aload_3
    //   240: invokestatic 205	com/tencent/mm/a/e:closeOutputStream	(Ljava/io/OutputStream;)V
    //   243: aload_0
    //   244: invokestatic 205	com/tencent/mm/a/e:closeOutputStream	(Ljava/io/OutputStream;)V
    //   247: aload_1
    //   248: astore_0
    //   249: goto -204 -> 45
    //   252: aload_3
    //   253: invokestatic 205	com/tencent/mm/a/e:closeOutputStream	(Ljava/io/OutputStream;)V
    //   256: aload_0
    //   257: invokestatic 205	com/tencent/mm/a/e:closeOutputStream	(Ljava/io/OutputStream;)V
    //   260: aload_1
    //   261: astore_0
    //   262: goto -217 -> 45
    //   265: aload_3
    //   266: invokestatic 205	com/tencent/mm/a/e:closeOutputStream	(Ljava/io/OutputStream;)V
    //   269: aload 5
    //   271: invokestatic 205	com/tencent/mm/a/e:closeOutputStream	(Ljava/io/OutputStream;)V
    //   274: aload_0
    //   275: athrow
    //   276: astore_3
    //   277: aload_1
    //   278: astore_0
    //   279: aload_3
    //   280: astore_1
    //   281: ldc 25
    //   283: aload_1
    //   284: ldc -57
    //   286: iconst_0
    //   287: anewarray 4	java/lang/Object
    //   290: invokestatic 100	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   293: aload_0
    //   294: invokestatic 209	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   297: iconst_0
    //   298: ireturn
    //   299: aload_0
    //   300: invokestatic 209	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   303: iconst_1
    //   304: ireturn
    //   305: astore_1
    //   306: aconst_null
    //   307: astore_0
    //   308: aload_0
    //   309: invokestatic 209	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   312: aload_1
    //   313: athrow
    //   314: astore_3
    //   315: aload_1
    //   316: astore_0
    //   317: aload_3
    //   318: astore_1
    //   319: goto -11 -> 308
    //   322: astore_1
    //   323: goto -15 -> 308
    //   326: astore_1
    //   327: goto -19 -> 308
    //   330: astore_1
    //   331: aload_3
    //   332: astore_0
    //   333: goto -52 -> 281
    //   336: astore_1
    //   337: goto -56 -> 281
    //   340: astore_0
    //   341: aconst_null
    //   342: astore 5
    //   344: goto -79 -> 265
    //   347: astore_0
    //   348: aload 4
    //   350: astore_3
    //   351: goto -86 -> 265
    //   354: astore 6
    //   356: aconst_null
    //   357: astore_0
    //   358: aconst_null
    //   359: astore_3
    //   360: goto -140 -> 220
    //   363: astore 6
    //   365: aconst_null
    //   366: astore_0
    //   367: goto -147 -> 220
    //   370: astore_0
    //   371: aconst_null
    //   372: astore 5
    //   374: aconst_null
    //   375: astore_3
    //   376: goto -111 -> 265
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	379	0	paramString1	String
    //   0	379	1	paramString2	String
    //   195	17	2	i	int
    //   1	265	3	localObject1	Object
    //   276	4	3	localException1	Exception
    //   314	18	3	localObject2	Object
    //   350	26	3	localObject3	Object
    //   183	166	4	localObject4	Object
    //   180	193	5	str	String
    //   156	53	6	arrayOfByte	byte[]
    //   218	11	6	localException2	Exception
    //   354	1	6	localException3	Exception
    //   363	1	6	localException4	Exception
    //   10	103	7	localFile	java.io.File
    //   34	108	8	localZipFile	java.util.zip.ZipFile
    //   41	15	9	localEnumeration	java.util.Enumeration
    // Exception table:
    //   from	to	target	type
    //   185	196	218	java/lang/Exception
    //   207	215	218	java/lang/Exception
    //   151	158	276	java/lang/Exception
    //   239	247	276	java/lang/Exception
    //   252	260	276	java/lang/Exception
    //   265	276	276	java/lang/Exception
    //   2	43	305	finally
    //   151	158	314	finally
    //   239	247	314	finally
    //   252	260	314	finally
    //   265	276	314	finally
    //   45	151	322	finally
    //   281	293	326	finally
    //   2	43	330	java/lang/Exception
    //   45	151	336	java/lang/Exception
    //   167	179	340	finally
    //   185	196	347	finally
    //   207	215	347	finally
    //   226	239	347	finally
    //   158	167	354	java/lang/Exception
    //   167	179	363	java/lang/Exception
    //   158	167	370	finally
  }
  
  public static void init()
  {
    x.i("MicroMsg.LuckMoneyEffectResourceMgr", "init");
    if (kPy == null) {
      kPy = com.tencent.mm.loader.stub.b.bnE + "wallet/luckyMoneyEffect/";
    }
    b.c.ccr();
    com.tencent.mm.pluginsdk.g.a.a.b.BK(53);
    a.sFg.a(kPz);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */