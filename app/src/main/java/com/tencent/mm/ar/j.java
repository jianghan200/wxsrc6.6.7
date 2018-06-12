package com.tencent.mm.ar;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.a;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.mh;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.ayv;
import com.tencent.mm.protocal.c.sk;
import com.tencent.mm.protocal.c.sl;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public final class j
  extends l
  implements com.tencent.mm.ab.n, com.tencent.mm.network.k
{
  private int bJE;
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public int ecO;
  private int offset;
  
  public j(int paramInt1, int paramInt2)
  {
    this.ecO = paramInt1;
    this.bJE = paramInt2;
    this.offset = 0;
    Object localObject = r.Qp().bi(paramInt1, paramInt2);
    if (localObject == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneDownloadPackage", "doScene get info null, id:" + paramInt1);
      return;
    }
    ((m)localObject).status = 3;
    ((m)localObject).bWA = 64;
    r.Qp().b((m)localObject);
    if (paramInt2 == 5)
    {
      localObject = g.Ei().cachePath;
      com.tencent.mm.a.e.deleteFile((String)localObject + "brand_i18n.apk");
      return;
    }
    localObject = r.Qp();
    com.tencent.mm.a.e.deleteFile(n.Qm() + ((n)localObject).bk(paramInt1, paramInt2));
  }
  
  private static boolean ar(String paramString1, String paramString2)
  {
    boolean bool = true;
    if ((bi.oW(paramString1)) || (bi.oW(paramString2))) {
      return false;
    }
    try
    {
      paramString1 = paramString1 + paramString2;
      paramString2 = com.tencent.mm.a.e.ct(paramString1);
      if (!bi.oW(paramString2))
      {
        g.Ei().DT().a(aa.a.sUb, paramString2);
        try
        {
          com.tencent.mm.a.e.deleteFile(paramString1);
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneDownloadPackage", "update sense where result[%b] filepath[%s] xml[%s] ", new Object[] { Boolean.valueOf(bool), paramString1, bi.Xf(paramString2) });
          return bool;
        }
        catch (IOException paramString1) {}
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.NetSceneDownloadPackage", paramString1, "", new Object[0]);
        return bool;
      }
    }
    catch (IOException paramString1)
    {
      for (;;)
      {
        bool = false;
        continue;
        bool = false;
      }
    }
  }
  
  /* Error */
  private boolean as(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aload_1
    //   4: invokestatic 117	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   7: ifne +10 -> 17
    //   10: aload_2
    //   11: invokestatic 117	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   14: ifeq +63 -> 77
    //   17: ldc 43
    //   19: new 45	java/lang/StringBuilder
    //   22: dup
    //   23: ldc -91
    //   25: invokespecial 50	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   28: aload_1
    //   29: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: ldc -89
    //   34: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: aload_2
    //   38: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   44: invokestatic 64	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   47: invokestatic 35	com/tencent/mm/ar/r:Qp	()Lcom/tencent/mm/ar/n;
    //   50: aload_0
    //   51: getfield 25	com/tencent/mm/ar/j:ecO	I
    //   54: aload_0
    //   55: getfield 27	com/tencent/mm/ar/j:bJE	I
    //   58: invokevirtual 170	com/tencent/mm/ar/n:bm	(II)V
    //   61: aload_0
    //   62: getfield 172	com/tencent/mm/ar/j:diJ	Lcom/tencent/mm/ab/e;
    //   65: iconst_3
    //   66: iconst_0
    //   67: ldc -82
    //   69: aload_0
    //   70: invokeinterface 179 5 0
    //   75: iconst_0
    //   76: ireturn
    //   77: new 181	java/io/File
    //   80: dup
    //   81: new 45	java/lang/StringBuilder
    //   84: dup
    //   85: invokespecial 89	java/lang/StringBuilder:<init>	()V
    //   88: aload_1
    //   89: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: aload_2
    //   93: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   99: invokespecial 182	java/io/File:<init>	(Ljava/lang/String;)V
    //   102: astore 9
    //   104: aload 9
    //   106: invokevirtual 186	java/io/File:exists	()Z
    //   109: ifne +63 -> 172
    //   112: ldc 43
    //   114: new 45	java/lang/StringBuilder
    //   117: dup
    //   118: ldc -68
    //   120: invokespecial 50	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   123: aload_1
    //   124: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: ldc -89
    //   129: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: aload_2
    //   133: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   139: invokestatic 64	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   142: invokestatic 35	com/tencent/mm/ar/r:Qp	()Lcom/tencent/mm/ar/n;
    //   145: aload_0
    //   146: getfield 25	com/tencent/mm/ar/j:ecO	I
    //   149: aload_0
    //   150: getfield 27	com/tencent/mm/ar/j:bJE	I
    //   153: invokevirtual 170	com/tencent/mm/ar/n:bm	(II)V
    //   156: aload_0
    //   157: getfield 172	com/tencent/mm/ar/j:diJ	Lcom/tencent/mm/ab/e;
    //   160: iconst_3
    //   161: iconst_0
    //   162: ldc -66
    //   164: aload_0
    //   165: invokeinterface 179 5 0
    //   170: iconst_0
    //   171: ireturn
    //   172: new 192	java/util/HashMap
    //   175: dup
    //   176: invokespecial 193	java/util/HashMap:<init>	()V
    //   179: astore 8
    //   181: new 195	java/io/FileInputStream
    //   184: dup
    //   185: aload 9
    //   187: invokespecial 198	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   190: astore 5
    //   192: aload 5
    //   194: astore_1
    //   195: new 200	java/io/InputStreamReader
    //   198: dup
    //   199: aload 5
    //   201: ldc -54
    //   203: invokespecial 205	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   206: astore 10
    //   208: aload 5
    //   210: astore_1
    //   211: new 207	java/io/BufferedReader
    //   214: dup
    //   215: aload 10
    //   217: invokespecial 210	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   220: astore 11
    //   222: aload 6
    //   224: astore_2
    //   225: aload 5
    //   227: astore_1
    //   228: aload 11
    //   230: invokevirtual 213	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   233: astore 6
    //   235: aload 6
    //   237: ifnull +510 -> 747
    //   240: aload 5
    //   242: astore_1
    //   243: aload 6
    //   245: invokevirtual 218	java/lang/String:trim	()Ljava/lang/String;
    //   248: ldc -36
    //   250: invokevirtual 224	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   253: astore 12
    //   255: aload 5
    //   257: astore_1
    //   258: aload 12
    //   260: arraylength
    //   261: iconst_2
    //   262: if_icmplt +29 -> 291
    //   265: aload 5
    //   267: astore_1
    //   268: aload 12
    //   270: iconst_0
    //   271: aaload
    //   272: invokestatic 117	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   275: ifne +16 -> 291
    //   278: aload 5
    //   280: astore_1
    //   281: aload 12
    //   283: iconst_1
    //   284: aaload
    //   285: invokestatic 117	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   288: ifeq +166 -> 454
    //   291: aload 5
    //   293: astore_1
    //   294: ldc 43
    //   296: new 45	java/lang/StringBuilder
    //   299: dup
    //   300: ldc -30
    //   302: invokespecial 50	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   305: aload 6
    //   307: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   310: invokevirtual 58	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   313: invokestatic 64	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   316: goto -91 -> 225
    //   319: astore_1
    //   320: aload 5
    //   322: astore_2
    //   323: aload_1
    //   324: astore 5
    //   326: aload_2
    //   327: astore_1
    //   328: ldc 43
    //   330: ldc -28
    //   332: iconst_1
    //   333: anewarray 141	java/lang/Object
    //   336: dup
    //   337: iconst_0
    //   338: aload 5
    //   340: invokestatic 231	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   343: aastore
    //   344: invokestatic 233	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   347: aload_2
    //   348: astore_1
    //   349: invokestatic 35	com/tencent/mm/ar/r:Qp	()Lcom/tencent/mm/ar/n;
    //   352: aload_0
    //   353: getfield 25	com/tencent/mm/ar/j:ecO	I
    //   356: aload_0
    //   357: getfield 27	com/tencent/mm/ar/j:bJE	I
    //   360: invokevirtual 170	com/tencent/mm/ar/n:bm	(II)V
    //   363: aload_2
    //   364: astore_1
    //   365: aload_0
    //   366: getfield 172	com/tencent/mm/ar/j:diJ	Lcom/tencent/mm/ab/e;
    //   369: iconst_3
    //   370: iconst_0
    //   371: aload 5
    //   373: invokevirtual 236	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   376: aload_0
    //   377: invokeinterface 179 5 0
    //   382: aload_2
    //   383: ifnull +7 -> 390
    //   386: aload_2
    //   387: invokevirtual 241	java/io/InputStream:close	()V
    //   390: aload 8
    //   392: invokeinterface 247 1 0
    //   397: invokeinterface 253 1 0
    //   402: astore_1
    //   403: aload_1
    //   404: invokeinterface 258 1 0
    //   409: ifeq +43 -> 452
    //   412: aload_1
    //   413: invokeinterface 262 1 0
    //   418: checkcast 264	java/io/BufferedWriter
    //   421: astore_2
    //   422: aload_2
    //   423: ifnull -20 -> 403
    //   426: aload_2
    //   427: invokevirtual 265	java/io/BufferedWriter:close	()V
    //   430: goto -27 -> 403
    //   433: astore_1
    //   434: ldc 43
    //   436: ldc -28
    //   438: iconst_1
    //   439: anewarray 141	java/lang/Object
    //   442: dup
    //   443: iconst_0
    //   444: aload_1
    //   445: invokestatic 231	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   448: aastore
    //   449: invokestatic 233	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   452: iconst_0
    //   453: ireturn
    //   454: aload 5
    //   456: astore_1
    //   457: aload 8
    //   459: aload 12
    //   461: iconst_0
    //   462: aaload
    //   463: invokeinterface 269 2 0
    //   468: checkcast 264	java/io/BufferedWriter
    //   471: astore 7
    //   473: aload 7
    //   475: astore 6
    //   477: aload 7
    //   479: ifnonnull +192 -> 671
    //   482: aload 5
    //   484: astore_1
    //   485: invokestatic 275	com/tencent/mm/storage/RegionCodeDecoder:cmS	()Lcom/tencent/mm/storage/RegionCodeDecoder;
    //   488: pop
    //   489: aload 5
    //   491: astore_1
    //   492: aload 12
    //   494: iconst_0
    //   495: aaload
    //   496: invokestatic 278	com/tencent/mm/storage/RegionCodeDecoder:Zg	(Ljava/lang/String;)Ljava/lang/String;
    //   499: astore_2
    //   500: aload 5
    //   502: astore_1
    //   503: aload_2
    //   504: invokestatic 117	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   507: ifeq +93 -> 600
    //   510: aload 5
    //   512: astore_1
    //   513: ldc 43
    //   515: ldc_w 280
    //   518: invokestatic 64	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   521: goto -296 -> 225
    //   524: astore_2
    //   525: aload_1
    //   526: ifnull +7 -> 533
    //   529: aload_1
    //   530: invokevirtual 241	java/io/InputStream:close	()V
    //   533: aload 8
    //   535: invokeinterface 247 1 0
    //   540: invokeinterface 253 1 0
    //   545: astore_1
    //   546: aload_1
    //   547: invokeinterface 258 1 0
    //   552: ifeq +46 -> 598
    //   555: aload_1
    //   556: invokeinterface 262 1 0
    //   561: checkcast 264	java/io/BufferedWriter
    //   564: astore 5
    //   566: aload 5
    //   568: ifnull -22 -> 546
    //   571: aload 5
    //   573: invokevirtual 265	java/io/BufferedWriter:close	()V
    //   576: goto -30 -> 546
    //   579: astore_1
    //   580: ldc 43
    //   582: ldc -28
    //   584: iconst_1
    //   585: anewarray 141	java/lang/Object
    //   588: dup
    //   589: iconst_0
    //   590: aload_1
    //   591: invokestatic 231	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   594: aastore
    //   595: invokestatic 233	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   598: aload_2
    //   599: athrow
    //   600: aload 5
    //   602: astore_1
    //   603: new 181	java/io/File
    //   606: dup
    //   607: aload_2
    //   608: invokespecial 182	java/io/File:<init>	(Ljava/lang/String;)V
    //   611: astore 6
    //   613: aload 5
    //   615: astore_1
    //   616: aload 6
    //   618: invokevirtual 186	java/io/File:exists	()Z
    //   621: ifne +12 -> 633
    //   624: aload 5
    //   626: astore_1
    //   627: aload 6
    //   629: invokevirtual 283	java/io/File:createNewFile	()Z
    //   632: pop
    //   633: aload 5
    //   635: astore_1
    //   636: new 264	java/io/BufferedWriter
    //   639: dup
    //   640: new 285	java/io/FileWriter
    //   643: dup
    //   644: aload 6
    //   646: invokespecial 286	java/io/FileWriter:<init>	(Ljava/io/File;)V
    //   649: invokespecial 289	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   652: astore 6
    //   654: aload 5
    //   656: astore_1
    //   657: aload 8
    //   659: aload 12
    //   661: iconst_0
    //   662: aaload
    //   663: aload 6
    //   665: invokeinterface 293 3 0
    //   670: pop
    //   671: aload 5
    //   673: astore_1
    //   674: new 295	java/lang/StringBuffer
    //   677: dup
    //   678: invokespecial 296	java/lang/StringBuffer:<init>	()V
    //   681: astore 7
    //   683: aload 5
    //   685: astore_1
    //   686: aload 7
    //   688: aload 12
    //   690: iconst_1
    //   691: aaload
    //   692: invokevirtual 299	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   695: pop
    //   696: aload 5
    //   698: astore_1
    //   699: aload 7
    //   701: bipush 124
    //   703: invokevirtual 302	java/lang/StringBuffer:append	(C)Ljava/lang/StringBuffer;
    //   706: pop
    //   707: aload 5
    //   709: astore_1
    //   710: aload 7
    //   712: aload 12
    //   714: iconst_2
    //   715: aaload
    //   716: invokevirtual 299	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   719: pop
    //   720: aload 5
    //   722: astore_1
    //   723: aload 7
    //   725: bipush 10
    //   727: invokevirtual 302	java/lang/StringBuffer:append	(C)Ljava/lang/StringBuffer;
    //   730: pop
    //   731: aload 5
    //   733: astore_1
    //   734: aload 6
    //   736: aload 7
    //   738: invokevirtual 303	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   741: invokevirtual 306	java/io/BufferedWriter:write	(Ljava/lang/String;)V
    //   744: goto -519 -> 225
    //   747: aload 5
    //   749: astore_1
    //   750: aload 8
    //   752: invokeinterface 247 1 0
    //   757: invokeinterface 253 1 0
    //   762: astore 6
    //   764: aload 5
    //   766: astore_1
    //   767: aload 6
    //   769: invokeinterface 258 1 0
    //   774: ifeq +34 -> 808
    //   777: aload 5
    //   779: astore_1
    //   780: aload 6
    //   782: invokeinterface 262 1 0
    //   787: checkcast 264	java/io/BufferedWriter
    //   790: astore 7
    //   792: aload 7
    //   794: ifnull -30 -> 764
    //   797: aload 5
    //   799: astore_1
    //   800: aload 7
    //   802: invokevirtual 309	java/io/BufferedWriter:flush	()V
    //   805: goto -41 -> 764
    //   808: aload 5
    //   810: astore_1
    //   811: aload_2
    //   812: invokestatic 117	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   815: ifne +85 -> 900
    //   818: aload 5
    //   820: astore_1
    //   821: new 181	java/io/File
    //   824: dup
    //   825: aload_2
    //   826: invokespecial 182	java/io/File:<init>	(Ljava/lang/String;)V
    //   829: invokevirtual 313	java/io/File:getParentFile	()Ljava/io/File;
    //   832: new 10	com/tencent/mm/ar/j$1
    //   835: dup
    //   836: aload_0
    //   837: invokespecial 316	com/tencent/mm/ar/j$1:<init>	(Lcom/tencent/mm/ar/j;)V
    //   840: invokevirtual 320	java/io/File:listFiles	(Ljava/io/FileFilter;)[Ljava/io/File;
    //   843: astore_2
    //   844: aload 5
    //   846: astore_1
    //   847: aload_2
    //   848: arraylength
    //   849: istore 4
    //   851: iconst_0
    //   852: istore_3
    //   853: iload_3
    //   854: iload 4
    //   856: if_icmpge +35 -> 891
    //   859: aload_2
    //   860: iload_3
    //   861: aaload
    //   862: astore 6
    //   864: aload 5
    //   866: astore_1
    //   867: invokestatic 275	com/tencent/mm/storage/RegionCodeDecoder:cmS	()Lcom/tencent/mm/storage/RegionCodeDecoder;
    //   870: pop
    //   871: aload 5
    //   873: astore_1
    //   874: aload 6
    //   876: aload 6
    //   878: invokevirtual 313	java/io/File:getParentFile	()Ljava/io/File;
    //   881: invokestatic 324	com/tencent/mm/storage/RegionCodeDecoder:h	(Ljava/io/File;Ljava/io/File;)V
    //   884: iload_3
    //   885: iconst_1
    //   886: iadd
    //   887: istore_3
    //   888: goto -35 -> 853
    //   891: aload 5
    //   893: astore_1
    //   894: invokestatic 275	com/tencent/mm/storage/RegionCodeDecoder:cmS	()Lcom/tencent/mm/storage/RegionCodeDecoder;
    //   897: invokevirtual 327	com/tencent/mm/storage/RegionCodeDecoder:ckJ	()V
    //   900: aload 5
    //   902: astore_1
    //   903: aload 11
    //   905: invokevirtual 328	java/io/BufferedReader:close	()V
    //   908: aload 5
    //   910: astore_1
    //   911: aload 10
    //   913: invokevirtual 329	java/io/InputStreamReader:close	()V
    //   916: aload 5
    //   918: astore_1
    //   919: aload 9
    //   921: invokevirtual 332	java/io/File:delete	()Z
    //   924: pop
    //   925: aload 5
    //   927: invokevirtual 241	java/io/InputStream:close	()V
    //   930: aload 8
    //   932: invokeinterface 247 1 0
    //   937: invokeinterface 253 1 0
    //   942: astore_1
    //   943: aload_1
    //   944: invokeinterface 258 1 0
    //   949: ifeq +43 -> 992
    //   952: aload_1
    //   953: invokeinterface 262 1 0
    //   958: checkcast 264	java/io/BufferedWriter
    //   961: astore_2
    //   962: aload_2
    //   963: ifnull -20 -> 943
    //   966: aload_2
    //   967: invokevirtual 265	java/io/BufferedWriter:close	()V
    //   970: goto -27 -> 943
    //   973: astore_1
    //   974: ldc 43
    //   976: ldc -28
    //   978: iconst_1
    //   979: anewarray 141	java/lang/Object
    //   982: dup
    //   983: iconst_0
    //   984: aload_1
    //   985: invokestatic 231	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   988: aastore
    //   989: invokestatic 233	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   992: iconst_1
    //   993: ireturn
    //   994: astore_2
    //   995: aconst_null
    //   996: astore_1
    //   997: goto -472 -> 525
    //   1000: astore 5
    //   1002: aconst_null
    //   1003: astore_2
    //   1004: goto -678 -> 326
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1007	0	this	j
    //   0	1007	1	paramString1	String
    //   0	1007	2	paramString2	String
    //   852	36	3	i	int
    //   849	8	4	j	int
    //   190	736	5	localObject1	Object
    //   1000	1	5	localException	Exception
    //   1	876	6	localObject2	Object
    //   471	330	7	localObject3	Object
    //   179	752	8	localHashMap	java.util.HashMap
    //   102	818	9	localFile	File
    //   206	706	10	localInputStreamReader	java.io.InputStreamReader
    //   220	684	11	localBufferedReader	java.io.BufferedReader
    //   253	460	12	arrayOfString	String[]
    // Exception table:
    //   from	to	target	type
    //   195	208	319	java/lang/Exception
    //   211	222	319	java/lang/Exception
    //   228	235	319	java/lang/Exception
    //   243	255	319	java/lang/Exception
    //   258	265	319	java/lang/Exception
    //   268	278	319	java/lang/Exception
    //   281	291	319	java/lang/Exception
    //   294	316	319	java/lang/Exception
    //   457	473	319	java/lang/Exception
    //   485	489	319	java/lang/Exception
    //   492	500	319	java/lang/Exception
    //   503	510	319	java/lang/Exception
    //   513	521	319	java/lang/Exception
    //   603	613	319	java/lang/Exception
    //   616	624	319	java/lang/Exception
    //   627	633	319	java/lang/Exception
    //   636	654	319	java/lang/Exception
    //   657	671	319	java/lang/Exception
    //   674	683	319	java/lang/Exception
    //   686	696	319	java/lang/Exception
    //   699	707	319	java/lang/Exception
    //   710	720	319	java/lang/Exception
    //   723	731	319	java/lang/Exception
    //   734	744	319	java/lang/Exception
    //   750	764	319	java/lang/Exception
    //   767	777	319	java/lang/Exception
    //   780	792	319	java/lang/Exception
    //   800	805	319	java/lang/Exception
    //   811	818	319	java/lang/Exception
    //   821	844	319	java/lang/Exception
    //   847	851	319	java/lang/Exception
    //   867	871	319	java/lang/Exception
    //   874	884	319	java/lang/Exception
    //   894	900	319	java/lang/Exception
    //   903	908	319	java/lang/Exception
    //   911	916	319	java/lang/Exception
    //   919	925	319	java/lang/Exception
    //   386	390	433	java/io/IOException
    //   390	403	433	java/io/IOException
    //   403	422	433	java/io/IOException
    //   426	430	433	java/io/IOException
    //   195	208	524	finally
    //   211	222	524	finally
    //   228	235	524	finally
    //   243	255	524	finally
    //   258	265	524	finally
    //   268	278	524	finally
    //   281	291	524	finally
    //   294	316	524	finally
    //   328	347	524	finally
    //   349	363	524	finally
    //   365	382	524	finally
    //   457	473	524	finally
    //   485	489	524	finally
    //   492	500	524	finally
    //   503	510	524	finally
    //   513	521	524	finally
    //   603	613	524	finally
    //   616	624	524	finally
    //   627	633	524	finally
    //   636	654	524	finally
    //   657	671	524	finally
    //   674	683	524	finally
    //   686	696	524	finally
    //   699	707	524	finally
    //   710	720	524	finally
    //   723	731	524	finally
    //   734	744	524	finally
    //   750	764	524	finally
    //   767	777	524	finally
    //   780	792	524	finally
    //   800	805	524	finally
    //   811	818	524	finally
    //   821	844	524	finally
    //   847	851	524	finally
    //   867	871	524	finally
    //   874	884	524	finally
    //   894	900	524	finally
    //   903	908	524	finally
    //   911	916	524	finally
    //   919	925	524	finally
    //   529	533	579	java/io/IOException
    //   533	546	579	java/io/IOException
    //   546	566	579	java/io/IOException
    //   571	576	579	java/io/IOException
    //   925	943	973	java/io/IOException
    //   943	962	973	java/io/IOException
    //   966	970	973	java/io/IOException
    //   181	192	994	finally
    //   181	192	1000	java/lang/Exception
  }
  
  protected final int Cc()
  {
    return 50;
  }
  
  public final int Lf()
  {
    return this.bJE;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneDownloadPackage", "dkregcode doScene pkgId:%d packageType:%d", new Object[] { Integer.valueOf(this.ecO), Integer.valueOf(this.bJE) });
    parame1 = r.Qp().bi(this.ecO, this.bJE);
    if (parame1 == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneDownloadPackage", "doScene get Theme failed id:" + this.ecO + " type:" + this.bJE);
      return -1;
    }
    if (parame1.status != 3)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneDownloadPackage", "doScene get Theme stat failed id:" + this.ecO + " stat:" + parame1.status);
      return -1;
    }
    if (parame1.size <= 0)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneDownloadPackage", "doScene Theme size err id:" + this.ecO + " size:" + parame1.size);
      return -1;
    }
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new sk();
    ((b.a)localObject).dIH = new sl();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/downloadpackage";
    ((b.a)localObject).dIF = 160;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (sk)this.diG.dID.dIL;
    ayv localayv = new ayv();
    localayv.jTt = parame1.id;
    localayv.hcD = parame1.version;
    ((sk)localObject).rvL = localayv;
    ((sk)localObject).rjC = this.offset;
    ((sk)localObject).rvM = 65536;
    ((sk)localObject).hcE = this.bJE;
    return a(parame, this.diG, this);
  }
  
  protected final int a(q paramq)
  {
    paramq = (sk)((com.tencent.mm.ab.b)paramq).dID.dIL;
    m localm = r.Qp().bi(this.ecO, this.bJE);
    if (localm == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneDownloadPackage", "securityVerificationChecked get Theme failed id:" + this.ecO);
      return l.b.dJn;
    }
    if ((paramq.rvL.jTt != this.ecO) || (paramq.rjC != this.offset) || (paramq.rjC >= localm.size) || (paramq.rvM != 65536) || (localm.size <= 0) || (localm.status != 3))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneDownloadPackage", "securityVerificationChecked Theme failed id:" + this.ecO);
      return l.b.dJn;
    }
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneDownloadPackage", "onGYNetEnd id:" + this.ecO + " + id:" + paramInt1 + " errtype:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 0) && (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneDownloadPackage", "onGYNetEnd, errType = " + paramInt2 + ", errCode = " + paramInt3);
      r.Qp().bm(this.ecO, this.bJE);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
    label738:
    label836:
    label1073:
    label1228:
    label1423:
    label1446:
    do
    {
      return;
      paramq = (sl)((com.tencent.mm.ab.b)paramq).dIE.dIL;
      if (paramq.hcE != this.bJE)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneDownloadPackage", "packageType is not consistent");
        r.Qp().bm(this.ecO, this.bJE);
        this.diJ.a(3, -1, "", this);
        return;
      }
      byte[] arrayOfByte = ab.a(paramq.rvN);
      if ((arrayOfByte == null) || (arrayOfByte.length == 0))
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneDownloadPackage", "onGYNetEnd get pkgBuf failed id:" + this.ecO);
        r.Qp().bm(this.ecO, this.bJE);
        this.diJ.a(3, -1, paramString, this);
        return;
      }
      m localm = r.Qp().bi(this.ecO, this.bJE);
      if (localm == null)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneDownloadPackage", "onGYNetEnd info is null, pkgId = " + this.ecO);
        r.Qp().bm(this.ecO, this.bJE);
        this.diJ.a(3, -1, paramString, this);
        return;
      }
      if (localm.size != paramq.rvO)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneDownloadPackage", "onGYNetEnd totalSize is incorrect");
        r.Qp().bm(this.ecO, this.bJE);
        paramq = new k(this.bJE);
        g.Eh().dpP.a(paramq, 0);
        this.diJ.a(3, -1, paramString, this);
        return;
      }
      if (this.bJE == 5) {
        paramArrayOfByte = g.Ei().cachePath;
      }
      for (paramq = "brand_i18n.apk";; paramq = r.Qp().bk(this.ecO, this.bJE))
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneDownloadPackage", "packagePath " + paramArrayOfByte);
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneDownloadPackage", "packageName " + paramq);
        paramInt1 = com.tencent.mm.a.e.b(paramArrayOfByte, paramq, arrayOfByte);
        if (paramInt1 == 0) {
          break;
        }
        r.Qp().bm(this.ecO, this.bJE);
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneDownloadPackage", "onGYNetEnd write file fail, ret = " + paramInt1);
        this.diJ.a(3, -1, paramString, this);
        return;
        r.Qp();
        paramArrayOfByte = n.Qm();
      }
      paramInt1 = this.offset;
      this.offset = (arrayOfByte.length + paramInt1);
      if (this.offset >= localm.size)
      {
        boolean bool = false;
        if (this.bJE == 1)
        {
          paramString = r.Qp().bl(this.ecO, this.bJE);
          paramInt1 = bi.fR(paramArrayOfByte + paramq, paramString);
          if (paramInt1 < 0)
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneDownloadPackage", "unzip fail, ret = " + paramInt1 + ", zipFilePath = " + paramArrayOfByte + paramq + ", unzipPath = " + paramString);
            r.Qp().bm(this.ecO, this.bJE);
            this.diJ.a(3, 0, "unzip fail", this);
            bool = false;
          }
        }
        else
        {
          if (this.bJE == 8) {
            bool = as(paramArrayOfByte, paramq);
          }
          if (this.bJE == 23)
          {
            if ((!bi.oW(paramArrayOfByte)) && (!bi.oW(paramq))) {
              break label1228;
            }
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneDownloadPackage", "update permission pkg failed, packagePath: %s, packageName: %s", new Object[] { paramArrayOfByte, paramq });
            r.Qp().bm(this.ecO, this.bJE);
            this.diJ.a(3, 0, "open permission pkg failed", this);
            bool = false;
          }
          if (this.bJE == 7) {
            bool = true;
          }
          if (this.bJE == 9) {
            bool = true;
          }
          if (this.bJE == 5)
          {
            bool = true;
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneDownloadPackage", "resetResContextImp");
          }
          if (this.bJE == 12)
          {
            paramString = new mh();
            paramString.bWX.bWZ = (paramArrayOfByte + paramq);
            a.sFg.m(paramString);
            bool = true;
          }
          if (this.bJE == 18)
          {
            paramString = r.Qp().bl(this.ecO, this.bJE);
            paramInt1 = bi.fR(paramArrayOfByte + paramq, paramString);
            if (paramInt1 >= 0) {
              break label1423;
            }
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneDownloadPackage", "unzip fail, ret = " + paramInt1 + ", zipFilePath = " + paramArrayOfByte + paramq + ", unzipPath = " + paramString);
            r.Qp().bm(this.ecO, this.bJE);
            this.diJ.a(3, 0, "unzip fail", this);
            bool = false;
          }
          if (this.bJE == 20) {
            bool = true;
          }
          if (this.bJE == 21) {
            bool = true;
          }
          if (this.bJE == 26)
          {
            if ((!bi.oW(paramArrayOfByte)) && (!bi.oW(paramq))) {
              break label1446;
            }
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneDownloadPackage", "updateIPCallContryCodeConfigPkg failed, packagePath: %s, packageName: %s", new Object[] { paramArrayOfByte, paramq });
            this.diJ.a(3, 0, "open IPCallContryCodeConfigs pkg failed", this);
            bool = false;
          }
        }
        for (;;)
        {
          if (this.bJE == 36) {
            bool = ar(paramArrayOfByte, paramq);
          }
          if (!bool) {
            break;
          }
          localm.status = 2;
          localm.bWA = 64;
          r.Qp().b(localm);
          this.diJ.a(0, 0, "", this);
          return;
          bool = true;
          break label738;
          if (!new File(paramArrayOfByte + paramq).exists())
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneDownloadPackage", "update permission pkg failed, file no exist, path: %s, name: %s", new Object[] { paramArrayOfByte, paramq });
            r.Qp().bm(this.ecO, this.bJE);
            this.diJ.a(3, 0, "file not exist", this);
            bool = false;
            break label836;
          }
          paramString = com.tencent.mm.compatible.util.e.duN + "permissioncfg.cfg";
          if (-1L == com.tencent.mm.a.e.y(paramArrayOfByte + paramq, paramString))
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneDownloadPackage", "copy file failed");
            r.Qp().bm(this.ecO, this.bJE);
            this.diJ.a(3, 0, "copy file failed", this);
            bool = false;
            break label836;
          }
          bool = true;
          break label836;
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneDownloadPackage", "Unzip Path %s", new Object[] { paramString });
          bool = true;
          break label1073;
          if (!new File(paramArrayOfByte + paramq).exists())
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneDownloadPackage", "updateIPCallContryCodeConfigPkg failed, file not exist, packagePath: %s, packageName: %s", new Object[] { paramArrayOfByte, paramq });
            r.Qp().bm(this.ecO, this.bJE);
            this.diJ.a(3, 0, "file not exist", this);
            bool = false;
          }
          else
          {
            paramString = com.tencent.mm.compatible.util.e.duN + "ipcallCountryCodeConfig.cfg";
            if (-1L == com.tencent.mm.a.e.y(paramArrayOfByte + paramq, paramString))
            {
              com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneDownloadPackage", "copy file failed");
              r.Qp().bm(this.ecO, this.bJE);
              this.diJ.a(3, 0, "copy file failed", this);
              bool = false;
            }
            else
            {
              com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneDownloadPackage", "updateIPCallContryCodeConfigPkg success");
              bool = true;
            }
          }
        }
      }
    } while (a(this.dIX, this.diJ) >= 0);
    r.Qp().bm(this.ecO, this.bJE);
    this.diJ.a(3, -1, paramString, this);
  }
  
  protected final void a(l.a parama)
  {
    r.Qp().bm(this.ecO, this.bJE);
  }
  
  public final int getType()
  {
    return 160;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ar/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */