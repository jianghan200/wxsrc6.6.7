package com.tencent.mm.plugin.music.model.e;

import android.net.Uri;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.plugin.music.b.a.c.a;
import com.tencent.mm.plugin.music.c.a.b;
import com.tencent.mm.plugin.music.model.c;
import com.tencent.mm.plugin.music.model.f;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import com.tencent.qqmusic.mediaplayer.CommonPlayer;
import com.tencent.qqmusic.mediaplayer.PlayerListenerCallback;
import com.tencent.qqmusic.mediaplayer.network.IMediaHTTPService;
import java.net.URL;
import java.util.ArrayList;

public final class g
  extends a
{
  int aBN = 0;
  AudioFormat.AudioType audioType = AudioFormat.AudioType.UNSUPPORT;
  protected com.tencent.mm.an.a bTF;
  int dGs = 0;
  public CommonPlayer lwZ;
  boolean lxb;
  private IMediaHTTPService lxe;
  String lxf = "";
  private long lxh = 0L;
  private boolean lxi = false;
  private PlayerListenerCallback lxk = new g.1(this);
  private com.tencent.mm.an.d lyL;
  public boolean lyX = false;
  a lzT;
  
  public g()
  {
    bir();
    com.tencent.mm.plugin.music.b.a.a.biz();
  }
  
  private void a(com.tencent.mm.an.a parama, int paramInt)
  {
    IDKey localIDKey1 = new IDKey();
    localIDKey1.SetID(558);
    localIDKey1.SetKey(4);
    localIDKey1.SetValue(1L);
    IDKey localIDKey2 = new IDKey();
    localIDKey2.SetID(558);
    int i = parama.field_musicType;
    x.i("MicroMsg.Music.MusicPlayIdKeyReport", "getQQMusicPlayerErrIdKeyByMusicType, musicType:" + i);
    IDKey localIDKey3;
    IDKey localIDKey4;
    ArrayList localArrayList;
    int k;
    int m;
    label320:
    int j;
    switch (i)
    {
    case 2: 
    case 3: 
    default: 
      i = 9;
      localIDKey2.SetKey(i);
      localIDKey2.SetValue(1L);
      localIDKey3 = new IDKey();
      localIDKey3.SetID(558);
      localIDKey3.SetKey(d.tG(paramInt));
      localIDKey3.SetValue(1L);
      localIDKey4 = new IDKey();
      localIDKey4.SetID(558);
      localIDKey4.SetValue(1L);
      localArrayList = new ArrayList();
      k = 0;
      m = 0;
      if (paramInt == 80)
      {
        i = parama.field_musicType;
        x.i("MicroMsg.Music.MusicPlayIdKeyReport", "getQQMusicPlayerNetworkErrIdKeyByMusicType, musicType:" + i);
        switch (i)
        {
        case 2: 
        case 3: 
        case 5: 
        default: 
          i = 188;
          localIDKey4.SetKey(i);
          localArrayList.add(localIDKey4);
          k = 1;
          i = com.tencent.mm.plugin.music.cache.e.Ip(this.lxf);
          j = com.tencent.mm.plugin.music.cache.e.Iq(this.lxf);
          if (com.tencent.mm.plugin.music.cache.e.Ip(this.lxf) == 403)
          {
            parama = new IDKey();
            parama.SetID(558);
            parama.SetValue(1L);
            parama.SetKey(d.tG(700));
            localArrayList.add(parama);
          }
          break;
        }
      }
      break;
    }
    for (;;)
    {
      com.tencent.mm.plugin.report.service.h.mEJ.h(14777, new Object[] { Integer.valueOf(1), Integer.valueOf(this.bTF.field_musicType), Integer.valueOf(k), Integer.valueOf(paramInt), Integer.valueOf(i), Integer.valueOf(j) });
      localArrayList.add(localIDKey1);
      localArrayList.add(localIDKey2);
      localArrayList.add(localIDKey3);
      com.tencent.mm.plugin.report.service.h.mEJ.b(localArrayList, true);
      return;
      i = 49;
      break;
      i = 50;
      break;
      i = 51;
      break;
      i = 52;
      break;
      i = 53;
      break;
      i = 54;
      break;
      i = 55;
      break;
      i = 56;
      break;
      i = 7;
      break;
      i = 8;
      break;
      i = 167;
      break label320;
      i = 168;
      break label320;
      i = 169;
      break label320;
      i = 170;
      break label320;
      i = 171;
      break label320;
      i = 172;
      break label320;
      i = 173;
      break label320;
      i = 174;
      break label320;
      i = 175;
      break label320;
      if ((com.tencent.mm.plugin.music.cache.e.Il(this.lxf) != null) && (com.tencent.mm.plugin.music.cache.e.Il(this.lxf).contains("text/html")))
      {
        i = 701;
        parama = new IDKey();
        parama.SetID(558);
        parama.SetValue(1L);
        parama.SetKey(d.tG(701));
        localArrayList.add(parama);
        j = 0;
      }
      else
      {
        if (paramInt != 70) {
          switch (paramInt)
          {
          default: 
            i = 0;
            label758:
            IDKey localIDKey5;
            if (i != 0)
            {
              localIDKey5 = new IDKey();
              localIDKey5.SetID(558);
              localIDKey5.SetValue(1L);
              i = parama.field_musicType;
              x.i("MicroMsg.Music.MusicPlayIdKeyReport", "getQQMusicPlayerDecodeErrIdKeyByMusicType, musicType:" + i);
            }
            switch (i)
            {
            case 2: 
            case 3: 
            case 5: 
            default: 
              i = 188;
              label880:
              localIDKey5.SetKey(i);
              localArrayList.add(localIDKey5);
              i = parama.field_musicType;
              x.i("MicroMsg.Music.MusicPlayIdKeyReport", "getQQMusicPlayerPlayErrIdKeyByMusicType, musicType:" + i);
              switch (i)
              {
              case 2: 
              case 3: 
              case 5: 
              default: 
                i = 188;
              }
              break;
            }
            break;
          }
        }
        for (;;)
        {
          localIDKey4.SetKey(i);
          localArrayList.add(localIDKey4);
          j = 0;
          i = m;
          break;
          i = 1;
          break label758;
          i = 202;
          break label880;
          i = 203;
          break label880;
          i = 204;
          break label880;
          i = 205;
          break label880;
          i = 206;
          break label880;
          i = 207;
          break label880;
          i = 208;
          break label880;
          i = 209;
          break label880;
          i = 210;
          break label880;
          i = 178;
          continue;
          i = 179;
          continue;
          i = 180;
          continue;
          i = 181;
          continue;
          i = 182;
          continue;
          i = 183;
          continue;
          i = 184;
          continue;
          i = 185;
          continue;
          i = 186;
        }
      }
    }
  }
  
  private boolean bhC()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (this.lwZ != null)
    {
      bool1 = bool2;
      if (this.lwZ.getPlayerState() == 3) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public final boolean PY()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (this.lwZ != null)
    {
      bool1 = bool2;
      if (this.lwZ.getPlayerState() == 4) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public final boolean PZ()
  {
    return (this.lxb) && (!bhC());
  }
  
  public final void bhB()
  {
    x.i("MicroMsg.Music.QQMusicPlayer", "pauseAndAbandonFocus");
    pause();
    com.tencent.mm.plugin.music.model.h.big().bhO();
  }
  
  public final void bhG()
  {
    com.tencent.mm.an.a locala = com.tencent.mm.plugin.music.model.h.bic().bhR();
    if (locala == null) {}
    int i;
    int j;
    do
    {
      do
      {
        return;
      } while ((!locala.a(this.bTF)) || (this.lwZ == null) || (!PY()));
      i = (int)this.lwZ.getCurrentPosition();
      j = this.lwZ.getDuration();
    } while ((i <= 0) || (j <= 0) || (this.lwX == null));
    this.lwX.co(i, j);
  }
  
  public final void bhn()
  {
    this.lyX = true;
    x.i("MicroMsg.Music.QQMusicPlayer", "passivePause");
    if ((this.lwZ != null) && (PY())) {}
    try
    {
      this.lwZ.pause();
      return;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.Music.QQMusicPlayer", localException, "passivePause", new Object[0]);
      a(this.bTF.PV(), 503);
      a(this.bTF, 503);
    }
  }
  
  public final boolean bho()
  {
    return (this.lxb) && (this.lyX);
  }
  
  public final boolean bhp()
  {
    return true;
  }
  
  public final com.tencent.mm.an.d bhq()
  {
    int n = 0;
    int m = 0;
    int i1 = getDuration();
    int k;
    boolean bool;
    if (this.lwZ != null)
    {
      k = (int)this.lwZ.getCurrentPosition();
      bool = PY();
      if (this.lwZ == null) {
        break label162;
      }
    }
    label162:
    for (int j = this.lwZ.getBufferedPercentage();; j = 0)
    {
      int i;
      if (j >= 0)
      {
        i = j;
        if (j <= 100) {}
      }
      else
      {
        i = 0;
      }
      j = i;
      if (i < 0) {
        j = 0;
      }
      if (this.lyL != null)
      {
        com.tencent.mm.an.d locald = this.lyL;
        i = m;
        if (bool) {
          i = 1;
        }
        locald.j(i1, k, i, j);
      }
      for (;;)
      {
        this.lyL.bTG = true;
        this.lyL.ebh = this.lzq;
        return this.lyL;
        k = -1;
        break;
        i = n;
        if (bool) {
          i = 1;
        }
        this.lyL = new com.tencent.mm.an.d(i1, k, i, j);
      }
    }
  }
  
  public final int getDuration()
  {
    if (this.lwZ != null) {
      return this.lwZ.getDuration();
    }
    return -1;
  }
  
  public final boolean jdMethod_if(int paramInt)
  {
    boolean bool = true;
    int i = getDuration();
    x.i("MicroMsg.Music.QQMusicPlayer", "seekToMusic pos:%d, duration:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
    if ((i < 0) || (paramInt > i))
    {
      x.e("MicroMsg.Music.QQMusicPlayer", "position is invalid, position:%d, duration:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
      stopPlay();
      bool = false;
    }
    while (this.lwZ == null) {
      return bool;
    }
    t(this.bTF.PV());
    this.lwZ.seekTo(paramInt);
    return true;
  }
  
  public final void j(com.tencent.mm.an.a parama)
  {
    long l1 = System.currentTimeMillis();
    long l2 = l1 - this.lxh;
    if ((this.bTF != null) && (this.bTF.a(parama)) && (l2 <= 3000L))
    {
      this.bTF = parama;
      x.e("MicroMsg.Music.QQMusicPlayer", "startPlay, is playing for music src:%s, don't play again in 3 second, interval:%d", new Object[] { this.lxf, Long.valueOf(l2) });
      return;
    }
    if (parama == null)
    {
      x.e("MicroMsg.Music.QQMusicPlayer", "music is null");
      return;
    }
    f.a(parama, false);
    this.lxh = l1;
    this.bTF = parama;
    x.i("MicroMsg.Music.QQMusicPlayer", "startPlay, currentTime:%d, startTime:%d", new Object[] { Long.valueOf(l1), Integer.valueOf(parama.field_startTime) });
    if ((this.lwZ != null) && (PY())) {
      this.lwZ.stop();
    }
    this.aBN = 0;
    this.dGs = parama.field_startTime;
    this.audioType = null;
    this.lxi = false;
    x.i("MicroMsg.Music.QQMusicPlayer", "initPlayer");
    this.lxf = this.bTF.playUrl;
    x.i("MicroMsg.Music.QQMusicPlayer", "mSrc:%s", new Object[] { this.lxf });
    x.i("MicroMsg.Music.QQMusicPlayer", "field_songWifiUrl:%s", new Object[] { this.bTF.field_songWifiUrl });
    if (this.lxf != null)
    {
      com.tencent.mm.plugin.music.cache.e.Ii(this.lxf);
      com.tencent.mm.plugin.music.cache.e.bL(this.lxf, 0);
      com.tencent.mm.plugin.music.cache.e.bM(this.lxf, 0);
    }
    try
    {
      parama = new URL(this.lxf);
      if (parama == null)
      {
        x.e("MicroMsg.Music.QQMusicPlayer", "initPlayer url is null");
        a(this.bTF.PV(), 500);
        a(this.bTF, 500);
        return;
      }
    }
    catch (Exception parama)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.Music.QQMusicPlayer", parama, "initPlayer", new Object[0]);
        x.e("MicroMsg.Music.QQMusicPlayer", "new URL exception:" + parama.getMessage());
        parama = null;
      }
      if (this.lwZ == null) {
        this.lwZ = new CommonPlayer(this.lxk);
      }
      this.lwZ.reset();
      if (this.lxe == null) {
        this.lxe = new b();
      }
      try
      {
        this.lwZ.setDataSource(this.lxe, Uri.parse(parama.toString()));
        this.lwZ.prepare();
        return;
      }
      catch (Exception parama)
      {
        x.e("MicroMsg.Music.QQMusicPlayer", "initPlayer exception:" + parama.getMessage());
        x.printErrStackTrace("MicroMsg.Music.QQMusicPlayer", parama, "initPlayer", new Object[0]);
        a(this.bTF.PV(), 501);
        a(this.bTF, 501);
      }
    }
  }
  
  public final void pause()
  {
    this.lyX = false;
    x.i("MicroMsg.Music.QQMusicPlayer", "pause");
    if ((this.lwZ != null) && (PY())) {}
    try
    {
      this.lwZ.pause();
      return;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.Music.QQMusicPlayer", localException, "pause", new Object[0]);
      a(this.bTF.PV(), 503);
      a(this.bTF, 503);
    }
  }
  
  public final void resume()
  {
    this.aBN = 0;
    boolean bool1 = bhC();
    boolean bool2 = PY();
    x.i("MicroMsg.Music.QQMusicPlayer", "resume, isPreparing:%b, isPlayingMusic:%b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
    if ((this.lwZ == null) || (bool1) || (bool2) || (com.tencent.mm.plugin.music.model.h.big().requestFocus())) {}
    for (;;)
    {
      try
      {
        this.lwZ.start();
        p(com.tencent.mm.plugin.music.model.h.bic().bhS());
        this.lxb = true;
        return;
      }
      catch (Exception localException)
      {
        x.printErrStackTrace("MicroMsg.Music.QQMusicPlayer", localException, "resume", new Object[0]);
        a(this.bTF.PV(), 502);
        a(this.bTF, 502);
        continue;
      }
      x.e("MicroMsg.Music.QQMusicPlayer", "request focus error");
    }
  }
  
  public final void stopPlay()
  {
    x.i("MicroMsg.Music.QQMusicPlayer", "stopPlay");
    try
    {
      if (this.lwZ != null) {
        this.lwZ.stop();
      }
      if (this.lzT != null)
      {
        this.lzT.isStop = true;
        this.lzT = null;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.Music.QQMusicPlayer", localException, "stopPlay", new Object[0]);
        a(this.bTF.PV(), 504);
        a(this.bTF, 504);
      }
    }
    com.tencent.mm.plugin.music.model.h.big().bhO();
    this.lxb = false;
    this.lyX = false;
  }
  
  private final class a
    implements Runnable
  {
    boolean isStop = true;
    
    private a() {}
    
    public final void run()
    {
      x.i("MicroMsg.Music.QQMusicPlayer", "start run play progress task");
      for (;;)
      {
        if (!this.isStop) {
          try
          {
            if ((g.this.lwZ != null) && (g.this.PY())) {
              g.this.bhG();
            }
            try
            {
              Thread.sleep(200L);
            }
            catch (InterruptedException localInterruptedException) {}
          }
          catch (Exception localException)
          {
            for (;;)
            {
              x.e("MicroMsg.Music.QQMusicPlayer", "PlayProgressTask run exception:" + localException.getMessage());
            }
          }
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/music/model/e/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */