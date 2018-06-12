package com.tencent.liteav.audio;

import android.content.Context;
import com.tencent.liteav.audio.impl.Play.TXAudioJitterBufferReportInfo;
import com.tencent.liteav.audio.impl.Play.TXCAudioBasePlayController;
import com.tencent.liteav.audio.impl.TXCTraeJNI;
import com.tencent.liteav.audio.impl.e;
import com.tencent.liteav.basic.log.TXCLog;

public class b
  implements e
{
  public static final int a = TXEAudioDef.TXE_AEC_NONE;
  public static float b = 5.0F;
  public static boolean c = true;
  public static float d = 5.0F;
  public static float e = 1.0F;
  public static boolean f = false;
  public static int g = 0;
  private static final String h = "AudioCenter:" + b.class.getSimpleName();
  private TXCAudioBasePlayController i = null;
  private d j;
  private int k = a;
  private float l = b;
  private boolean m = c;
  private float n = d;
  private float o = e;
  private boolean p = false;
  private boolean q = false;
  private boolean r = f;
  private int s = g;
  private Context t;
  
  private void a(int paramInt, Context paramContext)
  {
    if ((paramInt == TXEAudioDef.TXE_AEC_TRAE) && (!TXCTraeJNI.nativeCheckTraeEngine(paramContext)))
    {
      TXCLog.e(h, "set aec type failed, check trae library failed!!");
      return;
    }
    TXCLog.i(h, "set aec type to " + paramInt + ", cur type " + this.k);
    this.k = paramInt;
  }
  
  public static void a(Context paramContext, int paramInt)
  {
    TXCAudioBasePlayController.setAudioMode(paramContext, paramInt);
  }
  
  public int a()
  {
    try
    {
      int i1 = TXEAudioDef.TXE_AUDIO_PLAY_ERR_OK;
      this.j = null;
      this.l = b;
      this.m = c;
      this.n = d;
      this.o = e;
      this.p = false;
      this.q = false;
      this.r = f;
      this.t = null;
      if (this.i != null)
      {
        i1 = this.i.stopPlay();
        this.i = null;
      }
      com.tencent.liteav.audio.impl.c.a().b(this);
      return i1;
    }
    finally {}
  }
  
  public int a(Context paramContext)
  {
    if (paramContext == null) {}
    for (;;)
    {
      int i1;
      try
      {
        TXCLog.e(h, "invalid param, start play failed!");
        i1 = TXEAudioDef.TXE_AUDIO_COMMON_ERR_INVALID_PARAMS;
        return i1;
      }
      finally {}
      if (com.tencent.liteav.audio.impl.a.c(this.k) != TXEAudioDef.TXE_AUDIO_PLAY_ERR_OK) {
        TXCLog.w(h, "start player failed, with aec type " + this.k + ", invalid aec recorder has started!");
      }
      if ((this.i != null) && (this.i.isPlaying()))
      {
        TXCLog.e(h, "play has started, can not start again!");
        i1 = TXEAudioDef.TXE_AUDIO_PLAY_ERR_REPEAT_OPTION;
      }
      else
      {
        this.t = paramContext;
        com.tencent.liteav.audio.impl.c.a().a(this.t);
        com.tencent.liteav.audio.impl.c.a().a(this);
        if (this.i == null)
        {
          if (this.k == TXEAudioDef.TXE_AEC_TRAE) {
            this.i = new com.tencent.liteav.audio.impl.Play.c(paramContext.getApplicationContext());
          }
        }
        else
        {
          if (this.i == null) {
            break label276;
          }
          a(this.k, this.t);
          a(this.j);
          a(this.l);
          a(this.m);
          b(this.n);
          c(this.o);
          c(this.p);
          b(this.q);
          d(this.r);
          a(this.s);
          i1 = this.i.startPlay();
          continue;
        }
        this.i = new com.tencent.liteav.audio.impl.Play.b(paramContext.getApplicationContext());
        continue;
        label276:
        TXCLog.e(h, "start play failed! controller is null!");
        i1 = TXEAudioDef.TXE_AUDIO_COMMON_ERR_INVALID_PARAMS;
      }
    }
  }
  
  /* Error */
  public int a(com.tencent.liteav.basic.f.a parama)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 83	com/tencent/liteav/audio/b:i	Lcom/tencent/liteav/audio/impl/Play/TXCAudioBasePlayController;
    //   6: ifnonnull +19 -> 25
    //   9: getstatic 58	com/tencent/liteav/audio/b:h	Ljava/lang/String;
    //   12: ldc -27
    //   14: invokestatic 118	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   17: getstatic 232	com/tencent/liteav/audio/TXEAudioDef:TXE_AUDIO_PLAY_ERR_INVALID_STATE	I
    //   20: istore_2
    //   21: aload_0
    //   22: monitorexit
    //   23: iload_2
    //   24: ireturn
    //   25: aload_0
    //   26: getfield 83	com/tencent/liteav/audio/b:i	Lcom/tencent/liteav/audio/impl/Play/TXCAudioBasePlayController;
    //   29: aload_1
    //   30: invokevirtual 235	com/tencent/liteav/audio/impl/Play/TXCAudioBasePlayController:playData	(Lcom/tencent/liteav/basic/f/a;)I
    //   33: istore_2
    //   34: goto -13 -> 21
    //   37: astore_1
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_1
    //   41: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	42	0	this	b
    //   0	42	1	parama	com.tencent.liteav.basic.f.a
    //   20	14	2	i1	int
    // Exception table:
    //   from	to	target	type
    //   2	21	37	finally
    //   25	34	37	finally
  }
  
  public void a(float paramFloat)
  {
    this.l = paramFloat;
    if (this.i != null) {
      this.i.setCacheTime(paramFloat);
    }
  }
  
  public void a(int paramInt)
  {
    this.s = paramInt;
    if (this.i != null) {
      this.i.enableSmootheMode(paramInt);
    }
  }
  
  public void a(d paramd)
  {
    this.j = paramd;
    if (this.i != null) {
      this.i.setListener(paramd);
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.m = paramBoolean;
    if (this.i != null) {
      this.i.enableAutojustCache(paramBoolean);
    }
  }
  
  public void a(boolean paramBoolean, Context paramContext)
  {
    if (!paramBoolean)
    {
      a(TXEAudioDef.TXE_AEC_NONE, paramContext);
      return;
    }
    if (com.tencent.liteav.basic.e.b.a().g())
    {
      a(TXEAudioDef.TXE_AEC_SYSTEM, paramContext);
      return;
    }
    a.a(com.tencent.liteav.basic.e.b.a().b());
    a(TXEAudioDef.TXE_AEC_TRAE, paramContext);
  }
  
  /* Error */
  public long b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 83	com/tencent/liteav/audio/b:i	Lcom/tencent/liteav/audio/impl/Play/TXCAudioBasePlayController;
    //   6: ifnull +15 -> 21
    //   9: aload_0
    //   10: getfield 83	com/tencent/liteav/audio/b:i	Lcom/tencent/liteav/audio/impl/Play/TXCAudioBasePlayController;
    //   13: invokevirtual 268	com/tencent/liteav/audio/impl/Play/TXCAudioBasePlayController:getCacheDuration	()J
    //   16: lstore_1
    //   17: aload_0
    //   18: monitorexit
    //   19: lload_1
    //   20: lreturn
    //   21: lconst_0
    //   22: lstore_1
    //   23: goto -6 -> 17
    //   26: astore_3
    //   27: aload_0
    //   28: monitorexit
    //   29: aload_3
    //   30: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	31	0	this	b
    //   16	7	1	l1	long
    //   26	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	17	26	finally
  }
  
  public void b(float paramFloat)
  {
    this.n = paramFloat;
    if (this.i != null) {
      this.i.setAutoAdjustMaxCache(paramFloat);
    }
  }
  
  public void b(int paramInt)
  {
    switch (paramInt)
    {
    }
    do
    {
      do
      {
        do
        {
          return;
        } while (this.i == null);
        this.i.setMute(true);
        return;
      } while (this.i == null);
      this.i.setMute(true);
      return;
    } while (this.i == null);
    this.i.setMute(this.r);
  }
  
  public void b(boolean paramBoolean)
  {
    this.q = paramBoolean;
    if (this.i != null) {
      this.i.enableHWAcceleration(paramBoolean);
    }
  }
  
  /* Error */
  public long c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 83	com/tencent/liteav/audio/b:i	Lcom/tencent/liteav/audio/impl/Play/TXCAudioBasePlayController;
    //   6: ifnull +15 -> 21
    //   9: aload_0
    //   10: getfield 83	com/tencent/liteav/audio/b:i	Lcom/tencent/liteav/audio/impl/Play/TXCAudioBasePlayController;
    //   13: invokevirtual 280	com/tencent/liteav/audio/impl/Play/TXCAudioBasePlayController:getCurPts	()J
    //   16: lstore_1
    //   17: aload_0
    //   18: monitorexit
    //   19: lload_1
    //   20: lreturn
    //   21: lconst_0
    //   22: lstore_1
    //   23: goto -6 -> 17
    //   26: astore_3
    //   27: aload_0
    //   28: monitorexit
    //   29: aload_3
    //   30: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	31	0	this	b
    //   16	7	1	l1	long
    //   26	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	17	26	finally
  }
  
  public void c(float paramFloat)
  {
    this.o = paramFloat;
    if (this.i != null) {
      this.i.setAutoAdjustMinCache(paramFloat);
    }
  }
  
  public void c(boolean paramBoolean)
  {
    this.p = paramBoolean;
    if (this.i != null) {
      this.i.enableRealTimePlay(paramBoolean);
    }
  }
  
  /* Error */
  public int d()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 83	com/tencent/liteav/audio/b:i	Lcom/tencent/liteav/audio/impl/Play/TXCAudioBasePlayController;
    //   6: ifnull +15 -> 21
    //   9: aload_0
    //   10: getfield 83	com/tencent/liteav/audio/b:i	Lcom/tencent/liteav/audio/impl/Play/TXCAudioBasePlayController;
    //   13: invokevirtual 289	com/tencent/liteav/audio/impl/Play/TXCAudioBasePlayController:getRecvJitter	()I
    //   16: istore_1
    //   17: aload_0
    //   18: monitorexit
    //   19: iload_1
    //   20: ireturn
    //   21: iconst_0
    //   22: istore_1
    //   23: goto -6 -> 17
    //   26: astore_2
    //   27: aload_0
    //   28: monitorexit
    //   29: aload_2
    //   30: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	31	0	this	b
    //   16	7	1	i1	int
    //   26	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	17	26	finally
  }
  
  public void d(boolean paramBoolean)
  {
    this.r = paramBoolean;
    if (this.i != null) {
      this.i.setMute(paramBoolean);
    }
  }
  
  /* Error */
  public long e()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 83	com/tencent/liteav/audio/b:i	Lcom/tencent/liteav/audio/impl/Play/TXCAudioBasePlayController;
    //   6: ifnull +15 -> 21
    //   9: aload_0
    //   10: getfield 83	com/tencent/liteav/audio/b:i	Lcom/tencent/liteav/audio/impl/Play/TXCAudioBasePlayController;
    //   13: invokevirtual 292	com/tencent/liteav/audio/impl/Play/TXCAudioBasePlayController:getCurRecvTS	()J
    //   16: lstore_1
    //   17: aload_0
    //   18: monitorexit
    //   19: lload_1
    //   20: lreturn
    //   21: lconst_0
    //   22: lstore_1
    //   23: goto -6 -> 17
    //   26: astore_3
    //   27: aload_0
    //   28: monitorexit
    //   29: aload_3
    //   30: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	31	0	this	b
    //   16	7	1	l1	long
    //   26	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	17	26	finally
  }
  
  /* Error */
  public float f()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 83	com/tencent/liteav/audio/b:i	Lcom/tencent/liteav/audio/impl/Play/TXCAudioBasePlayController;
    //   6: ifnull +15 -> 21
    //   9: aload_0
    //   10: getfield 83	com/tencent/liteav/audio/b:i	Lcom/tencent/liteav/audio/impl/Play/TXCAudioBasePlayController;
    //   13: invokevirtual 296	com/tencent/liteav/audio/impl/Play/TXCAudioBasePlayController:getCacheThreshold	()F
    //   16: fstore_1
    //   17: aload_0
    //   18: monitorexit
    //   19: fload_1
    //   20: freturn
    //   21: fconst_0
    //   22: fstore_1
    //   23: goto -6 -> 17
    //   26: astore_2
    //   27: aload_0
    //   28: monitorexit
    //   29: aload_2
    //   30: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	31	0	this	b
    //   16	7	1	f1	float
    //   26	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	17	26	finally
  }
  
  public int g()
  {
    if (com.tencent.liteav.audio.impl.Play.d.a().d())
    {
      if (this.k == TXEAudioDef.TXE_AEC_TRAE)
      {
        TXCLog.e(h, "audio track has start, but aec type is trae!!" + this.k);
        return TXEAudioDef.TXE_AEC_NONE;
      }
      return this.k;
    }
    if (TXCTraeJNI.nativeTraeIsPlaying())
    {
      if (this.k != TXEAudioDef.TXE_AEC_TRAE)
      {
        TXCLog.e(h, "trae engine has start, but aec type is not trae!!" + this.k);
        return TXEAudioDef.TXE_AEC_TRAE;
      }
      return this.k;
    }
    return TXEAudioDef.TXE_AEC_NONE;
  }
  
  public TXAudioJitterBufferReportInfo h()
  {
    if (this.i != null) {
      return this.i.getReportInfo();
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/liteav/audio/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */