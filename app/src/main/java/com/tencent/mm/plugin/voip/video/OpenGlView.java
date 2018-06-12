package com.tencent.mm.plugin.voip.video;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;

public class OpenGlView
  extends GLSurfaceView
{
  private static String TAG = "OpenGlView";
  public boolean nAK = false;
  public boolean oUZ = false;
  public boolean oVa = true;
  public int oVb = 1;
  WeakReference<OpenGlRender> oVc;
  
  public OpenGlView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    getHolder().addCallback(this);
    try
    {
      getHolder().setType(2);
      if (this.oVb == 2)
      {
        setEGLContextFactory(new c());
        setEGLConfigChooser(new b());
      }
      return;
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        try
        {
          getHolder().setType(1);
        }
        catch (Exception paramContext)
        {
          try
          {
            getHolder().setType(0);
          }
          catch (Exception paramContext) {}
        }
      }
    }
  }
  
  public void dT(int paramInt1, int paramInt2)
  {
    setLayoutParams(new RelativeLayout.LayoutParams(paramInt1, paramInt2));
  }
  
  public void dU(int paramInt1, int paramInt2) {}
  
  public void onPause()
  {
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
  }
  
  public void setRenderer(OpenGlRender paramOpenGlRender)
  {
    this.oVc = new WeakReference(paramOpenGlRender);
    super.setRenderer(paramOpenGlRender);
  }
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    x.i(TAG, "surfaceChanged, format: %s, w: %s, h: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    super.surfaceChanged(paramSurfaceHolder, paramInt1, paramInt2, paramInt3);
  }
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    x.i(TAG, "surfaceCreated");
    super.surfaceCreated(paramSurfaceHolder);
    paramSurfaceHolder = (OpenGlRender)this.oVc.get();
    x.i(OpenGlRender.TAG, "%s surfaceCreated", new Object[] { Integer.valueOf(paramSurfaceHolder.hashCode()) });
    paramSurfaceHolder.Init(OpenGlRender.bMg(), new WeakReference(paramSurfaceHolder), paramSurfaceHolder.mRenderMode);
    paramSurfaceHolder.setParam(paramSurfaceHolder.oUn, paramSurfaceHolder.oUo, paramSurfaceHolder.oUp, paramSurfaceHolder.mRenderMode);
    paramSurfaceHolder.setMode(((OpenGlView)paramSurfaceHolder.oUx.get()).getWidth(), ((OpenGlView)paramSurfaceHolder.oUx.get()).getHeight(), 0, paramSurfaceHolder.mRenderMode);
    paramSurfaceHolder.oUu = true;
    paramSurfaceHolder.oUq = true;
    paramSurfaceHolder.requestRender();
  }
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    x.i(TAG, "surfaceDestroyed");
    OpenGlRender localOpenGlRender = (OpenGlRender)this.oVc.get();
    x.i(OpenGlRender.TAG, "%s onSurfaceDestroyed, mfInited: %s", new Object[] { Integer.valueOf(localOpenGlRender.hashCode()), Boolean.valueOf(localOpenGlRender.oUq) });
    if (localOpenGlRender.oUq)
    {
      localOpenGlRender.oUq = false;
      localOpenGlRender.Uninit(localOpenGlRender.mRenderMode);
      x.i(OpenGlRender.TAG, "%s steve: after Uninit in onSurfaceDestroyed", new Object[] { Integer.valueOf(localOpenGlRender.hashCode()) });
      localOpenGlRender.oUl = 0;
      localOpenGlRender.oUv = 0;
      localOpenGlRender.oUw = 0;
    }
    super.surfaceDestroyed(paramSurfaceHolder);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/voip/video/OpenGlView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */