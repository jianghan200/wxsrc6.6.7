package com.tencent.mm.plugin.music.model.e;

import android.text.TextUtils;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.plugin.music.b.a.c.a;
import com.tencent.mm.plugin.music.model.b.a.b;
import com.tencent.mm.protocal.c.avq;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;

public final class e
  extends a
{
  boolean lxb;
  public boolean lyX = false;
  boolean lzA;
  public boolean lzB = false;
  public boolean lzC = false;
  public boolean lzD = false;
  public boolean lzE = false;
  public boolean lzF = false;
  public boolean lzG = false;
  public boolean lzH = false;
  public boolean lzI = false;
  public boolean lzJ = false;
  public int lzK = 0;
  private com.tencent.mm.an.d lzL;
  public a.b lzM = new a.b()
  {
    public final void tE(int paramAnonymousInt)
    {
      if (paramAnonymousInt == 1) {
        if ((e.this.lzz != null) && (!e.this.lxb) && (e.this.lzy != null))
        {
          localObject = com.tencent.mm.plugin.music.d.a.g(e.this.lzz.bTF, e.this.lzz.iXC);
          e.this.lzy.IA((String)localObject);
          localObject = e.this;
          if (!com.tencent.mm.plugin.music.model.h.big().requestFocus()) {
            break label132;
          }
          x.i("MicroMsg.Music.MusicPlayer", "startPlay");
        }
      }
      label132:
      do
      {
        try
        {
          if (((e)localObject).lzy != null) {
            ((e)localObject).lzy.play();
          }
          ((e)localObject).lxb = true;
          ((e)localObject).lzA = false;
          return;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            x.printErrStackTrace("MicroMsg.Music.MusicPlayer", localException, "startPlay", new Object[0]);
          }
        }
        x.e("MicroMsg.Music.MusicPlayer", "request focus error");
        return;
        if ((paramAnonymousInt == -2) || (paramAnonymousInt == 5) || (paramAnonymousInt == 19))
        {
          ah.A(new e.2.1(this, paramAnonymousInt));
          return;
        }
      } while ((paramAnonymousInt != -1) && (paramAnonymousInt != 6) && (paramAnonymousInt != 4));
      ah.A(new e.2.2(this));
      Object localObject = com.tencent.mm.plugin.music.model.h.bic().bhR();
      e.a(e.this, (com.tencent.mm.an.a)localObject, paramAnonymousInt);
    }
  };
  com.tencent.mm.plugin.music.b.a.b lzy;
  public com.tencent.mm.plugin.music.model.b.a lzz;
  
  public e()
  {
    bir();
  }
  
  private int getDownloadPercent()
  {
    if (this.lzz != null)
    {
      com.tencent.mm.plugin.music.model.b.a locala = this.lzz;
      int i;
      if (locala.iXC)
      {
        x.v("MicroMsg.Music.MusicDownloadTask", "WifiFileLength: %d downloadLength: %d", new Object[] { Long.valueOf(locala.bTF.field_songWifiFileLength), Long.valueOf(locala.bTF.field_wifiDownloadedLength) });
        if (locala.bTF.field_songWifiFileLength != 0L) {
          i = (int)(locala.bTF.field_wifiDownloadedLength * 100L / locala.bTF.field_songWifiFileLength);
        }
      }
      while (i > 0)
      {
        return i;
        i = 0;
        continue;
        x.v("MicroMsg.Music.MusicDownloadTask", "fileLength: %d downloadLength: %d", new Object[] { Long.valueOf(locala.bTF.field_songFileLength), Long.valueOf(locala.bTF.field_downloadedLength) });
        if (locala.bTF.field_songFileLength != 0L) {
          i = (int)(locala.bTF.field_downloadedLength * 100L / locala.bTF.field_songFileLength);
        } else {
          i = 0;
        }
      }
      return 0;
    }
    return 0;
  }
  
  private String getMimeType()
  {
    String str1 = "";
    if (this.lzz != null) {
      str1 = this.lzz.mimeType;
    }
    String str2 = str1;
    if (TextUtils.isEmpty(str1))
    {
      com.tencent.mm.an.a locala = com.tencent.mm.plugin.music.model.h.bic().bhR();
      str2 = str1;
      if (locala != null) {
        str2 = locala.field_mimetype;
      }
    }
    return str2;
  }
  
  public final boolean PY()
  {
    boolean bool = false;
    if (this.lzy != null) {}
    try
    {
      bool = this.lzy.isPlaying();
      return bool;
    }
    catch (Throwable localThrowable) {}
    return false;
  }
  
  public final boolean PZ()
  {
    return this.lxb;
  }
  
  public final void b(com.tencent.mm.an.a parama, boolean paramBoolean)
  {
    if (this.lzy == null)
    {
      if ((paramBoolean) || (!com.tencent.mm.compatible.util.d.fT(15))) {
        break label62;
      }
      x.i("MicroMsg.Music.MusicPlayer", "use MMPlayer");
    }
    for (this.lzy = new c();; this.lzy = new b())
    {
      this.lzy.o(parama);
      this.lzy.a(new com.tencent.mm.plugin.music.b.a.e()
      {
        long lzN;
        
        public final void c(com.tencent.mm.an.a paramAnonymousa, boolean paramAnonymousBoolean)
        {
          x.i("MicroMsg.Music.MusicPlayer", "setEvents, onStop");
          com.tencent.mm.an.a locala = com.tencent.mm.plugin.music.model.h.bic().bhR();
          if (locala == null) {}
          do
          {
            return;
            if (locala.a(paramAnonymousa)) {
              e.this.stopPlay();
            }
            paramAnonymousa = paramAnonymousa.PV();
            e.this.r(paramAnonymousa);
          } while (!paramAnonymousBoolean);
          e.this.u(paramAnonymousa);
        }
        
        public final void d(com.tencent.mm.an.a paramAnonymousa, boolean paramAnonymousBoolean)
        {
          com.tencent.mm.an.a locala = com.tencent.mm.plugin.music.model.h.bic().bhR();
          if (locala == null) {
            return;
          }
          x.i("MicroMsg.Music.MusicPlayer", "onError, needRetry:%b", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
          if (paramAnonymousBoolean) {
            e.a(e.this, paramAnonymousa, 20);
          }
          avq localavq;
          for (;;)
          {
            localavq = paramAnonymousa.PV();
            if (!locala.a(paramAnonymousa)) {
              break label169;
            }
            x.i("MicroMsg.Music.MusicPlayer", "stop");
            e.this.stopPlay();
            if (!paramAnonymousBoolean) {
              break;
            }
            x.i("MicroMsg.Music.MusicPlayer", "retry system media player again");
            e.this.b(locala, true);
            e.this.lzz = new com.tencent.mm.plugin.music.model.b.a(locala);
            e.this.lzz.lyI = e.this.lzM;
            e.this.lzz.start();
            return;
            e.a(e.this, paramAnonymousa, 21);
          }
          ah.A(new e.1.1(this));
          e.this.r(localavq);
          return;
          label169:
          x.i("MicroMsg.Music.MusicPlayer", "send stop event");
          e.this.r(localavq);
        }
        
        public final void m(com.tencent.mm.an.a paramAnonymousa)
        {
          x.i("MicroMsg.Music.MusicPlayer", "setEvents, onStart");
          e.this.o(paramAnonymousa.PV());
        }
        
        public final void n(com.tencent.mm.an.a paramAnonymousa)
        {
          com.tencent.mm.an.a locala = com.tencent.mm.plugin.music.model.h.bic().bhR();
          if (locala == null) {}
          int j;
          int k;
          do
          {
            do
            {
              return;
            } while ((!locala.a(paramAnonymousa)) || (e.this.lzy == null) || (!e.this.lzy.isPlaying()));
            j = e.this.lzy.biu();
            k = e.this.lzy.getDuration();
          } while ((j <= 0) || (k <= 0));
          float f2 = j / k;
          float f1;
          label168:
          label225:
          label293:
          int i;
          if (e.this.lzz != null)
          {
            paramAnonymousa = e.this.lzz;
            paramAnonymousa.lyF = f2;
            boolean bool = ao.isNetworkConnected(ad.getContext());
            if ((paramAnonymousa.isStop) && (bool))
            {
              if (!paramAnonymousa.iXC) {
                break label348;
              }
              if (paramAnonymousa.bTF.field_songWifiFileLength != 0L)
              {
                f1 = (float)paramAnonymousa.bTF.field_wifiDownloadedLength / (float)paramAnonymousa.bTF.field_songWifiFileLength;
                if ((f1 < 1.0F) && (f1 - f2 <= 0.15F) && (bool))
                {
                  x.v("MicroMsg.Music.MusicDownloadTask", "playPercent=%.2f downloadPercent=%.2f isConnectNetwork=%b", new Object[] { Float.valueOf(f2), Float.valueOf(f1), Boolean.valueOf(bool) });
                  paramAnonymousa.start();
                }
              }
            }
            if ((e.this.lzz != null) && (e.this.lzz.isStop))
            {
              paramAnonymousa = e.this.lzz;
              if (!paramAnonymousa.iXC) {
                break label381;
              }
              if (paramAnonymousa.bTF.field_songWifiFileLength == 0L) {
                break label429;
              }
              f1 = (float)paramAnonymousa.bTF.field_wifiDownloadedLength / (float)paramAnonymousa.bTF.field_songWifiFileLength;
              if (f1 < 1.0F) {
                break label414;
              }
              i = 1;
            }
          }
          for (;;)
          {
            if (i == 0)
            {
              x.i("MicroMsg.Music.MusicPlayer", "download percent not enough can not play");
              e.this.stopPlay();
            }
            if (e.this.lwX == null) {
              break;
            }
            e.this.lwX.co(j, k);
            return;
            label348:
            if (paramAnonymousa.bTF.field_songFileLength == 0L) {
              break label225;
            }
            f1 = (float)paramAnonymousa.bTF.field_downloadedLength / (float)paramAnonymousa.bTF.field_songFileLength;
            break label168;
            label381:
            if (paramAnonymousa.bTF.field_songFileLength != 0L)
            {
              f1 = (float)paramAnonymousa.bTF.field_downloadedLength / (float)paramAnonymousa.bTF.field_songFileLength;
              break label293;
              label414:
              if (f1 - f2 > 0.05F)
              {
                i = 1;
                continue;
              }
            }
            label429:
            i = 0;
          }
        }
      });
      return;
      label62:
      x.i("MicroMsg.Music.MusicPlayer", "use MMMediaPlayer");
    }
  }
  
  public final void bhB()
  {
    x.i("MicroMsg.Music.MusicPlayer", "pauseAndAbandonFocus");
    pause();
    com.tencent.mm.plugin.music.model.h.big().bhO();
  }
  
  public final void bhn()
  {
    this.lyX = true;
    x.i("MicroMsg.Music.MusicPlayer", "passivePause");
    try
    {
      if ((this.lzy != null) && (this.lzy.isPlaying()))
      {
        this.lzy.pause();
        q(com.tencent.mm.plugin.music.model.h.bic().bhS());
      }
      return;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.Music.MusicPlayer", localException, "passivePause", new Object[0]);
    }
  }
  
  public final boolean bho()
  {
    return (this.lxb) && (this.lyX);
  }
  
  public final boolean bhp()
  {
    return false;
  }
  
  public final com.tencent.mm.an.d bhq()
  {
    int m = getDuration();
    int j;
    int i;
    label30:
    int k;
    if (this.lzy != null)
    {
      j = this.lzy.biu();
      if (!PY()) {
        break label107;
      }
      i = 1;
      x.i("MicroMsg.Music.MusicPlayer", "get music status = %d", new Object[] { Integer.valueOf(i) });
      k = getDownloadPercent();
      if (m <= 0) {
        break label168;
      }
    }
    for (;;)
    {
      if (this.lzL != null) {
        this.lzL.j(m, j, i, k);
      }
      for (;;)
      {
        this.lzL.bTG = false;
        this.lzL.ebh = this.lzq;
        return this.lzL;
        j = -1;
        break;
        label107:
        if ((this.lxb) && ((this.lzA) || (this.lwW))) {}
        for (i = 1;; i = 0)
        {
          if (i == 0) {
            break label144;
          }
          i = 0;
          break;
        }
        label144:
        i = 2;
        break label30;
        this.lzL = new com.tencent.mm.an.d(m, j, i, k);
      }
      label168:
      k = 0;
    }
  }
  
  public final int getDuration()
  {
    if (this.lzy != null) {
      return this.lzy.getDuration();
    }
    return -1;
  }
  
  public final boolean jdMethod_if(int paramInt)
  {
    x.i("MicroMsg.Music.MusicPlayer", "seekToMusic pos:%d", new Object[] { Integer.valueOf(paramInt) });
    try
    {
      int i = getDuration();
      int j = getDownloadPercent();
      if ((i < 0) || (paramInt > i))
      {
        x.e("MicroMsg.Music.MusicPlayer", "duration or position is illegal, stop");
        stopPlay();
        return false;
      }
      int k = (int)(j / 100.0D * i);
      i = paramInt;
      if (j != 100)
      {
        i = paramInt;
        if (paramInt > k)
        {
          i = k - 2000;
          x.i("MicroMsg.Music.MusicPlayer", "on completed seekto, position is %d =", new Object[] { Integer.valueOf(i) });
        }
      }
      if ((this.lzy != null) && (i >= 0))
      {
        this.lzy.seek(i);
        s(com.tencent.mm.plugin.music.model.h.bic().bhS());
        return true;
      }
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.Music.MusicPlayer", localException, "seekTo", new Object[0]);
    }
    return false;
  }
  
  public final void pause()
  {
    this.lyX = false;
    x.i("MicroMsg.Music.MusicPlayer", "pause");
    try
    {
      if ((this.lzy != null) && (this.lzy.isPlaying()))
      {
        this.lzy.pause();
        this.lzA = true;
        q(com.tencent.mm.plugin.music.model.h.bic().bhS());
      }
      return;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.Music.MusicPlayer", localException, "pause", new Object[0]);
    }
  }
  
  public final void resume()
  {
    try
    {
      if ((this.lzy != null) && (!this.lzy.isPlaying()))
      {
        x.i("MicroMsg.Music.MusicPlayer", "resume");
        if (com.tencent.mm.plugin.music.model.h.big().requestFocus())
        {
          this.lzy.play();
          p(com.tencent.mm.plugin.music.model.h.bic().bhS());
          return;
        }
        x.e("MicroMsg.Music.MusicPlayer", "request focus error");
        return;
      }
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.Music.MusicPlayer", localException, "resume", new Object[0]);
      return;
    }
    x.i("MicroMsg.Music.MusicPlayer", "music is playing");
  }
  
  public final void stopPlay()
  {
    x.i("MicroMsg.Music.MusicPlayer", "stopPlay");
    Object localObject2;
    Object localObject1;
    int i;
    if ((this.lzy != null) && ((this.lzy instanceof c)))
    {
      localObject2 = this.lzy.biv();
      localObject1 = localObject2;
      if (TextUtils.isEmpty((CharSequence)localObject2))
      {
        localObject1 = localObject2;
        if (this.lzz != null) {
          localObject1 = getMimeType();
        }
      }
      x.i("MicroMsg.Music.MusicPlayer", "idKeyReportMusicMimeType mineType:%s, hasStatForMimeType:%b", new Object[] { localObject1, Boolean.valueOf(this.lzJ) });
      if ((!TextUtils.isEmpty((CharSequence)localObject1)) && (!this.lzJ))
      {
        x.i("MicroMsg.Music.MusicPlayer", "idKeyReportMusicMimeType OK");
        this.lzJ = true;
        localObject2 = new IDKey();
        ((IDKey)localObject2).SetID(558);
        if (!"audio/3gpp".equalsIgnoreCase((String)localObject1)) {
          break label285;
        }
        i = 70;
      }
    }
    for (;;)
    {
      ((IDKey)localObject2).SetKey(i);
      ((IDKey)localObject2).SetValue(1L);
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(localObject2);
      com.tencent.mm.plugin.report.service.h.mEJ.b(localArrayList, true);
      localObject2 = com.tencent.mm.plugin.music.model.h.bic().bhR();
      if (localObject2 != null)
      {
        i = d.IB((String)localObject1);
        com.tencent.mm.plugin.report.service.h.mEJ.h(14486, new Object[] { Integer.valueOf(0), Integer.valueOf(((com.tencent.mm.an.a)localObject2).field_musicType), Integer.valueOf(i), localObject1 });
      }
      try
      {
        if (this.lzz != null)
        {
          this.lzz.isStop = true;
          this.lzz = null;
        }
        if (this.lzy != null)
        {
          this.lzy.stop();
          this.lzy = null;
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.Music.MusicPlayer", localException, "stopPlay", new Object[0]);
        }
      }
      com.tencent.mm.plugin.music.model.h.big().bhO();
      this.lxb = false;
      this.lyX = false;
      return;
      label285:
      if ("audio/amr-wb".equalsIgnoreCase((String)localObject1)) {
        i = 71;
      } else if (("audio/mpeg".equalsIgnoreCase((String)localObject1)) || (((String)localObject1).equalsIgnoreCase("audio/mp3"))) {
        i = 72;
      } else if (("audio/mp4a-latm".equalsIgnoreCase((String)localObject1)) || (((String)localObject1).startsWith("audio/mp4"))) {
        i = 73;
      } else if ("audio/qcelp".equalsIgnoreCase((String)localObject1)) {
        i = 74;
      } else if ("audio/vorbis".equalsIgnoreCase((String)localObject1)) {
        i = 75;
      } else if ("audio/opus".equalsIgnoreCase((String)localObject1)) {
        i = 76;
      } else if ("audio/g711-alaw".equalsIgnoreCase((String)localObject1)) {
        i = 77;
      } else if ("audio/g711-mlaw".equalsIgnoreCase((String)localObject1)) {
        i = 78;
      } else if ("audio/raw".equalsIgnoreCase((String)localObject1)) {
        i = 79;
      } else if ("audio/flac".equalsIgnoreCase((String)localObject1)) {
        i = 80;
      } else if ("audio/gsm".equalsIgnoreCase((String)localObject1)) {
        i = 81;
      } else if ("audio/ac3".equalsIgnoreCase((String)localObject1)) {
        i = 82;
      } else if ("audio/eac3".equalsIgnoreCase((String)localObject1)) {
        i = 83;
      } else if ("audio/x-ms-wma".equalsIgnoreCase((String)localObject1)) {
        i = 84;
      } else if ("audio/x-wav".equalsIgnoreCase((String)localObject1)) {
        i = 85;
      } else if (("audio/x-ape".equalsIgnoreCase((String)localObject1)) || ("application/x-ape".equalsIgnoreCase((String)localObject1))) {
        i = 86;
      } else {
        i = 87;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/music/model/e/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */