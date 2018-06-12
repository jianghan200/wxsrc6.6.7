package com.tencent.mm.plugin.mmsight.model.b;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.MediaExtractor;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.plugin.sight.base.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  extends com.tencent.mm.plugin.mmsight.api.a
{
  private int aeg;
  private String filePath;
  private int jdD = -1;
  private MediaExtractor ldo;
  private int lhM;
  private c ljP;
  private String ljR;
  private int ljS;
  private int ljT;
  private int ljU;
  private int ljV;
  private int ljW;
  private int ljX;
  private long ljY = -1L;
  private long ljZ = -1L;
  private int lka = -1;
  private int lkb;
  private Point lkc = null;
  private Bitmap lkf;
  private byte[] lkg = null;
  private byte[] lkh = null;
  private e lkj;
  private int videoFps;
  
  public b(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((bi.oW(paramString1)) || (bi.oW(paramString2)) || (paramInt1 <= 0) || (paramInt2 <= 0))
    {
      x.e("MicroMsg.MMSightFFMpegX264Remuxer", "create MMSightFFMpegMediaCodecRemuxer error, filePath: %s, outputFilePath: %s, outputWidth: %s, outputHeight: %s, outputFps: %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt4) });
      return;
    }
    this.filePath = paramString1;
    this.ljR = paramString2;
    this.ljU = paramInt1;
    this.ljV = paramInt2;
    this.ljW = paramInt3;
    this.lka = paramInt4;
    this.ljX = SightVideoJNI.getMp4Rotate(paramString1);
    com.tencent.mm.plugin.sight.base.a locala = d.Lo(paramString1);
    if (locala != null)
    {
      this.ljS = locala.width;
      this.ljT = locala.height;
      this.jdD = locala.jdD;
      this.videoFps = locala.ljG;
    }
    this.ljY = 0L;
    this.ljZ = this.jdD;
    x.i("MicroMsg.MMSightFFMpegX264Remuxer", "create MMSightFFMpegX264Remuxer, filePath: %s, outputFilePath: %s, inputWidth: %s, inputHeight: %s, videoRotate: %s, outputWidth: %s, outputHeight: %s", new Object[] { paramString1, paramString2, Integer.valueOf(this.ljS), Integer.valueOf(this.ljT), Integer.valueOf(this.ljX), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
  }
  
  public b(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2)
  {
    if ((bi.oW(paramString1)) || (bi.oW(paramString2)) || (paramInt1 <= 0) || (paramInt2 <= 0))
    {
      x.e("MicroMsg.MMSightFFMpegX264Remuxer", "create MMSightFFMpegMediaCodecRemuxer error, filePath: %s, outputFilePath: %s, outputWidth: %s, outputHeight: %s, outputFps: %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt4) });
      return;
    }
    this.filePath = paramString1;
    this.ljR = paramString2;
    this.ljU = paramInt1;
    this.ljV = paramInt2;
    this.ljW = paramInt3;
    this.lka = paramInt4;
    this.ljX = SightVideoJNI.getMp4Rotate(paramString1);
    com.tencent.mm.plugin.sight.base.a locala = d.Lo(paramString1);
    if (locala != null)
    {
      this.ljS = locala.width;
      this.ljT = locala.height;
      this.videoFps = locala.ljG;
    }
    this.ljY = paramLong1;
    this.ljZ = paramLong2;
    x.i("MicroMsg.MMSightFFMpegX264Remuxer", "create MMSightFFMpegX264Remuxer, filePath: %s, outputFilePath: %s, inputWidth: %s, inputHeight: %s, videoRotate: %s, outputWidth: %s, outputHeight: %s, startTimeMs: %s, endTimeMs: %s", new Object[] { paramString1, paramString2, Integer.valueOf(this.ljS), Integer.valueOf(this.ljT), Integer.valueOf(this.ljX), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(paramLong1), Long.valueOf(paramLong2) });
  }
  
  public final void B(Bitmap paramBitmap)
  {
    if (paramBitmap != null) {
      this.lkf = paramBitmap;
    }
  }
  
  /* Error */
  public final int bdG()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 43	com/tencent/mm/plugin/mmsight/model/b/b:jdD	I
    //   4: i2f
    //   5: ldc -94
    //   7: fdiv
    //   8: invokestatic 168	java/lang/Math:round	(F)I
    //   11: istore_2
    //   12: iload_2
    //   13: istore_1
    //   14: aload_0
    //   15: getfield 47	com/tencent/mm/plugin/mmsight/model/b/b:ljY	J
    //   18: lconst_0
    //   19: lcmp
    //   20: iflt +33 -> 53
    //   23: iload_2
    //   24: istore_1
    //   25: aload_0
    //   26: getfield 49	com/tencent/mm/plugin/mmsight/model/b/b:ljZ	J
    //   29: lconst_0
    //   30: lcmp
    //   31: iflt +22 -> 53
    //   34: aload_0
    //   35: getfield 49	com/tencent/mm/plugin/mmsight/model/b/b:ljZ	J
    //   38: aload_0
    //   39: getfield 47	com/tencent/mm/plugin/mmsight/model/b/b:ljY	J
    //   42: lsub
    //   43: l2f
    //   44: ldc -94
    //   46: fdiv
    //   47: invokestatic 168	java/lang/Math:round	(F)I
    //   50: iconst_1
    //   51: iadd
    //   52: istore_1
    //   53: aload_0
    //   54: iload_1
    //   55: invokestatic 174	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:initDataBuf	(I)I
    //   58: putfield 176	com/tencent/mm/plugin/mmsight/model/b/b:lhM	I
    //   61: aload_0
    //   62: new 178	com/tencent/mm/plugin/mmsight/model/b/c
    //   65: dup
    //   66: invokespecial 179	com/tencent/mm/plugin/mmsight/model/b/c:<init>	()V
    //   69: putfield 181	com/tencent/mm/plugin/mmsight/model/b/b:ljP	Lcom/tencent/mm/plugin/mmsight/model/b/c;
    //   72: aload_0
    //   73: getfield 43	com/tencent/mm/plugin/mmsight/model/b/b:jdD	I
    //   76: ifle +56 -> 132
    //   79: aload_0
    //   80: getfield 181	com/tencent/mm/plugin/mmsight/model/b/b:ljP	Lcom/tencent/mm/plugin/mmsight/model/b/c;
    //   83: aload_0
    //   84: getfield 83	com/tencent/mm/plugin/mmsight/model/b/b:filePath	Ljava/lang/String;
    //   87: lconst_0
    //   88: aload_0
    //   89: getfield 43	com/tencent/mm/plugin/mmsight/model/b/b:jdD	I
    //   92: i2l
    //   93: aload_0
    //   94: getfield 123	com/tencent/mm/plugin/mmsight/model/b/b:videoFps	I
    //   97: invokevirtual 184	com/tencent/mm/plugin/mmsight/model/b/c:c	(Ljava/lang/String;JJI)I
    //   100: istore_1
    //   101: ldc 65
    //   103: ldc -70
    //   105: iconst_1
    //   106: anewarray 69	java/lang/Object
    //   109: dup
    //   110: iconst_0
    //   111: iload_1
    //   112: invokestatic 75	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   115: aastore
    //   116: invokestatic 128	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   119: iload_1
    //   120: ifge +107 -> 227
    //   123: aload_0
    //   124: getfield 176	com/tencent/mm/plugin/mmsight/model/b/b:lhM	I
    //   127: invokestatic 190	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:releaseDataBuf	(I)V
    //   130: iconst_m1
    //   131: ireturn
    //   132: aload_0
    //   133: getfield 47	com/tencent/mm/plugin/mmsight/model/b/b:ljY	J
    //   136: lconst_0
    //   137: lcmp
    //   138: iflt +39 -> 177
    //   141: aload_0
    //   142: getfield 49	com/tencent/mm/plugin/mmsight/model/b/b:ljZ	J
    //   145: lconst_0
    //   146: lcmp
    //   147: iflt +30 -> 177
    //   150: aload_0
    //   151: getfield 181	com/tencent/mm/plugin/mmsight/model/b/b:ljP	Lcom/tencent/mm/plugin/mmsight/model/b/c;
    //   154: aload_0
    //   155: getfield 83	com/tencent/mm/plugin/mmsight/model/b/b:filePath	Ljava/lang/String;
    //   158: aload_0
    //   159: getfield 47	com/tencent/mm/plugin/mmsight/model/b/b:ljY	J
    //   162: aload_0
    //   163: getfield 49	com/tencent/mm/plugin/mmsight/model/b/b:ljZ	J
    //   166: aload_0
    //   167: getfield 123	com/tencent/mm/plugin/mmsight/model/b/b:videoFps	I
    //   170: invokevirtual 184	com/tencent/mm/plugin/mmsight/model/b/c:c	(Ljava/lang/String;JJI)I
    //   173: istore_1
    //   174: goto -73 -> 101
    //   177: ldc 65
    //   179: ldc -64
    //   181: iconst_3
    //   182: anewarray 69	java/lang/Object
    //   185: dup
    //   186: iconst_0
    //   187: aload_0
    //   188: getfield 43	com/tencent/mm/plugin/mmsight/model/b/b:jdD	I
    //   191: invokestatic 75	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   194: aastore
    //   195: dup
    //   196: iconst_1
    //   197: aload_0
    //   198: getfield 47	com/tencent/mm/plugin/mmsight/model/b/b:ljY	J
    //   201: invokestatic 137	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   204: aastore
    //   205: dup
    //   206: iconst_2
    //   207: aload_0
    //   208: getfield 49	com/tencent/mm/plugin/mmsight/model/b/b:ljZ	J
    //   211: invokestatic 137	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   214: aastore
    //   215: invokestatic 81	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   218: aload_0
    //   219: getfield 176	com/tencent/mm/plugin/mmsight/model/b/b:lhM	I
    //   222: invokestatic 190	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:releaseDataBuf	(I)V
    //   225: iconst_m1
    //   226: ireturn
    //   227: aload_0
    //   228: getfield 51	com/tencent/mm/plugin/mmsight/model/b/b:lka	I
    //   231: ifle +38 -> 269
    //   234: aload_0
    //   235: getfield 51	com/tencent/mm/plugin/mmsight/model/b/b:lka	I
    //   238: aload_0
    //   239: getfield 123	com/tencent/mm/plugin/mmsight/model/b/b:videoFps	I
    //   242: if_icmpge +27 -> 269
    //   245: aload_0
    //   246: getfield 181	com/tencent/mm/plugin/mmsight/model/b/b:ljP	Lcom/tencent/mm/plugin/mmsight/model/b/c;
    //   249: aload_0
    //   250: getfield 123	com/tencent/mm/plugin/mmsight/model/b/b:videoFps	I
    //   253: i2f
    //   254: aload_0
    //   255: getfield 51	com/tencent/mm/plugin/mmsight/model/b/b:lka	I
    //   258: i2f
    //   259: fdiv
    //   260: f2d
    //   261: invokestatic 196	java/lang/Math:ceil	(D)D
    //   264: d2i
    //   265: i2d
    //   266: putfield 200	com/tencent/mm/plugin/mmsight/model/b/c:lkq	D
    //   269: aload_0
    //   270: getfield 51	com/tencent/mm/plugin/mmsight/model/b/b:lka	I
    //   273: ifle +624 -> 897
    //   276: aload_0
    //   277: getfield 51	com/tencent/mm/plugin/mmsight/model/b/b:lka	I
    //   280: aload_0
    //   281: getfield 123	com/tencent/mm/plugin/mmsight/model/b/b:videoFps	I
    //   284: invokestatic 204	java/lang/Math:min	(II)I
    //   287: istore_1
    //   288: aload_0
    //   289: getfield 181	com/tencent/mm/plugin/mmsight/model/b/b:ljP	Lcom/tencent/mm/plugin/mmsight/model/b/c;
    //   292: new 206	com/tencent/mm/plugin/mmsight/model/b/b$1
    //   295: dup
    //   296: aload_0
    //   297: invokespecial 209	com/tencent/mm/plugin/mmsight/model/b/b$1:<init>	(Lcom/tencent/mm/plugin/mmsight/model/b/b;)V
    //   300: putfield 213	com/tencent/mm/plugin/mmsight/model/b/c:lkl	Lcom/tencent/mm/plugin/mmsight/model/b/c$a;
    //   303: aload_0
    //   304: new 215	com/tencent/mm/plugin/mmsight/model/b/e
    //   307: dup
    //   308: aload_0
    //   309: getfield 112	com/tencent/mm/plugin/mmsight/model/b/b:ljS	I
    //   312: aload_0
    //   313: getfield 117	com/tencent/mm/plugin/mmsight/model/b/b:ljT	I
    //   316: aload_0
    //   317: getfield 87	com/tencent/mm/plugin/mmsight/model/b/b:ljU	I
    //   320: aload_0
    //   321: getfield 89	com/tencent/mm/plugin/mmsight/model/b/b:ljV	I
    //   324: aload_0
    //   325: getfield 91	com/tencent/mm/plugin/mmsight/model/b/b:ljW	I
    //   328: iload_1
    //   329: getstatic 220	com/tencent/mm/plugin/sight/base/b:nbV	I
    //   332: invokespecial 223	com/tencent/mm/plugin/mmsight/model/b/e:<init>	(IIIIIII)V
    //   335: putfield 153	com/tencent/mm/plugin/mmsight/model/b/b:lkj	Lcom/tencent/mm/plugin/mmsight/model/b/e;
    //   338: aload_0
    //   339: getfield 153	com/tencent/mm/plugin/mmsight/model/b/b:lkj	Lcom/tencent/mm/plugin/mmsight/model/b/e;
    //   342: astore 5
    //   344: aload 5
    //   346: iconst_0
    //   347: putfield 226	com/tencent/mm/plugin/mmsight/model/b/e:frameCount	I
    //   350: aload 5
    //   352: getfield 229	com/tencent/mm/plugin/mmsight/model/b/e:kGn	I
    //   355: aload 5
    //   357: getfield 232	com/tencent/mm/plugin/mmsight/model/b/e:kGo	I
    //   360: aload 5
    //   362: getfield 233	com/tencent/mm/plugin/mmsight/model/b/e:ljG	I
    //   365: i2f
    //   366: aload 5
    //   368: getfield 236	com/tencent/mm/plugin/mmsight/model/b/e:bitrate	I
    //   371: aload 5
    //   373: getfield 239	com/tencent/mm/plugin/mmsight/model/b/e:dQI	I
    //   376: bipush 8
    //   378: aload 5
    //   380: getfield 242	com/tencent/mm/plugin/mmsight/model/b/e:dQH	I
    //   383: ldc -13
    //   385: invokestatic 247	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:initH264Encoder	(IIFIIIIF)I
    //   388: pop
    //   389: aload 5
    //   391: new 249	com/tencent/mm/plugin/mmsight/model/b/e$a
    //   394: dup
    //   395: aload 5
    //   397: iconst_0
    //   398: invokespecial 252	com/tencent/mm/plugin/mmsight/model/b/e$a:<init>	(Lcom/tencent/mm/plugin/mmsight/model/b/e;B)V
    //   401: putfield 256	com/tencent/mm/plugin/mmsight/model/b/e:lkv	Lcom/tencent/mm/plugin/mmsight/model/b/e$a;
    //   404: aload 5
    //   406: aload 5
    //   408: getfield 256	com/tencent/mm/plugin/mmsight/model/b/e:lkv	Lcom/tencent/mm/plugin/mmsight/model/b/e$a;
    //   411: ldc_w 258
    //   414: invokestatic 263	com/tencent/mm/sdk/f/e:b	(Ljava/lang/Runnable;Ljava/lang/String;)Ljava/lang/Thread;
    //   417: putfield 267	com/tencent/mm/plugin/mmsight/model/b/e:lkw	Ljava/lang/Thread;
    //   420: aload 5
    //   422: getfield 267	com/tencent/mm/plugin/mmsight/model/b/e:lkw	Ljava/lang/Thread;
    //   425: invokevirtual 272	java/lang/Thread:start	()V
    //   428: aload 5
    //   430: iconst_0
    //   431: putfield 276	com/tencent/mm/plugin/mmsight/model/b/e:bTv	Z
    //   434: ldc_w 278
    //   437: ldc_w 280
    //   440: invokestatic 283	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   443: aload_0
    //   444: getfield 181	com/tencent/mm/plugin/mmsight/model/b/b:ljP	Lcom/tencent/mm/plugin/mmsight/model/b/c;
    //   447: invokevirtual 286	com/tencent/mm/plugin/mmsight/model/b/c:beH	()V
    //   450: aload_0
    //   451: getfield 153	com/tencent/mm/plugin/mmsight/model/b/b:lkj	Lcom/tencent/mm/plugin/mmsight/model/b/e;
    //   454: astore 5
    //   456: aload 5
    //   458: getfield 256	com/tencent/mm/plugin/mmsight/model/b/e:lkv	Lcom/tencent/mm/plugin/mmsight/model/b/e$a;
    //   461: ifnull +37 -> 498
    //   464: aload 5
    //   466: getfield 267	com/tencent/mm/plugin/mmsight/model/b/e:lkw	Ljava/lang/Thread;
    //   469: ifnull +29 -> 498
    //   472: aload 5
    //   474: getfield 256	com/tencent/mm/plugin/mmsight/model/b/e:lkv	Lcom/tencent/mm/plugin/mmsight/model/b/e$a;
    //   477: iconst_1
    //   478: putfield 289	com/tencent/mm/plugin/mmsight/model/b/e$a:lkx	Z
    //   481: aload 5
    //   483: getfield 267	com/tencent/mm/plugin/mmsight/model/b/e:lkw	Ljava/lang/Thread;
    //   486: invokevirtual 292	java/lang/Thread:join	()V
    //   489: aload 5
    //   491: getfield 256	com/tencent/mm/plugin/mmsight/model/b/e:lkv	Lcom/tencent/mm/plugin/mmsight/model/b/e$a;
    //   494: invokestatic 296	com/tencent/mm/sdk/f/e:remove	(Ljava/lang/Runnable;)Z
    //   497: pop
    //   498: aload_0
    //   499: new 298	android/media/MediaExtractor
    //   502: dup
    //   503: invokespecial 299	android/media/MediaExtractor:<init>	()V
    //   506: putfield 301	com/tencent/mm/plugin/mmsight/model/b/b:ldo	Landroid/media/MediaExtractor;
    //   509: aload_0
    //   510: getfield 301	com/tencent/mm/plugin/mmsight/model/b/b:ldo	Landroid/media/MediaExtractor;
    //   513: aload_0
    //   514: getfield 83	com/tencent/mm/plugin/mmsight/model/b/b:filePath	Ljava/lang/String;
    //   517: invokevirtual 305	android/media/MediaExtractor:setDataSource	(Ljava/lang/String;)V
    //   520: aconst_null
    //   521: astore 5
    //   523: iconst_0
    //   524: istore_1
    //   525: iload_1
    //   526: aload_0
    //   527: getfield 301	com/tencent/mm/plugin/mmsight/model/b/b:ldo	Landroid/media/MediaExtractor;
    //   530: invokevirtual 308	android/media/MediaExtractor:getTrackCount	()I
    //   533: if_icmpge +499 -> 1032
    //   536: aload_0
    //   537: getfield 301	com/tencent/mm/plugin/mmsight/model/b/b:ldo	Landroid/media/MediaExtractor;
    //   540: iload_1
    //   541: invokevirtual 312	android/media/MediaExtractor:getTrackFormat	(I)Landroid/media/MediaFormat;
    //   544: astore 6
    //   546: aload 6
    //   548: ldc_w 314
    //   551: invokevirtual 320	android/media/MediaFormat:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   554: astore 5
    //   556: aload 5
    //   558: ldc_w 322
    //   561: invokevirtual 327	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   564: ifeq +476 -> 1040
    //   567: iload_1
    //   568: iflt +145 -> 713
    //   571: aload 6
    //   573: ifnull +140 -> 713
    //   576: aload 5
    //   578: invokestatic 63	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   581: ifne +132 -> 713
    //   584: aload_0
    //   585: aload 6
    //   587: ldc_w 329
    //   590: invokevirtual 332	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
    //   593: putfield 334	com/tencent/mm/plugin/mmsight/model/b/b:aeg	I
    //   596: aload_0
    //   597: aload 6
    //   599: ldc_w 336
    //   602: invokevirtual 332	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
    //   605: putfield 338	com/tencent/mm/plugin/mmsight/model/b/b:lkb	I
    //   608: aload_0
    //   609: getfield 301	com/tencent/mm/plugin/mmsight/model/b/b:ldo	Landroid/media/MediaExtractor;
    //   612: iload_1
    //   613: invokevirtual 341	android/media/MediaExtractor:selectTrack	(I)V
    //   616: aload_0
    //   617: getfield 47	com/tencent/mm/plugin/mmsight/model/b/b:ljY	J
    //   620: lconst_0
    //   621: lcmp
    //   622: ifle +19 -> 641
    //   625: aload_0
    //   626: getfield 301	com/tencent/mm/plugin/mmsight/model/b/b:ldo	Landroid/media/MediaExtractor;
    //   629: aload_0
    //   630: getfield 47	com/tencent/mm/plugin/mmsight/model/b/b:ljY	J
    //   633: ldc2_w 342
    //   636: lmul
    //   637: iconst_0
    //   638: invokevirtual 347	android/media/MediaExtractor:seekTo	(JI)V
    //   641: aload 6
    //   643: ldc_w 349
    //   646: invokevirtual 332	android/media/MediaFormat:getInteger	(Ljava/lang/String;)I
    //   649: invokestatic 355	java/nio/ByteBuffer:allocateDirect	(I)Ljava/nio/ByteBuffer;
    //   652: astore 5
    //   654: aload 5
    //   656: invokevirtual 359	java/nio/ByteBuffer:clear	()Ljava/nio/Buffer;
    //   659: pop
    //   660: aload_0
    //   661: getfield 301	com/tencent/mm/plugin/mmsight/model/b/b:ldo	Landroid/media/MediaExtractor;
    //   664: aload 5
    //   666: iconst_0
    //   667: invokevirtual 363	android/media/MediaExtractor:readSampleData	(Ljava/nio/ByteBuffer;I)I
    //   670: istore_2
    //   671: ldc 65
    //   673: ldc_w 365
    //   676: iconst_1
    //   677: anewarray 69	java/lang/Object
    //   680: dup
    //   681: iconst_0
    //   682: iload_2
    //   683: invokestatic 75	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   686: aastore
    //   687: invokestatic 367	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   690: iload_2
    //   691: ifgt +269 -> 960
    //   694: ldc 65
    //   696: ldc_w 369
    //   699: iconst_1
    //   700: anewarray 69	java/lang/Object
    //   703: dup
    //   704: iconst_0
    //   705: iload_2
    //   706: invokestatic 75	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   709: aastore
    //   710: invokestatic 128	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   713: aload_0
    //   714: getfield 85	com/tencent/mm/plugin/mmsight/model/b/b:ljR	Ljava/lang/String;
    //   717: astore 6
    //   719: aload 6
    //   721: astore 5
    //   723: aload_0
    //   724: getfield 99	com/tencent/mm/plugin/mmsight/model/b/b:ljX	I
    //   727: ifle +26 -> 753
    //   730: new 371	java/lang/StringBuilder
    //   733: dup
    //   734: invokespecial 372	java/lang/StringBuilder:<init>	()V
    //   737: aload 6
    //   739: invokevirtual 376	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   742: ldc_w 378
    //   745: invokevirtual 376	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   748: invokevirtual 382	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   751: astore 5
    //   753: aload_0
    //   754: getfield 43	com/tencent/mm/plugin/mmsight/model/b/b:jdD	I
    //   757: i2l
    //   758: lstore_3
    //   759: lload_3
    //   760: lconst_0
    //   761: lcmp
    //   762: ifgt +267 -> 1029
    //   765: aload_0
    //   766: getfield 49	com/tencent/mm/plugin/mmsight/model/b/b:ljZ	J
    //   769: aload_0
    //   770: getfield 47	com/tencent/mm/plugin/mmsight/model/b/b:ljY	J
    //   773: lsub
    //   774: lstore_3
    //   775: aload_0
    //   776: getfield 338	com/tencent/mm/plugin/mmsight/model/b/b:lkb	I
    //   779: sipush 1024
    //   782: iconst_2
    //   783: aload_0
    //   784: getfield 334	com/tencent/mm/plugin/mmsight/model/b/b:aeg	I
    //   787: aload 5
    //   789: aload_0
    //   790: getfield 153	com/tencent/mm/plugin/mmsight/model/b/b:lkj	Lcom/tencent/mm/plugin/mmsight/model/b/e;
    //   793: getfield 226	com/tencent/mm/plugin/mmsight/model/b/e:frameCount	I
    //   796: i2f
    //   797: ldc -94
    //   799: fmul
    //   800: lload_3
    //   801: l2f
    //   802: fdiv
    //   803: lload_3
    //   804: l2i
    //   805: aconst_null
    //   806: iconst_0
    //   807: invokestatic 386	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:muxingForX264	(IIIILjava/lang/String;FI[BI)I
    //   810: istore_1
    //   811: ldc 65
    //   813: ldc_w 388
    //   816: iconst_1
    //   817: anewarray 69	java/lang/Object
    //   820: dup
    //   821: iconst_0
    //   822: iload_1
    //   823: invokestatic 75	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   826: aastore
    //   827: invokestatic 128	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   830: aload_0
    //   831: getfield 99	com/tencent/mm/plugin/mmsight/model/b/b:ljX	I
    //   834: ifle +22 -> 856
    //   837: aload 5
    //   839: aload_0
    //   840: getfield 85	com/tencent/mm/plugin/mmsight/model/b/b:ljR	Ljava/lang/String;
    //   843: aload_0
    //   844: getfield 99	com/tencent/mm/plugin/mmsight/model/b/b:ljX	I
    //   847: invokestatic 392	com/tencent/mm/plugin/sight/base/SightVideoJNI:tagRotateVideo	(Ljava/lang/String;Ljava/lang/String;I)V
    //   850: aload 5
    //   852: invokestatic 397	com/tencent/mm/modelsfs/FileOp:deleteFile	(Ljava/lang/String;)Z
    //   855: pop
    //   856: aload_0
    //   857: getfield 176	com/tencent/mm/plugin/mmsight/model/b/b:lhM	I
    //   860: invokestatic 190	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:releaseDataBuf	(I)V
    //   863: getstatic 403	com/tencent/mm/plugin/mmsight/model/a/j:lin	Lcom/tencent/mm/plugin/mmsight/model/a/j;
    //   866: invokevirtual 406	com/tencent/mm/plugin/mmsight/model/a/j:Fm	()V
    //   869: iload_1
    //   870: ireturn
    //   871: astore 5
    //   873: ldc 65
    //   875: aload 5
    //   877: ldc_w 408
    //   880: iconst_1
    //   881: anewarray 69	java/lang/Object
    //   884: dup
    //   885: iconst_0
    //   886: aload 5
    //   888: invokevirtual 411	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   891: aastore
    //   892: invokestatic 415	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   895: iconst_m1
    //   896: ireturn
    //   897: aload_0
    //   898: getfield 123	com/tencent/mm/plugin/mmsight/model/b/b:videoFps	I
    //   901: istore_1
    //   902: goto -614 -> 288
    //   905: astore 5
    //   907: ldc_w 278
    //   910: aload 5
    //   912: ldc_w 417
    //   915: iconst_1
    //   916: anewarray 69	java/lang/Object
    //   919: dup
    //   920: iconst_0
    //   921: aload 5
    //   923: invokevirtual 411	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   926: aastore
    //   927: invokestatic 415	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   930: goto -432 -> 498
    //   933: astore 5
    //   935: ldc 65
    //   937: aload 5
    //   939: ldc_w 419
    //   942: iconst_1
    //   943: anewarray 69	java/lang/Object
    //   946: dup
    //   947: iconst_0
    //   948: aload 5
    //   950: invokevirtual 420	java/io/IOException:getMessage	()Ljava/lang/String;
    //   953: aastore
    //   954: invokestatic 415	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   957: goto -244 -> 713
    //   960: aload_0
    //   961: getfield 301	com/tencent/mm/plugin/mmsight/model/b/b:ldo	Landroid/media/MediaExtractor;
    //   964: invokevirtual 424	android/media/MediaExtractor:getSampleTime	()J
    //   967: aload_0
    //   968: getfield 49	com/tencent/mm/plugin/mmsight/model/b/b:ljZ	J
    //   971: ldc2_w 342
    //   974: lmul
    //   975: lcmp
    //   976: ifge -263 -> 713
    //   979: aload_0
    //   980: getfield 301	com/tencent/mm/plugin/mmsight/model/b/b:ldo	Landroid/media/MediaExtractor;
    //   983: invokevirtual 427	android/media/MediaExtractor:getSampleTrackIndex	()I
    //   986: iload_1
    //   987: if_icmpeq +14 -> 1001
    //   990: ldc 65
    //   992: ldc_w 429
    //   995: invokestatic 431	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   998: goto -285 -> 713
    //   1001: aload 5
    //   1003: iconst_0
    //   1004: invokevirtual 435	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   1007: pop
    //   1008: aload_0
    //   1009: getfield 176	com/tencent/mm/plugin/mmsight/model/b/b:lhM	I
    //   1012: aload 5
    //   1014: iload_2
    //   1015: invokestatic 439	com/tencent/mm/plugin/mmsight/segment/MP4MuxerJNI:writeAACData	(ILjava/nio/ByteBuffer;I)V
    //   1018: aload_0
    //   1019: getfield 301	com/tencent/mm/plugin/mmsight/model/b/b:ldo	Landroid/media/MediaExtractor;
    //   1022: invokevirtual 443	android/media/MediaExtractor:advance	()Z
    //   1025: pop
    //   1026: goto -372 -> 654
    //   1029: goto -254 -> 775
    //   1032: aconst_null
    //   1033: astore 6
    //   1035: iconst_m1
    //   1036: istore_1
    //   1037: goto -470 -> 567
    //   1040: iload_1
    //   1041: iconst_1
    //   1042: iadd
    //   1043: istore_1
    //   1044: goto -519 -> 525
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1047	0	this	b
    //   13	1031	1	i	int
    //   11	1004	2	j	int
    //   758	46	3	l	long
    //   342	509	5	localObject1	Object
    //   871	16	5	localException1	Exception
    //   905	17	5	localException2	Exception
    //   933	80	5	localIOException	java.io.IOException
    //   544	490	6	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   443	481	871	java/lang/Exception
    //   498	509	871	java/lang/Exception
    //   509	520	871	java/lang/Exception
    //   525	567	871	java/lang/Exception
    //   576	641	871	java/lang/Exception
    //   641	654	871	java/lang/Exception
    //   654	690	871	java/lang/Exception
    //   694	713	871	java/lang/Exception
    //   713	719	871	java/lang/Exception
    //   723	753	871	java/lang/Exception
    //   753	759	871	java/lang/Exception
    //   765	775	871	java/lang/Exception
    //   775	856	871	java/lang/Exception
    //   856	869	871	java/lang/Exception
    //   907	930	871	java/lang/Exception
    //   935	957	871	java/lang/Exception
    //   960	998	871	java/lang/Exception
    //   1001	1026	871	java/lang/Exception
    //   481	498	905	java/lang/Exception
    //   509	520	933	java/io/IOException
  }
  
  public final int getType()
  {
    return 3;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/mmsight/model/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */