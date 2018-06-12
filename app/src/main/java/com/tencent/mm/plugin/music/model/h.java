package com.tencent.mm.plugin.music.model;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Handler;
import com.google.android.exoplayer2.source.f;
import com.google.android.exoplayer2.v;
import com.tencent.mm.ab.o;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.g.a.d;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.p;
import com.tencent.mm.plugin.music.model.notification.MMMusicPlayerService;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.qqmusic.mediaplayer.CommonPlayer;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

public class h
  implements ar
{
  private com.tencent.mm.sdk.b.c bannerOnInitListener = new h.4(this);
  private AudioManager daT;
  private com.tencent.mm.sdk.b.c<d> juU = new h.5(this);
  private com.tencent.mm.sdk.b.c lyA = new h.3(this);
  private c lyv;
  private e lyw;
  private com.tencent.mm.plugin.music.model.f.a lyx;
  private ClipboardManager lyy;
  private com.tencent.mm.plugin.music.model.f.b lyz;
  
  private static h bib()
  {
    return (h)p.v(h.class);
  }
  
  public static e bic()
  {
    if (bib().lyw == null) {
      bib().lyw = new e();
    }
    return bib().lyw;
  }
  
  public static com.tencent.mm.plugin.music.model.f.a bid()
  {
    if (bib().lyx == null) {
      bib().lyx = new com.tencent.mm.plugin.music.model.f.a(com.tencent.mm.kernel.g.Ei().dqq);
    }
    return bib().lyx;
  }
  
  public static AudioManager bie()
  {
    if (bib().daT == null) {
      bib().daT = ((AudioManager)ad.getContext().getSystemService("audio"));
    }
    return bib().daT;
  }
  
  public static ClipboardManager bif()
  {
    if (bib().lyy == null) {
      bib().lyy = ((ClipboardManager)ad.getContext().getSystemService("clipboard"));
    }
    return bib().lyy;
  }
  
  public static c big()
  {
    if (bib().lyv == null) {
      bib().lyv = new c();
    }
    return bib().lyv;
  }
  
  public static com.tencent.mm.plugin.music.model.f.b bih()
  {
    if (bib().lyz == null) {
      bib().lyz = new com.tencent.mm.plugin.music.model.f.b(com.tencent.mm.kernel.g.Ei().dqq);
    }
    return bib().lyz;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf("Music".hashCode()), new h.1(this));
    localHashMap.put(Integer.valueOf("PieceMusicInfo".hashCode()), new h.d()
    {
      public final String[] xb()
      {
        return new String[] { i.a(cy.wI(), "PieceMusicInfo") };
      }
    });
    return localHashMap;
  }
  
  public final void bn(boolean paramBoolean)
  {
    this.juU.cht();
    this.lyA.cht();
    this.bannerOnInitListener.cht();
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    if (this.lyw != null)
    {
      Object localObject1 = this.lyw;
      ((e)localObject1).PW();
      x.i("MicroMsg.Music.MusicPlayerManager", "release");
      if (((e)localObject1).lyd != null)
      {
        localObject2 = ((e)localObject1).lyd;
        x.i("MicroMsg.Music.QQMusicPlayer", "release");
        if (((com.tencent.mm.plugin.music.model.e.g)localObject2).lwZ != null)
        {
          ((com.tencent.mm.plugin.music.model.e.g)localObject2).lwZ.release();
          ((com.tencent.mm.plugin.music.model.e.g)localObject2).lwZ = null;
        }
        ((com.tencent.mm.plugin.music.model.e.g)localObject2).bis();
      }
      if (((e)localObject1).lye != null)
      {
        localObject2 = ((e)localObject1).lye;
        x.i("MicroMsg.Music.ExoMusicPlayer", "release");
        ((com.tencent.mm.plugin.music.model.c.a)localObject2).fLN.removeMessages(100);
        ((com.tencent.mm.plugin.music.model.c.a)localObject2).bis();
        if (((com.tencent.mm.plugin.music.model.c.a)localObject2).lyN != null)
        {
          ((com.tencent.mm.plugin.music.model.c.a)localObject2).lyN.b(((com.tencent.mm.plugin.music.model.c.a)localObject2).lyT);
          ((com.tencent.mm.plugin.music.model.c.a)localObject2).lyN.aeE.remove(localObject2);
          ((com.tencent.mm.plugin.music.model.c.a)localObject2).lyN.release();
          ((com.tencent.mm.plugin.music.model.c.a)localObject2).lyN = null;
        }
        if (((com.tencent.mm.plugin.music.model.c.a)localObject2).lyR != null)
        {
          ((com.tencent.mm.plugin.music.model.c.a)localObject2).lyR.kE();
          ((com.tencent.mm.plugin.music.model.c.a)localObject2).lyR = null;
        }
        ((com.tencent.mm.plugin.music.model.c.a)localObject2).lyO = null;
        ((com.tencent.mm.plugin.music.model.c.a)localObject2).lyQ = null;
      }
      ah.M(((e)localObject1).lyk);
      ((e)localObject1).lyb.clear();
      com.tencent.mm.kernel.g.Eh().dpP.b(520, (com.tencent.mm.ab.e)localObject1);
      com.tencent.mm.kernel.g.Eh().dpP.b(940, (com.tencent.mm.ab.e)localObject1);
      com.tencent.mm.kernel.g.Eh().dpP.b(769, (com.tencent.mm.ab.e)localObject1);
      localObject1 = ((e)localObject1).lyf;
      x.i("MicroMsg.Music.MMMusicNotificationHelper", "uninitMusicPlayerService");
      Object localObject2 = new Intent();
      ((Intent)localObject2).setClass(ad.getContext(), MMMusicPlayerService.class);
      ad.getContext().stopService((Intent)localObject2);
      ((com.tencent.mm.plugin.music.model.notification.b)localObject1).lzf = null;
      ((com.tencent.mm.plugin.music.model.notification.b)localObject1).fIu.dead();
    }
    this.lyw = null;
    this.lyv = null;
    this.lyx = null;
    this.daT = null;
    this.lyy = null;
    this.lyz = null;
    com.tencent.mm.sdk.b.a.sFg.c(this.lyA);
    this.lyA.dead();
    this.bannerOnInitListener.dead();
    this.juU.dead();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/music/model/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */