package com.tencent.mm.plugin.voip.video;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.mm.plugin.video.ObservableSurfaceView;

public class CaptureView
  extends ObservableSurfaceView
{
  public CaptureView(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public CaptureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public CaptureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private void init()
  {
    if (j.bMl()) {
      setNeedSetType(true);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/voip/video/CaptureView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */