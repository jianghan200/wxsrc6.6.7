package com.tencent.mm.plugin.game.wepkg.downloader;

import android.text.TextUtils;
import java.net.HttpURLConnection;
import java.util.concurrent.Future;
import javax.net.ssl.SSLContext;

public final class c
  implements Runnable
{
  f kdY;
  Future<?> kdZ;
  HttpURLConnection kea;
  private String keb;
  private String kec;
  private String ked;
  boolean kee;
  private boolean kef;
  private boolean keg = false;
  private String mContentType;
  private int mStatusCode;
  private int retCode = 0;
  
  public c(f paramf)
  {
    this.kdY = paramf;
  }
  
  private static SSLContext Eb(String paramString)
  {
    try
    {
      paramString = SSLContext.getInstance(paramString);
      return paramString;
    }
    catch (Exception paramString) {}
    return null;
  }
  
  private static int Ec(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      paramString = paramString.split("/");
      if ((paramString != null) && (paramString.length == 2)) {
        try
        {
          int i = Integer.valueOf(paramString[1]).intValue();
          return i;
        }
        catch (NumberFormatException paramString) {}
      }
    }
    return -1;
  }
  
  private static long Ed(String paramString)
  {
    if (!TextUtils.isEmpty(paramString)) {
      try
      {
        long l = Long.valueOf(paramString).longValue();
        return l;
      }
      catch (NumberFormatException paramString) {}
    }
    return -1L;
  }
  
  /* Error */
  private void aVr()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 4
    //   3: aconst_null
    //   4: astore 8
    //   6: aload_0
    //   7: aload_0
    //   8: getfield 90	com/tencent/mm/plugin/game/wepkg/downloader/c:kea	Ljava/net/HttpURLConnection;
    //   11: invokevirtual 95	java/net/HttpURLConnection:getResponseCode	()I
    //   14: putfield 97	com/tencent/mm/plugin/game/wepkg/downloader/c:mStatusCode	I
    //   17: ldc 99
    //   19: ldc 101
    //   21: iconst_2
    //   22: anewarray 4	java/lang/Object
    //   25: dup
    //   26: iconst_0
    //   27: aload_0
    //   28: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   31: getfield 106	com/tencent/mm/plugin/game/wepkg/downloader/f:kev	Ljava/lang/String;
    //   34: aastore
    //   35: dup
    //   36: iconst_1
    //   37: aload_0
    //   38: getfield 97	com/tencent/mm/plugin/game/wepkg/downloader/c:mStatusCode	I
    //   41: invokestatic 109	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   44: aastore
    //   45: invokestatic 115	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   48: aload_0
    //   49: getfield 97	com/tencent/mm/plugin/game/wepkg/downloader/c:mStatusCode	I
    //   52: lookupswitch	default:+1007->1059, 200:+50->102, 206:+50->102
    //   80: aload_0
    //   81: aload_0
    //   82: getfield 97	com/tencent/mm/plugin/game/wepkg/downloader/c:mStatusCode	I
    //   85: putfield 32	com/tencent/mm/plugin/game/wepkg/downloader/c:retCode	I
    //   88: aconst_null
    //   89: astore 7
    //   91: aload 7
    //   93: invokestatic 121	com/tencent/mm/pluginsdk/g/a/d/a:g	(Ljava/io/Closeable;)V
    //   96: aload 8
    //   98: invokestatic 121	com/tencent/mm/pluginsdk/g/a/d/a:g	(Ljava/io/Closeable;)V
    //   101: return
    //   102: aload_0
    //   103: aload_0
    //   104: getfield 90	com/tencent/mm/plugin/game/wepkg/downloader/c:kea	Ljava/net/HttpURLConnection;
    //   107: ldc 123
    //   109: invokevirtual 127	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   112: putfield 129	com/tencent/mm/plugin/game/wepkg/downloader/c:mContentType	Ljava/lang/String;
    //   115: aload_0
    //   116: getfield 90	com/tencent/mm/plugin/game/wepkg/downloader/c:kea	Ljava/net/HttpURLConnection;
    //   119: invokevirtual 133	java/net/HttpURLConnection:getHeaderFields	()Ljava/util/Map;
    //   122: pop
    //   123: aload_0
    //   124: aload_0
    //   125: getfield 90	com/tencent/mm/plugin/game/wepkg/downloader/c:kea	Ljava/net/HttpURLConnection;
    //   128: ldc -121
    //   130: invokevirtual 127	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   133: putfield 137	com/tencent/mm/plugin/game/wepkg/downloader/c:keb	Ljava/lang/String;
    //   136: aload_0
    //   137: aload_0
    //   138: getfield 90	com/tencent/mm/plugin/game/wepkg/downloader/c:kea	Ljava/net/HttpURLConnection;
    //   141: ldc -117
    //   143: invokevirtual 127	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   146: putfield 141	com/tencent/mm/plugin/game/wepkg/downloader/c:kec	Ljava/lang/String;
    //   149: ldc -113
    //   151: aload_0
    //   152: getfield 90	com/tencent/mm/plugin/game/wepkg/downloader/c:kea	Ljava/net/HttpURLConnection;
    //   155: ldc -111
    //   157: invokevirtual 127	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   160: invokevirtual 149	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   163: ifeq +119 -> 282
    //   166: iconst_1
    //   167: istore_3
    //   168: aload_0
    //   169: getfield 151	com/tencent/mm/plugin/game/wepkg/downloader/c:kef	Z
    //   172: ifeq +185 -> 357
    //   175: iload_3
    //   176: ifne +130 -> 306
    //   179: ldc 99
    //   181: ldc -103
    //   183: invokestatic 156	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   186: aload_0
    //   187: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   190: getfield 159	com/tencent/mm/plugin/game/wepkg/downloader/f:mFilePath	Ljava/lang/String;
    //   193: invokestatic 163	com/tencent/mm/pluginsdk/g/a/d/a:Tr	(Ljava/lang/String;)Z
    //   196: pop
    //   197: aload_0
    //   198: getfield 141	com/tencent/mm/plugin/game/wepkg/downloader/c:kec	Ljava/lang/String;
    //   201: invokestatic 165	com/tencent/mm/plugin/game/wepkg/downloader/c:Ed	(Ljava/lang/String;)J
    //   204: lstore 5
    //   206: aload_0
    //   207: iload_3
    //   208: putfield 34	com/tencent/mm/plugin/game/wepkg/downloader/c:keg	Z
    //   211: ldc 99
    //   213: ldc -89
    //   215: iconst_5
    //   216: anewarray 4	java/lang/Object
    //   219: dup
    //   220: iconst_0
    //   221: aload_0
    //   222: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   225: getfield 106	com/tencent/mm/plugin/game/wepkg/downloader/f:kev	Ljava/lang/String;
    //   228: aastore
    //   229: dup
    //   230: iconst_1
    //   231: aload_0
    //   232: getfield 137	com/tencent/mm/plugin/game/wepkg/downloader/c:keb	Ljava/lang/String;
    //   235: aastore
    //   236: dup
    //   237: iconst_2
    //   238: aload_0
    //   239: getfield 141	com/tencent/mm/plugin/game/wepkg/downloader/c:kec	Ljava/lang/String;
    //   242: aastore
    //   243: dup
    //   244: iconst_3
    //   245: aload_0
    //   246: getfield 129	com/tencent/mm/plugin/game/wepkg/downloader/c:mContentType	Ljava/lang/String;
    //   249: aastore
    //   250: dup
    //   251: iconst_4
    //   252: iload_3
    //   253: invokestatic 172	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   256: aastore
    //   257: invokestatic 115	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   260: lload 5
    //   262: ldc2_w 86
    //   265: lcmp
    //   266: ifne +112 -> 378
    //   269: aload_0
    //   270: sipush 1010
    //   273: putfield 32	com/tencent/mm/plugin/game/wepkg/downloader/c:retCode	I
    //   276: aconst_null
    //   277: astore 7
    //   279: goto -188 -> 91
    //   282: aload_0
    //   283: getfield 137	com/tencent/mm/plugin/game/wepkg/downloader/c:keb	Ljava/lang/String;
    //   286: ifnull +776 -> 1062
    //   289: aload_0
    //   290: getfield 137	com/tencent/mm/plugin/game/wepkg/downloader/c:keb	Ljava/lang/String;
    //   293: ldc -113
    //   295: invokevirtual 175	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   298: ifeq +764 -> 1062
    //   301: iconst_1
    //   302: istore_3
    //   303: goto -135 -> 168
    //   306: aload_0
    //   307: getfield 137	com/tencent/mm/plugin/game/wepkg/downloader/c:keb	Ljava/lang/String;
    //   310: invokestatic 177	com/tencent/mm/plugin/game/wepkg/downloader/c:Ec	(Ljava/lang/String;)I
    //   313: i2l
    //   314: lstore 5
    //   316: lload 5
    //   318: ldc2_w 86
    //   321: lcmp
    //   322: ifne +734 -> 1056
    //   325: ldc 99
    //   327: ldc -77
    //   329: invokestatic 156	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   332: aload_0
    //   333: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   336: getfield 159	com/tencent/mm/plugin/game/wepkg/downloader/f:mFilePath	Ljava/lang/String;
    //   339: invokestatic 163	com/tencent/mm/pluginsdk/g/a/d/a:Tr	(Ljava/lang/String;)Z
    //   342: pop
    //   343: aload_0
    //   344: getfield 141	com/tencent/mm/plugin/game/wepkg/downloader/c:kec	Ljava/lang/String;
    //   347: invokestatic 165	com/tencent/mm/plugin/game/wepkg/downloader/c:Ed	(Ljava/lang/String;)J
    //   350: lstore 5
    //   352: iconst_0
    //   353: istore_3
    //   354: goto -148 -> 206
    //   357: ldc 99
    //   359: ldc -75
    //   361: invokestatic 156	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   364: aload_0
    //   365: getfield 141	com/tencent/mm/plugin/game/wepkg/downloader/c:kec	Ljava/lang/String;
    //   368: invokestatic 165	com/tencent/mm/plugin/game/wepkg/downloader/c:Ed	(Ljava/lang/String;)J
    //   371: lstore 5
    //   373: iconst_0
    //   374: istore_3
    //   375: goto -169 -> 206
    //   378: aload_0
    //   379: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   382: getfield 185	com/tencent/mm/plugin/game/wepkg/downloader/f:keA	J
    //   385: lconst_0
    //   386: lcmp
    //   387: ifle +61 -> 448
    //   390: lload 5
    //   392: aload_0
    //   393: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   396: getfield 185	com/tencent/mm/plugin/game/wepkg/downloader/f:keA	J
    //   399: lcmp
    //   400: ifeq +48 -> 448
    //   403: ldc 99
    //   405: ldc -69
    //   407: iconst_2
    //   408: anewarray 4	java/lang/Object
    //   411: dup
    //   412: iconst_0
    //   413: aload_0
    //   414: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   417: getfield 185	com/tencent/mm/plugin/game/wepkg/downloader/f:keA	J
    //   420: invokestatic 190	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   423: aastore
    //   424: dup
    //   425: iconst_1
    //   426: lload 5
    //   428: invokestatic 190	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   431: aastore
    //   432: invokestatic 115	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   435: aload_0
    //   436: sipush 1011
    //   439: putfield 32	com/tencent/mm/plugin/game/wepkg/downloader/c:retCode	I
    //   442: aconst_null
    //   443: astore 7
    //   445: goto -354 -> 91
    //   448: aload_0
    //   449: aload_0
    //   450: getfield 90	com/tencent/mm/plugin/game/wepkg/downloader/c:kea	Ljava/net/HttpURLConnection;
    //   453: invokevirtual 194	java/net/HttpURLConnection:getContentEncoding	()Ljava/lang/String;
    //   456: putfield 196	com/tencent/mm/plugin/game/wepkg/downloader/c:ked	Ljava/lang/String;
    //   459: aload_0
    //   460: getfield 90	com/tencent/mm/plugin/game/wepkg/downloader/c:kea	Ljava/net/HttpURLConnection;
    //   463: invokevirtual 200	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   466: astore 7
    //   468: aload_0
    //   469: getfield 196	com/tencent/mm/plugin/game/wepkg/downloader/c:ked	Ljava/lang/String;
    //   472: invokestatic 205	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   475: ifne +163 -> 638
    //   478: aload_0
    //   479: getfield 196	com/tencent/mm/plugin/game/wepkg/downloader/c:ked	Ljava/lang/String;
    //   482: ldc -49
    //   484: invokevirtual 210	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   487: ifeq +151 -> 638
    //   490: new 212	java/util/zip/GZIPInputStream
    //   493: dup
    //   494: aload 7
    //   496: invokespecial 215	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   499: astore 7
    //   501: aload_0
    //   502: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   505: getfield 159	com/tencent/mm/plugin/game/wepkg/downloader/f:mFilePath	Ljava/lang/String;
    //   508: astore 8
    //   510: aload_0
    //   511: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   514: getfield 106	com/tencent/mm/plugin/game/wepkg/downloader/f:kev	Ljava/lang/String;
    //   517: astore 9
    //   519: aload_0
    //   520: getfield 151	com/tencent/mm/plugin/game/wepkg/downloader/c:kef	Z
    //   523: ifeq +140 -> 663
    //   526: iload_3
    //   527: ifeq +136 -> 663
    //   530: ldc 99
    //   532: ldc -39
    //   534: iconst_2
    //   535: anewarray 4	java/lang/Object
    //   538: dup
    //   539: iconst_0
    //   540: aload 9
    //   542: aastore
    //   543: dup
    //   544: iconst_1
    //   545: aload 8
    //   547: aastore
    //   548: invokestatic 220	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   551: aload 8
    //   553: invokestatic 205	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   556: ifeq +113 -> 669
    //   559: new 222	java/io/FileNotFoundException
    //   562: dup
    //   563: ldc -32
    //   565: iconst_1
    //   566: anewarray 4	java/lang/Object
    //   569: dup
    //   570: iconst_0
    //   571: aload 9
    //   573: aastore
    //   574: invokestatic 228	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   577: invokespecial 231	java/io/FileNotFoundException:<init>	(Ljava/lang/String;)V
    //   580: athrow
    //   581: astore 9
    //   583: aconst_null
    //   584: astore 10
    //   586: aload 7
    //   588: astore 8
    //   590: aload 10
    //   592: astore 7
    //   594: aload_0
    //   595: getfield 233	com/tencent/mm/plugin/game/wepkg/downloader/c:kee	Z
    //   598: ifeq +231 -> 829
    //   601: aload_0
    //   602: sipush 1001
    //   605: putfield 32	com/tencent/mm/plugin/game/wepkg/downloader/c:retCode	I
    //   608: ldc 99
    //   610: ldc -21
    //   612: iconst_1
    //   613: anewarray 4	java/lang/Object
    //   616: dup
    //   617: iconst_0
    //   618: aload 9
    //   620: invokevirtual 238	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   623: aastore
    //   624: invokestatic 241	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   627: aload 8
    //   629: invokestatic 121	com/tencent/mm/pluginsdk/g/a/d/a:g	(Ljava/io/Closeable;)V
    //   632: aload 7
    //   634: invokestatic 121	com/tencent/mm/pluginsdk/g/a/d/a:g	(Ljava/io/Closeable;)V
    //   637: return
    //   638: new 243	java/io/BufferedInputStream
    //   641: dup
    //   642: aload 7
    //   644: invokespecial 244	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   647: astore 7
    //   649: goto -148 -> 501
    //   652: astore 9
    //   654: aconst_null
    //   655: astore 7
    //   657: aconst_null
    //   658: astore 8
    //   660: goto -66 -> 594
    //   663: iconst_0
    //   664: istore 4
    //   666: goto -136 -> 530
    //   669: new 246	java/io/BufferedOutputStream
    //   672: dup
    //   673: new 248	java/io/FileOutputStream
    //   676: dup
    //   677: aload 8
    //   679: iload 4
    //   681: invokespecial 251	java/io/FileOutputStream:<init>	(Ljava/lang/String;Z)V
    //   684: invokespecial 254	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   687: astore 8
    //   689: ldc 99
    //   691: ldc_w 256
    //   694: iconst_3
    //   695: anewarray 4	java/lang/Object
    //   698: dup
    //   699: iconst_0
    //   700: aload_0
    //   701: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   704: getfield 106	com/tencent/mm/plugin/game/wepkg/downloader/f:kev	Ljava/lang/String;
    //   707: aastore
    //   708: dup
    //   709: iconst_1
    //   710: aload_0
    //   711: getfield 151	com/tencent/mm/plugin/game/wepkg/downloader/c:kef	Z
    //   714: invokestatic 172	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   717: aastore
    //   718: dup
    //   719: iconst_2
    //   720: iload_3
    //   721: invokestatic 172	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   724: aastore
    //   725: invokestatic 115	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   728: sipush 4096
    //   731: newarray <illegal type>
    //   733: astore 9
    //   735: iconst_0
    //   736: istore_1
    //   737: aload 7
    //   739: aload 9
    //   741: iconst_0
    //   742: sipush 4096
    //   745: invokevirtual 262	java/io/InputStream:read	([BII)I
    //   748: istore_2
    //   749: iload_2
    //   750: iconst_m1
    //   751: if_icmpeq +19 -> 770
    //   754: aload 8
    //   756: aload 9
    //   758: iconst_0
    //   759: iload_2
    //   760: invokevirtual 268	java/io/OutputStream:write	([BII)V
    //   763: iload_1
    //   764: iload_2
    //   765: iadd
    //   766: istore_1
    //   767: goto -30 -> 737
    //   770: ldc 99
    //   772: ldc_w 270
    //   775: iconst_2
    //   776: anewarray 4	java/lang/Object
    //   779: dup
    //   780: iconst_0
    //   781: aload_0
    //   782: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   785: getfield 273	com/tencent/mm/plugin/game/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   788: aastore
    //   789: dup
    //   790: iconst_1
    //   791: iload_1
    //   792: invokestatic 109	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   795: aastore
    //   796: invokestatic 115	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   799: aload 8
    //   801: invokevirtual 276	java/io/OutputStream:flush	()V
    //   804: ldc 99
    //   806: ldc_w 278
    //   809: iconst_1
    //   810: anewarray 4	java/lang/Object
    //   813: dup
    //   814: iconst_0
    //   815: aload_0
    //   816: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   819: getfield 273	com/tencent/mm/plugin/game/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   822: aastore
    //   823: invokestatic 115	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   826: goto -735 -> 91
    //   829: invokestatic 284	com/tencent/mm/kernel/g:DF	()Lcom/tencent/mm/ab/o;
    //   832: invokevirtual 289	com/tencent/mm/ab/o:Lg	()I
    //   835: ifne +40 -> 875
    //   838: aload_0
    //   839: sipush 1002
    //   842: putfield 32	com/tencent/mm/plugin/game/wepkg/downloader/c:retCode	I
    //   845: goto -237 -> 608
    //   848: astore 10
    //   850: aload 8
    //   852: astore 9
    //   854: aload 7
    //   856: astore 8
    //   858: aload 10
    //   860: astore 7
    //   862: aload 9
    //   864: invokestatic 121	com/tencent/mm/pluginsdk/g/a/d/a:g	(Ljava/io/Closeable;)V
    //   867: aload 8
    //   869: invokestatic 121	com/tencent/mm/pluginsdk/g/a/d/a:g	(Ljava/io/Closeable;)V
    //   872: aload 7
    //   874: athrow
    //   875: sipush 1000
    //   878: istore_1
    //   879: aload 9
    //   881: instanceof 291
    //   884: ifeq +15 -> 899
    //   887: sipush 1013
    //   890: istore_1
    //   891: aload_0
    //   892: iload_1
    //   893: putfield 32	com/tencent/mm/plugin/game/wepkg/downloader/c:retCode	I
    //   896: goto -288 -> 608
    //   899: aload 9
    //   901: instanceof 293
    //   904: ifeq +10 -> 914
    //   907: sipush 1003
    //   910: istore_1
    //   911: goto -20 -> 891
    //   914: aload 9
    //   916: instanceof 295
    //   919: ifeq +10 -> 929
    //   922: sipush 1004
    //   925: istore_1
    //   926: goto -35 -> 891
    //   929: aload 9
    //   931: instanceof 297
    //   934: ifeq +10 -> 944
    //   937: sipush 1005
    //   940: istore_1
    //   941: goto -50 -> 891
    //   944: aload 9
    //   946: instanceof 299
    //   949: ifeq +10 -> 959
    //   952: sipush 1006
    //   955: istore_1
    //   956: goto -65 -> 891
    //   959: aload 9
    //   961: instanceof 301
    //   964: ifeq +10 -> 974
    //   967: sipush 1007
    //   970: istore_1
    //   971: goto -80 -> 891
    //   974: aload 9
    //   976: instanceof 303
    //   979: istore_3
    //   980: iload_3
    //   981: ifeq -90 -> 891
    //   984: sipush 1008
    //   987: istore_1
    //   988: goto -97 -> 891
    //   991: astore 7
    //   993: aconst_null
    //   994: astore 8
    //   996: aconst_null
    //   997: astore 9
    //   999: goto -137 -> 862
    //   1002: astore 8
    //   1004: aconst_null
    //   1005: astore 10
    //   1007: aload 7
    //   1009: astore 9
    //   1011: aload 8
    //   1013: astore 7
    //   1015: aload 10
    //   1017: astore 8
    //   1019: goto -157 -> 862
    //   1022: astore 9
    //   1024: aload 7
    //   1026: astore 10
    //   1028: aload 9
    //   1030: astore 7
    //   1032: aload 10
    //   1034: astore 9
    //   1036: goto -174 -> 862
    //   1039: astore 9
    //   1041: aload 7
    //   1043: astore 10
    //   1045: aload 8
    //   1047: astore 7
    //   1049: aload 10
    //   1051: astore 8
    //   1053: goto -459 -> 594
    //   1056: goto -850 -> 206
    //   1059: goto -979 -> 80
    //   1062: iconst_0
    //   1063: istore_3
    //   1064: goto -896 -> 168
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1067	0	this	c
    //   736	252	1	i	int
    //   748	18	2	j	int
    //   167	897	3	bool1	boolean
    //   1	679	4	bool2	boolean
    //   204	223	5	l	long
    //   89	784	7	localObject1	Object
    //   991	17	7	localObject2	Object
    //   1013	35	7	localObject3	Object
    //   4	991	8	localObject4	Object
    //   1002	10	8	localObject5	Object
    //   1017	35	8	localObject6	Object
    //   517	55	9	str	String
    //   581	38	9	localException1	Exception
    //   652	1	9	localException2	Exception
    //   733	277	9	localObject7	Object
    //   1022	7	9	localObject8	Object
    //   1034	1	9	localObject9	Object
    //   1039	1	9	localException3	Exception
    //   584	7	10	localObject10	Object
    //   848	11	10	localObject11	Object
    //   1005	45	10	localObject12	Object
    // Exception table:
    //   from	to	target	type
    //   501	526	581	java/lang/Exception
    //   530	581	581	java/lang/Exception
    //   669	689	581	java/lang/Exception
    //   6	80	652	java/lang/Exception
    //   80	88	652	java/lang/Exception
    //   102	166	652	java/lang/Exception
    //   168	175	652	java/lang/Exception
    //   179	206	652	java/lang/Exception
    //   206	260	652	java/lang/Exception
    //   269	276	652	java/lang/Exception
    //   282	301	652	java/lang/Exception
    //   306	316	652	java/lang/Exception
    //   325	352	652	java/lang/Exception
    //   357	373	652	java/lang/Exception
    //   378	442	652	java/lang/Exception
    //   448	501	652	java/lang/Exception
    //   638	649	652	java/lang/Exception
    //   594	608	848	finally
    //   608	627	848	finally
    //   829	845	848	finally
    //   879	887	848	finally
    //   891	896	848	finally
    //   899	907	848	finally
    //   914	922	848	finally
    //   929	937	848	finally
    //   944	952	848	finally
    //   959	967	848	finally
    //   974	980	848	finally
    //   6	80	991	finally
    //   80	88	991	finally
    //   102	166	991	finally
    //   168	175	991	finally
    //   179	206	991	finally
    //   206	260	991	finally
    //   269	276	991	finally
    //   282	301	991	finally
    //   306	316	991	finally
    //   325	352	991	finally
    //   357	373	991	finally
    //   378	442	991	finally
    //   448	501	991	finally
    //   638	649	991	finally
    //   501	526	1002	finally
    //   530	581	1002	finally
    //   669	689	1002	finally
    //   689	735	1022	finally
    //   737	749	1022	finally
    //   754	763	1022	finally
    //   770	826	1022	finally
    //   689	735	1039	java/lang/Exception
    //   737	749	1039	java/lang/Exception
    //   754	763	1039	java/lang/Exception
    //   770	826	1039	java/lang/Exception
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   4: ifnonnull +4 -> 8
    //   7: return
    //   8: aload_0
    //   9: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   12: getfield 273	com/tencent/mm/plugin/game/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   15: ifnull -8 -> 7
    //   18: aload_0
    //   19: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   22: getfield 307	com/tencent/mm/plugin/game/wepkg/downloader/f:isR	I
    //   25: istore_3
    //   26: iconst_0
    //   27: istore_1
    //   28: new 309	java/net/URL
    //   31: dup
    //   32: aload_0
    //   33: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   36: getfield 273	com/tencent/mm/plugin/game/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   39: invokespecial 310	java/net/URL:<init>	(Ljava/lang/String;)V
    //   42: astore 7
    //   44: aload_0
    //   45: aload 7
    //   47: invokevirtual 314	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   50: checkcast 92	java/net/HttpURLConnection
    //   53: putfield 90	com/tencent/mm/plugin/game/wepkg/downloader/c:kea	Ljava/net/HttpURLConnection;
    //   56: aload_0
    //   57: getfield 90	com/tencent/mm/plugin/game/wepkg/downloader/c:kea	Ljava/net/HttpURLConnection;
    //   60: aload_0
    //   61: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   64: getfield 317	com/tencent/mm/plugin/game/wepkg/downloader/f:keC	I
    //   67: invokevirtual 321	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   70: aload_0
    //   71: getfield 90	com/tencent/mm/plugin/game/wepkg/downloader/c:kea	Ljava/net/HttpURLConnection;
    //   74: aload_0
    //   75: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   78: getfield 324	com/tencent/mm/plugin/game/wepkg/downloader/f:keD	I
    //   81: invokevirtual 327	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   84: aload_0
    //   85: getfield 90	com/tencent/mm/plugin/game/wepkg/downloader/c:kea	Ljava/net/HttpURLConnection;
    //   88: iconst_0
    //   89: invokevirtual 331	java/net/HttpURLConnection:setUseCaches	(Z)V
    //   92: aload_0
    //   93: getfield 90	com/tencent/mm/plugin/game/wepkg/downloader/c:kea	Ljava/net/HttpURLConnection;
    //   96: iconst_1
    //   97: invokevirtual 334	java/net/HttpURLConnection:setDoInput	(Z)V
    //   100: aload_0
    //   101: getfield 90	com/tencent/mm/plugin/game/wepkg/downloader/c:kea	Ljava/net/HttpURLConnection;
    //   104: ldc_w 336
    //   107: invokevirtual 339	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   110: aload_0
    //   111: getfield 90	com/tencent/mm/plugin/game/wepkg/downloader/c:kea	Ljava/net/HttpURLConnection;
    //   114: iconst_0
    //   115: invokevirtual 342	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   118: aload_0
    //   119: getfield 90	com/tencent/mm/plugin/game/wepkg/downloader/c:kea	Ljava/net/HttpURLConnection;
    //   122: iconst_1
    //   123: invokevirtual 345	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   126: aload_0
    //   127: getfield 90	com/tencent/mm/plugin/game/wepkg/downloader/c:kea	Ljava/net/HttpURLConnection;
    //   130: ldc_w 347
    //   133: ldc_w 349
    //   136: invokevirtual 352	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   139: ldc_w 354
    //   142: invokestatic 359	java/lang/System:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   145: astore 8
    //   147: aload 8
    //   149: invokestatic 205	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   152: ifne +15 -> 167
    //   155: aload_0
    //   156: getfield 90	com/tencent/mm/plugin/game/wepkg/downloader/c:kea	Ljava/net/HttpURLConnection;
    //   159: ldc_w 361
    //   162: aload 8
    //   164: invokevirtual 352	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   167: aload_0
    //   168: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   171: getfield 364	com/tencent/mm/plugin/game/wepkg/downloader/f:keE	Z
    //   174: ifeq +362 -> 536
    //   177: aload_0
    //   178: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   181: getfield 159	com/tencent/mm/plugin/game/wepkg/downloader/f:mFilePath	Ljava/lang/String;
    //   184: invokestatic 367	com/tencent/mm/pluginsdk/g/a/d/a:Io	(Ljava/lang/String;)J
    //   187: lstore 4
    //   189: ldc 99
    //   191: ldc_w 369
    //   194: iconst_2
    //   195: anewarray 4	java/lang/Object
    //   198: dup
    //   199: iconst_0
    //   200: aload_0
    //   201: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   204: getfield 106	com/tencent/mm/plugin/game/wepkg/downloader/f:kev	Ljava/lang/String;
    //   207: aastore
    //   208: dup
    //   209: iconst_1
    //   210: lload 4
    //   212: invokestatic 190	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   215: aastore
    //   216: invokestatic 115	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   219: lload 4
    //   221: lconst_0
    //   222: lcmp
    //   223: ifne +273 -> 496
    //   226: iconst_0
    //   227: istore 6
    //   229: aload_0
    //   230: iload 6
    //   232: putfield 151	com/tencent/mm/plugin/game/wepkg/downloader/c:kef	Z
    //   235: ldc_w 371
    //   238: aload 7
    //   240: invokevirtual 374	java/net/URL:getProtocol	()Ljava/lang/String;
    //   243: invokevirtual 210	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   246: ifeq +88 -> 334
    //   249: aload_0
    //   250: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   253: getfield 317	com/tencent/mm/plugin/game/wepkg/downloader/f:keC	I
    //   256: istore_2
    //   257: aload_0
    //   258: getfield 90	com/tencent/mm/plugin/game/wepkg/downloader/c:kea	Ljava/net/HttpURLConnection;
    //   261: checkcast 376	javax/net/ssl/HttpsURLConnection
    //   264: astore 9
    //   266: ldc_w 378
    //   269: invokestatic 380	com/tencent/mm/plugin/game/wepkg/downloader/c:Eb	(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;
    //   272: astore 8
    //   274: aload 8
    //   276: astore 7
    //   278: aload 8
    //   280: ifnonnull +25 -> 305
    //   283: ldc_w 382
    //   286: invokestatic 380	com/tencent/mm/plugin/game/wepkg/downloader/c:Eb	(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;
    //   289: astore 8
    //   291: aload 8
    //   293: astore 7
    //   295: aload 8
    //   297: ifnonnull +8 -> 305
    //   300: invokestatic 386	javax/net/ssl/SSLContext:getDefault	()Ljavax/net/ssl/SSLContext;
    //   303: astore 7
    //   305: aload 7
    //   307: ifnull +420 -> 727
    //   310: aload 7
    //   312: aconst_null
    //   313: aconst_null
    //   314: new 388	java/security/SecureRandom
    //   317: dup
    //   318: invokespecial 389	java/security/SecureRandom:<init>	()V
    //   321: invokevirtual 393	javax/net/ssl/SSLContext:init	([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V
    //   324: aload 9
    //   326: aload 7
    //   328: invokevirtual 397	javax/net/ssl/SSLContext:getSocketFactory	()Ljavax/net/ssl/SSLSocketFactory;
    //   331: invokevirtual 401	javax/net/ssl/HttpsURLConnection:setSSLSocketFactory	(Ljavax/net/ssl/SSLSocketFactory;)V
    //   334: aload_0
    //   335: invokespecial 403	com/tencent/mm/plugin/game/wepkg/downloader/c:aVr	()V
    //   338: ldc 99
    //   340: ldc_w 405
    //   343: iconst_1
    //   344: anewarray 4	java/lang/Object
    //   347: dup
    //   348: iconst_0
    //   349: aload_0
    //   350: getfield 32	com/tencent/mm/plugin/game/wepkg/downloader/c:retCode	I
    //   353: invokestatic 109	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   356: aastore
    //   357: invokestatic 115	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   360: aload_0
    //   361: getfield 32	com/tencent/mm/plugin/game/wepkg/downloader/c:retCode	I
    //   364: ifne +469 -> 833
    //   367: aload_0
    //   368: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   371: getfield 409	com/tencent/mm/plugin/game/wepkg/downloader/f:keF	Lcom/tencent/mm/plugin/game/wepkg/downloader/a;
    //   374: ifnull +596 -> 970
    //   377: aload_0
    //   378: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   381: getfield 409	com/tencent/mm/plugin/game/wepkg/downloader/f:keF	Lcom/tencent/mm/plugin/game/wepkg/downloader/a;
    //   384: astore 7
    //   386: aload_0
    //   387: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   390: astore 8
    //   392: aload_0
    //   393: getfield 34	com/tencent/mm/plugin/game/wepkg/downloader/c:keg	Z
    //   396: ifeq +432 -> 828
    //   399: iconst_1
    //   400: istore_2
    //   401: aload 7
    //   403: new 411	com/tencent/mm/plugin/game/wepkg/downloader/g
    //   406: dup
    //   407: aload 8
    //   409: iconst_1
    //   410: iconst_0
    //   411: iload_2
    //   412: iload_1
    //   413: invokespecial 414	com/tencent/mm/plugin/game/wepkg/downloader/g:<init>	(Lcom/tencent/mm/plugin/game/wepkg/downloader/f;IIII)V
    //   416: invokeinterface 420 2 0
    //   421: aload_0
    //   422: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   425: getfield 273	com/tencent/mm/plugin/game/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   428: ldc_w 371
    //   431: invokevirtual 175	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   434: ifeq -427 -> 7
    //   437: aload_0
    //   438: getfield 32	com/tencent/mm/plugin/game/wepkg/downloader/c:retCode	I
    //   441: sipush 1013
    //   444: if_icmpne -437 -> 7
    //   447: iload_1
    //   448: iload_3
    //   449: iconst_1
    //   450: isub
    //   451: if_icmplt -444 -> 7
    //   454: ldc 99
    //   456: ldc_w 422
    //   459: invokestatic 156	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   462: aload_0
    //   463: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   466: aload_0
    //   467: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   470: getfield 273	com/tencent/mm/plugin/game/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   473: ldc_w 371
    //   476: ldc_w 424
    //   479: invokevirtual 428	java/lang/String:replaceFirst	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   482: putfield 273	com/tencent/mm/plugin/game/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   485: aload_0
    //   486: iconst_0
    //   487: putfield 32	com/tencent/mm/plugin/game/wepkg/downloader/c:retCode	I
    //   490: aload_0
    //   491: iconst_0
    //   492: putfield 34	com/tencent/mm/plugin/game/wepkg/downloader/c:keg	Z
    //   495: return
    //   496: aload_0
    //   497: getfield 90	com/tencent/mm/plugin/game/wepkg/downloader/c:kea	Ljava/net/HttpURLConnection;
    //   500: ldc_w 430
    //   503: new 432	java/lang/StringBuilder
    //   506: dup
    //   507: ldc_w 434
    //   510: invokespecial 435	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   513: lload 4
    //   515: invokevirtual 439	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   518: ldc_w 441
    //   521: invokevirtual 444	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   524: invokevirtual 447	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   527: invokevirtual 450	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   530: iconst_1
    //   531: istore 6
    //   533: goto -304 -> 229
    //   536: aload_0
    //   537: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   540: getfield 159	com/tencent/mm/plugin/game/wepkg/downloader/f:mFilePath	Ljava/lang/String;
    //   543: invokestatic 163	com/tencent/mm/pluginsdk/g/a/d/a:Tr	(Ljava/lang/String;)Z
    //   546: pop
    //   547: goto -312 -> 235
    //   550: astore 7
    //   552: ldc 99
    //   554: ldc_w 452
    //   557: iconst_1
    //   558: anewarray 4	java/lang/Object
    //   561: dup
    //   562: iconst_0
    //   563: aload 7
    //   565: invokevirtual 238	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   568: aastore
    //   569: invokestatic 241	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   572: iload_1
    //   573: istore_2
    //   574: aload_0
    //   575: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   578: getfield 273	com/tencent/mm/plugin/game/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   581: ldc_w 371
    //   584: invokevirtual 175	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   587: ifeq +67 -> 654
    //   590: iload_1
    //   591: istore_2
    //   592: aload_0
    //   593: getfield 32	com/tencent/mm/plugin/game/wepkg/downloader/c:retCode	I
    //   596: sipush 1013
    //   599: if_icmpne +55 -> 654
    //   602: iload_1
    //   603: istore_2
    //   604: iload_1
    //   605: iload_3
    //   606: iconst_1
    //   607: isub
    //   608: if_icmplt +46 -> 654
    //   611: ldc 99
    //   613: ldc_w 422
    //   616: invokestatic 156	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   619: aload_0
    //   620: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   623: aload_0
    //   624: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   627: getfield 273	com/tencent/mm/plugin/game/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   630: ldc_w 371
    //   633: ldc_w 424
    //   636: invokevirtual 428	java/lang/String:replaceFirst	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   639: putfield 273	com/tencent/mm/plugin/game/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   642: aload_0
    //   643: iconst_0
    //   644: putfield 32	com/tencent/mm/plugin/game/wepkg/downloader/c:retCode	I
    //   647: aload_0
    //   648: iconst_0
    //   649: putfield 34	com/tencent/mm/plugin/game/wepkg/downloader/c:keg	Z
    //   652: iconst_m1
    //   653: istore_2
    //   654: iload_2
    //   655: iconst_1
    //   656: iadd
    //   657: istore_2
    //   658: iload_2
    //   659: istore_1
    //   660: iload_2
    //   661: iload_3
    //   662: if_icmplt -634 -> 28
    //   665: aload_0
    //   666: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   669: getfield 409	com/tencent/mm/plugin/game/wepkg/downloader/f:keF	Lcom/tencent/mm/plugin/game/wepkg/downloader/a;
    //   672: ifnull -665 -> 7
    //   675: aload_0
    //   676: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   679: getfield 409	com/tencent/mm/plugin/game/wepkg/downloader/f:keF	Lcom/tencent/mm/plugin/game/wepkg/downloader/a;
    //   682: astore 7
    //   684: aload_0
    //   685: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   688: astore 8
    //   690: aload_0
    //   691: getfield 32	com/tencent/mm/plugin/game/wepkg/downloader/c:retCode	I
    //   694: istore_3
    //   695: aload_0
    //   696: getfield 34	com/tencent/mm/plugin/game/wepkg/downloader/c:keg	Z
    //   699: ifeq +356 -> 1055
    //   702: iconst_1
    //   703: istore_1
    //   704: aload 7
    //   706: new 411	com/tencent/mm/plugin/game/wepkg/downloader/g
    //   709: dup
    //   710: aload 8
    //   712: iconst_2
    //   713: iload_3
    //   714: iload_1
    //   715: iload_2
    //   716: invokespecial 414	com/tencent/mm/plugin/game/wepkg/downloader/g:<init>	(Lcom/tencent/mm/plugin/game/wepkg/downloader/f;IIII)V
    //   719: invokeinterface 420 2 0
    //   724: return
    //   725: astore 7
    //   727: aload 9
    //   729: iload_2
    //   730: new 454	android/net/SSLSessionCache
    //   733: dup
    //   734: invokestatic 460	com/tencent/mm/sdk/platformtools/ad:getContext	()Landroid/content/Context;
    //   737: invokespecial 463	android/net/SSLSessionCache:<init>	(Landroid/content/Context;)V
    //   740: invokestatic 468	android/net/SSLCertificateSocketFactory:getDefault	(ILandroid/net/SSLSessionCache;)Ljavax/net/ssl/SSLSocketFactory;
    //   743: invokevirtual 401	javax/net/ssl/HttpsURLConnection:setSSLSocketFactory	(Ljavax/net/ssl/SSLSocketFactory;)V
    //   746: goto -412 -> 334
    //   749: astore 7
    //   751: aload_0
    //   752: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   755: getfield 273	com/tencent/mm/plugin/game/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   758: ldc_w 371
    //   761: invokevirtual 175	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   764: ifeq +61 -> 825
    //   767: aload_0
    //   768: getfield 32	com/tencent/mm/plugin/game/wepkg/downloader/c:retCode	I
    //   771: sipush 1013
    //   774: if_icmpne +51 -> 825
    //   777: iload_1
    //   778: iload_3
    //   779: iconst_1
    //   780: isub
    //   781: if_icmplt +44 -> 825
    //   784: ldc 99
    //   786: ldc_w 422
    //   789: invokestatic 156	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   792: aload_0
    //   793: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   796: aload_0
    //   797: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   800: getfield 273	com/tencent/mm/plugin/game/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   803: ldc_w 371
    //   806: ldc_w 424
    //   809: invokevirtual 428	java/lang/String:replaceFirst	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   812: putfield 273	com/tencent/mm/plugin/game/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   815: aload_0
    //   816: iconst_0
    //   817: putfield 32	com/tencent/mm/plugin/game/wepkg/downloader/c:retCode	I
    //   820: aload_0
    //   821: iconst_0
    //   822: putfield 34	com/tencent/mm/plugin/game/wepkg/downloader/c:keg	Z
    //   825: aload 7
    //   827: athrow
    //   828: iconst_0
    //   829: istore_2
    //   830: goto -429 -> 401
    //   833: aload_0
    //   834: getfield 32	com/tencent/mm/plugin/game/wepkg/downloader/c:retCode	I
    //   837: sipush 1011
    //   840: if_icmpeq +45 -> 885
    //   843: aload_0
    //   844: getfield 32	com/tencent/mm/plugin/game/wepkg/downloader/c:retCode	I
    //   847: sipush 1001
    //   850: if_icmpeq +35 -> 885
    //   853: aload_0
    //   854: getfield 32	com/tencent/mm/plugin/game/wepkg/downloader/c:retCode	I
    //   857: sipush 1009
    //   860: if_icmpeq +25 -> 885
    //   863: aload_0
    //   864: getfield 32	com/tencent/mm/plugin/game/wepkg/downloader/c:retCode	I
    //   867: sipush 1002
    //   870: if_icmpeq +15 -> 885
    //   873: aload_0
    //   874: getfield 32	com/tencent/mm/plugin/game/wepkg/downloader/c:retCode	I
    //   877: istore_2
    //   878: iload_2
    //   879: sipush 1007
    //   882: if_icmpne +88 -> 970
    //   885: iload_1
    //   886: istore_2
    //   887: aload_0
    //   888: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   891: getfield 273	com/tencent/mm/plugin/game/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   894: ldc_w 371
    //   897: invokevirtual 175	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   900: ifeq -235 -> 665
    //   903: iload_1
    //   904: istore_2
    //   905: aload_0
    //   906: getfield 32	com/tencent/mm/plugin/game/wepkg/downloader/c:retCode	I
    //   909: sipush 1013
    //   912: if_icmpne -247 -> 665
    //   915: iload_1
    //   916: istore_2
    //   917: iload_1
    //   918: iload_3
    //   919: iconst_1
    //   920: isub
    //   921: if_icmplt -256 -> 665
    //   924: ldc 99
    //   926: ldc_w 422
    //   929: invokestatic 156	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   932: aload_0
    //   933: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   936: aload_0
    //   937: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   940: getfield 273	com/tencent/mm/plugin/game/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   943: ldc_w 371
    //   946: ldc_w 424
    //   949: invokevirtual 428	java/lang/String:replaceFirst	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   952: putfield 273	com/tencent/mm/plugin/game/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   955: aload_0
    //   956: iconst_0
    //   957: putfield 32	com/tencent/mm/plugin/game/wepkg/downloader/c:retCode	I
    //   960: aload_0
    //   961: iconst_0
    //   962: putfield 34	com/tencent/mm/plugin/game/wepkg/downloader/c:keg	Z
    //   965: iconst_m1
    //   966: istore_2
    //   967: goto -302 -> 665
    //   970: iload_1
    //   971: istore_2
    //   972: aload_0
    //   973: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   976: getfield 273	com/tencent/mm/plugin/game/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   979: ldc_w 371
    //   982: invokevirtual 175	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   985: ifeq -331 -> 654
    //   988: iload_1
    //   989: istore_2
    //   990: aload_0
    //   991: getfield 32	com/tencent/mm/plugin/game/wepkg/downloader/c:retCode	I
    //   994: sipush 1013
    //   997: if_icmpne -343 -> 654
    //   1000: iload_1
    //   1001: istore_2
    //   1002: iload_1
    //   1003: iload_3
    //   1004: iconst_1
    //   1005: isub
    //   1006: if_icmplt -352 -> 654
    //   1009: ldc 99
    //   1011: ldc_w 422
    //   1014: invokestatic 156	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1017: aload_0
    //   1018: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   1021: aload_0
    //   1022: getfield 36	com/tencent/mm/plugin/game/wepkg/downloader/c:kdY	Lcom/tencent/mm/plugin/game/wepkg/downloader/f;
    //   1025: getfield 273	com/tencent/mm/plugin/game/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   1028: ldc_w 371
    //   1031: ldc_w 424
    //   1034: invokevirtual 428	java/lang/String:replaceFirst	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1037: putfield 273	com/tencent/mm/plugin/game/wepkg/downloader/f:mUrl	Ljava/lang/String;
    //   1040: aload_0
    //   1041: iconst_0
    //   1042: putfield 32	com/tencent/mm/plugin/game/wepkg/downloader/c:retCode	I
    //   1045: aload_0
    //   1046: iconst_0
    //   1047: putfield 34	com/tencent/mm/plugin/game/wepkg/downloader/c:keg	Z
    //   1050: iconst_m1
    //   1051: istore_2
    //   1052: goto -398 -> 654
    //   1055: iconst_0
    //   1056: istore_1
    //   1057: goto -353 -> 704
    //   1060: astore 7
    //   1062: aload 8
    //   1064: astore 7
    //   1066: goto -761 -> 305
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1069	0	this	c
    //   27	1030	1	i	int
    //   256	796	2	j	int
    //   25	981	3	k	int
    //   187	327	4	l	long
    //   227	305	6	bool	boolean
    //   42	360	7	localObject1	Object
    //   550	14	7	localException1	Exception
    //   682	23	7	locala	a
    //   725	1	7	localException2	Exception
    //   749	77	7	localObject2	Object
    //   1060	1	7	localException3	Exception
    //   1064	1	7	localObject3	Object
    //   145	918	8	localObject4	Object
    //   264	464	9	localHttpsURLConnection	javax.net.ssl.HttpsURLConnection
    // Exception table:
    //   from	to	target	type
    //   28	167	550	java/lang/Exception
    //   167	219	550	java/lang/Exception
    //   229	235	550	java/lang/Exception
    //   235	274	550	java/lang/Exception
    //   283	291	550	java/lang/Exception
    //   334	399	550	java/lang/Exception
    //   401	421	550	java/lang/Exception
    //   496	530	550	java/lang/Exception
    //   536	547	550	java/lang/Exception
    //   727	746	550	java/lang/Exception
    //   833	878	550	java/lang/Exception
    //   310	334	725	java/lang/Exception
    //   28	167	749	finally
    //   167	219	749	finally
    //   229	235	749	finally
    //   235	274	749	finally
    //   283	291	749	finally
    //   300	305	749	finally
    //   310	334	749	finally
    //   334	399	749	finally
    //   401	421	749	finally
    //   496	530	749	finally
    //   536	547	749	finally
    //   552	572	749	finally
    //   727	746	749	finally
    //   833	878	749	finally
    //   300	305	1060	java/lang/Exception
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/game/wepkg/downloader/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */