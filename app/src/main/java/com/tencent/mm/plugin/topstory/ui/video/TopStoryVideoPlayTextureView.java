package com.tencent.mm.plugin.topstory.ui.video;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import com.tencent.mm.plugin.u.i;
import com.tencent.mm.plugin.u.j;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public class TopStoryVideoPlayTextureView
  extends VideoPlayerTextureView
{
  private Object lock = new Object();
  
  public TopStoryVideoPlayTextureView(Context paramContext)
  {
    super(paramContext);
  }
  
  public TopStoryVideoPlayTextureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public TopStoryVideoPlayTextureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected final void aMN()
  {
    x.i("MicroMsg.TopStory.TopStoryVideoPlayTextureView", "%d open video [%s]", new Object[] { Integer.valueOf(hashCode()), this.path });
    synchronized (this.lock)
    {
      if (this.qTy != null)
      {
        this.qTy.ldz = null;
        this.qTy.ldy.stop();
        this.qTy.release();
        this.qTy = null;
      }
      if (bi.oW(this.path))
      {
        x.w("MicroMsg.TopStory.TopStoryVideoPlayTextureView", "%d open video but path is null.", new Object[] { Integer.valueOf(hashCode()) });
        return;
      }
    }
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
      if (this.mSurface != null) {
        this.qTy.bdz();
      }
      for (;;)
      {
        return;
        localObject2 = finally;
        throw ((Throwable)localObject2);
        if (this.qTD) {
          this.qTy.bdz();
        }
      }
      return;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.TopStory.TopStoryVideoPlayTextureView", localException, "prepare async error %s", new Object[] { localException.getMessage() });
      if (this.ndD != null) {
        this.ndD.onError(-1, -1);
      }
    }
  }
  
  public final void pause()
  {
    synchronized (this.lock)
    {
      super.pause();
      return;
    }
  }
  
  public void setMute(boolean paramBoolean)
  {
    synchronized (this.lock)
    {
      super.setMute(paramBoolean);
      return;
    }
  }
  
  public void setVideoPath(String paramString)
  {
    super.setVideoPath(paramString);
  }
  
  public final boolean start()
  {
    synchronized (this.lock)
    {
      boolean bool = super.start();
      return bool;
    }
  }
  
  public final void stop()
  {
    e.post(new TopStoryVideoPlayTextureView.1(this), "player-stop");
  }
  
  public final void x(double paramDouble)
  {
    synchronized (this.lock)
    {
      super.x(paramDouble);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/topstory/ui/video/TopStoryVideoPlayTextureView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */