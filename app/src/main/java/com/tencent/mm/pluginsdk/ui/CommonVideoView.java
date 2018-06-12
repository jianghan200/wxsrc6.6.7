package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.mm.pluginsdk.ui.tools.VideoTextureView;
import com.tencent.mm.pluginsdk.ui.tools.f;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public class CommonVideoView
  extends AbstractVideoView
{
  protected boolean avH;
  protected int gbj;
  public String url;
  
  public CommonVideoView(Context paramContext)
  {
    super(paramContext);
  }
  
  public CommonVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public CommonVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void SL()
  {
    super.SL();
  }
  
  public void SM()
  {
    super.SM();
    if ((this.hEl != null) && ((this.hEl instanceof VideoTextureView)))
    {
      if (this.qEp) {
        play();
      }
    }
    else {
      return;
    }
    ((VideoTextureView)this.hEl).bdC();
  }
  
  public final boolean ac(float paramFloat)
  {
    boolean bool = false;
    x.i(this.TAG, "%s set play rate [%f]", new Object[] { avy(), Float.valueOf(paramFloat) });
    if ((this.hEl instanceof VideoTextureView))
    {
      bQ(getReportIdkey() + 13);
      bool = ((VideoTextureView)this.hEl).ac(paramFloat);
    }
    return bool;
  }
  
  public final boolean ajG()
  {
    boolean bool = isPrepared();
    int i;
    if (this.hEl != null)
    {
      i = this.hEl.getDuration();
      if (!this.avH) {
        break label92;
      }
      bool = true;
    }
    for (;;)
    {
      x.d(this.TAG, "%s is live video result [%b] isPrepared[%b] durationMs[%d] isLive[%b]", new Object[] { avy(), Boolean.valueOf(bool), Boolean.valueOf(isPrepared()), Integer.valueOf(i), Boolean.valueOf(this.avH) });
      return bool;
      i = 0;
      break;
      label92:
      if ((bool) && (i <= 0)) {
        bool = true;
      } else {
        bool = false;
      }
    }
  }
  
  public f bT(Context paramContext)
  {
    this.qEq = 0;
    return new VideoTextureView(paramContext);
  }
  
  public void c(boolean paramBoolean, String paramString, int paramInt)
  {
    x.i(this.TAG, "%s set video path isLive [%b] url [%s] durationSec [%d]", new Object[] { avy(), Boolean.valueOf(paramBoolean), paramString, Integer.valueOf(paramInt) });
    this.avH = paramBoolean;
    this.url = paramString;
    this.gbj = paramInt;
    Tv(paramString);
  }
  
  public final void ey(int paramInt1, int paramInt2)
  {
    x.d(this.TAG, "%s onInfo [%d %d]", new Object[] { avy(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == 701)
    {
      aoi();
      ccX();
      ccV();
      bQ(getReportIdkey() + 40);
    }
    while (paramInt1 != 702) {
      return;
    }
    aYM();
    ccW();
    ccY();
  }
  
  public int getCacheTimeSec()
  {
    try
    {
      if ((this.hEl instanceof VideoTextureView))
      {
        int i = ((VideoTextureView)this.hEl).getDownloadPercent();
        int j = super.getVideoDurationSec();
        float f = j;
        return (int)(i * 1.0F / 100.0F * f);
      }
    }
    catch (Exception localException)
    {
      x.printErrStackTrace(this.TAG, localException, "%s get cache time sec error", new Object[] { avy() });
    }
    return 0;
  }
  
  public int getReportIdkey()
  {
    return 0;
  }
  
  public int getVideoDurationSec()
  {
    if (this.gbj <= 0) {
      return super.getVideoDurationSec();
    }
    return this.gbj;
  }
  
  public void initView()
  {
    super.initView();
    this.TAG = "MicroMsg.CommonVideoView";
  }
  
  public void setScaleType(h.d paramd)
  {
    if ((this.hEl instanceof VideoTextureView))
    {
      ((VideoTextureView)this.hEl).setScaleType(paramd);
      bQ(getReportIdkey() + 14);
    }
  }
  
  public void start()
  {
    if (this.hEl != null)
    {
      x.i(this.TAG, "%s start path [%s] [%s]", new Object[] { avy(), this.hEl.getVideoPath(), bi.cjd() });
      if (!bi.oW(this.hEl.getVideoPath())) {
        break label93;
      }
      this.hEl.setVideoPath(this.url);
      aoi();
      bCy();
    }
    for (;;)
    {
      bQ(getReportIdkey() + 1);
      return;
      label93:
      play();
    }
  }
  
  public void wd()
  {
    if (ajG())
    {
      x.i(this.TAG, "%s it is live video, do not completion", new Object[] { avy() });
      stop();
      start();
      return;
    }
    super.wd();
  }
  
  public boolean x(int paramInt, boolean paramBoolean)
  {
    if (ajG())
    {
      x.w(this.TAG, "%s it is live, don't seek ", new Object[] { avy() });
      return false;
    }
    return super.x(paramInt, paramBoolean);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/CommonVideoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */