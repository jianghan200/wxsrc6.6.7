package com.tencent.mm.plugin.music.model.e;

import android.annotation.TargetApi;
import android.media.AudioTrack;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import com.tencent.mm.compatible.b.d;
import com.tencent.mm.plugin.music.b.a.b;
import com.tencent.mm.plugin.music.b.a.f;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.x;

@TargetApi(16)
public final class c
  extends b
{
  AudioTrack aga;
  MediaCodec apD;
  int channels = 0;
  int dAa = 0;
  long duration = 0L;
  String ldm = null;
  MediaExtractor ldo;
  private boolean lhj = true;
  String lzu;
  boolean lzv = false;
  private Runnable lzw = new c.1(this);
  long presentationTimeUs = 0L;
  int sampleRate = 0;
  
  /* Error */
  private void biw()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 68
    //   4: ldc 92
    //   6: invokestatic 96	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   9: aload_0
    //   10: invokevirtual 99	java/lang/Object:notify	()V
    //   13: aload_0
    //   14: monitorexit
    //   15: return
    //   16: astore_1
    //   17: ldc 68
    //   19: aload_1
    //   20: ldc 101
    //   22: iconst_0
    //   23: anewarray 72	java/lang/Object
    //   26: invokestatic 78	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   29: goto -16 -> 13
    //   32: astore_1
    //   33: aload_0
    //   34: monitorexit
    //   35: aload_1
    //   36: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	37	0	this	c
    //   16	4	1	localException	Exception
    //   32	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   9	13	16	java/lang/Exception
    //   2	9	32	finally
    //   9	13	32	finally
    //   17	29	32	finally
  }
  
  public final void IA(String paramString)
  {
    this.lzu = paramString;
  }
  
  public final boolean bit()
  {
    return !this.lhj;
  }
  
  public final int biu()
  {
    return (int)(this.presentationTimeUs / 1000L);
  }
  
  public final String biv()
  {
    return this.ldm;
  }
  
  public final void bix()
  {
    try
    {
      while (bit())
      {
        boolean bool = this.lAa.biA();
        if (!bool) {
          break;
        }
        try
        {
          x.i("MicroMsg.Music.MMPlayer", "wait play");
          wait();
        }
        catch (InterruptedException localInterruptedException)
        {
          x.printErrStackTrace("MicroMsg.Music.MMPlayer", localInterruptedException, "waitPlay", new Object[0]);
        }
      }
    }
    finally {}
  }
  
  final boolean createAudioTrack()
  {
    x.i("MicroMsg.Music.MMPlayer", "createAudioTrack");
    int i;
    if (this.channels == 1) {
      i = 4;
    }
    for (;;)
    {
      int j = AudioTrack.getMinBufferSize(this.sampleRate, i, 2);
      this.aga = new d(3, this.sampleRate, i, j);
      if ((this.aga == null) || (this.aga.getState() != 1))
      {
        x.e("MicroMsg.Music.MMPlayer", "audio track not initialized");
        if (this.aga == null) {}
      }
      try
      {
        this.aga.release();
        return false;
        i = 12;
        continue;
        return true;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
  
  protected final void gP(boolean paramBoolean)
  {
    this.lzv = false;
    this.lAa.lAe = 4;
    this.lhj = true;
    super.gP(paramBoolean);
  }
  
  protected final void gQ(boolean paramBoolean)
  {
    this.lAa.lAe = 4;
    this.lhj = true;
    super.gQ(paramBoolean);
  }
  
  public final int getDuration()
  {
    return (int)(this.duration / 1000L);
  }
  
  public final boolean isPlaying()
  {
    return this.lAa.isPlaying();
  }
  
  public final void pause()
  {
    x.i("MicroMsg.Music.MMPlayer", "pause");
    if (!bit()) {
      return;
    }
    this.lAa.lAe = 2;
  }
  
  public final void play()
  {
    x.i("MicroMsg.Music.MMPlayer", "play");
    if (!bit())
    {
      this.lhj = false;
      e.post(this.lzw, "music_player");
    }
    while ((!bit()) || (!this.lAa.biA())) {
      return;
    }
    this.lAa.lAe = 3;
    biw();
  }
  
  public final void seek(long paramLong)
  {
    this.ldo.seekTo(1000L * paramLong, 2);
  }
  
  public final void stop()
  {
    x.i("MicroMsg.Music.MMPlayer", "stop");
    this.lhj = true;
    if (this.lAa.biA()) {
      biw();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/music/model/e/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */