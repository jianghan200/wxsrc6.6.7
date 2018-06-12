package com.tencent.mm.plugin.mmsight.model.a;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.os.Looper;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import java.nio.ByteBuffer;

@TargetApi(16)
public class h
  implements c
{
  int audioSampleRate;
  com.tencent.mm.e.b.c bDp = null;
  private int dQF;
  int giA;
  private final int giU = 100;
  MediaCodec lhN;
  private MediaFormat lhO;
  private MediaCodec.BufferInfo lhP;
  long lhQ = 0L;
  int lhR;
  int lhS;
  long lhT;
  long lhU;
  private int lhV;
  boolean lhW = false;
  boolean lhX = false;
  c.a lhY = null;
  o lhZ;
  ag lia = new h.1(this, Looper.getMainLooper());
  protected boolean lib;
  boolean lic;
  final Object lid = new byte[0];
  c.b lie;
  boolean lif = false;
  ag lig;
  Runnable lih = new h.2(this);
  private com.tencent.mm.e.b.c.a lii = new h.3(this);
  private long startTime = 0L;
  
  public h(int paramInt1, int paramInt2)
  {
    this.dQF = paramInt2;
    this.audioSampleRate = paramInt1;
    this.lhZ = null;
    x.i("MicroMsg.MMSightAACMediaCodecRecorder", "create MMSightAACMediaCodecRecorder, audioBitrate: %s, audioSampleRate: %s", new Object[] { Integer.valueOf(this.dQF), Integer.valueOf(this.audioSampleRate) });
  }
  
  public final int a(c.a parama)
  {
    int j = 0;
    x.i("MicroMsg.MMSightAACMediaCodecRecorder", "start, onPcmReady: %s", new Object[] { parama });
    this.lhY = parama;
    int i = j;
    if (!this.lhX)
    {
      if (this.bDp == null)
      {
        x.i("MicroMsg.MMSightAACMediaCodecRecorder", "start, pcmrecorder is null");
        return -1;
      }
      if (!this.bDp.wn()) {
        break label61;
      }
    }
    label61:
    for (i = j;; i = -1) {
      return i;
    }
  }
  
  public final int a(c.b paramb)
  {
    boolean bool1;
    boolean bool2;
    if (this.bDp == null)
    {
      bool1 = true;
      if (this.lie != null) {
        break label89;
      }
      bool2 = true;
      label18:
      if (paramb != null) {
        break label94;
      }
    }
    label89:
    label94:
    for (boolean bool3 = true;; bool3 = false)
    {
      x.i("MicroMsg.MMSightAACMediaCodecRecorder", "call stop, pcmRecorder null[%B], old stopCallback null[%B]new stopCallback null[%B], pcmMarkStop[%B]", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(this.lib) });
      if ((this.bDp != null) || (this.lhX)) {
        break label100;
      }
      return -1;
      bool1 = false;
      break;
      bool2 = false;
      break label18;
    }
    label100:
    this.lib = true;
    synchronized (this.lid)
    {
      this.lie = paramb;
      if ((this.lic) && (paramb != null))
      {
        x.i("MicroMsg.MMSightAACMediaCodecRecorder", "has stop, directly call stop callback");
        paramb.bei();
        this.lie = null;
      }
      ah.i(new h.4(this), 500L);
      return 0;
    }
  }
  
  /* Error */
  public int at(int paramInt, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 64	com/tencent/mm/plugin/mmsight/model/a/h:lhX	Z
    //   4: ifne +45 -> 49
    //   7: aload_0
    //   8: getfield 83	com/tencent/mm/plugin/mmsight/model/a/h:bDp	Lcom/tencent/mm/e/b/c;
    //   11: ifnull +38 -> 49
    //   14: aload_0
    //   15: getfield 140	com/tencent/mm/plugin/mmsight/model/a/h:lie	Lcom/tencent/mm/plugin/mmsight/model/a/c$b;
    //   18: ifnonnull +371 -> 389
    //   21: iconst_1
    //   22: istore_3
    //   23: ldc 107
    //   25: ldc -80
    //   27: iconst_1
    //   28: anewarray 4	java/lang/Object
    //   31: dup
    //   32: iconst_0
    //   33: iload_3
    //   34: invokestatic 147	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   37: aastore
    //   38: invokestatic 179	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   41: aload_0
    //   42: getfield 83	com/tencent/mm/plugin/mmsight/model/a/h:bDp	Lcom/tencent/mm/e/b/c;
    //   45: invokevirtual 182	com/tencent/mm/e/b/c:we	()Z
    //   48: pop
    //   49: aload_0
    //   50: getfield 184	com/tencent/mm/plugin/mmsight/model/a/h:lhN	Landroid/media/MediaCodec;
    //   53: ifnull +70 -> 123
    //   56: aload_0
    //   57: getfield 140	com/tencent/mm/plugin/mmsight/model/a/h:lie	Lcom/tencent/mm/plugin/mmsight/model/a/c$b;
    //   60: ifnonnull +334 -> 394
    //   63: iconst_1
    //   64: istore_3
    //   65: ldc 107
    //   67: ldc -70
    //   69: iconst_1
    //   70: anewarray 4	java/lang/Object
    //   73: dup
    //   74: iconst_0
    //   75: iload_3
    //   76: invokestatic 147	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   79: aastore
    //   80: invokestatic 179	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   83: aload_0
    //   84: getfield 184	com/tencent/mm/plugin/mmsight/model/a/h:lhN	Landroid/media/MediaCodec;
    //   87: invokevirtual 191	android/media/MediaCodec:stop	()V
    //   90: aload_0
    //   91: getfield 184	com/tencent/mm/plugin/mmsight/model/a/h:lhN	Landroid/media/MediaCodec;
    //   94: invokevirtual 194	android/media/MediaCodec:release	()V
    //   97: aload_0
    //   98: aconst_null
    //   99: putfield 184	com/tencent/mm/plugin/mmsight/model/a/h:lhN	Landroid/media/MediaCodec;
    //   102: aload_0
    //   103: getfield 140	com/tencent/mm/plugin/mmsight/model/a/h:lie	Lcom/tencent/mm/plugin/mmsight/model/a/c$b;
    //   106: ifnull +17 -> 123
    //   109: aload_0
    //   110: getfield 140	com/tencent/mm/plugin/mmsight/model/a/h:lie	Lcom/tencent/mm/plugin/mmsight/model/a/c$b;
    //   113: invokeinterface 158 1 0
    //   118: aload_0
    //   119: aconst_null
    //   120: putfield 140	com/tencent/mm/plugin/mmsight/model/a/h:lie	Lcom/tencent/mm/plugin/mmsight/model/a/c$b;
    //   123: aload_0
    //   124: iconst_0
    //   125: putfield 196	com/tencent/mm/plugin/mmsight/model/a/h:giA	I
    //   128: aload_0
    //   129: iconst_0
    //   130: putfield 149	com/tencent/mm/plugin/mmsight/model/a/h:lib	Z
    //   133: aload_0
    //   134: getfield 85	com/tencent/mm/plugin/mmsight/model/a/h:lid	Ljava/lang/Object;
    //   137: astore_2
    //   138: aload_2
    //   139: monitorenter
    //   140: aload_0
    //   141: iconst_0
    //   142: putfield 151	com/tencent/mm/plugin/mmsight/model/a/h:lic	Z
    //   145: aload_0
    //   146: aconst_null
    //   147: putfield 140	com/tencent/mm/plugin/mmsight/model/a/h:lie	Lcom/tencent/mm/plugin/mmsight/model/a/c$b;
    //   150: aload_2
    //   151: monitorexit
    //   152: aload_0
    //   153: getfield 64	com/tencent/mm/plugin/mmsight/model/a/h:lhX	Z
    //   156: ifne +49 -> 205
    //   159: aload_0
    //   160: new 133	com/tencent/mm/e/b/c
    //   163: dup
    //   164: aload_0
    //   165: getfield 103	com/tencent/mm/plugin/mmsight/model/a/h:audioSampleRate	I
    //   168: iconst_1
    //   169: iconst_5
    //   170: invokespecial 199	com/tencent/mm/e/b/c:<init>	(III)V
    //   173: putfield 83	com/tencent/mm/plugin/mmsight/model/a/h:bDp	Lcom/tencent/mm/e/b/c;
    //   176: aload_0
    //   177: getfield 83	com/tencent/mm/plugin/mmsight/model/a/h:bDp	Lcom/tencent/mm/e/b/c;
    //   180: sipush 128
    //   183: invokevirtual 203	com/tencent/mm/e/b/c:ey	(I)V
    //   186: aload_0
    //   187: getfield 83	com/tencent/mm/plugin/mmsight/model/a/h:bDp	Lcom/tencent/mm/e/b/c;
    //   190: iconst_0
    //   191: invokevirtual 207	com/tencent/mm/e/b/c:aM	(Z)V
    //   194: aload_0
    //   195: getfield 83	com/tencent/mm/plugin/mmsight/model/a/h:bDp	Lcom/tencent/mm/e/b/c;
    //   198: aload_0
    //   199: getfield 99	com/tencent/mm/plugin/mmsight/model/a/h:lii	Lcom/tencent/mm/e/b/c$a;
    //   202: putfield 210	com/tencent/mm/e/b/c:bEb	Lcom/tencent/mm/e/b/c$a;
    //   205: aload_0
    //   206: getfield 212	com/tencent/mm/plugin/mmsight/model/a/h:lig	Lcom/tencent/mm/sdk/platformtools/ag;
    //   209: ifnonnull +197 -> 406
    //   212: ldc 107
    //   214: ldc -42
    //   216: invokestatic 131	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   219: aload_0
    //   220: new 216	com/tencent/mm/sdk/platformtools/ag
    //   223: dup
    //   224: invokespecial 217	com/tencent/mm/sdk/platformtools/ag:<init>	()V
    //   227: putfield 212	com/tencent/mm/plugin/mmsight/model/a/h:lig	Lcom/tencent/mm/sdk/platformtools/ag;
    //   230: ldc 107
    //   232: ldc -37
    //   234: iconst_2
    //   235: anewarray 4	java/lang/Object
    //   238: dup
    //   239: iconst_0
    //   240: aload_0
    //   241: getfield 103	com/tencent/mm/plugin/mmsight/model/a/h:audioSampleRate	I
    //   244: invokestatic 115	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   247: aastore
    //   248: dup
    //   249: iconst_1
    //   250: aload_0
    //   251: getfield 101	com/tencent/mm/plugin/mmsight/model/a/h:dQF	I
    //   254: invokestatic 115	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   257: aastore
    //   258: invokestatic 121	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   261: aload_0
    //   262: new 221	android/media/MediaCodec$BufferInfo
    //   265: dup
    //   266: invokespecial 222	android/media/MediaCodec$BufferInfo:<init>	()V
    //   269: putfield 224	com/tencent/mm/plugin/mmsight/model/a/h:lhP	Landroid/media/MediaCodec$BufferInfo;
    //   272: aload_0
    //   273: new 226	android/media/MediaFormat
    //   276: dup
    //   277: invokespecial 227	android/media/MediaFormat:<init>	()V
    //   280: putfield 229	com/tencent/mm/plugin/mmsight/model/a/h:lhO	Landroid/media/MediaFormat;
    //   283: aload_0
    //   284: getfield 229	com/tencent/mm/plugin/mmsight/model/a/h:lhO	Landroid/media/MediaFormat;
    //   287: ldc -25
    //   289: ldc -23
    //   291: invokevirtual 236	android/media/MediaFormat:setString	(Ljava/lang/String;Ljava/lang/String;)V
    //   294: aload_0
    //   295: getfield 229	com/tencent/mm/plugin/mmsight/model/a/h:lhO	Landroid/media/MediaFormat;
    //   298: ldc -18
    //   300: iconst_2
    //   301: invokevirtual 242	android/media/MediaFormat:setInteger	(Ljava/lang/String;I)V
    //   304: aload_0
    //   305: getfield 229	com/tencent/mm/plugin/mmsight/model/a/h:lhO	Landroid/media/MediaFormat;
    //   308: ldc -12
    //   310: aload_0
    //   311: getfield 103	com/tencent/mm/plugin/mmsight/model/a/h:audioSampleRate	I
    //   314: invokevirtual 242	android/media/MediaFormat:setInteger	(Ljava/lang/String;I)V
    //   317: aload_0
    //   318: getfield 229	com/tencent/mm/plugin/mmsight/model/a/h:lhO	Landroid/media/MediaFormat;
    //   321: ldc -10
    //   323: iconst_1
    //   324: invokevirtual 242	android/media/MediaFormat:setInteger	(Ljava/lang/String;I)V
    //   327: aload_0
    //   328: getfield 229	com/tencent/mm/plugin/mmsight/model/a/h:lhO	Landroid/media/MediaFormat;
    //   331: ldc -8
    //   333: aload_0
    //   334: getfield 101	com/tencent/mm/plugin/mmsight/model/a/h:dQF	I
    //   337: invokevirtual 242	android/media/MediaFormat:setInteger	(Ljava/lang/String;I)V
    //   340: aload_0
    //   341: getfield 229	com/tencent/mm/plugin/mmsight/model/a/h:lhO	Landroid/media/MediaFormat;
    //   344: ldc -6
    //   346: sipush 16384
    //   349: invokevirtual 242	android/media/MediaFormat:setInteger	(Ljava/lang/String;I)V
    //   352: aload_0
    //   353: ldc -23
    //   355: invokestatic 254	android/media/MediaCodec:createEncoderByType	(Ljava/lang/String;)Landroid/media/MediaCodec;
    //   358: putfield 184	com/tencent/mm/plugin/mmsight/model/a/h:lhN	Landroid/media/MediaCodec;
    //   361: aload_0
    //   362: getfield 184	com/tencent/mm/plugin/mmsight/model/a/h:lhN	Landroid/media/MediaCodec;
    //   365: aload_0
    //   366: getfield 229	com/tencent/mm/plugin/mmsight/model/a/h:lhO	Landroid/media/MediaFormat;
    //   369: aconst_null
    //   370: aconst_null
    //   371: iconst_1
    //   372: invokevirtual 258	android/media/MediaCodec:configure	(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    //   375: aload_0
    //   376: getfield 184	com/tencent/mm/plugin/mmsight/model/a/h:lhN	Landroid/media/MediaCodec;
    //   379: invokevirtual 261	android/media/MediaCodec:start	()V
    //   382: aload_0
    //   383: iconst_0
    //   384: putfield 62	com/tencent/mm/plugin/mmsight/model/a/h:lhW	Z
    //   387: iconst_0
    //   388: ireturn
    //   389: iconst_0
    //   390: istore_3
    //   391: goto -368 -> 23
    //   394: iconst_0
    //   395: istore_3
    //   396: goto -331 -> 65
    //   399: astore 4
    //   401: aload_2
    //   402: monitorexit
    //   403: aload 4
    //   405: athrow
    //   406: aload_0
    //   407: getfield 212	com/tencent/mm/plugin/mmsight/model/a/h:lig	Lcom/tencent/mm/sdk/platformtools/ag;
    //   410: invokevirtual 264	com/tencent/mm/sdk/platformtools/ag:getLooper	()Landroid/os/Looper;
    //   413: invokestatic 267	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   416: if_acmpeq -186 -> 230
    //   419: ldc 107
    //   421: ldc_w 269
    //   424: iconst_2
    //   425: anewarray 4	java/lang/Object
    //   428: dup
    //   429: iconst_0
    //   430: aload_0
    //   431: getfield 212	com/tencent/mm/plugin/mmsight/model/a/h:lig	Lcom/tencent/mm/sdk/platformtools/ag;
    //   434: invokevirtual 264	com/tencent/mm/sdk/platformtools/ag:getLooper	()Landroid/os/Looper;
    //   437: aastore
    //   438: dup
    //   439: iconst_1
    //   440: invokestatic 267	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   443: aastore
    //   444: invokestatic 272	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   447: aload_0
    //   448: new 216	com/tencent/mm/sdk/platformtools/ag
    //   451: dup
    //   452: invokespecial 217	com/tencent/mm/sdk/platformtools/ag:<init>	()V
    //   455: putfield 212	com/tencent/mm/plugin/mmsight/model/a/h:lig	Lcom/tencent/mm/sdk/platformtools/ag;
    //   458: goto -228 -> 230
    //   461: astore_2
    //   462: ldc 107
    //   464: aload_2
    //   465: ldc_w 274
    //   468: iconst_1
    //   469: anewarray 4	java/lang/Object
    //   472: dup
    //   473: iconst_0
    //   474: aload_2
    //   475: invokevirtual 278	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   478: aastore
    //   479: invokestatic 282	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   482: aload_0
    //   483: getfield 184	com/tencent/mm/plugin/mmsight/model/a/h:lhN	Landroid/media/MediaCodec;
    //   486: astore 4
    //   488: aload 4
    //   490: ifnull +22 -> 512
    //   493: aload_0
    //   494: getfield 184	com/tencent/mm/plugin/mmsight/model/a/h:lhN	Landroid/media/MediaCodec;
    //   497: invokevirtual 191	android/media/MediaCodec:stop	()V
    //   500: aload_0
    //   501: getfield 184	com/tencent/mm/plugin/mmsight/model/a/h:lhN	Landroid/media/MediaCodec;
    //   504: invokevirtual 194	android/media/MediaCodec:release	()V
    //   507: aload_0
    //   508: aconst_null
    //   509: putfield 184	com/tencent/mm/plugin/mmsight/model/a/h:lhN	Landroid/media/MediaCodec;
    //   512: ldc_w 284
    //   515: ldc_w 286
    //   518: invokestatic 131	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   521: getstatic 292	com/tencent/mm/plugin/report/service/h:mEJ	Lcom/tencent/mm/plugin/report/service/h;
    //   524: ldc2_w 293
    //   527: ldc2_w 295
    //   530: lconst_1
    //   531: iconst_0
    //   532: invokevirtual 299	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   535: aload_0
    //   536: iconst_0
    //   537: putfield 62	com/tencent/mm/plugin/mmsight/model/a/h:lhW	Z
    //   540: iconst_m1
    //   541: ireturn
    //   542: astore 4
    //   544: ldc 107
    //   546: aload_2
    //   547: ldc_w 301
    //   550: iconst_1
    //   551: anewarray 4	java/lang/Object
    //   554: dup
    //   555: iconst_0
    //   556: aload 4
    //   558: invokevirtual 302	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   561: aastore
    //   562: invokestatic 282	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   565: aload_0
    //   566: aconst_null
    //   567: putfield 184	com/tencent/mm/plugin/mmsight/model/a/h:lhN	Landroid/media/MediaCodec;
    //   570: goto -58 -> 512
    //   573: astore_2
    //   574: aload_0
    //   575: iconst_0
    //   576: putfield 62	com/tencent/mm/plugin/mmsight/model/a/h:lhW	Z
    //   579: aload_2
    //   580: athrow
    //   581: astore_2
    //   582: aload_0
    //   583: aconst_null
    //   584: putfield 184	com/tencent/mm/plugin/mmsight/model/a/h:lhN	Landroid/media/MediaCodec;
    //   587: aload_2
    //   588: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	589	0	this	h
    //   0	589	1	paramInt	int
    //   0	589	2	paramString	String
    //   22	374	3	bool	boolean
    //   399	5	4	localObject	Object
    //   486	3	4	localMediaCodec	MediaCodec
    //   542	15	4	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   140	152	399	finally
    //   401	403	399	finally
    //   261	382	461	java/lang/Throwable
    //   493	507	542	java/lang/Exception
    //   261	382	573	finally
    //   462	488	573	finally
    //   507	512	573	finally
    //   512	535	573	finally
    //   565	570	573	finally
    //   582	589	573	finally
    //   493	507	581	finally
    //   544	565	581	finally
  }
  
  public final void bef()
  {
    this.lhW = true;
  }
  
  public final com.tencent.mm.e.b.c.a beg()
  {
    return this.lii;
  }
  
  protected boolean bex()
  {
    return false;
  }
  
  public final void clear()
  {
    x.i("MicroMsg.MMSightAACMediaCodecRecorder", "clear");
    try
    {
      if (this.lhN != null)
      {
        x.i("MicroMsg.MMSightAACMediaCodecRecorder", "stop encoder");
        this.lhN.stop();
        this.lhN.release();
        this.lhN = null;
      }
      if ((this.bDp != null) && (!this.lhX))
      {
        x.i("MicroMsg.MMSightAACMediaCodecRecorder", "stop pcm recorder");
        this.bDp.we();
        this.bDp = null;
      }
      return;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.MMSightAACMediaCodecRecorder", "clear error: %s", new Object[] { localException.getMessage() });
    }
  }
  
  protected void e(ByteBuffer paramByteBuffer, MediaCodec.BufferInfo paramBufferInfo)
  {
    if ((this.lhZ != null) && ((paramBufferInfo.flags & 0x4) == 0)) {
      this.lhZ.f(paramByteBuffer, paramBufferInfo);
    }
  }
  
  public final void gt(boolean paramBoolean)
  {
    this.lhX = paramBoolean;
  }
  
  final void gu(boolean paramBoolean)
  {
    if (this.lhN == null)
    {
      x.w("MicroMsg.MMSightAACMediaCodecRecorder", "drain audio encoder error, encoder is null, end:" + paramBoolean);
      return;
    }
    do
    {
      ByteBuffer[] arrayOfByteBuffer2;
      for (;;)
      {
        try
        {
          ByteBuffer[] arrayOfByteBuffer1 = this.lhN.getOutputBuffers();
          this.lhV = this.lhN.dequeueOutputBuffer(this.lhP, 100L);
          x.v("MicroMsg.MMSightAACMediaCodecRecorder", "outputBufferIndex-->%s", new Object[] { Integer.valueOf(this.lhV) });
          if (this.lhV == -1)
          {
            x.d("MicroMsg.MMSightAACMediaCodecRecorder", "no output available, break");
            return;
          }
        }
        catch (Exception localException)
        {
          x.e("MicroMsg.MMSightAACMediaCodecRecorder", "drainEncoder error: %s", new Object[] { localException.getMessage() });
          return;
        }
        if (this.lhV == -3)
        {
          arrayOfByteBuffer2 = this.lhN.getOutputBuffers();
        }
        else if (this.lhV == -2)
        {
          localObject = this.lhN.getOutputFormat();
          x.d("MicroMsg.MMSightAACMediaCodecRecorder", "encoder output format changed: " + localObject);
          if (this.lhZ != null) {
            this.lhZ.d((MediaFormat)localObject);
          }
        }
        else
        {
          if (this.lhV >= 0) {
            break;
          }
          x.v("MicroMsg.MMSightAACMediaCodecRecorder", "unexpected result from encoder.dequeueOutputBuffer: %s", new Object[] { Integer.valueOf(this.lhV) });
        }
      }
      x.v("MicroMsg.MMSightAACMediaCodecRecorder", "perform encoding");
      Object localObject = arrayOfByteBuffer2[this.lhV];
      if (localObject == null) {
        throw new RuntimeException("encoderOutputBuffer " + this.lhV + " was null");
      }
      if ((this.lhP.flags & 0x2) != 0)
      {
        x.v("MicroMsg.MMSightAACMediaCodecRecorder", "ignoring BUFFER_FLAG_CODEC_CONFIG,size: %s, %s", new Object[] { Integer.valueOf(this.lhP.size), Boolean.valueOf(bex()) });
        if (bex()) {
          this.lhP.size = 0;
        }
      }
      if (this.lhP.size != 0)
      {
        if ((this.lhZ != null) && (!this.lhZ.bTv))
        {
          MediaFormat localMediaFormat = this.lhN.getOutputFormat();
          this.lhZ.d(localMediaFormat);
        }
        ((ByteBuffer)localObject).position(this.lhP.offset);
        ((ByteBuffer)localObject).limit(this.lhP.offset + this.lhP.size);
        e((ByteBuffer)localObject, this.lhP);
      }
      this.lhN.releaseOutputBuffer(this.lhV, false);
    } while ((this.lhP.flags & 0x4) == 0);
    if (!paramBoolean)
    {
      x.w("MicroMsg.MMSightAACMediaCodecRecorder", "reached end of stream unexpectedly");
      return;
    }
    x.w("MicroMsg.MMSightAACMediaCodecRecorder", "do stop audio encoder");
    this.lhN.stop();
    this.lhN.release();
    this.lhN = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/mmsight/model/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */