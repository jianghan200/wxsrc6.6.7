package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

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
import com.tencent.mm.plugin.sight.decode.a.b;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.pluginsdk.ui.tools.f;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.pluginsdk.ui.tools.f.b;
import com.tencent.mm.pluginsdk.ui.tools.f.c;
import com.tencent.mm.pluginsdk.ui.tools.f.d;
import com.tencent.mm.pluginsdk.ui.tools.f.e;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.h;
import java.io.File;

public class AdlandingVideoSightView
  extends AdlandingSightPlayImageView
  implements f
{
  protected int duration = 0;
  private boolean hEj = false;
  private boolean nGM;
  private boolean nGN = true;
  protected String nck;
  
  public AdlandingVideoSightView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public AdlandingVideoSightView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private void init()
  {
    if (bi.aG(q.deW.den, "").equals("other")) {
      x.i("MicroMsg.VideoSightView", "init::use other player");
    }
    for (;;)
    {
      setOnCompletionListener(new AdlandingVideoSightView.1(this));
      return;
      hK(true);
    }
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
      a locala = getController();
      if (locala.ncM != -1.0D) {
        return locala.ncM;
      }
      return locala.ncJ;
    }
    return 0.0D;
  }
  
  public long getLastSurfaceUpdateTime()
  {
    return 0L;
  }
  
  public final boolean isPlaying()
  {
    return this.nGJ.bvH();
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
    com.tencent.mm.sdk.b.a.sFg.c(this.nGJ.bvK());
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
  
  public final void pause()
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
      paramContext.startActivity(Intent.createChooser(localIntent, paramContext.getString(i.j.favorite_video)));
      this.nGM = true;
      return false;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.e("MicroMsg.VideoSightView", "startActivity fail, activity not found");
        h.bA(paramContext, paramContext.getResources().getString(i.j.video_file_play_faile));
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
      setOnDecodeDurationListener(new AdlandingVideoSightView.2(this));
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
  
  public final boolean start()
  {
    return q(getContext(), false);
  }
  
  public final void stop()
  {
    this.nGJ.clear();
  }
  
  public final void x(double paramDouble)
  {
    if (this.nGJ != null)
    {
      a locala = this.nGJ;
      x.v("MicroMsg.SightPlayController", "seekToFrame now %f %s", new Object[] { Double.valueOf(paramDouble), bi.cjd().toString() });
      o.d(new a.2(locala, paramDouble), 0L);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/AdlandingVideoSightView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */