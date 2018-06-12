package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.media.PlaybackParams;
import android.opengl.GLES20;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import com.tencent.mm.compatible.b.j;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.pluginsdk.ui.h.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.MMTextureView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

public class VideoTextureView
  extends MMTextureView
  implements f
{
  private float aex = -1.0F;
  private boolean hEj = false;
  private int hmV = 0;
  private int hmW = 0;
  private boolean kpl = false;
  private int mDuration;
  private Surface mSurface = null;
  private int mVideoHeight = 0;
  private int mVideoWidth = 0;
  private f.a ndD;
  private MediaPlayer ngO = null;
  private long qTB = 0L;
  private boolean qTC = false;
  private f.e qTE;
  private f.c qTF;
  private f.d qTG;
  private boolean qTI = false;
  private boolean qTJ = false;
  TextureView.SurfaceTextureListener qTL = new VideoTextureView.9(this);
  private p qTM = new p();
  private String qTV;
  private boolean qTW;
  private boolean qTX;
  MediaPlayer.OnVideoSizeChangedListener qTY = new VideoTextureView.2(this);
  MediaPlayer.OnPreparedListener qTZ = new VideoTextureView.3(this);
  private MediaPlayer.OnCompletionListener qUa = new VideoTextureView.7(this);
  private MediaPlayer.OnErrorListener qUb = new VideoTextureView.8(this);
  private f.b qUe;
  private long qUf = 0L;
  private int qUg = 0;
  private MediaPlayer.OnSeekCompleteListener qUh = new VideoTextureView.4(this);
  private MediaPlayer.OnBufferingUpdateListener qUi = new VideoTextureView.5(this);
  private MediaPlayer.OnInfoListener qUj = new VideoTextureView.6(this);
  private boolean qUk = false;
  private long startTime = 0L;
  
  public VideoTextureView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public VideoTextureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public VideoTextureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setSurfaceTextureListener(this.qTL);
    setFocusable(true);
    setFocusableInTouchMode(true);
  }
  
  private void aMN()
  {
    if ((bi.oW(this.qTV)) || (this.mSurface == null)) {}
    do
    {
      return;
      cfz();
      x.i("MicroMsg.VideoTextureView", "%d open video %s", new Object[] { Integer.valueOf(hashCode()), this.qTV });
      try
      {
        this.ngO = new j();
        this.ngO.setOnPreparedListener(this.qTZ);
        this.ngO.setOnVideoSizeChangedListener(this.qTY);
        this.qTW = false;
        x.v("MicroMsg.VideoTextureView", "reset duration to -1 in openVideo");
        this.mDuration = -1;
        this.qUg = 0;
        this.ngO.setOnCompletionListener(this.qUa);
        this.ngO.setOnErrorListener(this.qUb);
        this.ngO.setOnSeekCompleteListener(this.qUh);
        this.ngO.setOnBufferingUpdateListener(this.qUi);
        this.ngO.setOnInfoListener(this.qUj);
        this.ngO.setDataSource(this.qTV);
        this.ngO.setSurface(this.mSurface);
        this.ngO.setAudioStreamType(3);
        this.ngO.setScreenOnWhilePlaying(true);
        this.ngO.prepareAsync();
        this.mVideoHeight = this.ngO.getVideoHeight();
        this.mVideoWidth = this.ngO.getVideoWidth();
        setMute(this.hEj);
        ac(this.aex);
        x.i("MicroMsg.VideoTextureView", "%d open video success player[%s] ", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(this.ngO.hashCode()) });
        return;
      }
      catch (Exception localException)
      {
        x.printErrStackTrace("MicroMsg.VideoTextureView", localException, "prepare async error path", new Object[0]);
      }
    } while (this.ndD == null);
    this.ndD.onError(-1, -1);
  }
  
  private boolean az(float paramFloat)
  {
    if (Build.VERSION.SDK_INT >= 23) {}
    try
    {
      if ((this.ngO != null) && (d.fR(23)))
      {
        PlaybackParams localPlaybackParams2 = this.ngO.getPlaybackParams();
        PlaybackParams localPlaybackParams1 = localPlaybackParams2;
        if (localPlaybackParams2 == null) {
          localPlaybackParams1 = new PlaybackParams();
        }
        this.ngO.setPlaybackParams(localPlaybackParams1.setSpeed(paramFloat));
      }
      return true;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.VideoTextureView", localException, "%s handle play rate error", new Object[] { Integer.valueOf(hashCode()) });
    }
    return false;
  }
  
  private void cfz()
  {
    boolean bool1 = true;
    int i = hashCode();
    boolean bool2 = this.qTW;
    if (this.ngO == null) {}
    for (;;)
    {
      x.i("MicroMsg.VideoTextureView", "%d release media player isPrepared[%b] player is null[%b] ", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
      if (this.ngO != null)
      {
        this.ngO.setOnErrorListener(null);
        this.ngO.setOnVideoSizeChangedListener(null);
      }
      try
      {
        this.ngO.stop();
      }
      catch (Exception localException1)
      {
        try
        {
          for (;;)
          {
            this.ngO.reset();
            this.ngO.release();
            this.ngO = null;
            return;
            bool1 = false;
            break;
            localException1 = localException1;
            x.printErrStackTrace("MicroMsg.VideoTextureView", localException1, "stop media player error", new Object[0]);
          }
        }
        catch (Exception localException2)
        {
          for (;;)
          {
            x.printErrStackTrace("MicroMsg.VideoTextureView", localException2, "reset media player error", new Object[0]);
          }
        }
      }
    }
  }
  
  public final boolean ac(float paramFloat)
  {
    if (paramFloat <= 0.0F) {}
    do
    {
      return false;
      this.aex = paramFloat;
    } while (!d.fR(23));
    return az(this.aex);
  }
  
  public final void bdC()
  {
    if ((this.ngO != null) && (this.qTW) && (this.mSurface != null) && (this.mSurface.isValid()))
    {
      x.i("MicroMsg.VideoTextureView", "%d flush surface start time[%d] ", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(getCurrentPosition()) });
      this.qUk = true;
      this.ngO.setVolume(0.0F, 0.0F);
      this.ngO.start();
    }
  }
  
  public final void d(double paramDouble, boolean paramBoolean)
  {
    x(paramDouble);
    this.qTX = paramBoolean;
  }
  
  public int getCurrentPosition()
  {
    if ((this.ngO != null) && (this.qTW)) {
      return this.ngO.getCurrentPosition();
    }
    if (this.ngO == null) {
      return -1;
    }
    return 0;
  }
  
  public int getDownloadPercent()
  {
    return this.qUg;
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
    return this.qTB;
  }
  
  public String getVideoPath()
  {
    return this.qTV;
  }
  
  public final boolean isPlaying()
  {
    if ((this.ngO != null) && (this.qTW) && (!this.qTJ)) {}
    for (boolean bool = this.ngO.isPlaying();; bool = false)
    {
      x.d("MicroMsg.VideoTextureView", "%d is playing result [%b] pauseWhenUpdated[%b] mIsPrepared[%b]", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(bool), Boolean.valueOf(this.qTJ), Boolean.valueOf(this.qTW) });
      return bool;
    }
  }
  
  public final void onDetach() {}
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if ((this.mVideoWidth == 0) || (this.mVideoHeight == 0))
    {
      setMeasuredDimension(1, 1);
      return;
    }
    paramInt1 = getDefaultSize(1, paramInt1);
    paramInt2 = getDefaultSize(1, paramInt2);
    int i = this.mVideoWidth;
    int j = this.mVideoHeight;
    this.qTM.x(paramInt1, paramInt2, i, j);
    setMeasuredDimension(this.qTM.qUm, this.qTM.qUn);
  }
  
  public final void pause()
  {
    if ((this.ngO != null) && (this.qTW) && (this.ngO.isPlaying()))
    {
      x.d("MicroMsg.VideoTextureView", "pause video.");
      this.ngO.pause();
    }
    this.qTX = false;
  }
  
  public final boolean q(Context paramContext, boolean paramBoolean)
  {
    return start();
  }
  
  public void setForceScaleFullScreen(boolean paramBoolean)
  {
    this.qTC = paramBoolean;
    this.qTM.qTC = this.qTC;
  }
  
  public void setLoop(boolean paramBoolean)
  {
    if (this.ngO != null) {
      this.ngO.setLooping(paramBoolean);
    }
    this.kpl = true;
  }
  
  public void setMute(boolean paramBoolean)
  {
    x.i("MicroMsg.VideoTextureView", "%d set mute %b", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(paramBoolean) });
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
    this.ngO.setVolume(1.0F, 1.0F);
  }
  
  public void setOnInfoCallback(f.b paramb)
  {
    this.qUe = paramb;
  }
  
  public void setOnSeekCompleteCallback(f.c paramc)
  {
    this.qTF = paramc;
  }
  
  public void setOnSurfaceCallback(f.d paramd)
  {
    this.qTG = paramd;
  }
  
  public void setOneTimeVideoTextureUpdateCallback(f.e parame)
  {
    this.qTE = parame;
  }
  
  public void setPlayProgressCallback(boolean paramBoolean) {}
  
  public void setScaleType(h.d paramd)
  {
    this.qTM.setScaleType(paramd);
    requestLayout();
  }
  
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
    if (this.mSurface == null)
    {
      x.w("MicroMsg.VideoTextureView", "%d it surface not ready, do not start", new Object[] { Integer.valueOf(hashCode()) });
      this.qTI = true;
      this.qTX = true;
      return false;
    }
    if (this.startTime == 0L) {}
    for (long l = bi.VE();; l = this.startTime)
    {
      this.startTime = l;
      x.i("MicroMsg.VideoTextureView", "start %d mIsPrepared %b pauseWhenUpdated %b", new Object[] { Long.valueOf(this.startTime), Boolean.valueOf(this.qTW), Boolean.valueOf(this.qTJ) });
      if ((this.ngO == null) || (!this.qTW)) {
        break;
      }
      if (this.qTJ)
      {
        this.qTJ = false;
        setMute(this.hEj);
      }
      this.ngO.start();
      this.qTX = true;
      return true;
    }
    if ((this.ngO == null) && (this.qTW))
    {
      this.qTX = true;
      aMN();
      requestLayout();
      return true;
    }
    this.qTX = true;
    return false;
  }
  
  public final void stop()
  {
    long l1;
    long l3;
    if (this.qUf > 0L)
    {
      l1 = this.qUf - this.startTime;
      l3 = bi.VE() - this.startTime;
      if (l1 <= l3) {
        break label512;
      }
    }
    label512:
    for (long l2 = l3;; l2 = l1)
    {
      int j = (int)l2 * 1000;
      int i = j;
      if (j > getDuration()) {
        i = getDuration();
      }
      x.i("MicroMsg.VideoTextureView", "stop : dur:%d stop:%d comp:%d", new Object[] { Integer.valueOf(getDuration()), Long.valueOf(l3), Long.valueOf(l1) });
      if (this.ndD != null) {
        this.ndD.ck(i, getDuration());
      }
      cfz();
      this.qTM.reset();
      try
      {
        if ((this.mSurface != null) && (this.qTW))
        {
          Object localObject1 = getSurfaceTexture();
          if (localObject1 != null)
          {
            x.i("MicroMsg.VideoTextureView", "%d releaseSurface", new Object[] { Integer.valueOf(hashCode()) });
            EGL10 localEGL10 = (EGL10)EGLContext.getEGL();
            EGLDisplay localEGLDisplay = localEGL10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            localEGL10.eglInitialize(localEGLDisplay, null);
            Object localObject2 = new EGLConfig[1];
            int[] arrayOfInt = new int[1];
            localEGL10.eglChooseConfig(localEGLDisplay, new int[] { 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344, 0, 12344 }, (EGLConfig[])localObject2, 1, arrayOfInt);
            arrayOfInt = localObject2[0];
            localObject2 = localEGL10.eglCreateContext(localEGLDisplay, arrayOfInt, EGL10.EGL_NO_CONTEXT, new int[] { 12440, 2, 12344 });
            localObject1 = localEGL10.eglCreateWindowSurface(localEGLDisplay, arrayOfInt, localObject1, new int[] { 12344 });
            localEGL10.eglMakeCurrent(localEGLDisplay, (EGLSurface)localObject1, (EGLSurface)localObject1, (EGLContext)localObject2);
            GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
            GLES20.glClear(16384);
            localEGL10.eglSwapBuffers(localEGLDisplay, (EGLSurface)localObject1);
            localEGL10.eglDestroySurface(localEGLDisplay, (EGLSurface)localObject1);
            localEGL10.eglMakeCurrent(localEGLDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            localEGL10.eglDestroyContext(localEGLDisplay, (EGLContext)localObject2);
            localEGL10.eglTerminate(localEGLDisplay);
          }
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.VideoTextureView", localException, "release surface", new Object[0]);
        }
      }
      this.qTV = "";
      this.qUg = 0;
      this.qTW = false;
      this.qTX = false;
      this.qTB = 0L;
      return;
      l1 = 2147483647L;
      break;
    }
  }
  
  public final void x(double paramDouble)
  {
    if (this.ngO != null)
    {
      this.ngO.seekTo((int)paramDouble);
      this.qTX = true;
      x.d("MicroMsg.VideoTextureView", "seek to time: " + paramDouble + " curr pos : " + this.ngO.getCurrentPosition());
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/tools/VideoTextureView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */