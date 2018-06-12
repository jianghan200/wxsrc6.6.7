package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import com.tencent.mm.compatible.e.k;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.plugin.ak.a.h;
import com.tencent.mm.plugin.sight.decode.a.b;
import com.tencent.mm.plugin.sight.decode.a.b.3;
import com.tencent.mm.plugin.sight.decode.a.b.f;
import com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.h;
import java.io.File;

public class VideoSightView
  extends SightPlayImageView
  implements f
{
  protected int duration = 0;
  private boolean hEj = false;
  private boolean nGM;
  private boolean nGN = true;
  protected String nck;
  
  public VideoSightView(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public VideoSightView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public VideoSightView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  public final void d(double paramDouble, boolean paramBoolean)
  {
    x(paramDouble);
  }
  
  public int getCurrentPosition()
  {
    x.v("MicroMsg.VideoSightView", "get current position");
    return 0;
  }
  
  public int getDuration()
  {
    int i = super.getDuration();
    x.v("MicroMsg.VideoSightView", "get duration " + i);
    return i;
  }
  
  public double getLastProgresstime()
  {
    if (getController() != null)
    {
      b localb = getController();
      if (localb.ncM != -1.0D) {
        return localb.ncM;
      }
      return localb.ncJ;
    }
    return 0.0D;
  }
  
  public long getLastSurfaceUpdateTime()
  {
    return 0L;
  }
  
  protected void init()
  {
    if (bi.aG(q.deW.den, "").equals("other")) {
      x.i("MicroMsg.VideoSightView", "init::use other player");
    }
    for (;;)
    {
      setOnCompletionListener(new VideoSightView.1(this));
      return;
      hK(true);
    }
  }
  
  public boolean isPlaying()
  {
    return this.ndx.bvH();
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if (this.nGN) {
      setDrawableWidth(getResources().getDisplayMetrics().widthPixels);
    }
  }
  
  public final void onDetach()
  {
    a.sFg.c(this.ndx.bvK());
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    x.v("MicroMsg.VideoSightView", "ashutest::on layout changed %B, %d %d %d %d %s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Boolean.valueOf(this.ndE) });
    if ((this.ndE) && (paramInt3 - paramInt1 > 0)) {
      setDrawableWidth(paramInt3 - paramInt1);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void pause()
  {
    aO(this.nck, true);
  }
  
  public final boolean q(Context paramContext, boolean paramBoolean)
  {
    boolean bool = false;
    if (this.nck == null) {
      x.e("MicroMsg.VideoSightView", "start::use path is null!");
    }
    do
    {
      return false;
      if ((!bi.aG(q.deW.den, "").equals("other")) && (b.Lp(this.nck))) {
        break;
      }
      x.i("MicroMsg.VideoSightView", "start::use other player, path %s, has called %B", new Object[] { this.nck, Boolean.valueOf(this.nGM) });
    } while ((this.nGM) && (!paramBoolean));
    Intent localIntent = new Intent();
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.setDataAndType(Uri.fromFile(new File(this.nck)), "video/*");
    try
    {
      paramContext.startActivity(Intent.createChooser(localIntent, paramContext.getString(a.h.app_video_for_icon)));
      this.nGM = true;
      return false;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.e("MicroMsg.VideoSightView", "startActivity fail, activity not found");
        h.bA(paramContext, paramContext.getResources().getString(a.h.video_file_play_faile));
      }
    }
    aO(this.nck, false);
    paramBoolean = bool;
    if (!this.hEj) {
      paramBoolean = true;
    }
    hK(paramBoolean);
    return true;
  }
  
  public void setEnableConfigChanged(boolean paramBoolean)
  {
    this.nGN = paramBoolean;
  }
  
  public void setForceScaleFullScreen(boolean paramBoolean) {}
  
  public void setLoop(boolean paramBoolean)
  {
    setLoopImp(paramBoolean);
  }
  
  public void setMute(boolean paramBoolean)
  {
    this.hEj = paramBoolean;
    if (!this.hEj) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      hK(paramBoolean);
      return;
    }
  }
  
  public void setOnInfoCallback(f.b paramb) {}
  
  public void setOnSeekCompleteCallback(f.c paramc) {}
  
  public void setOnSurfaceCallback(f.d paramd) {}
  
  public void setOneTimeVideoTextureUpdateCallback(f.e parame) {}
  
  public void setPlayProgressCallback(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      setOnDecodeDurationListener(new b.f()
      {
        public final void b(b paramAnonymousb, long paramAnonymousLong)
        {
          if (VideoSightView.this.duration == 0) {
            VideoSightView.this.duration = VideoSightView.this.getDuration();
          }
          if (VideoSightView.this.ndD != null)
          {
            x.v("MicroMsg.VideoSightView", "onPlayTime, currentTime: %s, duration: %s", new Object[] { Long.valueOf(paramAnonymousLong), Integer.valueOf(VideoSightView.this.duration) });
            VideoSightView.this.ndD.ck((int)paramAnonymousLong, VideoSightView.this.duration);
          }
        }
      });
      return;
    }
    setOnDecodeDurationListener(null);
  }
  
  public void setThumb(Bitmap paramBitmap)
  {
    F(paramBitmap);
  }
  
  public void setVideoCallback(f.a parama)
  {
    this.ndD = parama;
  }
  
  public void setVideoPath(String paramString)
  {
    if (this.ndD == null) {}
    for (boolean bool = true;; bool = false)
    {
      x.i("MicroMsg.VideoSightView", "set sight path %s, callback null ? %B", new Object[] { paramString, Boolean.valueOf(bool) });
      this.duration = 0;
      this.nck = paramString;
      if (this.ndD != null) {
        this.ndD.iy();
      }
      return;
    }
  }
  
  public boolean start()
  {
    return q(getContext(), false);
  }
  
  public void stop()
  {
    this.ndx.clear();
  }
  
  public void x(double paramDouble)
  {
    if (this.ndx != null)
    {
      b localb = this.ndx;
      x.v("MicroMsg.SightPlayController", "seekToFrame now %f %s", new Object[] { Double.valueOf(paramDouble), bi.cjd().toString() });
      o.d(new b.3(localb, paramDouble), 0L);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/tools/VideoSightView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */