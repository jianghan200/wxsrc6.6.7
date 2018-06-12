package com.tencent.mm.plugin.mmsight.ui.cameraglview;

import com.tencent.mm.plugin.mmsight.model.f;
import com.tencent.mm.sdk.platformtools.x;

public final class a
{
  public f lqP = new a.1(this);
  MMSightCameraGLSurfaceView lqQ;
  
  public a(MMSightCameraGLSurfaceView paramMMSightCameraGLSurfaceView)
  {
    this.lqQ = paramMMSightCameraGLSurfaceView;
  }
  
  public final void Q(int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.lqQ != null) {
      if ((paramInt3 != 0) && (paramInt3 != 180)) {
        break label98;
      }
    }
    label98:
    for (int i = paramInt1;; i = paramInt2)
    {
      if ((paramInt3 == 0) || (paramInt3 == 180)) {
        paramInt1 = paramInt2;
      }
      MMSightCameraGLSurfaceView localMMSightCameraGLSurfaceView = this.lqQ;
      x.i("MicroMsg.MMSightCameraGLSurfaceView", "setFrameInfo, width: %s, height: %s, rotate: %s this: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt1), Integer.valueOf(paramInt3), localMMSightCameraGLSurfaceView });
      localMMSightCameraGLSurfaceView.fau = i;
      localMMSightCameraGLSurfaceView.fav = paramInt1;
      localMMSightCameraGLSurfaceView.faO = paramInt3;
      return;
    }
  }
  
  public final void a(byte[] paramArrayOfByte, boolean paramBoolean, int paramInt)
  {
    if (this.lqQ != null)
    {
      MMSightCameraGLSurfaceView localMMSightCameraGLSurfaceView = this.lqQ;
      if ((paramArrayOfByte != null) && (localMMSightCameraGLSurfaceView.lqS != null) && (!localMMSightCameraGLSurfaceView.lqS.bum))
      {
        localMMSightCameraGLSurfaceView.lqS.b(paramArrayOfByte, localMMSightCameraGLSurfaceView.fau, localMMSightCameraGLSurfaceView.fav, paramInt, paramBoolean);
        localMMSightCameraGLSurfaceView.requestRender();
      }
    }
    else
    {
      return;
    }
    x.v("MicroMsg.MMSightCameraGLSurfaceView", "passing draw");
  }
  
  public final void bfu()
  {
    if (this.lqQ != null)
    {
      MMSightCameraGLSurfaceView localMMSightCameraGLSurfaceView = this.lqQ;
      if (localMMSightCameraGLSurfaceView.lqS != null)
      {
        localMMSightCameraGLSurfaceView.lqS.faJ = true;
        localMMSightCameraGLSurfaceView.requestRender();
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/mmsight/ui/cameraglview/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */