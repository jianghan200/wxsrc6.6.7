package com.tencent.mm.modelvoice;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.util.b.a;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.qqpinyin.voicerecoapi.TRSpeexNative;
import com.tencent.qqpinyin.voicerecoapi.a;
import java.io.InputStream;

public final class j
  implements d
{
  AudioTrack aga;
  com.tencent.mm.compatible.util.b bFu;
  private int bVU = 1;
  String eoW = "";
  String eoX = "";
  MediaPlayer.OnCompletionListener epg = new j.1(this);
  MediaPlayer.OnErrorListener eph = new j.2(this);
  d.a epk = null;
  d.b epl = null;
  private int epm = 2;
  private int epn = 16000;
  private int epo = 20;
  private Runnable epp;
  a epq = null;
  private int epr;
  int eps = 0;
  boolean ept = false;
  byte[] epu = new byte[a.MAX_FRAME_SIZE];
  int epv = 0;
  InputStream epw = null;
  int epx = 314;
  String fileName = "";
  int status = 0;
  
  public j()
  {
    a locala = this.epq;
    if (locala.vgK != 0) {
      i = -103;
    }
    for (;;)
    {
      if (i != 0) {
        x.e("speex", "res: " + i);
      }
      return;
      int j = locala.vgL.nativeTRSpeexDecodeInit();
      if ((j == -1) || (j == -100) || (j == -101) || (j == -102))
      {
        i = j;
      }
      else
      {
        locala.vgK = j;
        locala.vgI = new byte[a.MAX_FRAME_SIZE * 15];
      }
    }
  }
  
  public j(Context paramContext)
  {
    this();
    this.bFu = new com.tencent.mm.compatible.util.b(paramContext);
  }
  
  private boolean N(String paramString, boolean paramBoolean)
  {
    if (this.status != 0)
    {
      x.e("MicroMsg.SpeexPlayer", "startPlay error status:" + this.status);
      return false;
    }
    x.i("MicroMsg.SpeexPlayer", "startPlay");
    this.status = 1;
    this.fileName = paramString;
    try
    {
      bX(paramBoolean);
      return true;
    }
    catch (Exception paramString)
    {
      try
      {
        bX(true);
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.SpeexPlayer", "startPlay File[" + this.fileName + "] failed");
        x.e("MicroMsg.SpeexPlayer", "exception:%s", new Object[] { bi.i(paramString) });
        this.status = -1;
      }
    }
    return false;
  }
  
  private void bX(boolean paramBoolean)
  {
    int j = 3;
    if (!com.tencent.mm.vfs.d.cn(this.fileName)) {
      return;
    }
    int i;
    if (paramBoolean) {
      i = 3;
    }
    label266:
    for (;;)
    {
      try
      {
        if (!q.deN.dby) {
          break label266;
        }
        q.deN.dump();
        if (q.deN.dbF != 1) {
          break label266;
        }
        i = j;
        this.epr = AudioTrack.getMinBufferSize(this.epn, this.epm, 2);
        TG();
        this.aga = new com.tencent.mm.compatible.b.d(i, this.epn, this.epm, this.epr * 8);
        this.epx = (this.epn / 1000 * this.bVU * this.epo * 2);
        if (this.bFu != null) {
          this.bFu.requestFocus();
        }
        AudioTrack localAudioTrack = this.aga;
        if (localAudioTrack == null) {
          break;
        }
        i = 0;
      }
      catch (Exception localException1)
      {
        try
        {
          this.aga.play();
          this.epp = new j.3(this);
          e.post(this.epp, "SpeexPlayer_play");
          return;
        }
        catch (Exception localException2)
        {
          x.e("MicroMsg.SpeexPlayer", "audioTrack error:%s", new Object[] { localException2.getMessage() });
          return;
        }
        localException1 = localException1;
        if (this.bFu != null) {
          this.bFu.zY();
        }
        TG();
        x.e("MicroMsg.SpeexPlayer", "playImp : fail, exception = " + localException1.getMessage());
        x.e("MicroMsg.SpeexPlayer", "exception:%s", new Object[] { bi.i(localException1) });
        return;
      }
    }
  }
  
  public final boolean M(String paramString, boolean paramBoolean)
  {
    return N(paramString, paramBoolean);
  }
  
  final void TG()
  {
    if (this.aga != null)
    {
      this.aga.stop();
      this.aga.release();
      this.aga = null;
    }
  }
  
  public final void a(d.a parama)
  {
    this.epk = parama;
  }
  
  public final void a(d.b paramb)
  {
    this.epl = paramb;
  }
  
  /* Error */
  public final boolean aI(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 56	com/tencent/mm/modelvoice/j:status	I
    //   4: iconst_1
    //   5: if_icmpeq +5 -> 10
    //   8: iconst_0
    //   9: ireturn
    //   10: aload_0
    //   11: iconst_2
    //   12: putfield 56	com/tencent/mm/modelvoice/j:status	I
    //   15: aload_0
    //   16: getfield 74	com/tencent/mm/modelvoice/j:eoX	Ljava/lang/String;
    //   19: astore 4
    //   21: aload 4
    //   23: monitorenter
    //   24: ldc -102
    //   26: ldc_w 273
    //   29: invokestatic 276	com/tencent/mm/sdk/platformtools/x:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   32: invokestatic 282	java/lang/System:currentTimeMillis	()J
    //   35: lstore_2
    //   36: aload_0
    //   37: getfield 74	com/tencent/mm/modelvoice/j:eoX	Ljava/lang/String;
    //   40: invokevirtual 285	java/lang/Object:wait	()V
    //   43: ldc -102
    //   45: new 107	java/lang/StringBuilder
    //   48: dup
    //   49: ldc_w 287
    //   52: invokespecial 112	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   55: invokestatic 282	java/lang/System:currentTimeMillis	()J
    //   58: lload_2
    //   59: lsub
    //   60: invokevirtual 290	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   63: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   66: invokestatic 276	com/tencent/mm/sdk/platformtools/x:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   69: aload_0
    //   70: getfield 148	com/tencent/mm/modelvoice/j:bFu	Lcom/tencent/mm/compatible/util/b;
    //   73: ifnull +15 -> 88
    //   76: iload_1
    //   77: ifeq +11 -> 88
    //   80: aload_0
    //   81: getfield 148	com/tencent/mm/modelvoice/j:bFu	Lcom/tencent/mm/compatible/util/b;
    //   84: invokevirtual 251	com/tencent/mm/compatible/util/b:zY	()Z
    //   87: pop
    //   88: aload 4
    //   90: monitorexit
    //   91: iconst_1
    //   92: ireturn
    //   93: astore 5
    //   95: ldc -102
    //   97: ldc -82
    //   99: iconst_1
    //   100: anewarray 4	java/lang/Object
    //   103: dup
    //   104: iconst_0
    //   105: aload 5
    //   107: invokestatic 179	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   110: aastore
    //   111: invokestatic 182	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   114: aload_0
    //   115: getfield 148	com/tencent/mm/modelvoice/j:bFu	Lcom/tencent/mm/compatible/util/b;
    //   118: ifnull +15 -> 133
    //   121: iload_1
    //   122: ifeq +11 -> 133
    //   125: aload_0
    //   126: getfield 148	com/tencent/mm/modelvoice/j:bFu	Lcom/tencent/mm/compatible/util/b;
    //   129: invokevirtual 251	com/tencent/mm/compatible/util/b:zY	()Z
    //   132: pop
    //   133: aload 4
    //   135: monitorexit
    //   136: iconst_0
    //   137: ireturn
    //   138: astore 5
    //   140: aload 4
    //   142: monitorexit
    //   143: aload 5
    //   145: athrow
    //   146: astore 5
    //   148: aload_0
    //   149: getfield 148	com/tencent/mm/modelvoice/j:bFu	Lcom/tencent/mm/compatible/util/b;
    //   152: ifnull +15 -> 167
    //   155: iload_1
    //   156: ifeq +11 -> 167
    //   159: aload_0
    //   160: getfield 148	com/tencent/mm/modelvoice/j:bFu	Lcom/tencent/mm/compatible/util/b;
    //   163: invokevirtual 251	com/tencent/mm/compatible/util/b:zY	()Z
    //   166: pop
    //   167: aload 5
    //   169: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	170	0	this	j
    //   0	170	1	paramBoolean	boolean
    //   35	24	2	l	long
    //   19	122	4	str	String
    //   93	13	5	localException	Exception
    //   138	6	5	localObject1	Object
    //   146	22	5	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   24	69	93	java/lang/Exception
    //   69	76	138	finally
    //   80	88	138	finally
    //   88	91	138	finally
    //   114	121	138	finally
    //   125	133	138	finally
    //   133	136	138	finally
    //   140	143	138	finally
    //   148	155	138	finally
    //   159	167	138	finally
    //   167	170	138	finally
    //   24	69	146	finally
    //   95	114	146	finally
  }
  
  /* Error */
  public final void aK(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: putfield 70	com/tencent/mm/modelvoice/j:ept	Z
    //   5: aload_0
    //   6: getfield 62	com/tencent/mm/modelvoice/j:bVU	I
    //   9: iconst_2
    //   10: if_icmpne +127 -> 137
    //   13: aload_0
    //   14: iconst_3
    //   15: putfield 58	com/tencent/mm/modelvoice/j:epm	I
    //   18: aload_0
    //   19: aload_0
    //   20: getfield 60	com/tencent/mm/modelvoice/j:epn	I
    //   23: aload_0
    //   24: getfield 58	com/tencent/mm/modelvoice/j:epm	I
    //   27: iconst_2
    //   28: invokestatic 220	android/media/AudioTrack:getMinBufferSize	(III)I
    //   31: putfield 222	com/tencent/mm/modelvoice/j:epr	I
    //   34: aload_0
    //   35: getfield 232	com/tencent/mm/modelvoice/j:aga	Landroid/media/AudioTrack;
    //   38: ifnull +22 -> 60
    //   41: aload_0
    //   42: getfield 232	com/tencent/mm/modelvoice/j:aga	Landroid/media/AudioTrack;
    //   45: invokevirtual 264	android/media/AudioTrack:stop	()V
    //   48: aload_0
    //   49: getfield 232	com/tencent/mm/modelvoice/j:aga	Landroid/media/AudioTrack;
    //   52: invokevirtual 267	android/media/AudioTrack:release	()V
    //   55: aload_0
    //   56: aconst_null
    //   57: putfield 232	com/tencent/mm/modelvoice/j:aga	Landroid/media/AudioTrack;
    //   60: iload_1
    //   61: ifeq +114 -> 175
    //   64: iconst_3
    //   65: istore_2
    //   66: iload_2
    //   67: istore_3
    //   68: getstatic 203	com/tencent/mm/compatible/e/q:deN	Lcom/tencent/mm/compatible/e/b;
    //   71: getfield 208	com/tencent/mm/compatible/e/b:dby	Z
    //   74: ifeq +23 -> 97
    //   77: getstatic 203	com/tencent/mm/compatible/e/q:deN	Lcom/tencent/mm/compatible/e/b;
    //   80: invokevirtual 211	com/tencent/mm/compatible/e/b:dump	()V
    //   83: iload_2
    //   84: istore_3
    //   85: getstatic 203	com/tencent/mm/compatible/e/q:deN	Lcom/tencent/mm/compatible/e/b;
    //   88: getfield 214	com/tencent/mm/compatible/e/b:dbF	I
    //   91: iconst_1
    //   92: if_icmpne +5 -> 97
    //   95: iconst_3
    //   96: istore_3
    //   97: aload_0
    //   98: new 227	com/tencent/mm/compatible/b/d
    //   101: dup
    //   102: iload_3
    //   103: aload_0
    //   104: getfield 60	com/tencent/mm/modelvoice/j:epn	I
    //   107: aload_0
    //   108: getfield 58	com/tencent/mm/modelvoice/j:epm	I
    //   111: aload_0
    //   112: getfield 222	com/tencent/mm/modelvoice/j:epr	I
    //   115: bipush 8
    //   117: imul
    //   118: invokespecial 230	com/tencent/mm/compatible/b/d:<init>	(IIII)V
    //   121: putfield 232	com/tencent/mm/modelvoice/j:aga	Landroid/media/AudioTrack;
    //   124: aload_0
    //   125: getfield 232	com/tencent/mm/modelvoice/j:aga	Landroid/media/AudioTrack;
    //   128: invokevirtual 239	android/media/AudioTrack:play	()V
    //   131: aload_0
    //   132: iconst_0
    //   133: putfield 70	com/tencent/mm/modelvoice/j:ept	Z
    //   136: return
    //   137: aload_0
    //   138: iconst_2
    //   139: putfield 58	com/tencent/mm/modelvoice/j:epm	I
    //   142: goto -124 -> 18
    //   145: astore 4
    //   147: ldc -102
    //   149: aload 4
    //   151: invokevirtual 256	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   154: invokestatic 126	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   157: aload_0
    //   158: aconst_null
    //   159: putfield 232	com/tencent/mm/modelvoice/j:aga	Landroid/media/AudioTrack;
    //   162: goto -102 -> 60
    //   165: astore 4
    //   167: aload_0
    //   168: aconst_null
    //   169: putfield 232	com/tencent/mm/modelvoice/j:aga	Landroid/media/AudioTrack;
    //   172: aload 4
    //   174: athrow
    //   175: iconst_0
    //   176: istore_2
    //   177: goto -111 -> 66
    //   180: astore 4
    //   182: ldc -102
    //   184: ldc_w 258
    //   187: iconst_1
    //   188: anewarray 4	java/lang/Object
    //   191: dup
    //   192: iconst_0
    //   193: aload 4
    //   195: invokevirtual 256	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   198: aastore
    //   199: invokestatic 182	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   202: goto -71 -> 131
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	205	0	this	j
    //   0	205	1	paramBoolean	boolean
    //   65	112	2	i	int
    //   67	36	3	j	int
    //   145	5	4	localException1	Exception
    //   165	8	4	localObject	Object
    //   180	14	4	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   41	55	145	java/lang/Exception
    //   41	55	165	finally
    //   147	157	165	finally
    //   124	131	180	java/lang/Exception
  }
  
  public final void b(b.a parama)
  {
    if ((parama != null) && (this.bFu != null)) {
      this.bFu.a(parama);
    }
  }
  
  public final boolean c(String paramString, boolean paramBoolean, int paramInt)
  {
    return N(paramString, paramBoolean);
  }
  
  public final int getStatus()
  {
    return this.status;
  }
  
  public final boolean isPlaying()
  {
    return this.status == 1;
  }
  
  /* Error */
  public final boolean vY()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 56	com/tencent/mm/modelvoice/j:status	I
    //   4: iconst_2
    //   5: if_icmpeq +5 -> 10
    //   8: iconst_0
    //   9: ireturn
    //   10: aload_0
    //   11: iconst_1
    //   12: putfield 56	com/tencent/mm/modelvoice/j:status	I
    //   15: aload_0
    //   16: getfield 72	com/tencent/mm/modelvoice/j:eoW	Ljava/lang/String;
    //   19: astore_1
    //   20: aload_1
    //   21: monitorenter
    //   22: ldc -102
    //   24: ldc_w 302
    //   27: invokestatic 276	com/tencent/mm/sdk/platformtools/x:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   30: aload_0
    //   31: getfield 72	com/tencent/mm/modelvoice/j:eoW	Ljava/lang/String;
    //   34: invokevirtual 305	java/lang/Object:notify	()V
    //   37: ldc -102
    //   39: ldc_w 307
    //   42: invokestatic 276	com/tencent/mm/sdk/platformtools/x:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   45: aload_0
    //   46: getfield 148	com/tencent/mm/modelvoice/j:bFu	Lcom/tencent/mm/compatible/util/b;
    //   49: ifnull +11 -> 60
    //   52: aload_0
    //   53: getfield 148	com/tencent/mm/modelvoice/j:bFu	Lcom/tencent/mm/compatible/util/b;
    //   56: invokevirtual 236	com/tencent/mm/compatible/util/b:requestFocus	()Z
    //   59: pop
    //   60: aload_1
    //   61: monitorexit
    //   62: iconst_1
    //   63: ireturn
    //   64: astore_2
    //   65: ldc -102
    //   67: ldc -82
    //   69: iconst_1
    //   70: anewarray 4	java/lang/Object
    //   73: dup
    //   74: iconst_0
    //   75: aload_2
    //   76: invokestatic 179	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   79: aastore
    //   80: invokestatic 182	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   83: aload_0
    //   84: getfield 148	com/tencent/mm/modelvoice/j:bFu	Lcom/tencent/mm/compatible/util/b;
    //   87: ifnull +11 -> 98
    //   90: aload_0
    //   91: getfield 148	com/tencent/mm/modelvoice/j:bFu	Lcom/tencent/mm/compatible/util/b;
    //   94: invokevirtual 236	com/tencent/mm/compatible/util/b:requestFocus	()Z
    //   97: pop
    //   98: aload_1
    //   99: monitorexit
    //   100: iconst_0
    //   101: ireturn
    //   102: astore_2
    //   103: aload_1
    //   104: monitorexit
    //   105: aload_2
    //   106: athrow
    //   107: astore_2
    //   108: aload_0
    //   109: getfield 148	com/tencent/mm/modelvoice/j:bFu	Lcom/tencent/mm/compatible/util/b;
    //   112: ifnull +11 -> 123
    //   115: aload_0
    //   116: getfield 148	com/tencent/mm/modelvoice/j:bFu	Lcom/tencent/mm/compatible/util/b;
    //   119: invokevirtual 236	com/tencent/mm/compatible/util/b:requestFocus	()Z
    //   122: pop
    //   123: aload_2
    //   124: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	125	0	this	j
    //   19	85	1	str	String
    //   64	12	2	localException	Exception
    //   102	4	2	localObject1	Object
    //   107	17	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   22	45	64	java/lang/Exception
    //   45	60	102	finally
    //   60	62	102	finally
    //   83	98	102	finally
    //   98	100	102	finally
    //   103	105	102	finally
    //   108	123	102	finally
    //   123	125	102	finally
    //   22	45	107	finally
    //   65	83	107	finally
  }
  
  public final double wb()
  {
    return 0.0D;
  }
  
  /* Error */
  public final boolean wk()
  {
    // Byte code:
    //   0: ldc -102
    //   2: new 107	java/lang/StringBuilder
    //   5: dup
    //   6: ldc_w 312
    //   9: invokespecial 112	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   12: aload_0
    //   13: getfield 56	com/tencent/mm/modelvoice/j:status	I
    //   16: invokevirtual 116	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   19: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   22: invokestatic 126	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   25: aload_0
    //   26: getfield 56	com/tencent/mm/modelvoice/j:status	I
    //   29: iconst_1
    //   30: if_icmpeq +38 -> 68
    //   33: aload_0
    //   34: getfield 56	com/tencent/mm/modelvoice/j:status	I
    //   37: iconst_2
    //   38: if_icmpeq +30 -> 68
    //   41: ldc -102
    //   43: new 107	java/lang/StringBuilder
    //   46: dup
    //   47: ldc_w 314
    //   50: invokespecial 112	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   53: aload_0
    //   54: getfield 56	com/tencent/mm/modelvoice/j:status	I
    //   57: invokevirtual 116	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   60: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   63: invokestatic 126	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   66: iconst_0
    //   67: ireturn
    //   68: aload_0
    //   69: iconst_3
    //   70: putfield 56	com/tencent/mm/modelvoice/j:status	I
    //   73: aload_0
    //   74: getfield 72	com/tencent/mm/modelvoice/j:eoW	Ljava/lang/String;
    //   77: astore_1
    //   78: aload_1
    //   79: monitorenter
    //   80: aload_0
    //   81: getfield 72	com/tencent/mm/modelvoice/j:eoW	Ljava/lang/String;
    //   84: invokevirtual 305	java/lang/Object:notify	()V
    //   87: aload_0
    //   88: getfield 148	com/tencent/mm/modelvoice/j:bFu	Lcom/tencent/mm/compatible/util/b;
    //   91: ifnull +11 -> 102
    //   94: aload_0
    //   95: getfield 148	com/tencent/mm/modelvoice/j:bFu	Lcom/tencent/mm/compatible/util/b;
    //   98: invokevirtual 251	com/tencent/mm/compatible/util/b:zY	()Z
    //   101: pop
    //   102: aload_1
    //   103: monitorexit
    //   104: iconst_1
    //   105: ireturn
    //   106: astore_2
    //   107: ldc -102
    //   109: ldc -82
    //   111: iconst_1
    //   112: anewarray 4	java/lang/Object
    //   115: dup
    //   116: iconst_0
    //   117: aload_2
    //   118: invokestatic 179	com/tencent/mm/sdk/platformtools/bi:i	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   121: aastore
    //   122: invokestatic 182	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   125: aload_0
    //   126: invokevirtual 225	com/tencent/mm/modelvoice/j:TG	()V
    //   129: aload_0
    //   130: getfield 148	com/tencent/mm/modelvoice/j:bFu	Lcom/tencent/mm/compatible/util/b;
    //   133: ifnull +11 -> 144
    //   136: aload_0
    //   137: getfield 148	com/tencent/mm/modelvoice/j:bFu	Lcom/tencent/mm/compatible/util/b;
    //   140: invokevirtual 251	com/tencent/mm/compatible/util/b:zY	()Z
    //   143: pop
    //   144: aload_1
    //   145: monitorexit
    //   146: iconst_0
    //   147: ireturn
    //   148: astore_2
    //   149: aload_1
    //   150: monitorexit
    //   151: aload_2
    //   152: athrow
    //   153: astore_2
    //   154: aload_0
    //   155: getfield 148	com/tencent/mm/modelvoice/j:bFu	Lcom/tencent/mm/compatible/util/b;
    //   158: ifnull +11 -> 169
    //   161: aload_0
    //   162: getfield 148	com/tencent/mm/modelvoice/j:bFu	Lcom/tencent/mm/compatible/util/b;
    //   165: invokevirtual 251	com/tencent/mm/compatible/util/b:zY	()Z
    //   168: pop
    //   169: aload_2
    //   170: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	171	0	this	j
    //   77	73	1	str	String
    //   106	12	2	localException	Exception
    //   148	4	2	localObject1	Object
    //   153	17	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   80	87	106	java/lang/Exception
    //   87	102	148	finally
    //   102	104	148	finally
    //   129	144	148	finally
    //   144	146	148	finally
    //   149	151	148	finally
    //   154	169	148	finally
    //   169	171	148	finally
    //   80	87	153	finally
    //   107	129	153	finally
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/modelvoice/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */