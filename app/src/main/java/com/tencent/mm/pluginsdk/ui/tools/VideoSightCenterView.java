package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.util.AttributeSet;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.mm.compatible.e.k;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.plugin.sight.decode.a.b;
import com.tencent.mm.plugin.sight.decode.a.b.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public class VideoSightCenterView
  extends VideoSightView
{
  private boolean bTv = false;
  private int nEn = 0;
  private volatile boolean qTO = false;
  private MediaMetadataRetriever qTP;
  
  public VideoSightCenterView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public VideoSightCenterView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private void cfy()
  {
    if ((getLayoutParams() instanceof RelativeLayout.LayoutParams))
    {
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)getLayoutParams();
      localLayoutParams.addRule(13);
      setLayoutParams(localLayoutParams);
    }
  }
  
  public final void dt(int paramInt1, int paramInt2)
  {
    super.dt(paramInt1, paramInt2);
    cfy();
  }
  
  public int getCurrentPosition()
  {
    x.v("MicroMsg.VideoSightCenterView", "getCurrentPosition: %s", new Object[] { Integer.valueOf(this.nEn) });
    return this.nEn;
  }
  
  public int getDuration()
  {
    x.i("MicroMsg.VideoSightCenterView", "getDuration");
    if (!bi.oW(this.nck)) {
      try
      {
        if (this.qTP == null)
        {
          this.qTP = new MediaMetadataRetriever();
          this.qTP.setDataSource(this.nck);
        }
        int i = Integer.valueOf(this.qTP.extractMetadata(9)).intValue();
        x.i("MicroMsg.VideoSightCenterView", "getDuration: %s", new Object[] { Integer.valueOf(i) });
        return i;
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.VideoSightCenterView", "getDuration error: %s", new Object[] { localException.getMessage() });
      }
    }
    return super.getDuration();
  }
  
  public double getLastProgresstime()
  {
    return super.getLastProgresstime();
  }
  
  protected final void init()
  {
    if (bi.aG(q.deW.den, "").equals("other")) {
      x.i("MicroMsg.VideoSightCenterView", "init::use other player");
    }
    for (;;)
    {
      setOnCompletionListener(new b.e()
      {
        public final void d(b paramAnonymousb, int paramAnonymousInt)
        {
          if (-1 == paramAnonymousInt)
          {
            x.i("MicroMsg.VideoSightCenterView", "error stop, isCompletion: %s", new Object[] { Boolean.valueOf(VideoSightCenterView.a(VideoSightCenterView.this)) });
            if ((VideoSightCenterView.this.ndD != null) && (!VideoSightCenterView.a(VideoSightCenterView.this))) {
              VideoSightCenterView.this.ndD.onError(0, 0);
            }
          }
          do
          {
            do
            {
              return;
            } while (paramAnonymousInt != 0);
            x.i("MicroMsg.VideoSightCenterView", "normal stop");
            VideoSightCenterView.b(VideoSightCenterView.this);
          } while (VideoSightCenterView.this.ndD == null);
          VideoSightCenterView.this.ndD.wd();
        }
      });
      return;
      hK(true);
    }
  }
  
  public final boolean isPlaying()
  {
    x.v("MicroMsg.VideoSightCenterView", "isPlaying, isStart: %s, currentPosition: %s", new Object[] { Boolean.valueOf(this.bTv), Integer.valueOf(this.nEn) });
    return this.bTv;
  }
  
  public final void pause()
  {
    x.v("MicroMsg.VideoSightCenterView", "pause");
    super.pause();
  }
  
  public void setDrawableWidth(int paramInt)
  {
    super.setDrawableWidth(paramInt);
    cfy();
  }
  
  public void setPlayProgressCallback(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      setOnDecodeDurationListener(new VideoSightCenterView.2(this));
      return;
    }
    setOnDecodeDurationListener(null);
  }
  
  public final boolean start()
  {
    x.v("MicroMsg.VideoSightCenterView", "start");
    this.bTv = true;
    return super.start();
  }
  
  public final void stop()
  {
    x.v("MicroMsg.VideoSightCenterView", "stop");
    super.stop();
    this.nEn = 0;
    this.bTv = false;
  }
  
  public final void x(double paramDouble)
  {
    x.v("MicroMsg.VideoSightCenterView", "seekTo, time: %s, isStart: %s, currentPosition: %s, getLastProgresstime: %s", new Object[] { Double.valueOf(paramDouble), Boolean.valueOf(this.bTv), Integer.valueOf(this.nEn), Double.valueOf(getLastProgresstime()) });
    if ((this.bTv) && (getLastProgresstime() > 0.0D)) {
      super.x(paramDouble / 1000.0D);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/tools/VideoSightCenterView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */