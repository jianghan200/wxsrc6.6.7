package com.tencent.mm.plugin.u;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ag.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class i
{
  private ag.a ldA = new i.1(this);
  Looper ldt;
  ag ldu;
  HandlerThread ldv = e.cZ("VideoPlayer:inner", -16);
  HandlerThread ldw;
  HandlerThread ldx;
  public j ldy;
  public c ldz;
  
  public i(Looper paramLooper)
  {
    this(paramLooper, (byte)0);
  }
  
  private i(Looper paramLooper, byte paramByte)
  {
    this.ldv.start();
    this.ldw = e.cZ("VideoPlayer:video", -16);
    this.ldw.start();
    this.ldx = e.cZ("VideoPlayer:audio", -16);
    this.ldx.start();
    this.ldt = paramLooper;
    this.ldu = new ag(this.ldt, this.ldA);
    ag localag = this.ldu;
    Looper localLooper1 = this.ldv.getLooper();
    Looper localLooper2 = this.ldw.getLooper();
    if (this.ldx != null) {}
    for (paramLooper = this.ldx.getLooper();; paramLooper = null)
    {
      this.ldy = new j(localag, localLooper1, localLooper2, paramLooper);
      return;
    }
  }
  
  public final String avA()
  {
    if (this.ldy != null) {
      return this.ldy.ldg.avA();
    }
    return "has no player!";
  }
  
  public final int bdA()
  {
    j localj = this.ldy;
    if (localj.ldg != null)
    {
      int i = (int)(localj.ldg.lcW / 1000L);
      int j = (int)localj.ldg.lcV;
      if (j == -1) {}
      for (;;)
      {
        j = i;
        if (i < localj.ldg.lcX / 1000L) {
          j = (int)(localj.ldg.lcX / 1000L);
        }
        x.d("MicroMsg.VideoPlayerImpl", "%s get curr play ms %d time[%d %d]", new Object[] { localj.ldg.avA(), Integer.valueOf(j), Long.valueOf(localj.ldg.lcW), Long.valueOf(localj.ldg.lcX) });
        return j;
        i = j;
      }
    }
    return 0;
  }
  
  public final boolean bdz()
  {
    j localj = this.ldy;
    x.i("MicroMsg.VideoPlayerImpl", "%s player start to prepare ", new Object[] { localj.ldg.avA() });
    localj.ldC.obtainMessage(1).sendToTarget();
    if (localj.ldJ != null) {
      localj.ldD.obtainMessage(1).sendToTarget();
    }
    return true;
  }
  
  public final void gr(boolean paramBoolean)
  {
    this.ldy.ldH.ldQ = paramBoolean;
  }
  
  public final boolean isPlaying()
  {
    return d.sz(this.ldy.state);
  }
  
  public final void pause()
  {
    x.d("MicroMsg.VideoPlayer", "%s pause state[%d] stack %s", new Object[] { avA(), Integer.valueOf(this.ldy.state), bi.cjd() });
    if ((d.sC(this.ldy.state)) || (d.sA(this.ldy.state)))
    {
      x.w("MicroMsg.VideoPlayer", "%s it seek now, do not response pause event.", new Object[] { avA() });
      return;
    }
    this.ldy.pause();
  }
  
  public final void release()
  {
    try
    {
      this.ldy.release();
      return;
    }
    catch (Exception localException) {}
  }
  
  public final void sG(int paramInt)
  {
    this.ldy.sG(paramInt);
  }
  
  public final void setIOnlineCache(b paramb)
  {
    if ((paramb != null) && (this.ldy != null)) {
      this.ldy.ldH.ldj = paramb;
    }
  }
  
  public final void setIsOnlineVideoType(boolean paramBoolean)
  {
    if (this.ldy != null)
    {
      j localj = this.ldy;
      if (localj.ldg != null)
      {
        x.i("MicroMsg.VideoPlayerImpl", "%s set is online video type [%b]", new Object[] { localj.ldg.avA(), Boolean.valueOf(paramBoolean) });
        localj.ldg.ldc = paramBoolean;
      }
    }
  }
  
  public final void setMute(boolean paramBoolean)
  {
    try
    {
      if (this.ldy != null)
      {
        j localj = this.ldy;
        if (localj.ldJ != null)
        {
          x.i("MicroMsg.VideoPlayerImpl", "%s play set mute[%b]", new Object[] { localj.ldg.avA(), Boolean.valueOf(paramBoolean) });
          localj.ldJ.setMute(paramBoolean);
        }
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  public final void setNeedResetExtractor(boolean paramBoolean)
  {
    if (this.ldy != null)
    {
      j localj = this.ldy;
      if (localj.ldg != null) {
        localj.ldg.ldb = paramBoolean;
      }
    }
  }
  
  public final void setPath(String paramString)
  {
    x.i("MicroMsg.VideoPlayer", "%s video player set path %s", new Object[] { avA(), paramString });
    j localj = this.ldy;
    x.i("MicroMsg.VideoPlayerImpl", "%s set path %s", new Object[] { localj.ldg.avA(), paramString });
    localj.ldH.setPath(paramString);
    if (localj.ldJ != null) {
      localj.ldJ.setPath(paramString);
    }
  }
  
  public final void setSurface(Surface paramSurface)
  {
    if (paramSurface != null)
    {
      j localj = this.ldy;
      x.i("MicroMsg.VideoPlayerImpl", "%s set surface[%d] ", new Object[] { localj.ldg.avA(), Integer.valueOf(paramSurface.hashCode()) });
      localj.ldH.aeJ = paramSurface;
    }
  }
  
  public final void start()
  {
    x.d("MicroMsg.VideoPlayer", "%s start state[%d] stack %s", new Object[] { avA(), Integer.valueOf(this.ldy.state), bi.cjd() });
    if ((d.sC(this.ldy.state)) || (d.sA(this.ldy.state)))
    {
      x.w("MicroMsg.VideoPlayer", "%s it seek now, do not response start event.", new Object[] { avA() });
      return;
    }
    this.ldy.start();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/u/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */