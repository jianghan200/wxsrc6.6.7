package com.tencent.mm.ar;

import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.sdk.b.c;
import java.util.HashMap;
import java.util.Map;

public class r
  implements ar
{
  private static HashMap<Integer, h.d> cVM;
  private n ecW;
  private b ecX;
  private o ecY = new o();
  private p ecZ = new p();
  private q eda = new q();
  private l edb = null;
  c edc = new r.3(this);
  
  static
  {
    HashMap localHashMap = new HashMap();
    cVM = localHashMap;
    localHashMap.put(Integer.valueOf("PACKAGE_INFO_TABLE".hashCode()), new r.1());
    cVM.put(Integer.valueOf("CHATTINGBGINFO_TABLE".hashCode()), new r.2());
  }
  
  private static r Qo()
  {
    return (r)com.tencent.mm.model.p.v(r.class);
  }
  
  public static n Qp()
  {
    g.Eg().Ds();
    if (Qo().ecW == null) {
      Qo().ecW = new n(g.Ei().dqq);
    }
    return Qo().ecW;
  }
  
  public static b Qq()
  {
    g.Eg().Ds();
    if (Qo().ecX == null) {
      Qo().ecX = new b(g.Ei().dqq);
    }
    return Qo().ecX;
  }
  
  /* Error */
  private boolean mx(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: new 143	java/io/File
    //   6: dup
    //   7: aload_1
    //   8: invokespecial 146	java/io/File:<init>	(Ljava/lang/String;)V
    //   11: astore 8
    //   13: aload 8
    //   15: invokevirtual 150	java/io/File:exists	()Z
    //   18: ifne +26 -> 44
    //   21: ldc -104
    //   23: new 154	java/lang/StringBuilder
    //   26: dup
    //   27: ldc -100
    //   29: invokespecial 157	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   32: aload_1
    //   33: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: invokevirtual 165	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   39: invokestatic 171	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   42: iconst_0
    //   43: ireturn
    //   44: new 27	java/util/HashMap
    //   47: dup
    //   48: invokespecial 30	java/util/HashMap:<init>	()V
    //   51: astore 7
    //   53: new 173	java/io/FileInputStream
    //   56: dup
    //   57: aload 8
    //   59: invokespecial 176	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   62: astore 4
    //   64: new 178	java/io/InputStreamReader
    //   67: dup
    //   68: aload 4
    //   70: ldc -76
    //   72: invokespecial 183	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   75: astore 9
    //   77: new 185	java/io/BufferedReader
    //   80: dup
    //   81: aload 9
    //   83: invokespecial 188	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   86: astore 10
    //   88: aload 5
    //   90: astore_1
    //   91: aload 10
    //   93: invokevirtual 191	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   96: astore 5
    //   98: aload 5
    //   100: ifnull +404 -> 504
    //   103: aload 5
    //   105: invokevirtual 194	java/lang/String:trim	()Ljava/lang/String;
    //   108: ldc -60
    //   110: invokevirtual 200	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   113: astore 11
    //   115: aload 11
    //   117: arraylength
    //   118: iconst_2
    //   119: if_icmplt +23 -> 142
    //   122: aload 11
    //   124: iconst_0
    //   125: aaload
    //   126: invokestatic 205	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   129: ifne +13 -> 142
    //   132: aload 11
    //   134: iconst_1
    //   135: aaload
    //   136: invokestatic 205	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   139: ifeq +119 -> 258
    //   142: ldc -104
    //   144: new 154	java/lang/StringBuilder
    //   147: dup
    //   148: ldc -49
    //   150: invokespecial 157	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   153: aload 5
    //   155: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   158: invokevirtual 165	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   161: invokestatic 171	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   164: goto -73 -> 91
    //   167: astore 5
    //   169: aload 4
    //   171: astore_1
    //   172: aload 5
    //   174: astore 4
    //   176: ldc -104
    //   178: aload 4
    //   180: ldc -47
    //   182: iconst_0
    //   183: anewarray 4	java/lang/Object
    //   186: invokestatic 213	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   189: aload_1
    //   190: ifnull +7 -> 197
    //   193: aload_1
    //   194: invokevirtual 218	java/io/InputStream:close	()V
    //   197: aload 7
    //   199: invokeinterface 224 1 0
    //   204: invokeinterface 230 1 0
    //   209: astore_1
    //   210: aload_1
    //   211: invokeinterface 235 1 0
    //   216: ifeq +40 -> 256
    //   219: aload_1
    //   220: invokeinterface 239 1 0
    //   225: checkcast 241	java/io/BufferedWriter
    //   228: astore 4
    //   230: aload 4
    //   232: ifnull -22 -> 210
    //   235: aload 4
    //   237: invokevirtual 242	java/io/BufferedWriter:close	()V
    //   240: goto -30 -> 210
    //   243: astore_1
    //   244: ldc -104
    //   246: aload_1
    //   247: ldc -47
    //   249: iconst_0
    //   250: anewarray 4	java/lang/Object
    //   253: invokestatic 213	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   256: iconst_0
    //   257: ireturn
    //   258: aload 7
    //   260: aload 11
    //   262: iconst_0
    //   263: aaload
    //   264: invokeinterface 246 2 0
    //   269: checkcast 241	java/io/BufferedWriter
    //   272: astore 6
    //   274: aload 6
    //   276: astore 5
    //   278: aload 6
    //   280: ifnonnull +166 -> 446
    //   283: invokestatic 252	com/tencent/mm/storage/RegionCodeDecoder:cmS	()Lcom/tencent/mm/storage/RegionCodeDecoder;
    //   286: pop
    //   287: aload 11
    //   289: iconst_0
    //   290: aaload
    //   291: invokestatic 256	com/tencent/mm/storage/RegionCodeDecoder:Zg	(Ljava/lang/String;)Ljava/lang/String;
    //   294: astore_1
    //   295: aload_1
    //   296: invokestatic 205	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   299: ifeq +91 -> 390
    //   302: ldc -104
    //   304: ldc_w 258
    //   307: invokestatic 171	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   310: goto -219 -> 91
    //   313: astore_1
    //   314: aload 4
    //   316: ifnull +8 -> 324
    //   319: aload 4
    //   321: invokevirtual 218	java/io/InputStream:close	()V
    //   324: aload 7
    //   326: invokeinterface 224 1 0
    //   331: invokeinterface 230 1 0
    //   336: astore 4
    //   338: aload 4
    //   340: invokeinterface 235 1 0
    //   345: ifeq +43 -> 388
    //   348: aload 4
    //   350: invokeinterface 239 1 0
    //   355: checkcast 241	java/io/BufferedWriter
    //   358: astore 5
    //   360: aload 5
    //   362: ifnull -24 -> 338
    //   365: aload 5
    //   367: invokevirtual 242	java/io/BufferedWriter:close	()V
    //   370: goto -32 -> 338
    //   373: astore 4
    //   375: ldc -104
    //   377: aload 4
    //   379: ldc -47
    //   381: iconst_0
    //   382: anewarray 4	java/lang/Object
    //   385: invokestatic 213	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   388: aload_1
    //   389: athrow
    //   390: new 143	java/io/File
    //   393: dup
    //   394: aload_1
    //   395: invokespecial 146	java/io/File:<init>	(Ljava/lang/String;)V
    //   398: astore 5
    //   400: aload 5
    //   402: invokevirtual 150	java/io/File:exists	()Z
    //   405: ifne +9 -> 414
    //   408: aload 5
    //   410: invokevirtual 261	java/io/File:createNewFile	()Z
    //   413: pop
    //   414: new 241	java/io/BufferedWriter
    //   417: dup
    //   418: new 263	java/io/FileWriter
    //   421: dup
    //   422: aload 5
    //   424: invokespecial 264	java/io/FileWriter:<init>	(Ljava/io/File;)V
    //   427: invokespecial 267	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   430: astore 5
    //   432: aload 7
    //   434: aload 11
    //   436: iconst_0
    //   437: aaload
    //   438: aload 5
    //   440: invokeinterface 268 3 0
    //   445: pop
    //   446: new 270	java/lang/StringBuffer
    //   449: dup
    //   450: invokespecial 271	java/lang/StringBuffer:<init>	()V
    //   453: astore 6
    //   455: aload 6
    //   457: aload 11
    //   459: iconst_1
    //   460: aaload
    //   461: invokevirtual 274	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   464: pop
    //   465: aload 6
    //   467: bipush 124
    //   469: invokevirtual 277	java/lang/StringBuffer:append	(C)Ljava/lang/StringBuffer;
    //   472: pop
    //   473: aload 6
    //   475: aload 11
    //   477: iconst_2
    //   478: aaload
    //   479: invokevirtual 274	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   482: pop
    //   483: aload 6
    //   485: bipush 10
    //   487: invokevirtual 277	java/lang/StringBuffer:append	(C)Ljava/lang/StringBuffer;
    //   490: pop
    //   491: aload 5
    //   493: aload 6
    //   495: invokevirtual 278	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   498: invokevirtual 281	java/io/BufferedWriter:write	(Ljava/lang/String;)V
    //   501: goto -410 -> 91
    //   504: aload 7
    //   506: invokeinterface 224 1 0
    //   511: invokeinterface 230 1 0
    //   516: astore 5
    //   518: aload 5
    //   520: invokeinterface 235 1 0
    //   525: ifeq +28 -> 553
    //   528: aload 5
    //   530: invokeinterface 239 1 0
    //   535: checkcast 241	java/io/BufferedWriter
    //   538: astore 6
    //   540: aload 6
    //   542: ifnull -24 -> 518
    //   545: aload 6
    //   547: invokevirtual 284	java/io/BufferedWriter:flush	()V
    //   550: goto -32 -> 518
    //   553: aload_1
    //   554: invokestatic 205	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   557: ifne +68 -> 625
    //   560: new 143	java/io/File
    //   563: dup
    //   564: aload_1
    //   565: invokespecial 146	java/io/File:<init>	(Ljava/lang/String;)V
    //   568: invokevirtual 288	java/io/File:getParentFile	()Ljava/io/File;
    //   571: new 290	com/tencent/mm/ar/r$4
    //   574: dup
    //   575: aload_0
    //   576: invokespecial 291	com/tencent/mm/ar/r$4:<init>	(Lcom/tencent/mm/ar/r;)V
    //   579: invokevirtual 295	java/io/File:listFiles	(Ljava/io/FileFilter;)[Ljava/io/File;
    //   582: astore_1
    //   583: aload_1
    //   584: arraylength
    //   585: istore_3
    //   586: iconst_0
    //   587: istore_2
    //   588: iload_2
    //   589: iload_3
    //   590: if_icmpge +29 -> 619
    //   593: aload_1
    //   594: iload_2
    //   595: aaload
    //   596: astore 5
    //   598: invokestatic 252	com/tencent/mm/storage/RegionCodeDecoder:cmS	()Lcom/tencent/mm/storage/RegionCodeDecoder;
    //   601: pop
    //   602: aload 5
    //   604: aload 5
    //   606: invokevirtual 288	java/io/File:getParentFile	()Ljava/io/File;
    //   609: invokestatic 299	com/tencent/mm/storage/RegionCodeDecoder:h	(Ljava/io/File;Ljava/io/File;)V
    //   612: iload_2
    //   613: iconst_1
    //   614: iadd
    //   615: istore_2
    //   616: goto -28 -> 588
    //   619: invokestatic 252	com/tencent/mm/storage/RegionCodeDecoder:cmS	()Lcom/tencent/mm/storage/RegionCodeDecoder;
    //   622: invokevirtual 302	com/tencent/mm/storage/RegionCodeDecoder:ckJ	()V
    //   625: aload 10
    //   627: invokevirtual 303	java/io/BufferedReader:close	()V
    //   630: aload 9
    //   632: invokevirtual 304	java/io/InputStreamReader:close	()V
    //   635: aload 8
    //   637: invokevirtual 307	java/io/File:delete	()Z
    //   640: pop
    //   641: aload 4
    //   643: invokevirtual 218	java/io/InputStream:close	()V
    //   646: aload 7
    //   648: invokeinterface 224 1 0
    //   653: invokeinterface 230 1 0
    //   658: astore_1
    //   659: aload_1
    //   660: invokeinterface 235 1 0
    //   665: ifeq +40 -> 705
    //   668: aload_1
    //   669: invokeinterface 239 1 0
    //   674: checkcast 241	java/io/BufferedWriter
    //   677: astore 4
    //   679: aload 4
    //   681: ifnull -22 -> 659
    //   684: aload 4
    //   686: invokevirtual 242	java/io/BufferedWriter:close	()V
    //   689: goto -30 -> 659
    //   692: astore_1
    //   693: ldc -104
    //   695: aload_1
    //   696: ldc -47
    //   698: iconst_0
    //   699: anewarray 4	java/lang/Object
    //   702: invokestatic 213	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   705: iconst_1
    //   706: ireturn
    //   707: astore_1
    //   708: aconst_null
    //   709: astore 4
    //   711: goto -397 -> 314
    //   714: astore 5
    //   716: aload_1
    //   717: astore 4
    //   719: aload 5
    //   721: astore_1
    //   722: goto -408 -> 314
    //   725: astore 4
    //   727: aconst_null
    //   728: astore_1
    //   729: goto -553 -> 176
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	732	0	this	r
    //   0	732	1	paramString	String
    //   587	29	2	i	int
    //   585	6	3	j	int
    //   62	287	4	localObject1	Object
    //   373	269	4	localIOException	java.io.IOException
    //   677	41	4	localObject2	Object
    //   725	1	4	localException1	Exception
    //   1	153	5	str	String
    //   167	6	5	localException2	Exception
    //   276	329	5	localObject3	Object
    //   714	6	5	localObject4	Object
    //   272	274	6	localObject5	Object
    //   51	596	7	localHashMap	HashMap
    //   11	625	8	localFile	java.io.File
    //   75	556	9	localInputStreamReader	java.io.InputStreamReader
    //   86	540	10	localBufferedReader	java.io.BufferedReader
    //   113	363	11	arrayOfString	String[]
    // Exception table:
    //   from	to	target	type
    //   64	88	167	java/lang/Exception
    //   91	98	167	java/lang/Exception
    //   103	142	167	java/lang/Exception
    //   142	164	167	java/lang/Exception
    //   258	274	167	java/lang/Exception
    //   283	310	167	java/lang/Exception
    //   390	414	167	java/lang/Exception
    //   414	446	167	java/lang/Exception
    //   446	501	167	java/lang/Exception
    //   504	518	167	java/lang/Exception
    //   518	540	167	java/lang/Exception
    //   545	550	167	java/lang/Exception
    //   553	586	167	java/lang/Exception
    //   598	612	167	java/lang/Exception
    //   619	625	167	java/lang/Exception
    //   625	641	167	java/lang/Exception
    //   193	197	243	java/io/IOException
    //   197	210	243	java/io/IOException
    //   210	230	243	java/io/IOException
    //   235	240	243	java/io/IOException
    //   64	88	313	finally
    //   91	98	313	finally
    //   103	142	313	finally
    //   142	164	313	finally
    //   258	274	313	finally
    //   283	310	313	finally
    //   390	414	313	finally
    //   414	446	313	finally
    //   446	501	313	finally
    //   504	518	313	finally
    //   518	540	313	finally
    //   545	550	313	finally
    //   553	586	313	finally
    //   598	612	313	finally
    //   619	625	313	finally
    //   625	641	313	finally
    //   319	324	373	java/io/IOException
    //   324	338	373	java/io/IOException
    //   338	360	373	java/io/IOException
    //   365	370	373	java/io/IOException
    //   641	659	692	java/io/IOException
    //   659	679	692	java/io/IOException
    //   684	689	692	java/io/IOException
    //   53	64	707	finally
    //   176	189	714	finally
    //   53	64	725	java/lang/Exception
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return cVM;
  }
  
  public final void bn(boolean paramBoolean)
  {
    com.tencent.mm.sdk.b.a.sFg.b(this.ecY);
    com.tencent.mm.sdk.b.a.sFg.b(this.ecZ);
    com.tencent.mm.sdk.b.a.sFg.b(this.eda);
    com.tencent.mm.sdk.b.a.sFg.b(this.edc);
    if (this.edb != null) {
      this.edb.ecR.clear();
    }
    for (;;)
    {
      com.tencent.mm.sdk.b.a.sFg.b(this.edb.ecS);
      com.tencent.mm.sdk.b.a.sFg.b(this.edb.ecT);
      return;
      this.edb = new l();
    }
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    com.tencent.mm.sdk.b.a.sFg.c(this.ecY);
    com.tencent.mm.sdk.b.a.sFg.c(this.ecZ);
    com.tencent.mm.sdk.b.a.sFg.c(this.eda);
    com.tencent.mm.sdk.b.a.sFg.c(this.edb.ecS);
    com.tencent.mm.sdk.b.a.sFg.c(this.edb.ecT);
    com.tencent.mm.sdk.b.a.sFg.c(this.edc);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ar/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */