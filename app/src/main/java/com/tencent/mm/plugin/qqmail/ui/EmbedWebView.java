package com.tencent.mm.plugin.qqmail.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.tencent.mm.ui.widget.MMWebView;

public class EmbedWebView
  extends MMWebView
{
  private GestureDetector mgc = new GestureDetector(new EmbedWebView.1(this));
  private boolean mgd = false;
  private float[] mge = new float[2];
  private float[] mgf = new float[2];
  private float[] mgg = new float[2];
  private float[] mgh = new float[2];
  
  public EmbedWebView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    postDelayed(new EmbedWebView.2(this), 100L);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    int j = 0;
    int i = 0;
    this.mgc.onTouchEvent(paramMotionEvent);
    int m;
    int k;
    if (this.mgd)
    {
      m = paramMotionEvent.getAction();
      k = paramMotionEvent.getPointerCount();
      if (k == 2) {
        break label58;
      }
    }
    for (;;)
    {
      if (i == 0) {
        bool = super.onTouchEvent(paramMotionEvent);
      }
      return bool;
      label58:
      i = j;
      switch (m & 0xFF)
      {
      case 3: 
      case 4: 
      default: 
        i = 1;
      }
    }
    while (i < k)
    {
      this.mge[i] = paramMotionEvent.getX(i);
      this.mgf[i] = paramMotionEvent.getY(i);
      i += 1;
    }
    i = 0;
    while (i < k)
    {
      this.mgg[i] = paramMotionEvent.getX(i);
      this.mgh[i] = paramMotionEvent.getY(i);
      i += 1;
    }
    float f1 = (float)(Math.pow(this.mge[1] - this.mge[0], 2.0D) + Math.pow(this.mgf[1] - this.mgf[0], 2.0D));
    float f2 = (float)(Math.pow(this.mgg[1] - this.mgg[0], 2.0D) + Math.pow(this.mgh[1] - this.mgh[0], 2.0D));
    if (f1 - f2 > 20000.0F) {
      zoomOut();
    }
    for (;;)
    {
      this.mge[0] = this.mgg[0];
      this.mge[1] = this.mgg[1];
      this.mgf[0] = this.mgh[0];
      this.mgf[1] = this.mgh[1];
      break;
      if (f2 - f1 > 20000.0F) {
        zoomIn();
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/qqmail/ui/EmbedWebView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */