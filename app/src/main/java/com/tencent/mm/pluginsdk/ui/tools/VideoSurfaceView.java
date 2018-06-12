package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import com.tencent.mm.compatible.b.j;
import com.tencent.mm.sdk.platformtools.x;

public class VideoSurfaceView
  extends SurfaceView
  implements f
{
  private boolean hEj = false;
  private int mDuration;
  private int mVideoHeight = 0;
  private int mVideoWidth = 0;
  private f.a ndD;
  private MediaPlayer ngO = null;
  private SurfaceHolder ouT = null;
  private String qTV;
  private boolean qTW;
  private boolean qTX;
  MediaPlayer.OnVideoSizeChangedListener qTY = new VideoSurfaceView.1(this);
  MediaPlayer.OnPreparedListener qTZ = new VideoSurfaceView.2(this);
  private MediaPlayer.OnCompletionListener qUa = new VideoSurfaceView.3(this);
  private MediaPlayer.OnErrorListener qUb = new MediaPlayer.OnErrorListener()
  {
    public final boolean onError(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt1, int paramAnonymousInt2)
    {
      x.d("MicroMsg.VideoSurfaceView", "Error: " + paramAnonymousInt1 + "," + paramAnonymousInt2);
      if (VideoSurfaceView.e(VideoSurfaceView.this) != null) {
        VideoSurfaceView.e(VideoSurfaceView.this).onError(paramAnonymousInt1, paramAnonymousInt2);
      }
      return true;
    }
  };
  SurfaceHolder.Callback qUc = new VideoSurfaceView.5(this);
  
  public VideoSurfaceView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public VideoSurfaceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public VideoSurfaceView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    getHolder().addCallback(this.qUc);
    getHolder().setType(3);
    setFocusable(true);
    setFocusableInTouchMode(true);
    requestFocus();
  }
  
  private void aMN()
  {
    if ((this.qTV == null) || (this.ouT == null)) {}
    do
    {
      return;
      if (this.ngO != null)
      {
        this.ngO.stop();
        this.ngO.release();
        this.ngO = null;
      }
      try
      {
        this.ngO = new j();
        this.ngO.setOnPreparedListener(this.qTZ);
        this.ngO.setOnVideoSizeChangedListener(this.qTY);
        this.qTW = false;
        x.v("MicroMsg.VideoSurfaceView", "reset duration to -1 in openVideo");
        this.mDuration = -1;
        this.ngO.setOnCompletionListener(this.qUa);
        this.ngO.setOnErrorListener(this.qUb);
        this.ngO.setDataSource(this.qTV);
        this.ngO.setDisplay(this.ouT);
        this.ngO.setAudioStreamType(3);
        this.ngO.setScreenOnWhilePlaying(true);
        this.ngO.prepareAsync();
        this.mVideoHeight = this.ngO.getVideoHeight();
        this.mVideoWidth = this.ngO.getVideoWidth();
        setMute(this.hEj);
        return;
      }
      catch (Exception localException)
      {
        x.printErrStackTrace("MicroMsg.VideoSurfaceView", localException, "prepare async error %s", new Object[] { localException.getMessage() });
      }
    } while (this.ndD == null);
    this.ndD.onError(-1, -1);
  }
  
  public final void d(double paramDouble, boolean paramBoolean)
  {
    x(paramDouble);
  }
  
  public int getCurrentPosition()
  {
    if ((this.ngO != null) && (this.qTW)) {
      return this.ngO.getCurrentPosition();
    }
    return 0;
  }
  
  public int getDuration()
  {
    if ((this.ngO != null) && (this.qTW))
    {
      if (this.mDuration > 0) {
        return this.mDuration;
      }
      this.mDuration = this.ngO.getDuration();
      return this.mDuration;
    }
    this.mDuration = -1;
    return this.mDuration;
  }
  
  public double getLastProgresstime()
  {
    return 0.0D;
  }
  
  public long getLastSurfaceUpdateTime()
  {
    return 0L;
  }
  
  public String getVideoPath()
  {
    return this.qTV;
  }
  
  public final boolean isPlaying()
  {
    if ((this.ngO != null) && (this.qTW)) {
      return this.ngO.isPlaying();
    }
    return false;
  }
  
  public final void onDetach() {}
  
  public final void pause()
  {
    if ((this.ngO != null) && (this.qTW) && (this.ngO.isPlaying())) {
      this.ngO.pause();
    }
    this.qTX = false;
  }
  
  public final boolean q(Context paramContext, boolean paramBoolean)
  {
    return start();
  }
  
  public void setForceScaleFullScreen(boolean paramBoolean) {}
  
  public void setLoop(boolean paramBoolean)
  {
    if (this.ngO != null) {
      this.ngO.setLooping(paramBoolean);
    }
  }
  
  public void setMute(boolean paramBoolean)
  {
    this.hEj = paramBoolean;
    if (this.ngO != null)
    {
      if (this.hEj) {
        this.ngO.setVolume(0.0F, 0.0F);
      }
    }
    else {
      return;
    }
    this.ngO.setVolume(0.5F, 0.5F);
  }
  
  public void setOnInfoCallback(f.b paramb) {}
  
  public void setOnSeekCompleteCallback(f.c paramc) {}
  
  public void setOnSurfaceCallback(f.d paramd) {}
  
  public void setOneTimeVideoTextureUpdateCallback(f.e parame) {}
  
  public void setPlayProgressCallback(boolean paramBoolean) {}
  
  public void setThumb(Bitmap paramBitmap) {}
  
  public void setVideoCallback(f.a parama)
  {
    this.ndD = parama;
  }
  
  public void setVideoPath(String paramString)
  {
    this.qTV = paramString;
    this.qTX = false;
    aMN();
    requestLayout();
  }
  
  public final boolean start()
  {
    if ((this.ngO != null) && (this.qTW))
    {
      this.ngO.start();
      this.qTX = false;
      return true;
    }
    this.qTX = true;
    return true;
  }
  
  public final void stop()
  {
    if (this.ngO != null)
    {
      this.ngO.stop();
      this.ngO.release();
      this.ngO = null;
    }
  }
  
  public final void x(double paramDouble)
  {
    if (this.ngO != null)
    {
      x.d("MicroMsg.VideoSurfaceView", "seek to time: " + paramDouble);
      this.ngO.seekTo((int)paramDouble);
      start();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/tools/VideoSurfaceView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */