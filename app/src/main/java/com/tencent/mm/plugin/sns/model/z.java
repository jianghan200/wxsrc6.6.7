package com.tencent.mm.plugin.sns.model;

import android.graphics.BitmapFactory.Options;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.modelcdntran.g;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.sns.storage.r;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.protocal.c.atb;
import com.tencent.mm.protocal.c.ath;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bok;
import com.tencent.mm.protocal.c.bqb;
import com.tencent.mm.protocal.c.bqc;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class z
  extends l
  implements k
{
  private int dHI;
  private int dVE;
  public String dVk;
  int dVl;
  private i.a dVu;
  private com.tencent.mm.ab.b diG;
  public com.tencent.mm.ab.e diJ;
  private int nkZ;
  private String noN;
  private bqb noO;
  private String noP;
  private boolean noQ;
  private boolean noR;
  private boolean noS;
  long noT;
  int noU;
  private int offset;
  private String path;
  long startTime;
  
  /* Error */
  public z(int paramInt1, String paramString, boolean paramBoolean, int paramInt2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 40	com/tencent/mm/ab/l:<init>	()V
    //   4: aload_0
    //   5: sipush 8192
    //   8: putfield 42	com/tencent/mm/plugin/sns/model/z:dVE	I
    //   11: aload_0
    //   12: iconst_0
    //   13: putfield 44	com/tencent/mm/plugin/sns/model/z:offset	I
    //   16: aload_0
    //   17: ldc 46
    //   19: putfield 48	com/tencent/mm/plugin/sns/model/z:path	Ljava/lang/String;
    //   22: aload_0
    //   23: ldc 46
    //   25: putfield 50	com/tencent/mm/plugin/sns/model/z:noN	Ljava/lang/String;
    //   28: aload_0
    //   29: iconst_0
    //   30: putfield 52	com/tencent/mm/plugin/sns/model/z:nkZ	I
    //   33: aload_0
    //   34: ldc 46
    //   36: putfield 54	com/tencent/mm/plugin/sns/model/z:noP	Ljava/lang/String;
    //   39: aload_0
    //   40: ldc 46
    //   42: putfield 56	com/tencent/mm/plugin/sns/model/z:dVk	Ljava/lang/String;
    //   45: aload_0
    //   46: iconst_0
    //   47: putfield 58	com/tencent/mm/plugin/sns/model/z:noQ	Z
    //   50: aload_0
    //   51: iconst_0
    //   52: putfield 60	com/tencent/mm/plugin/sns/model/z:noR	Z
    //   55: aload_0
    //   56: iconst_0
    //   57: putfield 62	com/tencent/mm/plugin/sns/model/z:noS	Z
    //   60: aload_0
    //   61: lconst_0
    //   62: putfield 64	com/tencent/mm/plugin/sns/model/z:noT	J
    //   65: aload_0
    //   66: lconst_0
    //   67: putfield 66	com/tencent/mm/plugin/sns/model/z:startTime	J
    //   70: aload_0
    //   71: iconst_0
    //   72: putfield 68	com/tencent/mm/plugin/sns/model/z:dVl	I
    //   75: aload_0
    //   76: iconst_0
    //   77: putfield 70	com/tencent/mm/plugin/sns/model/z:noU	I
    //   80: aload_0
    //   81: new 72	com/tencent/mm/plugin/sns/model/z$1
    //   84: dup
    //   85: aload_0
    //   86: invokespecial 75	com/tencent/mm/plugin/sns/model/z$1:<init>	(Lcom/tencent/mm/plugin/sns/model/z;)V
    //   89: putfield 77	com/tencent/mm/plugin/sns/model/z:dVu	Lcom/tencent/mm/modelcdntran/i$a;
    //   92: aload_0
    //   93: invokestatic 83	java/lang/System:currentTimeMillis	()J
    //   96: putfield 64	com/tencent/mm/plugin/sns/model/z:noT	J
    //   99: aload_0
    //   100: iload_1
    //   101: putfield 52	com/tencent/mm/plugin/sns/model/z:nkZ	I
    //   104: aload_0
    //   105: aload_2
    //   106: putfield 54	com/tencent/mm/plugin/sns/model/z:noP	Ljava/lang/String;
    //   109: aload_0
    //   110: iload 4
    //   112: putfield 70	com/tencent/mm/plugin/sns/model/z:noU	I
    //   115: new 85	com/tencent/mm/ab/b$a
    //   118: dup
    //   119: invokespecial 86	com/tencent/mm/ab/b$a:<init>	()V
    //   122: astore_2
    //   123: aload_2
    //   124: new 88	com/tencent/mm/protocal/c/bqb
    //   127: dup
    //   128: invokespecial 89	com/tencent/mm/protocal/c/bqb:<init>	()V
    //   131: putfield 93	com/tencent/mm/ab/b$a:dIG	Lcom/tencent/mm/bk/a;
    //   134: aload_2
    //   135: new 95	com/tencent/mm/protocal/c/bqc
    //   138: dup
    //   139: invokespecial 96	com/tencent/mm/protocal/c/bqc:<init>	()V
    //   142: putfield 99	com/tencent/mm/ab/b$a:dIH	Lcom/tencent/mm/bk/a;
    //   145: aload_2
    //   146: ldc 101
    //   148: putfield 104	com/tencent/mm/ab/b$a:uri	Ljava/lang/String;
    //   151: aload_2
    //   152: sipush 207
    //   155: putfield 107	com/tencent/mm/ab/b$a:dIF	I
    //   158: aload_2
    //   159: bipush 95
    //   161: putfield 110	com/tencent/mm/ab/b$a:dII	I
    //   164: aload_2
    //   165: ldc 111
    //   167: putfield 114	com/tencent/mm/ab/b$a:dIJ	I
    //   170: aload_0
    //   171: aload_2
    //   172: invokevirtual 118	com/tencent/mm/ab/b$a:KT	()Lcom/tencent/mm/ab/b;
    //   175: putfield 120	com/tencent/mm/plugin/sns/model/z:diG	Lcom/tencent/mm/ab/b;
    //   178: aload_0
    //   179: aload_0
    //   180: getfield 120	com/tencent/mm/plugin/sns/model/z:diG	Lcom/tencent/mm/ab/b;
    //   183: getfield 126	com/tencent/mm/ab/b:dID	Lcom/tencent/mm/ab/b$b;
    //   186: getfield 131	com/tencent/mm/ab/b$b:dIL	Lcom/tencent/mm/bk/a;
    //   189: checkcast 88	com/tencent/mm/protocal/c/bqb
    //   192: putfield 133	com/tencent/mm/plugin/sns/model/z:noO	Lcom/tencent/mm/protocal/c/bqb;
    //   195: invokestatic 139	com/tencent/mm/plugin/sns/model/af:byd	()Lcom/tencent/mm/plugin/sns/storage/s;
    //   198: iload_1
    //   199: i2l
    //   200: invokevirtual 145	com/tencent/mm/plugin/sns/storage/s:fj	(J)Lcom/tencent/mm/plugin/sns/storage/r;
    //   203: astore 7
    //   205: aload_0
    //   206: iload_3
    //   207: putfield 62	com/tencent/mm/plugin/sns/model/z:noS	Z
    //   210: ldc -109
    //   212: new 149	java/lang/StringBuilder
    //   215: dup
    //   216: ldc -105
    //   218: invokespecial 154	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   221: iload_1
    //   222: invokevirtual 158	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   225: ldc -96
    //   227: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   230: aload 7
    //   232: getfield 166	com/tencent/mm/plugin/sns/storage/r:offset	I
    //   235: invokevirtual 158	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   238: ldc -88
    //   240: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   243: aload 7
    //   245: getfield 171	com/tencent/mm/plugin/sns/storage/r:nJI	Ljava/lang/String;
    //   248: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   251: ldc -83
    //   253: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   256: aload 7
    //   258: getfield 176	com/tencent/mm/plugin/sns/storage/r:nJH	I
    //   261: invokevirtual 158	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   264: invokevirtual 180	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   267: invokestatic 186	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   270: iload_3
    //   271: ifne +18 -> 289
    //   274: aload_0
    //   275: getfield 133	com/tencent/mm/plugin/sns/model/z:noO	Lcom/tencent/mm/protocal/c/bqb;
    //   278: iconst_1
    //   279: putfield 189	com/tencent/mm/protocal/c/bqb:rXx	I
    //   282: ldc -109
    //   284: ldc -65
    //   286: invokestatic 186	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   289: new 193	com/tencent/mm/protocal/c/ath
    //   292: dup
    //   293: invokespecial 194	com/tencent/mm/protocal/c/ath:<init>	()V
    //   296: aload 7
    //   298: getfield 198	com/tencent/mm/plugin/sns/storage/r:nJM	[B
    //   301: invokevirtual 202	com/tencent/mm/protocal/c/ath:aG	([B)Lcom/tencent/mm/bk/a;
    //   304: checkcast 193	com/tencent/mm/protocal/c/ath
    //   307: astore 6
    //   309: aload_0
    //   310: aload 7
    //   312: getfield 171	com/tencent/mm/plugin/sns/storage/r:nJI	Ljava/lang/String;
    //   315: invokestatic 208	com/tencent/mm/plugin/sns/data/i:LE	(Ljava/lang/String;)Ljava/lang/String;
    //   318: putfield 50	com/tencent/mm/plugin/sns/model/z:noN	Ljava/lang/String;
    //   321: aload_0
    //   322: new 149	java/lang/StringBuilder
    //   325: dup
    //   326: invokespecial 209	java/lang/StringBuilder:<init>	()V
    //   329: invokestatic 212	com/tencent/mm/plugin/sns/model/af:getAccSnsPath	()Ljava/lang/String;
    //   332: aload 7
    //   334: getfield 171	com/tencent/mm/plugin/sns/storage/r:nJI	Ljava/lang/String;
    //   337: invokestatic 218	com/tencent/mm/plugin/sns/model/an:s	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   340: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   343: aload_0
    //   344: getfield 50	com/tencent/mm/plugin/sns/model/z:noN	Ljava/lang/String;
    //   347: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   350: invokevirtual 180	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   353: putfield 48	com/tencent/mm/plugin/sns/model/z:path	Ljava/lang/String;
    //   356: aload_0
    //   357: aload_0
    //   358: getfield 48	com/tencent/mm/plugin/sns/model/z:path	Ljava/lang/String;
    //   361: invokestatic 224	com/tencent/mm/modelsfs/FileOp:mI	(Ljava/lang/String;)J
    //   364: l2i
    //   365: putfield 226	com/tencent/mm/plugin/sns/model/z:dHI	I
    //   368: aload_0
    //   369: aload_0
    //   370: getfield 48	com/tencent/mm/plugin/sns/model/z:path	Ljava/lang/String;
    //   373: invokestatic 230	com/tencent/mm/plugin/sns/data/i:LN	(Ljava/lang/String;)Z
    //   376: putfield 58	com/tencent/mm/plugin/sns/model/z:noQ	Z
    //   379: ldc -109
    //   381: new 149	java/lang/StringBuilder
    //   384: dup
    //   385: ldc -24
    //   387: invokespecial 154	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   390: aload_0
    //   391: getfield 226	com/tencent/mm/plugin/sns/model/z:dHI	I
    //   394: invokevirtual 158	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   397: ldc -22
    //   399: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   402: aload_0
    //   403: getfield 58	com/tencent/mm/plugin/sns/model/z:noQ	Z
    //   406: invokevirtual 237	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   409: invokevirtual 180	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   412: invokestatic 186	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   415: aload 6
    //   417: getfield 240	com/tencent/mm/protocal/c/ath:rWB	Ljava/lang/String;
    //   420: astore 5
    //   422: aload 5
    //   424: astore_2
    //   425: aload 5
    //   427: invokestatic 245	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   430: ifeq +56 -> 486
    //   433: new 149	java/lang/StringBuilder
    //   436: dup
    //   437: invokespecial 209	java/lang/StringBuilder:<init>	()V
    //   440: invokestatic 248	com/tencent/mm/sdk/platformtools/bi:VG	()J
    //   443: invokevirtual 251	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   446: invokevirtual 180	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   449: invokevirtual 257	java/lang/String:getBytes	()[B
    //   452: invokestatic 263	com/tencent/mm/a/g:u	([B)Ljava/lang/String;
    //   455: astore_2
    //   456: aload 6
    //   458: aload_2
    //   459: putfield 240	com/tencent/mm/protocal/c/ath:rWB	Ljava/lang/String;
    //   462: aload 7
    //   464: aload 6
    //   466: invokevirtual 266	com/tencent/mm/protocal/c/ath:toByteArray	()[B
    //   469: putfield 198	com/tencent/mm/plugin/sns/storage/r:nJM	[B
    //   472: invokestatic 139	com/tencent/mm/plugin/sns/model/af:byd	()Lcom/tencent/mm/plugin/sns/storage/s;
    //   475: aload 7
    //   477: getfield 269	com/tencent/mm/plugin/sns/storage/r:nJc	I
    //   480: aload 7
    //   482: invokevirtual 273	com/tencent/mm/plugin/sns/storage/s:a	(ILcom/tencent/mm/plugin/sns/storage/r;)I
    //   485: pop
    //   486: aload_0
    //   487: getfield 133	com/tencent/mm/plugin/sns/model/z:noO	Lcom/tencent/mm/protocal/c/bqb;
    //   490: aload_0
    //   491: getfield 226	com/tencent/mm/plugin/sns/model/z:dHI	I
    //   494: putfield 276	com/tencent/mm/protocal/c/bqb:rdV	I
    //   497: aload_0
    //   498: getfield 133	com/tencent/mm/plugin/sns/model/z:noO	Lcom/tencent/mm/protocal/c/bqb;
    //   501: aload 7
    //   503: getfield 166	com/tencent/mm/plugin/sns/storage/r:offset	I
    //   506: putfield 279	com/tencent/mm/protocal/c/bqb:rdW	I
    //   509: aload_0
    //   510: getfield 133	com/tencent/mm/plugin/sns/model/z:noO	Lcom/tencent/mm/protocal/c/bqb;
    //   513: aload_2
    //   514: putfield 282	com/tencent/mm/protocal/c/bqb:rcc	Ljava/lang/String;
    //   517: aload_0
    //   518: aload_2
    //   519: putfield 56	com/tencent/mm/plugin/sns/model/z:dVk	Ljava/lang/String;
    //   522: ldc -109
    //   524: new 149	java/lang/StringBuilder
    //   527: dup
    //   528: ldc_w 284
    //   531: invokespecial 154	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   534: aload 6
    //   536: getfield 287	com/tencent/mm/protocal/c/ath:rWa	I
    //   539: invokevirtual 158	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   542: invokevirtual 180	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   545: invokestatic 290	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   548: aload_0
    //   549: getfield 133	com/tencent/mm/plugin/sns/model/z:noO	Lcom/tencent/mm/protocal/c/bqb;
    //   552: aload 6
    //   554: getfield 287	com/tencent/mm/protocal/c/ath:rWa	I
    //   557: putfield 291	com/tencent/mm/protocal/c/bqb:rWa	I
    //   560: ldc -109
    //   562: new 149	java/lang/StringBuilder
    //   565: dup
    //   566: ldc_w 293
    //   569: invokespecial 154	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   572: aload 6
    //   574: getfield 296	com/tencent/mm/protocal/c/ath:rWb	I
    //   577: invokevirtual 158	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   580: invokevirtual 180	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   583: invokestatic 290	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   586: aload_0
    //   587: getfield 133	com/tencent/mm/plugin/sns/model/z:noO	Lcom/tencent/mm/protocal/c/bqb;
    //   590: new 149	java/lang/StringBuilder
    //   593: dup
    //   594: invokespecial 209	java/lang/StringBuilder:<init>	()V
    //   597: aload 6
    //   599: getfield 299	com/tencent/mm/protocal/c/ath:jOS	Ljava/lang/String;
    //   602: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   605: invokevirtual 180	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   608: putfield 302	com/tencent/mm/protocal/c/bqb:rej	Ljava/lang/String;
    //   611: aload_0
    //   612: getfield 133	com/tencent/mm/plugin/sns/model/z:noO	Lcom/tencent/mm/protocal/c/bqb;
    //   615: aload 6
    //   617: getfield 296	com/tencent/mm/protocal/c/ath:rWb	I
    //   620: putfield 303	com/tencent/mm/protocal/c/bqb:rWb	I
    //   623: ldc -109
    //   625: new 149	java/lang/StringBuilder
    //   628: dup
    //   629: ldc_w 305
    //   632: invokespecial 154	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   635: aload 7
    //   637: getfield 308	com/tencent/mm/plugin/sns/storage/r:type	I
    //   640: invokevirtual 158	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   643: ldc_w 310
    //   646: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   649: aload 6
    //   651: getfield 313	com/tencent/mm/protocal/c/ath:bKg	Ljava/lang/String;
    //   654: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   657: ldc_w 315
    //   660: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   663: aload 6
    //   665: getfield 318	com/tencent/mm/protocal/c/ath:bPS	Ljava/lang/String;
    //   668: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   671: ldc_w 320
    //   674: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   677: aload 6
    //   679: getfield 323	com/tencent/mm/protocal/c/ath:afv	I
    //   682: invokevirtual 158	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   685: invokevirtual 180	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   688: invokestatic 186	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   691: aload_0
    //   692: getfield 133	com/tencent/mm/plugin/sns/model/z:noO	Lcom/tencent/mm/protocal/c/bqb;
    //   695: aload 7
    //   697: getfield 308	com/tencent/mm/plugin/sns/storage/r:type	I
    //   700: putfield 326	com/tencent/mm/protocal/c/bqb:hcE	I
    //   703: new 328	com/tencent/mm/protocal/c/bue
    //   706: dup
    //   707: invokespecial 329	com/tencent/mm/protocal/c/bue:<init>	()V
    //   710: astore_2
    //   711: aload_2
    //   712: aload 6
    //   714: getfield 332	com/tencent/mm/protocal/c/ath:token	Ljava/lang/String;
    //   717: putfield 335	com/tencent/mm/protocal/c/bue:srB	Ljava/lang/String;
    //   720: aload_2
    //   721: aload 6
    //   723: getfield 338	com/tencent/mm/protocal/c/ath:rWk	Ljava/lang/String;
    //   726: putfield 341	com/tencent/mm/protocal/c/bue:srC	Ljava/lang/String;
    //   729: aload_0
    //   730: getfield 133	com/tencent/mm/plugin/sns/model/z:noO	Lcom/tencent/mm/protocal/c/bqb;
    //   733: aload_2
    //   734: putfield 345	com/tencent/mm/protocal/c/bqb:sdt	Lcom/tencent/mm/protocal/c/bue;
    //   737: aload 6
    //   739: getfield 313	com/tencent/mm/protocal/c/ath:bKg	Ljava/lang/String;
    //   742: invokestatic 245	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   745: ifne +15 -> 760
    //   748: aload_0
    //   749: getfield 133	com/tencent/mm/plugin/sns/model/z:noO	Lcom/tencent/mm/protocal/c/bqb;
    //   752: aload 6
    //   754: getfield 313	com/tencent/mm/protocal/c/ath:bKg	Ljava/lang/String;
    //   757: putfield 348	com/tencent/mm/protocal/c/bqb:rwt	Ljava/lang/String;
    //   760: aload 6
    //   762: getfield 318	com/tencent/mm/protocal/c/ath:bPS	Ljava/lang/String;
    //   765: invokestatic 245	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   768: ifne +15 -> 783
    //   771: aload_0
    //   772: getfield 133	com/tencent/mm/plugin/sns/model/z:noO	Lcom/tencent/mm/protocal/c/bqb;
    //   775: aload 6
    //   777: getfield 318	com/tencent/mm/protocal/c/ath:bPS	Ljava/lang/String;
    //   780: putfield 351	com/tencent/mm/protocal/c/bqb:jQb	Ljava/lang/String;
    //   783: aload_0
    //   784: getfield 133	com/tencent/mm/plugin/sns/model/z:noO	Lcom/tencent/mm/protocal/c/bqb;
    //   787: aload 6
    //   789: getfield 323	com/tencent/mm/protocal/c/ath:afv	I
    //   792: putfield 354	com/tencent/mm/protocal/c/bqb:sob	I
    //   795: getstatic 359	com/tencent/mm/platformtools/af:ewP	Z
    //   798: ifeq +11 -> 809
    //   801: aload_0
    //   802: getfield 133	com/tencent/mm/plugin/sns/model/z:noO	Lcom/tencent/mm/protocal/c/bqb;
    //   805: iconst_0
    //   806: putfield 326	com/tencent/mm/protocal/c/bqb:hcE	I
    //   809: aload_0
    //   810: getfield 66	com/tencent/mm/plugin/sns/model/z:startTime	J
    //   813: lconst_0
    //   814: lcmp
    //   815: ifne +17 -> 832
    //   818: aload_0
    //   819: invokestatic 362	com/tencent/mm/sdk/platformtools/bi:VF	()J
    //   822: putfield 66	com/tencent/mm/plugin/sns/model/z:startTime	J
    //   825: aload_0
    //   826: getstatic 367	com/tencent/mm/modelcdntran/b:MediaType_FRIENDS	I
    //   829: putfield 68	com/tencent/mm/plugin/sns/model/z:dVl	I
    //   832: aload_0
    //   833: getfield 133	com/tencent/mm/plugin/sns/model/z:noO	Lcom/tencent/mm/protocal/c/bqb;
    //   836: astore_2
    //   837: invokestatic 373	com/tencent/mm/modelcdntran/g:ND	()Lcom/tencent/mm/modelcdntran/c;
    //   840: pop
    //   841: bipush 32
    //   843: invokestatic 379	com/tencent/mm/modelcdntran/c:hz	(I)Z
    //   846: ifne +70 -> 916
    //   849: invokestatic 373	com/tencent/mm/modelcdntran/g:ND	()Lcom/tencent/mm/modelcdntran/c;
    //   852: pop
    //   853: ldc -109
    //   855: ldc_w 381
    //   858: iconst_1
    //   859: anewarray 383	java/lang/Object
    //   862: dup
    //   863: iconst_0
    //   864: bipush 32
    //   866: invokestatic 379	com/tencent/mm/modelcdntran/c:hz	(I)Z
    //   869: invokestatic 389	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   872: aastore
    //   873: invokestatic 393	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   876: iconst_0
    //   877: istore_1
    //   878: iload_1
    //   879: ifeq +85 -> 964
    //   882: aload_0
    //   883: iconst_1
    //   884: putfield 60	com/tencent/mm/plugin/sns/model/z:noR	Z
    //   887: return
    //   888: astore_2
    //   889: ldc -109
    //   891: ldc_w 395
    //   894: invokestatic 398	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   897: return
    //   898: astore 5
    //   900: ldc -109
    //   902: aload 5
    //   904: ldc 46
    //   906: iconst_0
    //   907: anewarray 383	java/lang/Object
    //   910: invokestatic 402	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   913: goto -427 -> 486
    //   916: getstatic 405	com/tencent/mm/platformtools/af:exE	I
    //   919: iconst_2
    //   920: if_icmpne +8 -> 928
    //   923: iconst_0
    //   924: istore_1
    //   925: goto -47 -> 878
    //   928: aload_0
    //   929: aload_2
    //   930: getfield 282	com/tencent/mm/protocal/c/bqb:rcc	Ljava/lang/String;
    //   933: putfield 56	com/tencent/mm/plugin/sns/model/z:dVk	Ljava/lang/String;
    //   936: aload_0
    //   937: getfield 56	com/tencent/mm/plugin/sns/model/z:dVk	Ljava/lang/String;
    //   940: invokestatic 245	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   943: ifeq +16 -> 959
    //   946: ldc -109
    //   948: ldc_w 407
    //   951: invokestatic 409	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   954: iconst_0
    //   955: istore_1
    //   956: goto -78 -> 878
    //   959: iconst_1
    //   960: istore_1
    //   961: goto -83 -> 878
    //   964: aload_0
    //   965: invokespecial 413	com/tencent/mm/plugin/sns/model/z:bxM	()Z
    //   968: ifne -81 -> 887
    //   971: aload_0
    //   972: invokespecial 416	com/tencent/mm/plugin/sns/model/z:onError	()V
    //   975: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	976	0	this	z
    //   0	976	1	paramInt1	int
    //   0	976	2	paramString	String
    //   0	976	3	paramBoolean	boolean
    //   0	976	4	paramInt2	int
    //   420	6	5	str	String
    //   898	5	5	localException	Exception
    //   307	481	6	localath	ath
    //   203	493	7	localr	r
    // Exception table:
    //   from	to	target	type
    //   289	309	888	java/lang/Exception
    //   462	486	898	java/lang/Exception
  }
  
  private boolean bxM()
  {
    Object localObject = af.byd().fj(this.nkZ);
    int j = ((r)localObject).nJH - ((r)localObject).offset;
    int i = j;
    if (j > this.dVE) {
      i = this.dVE;
    }
    this.offset = ((r)localObject).offset;
    localObject = FileOp.e(this.path, this.offset, i);
    if ((localObject == null) || (localObject.length <= 0)) {
      return false;
    }
    bhy localbhy = new bhy();
    localbhy.bq((byte[])localObject);
    this.noO.rfy = localbhy;
    this.noO.rdW = this.offset;
    return true;
  }
  
  private void onError()
  {
    r localr = af.byd().fj(this.nkZ);
    localr.offset = 0;
    try
    {
      ath localath = (ath)new ath().aG(localr.nJM);
      localath.rWB = "";
      localr.nJM = localath.toByteArray();
      af.byd().a(this.nkZ, localr);
      af.byn().wu(this.nkZ);
      return;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.NetSceneMMSnsUpload", "parseFrom MediaUploadInfo error in NetSceneSnsUpload");
    }
  }
  
  protected final int Cc()
  {
    if (this.noQ) {
      return 675;
    }
    return 100;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    int i = 108;
    this.diJ = parame1;
    if (this.noR)
    {
      this.dVk = this.noO.rcc;
      if (bi.oW(this.dVk))
      {
        x.w("MicroMsg.NetSceneMMSnsUpload", "cdntra genClientId failed not use cdn");
        return 0;
      }
      parame = new i();
      parame.dPV = this.dVu;
      parame.field_mediaId = this.dVk;
      parame.field_fullpath = this.path;
      parame.field_thumbpath = "";
      parame.field_fileType = com.tencent.mm.modelcdntran.b.MediaType_FRIENDS;
      parame.field_talker = "";
      parame.field_priority = com.tencent.mm.modelcdntran.b.dOk;
      parame.field_needStorage = true;
      parame.field_isStreamMedia = false;
      if (s.bBE())
      {
        if (this.noS) {}
        for (;;)
        {
          parame.field_appType = i;
          parame.field_bzScene = 1;
          if (g.ND().c(parame)) {
            break;
          }
          x.e("MicroMsg.NetSceneMMSnsUpload", "cdntra addSendTask failed. clientid:%s", new Object[] { this.dVk });
          this.dVk = "";
          break;
          i = 107;
        }
      }
      if (s.bBD())
      {
        if (this.noS) {}
        for (;;)
        {
          parame.field_appType = i;
          break;
          i = 107;
        }
      }
      g.ND();
      if (com.tencent.mm.modelcdntran.c.hz(64))
      {
        if (this.noS) {}
        for (i = 104;; i = 103)
        {
          parame.field_appType = i;
          break;
        }
      }
      if (this.noS) {}
      for (i = 101;; i = 100)
      {
        parame.field_appType = i;
        break;
      }
    }
    return a(parame, this.diG, this);
  }
  
  protected final int a(q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneMMSnsUpload", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramq = (bqc)((com.tencent.mm.ab.b)paramq).dIE.dIL;
    if (paramInt2 == 4)
    {
      wp(paramInt3);
      if (this.noU == 21) {
        com.tencent.mm.plugin.sns.lucky.a.b.kB(12);
      }
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
    label533:
    do
    {
      do
      {
        do
        {
          return;
          if ((paramInt2 != 0) || (paramInt3 != 0))
          {
            onError();
            if (this.noU == 21) {
              com.tencent.mm.plugin.sns.lucky.a.b.kB(13);
            }
            this.diJ.a(paramInt2, paramInt3, paramString, this);
            return;
          }
          paramArrayOfByte = af.byd().fj(this.nkZ);
          if ((paramq.rdW >= 0) && ((paramq.rdW <= paramArrayOfByte.nJH) || (paramArrayOfByte.nJH <= 0))) {
            break;
          }
          onError();
        } while (paramInt2 != 3);
        com.tencent.mm.plugin.sns.lucky.a.b.kB(14);
        return;
        if (paramq.rdW >= paramArrayOfByte.offset) {
          break;
        }
        onError();
      } while (paramInt2 != 3);
      com.tencent.mm.plugin.sns.lucky.a.b.kB(14);
      return;
      x.d("MicroMsg.NetSceneMMSnsUpload", " bufferUrl: " + paramq.soc.jPK + " bufferUrlType: " + paramq.soc.hcE + "  id:" + paramq.rlK + " thumb Count: " + paramq.rWy + "  type " + paramq.hcE + " startPos : " + paramq.rdW);
      paramArrayOfByte.offset = paramq.rdW;
      af.byd().a(this.nkZ, paramArrayOfByte);
      if ((paramArrayOfByte.offset == paramArrayOfByte.nJH) && (paramArrayOfByte.nJH != 0))
      {
        paramInt1 = 1;
        if (paramInt1 == 0) {
          continue;
        }
        x.i("MicroMsg.NetSceneMMSnsUpload", "uploadsns done pass: " + (System.currentTimeMillis() - this.noT));
        if ((paramq.rWz.size() == 0) || (paramq.rWz.size() <= 0)) {
          break label533;
        }
        a(paramq.soc.jPK, paramq.soc.hcE, ((bok)paramq.rWz.get(0)).jPK, ((bok)paramq.rWz.get(0)).hcE, paramq.rlK, this.noO.rwt);
      }
      for (;;)
      {
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
        paramInt1 = 0;
        break;
        a(paramq.soc.jPK, paramq.soc.hcE, "", 0, paramq.rlK, this.noO.rwt);
      }
    } while ((!bxM()) || (a(this.dIX, this.diJ) >= 0));
    this.diJ.a(3, -1, "doScene failed", this);
  }
  
  public final boolean a(String paramString1, int paramInt1, String paramString2, int paramInt2, String paramString3, String paramString4)
  {
    r localr = af.byd().fj(this.nkZ);
    x.i("MicroMsg.NetSceneMMSnsUpload", "upload ok " + paramString1 + "  " + paramString3 + "  " + paramInt1 + " thumbUrl: " + paramString2);
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    MMBitmapFactory.decodeFile(this.path, localOptions, null, 0, new int[0]);
    Object localObject;
    if (localOptions.outMimeType != null) {
      localObject = localOptions.outMimeType.toLowerCase();
    }
    for (;;)
    {
      int i = -1;
      if ((((String)localObject).endsWith("jpg")) || (((String)localObject).endsWith("jpeg")))
      {
        int j = MMNativeJpeg.queryQuality(this.path);
        i = j;
        if (j == 0) {
          i = -1;
        }
      }
      long l = FileOp.mI(this.path);
      com.tencent.mm.plugin.sns.h.c.a(paramString1, localOptions.outMimeType, localOptions.outWidth, localOptions.outHeight, i, l);
      localr.nJL = paramString3;
      try
      {
        paramString3 = (ath)new ath().aG(localr.nJM);
        localObject = paramString3;
        if (paramString3 == null) {
          localObject = new ath();
        }
        paramString3 = new atb();
        paramString3.hcE = paramInt1;
        paramString3.jPK = paramString1;
        ((ath)localObject).rWx = paramString3;
        ((ath)localObject).rWA = 0;
        ((ath)localObject).bKg = paramString4;
        if (!bi.oW(paramString2))
        {
          paramString1 = new atb();
          paramString1.hcE = paramInt2;
          paramString1.jPK = paramString2;
          ((ath)localObject).rWz.add(paramString1);
        }
      }
      catch (Exception paramString3)
      {
        try
        {
          localr.nJM = ((ath)localObject).toByteArray();
          localr.bBC();
          af.byd().a(this.nkZ, localr);
          af.byn().wu(this.nkZ);
          if (af.byk() != null) {
            af.byk().bwX();
          }
          return true;
          localObject = "";
          continue;
          paramString3 = paramString3;
          paramString3 = null;
        }
        catch (Exception paramString1)
        {
          for (;;)
          {
            x.printErrStackTrace("MicroMsg.NetSceneMMSnsUpload", paramString1, "", new Object[0]);
          }
        }
      }
    }
  }
  
  protected final void cancel()
  {
    super.cancel();
    if ((this.noR) && (!bi.oW(this.dVk)))
    {
      x.i("MicroMsg.NetSceneMMSnsUpload", "cancel by cdn " + this.dVk);
      g.ND().lw(this.dVk);
    }
  }
  
  public final int getType()
  {
    return 207;
  }
  
  final void wp(int paramInt)
  {
    r localr = af.byd().fj(this.nkZ);
    try
    {
      ath localath = (ath)new ath().aG(localr.nJM);
      localath.rWA = 1;
      localath.rWj = paramInt;
      localr.nJM = localath.toByteArray();
      af.byn().wu(this.nkZ);
      af.byd().a(this.nkZ, localr);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/model/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */