package com.tencent.mm.plugin.appbrand.debugger;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class RemoteDebugMoveView
  extends FrameLayout
{
  int ftm;
  int ftn;
  float fto;
  float ftp;
  float ftq;
  float ftr;
  
  public RemoteDebugMoveView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public RemoteDebugMoveView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      return true;
      this.fto = paramMotionEvent.getRawX();
      this.ftp = paramMotionEvent.getRawY();
      continue;
      this.ftq = paramMotionEvent.getRawX();
      this.ftr = paramMotionEvent.getRawY();
      float f1 = getX() + (this.ftq - this.fto);
      if ((0.0F < f1) && (f1 < this.ftm - getWidth())) {
        setX(f1);
      }
      f1 = this.ftr - this.ftp;
      float f2 = this.ftn - getHeight();
      float f3 = getY() + f1;
      if (((0.0F < f3) && (f3 < f2)) || ((f3 <= 0.0F) && (f1 > 0.0F)) || ((f3 >= f2) && (f1 < 0.0F))) {
        setY(f3);
      }
      this.fto = this.ftq;
      this.ftp = this.ftr;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/debugger/RemoteDebugMoveView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */