package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.u.b;
import com.tencent.mm.plugin.u.c;
import com.tencent.mm.plugin.u.g;
import com.tencent.mm.plugin.u.i;
import com.tencent.mm.plugin.u.j;
import com.tencent.mm.plugin.u.k;
import com.tencent.mm.pluginsdk.ui.h.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.MMTextureView;

public class VideoPlayerTextureView
  extends MMTextureView
  implements f
{
  public boolean Fd = false;
  private boolean hEj;
  public boolean ldb = false;
  public boolean ldc = false;
  public b ldj;
  public Surface mSurface;
  private int mVideoHeight = 0;
  private int mVideoWidth = 0;
  public f.a ndD;
  public String path;
  private boolean qTA = true;
  private long qTB = 0L;
  private boolean qTC = false;
  public boolean qTD = false;
  private f.e qTE;
  private f.c qTF;
  private f.d qTG;
  public boolean qTH = false;
  protected boolean qTI = false;
  protected boolean qTJ = false;
  public c qTK = new c()
  {
    public final void N(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
    {
      x.i("MicroMsg.VideoPlayerTextureView", "video size changed size[%d, %d] degrees[%d]", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), Integer.valueOf(paramAnonymousInt3) });
      VideoPlayerTextureView.e(VideoPlayerTextureView.this).reset();
      VideoPlayerTextureView.a(VideoPlayerTextureView.this, paramAnonymousInt3);
      VideoPlayerTextureView.b(VideoPlayerTextureView.this, paramAnonymousInt1);
      VideoPlayerTextureView.c(VideoPlayerTextureView.this, paramAnonymousInt2);
      VideoPlayerTextureView.f(VideoPlayerTextureView.this);
      if (VideoPlayerTextureView.this.ndD != null) {
        VideoPlayerTextureView.this.ndD.cl(VideoPlayerTextureView.g(VideoPlayerTextureView.this), VideoPlayerTextureView.h(VideoPlayerTextureView.this));
      }
    }
    
    public final void bdq()
    {
      if (VideoPlayerTextureView.b(VideoPlayerTextureView.this) != null) {
        VideoPlayerTextureView.b(VideoPlayerTextureView.this).bR(VideoPlayerTextureView.c(VideoPlayerTextureView.this));
      }
      if (!VideoPlayerTextureView.c(VideoPlayerTextureView.this))
      {
        x.d("MicroMsg.VideoPlayerTextureView", "player seek done, but don't play now.");
        VideoPlayerTextureView.d(VideoPlayerTextureView.this);
      }
      while (VideoPlayerTextureView.this.qTy == null) {
        return;
      }
      x.d("MicroMsg.VideoPlayerTextureView", "%s player seek done", new Object[] { VideoPlayerTextureView.this.qTy.avA() });
      VideoPlayerTextureView.this.qTy.start();
    }
    
    public final void iy()
    {
      VideoPlayerTextureView.this.Fd = true;
      VideoPlayerTextureView.this.setMute(VideoPlayerTextureView.a(VideoPlayerTextureView.this));
      if (VideoPlayerTextureView.this.ndD != null) {
        VideoPlayerTextureView.this.ndD.iy();
      }
      VideoPlayerTextureView.this.requestLayout();
    }
    
    public final void onError(int paramAnonymousInt1, int paramAnonymousInt2)
    {
      if (VideoPlayerTextureView.this.ndD != null) {
        VideoPlayerTextureView.this.ndD.onError(paramAnonymousInt1, paramAnonymousInt2);
      }
    }
    
    public final void wd()
    {
      if (VideoPlayerTextureView.this.ndD != null) {
        VideoPlayerTextureView.this.ndD.wd();
      }
    }
  };
  private TextureView.SurfaceTextureListener qTL = new TextureView.SurfaceTextureListener()
  {
    public final void onSurfaceTextureAvailable(SurfaceTexture paramAnonymousSurfaceTexture, int paramAnonymousInt1, int paramAnonymousInt2)
    {
      x.i("MicroMsg.VideoPlayerTextureView", "%d surface[%d] available [%d, %d] pauseByDestroyed[%b]", new Object[] { Integer.valueOf(VideoPlayerTextureView.this.hashCode()), Integer.valueOf(paramAnonymousSurfaceTexture.hashCode()), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), Boolean.valueOf(VideoPlayerTextureView.this.qTI) });
      for (;;)
      {
        try
        {
          VideoPlayerTextureView.this.crS();
          VideoPlayerTextureView.this.mSurface = new Surface(paramAnonymousSurfaceTexture);
          if ((VideoPlayerTextureView.this.qTy == null) || (!VideoPlayerTextureView.this.Fd))
          {
            VideoPlayerTextureView.this.aMN();
            VideoPlayerTextureView.f(VideoPlayerTextureView.this);
            if (VideoPlayerTextureView.i(VideoPlayerTextureView.this) == null) {
              break;
            }
            VideoPlayerTextureView.i(VideoPlayerTextureView.this).SP();
            return;
          }
          Object localObject = VideoPlayerTextureView.this.qTy;
          paramAnonymousSurfaceTexture = VideoPlayerTextureView.this.mSurface;
          if (paramAnonymousSurfaceTexture != null)
          {
            localObject = ((i)localObject).ldy;
            x.i("MicroMsg.VideoPlayerImpl", "%s change surface[%d] ", new Object[] { ((j)localObject).ldg.avA(), Integer.valueOf(paramAnonymousSurfaceTexture.hashCode()) });
            localObject = ((j)localObject).ldH;
            x.i("MicroMsg.VideoTrackDataSource", "%s set out put surface", new Object[] { ((k)localObject).avA() });
            ((k)localObject).aeJ = paramAnonymousSurfaceTexture;
            if (d.fR(23)) {
              ((k)localObject).bdD();
            }
          }
          else
          {
            if (!VideoPlayerTextureView.this.qTI) {
              break label298;
            }
            VideoPlayerTextureView.this.qTy.start();
            VideoPlayerTextureView.this.qTI = false;
            continue;
          }
          ((k)localObject).bdE();
        }
        catch (Exception paramAnonymousSurfaceTexture)
        {
          x.printErrStackTrace("MicroMsg.VideoPlayerTextureView", paramAnonymousSurfaceTexture, "onSurfaceTextureAvailable failed", new Object[0]);
          return;
        }
        continue;
        label298:
        VideoPlayerTextureView.this.qTJ = true;
        VideoPlayerTextureView.a(VideoPlayerTextureView.this, 0L);
        VideoPlayerTextureView.this.qTy.setMute(true);
        VideoPlayerTextureView.this.qTy.start();
      }
    }
    
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramAnonymousSurfaceTexture)
    {
      x.i("MicroMsg.VideoPlayerTextureView", "%d surface[%d] destroyed", new Object[] { Integer.valueOf(VideoPlayerTextureView.this.hashCode()), Integer.valueOf(paramAnonymousSurfaceTexture.hashCode()) });
      VideoPlayerTextureView.this.mSurface = null;
      VideoPlayerTextureView.this.qTI = false;
      VideoPlayerTextureView.this.qTJ = false;
      if (VideoPlayerTextureView.this.qTy != null)
      {
        if (VideoPlayerTextureView.this.isPlaying())
        {
          VideoPlayerTextureView.this.qTI = true;
          VideoPlayerTextureView.this.qTy.pause();
        }
        return false;
      }
      VideoPlayerTextureView.this.qTI = false;
      return false;
    }
    
    public final void onSurfaceTextureSizeChanged(SurfaceTexture paramAnonymousSurfaceTexture, int paramAnonymousInt1, int paramAnonymousInt2)
    {
      x.d("MicroMsg.VideoPlayerTextureView", "surface[%d] size changed [%d, %d]", new Object[] { Integer.valueOf(paramAnonymousSurfaceTexture.hashCode()), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
      VideoPlayerTextureView.f(VideoPlayerTextureView.this);
    }
    
    public final void onSurfaceTextureUpdated(SurfaceTexture paramAnonymousSurfaceTexture)
    {
      if ((VideoPlayerTextureView.this.qTJ) && (VideoPlayerTextureView.j(VideoPlayerTextureView.this) > 0L))
      {
        VideoPlayerTextureView.this.qTy.pause();
        VideoPlayerTextureView.this.qTy.setMute(VideoPlayerTextureView.a(VideoPlayerTextureView.this));
        VideoPlayerTextureView.this.qTJ = false;
      }
      if ((VideoPlayerTextureView.j(VideoPlayerTextureView.this) > 0L) && (VideoPlayerTextureView.k(VideoPlayerTextureView.this) != null))
      {
        x.i("MicroMsg.VideoPlayerTextureView", "%d notify surface update", new Object[] { Integer.valueOf(VideoPlayerTextureView.this.hashCode()) });
        VideoPlayerTextureView.k(VideoPlayerTextureView.this).bfs();
        VideoPlayerTextureView.l(VideoPlayerTextureView.this);
      }
      VideoPlayerTextureView.a(VideoPlayerTextureView.this, System.currentTimeMillis());
    }
  };
  private p qTM = new p();
  public i qTy;
  private int qTz = 0;
  
  public VideoPlayerTextureView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public VideoPlayerTextureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public VideoPlayerTextureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setSurfaceTextureListener(this.qTL);
    setFocusable(true);
    setFocusableInTouchMode(true);
  }
  
  public void aMN()
  {
    x.i("MicroMsg.VideoPlayerTextureView", "%d open video [%s]", new Object[] { Integer.valueOf(hashCode()), this.path });
    if (this.qTy != null)
    {
      this.qTy.ldz = null;
      this.qTy.ldy.stop();
      this.qTy.release();
      this.qTy = null;
    }
    if ((bi.oW(this.path)) || (this.mSurface == null)) {
      x.w("MicroMsg.VideoPlayerTextureView", "%d open video but path is null or mSurface is null", new Object[] { Integer.valueOf(hashCode()) });
    }
    do
    {
      do
      {
        return;
        try
        {
          this.Fd = false;
          this.qTy = new i(Looper.getMainLooper());
          this.qTy.setPath(this.path);
          this.qTy.setIOnlineCache(this.ldj);
          this.qTy.setNeedResetExtractor(this.ldb);
          this.qTy.setIsOnlineVideoType(this.ldc);
          this.qTy.ldz = this.qTK;
          this.qTy.setSurface(this.mSurface);
          this.qTy.gr(this.qTH);
          if (this.mSurface == null) {
            break;
          }
          this.qTy.bdz();
          return;
        }
        catch (Exception localException)
        {
          x.printErrStackTrace("MicroMsg.VideoPlayerTextureView", localException, "prepare async error %s", new Object[] { localException.getMessage() });
        }
      } while (this.ndD == null);
      this.ndD.onError(-1, -1);
      return;
    } while (!this.qTD);
    this.qTy.bdz();
  }
  
  public final void bdC()
  {
    if ((this.qTy != null) && (this.Fd) && (this.mSurface != null))
    {
      x.i("MicroMsg.VideoPlayerTextureView", "%d flush surface start ", new Object[] { Integer.valueOf(hashCode()) });
      i locali = this.qTy;
      if (locali.ldy != null) {
        locali.ldy.bdC();
      }
    }
  }
  
  public final boolean cfx()
  {
    if (this.mSurface == null) {}
    while (this.qTJ) {
      return false;
    }
    return true;
  }
  
  public final void d(double paramDouble, boolean paramBoolean)
  {
    this.qTA = paramBoolean;
    x(paramDouble);
  }
  
  public int getCurrentPosition()
  {
    if (this.qTy != null) {
      return this.qTy.bdA();
    }
    return 0;
  }
  
  public int getDuration()
  {
    if (this.qTy != null) {
      return (int)this.qTy.ldy.aqC;
    }
    return 0;
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
    return this.path;
  }
  
  public final boolean isPlaying()
  {
    if (this.qTy != null) {
      return this.qTy.isPlaying();
    }
    return false;
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
    paramInt1 = this.qTM.qUm;
    paramInt2 = this.qTM.qUn;
    if ((this.qTz == 90) || (this.qTz == 270))
    {
      Matrix localMatrix = new Matrix();
      localMatrix.set(getMatrix());
      float f1 = paramInt1 / 2.0F;
      float f2 = paramInt2 / 2.0F;
      float f3 = paramInt2 / paramInt1;
      if ((getScaleX() != 1.0F) || (getScaleY() != 1.0F)) {
        localMatrix.setScale(getScaleX(), getScaleY(), f1, f2);
      }
      localMatrix.postRotate(this.qTz, f1, f2);
      localMatrix.postScale(1.0F / f3, f3, f1, f2);
      setTransform(localMatrix);
    }
    setMeasuredDimension(paramInt1, paramInt2);
  }
  
  public void pause()
  {
    if ((this.qTy != null) && (this.qTy.isPlaying())) {
      this.qTy.pause();
    }
    this.qTI = false;
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
  
  public void setIOnlineCache(b paramb)
  {
    this.ldj = paramb;
  }
  
  public void setIsOnlineVideoType(boolean paramBoolean)
  {
    this.ldc = paramBoolean;
    if (this.qTy != null) {
      this.qTy.setIsOnlineVideoType(paramBoolean);
    }
  }
  
  public void setLoop(boolean paramBoolean) {}
  
  public void setMute(boolean paramBoolean)
  {
    this.hEj = paramBoolean;
    if (this.qTy != null)
    {
      x.i("MicroMsg.VideoPlayerTextureView", "%d set mute [%b]", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(paramBoolean) });
      this.qTy.setMute(paramBoolean);
    }
  }
  
  public void setNeedResetExtractor(boolean paramBoolean)
  {
    this.ldb = paramBoolean;
    if (this.qTy != null) {
      this.qTy.setNeedResetExtractor(paramBoolean);
    }
  }
  
  public void setOnInfoCallback(f.b paramb) {}
  
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
  
  public void setOpenWithNoneSurface(boolean paramBoolean)
  {
    this.qTD = paramBoolean;
  }
  
  public void setPlayProgressCallback(boolean paramBoolean) {}
  
  public void setScaleType(h.d paramd)
  {
    this.qTM.setScaleType(paramd);
    requestLayout();
  }
  
  public void setThumb(Bitmap paramBitmap) {}
  
  public void setUseMp4Extrator(boolean paramBoolean)
  {
    if (this.qTy != null) {
      this.qTH = paramBoolean;
    }
  }
  
  public void setVideoCallback(f.a parama)
  {
    this.ndD = parama;
  }
  
  public void setVideoPath(String paramString)
  {
    x.i("MicroMsg.VideoPlayerTextureView", "%d set video path [%s]", new Object[] { Integer.valueOf(hashCode()), paramString });
    this.path = paramString;
    aMN();
    requestLayout();
  }
  
  public boolean start()
  {
    if ((this.qTy != null) && (this.Fd))
    {
      i = hashCode();
      boolean bool2 = this.qTJ;
      boolean bool3 = this.qTI;
      if (this.mSurface != null) {}
      for (bool1 = true;; bool1 = false)
      {
        x.i("MicroMsg.VideoPlayerTextureView", "%d player start pauseWhenUpdated[%b] pauseByDestroyed[%b] surface[%b]", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool1) });
        if (this.mSurface != null) {
          break;
        }
        this.qTI = true;
        return true;
      }
      if (this.qTJ)
      {
        this.qTI = true;
        this.qTJ = false;
        setMute(this.hEj);
        return true;
      }
      this.qTy.start();
      return true;
    }
    int i = hashCode();
    if (this.qTy == null) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      x.w("MicroMsg.VideoPlayerTextureView", "%d player is null[%b] or it prepared [%b]", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool1), Boolean.valueOf(this.Fd) });
      return false;
    }
  }
  
  public void stop()
  {
    x.i("MicroMsg.VideoPlayerTextureView", "%d player stop [%s]", new Object[] { Integer.valueOf(hashCode()), bi.cjd() });
    if (this.qTy != null)
    {
      this.qTy.ldz = null;
      this.qTy.ldy.stop();
      this.qTy.release();
      this.qTy = null;
    }
    this.qTz = 0;
    this.mVideoHeight = 0;
    this.mVideoWidth = 0;
    this.qTM.reset();
    this.Fd = false;
    this.path = null;
    this.qTB = 0L;
  }
  
  public void x(double paramDouble)
  {
    if (this.qTy != null) {
      this.qTy.sG((int)paramDouble);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/tools/VideoPlayerTextureView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */