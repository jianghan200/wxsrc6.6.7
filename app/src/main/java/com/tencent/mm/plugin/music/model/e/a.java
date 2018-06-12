package com.tencent.mm.plugin.music.model.e;

import android.os.Looper;
import com.tencent.mm.g.a.jt;
import com.tencent.mm.plugin.music.b.a.c;
import com.tencent.mm.plugin.music.b.a.c.a;
import com.tencent.mm.plugin.music.b.a.d;
import com.tencent.mm.plugin.music.model.e;
import com.tencent.mm.plugin.music.model.f;
import com.tencent.mm.plugin.music.model.h;
import com.tencent.mm.protocal.c.avq;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ar;
import com.tencent.mm.sdk.platformtools.ar.a;
import com.tencent.mm.sdk.platformtools.x;

public abstract class a
  implements c
{
  public boolean bTH;
  private ar lwV;
  protected boolean lwW;
  protected c.a lwX;
  public String lzq = "";
  
  public final void a(c.a parama)
  {
    this.lwX = parama;
  }
  
  public final void a(avq paramavq, int paramInt)
  {
    x.i("MicroMsg.Music.BaseMusicPlayer", "onErrorEvent with errCode:%d", new Object[] { Integer.valueOf(paramInt) });
    this.lzq = "error";
    jt localjt = new jt();
    localjt.bTE.action = 4;
    localjt.bTE.bTy = paramavq;
    localjt.bTE.state = "error";
    localjt.bTE.duration = getDuration();
    localjt.bTE.bTG = bhp();
    localjt.bTE.errCode = d.tL(paramInt);
    localjt.bTE.Yy = d.tM(paramInt);
    com.tencent.mm.sdk.b.a.sFg.a(localjt, Looper.getMainLooper());
    f.bhZ();
  }
  
  protected final void bir()
  {
    this.lwV = new ar();
    this.lwV.fN(ad.getContext());
    this.lwV.a(new ar.a()
    {
      public final void fn(int paramAnonymousInt)
      {
        switch (paramAnonymousInt)
        {
        }
        do
        {
          do
          {
            return;
          } while (!a.this.lwW);
          a.this.lwW = false;
          a.this.resume();
          return;
        } while (!a.this.PY());
        a.this.lwW = true;
        a.this.pause();
      }
    });
  }
  
  public final void bis()
  {
    if (this.lwV != null)
    {
      this.lwV.end();
      this.lwV.ciy();
    }
  }
  
  public final void m(avq paramavq)
  {
    x.i("MicroMsg.Music.BaseMusicPlayer", "onPreparintEvent %b", new Object[] { Boolean.valueOf(PY()) });
    this.lzq = "waiting";
    jt localjt = new jt();
    localjt.bTE.action = 11;
    localjt.bTE.bTy = paramavq;
    localjt.bTE.state = "waiting";
    localjt.bTE.duration = getDuration();
    localjt.bTE.bTG = bhp();
    com.tencent.mm.sdk.b.a.sFg.a(localjt, Looper.getMainLooper());
  }
  
  public final void n(avq paramavq)
  {
    x.i("MicroMsg.Music.BaseMusicPlayer", "onPrepareEvent %b", new Object[] { Boolean.valueOf(PY()) });
    this.lzq = "canplay";
    jt localjt = new jt();
    localjt.bTE.action = 9;
    localjt.bTE.bTy = paramavq;
    localjt.bTE.state = "canplay";
    localjt.bTE.duration = getDuration();
    localjt.bTE.bTG = bhp();
    com.tencent.mm.sdk.b.a.sFg.a(localjt, Looper.getMainLooper());
  }
  
  public final void o(avq paramavq)
  {
    x.i("MicroMsg.Music.BaseMusicPlayer", "onStartEvent %b", new Object[] { Boolean.valueOf(PY()) });
    this.lzq = "play";
    jt localjt = new jt();
    localjt.bTE.action = 0;
    localjt.bTE.bTy = paramavq;
    localjt.bTE.state = "play";
    localjt.bTE.duration = getDuration();
    localjt.bTE.bTG = bhp();
    com.tencent.mm.sdk.b.a.sFg.a(localjt, Looper.getMainLooper());
    f.bhZ();
    f.dGw = System.currentTimeMillis();
    f.e(h.bic().bhR());
  }
  
  public final void p(avq paramavq)
  {
    x.i("MicroMsg.Music.BaseMusicPlayer", "onResumeEvent");
    this.lzq = "play";
    jt localjt = new jt();
    localjt.bTE.action = 1;
    localjt.bTE.bTy = paramavq;
    localjt.bTE.state = "play";
    localjt.bTE.duration = getDuration();
    localjt.bTE.bTG = bhp();
    com.tencent.mm.sdk.b.a.sFg.a(localjt, Looper.getMainLooper());
    f.dGw = System.currentTimeMillis();
  }
  
  public final void q(avq paramavq)
  {
    x.i("MicroMsg.Music.BaseMusicPlayer", "onPauseEvent");
    this.lzq = "pause";
    jt localjt = new jt();
    localjt.bTE.action = 3;
    localjt.bTE.bTy = paramavq;
    localjt.bTE.state = "pause";
    localjt.bTE.duration = getDuration();
    localjt.bTE.bTG = bhp();
    com.tencent.mm.sdk.b.a.sFg.a(localjt, Looper.getMainLooper());
    f.yL();
  }
  
  public final void r(avq paramavq)
  {
    x.i("MicroMsg.Music.BaseMusicPlayer", "onStopEvent");
    this.lzq = "stop";
    jt localjt = new jt();
    localjt.bTE.action = 2;
    localjt.bTE.bTy = paramavq;
    localjt.bTE.state = "stop";
    localjt.bTE.duration = getDuration();
    localjt.bTE.bTG = bhp();
    paramavq = localjt.bTE;
    boolean bool = this.bTH;
    this.bTH = false;
    paramavq.bTH = bool;
    com.tencent.mm.sdk.b.a.sFg.a(localjt, Looper.getMainLooper());
    f.bhZ();
  }
  
  public final void s(avq paramavq)
  {
    x.i("MicroMsg.Music.BaseMusicPlayer", "onSeekToEvent");
    this.lzq = "seeked";
    jt localjt = new jt();
    localjt.bTE.action = 8;
    localjt.bTE.bTy = paramavq;
    localjt.bTE.state = "seeked";
    localjt.bTE.duration = getDuration();
    localjt.bTE.bTG = bhp();
    com.tencent.mm.sdk.b.a.sFg.a(localjt, Looper.getMainLooper());
  }
  
  public final void t(avq paramavq)
  {
    x.i("MicroMsg.Music.BaseMusicPlayer", "onSeekingEvent");
    this.lzq = "seeking";
    jt localjt = new jt();
    localjt.bTE.action = 12;
    localjt.bTE.bTy = paramavq;
    localjt.bTE.state = "seeking";
    localjt.bTE.duration = getDuration();
    localjt.bTE.bTG = bhp();
    com.tencent.mm.sdk.b.a.sFg.a(localjt, Looper.getMainLooper());
  }
  
  public final void u(avq paramavq)
  {
    x.i("MicroMsg.Music.BaseMusicPlayer", "onStopEvent");
    this.lzq = "ended";
    jt localjt = new jt();
    localjt.bTE.action = 7;
    localjt.bTE.bTy = paramavq;
    localjt.bTE.state = "ended";
    localjt.bTE.duration = getDuration();
    localjt.bTE.bTG = bhp();
    com.tencent.mm.sdk.b.a.sFg.a(localjt, Looper.getMainLooper());
    f.bhZ();
    if (h.bic().mode == 2) {
      h.bic().bhU();
    }
  }
  
  public final void v(avq paramavq)
  {
    x.i("MicroMsg.Music.BaseMusicPlayer", "onErrorEvent");
    a(paramavq, -1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/music/model/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */