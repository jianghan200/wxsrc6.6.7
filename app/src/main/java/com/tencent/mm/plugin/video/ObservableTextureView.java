package com.tencent.mm.plugin.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView.SurfaceTextureListener;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.MMTextureView;

public class ObservableTextureView
  extends MMTextureView
  implements TextureView.SurfaceTextureListener
{
  protected SurfaceTexture aCZ;
  protected b oEJ;
  private boolean oEK = false;
  
  public ObservableTextureView(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public ObservableTextureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public ObservableTextureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private void init()
  {
    setSurfaceTextureListener(this);
    this.aCZ = getSurfaceTexture();
  }
  
  public boolean isAvailable()
  {
    return this.oEK;
  }
  
  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    x.i("MicroMsg.ObservableTextureView", "onSurfaceTextureAvailable");
    crS();
    this.oEK = true;
    if (this.oEJ != null) {
      this.oEJ.d(paramSurfaceTexture);
    }
  }
  
  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    x.i("MicroMsg.ObservableTextureView", "onSurfaceTextureDestroyed");
    this.oEK = false;
    return false;
  }
  
  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    x.d("MicroMsg.ObservableTextureView", "onSurfaceTextureSizeChanged");
  }
  
  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture) {}
  
  public void setTextureChangeCallback(b paramb)
  {
    this.oEJ = paramb;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/video/ObservableTextureView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */