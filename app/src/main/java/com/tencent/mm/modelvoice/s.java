package com.tencent.mm.modelvoice;

import android.content.Context;
import android.media.MediaPlayer;
import com.tencent.mm.compatible.b.j;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.util.b.a;
import com.tencent.mm.sdk.platformtools.ar;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class s
  implements d
{
  MediaPlayer epS = new j();
  com.tencent.mm.compatible.util.b epT;
  d.a epk = null;
  d.b epl = null;
  String fileName = "";
  int status = 0;
  
  public s()
  {
    TP();
    TQ();
    x.d("MicroMsg.VoicePlayer", "VoicePlayer");
  }
  
  public s(Context paramContext)
  {
    this();
    this.epT = new com.tencent.mm.compatible.util.b(paramContext);
    x.d("MicroMsg.VoicePlayer", "VoicePlayer context");
  }
  
  private void TP()
  {
    this.epS.setOnCompletionListener(new s.1(this));
  }
  
  private void TQ()
  {
    this.epS.setOnErrorListener(new s.2(this));
  }
  
  private void c(boolean paramBoolean, int paramInt)
  {
    int j = 3;
    if (!com.tencent.mm.vfs.d.cn(this.fileName)) {
      return;
    }
    int i;
    if (paramBoolean) {
      i = 3;
    }
    label215:
    for (;;)
    {
      try
      {
        x.d("MicroMsg.VoicePlayer", "playImp speakerOn:%s,seekTo:%s,type:%s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt), Integer.valueOf(i) });
        if (!q.deN.dby) {
          break label215;
        }
        q.deN.dump();
        if (q.deN.dbF != 1) {
          break label215;
        }
        i = j;
        if (this.epT != null)
        {
          x.d("MicroMsg.VoicePlayer", "playImp audioFocusHelper.requestFocus");
          this.epT.requestFocus();
        }
        this.epS.setAudioStreamType(i);
        this.epS.setDataSource(this.fileName);
        this.epS.prepare();
        if (paramInt > 0) {
          this.epS.seekTo(paramInt);
        }
        this.epS.start();
        return;
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.VoicePlayer", "playImp : fail, exception = " + localException.getMessage());
        x.e("MicroMsg.VoicePlayer", "exception:%s", new Object[] { bi.i(localException) });
      }
      if (this.epT == null) {
        break;
      }
      this.epT.zY();
      return;
      i = 0;
    }
  }
  
  private boolean d(String paramString, boolean paramBoolean, int paramInt)
  {
    if (this.status != 0)
    {
      x.e("MicroMsg.VoicePlayer", "startPlay error status:" + this.status);
      return false;
    }
    x.i("MicroMsg.VoicePlayer", "startPlay speakerOn:%s,seekTo:%s,", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
    this.fileName = paramString;
    try
    {
      c(paramBoolean, paramInt);
      this.status = 1;
      return true;
    }
    catch (Exception paramString)
    {
      try
      {
        c(true, paramInt);
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.VoicePlayer", "startPlay File[" + this.fileName + "] failed");
        x.e("MicroMsg.VoicePlayer", "exception:%s", new Object[] { bi.i(paramString) });
        this.status = -1;
      }
    }
    return false;
  }
  
  public final boolean M(String paramString, boolean paramBoolean)
  {
    return d(paramString, paramBoolean, 0);
  }
  
  public final void a(d.a parama)
  {
    this.epk = parama;
  }
  
  public final void a(d.b paramb)
  {
    this.epl = paramb;
  }
  
  public final boolean aI(boolean paramBoolean)
  {
    if (this.status != 1) {
      x.e("MicroMsg.VoicePlayer", "pause not STATUS_PLAYING error status:" + this.status);
    }
    for (;;)
    {
      return false;
      try
      {
        x.d("MicroMsg.VoicePlayer", "pause mediaPlayer.pause()");
        this.epS.pause();
        if ((this.epT != null) && (paramBoolean))
        {
          x.d("MicroMsg.VoicePlayer", "pause audioFocusHelper.abandonFocus()");
          this.epT.zY();
        }
        this.status = 2;
        return true;
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.VoicePlayer", "pause File[" + this.fileName + "] ErrMsg[" + localException.getStackTrace() + "]");
        this.status = -1;
        return false;
      }
      finally
      {
        if ((this.epT != null) && (paramBoolean))
        {
          x.d("MicroMsg.VoicePlayer", "pause audioFocusHelper.abandonFocus()");
          this.epT.zY();
        }
      }
    }
  }
  
  public final void aK(boolean paramBoolean)
  {
    x.d("MicroMsg.VoicePlayer", "setSpeakerOn=" + paramBoolean);
    if (this.epS == null) {
      return;
    }
    if (ar.vZ())
    {
      x.v("MicroMsg.VoicePlayer", "setSpeakOn return when calling");
      return;
    }
    int i = this.epS.getCurrentPosition();
    wk();
    this.epS = new j();
    TP();
    TQ();
    d(this.fileName, paramBoolean, i);
  }
  
  public final void b(b.a parama)
  {
    if ((this.epT != null) && (parama != null)) {
      this.epT.a(parama);
    }
  }
  
  public final boolean c(String paramString, boolean paramBoolean, int paramInt)
  {
    return d(paramString, paramBoolean, paramInt);
  }
  
  public final int getStatus()
  {
    return this.status;
  }
  
  public final boolean isPlaying()
  {
    return this.status == 1;
  }
  
  public final boolean vY()
  {
    if (this.status != 2) {
      x.e("MicroMsg.VoicePlayer", "resume not STATUS_PAUSE error status:" + this.status);
    }
    for (;;)
    {
      return false;
      try
      {
        x.d("MicroMsg.VoicePlayer", "resume mediaPlayer.start()");
        this.epS.start();
        if (this.epT != null)
        {
          x.d("MicroMsg.VoicePlayer", "resume audioFocusHelper.requestFocus()");
          this.epT.requestFocus();
        }
        this.status = 1;
        return true;
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.VoicePlayer", "resume File[" + this.fileName + "] ErrMsg[" + localException.getStackTrace() + "]");
        this.status = -1;
        return false;
      }
      finally
      {
        if (this.epT != null)
        {
          x.d("MicroMsg.VoicePlayer", "resume audioFocusHelper.requestFocus()");
          this.epT.requestFocus();
        }
      }
    }
  }
  
  public final double wb()
  {
    if ((this.status != 1) && (this.status != 2)) {
      return 0.0D;
    }
    int i;
    int j;
    try
    {
      i = this.epS.getCurrentPosition();
      j = this.epS.getDuration();
      if (j == 0)
      {
        x.e("MicroMsg.VoicePlayer", "getDuration File[" + this.fileName + "] Failed");
        return 0.0D;
      }
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.VoicePlayer", "getNowProgress File[" + this.fileName + "] ErrMsg[" + localException.getStackTrace() + "]");
      wk();
      return 0.0D;
    }
    return i / j;
  }
  
  public final boolean wk()
  {
    if ((this.status != 1) && (this.status != 2)) {
      x.e("MicroMsg.VoicePlayer", "stop not STATUS_PLAYING or STATUS_PAUSE error status:" + this.status);
    }
    for (;;)
    {
      return false;
      try
      {
        x.d("MicroMsg.VoicePlayer", "stop mediaPlayer.stop()");
        this.epS.stop();
        this.epS.release();
        if (this.epT != null)
        {
          x.d("MicroMsg.VoicePlayer", "stop audioFocusHelper.abandonFocus()");
          this.epT.zY();
        }
        this.status = 0;
        return true;
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.VoicePlayer", "stop File[" + this.fileName + "] ErrMsg[" + localException.getStackTrace() + "]");
        this.status = -1;
        return false;
      }
      finally
      {
        if (this.epT != null)
        {
          x.d("MicroMsg.VoicePlayer", "stop audioFocusHelper.abandonFocus()");
          this.epT.zY();
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/modelvoice/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */