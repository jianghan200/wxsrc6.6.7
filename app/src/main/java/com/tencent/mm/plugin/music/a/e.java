package com.tencent.mm.plugin.music.a;

import android.os.Looper;
import com.tencent.mm.g.a.t;
import com.tencent.mm.plugin.music.b.a.c.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ar;
import com.tencent.mm.sdk.platformtools.x;

public abstract class e
  implements com.tencent.mm.plugin.music.b.a.c
{
  protected c lwR = null;
  ar lwV;
  protected boolean lwW;
  protected c.a lwX;
  
  public final void a(c paramc)
  {
    this.lwR = paramc;
  }
  
  public final void a(c.a parama)
  {
    this.lwX = parama;
  }
  
  public final void bhn() {}
  
  public final boolean bho()
  {
    return false;
  }
  
  public boolean bhp()
  {
    return false;
  }
  
  public final com.tencent.mm.an.d bhq()
  {
    return null;
  }
  
  public abstract String bhr();
  
  public final void bhs()
  {
    x.i("MicroMsg.Audio.BaseAudioPlayer", "onPrepareEvent");
    t localt = new t();
    localt.bHb.action = 7;
    localt.bHb.state = "canplay";
    localt.bHb.duration = getDuration();
    localt.bHb.bGW = bhr();
    localt.bHb.appId = getAppId();
    a.sFg.a(localt, Looper.getMainLooper());
  }
  
  public final void bht()
  {
    x.i("MicroMsg.Audio.BaseAudioPlayer", "onStartEvent %b", new Object[] { Boolean.valueOf(PY()) });
    t localt = new t();
    localt.bHb.action = 0;
    localt.bHb.state = "play";
    localt.bHb.bGW = bhr();
    localt.bHb.appId = getAppId();
    a.sFg.a(localt, Looper.getMainLooper());
    if (this.lwR != null) {
      this.lwR.onStart(bhr());
    }
  }
  
  public final void bhu()
  {
    x.i("MicroMsg.Audio.BaseAudioPlayer", "onResumeEvent");
    t localt = new t();
    localt.bHb.action = 1;
    localt.bHb.state = "play";
    localt.bHb.bGW = bhr();
    localt.bHb.appId = getAppId();
    a.sFg.a(localt, Looper.getMainLooper());
    if (this.lwR != null) {
      this.lwR.onStart(bhr());
    }
  }
  
  public final void bhv()
  {
    x.i("MicroMsg.Audio.BaseAudioPlayer", "onPauseEvent");
    t localt = new t();
    localt.bHb.action = 2;
    localt.bHb.state = "pause";
    localt.bHb.bGW = bhr();
    localt.bHb.appId = getAppId();
    a.sFg.a(localt, Looper.getMainLooper());
    if (this.lwR != null) {
      this.lwR.HT(bhr());
    }
  }
  
  public final void bhw()
  {
    x.i("MicroMsg.Audio.BaseAudioPlayer", "onStopEvent");
    t localt = new t();
    localt.bHb.action = 3;
    localt.bHb.state = "stop";
    localt.bHb.bGW = bhr();
    localt.bHb.appId = getAppId();
    a.sFg.a(localt, Looper.getMainLooper());
    if (this.lwR != null) {
      this.lwR.AW(bhr());
    }
  }
  
  public final void bhx()
  {
    x.i("MicroMsg.Audio.BaseAudioPlayer", "onSeekToEvent");
    t localt = new t();
    localt.bHb.action = 6;
    localt.bHb.state = "seeked";
    localt.bHb.bGW = bhr();
    localt.bHb.appId = getAppId();
    a.sFg.a(localt, Looper.getMainLooper());
  }
  
  public final void bhy()
  {
    x.i("MicroMsg.Audio.BaseAudioPlayer", "onStopEvent");
    t localt = new t();
    localt.bHb.action = 5;
    localt.bHb.state = "ended";
    localt.bHb.bGW = bhr();
    localt.bHb.appId = getAppId();
    a.sFg.a(localt, Looper.getMainLooper());
    if (this.lwR != null) {
      this.lwR.HU(bhr());
    }
  }
  
  public final void bhz()
  {
    x.i("MicroMsg.Audio.BaseAudioPlayer", "onErrorEvent");
    tp(-1);
  }
  
  public abstract String getAppId();
  
  public final void tp(int paramInt)
  {
    x.i("MicroMsg.Audio.BaseAudioPlayer", "onErrorEvent with errCode:%d", new Object[] { Integer.valueOf(paramInt) });
    t localt = new t();
    localt.bHb.action = 4;
    localt.bHb.state = "error";
    localt.bHb.errCode = com.tencent.mm.plugin.music.b.a.d.tL(paramInt);
    localt.bHb.Yy = com.tencent.mm.plugin.music.b.a.d.tM(paramInt);
    localt.bHb.bGW = bhr();
    localt.bHb.appId = getAppId();
    a.sFg.a(localt, Looper.getMainLooper());
    if (this.lwR != null) {
      this.lwR.onError(bhr());
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/music/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */