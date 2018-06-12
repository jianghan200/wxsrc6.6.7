package com.tencent.mm.plugin.u;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.util.Pair;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.List;

public abstract class h
{
  private ByteBuffer[] agE;
  private MediaCodec.BufferInfo apA = new MediaCodec.BufferInfo();
  private ByteBuffer[] apO;
  private int apQ;
  private int apR;
  long aqC;
  protected g ldg;
  protected ag ldh;
  private boolean ldi = false;
  b ldj = null;
  protected long ldk = 0L;
  MediaFormat ldl;
  private String ldm;
  int ldn;
  MediaExtractor ldo;
  private f ldp;
  protected MediaCodec ldq;
  private boolean ldr = false;
  private boolean lds = false;
  private volatile Object lock = new Object();
  protected String path;
  protected int state;
  
  public h(g paramg, ag paramag)
  {
    this.ldg = paramg;
    this.ldh = paramag;
    this.state = 0;
    this.apQ = -1;
    this.apR = -1;
  }
  
  private void bdw()
  {
    if (this.ldj != null) {
      this.ldk = (this.ldj.bdp() * 1000L);
    }
  }
  
  private boolean d(long paramLong1, long paramLong2)
  {
    x.d("MicroMsg.TrackDataSource", "%s drain output buffer time[%d %d] index %d", new Object[] { avA(), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(this.apR) });
    if (this.apR < 0)
    {
      synchronized (this.lock)
      {
        this.apR = this.ldq.dequeueOutputBuffer(this.apA, 0L);
        if (this.apR < 0) {
          break label291;
        }
        if ((this.apA.flags & 0x4) != 0)
        {
          x.i("MicroMsg.TrackDataSource", "%s process end of stream", new Object[] { avA() });
          setState(9);
          this.apR = -1;
          return false;
        }
      }
      ??? = this.agE[this.apR];
      if (??? != null)
      {
        ((ByteBuffer)???).position(this.apA.offset);
        ((ByteBuffer)???).limit(this.apA.offset + this.apA.size);
      }
    }
    if (this.state == 1) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        setState(2);
      }
      x.d("MicroMsg.TrackDataSource", "%s process output buffer index %d ", new Object[] { avA(), Integer.valueOf(this.apR) });
      synchronized (this.lock)
      {
        if (!a(paramLong1, paramLong2, this.ldq, this.agE[this.apR], this.apR, this.apA)) {
          break;
        }
        this.apR = -1;
        return true;
      }
      label291:
      if (this.apR == -2)
      {
        this.ldl = this.ldq.getOutputFormat();
        b(this.ldq);
        return true;
      }
      if (this.apR == -3)
      {
        this.agE = this.ldq.getOutputBuffers();
        return true;
      }
      x.d("MicroMsg.TrackDataSource", "%s drain output buffer error outputIndex[%d]", new Object[] { avA(), Integer.valueOf(this.apR) });
      return false;
    }
    return false;
  }
  
  protected boolean B(int paramInt, long paramLong)
  {
    return false;
  }
  
  abstract boolean a(long paramLong1, long paramLong2, MediaCodec paramMediaCodec, ByteBuffer paramByteBuffer, int paramInt, MediaCodec.BufferInfo paramBufferInfo);
  
  abstract boolean a(MediaCodec paramMediaCodec);
  
  public final String avA()
  {
    return type() + "_" + this.ldg.avA();
  }
  
  protected void b(MediaCodec paramMediaCodec) {}
  
  protected void b(MediaFormat paramMediaFormat, String paramString, int paramInt)
  {
    x.i("MicroMsg.TrackDataSource", "%s found media format mime[%s] track[%d]", new Object[] { avA(), paramString, Integer.valueOf(paramInt) });
    this.ldn = paramInt;
    this.ldm = paramString;
    this.aqC = (paramMediaFormat.getLong("durationUs") / 1000L);
    this.ldl = paramMediaFormat;
  }
  
  public final void bdx()
  {
    x.i("MicroMsg.TrackDataSource", "%s flush codec", new Object[] { avA() });
    this.apR = -1;
    this.apQ = -1;
    try
    {
      if (this.ldq != null) {
        this.ldq.flush();
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  protected final boolean bdy()
  {
    try
    {
      x.i("MicroMsg.TrackDataSource", "%s start to prepare decoder mime[%s]", new Object[] { avA(), this.ldm });
      this.ldq = MediaCodec.createDecoderByType(this.ldm);
      a(this.ldq);
      this.ldq.start();
      this.apO = this.ldq.getInputBuffers();
      this.agE = this.ldq.getOutputBuffers();
      return true;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.TrackDataSource", localException, "%s prepare decoder init decoder error ", new Object[] { avA() });
      this.ldg.Hm(type());
    }
    return false;
  }
  
  /* Error */
  public final boolean bdz()
  {
    // Byte code:
    //   0: ldc 86
    //   2: ldc -10
    //   4: iconst_2
    //   5: anewarray 4	java/lang/Object
    //   8: dup
    //   9: iconst_0
    //   10: aload_0
    //   11: invokevirtual 92	com/tencent/mm/plugin/u/h:avA	()Ljava/lang/String;
    //   14: aastore
    //   15: dup
    //   16: iconst_1
    //   17: aload_0
    //   18: getfield 248	com/tencent/mm/plugin/u/h:path	Ljava/lang/String;
    //   21: aastore
    //   22: invokestatic 124	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   25: invokestatic 253	com/tencent/mm/sdk/platformtools/bi:VG	()J
    //   28: lstore 5
    //   30: lconst_0
    //   31: lstore_3
    //   32: ldc 86
    //   34: ldc -1
    //   36: iconst_1
    //   37: anewarray 4	java/lang/Object
    //   40: dup
    //   41: iconst_0
    //   42: aload_0
    //   43: invokevirtual 92	com/tencent/mm/plugin/u/h:avA	()Ljava/lang/String;
    //   46: aastore
    //   47: invokestatic 124	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   50: aload_0
    //   51: new 257	android/media/MediaExtractor
    //   54: dup
    //   55: invokespecial 258	android/media/MediaExtractor:<init>	()V
    //   58: putfield 260	com/tencent/mm/plugin/u/h:ldo	Landroid/media/MediaExtractor;
    //   61: aload_0
    //   62: getfield 260	com/tencent/mm/plugin/u/h:ldo	Landroid/media/MediaExtractor;
    //   65: aload_0
    //   66: getfield 248	com/tencent/mm/plugin/u/h:path	Ljava/lang/String;
    //   69: invokevirtual 263	android/media/MediaExtractor:setDataSource	(Ljava/lang/String;)V
    //   72: aload_0
    //   73: getfield 260	com/tencent/mm/plugin/u/h:ldo	Landroid/media/MediaExtractor;
    //   76: invokevirtual 267	android/media/MediaExtractor:getTrackCount	()I
    //   79: istore_2
    //   80: aload_0
    //   81: iconst_m1
    //   82: putfield 193	com/tencent/mm/plugin/u/h:ldn	I
    //   85: iconst_0
    //   86: istore_1
    //   87: iload_1
    //   88: iload_2
    //   89: if_icmpge +49 -> 138
    //   92: aload_0
    //   93: getfield 260	com/tencent/mm/plugin/u/h:ldo	Landroid/media/MediaExtractor;
    //   96: iload_1
    //   97: invokevirtual 271	android/media/MediaExtractor:getTrackFormat	(I)Landroid/media/MediaFormat;
    //   100: astore 9
    //   102: aload 9
    //   104: ldc_w 273
    //   107: invokevirtual 277	android/media/MediaFormat:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   110: astore 10
    //   112: aload 10
    //   114: ifnull +399 -> 513
    //   117: aload 10
    //   119: aload_0
    //   120: invokevirtual 176	com/tencent/mm/plugin/u/h:type	()Ljava/lang/String;
    //   123: invokevirtual 283	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   126: ifeq +387 -> 513
    //   129: aload_0
    //   130: aload 9
    //   132: aload 10
    //   134: iload_1
    //   135: invokevirtual 285	com/tencent/mm/plugin/u/h:b	(Landroid/media/MediaFormat;Ljava/lang/String;I)V
    //   138: aload_0
    //   139: getfield 193	com/tencent/mm/plugin/u/h:ldn	I
    //   142: ifge +51 -> 193
    //   145: ldc 86
    //   147: ldc_w 287
    //   150: iconst_3
    //   151: anewarray 4	java/lang/Object
    //   154: dup
    //   155: iconst_0
    //   156: aload_0
    //   157: invokevirtual 92	com/tencent/mm/plugin/u/h:avA	()Ljava/lang/String;
    //   160: aastore
    //   161: dup
    //   162: iconst_1
    //   163: iload_2
    //   164: invokestatic 103	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   167: aastore
    //   168: dup
    //   169: iconst_2
    //   170: aload_0
    //   171: getfield 193	com/tencent/mm/plugin/u/h:ldn	I
    //   174: invokestatic 103	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   177: aastore
    //   178: invokestatic 290	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   181: aload_0
    //   182: getfield 64	com/tencent/mm/plugin/u/h:ldg	Lcom/tencent/mm/plugin/u/g;
    //   185: ldc_w 292
    //   188: invokevirtual 295	com/tencent/mm/plugin/u/g:Hl	(Ljava/lang/String;)V
    //   191: iconst_0
    //   192: ireturn
    //   193: aload_0
    //   194: getfield 260	com/tencent/mm/plugin/u/h:ldo	Landroid/media/MediaExtractor;
    //   197: aload_0
    //   198: getfield 193	com/tencent/mm/plugin/u/h:ldn	I
    //   201: invokevirtual 298	android/media/MediaExtractor:selectTrack	(I)V
    //   204: aload_0
    //   205: aconst_null
    //   206: putfield 300	com/tencent/mm/plugin/u/h:ldp	Lcom/tencent/mm/plugin/u/f;
    //   209: invokestatic 253	com/tencent/mm/sdk/platformtools/bi:VG	()J
    //   212: lstore 7
    //   214: ldc 86
    //   216: ldc_w 302
    //   219: iconst_3
    //   220: anewarray 4	java/lang/Object
    //   223: dup
    //   224: iconst_0
    //   225: aload_0
    //   226: invokevirtual 92	com/tencent/mm/plugin/u/h:avA	()Ljava/lang/String;
    //   229: aastore
    //   230: dup
    //   231: iconst_1
    //   232: aload_0
    //   233: getfield 195	com/tencent/mm/plugin/u/h:ldm	Ljava/lang/String;
    //   236: aastore
    //   237: dup
    //   238: iconst_2
    //   239: aload_0
    //   240: getfield 68	com/tencent/mm/plugin/u/h:state	I
    //   243: invokestatic 103	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   246: aastore
    //   247: invokestatic 124	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   250: aload_0
    //   251: getfield 68	com/tencent/mm/plugin/u/h:state	I
    //   254: invokestatic 308	com/tencent/mm/plugin/u/d:sB	(I)Z
    //   257: ifne +68 -> 325
    //   260: aload_0
    //   261: getfield 58	com/tencent/mm/plugin/u/h:lock	Ljava/lang/Object;
    //   264: astore 9
    //   266: aload 9
    //   268: monitorenter
    //   269: aload_0
    //   270: aload_0
    //   271: getfield 195	com/tencent/mm/plugin/u/h:ldm	Ljava/lang/String;
    //   274: invokestatic 221	android/media/MediaCodec:createDecoderByType	(Ljava/lang/String;)Landroid/media/MediaCodec;
    //   277: putfield 110	com/tencent/mm/plugin/u/h:ldq	Landroid/media/MediaCodec;
    //   280: aload_0
    //   281: aload_0
    //   282: getfield 110	com/tencent/mm/plugin/u/h:ldq	Landroid/media/MediaCodec;
    //   285: invokevirtual 223	com/tencent/mm/plugin/u/h:a	(Landroid/media/MediaCodec;)Z
    //   288: pop
    //   289: aload_0
    //   290: getfield 110	com/tencent/mm/plugin/u/h:ldq	Landroid/media/MediaCodec;
    //   293: invokevirtual 226	android/media/MediaCodec:start	()V
    //   296: aload_0
    //   297: aload_0
    //   298: getfield 110	com/tencent/mm/plugin/u/h:ldq	Landroid/media/MediaCodec;
    //   301: invokevirtual 229	android/media/MediaCodec:getInputBuffers	()[Ljava/nio/ByteBuffer;
    //   304: putfield 231	com/tencent/mm/plugin/u/h:apO	[Ljava/nio/ByteBuffer;
    //   307: aload_0
    //   308: aload_0
    //   309: getfield 110	com/tencent/mm/plugin/u/h:ldq	Landroid/media/MediaCodec;
    //   312: invokevirtual 165	android/media/MediaCodec:getOutputBuffers	()[Ljava/nio/ByteBuffer;
    //   315: putfield 130	com/tencent/mm/plugin/u/h:agE	[Ljava/nio/ByteBuffer;
    //   318: aload 9
    //   320: monitorexit
    //   321: invokestatic 253	com/tencent/mm/sdk/platformtools/bi:VG	()J
    //   324: lstore_3
    //   325: aload_0
    //   326: iconst_1
    //   327: invokevirtual 128	com/tencent/mm/plugin/u/h:setState	(I)V
    //   330: ldc 86
    //   332: ldc_w 310
    //   335: iconst_4
    //   336: anewarray 4	java/lang/Object
    //   339: dup
    //   340: iconst_0
    //   341: aload_0
    //   342: invokevirtual 92	com/tencent/mm/plugin/u/h:avA	()Ljava/lang/String;
    //   345: aastore
    //   346: dup
    //   347: iconst_1
    //   348: lload 5
    //   350: invokestatic 314	com/tencent/mm/sdk/platformtools/bi:bI	(J)J
    //   353: invokestatic 98	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   356: aastore
    //   357: dup
    //   358: iconst_2
    //   359: lload 7
    //   361: lload 5
    //   363: lsub
    //   364: invokestatic 98	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   367: aastore
    //   368: dup
    //   369: iconst_3
    //   370: lload_3
    //   371: lload 5
    //   373: lsub
    //   374: invokestatic 98	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   377: aastore
    //   378: invokestatic 124	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   381: iconst_1
    //   382: ireturn
    //   383: astore 9
    //   385: ldc 86
    //   387: aload 9
    //   389: ldc_w 316
    //   392: iconst_1
    //   393: anewarray 4	java/lang/Object
    //   396: dup
    //   397: iconst_0
    //   398: aload_0
    //   399: invokevirtual 92	com/tencent/mm/plugin/u/h:avA	()Ljava/lang/String;
    //   402: aastore
    //   403: invokestatic 237	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   406: aload_0
    //   407: getfield 64	com/tencent/mm/plugin/u/h:ldg	Lcom/tencent/mm/plugin/u/g;
    //   410: aload 9
    //   412: invokevirtual 317	java/lang/Exception:toString	()Ljava/lang/String;
    //   415: invokevirtual 295	com/tencent/mm/plugin/u/g:Hl	(Ljava/lang/String;)V
    //   418: iconst_0
    //   419: ireturn
    //   420: astore 9
    //   422: ldc 86
    //   424: ldc_w 319
    //   427: iconst_2
    //   428: anewarray 4	java/lang/Object
    //   431: dup
    //   432: iconst_0
    //   433: aload_0
    //   434: invokevirtual 92	com/tencent/mm/plugin/u/h:avA	()Ljava/lang/String;
    //   437: aastore
    //   438: dup
    //   439: iconst_1
    //   440: aload 9
    //   442: invokevirtual 320	java/lang/Throwable:toString	()Ljava/lang/String;
    //   445: aastore
    //   446: invokestatic 323	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   449: aload_0
    //   450: getfield 64	com/tencent/mm/plugin/u/h:ldg	Lcom/tencent/mm/plugin/u/g;
    //   453: aload 9
    //   455: invokevirtual 320	java/lang/Throwable:toString	()Ljava/lang/String;
    //   458: invokevirtual 295	com/tencent/mm/plugin/u/g:Hl	(Ljava/lang/String;)V
    //   461: iconst_0
    //   462: ireturn
    //   463: astore 10
    //   465: aload 9
    //   467: monitorexit
    //   468: aload 10
    //   470: athrow
    //   471: astore 9
    //   473: ldc 86
    //   475: ldc_w 325
    //   478: iconst_2
    //   479: anewarray 4	java/lang/Object
    //   482: dup
    //   483: iconst_0
    //   484: aload_0
    //   485: invokevirtual 92	com/tencent/mm/plugin/u/h:avA	()Ljava/lang/String;
    //   488: aastore
    //   489: dup
    //   490: iconst_1
    //   491: aload 9
    //   493: invokevirtual 317	java/lang/Exception:toString	()Ljava/lang/String;
    //   496: aastore
    //   497: invokestatic 323	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   500: aload_0
    //   501: getfield 64	com/tencent/mm/plugin/u/h:ldg	Lcom/tencent/mm/plugin/u/g;
    //   504: aload_0
    //   505: invokevirtual 176	com/tencent/mm/plugin/u/h:type	()Ljava/lang/String;
    //   508: invokevirtual 241	com/tencent/mm/plugin/u/g:Hm	(Ljava/lang/String;)V
    //   511: iconst_0
    //   512: ireturn
    //   513: iload_1
    //   514: iconst_1
    //   515: iadd
    //   516: istore_1
    //   517: goto -430 -> 87
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	520	0	this	h
    //   86	431	1	i	int
    //   79	85	2	j	int
    //   31	340	3	l1	long
    //   28	344	5	l2	long
    //   212	148	7	l3	long
    //   383	28	9	localException1	Exception
    //   420	46	9	localThrowable	Throwable
    //   471	21	9	localException2	Exception
    //   110	23	10	str	String
    //   463	6	10	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   32	85	383	java/lang/Exception
    //   92	112	383	java/lang/Exception
    //   117	138	383	java/lang/Exception
    //   138	191	383	java/lang/Exception
    //   193	214	383	java/lang/Exception
    //   32	85	420	java/lang/Throwable
    //   92	112	420	java/lang/Throwable
    //   117	138	420	java/lang/Throwable
    //   138	191	420	java/lang/Throwable
    //   193	214	420	java/lang/Throwable
    //   269	321	463	finally
    //   465	468	463	finally
    //   214	250	471	java/lang/Exception
    //   250	269	471	java/lang/Exception
    //   321	325	471	java/lang/Exception
    //   468	471	471	java/lang/Exception
  }
  
  /* Error */
  protected final void ll()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 110	com/tencent/mm/plugin/u/h:ldq	Landroid/media/MediaCodec;
    //   4: ifnull +126 -> 130
    //   7: ldc 86
    //   9: ldc_w 328
    //   12: iconst_1
    //   13: anewarray 4	java/lang/Object
    //   16: dup
    //   17: iconst_0
    //   18: aload_0
    //   19: invokevirtual 92	com/tencent/mm/plugin/u/h:avA	()Ljava/lang/String;
    //   22: aastore
    //   23: invokestatic 124	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   26: aload_0
    //   27: invokevirtual 330	com/tencent/mm/plugin/u/h:bdx	()V
    //   30: aload_0
    //   31: aconst_null
    //   32: putfield 130	com/tencent/mm/plugin/u/h:agE	[Ljava/nio/ByteBuffer;
    //   35: aload_0
    //   36: aconst_null
    //   37: putfield 231	com/tencent/mm/plugin/u/h:apO	[Ljava/nio/ByteBuffer;
    //   40: invokestatic 253	com/tencent/mm/sdk/platformtools/bi:VG	()J
    //   43: lstore_1
    //   44: aload_0
    //   45: getfield 58	com/tencent/mm/plugin/u/h:lock	Ljava/lang/Object;
    //   48: astore_3
    //   49: aload_3
    //   50: monitorenter
    //   51: ldc 86
    //   53: ldc_w 332
    //   56: iconst_2
    //   57: anewarray 4	java/lang/Object
    //   60: dup
    //   61: iconst_0
    //   62: aload_0
    //   63: invokevirtual 92	com/tencent/mm/plugin/u/h:avA	()Ljava/lang/String;
    //   66: aastore
    //   67: dup
    //   68: iconst_1
    //   69: lload_1
    //   70: invokestatic 314	com/tencent/mm/sdk/platformtools/bi:bI	(J)J
    //   73: invokestatic 98	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   76: aastore
    //   77: invokestatic 124	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   80: aload_0
    //   81: getfield 110	com/tencent/mm/plugin/u/h:ldq	Landroid/media/MediaCodec;
    //   84: invokevirtual 335	android/media/MediaCodec:stop	()V
    //   87: aload_0
    //   88: getfield 110	com/tencent/mm/plugin/u/h:ldq	Landroid/media/MediaCodec;
    //   91: invokevirtual 338	android/media/MediaCodec:release	()V
    //   94: aload_0
    //   95: aconst_null
    //   96: putfield 110	com/tencent/mm/plugin/u/h:ldq	Landroid/media/MediaCodec;
    //   99: aload_3
    //   100: monitorexit
    //   101: ldc 86
    //   103: ldc_w 340
    //   106: iconst_2
    //   107: anewarray 4	java/lang/Object
    //   110: dup
    //   111: iconst_0
    //   112: aload_0
    //   113: invokevirtual 92	com/tencent/mm/plugin/u/h:avA	()Ljava/lang/String;
    //   116: aastore
    //   117: dup
    //   118: iconst_1
    //   119: lload_1
    //   120: invokestatic 314	com/tencent/mm/sdk/platformtools/bi:bI	(J)J
    //   123: invokestatic 98	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   126: aastore
    //   127: invokestatic 124	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   130: return
    //   131: astore 4
    //   133: aload_0
    //   134: aconst_null
    //   135: putfield 110	com/tencent/mm/plugin/u/h:ldq	Landroid/media/MediaCodec;
    //   138: aload 4
    //   140: athrow
    //   141: astore 4
    //   143: aload_3
    //   144: monitorexit
    //   145: aload 4
    //   147: athrow
    //   148: astore 4
    //   150: aload_0
    //   151: getfield 110	com/tencent/mm/plugin/u/h:ldq	Landroid/media/MediaCodec;
    //   154: invokevirtual 338	android/media/MediaCodec:release	()V
    //   157: aload_0
    //   158: aconst_null
    //   159: putfield 110	com/tencent/mm/plugin/u/h:ldq	Landroid/media/MediaCodec;
    //   162: goto -63 -> 99
    //   165: astore 4
    //   167: aload_0
    //   168: aconst_null
    //   169: putfield 110	com/tencent/mm/plugin/u/h:ldq	Landroid/media/MediaCodec;
    //   172: aload 4
    //   174: athrow
    //   175: astore 4
    //   177: aload_0
    //   178: getfield 110	com/tencent/mm/plugin/u/h:ldq	Landroid/media/MediaCodec;
    //   181: invokevirtual 338	android/media/MediaCodec:release	()V
    //   184: aload_0
    //   185: aconst_null
    //   186: putfield 110	com/tencent/mm/plugin/u/h:ldq	Landroid/media/MediaCodec;
    //   189: aload 4
    //   191: athrow
    //   192: astore 4
    //   194: aload_0
    //   195: aconst_null
    //   196: putfield 110	com/tencent/mm/plugin/u/h:ldq	Landroid/media/MediaCodec;
    //   199: aload 4
    //   201: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	202	0	this	h
    //   43	77	1	l	long
    //   48	96	3	localObject1	Object
    //   131	8	4	localObject2	Object
    //   141	5	4	localObject3	Object
    //   148	1	4	localException	Exception
    //   165	8	4	localObject4	Object
    //   175	15	4	localObject5	Object
    //   192	8	4	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   87	94	131	finally
    //   51	80	141	finally
    //   94	99	141	finally
    //   99	101	141	finally
    //   133	141	141	finally
    //   143	145	141	finally
    //   157	162	141	finally
    //   167	175	141	finally
    //   184	192	141	finally
    //   194	202	141	finally
    //   80	87	148	java/lang/Exception
    //   150	157	165	finally
    //   80	87	175	finally
    //   177	184	192	finally
  }
  
  protected void onPause() {}
  
  protected void onStart() {}
  
  public final void pause()
  {
    x.i("MicroMsg.TrackDataSource", "%s start to pause", new Object[] { avA() });
    setState(4);
    onPause();
  }
  
  public void release()
  {
    x.i("MicroMsg.TrackDataSource", "%s release", new Object[] { avA() });
    if (this.ldo != null)
    {
      this.ldo.release();
      this.ldo = null;
    }
    if (this.ldq != null)
    {
      this.ldq.release();
      this.ldq = null;
    }
    f localf;
    if (this.ldp != null)
    {
      localf = this.ldp;
      if (localf.lcP == null) {}
    }
    try
    {
      localf.lcP.close();
      localf.eyW.clear();
      localf.eyW = null;
      localf.eyX.clear();
      localf.eyX = null;
      localf.lcQ = null;
      x.i("MicroMsg.TrackDataSource", "%s finish release", new Object[] { avA() });
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public final long sF(int paramInt)
  {
    x.i("MicroMsg.TrackDataSource", "%s start to seek to ms[%d] isFeedEnd[%b]", new Object[] { avA(), Integer.valueOf(paramInt), Boolean.valueOf(this.ldi) });
    bdx();
    this.ldi = false;
    if (this.ldp != null) {}
    for (;;)
    {
      long l;
      int i;
      try
      {
        f localf = this.ldp;
        l = paramInt * 1000;
        i = 0;
        if (i < localf.eyX.size())
        {
          Pair localPair = (Pair)localf.eyX.get(i);
          if (l >= ((Long)localPair.second).longValue())
          {
            if (l != ((Long)localPair.second).longValue()) {
              break label590;
            }
            localf.lcR = ((Integer)localPair.first).intValue();
            localf.lcQ = ((com.tencent.mm.plugin.a.g)localf.eyW.get(localf.lcR));
            if (this.ldp.lcQ.eyZ < 0L) {
              w(paramInt * 1000L, -1L);
            }
            if (this.ldp.lcQ.eyZ < 0L)
            {
              w(0L, -1L);
              this.ldg.bdv();
            }
            l = this.ldp.lcQ.eyZ;
            x.i("MicroMsg.TrackDataSource", "%s finish to seek extractor [%d]", new Object[] { avA(), Long.valueOf(l) });
            return l / 1000L;
          }
        }
        if ((i == 0) || (i == localf.eyX.size() - 1))
        {
          localf.lcR = ((Integer)((Pair)localf.eyX.get(i)).first).intValue();
          localf.lcQ = ((com.tencent.mm.plugin.a.g)localf.eyW.get(localf.lcR));
          continue;
        }
        localException1.lcR = ((Integer)((Pair)localException1.eyX.get(i - 1)).first).intValue();
      }
      catch (Exception localException1)
      {
        x.printErrStackTrace("MicroMsg.TrackDataSource", localException1, "%s extractor seek exception %s", new Object[] { avA(), localException1.toString() });
        return 0L;
      }
      localException1.lcQ = ((com.tencent.mm.plugin.a.g)localException1.eyW.get(localException1.lcR));
      continue;
      try
      {
        this.ldo.seekTo(paramInt * 1000, 0);
        if (this.ldo.getSampleTime() < 0L) {
          w(paramInt * 1000L, -1L);
        }
        if (this.ldo.getSampleTime() < 0L)
        {
          w(0L, -1L);
          this.ldg.bdv();
        }
        l = this.ldo.getSampleTime();
        x.i("MicroMsg.TrackDataSource", "%s finish to seek extractor [%d, %d]", new Object[] { avA(), Long.valueOf(l), Long.valueOf(this.ldo.getCachedDuration()) });
        l /= 1000L;
        return l;
      }
      catch (Exception localException2)
      {
        x.printErrStackTrace("MicroMsg.TrackDataSource", localException2, "%s extractor seek exception %s", new Object[] { avA(), localException2.toString() });
        return 0L;
      }
      label590:
      i += 1;
    }
  }
  
  public final void setPath(String paramString)
  {
    this.path = paramString;
  }
  
  protected final void setState(int paramInt)
  {
    x.i("MicroMsg.TrackDataSource", "%s set state old %d new %d", new Object[] { avA(), Integer.valueOf(this.state), Integer.valueOf(paramInt) });
    this.state = paramInt;
  }
  
  public final void start()
  {
    x.i("MicroMsg.TrackDataSource", "%s start to play", new Object[] { avA() });
    setState(3);
    onStart();
  }
  
  abstract String type();
  
  /* Error */
  protected final int v(long paramLong1, long paramLong2)
  {
    // Byte code:
    //   0: ldc 86
    //   2: ldc_w 452
    //   5: iconst_4
    //   6: anewarray 4	java/lang/Object
    //   9: dup
    //   10: iconst_0
    //   11: aload_0
    //   12: invokevirtual 92	com/tencent/mm/plugin/u/h:avA	()Ljava/lang/String;
    //   15: aastore
    //   16: dup
    //   17: iconst_1
    //   18: lload_1
    //   19: invokestatic 98	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   22: aastore
    //   23: dup
    //   24: iconst_2
    //   25: lload_3
    //   26: invokestatic 98	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   29: aastore
    //   30: dup
    //   31: iconst_3
    //   32: aload_0
    //   33: getfield 68	com/tencent/mm/plugin/u/h:state	I
    //   36: invokestatic 103	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   39: aastore
    //   40: invokestatic 108	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   43: aload_0
    //   44: getfield 110	com/tencent/mm/plugin/u/h:ldq	Landroid/media/MediaCodec;
    //   47: ifnull +111 -> 158
    //   50: aload_0
    //   51: lload_1
    //   52: lload_3
    //   53: invokespecial 454	com/tencent/mm/plugin/u/h:d	(JJ)Z
    //   56: ifeq +17 -> 73
    //   59: aload_0
    //   60: getfield 68	com/tencent/mm/plugin/u/h:state	I
    //   63: invokestatic 308	com/tencent/mm/plugin/u/d:sB	(I)Z
    //   66: istore 9
    //   68: iload 9
    //   70: ifeq -20 -> 50
    //   73: ldc 86
    //   75: ldc_w 456
    //   78: iconst_4
    //   79: anewarray 4	java/lang/Object
    //   82: dup
    //   83: iconst_0
    //   84: aload_0
    //   85: invokevirtual 92	com/tencent/mm/plugin/u/h:avA	()Ljava/lang/String;
    //   88: aastore
    //   89: dup
    //   90: iconst_1
    //   91: aload_0
    //   92: getfield 70	com/tencent/mm/plugin/u/h:apQ	I
    //   95: invokestatic 103	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   98: aastore
    //   99: dup
    //   100: iconst_2
    //   101: aload_0
    //   102: getfield 68	com/tencent/mm/plugin/u/h:state	I
    //   105: invokestatic 103	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   108: aastore
    //   109: dup
    //   110: iconst_3
    //   111: aload_0
    //   112: getfield 47	com/tencent/mm/plugin/u/h:ldi	Z
    //   115: invokestatic 390	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   118: aastore
    //   119: invokestatic 108	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   122: aload_0
    //   123: getfield 68	com/tencent/mm/plugin/u/h:state	I
    //   126: invokestatic 308	com/tencent/mm/plugin/u/d:sB	(I)Z
    //   129: ifne +10 -> 139
    //   132: aload_0
    //   133: getfield 47	com/tencent/mm/plugin/u/h:ldi	Z
    //   136: ifeq +222 -> 358
    //   139: ldc 86
    //   141: ldc_w 458
    //   144: iconst_1
    //   145: anewarray 4	java/lang/Object
    //   148: dup
    //   149: iconst_0
    //   150: aload_0
    //   151: invokevirtual 92	com/tencent/mm/plugin/u/h:avA	()Ljava/lang/String;
    //   154: aastore
    //   155: invokestatic 124	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   158: ldc 86
    //   160: ldc_w 460
    //   163: iconst_2
    //   164: anewarray 4	java/lang/Object
    //   167: dup
    //   168: iconst_0
    //   169: aload_0
    //   170: invokevirtual 92	com/tencent/mm/plugin/u/h:avA	()Ljava/lang/String;
    //   173: aastore
    //   174: dup
    //   175: iconst_1
    //   176: aload_0
    //   177: getfield 68	com/tencent/mm/plugin/u/h:state	I
    //   180: invokestatic 103	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   183: aastore
    //   184: invokestatic 108	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   187: aload_0
    //   188: getfield 68	com/tencent/mm/plugin/u/h:state	I
    //   191: ireturn
    //   192: astore 10
    //   194: aload_0
    //   195: getfield 60	com/tencent/mm/plugin/u/h:ldr	Z
    //   198: ifeq +131 -> 329
    //   201: ldc 86
    //   203: ldc_w 462
    //   206: iconst_2
    //   207: anewarray 4	java/lang/Object
    //   210: dup
    //   211: iconst_0
    //   212: aload_0
    //   213: invokevirtual 92	com/tencent/mm/plugin/u/h:avA	()Ljava/lang/String;
    //   216: aastore
    //   217: dup
    //   218: iconst_1
    //   219: aload 10
    //   221: invokevirtual 317	java/lang/Exception:toString	()Ljava/lang/String;
    //   224: aastore
    //   225: invokestatic 323	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   228: aload_0
    //   229: getfield 68	com/tencent/mm/plugin/u/h:state	I
    //   232: invokestatic 308	com/tencent/mm/plugin/u/d:sB	(I)Z
    //   235: ifne +7 -> 242
    //   238: aload_0
    //   239: invokevirtual 330	com/tencent/mm/plugin/u/h:bdx	()V
    //   242: aload_0
    //   243: getfield 64	com/tencent/mm/plugin/u/h:ldg	Lcom/tencent/mm/plugin/u/g;
    //   246: astore 10
    //   248: aload_0
    //   249: invokevirtual 176	com/tencent/mm/plugin/u/h:type	()Ljava/lang/String;
    //   252: astore 11
    //   254: aload 10
    //   256: getfield 465	com/tencent/mm/plugin/u/g:ldf	Z
    //   259: ifne -186 -> 73
    //   262: aload 10
    //   264: getfield 468	com/tencent/mm/plugin/u/g:lda	Z
    //   267: ifeq -194 -> 73
    //   270: getstatic 474	com/tencent/mm/plugin/report/service/h:mEJ	Lcom/tencent/mm/plugin/report/service/h;
    //   273: ldc2_w 475
    //   276: ldc2_w 477
    //   279: lconst_1
    //   280: iconst_0
    //   281: invokevirtual 481	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   284: getstatic 474	com/tencent/mm/plugin/report/service/h:mEJ	Lcom/tencent/mm/plugin/report/service/h;
    //   287: sipush 13836
    //   290: iconst_3
    //   291: anewarray 4	java/lang/Object
    //   294: dup
    //   295: iconst_0
    //   296: sipush 506
    //   299: invokestatic 103	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   302: aastore
    //   303: dup
    //   304: iconst_1
    //   305: invokestatic 484	com/tencent/mm/sdk/platformtools/bi:VE	()J
    //   308: invokestatic 98	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   311: aastore
    //   312: dup
    //   313: iconst_2
    //   314: aload 11
    //   316: aastore
    //   317: invokevirtual 488	com/tencent/mm/plugin/report/service/h:h	(I[Ljava/lang/Object;)V
    //   320: aload 10
    //   322: iconst_1
    //   323: putfield 465	com/tencent/mm/plugin/u/g:ldf	Z
    //   326: goto -253 -> 73
    //   329: aload_0
    //   330: iconst_1
    //   331: putfield 60	com/tencent/mm/plugin/u/h:ldr	Z
    //   334: ldc 86
    //   336: aload 10
    //   338: ldc_w 490
    //   341: iconst_1
    //   342: anewarray 4	java/lang/Object
    //   345: dup
    //   346: iconst_0
    //   347: aload_0
    //   348: invokevirtual 92	com/tencent/mm/plugin/u/h:avA	()Ljava/lang/String;
    //   351: aastore
    //   352: invokestatic 237	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   355: goto -127 -> 228
    //   358: aload_0
    //   359: getfield 70	com/tencent/mm/plugin/u/h:apQ	I
    //   362: ifge +181 -> 543
    //   365: aload_0
    //   366: aload_0
    //   367: getfield 110	com/tencent/mm/plugin/u/h:ldq	Landroid/media/MediaCodec;
    //   370: lconst_0
    //   371: invokevirtual 494	android/media/MediaCodec:dequeueInputBuffer	(J)I
    //   374: putfield 70	com/tencent/mm/plugin/u/h:apQ	I
    //   377: aload_0
    //   378: getfield 70	com/tencent/mm/plugin/u/h:apQ	I
    //   381: ifge +162 -> 543
    //   384: ldc 86
    //   386: ldc_w 496
    //   389: iconst_1
    //   390: anewarray 4	java/lang/Object
    //   393: dup
    //   394: iconst_0
    //   395: aload_0
    //   396: invokevirtual 92	com/tencent/mm/plugin/u/h:avA	()Ljava/lang/String;
    //   399: aastore
    //   400: invokestatic 108	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   403: goto -245 -> 158
    //   406: astore 10
    //   408: aload_0
    //   409: getfield 62	com/tencent/mm/plugin/u/h:lds	Z
    //   412: ifeq +965 -> 1377
    //   415: ldc 86
    //   417: ldc_w 498
    //   420: iconst_2
    //   421: anewarray 4	java/lang/Object
    //   424: dup
    //   425: iconst_0
    //   426: aload_0
    //   427: invokevirtual 92	com/tencent/mm/plugin/u/h:avA	()Ljava/lang/String;
    //   430: aastore
    //   431: dup
    //   432: iconst_1
    //   433: aload 10
    //   435: invokevirtual 317	java/lang/Exception:toString	()Ljava/lang/String;
    //   438: aastore
    //   439: invokestatic 323	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   442: aload_0
    //   443: getfield 68	com/tencent/mm/plugin/u/h:state	I
    //   446: invokestatic 308	com/tencent/mm/plugin/u/d:sB	(I)Z
    //   449: ifne +7 -> 456
    //   452: aload_0
    //   453: invokevirtual 330	com/tencent/mm/plugin/u/h:bdx	()V
    //   456: aload_0
    //   457: getfield 64	com/tencent/mm/plugin/u/h:ldg	Lcom/tencent/mm/plugin/u/g;
    //   460: astore 10
    //   462: aload_0
    //   463: invokevirtual 176	com/tencent/mm/plugin/u/h:type	()Ljava/lang/String;
    //   466: astore 11
    //   468: aload 10
    //   470: getfield 501	com/tencent/mm/plugin/u/g:lde	Z
    //   473: ifne -315 -> 158
    //   476: aload 10
    //   478: getfield 468	com/tencent/mm/plugin/u/g:lda	Z
    //   481: ifeq -323 -> 158
    //   484: getstatic 474	com/tencent/mm/plugin/report/service/h:mEJ	Lcom/tencent/mm/plugin/report/service/h;
    //   487: ldc2_w 475
    //   490: ldc2_w 502
    //   493: lconst_1
    //   494: iconst_0
    //   495: invokevirtual 481	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   498: getstatic 474	com/tencent/mm/plugin/report/service/h:mEJ	Lcom/tencent/mm/plugin/report/service/h;
    //   501: sipush 13836
    //   504: iconst_3
    //   505: anewarray 4	java/lang/Object
    //   508: dup
    //   509: iconst_0
    //   510: sipush 505
    //   513: invokestatic 103	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   516: aastore
    //   517: dup
    //   518: iconst_1
    //   519: invokestatic 484	com/tencent/mm/sdk/platformtools/bi:VE	()J
    //   522: invokestatic 98	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   525: aastore
    //   526: dup
    //   527: iconst_2
    //   528: aload 11
    //   530: aastore
    //   531: invokevirtual 488	com/tencent/mm/plugin/report/service/h:h	(I[Ljava/lang/Object;)V
    //   534: aload 10
    //   536: iconst_1
    //   537: putfield 501	com/tencent/mm/plugin/u/g:lde	Z
    //   540: goto -382 -> 158
    //   543: aload_0
    //   544: getfield 231	com/tencent/mm/plugin/u/h:apO	[Ljava/nio/ByteBuffer;
    //   547: aload_0
    //   548: getfield 70	com/tencent/mm/plugin/u/h:apQ	I
    //   551: aaload
    //   552: astore 10
    //   554: aload_0
    //   555: getfield 300	com/tencent/mm/plugin/u/h:ldp	Lcom/tencent/mm/plugin/u/f;
    //   558: ifnull +216 -> 774
    //   561: aload_0
    //   562: getfield 300	com/tencent/mm/plugin/u/h:ldp	Lcom/tencent/mm/plugin/u/f;
    //   565: aload 10
    //   567: invokevirtual 507	com/tencent/mm/plugin/u/f:x	(Ljava/nio/ByteBuffer;)I
    //   570: istore 5
    //   572: aload_0
    //   573: getfield 300	com/tencent/mm/plugin/u/h:ldp	Lcom/tencent/mm/plugin/u/f;
    //   576: getfield 379	com/tencent/mm/plugin/u/f:lcQ	Lcom/tencent/mm/plugin/a/g;
    //   579: getfield 418	com/tencent/mm/plugin/a/g:eyZ	J
    //   582: lstore_1
    //   583: aload_0
    //   584: getfield 300	com/tencent/mm/plugin/u/h:ldp	Lcom/tencent/mm/plugin/u/f;
    //   587: getfield 379	com/tencent/mm/plugin/u/f:lcQ	Lcom/tencent/mm/plugin/a/g;
    //   590: getfield 510	com/tencent/mm/plugin/a/g:eza	I
    //   593: istore 6
    //   595: ldc 86
    //   597: ldc_w 512
    //   600: iconst_5
    //   601: anewarray 4	java/lang/Object
    //   604: dup
    //   605: iconst_0
    //   606: aload_0
    //   607: invokevirtual 92	com/tencent/mm/plugin/u/h:avA	()Ljava/lang/String;
    //   610: aastore
    //   611: dup
    //   612: iconst_1
    //   613: aload_0
    //   614: getfield 70	com/tencent/mm/plugin/u/h:apQ	I
    //   617: invokestatic 103	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   620: aastore
    //   621: dup
    //   622: iconst_2
    //   623: iload 5
    //   625: invokestatic 103	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   628: aastore
    //   629: dup
    //   630: iconst_3
    //   631: lload_1
    //   632: invokestatic 98	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   635: aastore
    //   636: dup
    //   637: iconst_4
    //   638: iload 6
    //   640: invokestatic 103	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   643: aastore
    //   644: invokestatic 108	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   647: iload 5
    //   649: ifgt +26 -> 675
    //   652: aload_0
    //   653: getfield 110	com/tencent/mm/plugin/u/h:ldq	Landroid/media/MediaCodec;
    //   656: aload_0
    //   657: getfield 70	com/tencent/mm/plugin/u/h:apQ	I
    //   660: iconst_0
    //   661: iconst_0
    //   662: lconst_0
    //   663: iconst_4
    //   664: invokevirtual 516	android/media/MediaCodec:queueInputBuffer	(IIIJI)V
    //   667: aload_0
    //   668: iconst_1
    //   669: putfield 47	com/tencent/mm/plugin/u/h:ldi	Z
    //   672: goto -514 -> 158
    //   675: aload_0
    //   676: getfield 110	com/tencent/mm/plugin/u/h:ldq	Landroid/media/MediaCodec;
    //   679: aload_0
    //   680: getfield 70	com/tencent/mm/plugin/u/h:apQ	I
    //   683: iconst_0
    //   684: iload 5
    //   686: lload_1
    //   687: iconst_0
    //   688: invokevirtual 516	android/media/MediaCodec:queueInputBuffer	(IIIJI)V
    //   691: aload_0
    //   692: iconst_m1
    //   693: putfield 70	com/tencent/mm/plugin/u/h:apQ	I
    //   696: aload_0
    //   697: getfield 300	com/tencent/mm/plugin/u/h:ldp	Lcom/tencent/mm/plugin/u/f;
    //   700: astore 10
    //   702: aload 10
    //   704: aload 10
    //   706: getfield 413	com/tencent/mm/plugin/u/f:lcR	I
    //   709: iconst_1
    //   710: iadd
    //   711: putfield 413	com/tencent/mm/plugin/u/f:lcR	I
    //   714: aload 10
    //   716: getfield 413	com/tencent/mm/plugin/u/f:lcR	I
    //   719: aload 10
    //   721: getfield 519	com/tencent/mm/plugin/u/f:lcS	I
    //   724: if_icmpge -566 -> 158
    //   727: aload 10
    //   729: aload 10
    //   731: getfield 367	com/tencent/mm/plugin/u/f:eyW	Ljava/util/List;
    //   734: aload 10
    //   736: getfield 413	com/tencent/mm/plugin/u/f:lcR	I
    //   739: invokeinterface 396 2 0
    //   744: checkcast 415	com/tencent/mm/plugin/a/g
    //   747: putfield 379	com/tencent/mm/plugin/u/f:lcQ	Lcom/tencent/mm/plugin/a/g;
    //   750: ldc_w 521
    //   753: ldc_w 523
    //   756: iconst_1
    //   757: anewarray 4	java/lang/Object
    //   760: dup
    //   761: iconst_0
    //   762: aload 10
    //   764: getfield 379	com/tencent/mm/plugin/u/f:lcQ	Lcom/tencent/mm/plugin/a/g;
    //   767: aastore
    //   768: invokestatic 108	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   771: goto -613 -> 158
    //   774: aload_0
    //   775: getfield 64	com/tencent/mm/plugin/u/h:ldg	Lcom/tencent/mm/plugin/u/g;
    //   778: getfield 526	com/tencent/mm/plugin/u/g:ldd	Z
    //   781: ifeq +41 -> 822
    //   784: aload_0
    //   785: getfield 110	com/tencent/mm/plugin/u/h:ldq	Landroid/media/MediaCodec;
    //   788: aload_0
    //   789: getfield 70	com/tencent/mm/plugin/u/h:apQ	I
    //   792: iconst_0
    //   793: iconst_0
    //   794: aload_0
    //   795: getfield 205	com/tencent/mm/plugin/u/h:aqC	J
    //   798: ldc2_w 81
    //   801: lmul
    //   802: iconst_4
    //   803: invokevirtual 516	android/media/MediaCodec:queueInputBuffer	(IIIJI)V
    //   806: aload_0
    //   807: iconst_1
    //   808: putfield 47	com/tencent/mm/plugin/u/h:ldi	Z
    //   811: aload_0
    //   812: getfield 64	com/tencent/mm/plugin/u/h:ldg	Lcom/tencent/mm/plugin/u/g;
    //   815: iconst_0
    //   816: putfield 526	com/tencent/mm/plugin/u/g:ldd	Z
    //   819: goto -661 -> 158
    //   822: aload_0
    //   823: getfield 260	com/tencent/mm/plugin/u/h:ldo	Landroid/media/MediaExtractor;
    //   826: aload 10
    //   828: iconst_0
    //   829: invokevirtual 530	android/media/MediaExtractor:readSampleData	(Ljava/nio/ByteBuffer;I)I
    //   832: istore 5
    //   834: aload_0
    //   835: getfield 260	com/tencent/mm/plugin/u/h:ldo	Landroid/media/MediaExtractor;
    //   838: invokevirtual 436	android/media/MediaExtractor:getSampleTime	()J
    //   841: lstore_1
    //   842: aload_0
    //   843: getfield 260	com/tencent/mm/plugin/u/h:ldo	Landroid/media/MediaExtractor;
    //   846: invokevirtual 533	android/media/MediaExtractor:getSampleFlags	()I
    //   849: istore 6
    //   851: ldc 86
    //   853: ldc_w 512
    //   856: iconst_5
    //   857: anewarray 4	java/lang/Object
    //   860: dup
    //   861: iconst_0
    //   862: aload_0
    //   863: invokevirtual 92	com/tencent/mm/plugin/u/h:avA	()Ljava/lang/String;
    //   866: aastore
    //   867: dup
    //   868: iconst_1
    //   869: aload_0
    //   870: getfield 70	com/tencent/mm/plugin/u/h:apQ	I
    //   873: invokestatic 103	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   876: aastore
    //   877: dup
    //   878: iconst_2
    //   879: iload 5
    //   881: invokestatic 103	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   884: aastore
    //   885: dup
    //   886: iconst_3
    //   887: lload_1
    //   888: invokestatic 98	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   891: aastore
    //   892: dup
    //   893: iconst_4
    //   894: iload 6
    //   896: invokestatic 103	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   899: aastore
    //   900: invokestatic 108	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   903: aload_0
    //   904: iload 6
    //   906: lload_1
    //   907: invokevirtual 535	com/tencent/mm/plugin/u/h:B	(IJ)Z
    //   910: pop
    //   911: iload 5
    //   913: ifgt +33 -> 946
    //   916: aload_0
    //   917: getfield 110	com/tencent/mm/plugin/u/h:ldq	Landroid/media/MediaCodec;
    //   920: aload_0
    //   921: getfield 70	com/tencent/mm/plugin/u/h:apQ	I
    //   924: iconst_0
    //   925: iconst_0
    //   926: aload_0
    //   927: getfield 205	com/tencent/mm/plugin/u/h:aqC	J
    //   930: ldc2_w 81
    //   933: lmul
    //   934: iconst_4
    //   935: invokevirtual 516	android/media/MediaCodec:queueInputBuffer	(IIIJI)V
    //   938: aload_0
    //   939: iconst_1
    //   940: putfield 47	com/tencent/mm/plugin/u/h:ldi	Z
    //   943: goto -785 -> 158
    //   946: aload_0
    //   947: getfield 110	com/tencent/mm/plugin/u/h:ldq	Landroid/media/MediaCodec;
    //   950: aload_0
    //   951: getfield 70	com/tencent/mm/plugin/u/h:apQ	I
    //   954: iconst_0
    //   955: iload 5
    //   957: lload_1
    //   958: iconst_0
    //   959: invokevirtual 516	android/media/MediaCodec:queueInputBuffer	(IIIJI)V
    //   962: aload_0
    //   963: iconst_m1
    //   964: putfield 70	com/tencent/mm/plugin/u/h:apQ	I
    //   967: aload_0
    //   968: getfield 260	com/tencent/mm/plugin/u/h:ldo	Landroid/media/MediaExtractor;
    //   971: invokevirtual 538	android/media/MediaExtractor:advance	()Z
    //   974: pop
    //   975: aload_0
    //   976: getfield 260	com/tencent/mm/plugin/u/h:ldo	Landroid/media/MediaExtractor;
    //   979: invokevirtual 436	android/media/MediaExtractor:getSampleTime	()J
    //   982: lstore_3
    //   983: aload_0
    //   984: getfield 64	com/tencent/mm/plugin/u/h:ldg	Lcom/tencent/mm/plugin/u/g;
    //   987: getfield 541	com/tencent/mm/plugin/u/g:ldc	Z
    //   990: ifne +162 -> 1152
    //   993: aload_0
    //   994: lload_1
    //   995: lload_3
    //   996: invokevirtual 422	com/tencent/mm/plugin/u/h:w	(JJ)Z
    //   999: ifeq +117 -> 1116
    //   1002: ldc 86
    //   1004: ldc_w 543
    //   1007: iconst_4
    //   1008: anewarray 4	java/lang/Object
    //   1011: dup
    //   1012: iconst_0
    //   1013: aload_0
    //   1014: invokevirtual 92	com/tencent/mm/plugin/u/h:avA	()Ljava/lang/String;
    //   1017: aastore
    //   1018: dup
    //   1019: iconst_1
    //   1020: aload_0
    //   1021: getfield 64	com/tencent/mm/plugin/u/h:ldg	Lcom/tencent/mm/plugin/u/g;
    //   1024: getfield 541	com/tencent/mm/plugin/u/g:ldc	Z
    //   1027: invokestatic 390	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1030: aastore
    //   1031: dup
    //   1032: iconst_2
    //   1033: lload_3
    //   1034: invokestatic 98	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1037: aastore
    //   1038: dup
    //   1039: iconst_3
    //   1040: aload_0
    //   1041: getfield 51	com/tencent/mm/plugin/u/h:ldk	J
    //   1044: invokestatic 98	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1047: aastore
    //   1048: invokestatic 290	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1051: aload_0
    //   1052: getfield 260	com/tencent/mm/plugin/u/h:ldo	Landroid/media/MediaExtractor;
    //   1055: invokevirtual 436	android/media/MediaExtractor:getSampleTime	()J
    //   1058: lstore 7
    //   1060: lload 7
    //   1062: lload_1
    //   1063: lsub
    //   1064: invokestatic 548	java/lang/Math:abs	(J)J
    //   1067: ldc2_w 549
    //   1070: lcmp
    //   1071: iflt +45 -> 1116
    //   1074: ldc 86
    //   1076: ldc_w 552
    //   1079: iconst_3
    //   1080: anewarray 4	java/lang/Object
    //   1083: dup
    //   1084: iconst_0
    //   1085: aload_0
    //   1086: invokevirtual 92	com/tencent/mm/plugin/u/h:avA	()Ljava/lang/String;
    //   1089: aastore
    //   1090: dup
    //   1091: iconst_1
    //   1092: lload 7
    //   1094: invokestatic 98	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1097: aastore
    //   1098: dup
    //   1099: iconst_2
    //   1100: lload_1
    //   1101: invokestatic 98	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1104: aastore
    //   1105: invokestatic 290	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1108: aload_0
    //   1109: getfield 64	com/tencent/mm/plugin/u/h:ldg	Lcom/tencent/mm/plugin/u/g;
    //   1112: iconst_1
    //   1113: putfield 526	com/tencent/mm/plugin/u/g:ldd	Z
    //   1116: ldc 86
    //   1118: ldc_w 554
    //   1121: iconst_3
    //   1122: anewarray 4	java/lang/Object
    //   1125: dup
    //   1126: iconst_0
    //   1127: aload_0
    //   1128: invokevirtual 92	com/tencent/mm/plugin/u/h:avA	()Ljava/lang/String;
    //   1131: aastore
    //   1132: dup
    //   1133: iconst_1
    //   1134: lload_1
    //   1135: invokestatic 98	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1138: aastore
    //   1139: dup
    //   1140: iconst_2
    //   1141: lload_3
    //   1142: invokestatic 98	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1145: aastore
    //   1146: invokestatic 108	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1149: goto -991 -> 158
    //   1152: aload_0
    //   1153: getfield 51	com/tencent/mm/plugin/u/h:ldk	J
    //   1156: lconst_0
    //   1157: lcmp
    //   1158: ifne +127 -> 1285
    //   1161: aload_0
    //   1162: lload_1
    //   1163: lload_3
    //   1164: invokevirtual 422	com/tencent/mm/plugin/u/h:w	(JJ)Z
    //   1167: ifeq -51 -> 1116
    //   1170: ldc 86
    //   1172: ldc_w 556
    //   1175: iconst_3
    //   1176: anewarray 4	java/lang/Object
    //   1179: dup
    //   1180: iconst_0
    //   1181: aload_0
    //   1182: invokevirtual 92	com/tencent/mm/plugin/u/h:avA	()Ljava/lang/String;
    //   1185: aastore
    //   1186: dup
    //   1187: iconst_1
    //   1188: lload_3
    //   1189: invokestatic 98	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1192: aastore
    //   1193: dup
    //   1194: iconst_2
    //   1195: aload_0
    //   1196: getfield 51	com/tencent/mm/plugin/u/h:ldk	J
    //   1199: invokestatic 98	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1202: aastore
    //   1203: invokestatic 290	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1206: aload_0
    //   1207: getfield 260	com/tencent/mm/plugin/u/h:ldo	Landroid/media/MediaExtractor;
    //   1210: invokevirtual 436	android/media/MediaExtractor:getSampleTime	()J
    //   1213: lstore 7
    //   1215: lload 7
    //   1217: lload_1
    //   1218: lsub
    //   1219: invokestatic 548	java/lang/Math:abs	(J)J
    //   1222: ldc2_w 557
    //   1225: lcmp
    //   1226: iflt +52 -> 1278
    //   1229: ldc 86
    //   1231: ldc_w 552
    //   1234: iconst_3
    //   1235: anewarray 4	java/lang/Object
    //   1238: dup
    //   1239: iconst_0
    //   1240: aload_0
    //   1241: invokevirtual 92	com/tencent/mm/plugin/u/h:avA	()Ljava/lang/String;
    //   1244: aastore
    //   1245: dup
    //   1246: iconst_1
    //   1247: lload 7
    //   1249: invokestatic 98	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1252: aastore
    //   1253: dup
    //   1254: iconst_2
    //   1255: lload_1
    //   1256: invokestatic 98	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1259: aastore
    //   1260: invokestatic 290	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1263: aload_0
    //   1264: getfield 66	com/tencent/mm/plugin/u/h:ldh	Lcom/tencent/mm/sdk/platformtools/ag;
    //   1267: iconst_5
    //   1268: bipush -2
    //   1270: bipush -2
    //   1272: invokevirtual 564	com/tencent/mm/sdk/platformtools/ag:obtainMessage	(III)Landroid/os/Message;
    //   1275: invokevirtual 569	android/os/Message:sendToTarget	()V
    //   1278: aload_0
    //   1279: invokespecial 571	com/tencent/mm/plugin/u/h:bdw	()V
    //   1282: goto -166 -> 1116
    //   1285: lload_3
    //   1286: lconst_0
    //   1287: lcmp
    //   1288: iflt +20 -> 1308
    //   1291: lload_3
    //   1292: ldc2_w 81
    //   1295: ldiv
    //   1296: ldc2_w 572
    //   1299: ladd
    //   1300: aload_0
    //   1301: getfield 51	com/tencent/mm/plugin/u/h:ldk	J
    //   1304: lcmp
    //   1305: ifle -189 -> 1116
    //   1308: ldc 86
    //   1310: ldc_w 556
    //   1313: iconst_3
    //   1314: anewarray 4	java/lang/Object
    //   1317: dup
    //   1318: iconst_0
    //   1319: aload_0
    //   1320: invokevirtual 92	com/tencent/mm/plugin/u/h:avA	()Ljava/lang/String;
    //   1323: aastore
    //   1324: dup
    //   1325: iconst_1
    //   1326: lload_3
    //   1327: invokestatic 98	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1330: aastore
    //   1331: dup
    //   1332: iconst_2
    //   1333: aload_0
    //   1334: getfield 51	com/tencent/mm/plugin/u/h:ldk	J
    //   1337: invokestatic 98	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1340: aastore
    //   1341: invokestatic 290	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1344: aload_0
    //   1345: lload_1
    //   1346: ldc2_w 419
    //   1349: invokevirtual 422	com/tencent/mm/plugin/u/h:w	(JJ)Z
    //   1352: ifeq +18 -> 1370
    //   1355: aload_0
    //   1356: getfield 66	com/tencent/mm/plugin/u/h:ldh	Lcom/tencent/mm/sdk/platformtools/ag;
    //   1359: iconst_5
    //   1360: bipush -3
    //   1362: bipush -3
    //   1364: invokevirtual 564	com/tencent/mm/sdk/platformtools/ag:obtainMessage	(III)Landroid/os/Message;
    //   1367: invokevirtual 569	android/os/Message:sendToTarget	()V
    //   1370: aload_0
    //   1371: invokespecial 571	com/tencent/mm/plugin/u/h:bdw	()V
    //   1374: goto -258 -> 1116
    //   1377: aload_0
    //   1378: iconst_1
    //   1379: putfield 62	com/tencent/mm/plugin/u/h:lds	Z
    //   1382: ldc 86
    //   1384: aload 10
    //   1386: ldc_w 575
    //   1389: iconst_1
    //   1390: anewarray 4	java/lang/Object
    //   1393: dup
    //   1394: iconst_0
    //   1395: aload_0
    //   1396: invokevirtual 92	com/tencent/mm/plugin/u/h:avA	()Ljava/lang/String;
    //   1399: aastore
    //   1400: invokestatic 237	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1403: goto -961 -> 442
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1406	0	this	h
    //   0	1406	1	paramLong1	long
    //   0	1406	3	paramLong2	long
    //   570	386	5	i	int
    //   593	312	6	j	int
    //   1058	190	7	l	long
    //   66	3	9	bool	boolean
    //   192	28	10	localException1	Exception
    //   246	91	10	localg	g
    //   406	28	10	localException2	Exception
    //   460	925	10	localObject	Object
    //   252	277	11	str	String
    // Exception table:
    //   from	to	target	type
    //   50	68	192	java/lang/Exception
    //   73	139	406	java/lang/Exception
    //   139	158	406	java/lang/Exception
    //   358	403	406	java/lang/Exception
    //   543	647	406	java/lang/Exception
    //   652	672	406	java/lang/Exception
    //   675	771	406	java/lang/Exception
    //   774	819	406	java/lang/Exception
    //   822	911	406	java/lang/Exception
    //   916	943	406	java/lang/Exception
    //   946	1116	406	java/lang/Exception
    //   1116	1149	406	java/lang/Exception
    //   1152	1278	406	java/lang/Exception
    //   1278	1282	406	java/lang/Exception
    //   1291	1308	406	java/lang/Exception
    //   1308	1370	406	java/lang/Exception
    //   1370	1374	406	java/lang/Exception
  }
  
  protected final boolean w(long paramLong1, long paramLong2)
  {
    long l1 = bi.VG();
    try
    {
      if ((paramLong1 / 1000L + 1000L < this.aqC) && (paramLong2 == -1L))
      {
        this.ldg.ldb = true;
        this.ldi = false;
        this.ldo.release();
        this.ldo = new MediaExtractor();
        this.ldo.setDataSource(this.path);
        this.ldo.selectTrack(this.ldn);
        this.ldo.seekTo(paramLong1, 2);
        long l2 = this.ldo.getSampleTime();
        x.w("MicroMsg.TrackDataSource", "%s it don't play end. currTime[%d] afterSeek[%d] nextSampleTime[%d] onlineCacheMs[%d] cost[%d]", new Object[] { avA(), Long.valueOf(paramLong1), Long.valueOf(l2), Long.valueOf(paramLong2), Long.valueOf(this.ldk), Long.valueOf(bi.bI(l1)) });
        return true;
      }
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.TrackDataSource", "%s reset extractor error %s", new Object[] { avA(), localException.toString() });
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/u/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */