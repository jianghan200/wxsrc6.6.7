package com.tencent.mm.plugin.voip.video;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.MMTextureView;

public final class e
  implements TextureView.SurfaceTextureListener
{
  int mWidth = 320;
  private final String oTK = "DecodeTextureView";
  public MMTextureView oTL;
  public SurfaceTexture oTM;
  int oTN = 240;
  
  public e()
  {
    x.d("DecodeTextureView", "steve:  new DecodeTextureView instance");
  }
  
  public final void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    x.d("DecodeTextureView", "onSurfaceTextureAvailable size=" + paramInt1 + "x" + paramInt2 + ", st=" + paramSurfaceTexture);
    if (this.oTM == null)
    {
      this.oTM = paramSurfaceTexture;
      com.tencent.mm.plugin.voip.model.v2protocal.oPW = new Surface(paramSurfaceTexture);
      x.i("DecodeTextureView", "steve: pass decoder surface successfully!");
    }
  }
  
  public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    x.d("DecodeTextureView", "onSurfaceTextureDestroyed st=" + paramSurfaceTexture);
    return this.oTM == null;
  }
  
  public final void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    x.d("DecodeTextureView", "onSurfaceTextureSizeChanged size=" + paramInt1 + "x" + paramInt2 + ", st=" + paramSurfaceTexture);
  }
  
  public final void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/voip/video/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */