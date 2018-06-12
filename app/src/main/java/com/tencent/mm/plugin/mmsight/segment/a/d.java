package com.tencent.mm.plugin.mmsight.segment.a;

import android.media.MediaPlayer;
import android.view.Surface;
import com.tencent.mm.compatible.b.j;

public final class d
  implements a
{
  private MediaPlayer epS = new j();
  
  public final void a(a.a parama)
  {
    if (parama == null)
    {
      this.epS.setOnErrorListener(null);
      return;
    }
    this.epS.setOnErrorListener(new d.4(this, parama));
  }
  
  public final void a(a.b paramb)
  {
    if (paramb == null)
    {
      this.epS.setOnPreparedListener(null);
      return;
    }
    this.epS.setOnPreparedListener(new d.1(this, paramb));
  }
  
  public final void a(a.c paramc)
  {
    if (paramc == null)
    {
      this.epS.setOnSeekCompleteListener(null);
      return;
    }
    this.epS.setOnSeekCompleteListener(new d.2(this, paramc));
  }
  
  public final void a(a.d paramd)
  {
    if (paramd == null)
    {
      this.epS.setOnVideoSizeChangedListener(null);
      return;
    }
    this.epS.setOnVideoSizeChangedListener(new d.3(this, paramd));
  }
  
  public final int getCurrentPosition()
  {
    return this.epS.getCurrentPosition();
  }
  
  public final int getDuration()
  {
    return this.epS.getDuration();
  }
  
  public final boolean isPlaying()
  {
    return this.epS.isPlaying();
  }
  
  public final void pause()
  {
    this.epS.pause();
  }
  
  public final void prepareAsync()
  {
    this.epS.prepareAsync();
  }
  
  public final void release()
  {
    this.epS.release();
  }
  
  public final void seekTo(int paramInt)
  {
    this.epS.seekTo(paramInt);
  }
  
  public final void setAudioStreamType(int paramInt)
  {
    this.epS.setAudioStreamType(paramInt);
  }
  
  public final void setDataSource(String paramString)
  {
    this.epS.setDataSource(paramString);
  }
  
  public final void setLoop(int paramInt1, int paramInt2) {}
  
  public final void setLooping(boolean paramBoolean)
  {
    this.epS.setLooping(paramBoolean);
  }
  
  public final void setSurface(Surface paramSurface)
  {
    this.epS.setSurface(paramSurface);
  }
  
  public final void start()
  {
    this.epS.start();
  }
  
  public final void stop()
  {
    this.epS.stop();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/mmsight/segment/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */