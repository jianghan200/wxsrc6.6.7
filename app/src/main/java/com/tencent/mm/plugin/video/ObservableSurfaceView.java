package com.tencent.mm.plugin.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import com.tencent.mm.sdk.platformtools.x;

public class ObservableSurfaceView
  extends SurfaceView
  implements SurfaceHolder.Callback
{
  protected SurfaceHolder fnG;
  private a oEF = null;
  protected boolean oEG = false;
  protected boolean oEH = false;
  protected boolean oEI = false;
  
  public ObservableSurfaceView(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public ObservableSurfaceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public ObservableSurfaceView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private void init()
  {
    this.fnG = getHolder();
    this.fnG.addCallback(this);
  }
  
  public final boolean bIT()
  {
    return this.oEG;
  }
  
  public SurfaceHolder getSurfaceHolder()
  {
    return this.fnG;
  }
  
  public void setNeedSetType(boolean paramBoolean)
  {
    this.oEI = paramBoolean;
    if (this.oEI) {
      this.fnG.setType(3);
    }
  }
  
  public void setSurfaceChangeCallback(a parama)
  {
    this.oEF = parama;
    if (this.oEI) {
      this.fnG.setType(3);
    }
  }
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    x.d("MicroMsg.ObservableSurfaceView", "surfaceChanged");
    this.oEH = true;
    try
    {
      this.fnG.removeCallback(this);
      this.fnG = paramSurfaceHolder;
      this.fnG.addCallback(this);
      if (this.oEF != null) {
        this.oEF.a(this.fnG);
      }
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    this.oEG = true;
  }
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    this.oEG = false;
    this.oEH = false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/video/ObservableSurfaceView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */