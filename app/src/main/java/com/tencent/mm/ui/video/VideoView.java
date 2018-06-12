package com.tencent.mm.ui.video;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.mm.compatible.b.j;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;

public class VideoView
  extends SurfaceView
{
  private MediaPlayer.OnCompletionListener epg;
  private MediaPlayer.OnErrorListener eph;
  private Context mContext;
  private int mDuration;
  private int mVideoHeight;
  private int mVideoWidth;
  public MediaPlayer ngO = null;
  private SurfaceHolder ouT = null;
  private String qTV;
  public boolean qTW;
  public boolean qTX;
  MediaPlayer.OnVideoSizeChangedListener qTY = new VideoView.1(this);
  MediaPlayer.OnPreparedListener qTZ = new VideoView.2(this);
  private MediaPlayer.OnCompletionListener qUa = new VideoView.3(this);
  private MediaPlayer.OnErrorListener qUb = new VideoView.4(this);
  SurfaceHolder.Callback qUc = new SurfaceHolder.Callback()
  {
    public final void surfaceChanged(SurfaceHolder paramAnonymousSurfaceHolder, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
    {
      VideoView.d(VideoView.this, paramAnonymousInt2);
      VideoView.e(VideoView.this, paramAnonymousInt3);
      if ((VideoView.e(VideoView.this) != null) && (VideoView.n(VideoView.this)) && (VideoView.a(VideoView.this) == paramAnonymousInt2) && (VideoView.b(VideoView.this) == paramAnonymousInt3))
      {
        if (VideoView.j(VideoView.this) != 0)
        {
          VideoView.e(VideoView.this).seekTo(VideoView.j(VideoView.this));
          VideoView.k(VideoView.this);
        }
        VideoView.e(VideoView.this).start();
      }
    }
    
    public final void surfaceCreated(SurfaceHolder paramAnonymousSurfaceHolder)
    {
      VideoView.a(VideoView.this, paramAnonymousSurfaceHolder);
      VideoView.o(VideoView.this);
    }
    
    public final void surfaceDestroyed(SurfaceHolder paramAnonymousSurfaceHolder)
    {
      VideoView.a(VideoView.this, null);
      if (VideoView.e(VideoView.this) != null)
      {
        VideoView.e(VideoView.this).reset();
        VideoView.e(VideoView.this).release();
        VideoView.p(VideoView.this);
      }
    }
  };
  private int uFs;
  private int uFt;
  private MediaPlayer.OnPreparedListener uFu;
  private int uFv;
  private int uFw;
  private a uFx;
  private MediaPlayer.OnBufferingUpdateListener uFy = new MediaPlayer.OnBufferingUpdateListener()
  {
    public final void onBufferingUpdate(MediaPlayer paramAnonymousMediaPlayer, int paramAnonymousInt)
    {
      VideoView.c(VideoView.this, paramAnonymousInt);
    }
  };
  
  public VideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    this.mContext = paramContext;
    cAr();
  }
  
  public VideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
    cAr();
  }
  
  private void aMN()
  {
    if ((this.qTV == null) || (this.ouT == null)) {
      return;
    }
    Intent localIntent = new Intent("com.android.music.musicservicecommand");
    localIntent.putExtra("command", "pause");
    this.mContext.sendBroadcast(localIntent);
    if (this.ngO != null)
    {
      this.ngO.reset();
      this.ngO.release();
      this.ngO = null;
    }
    try
    {
      this.ngO = new j();
      this.ngO.setOnPreparedListener(this.qTZ);
      this.ngO.setOnVideoSizeChangedListener(this.qTY);
      this.qTW = false;
      x.v("MicroMsg.VideoView", "reset duration to -1 in openVideo");
      this.mDuration = -1;
      this.ngO.setOnCompletionListener(this.qUa);
      this.ngO.setOnErrorListener(this.qUb);
      this.ngO.setOnBufferingUpdateListener(this.uFy);
      this.uFv = 0;
      this.ngO.setDataSource(this.qTV);
      this.ngO.setDisplay(this.ouT);
      this.ngO.setAudioStreamType(3);
      this.ngO.setScreenOnWhilePlaying(true);
      this.ngO.prepareAsync();
      this.mVideoHeight = this.ngO.getVideoHeight();
      this.mVideoWidth = this.ngO.getVideoWidth();
      return;
    }
    catch (IOException localIOException) {}catch (IllegalArgumentException localIllegalArgumentException) {}
  }
  
  private void cAr()
  {
    this.mVideoWidth = 0;
    this.mVideoHeight = 0;
    getHolder().addCallback(this.qUc);
    getHolder().setType(3);
    setFocusable(true);
    setFocusableInTouchMode(true);
    requestFocus();
  }
  
  public final void cAq()
  {
    if ((this.mVideoHeight == 0) || (this.mVideoWidth == 0)) {
      return;
    }
    int k = this.mVideoWidth;
    int m = this.mVideoHeight;
    x.v("MicroMsg.VideoView", "video size before:" + k + "   " + m);
    x.v("MicroMsg.VideoView", "layout size before:" + getWidth() + "   " + getHeight());
    int i = getWidth();
    int j = getHeight();
    if (i <= 0) {
      i = k;
    }
    for (;;)
    {
      if (j <= 0) {
        j = m;
      }
      for (;;)
      {
        float f1 = i * 1.0F / k;
        float f2 = j * 1.0F / m;
        RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)getLayoutParams();
        if (f1 > f2) {
          localLayoutParams.width = ((int)(k * f2));
        }
        for (localLayoutParams.height = j;; localLayoutParams.height = ((int)(m * f1)))
        {
          localLayoutParams.addRule(13);
          setLayoutParams(localLayoutParams);
          invalidate();
          x.v("MicroMsg.VideoView", "video size after:" + this.ngO.getVideoWidth() + "   " + this.ngO.getVideoHeight());
          x.v("MicroMsg.VideoView", "layout size after:" + localLayoutParams.width + "   " + localLayoutParams.height);
          return;
          localLayoutParams.width = i;
        }
      }
    }
  }
  
  public int getAudioSessionId()
  {
    return 0;
  }
  
  public int getBufferPercentage()
  {
    if (this.ngO != null) {
      return this.uFv;
    }
    return 0;
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
  
  public int getVideoHeight()
  {
    return this.mVideoHeight;
  }
  
  public int getVideoTimeLeft()
  {
    if (this.ngO == null) {
      return 0;
    }
    return this.ngO.getDuration() - this.ngO.getCurrentPosition();
  }
  
  public String getVideoURI()
  {
    return this.qTV;
  }
  
  public int getVideoWidth()
  {
    return this.mVideoWidth;
  }
  
  public final boolean isPlaying()
  {
    if ((this.ngO != null) && (this.qTW)) {
      return this.ngO.isPlaying();
    }
    return false;
  }
  
  public void setLooping(boolean paramBoolean)
  {
    if (this.ngO != null) {
      this.ngO.setLooping(paramBoolean);
    }
  }
  
  public void setOnCompletionListener(MediaPlayer.OnCompletionListener paramOnCompletionListener)
  {
    this.epg = paramOnCompletionListener;
  }
  
  public void setOnErrorListener(MediaPlayer.OnErrorListener paramOnErrorListener)
  {
    this.eph = paramOnErrorListener;
  }
  
  public void setOnPreparedListener(MediaPlayer.OnPreparedListener paramOnPreparedListener)
  {
    this.uFu = paramOnPreparedListener;
  }
  
  public void setVideoURI(String paramString)
  {
    this.qTV = paramString;
    this.qTX = false;
    this.uFw = 0;
    aMN();
    requestLayout();
    invalidate();
  }
  
  public void setVideoViewIm(a parama)
  {
    this.uFx = parama;
  }
  
  public final void stopPlayback()
  {
    if (this.ngO != null)
    {
      this.ngO.stop();
      this.ngO.release();
      this.ngO = null;
    }
  }
  
  public static abstract interface a {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/video/VideoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */