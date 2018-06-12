package com.tencent.mm.plugin.sight.encode.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewGroup.LayoutParams;
import com.tencent.mm.model.au;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;

@TargetApi(14)
public class SightVideoTextureView
  extends SightCameraView
{
  private boolean mMute;
  private String nck;
  private MediaPlayer ngO;
  private TextureView ngP = null;
  private SurfaceTexture ngQ = null;
  private Surface ngR = null;
  private boolean ngS;
  
  public SightVideoTextureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SightVideoTextureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.ngP.setSurfaceTextureListener(new SightVideoTextureView.1(this));
  }
  
  public final void aP(String paramString, boolean paramBoolean)
  {
    x.i("MicroMsg.SightVideoTextureView", "start play video, path %s, mute %B, wantPlay %B", new Object[] { paramString, Boolean.valueOf(paramBoolean), Boolean.valueOf(this.ngS) });
    this.nck = paramString;
    this.mMute = paramBoolean;
    if (this.ngQ == null)
    {
      x.w("MicroMsg.SightVideoTextureView", "play video fail, texture is null");
      this.ngS = true;
      return;
    }
    this.ngS = false;
    au.Em().H(new SightVideoTextureView.2(this, paramString, paramBoolean));
  }
  
  public final void bwy()
  {
    x.i("MicroMsg.SightVideoTextureView", "stop play video, wantPlay %B", new Object[] { Boolean.valueOf(this.ngS) });
    if ((this.ngO == null) && (!this.ngS))
    {
      x.w("MicroMsg.SightVideoTextureView", "mediaplayer is null, do nothing when stop play video");
      return;
    }
    au.Em().H(new SightVideoTextureView.3(this));
  }
  
  protected Surface getPreviewSurface()
  {
    if (this.ngQ != null) {
      return new Surface(this.ngQ);
    }
    return null;
  }
  
  protected int getSurfaceHeight()
  {
    if (this.ngP != null) {
      return this.ngP.getHeight();
    }
    return 0;
  }
  
  protected int getSurfaceWidth()
  {
    if (this.ngP != null) {
      return this.ngP.getWidth();
    }
    return 0;
  }
  
  public final boolean isPlaying()
  {
    try
    {
      if (this.ngO == null) {
        return false;
      }
      boolean bool = this.ngO.isPlaying();
      return bool;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.SightVideoTextureView", localException, "", new Object[0]);
    }
    return false;
  }
  
  public void setFixPreviewRate(float paramFloat)
  {
    ViewGroup.LayoutParams localLayoutParams = this.ngP.getLayoutParams();
    DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
    x.i("MicroMsg.SightVideoTextureView", "setFixPreviewRate [%f], dm[%d, %d]", new Object[] { Float.valueOf(paramFloat), Integer.valueOf(localDisplayMetrics.widthPixels), Integer.valueOf(localDisplayMetrics.heightPixels) });
    localLayoutParams.width = localDisplayMetrics.widthPixels;
    localLayoutParams.height = ((int)(localDisplayMetrics.widthPixels / paramFloat));
    x.i("MicroMsg.SightVideoTextureView", "setFixPreviewRate width:%d, height:%d", new Object[] { Integer.valueOf(localLayoutParams.width), Integer.valueOf(localLayoutParams.height) });
    this.ngP.setLayoutParams(localLayoutParams);
    super.setPreviewRate(paramFloat);
  }
  
  protected void setIsMute(boolean paramBoolean)
  {
    if (this.ngO == null) {}
    for (;;)
    {
      return;
      try
      {
        boolean bool = this.ngO.isPlaying();
        if (bool)
        {
          if (paramBoolean) {
            try
            {
              this.ngO.setVolume(0.0F, 0.0F);
              return;
            }
            catch (Exception localException1)
            {
              x.w("MicroMsg.SightVideoTextureView", "try to set MediaPlayer Volume 0, 0 Fail: %s", new Object[] { localException1.getMessage() });
              return;
            }
          }
          bwA();
        }
      }
      catch (Exception localException2)
      {
        x.w("MicroMsg.SightVideoTextureView", "setIsMute %B, check MediaPlayer playing Fail: %s", new Object[] { Boolean.valueOf(paramBoolean), localException2.getMessage() });
        return;
      }
    }
    try
    {
      this.ngO.setVolume(1.0F, 1.0F);
      return;
    }
    catch (Exception localException3)
    {
      x.w("MicroMsg.SightVideoTextureView", "try to set MediaPlayer Volume 1, 1 Fail: %s", new Object[] { localException3.getMessage() });
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sight/encode/ui/SightVideoTextureView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */