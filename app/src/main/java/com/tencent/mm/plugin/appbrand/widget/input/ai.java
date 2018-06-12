package com.tencent.mm.plugin.appbrand.widget.input;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;

public class ai
  implements View.OnTouchListener
{
  private static final int ul = ;
  private final Handler gJH = new ai.1(this, Looper.getMainLooper());
  private float gJI;
  private float gJJ;
  private boolean gJK = false;
  
  private void ch(View paramView)
  {
    paramView.setPressed(false);
    this.gJK = false;
    this.gJH.removeMessages(1);
    this.gJH.removeMessages(2);
  }
  
  protected void ajJ() {}
  
  protected void apC() {}
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getActionMasked())
    {
    default: 
    case 3: 
    case 1: 
    case 2: 
      int i;
      float f1;
      float f2;
      do
      {
        return true;
        ch(paramView);
        return true;
        if ((!this.gJK) && (this.gJH.hasMessages(1))) {
          ajJ();
        }
        ch(paramView);
        return true;
        i = ViewConfiguration.get(paramView.getContext()).getScaledTouchSlop();
        f1 = paramMotionEvent.getX();
        f2 = paramMotionEvent.getY();
      } while ((-i <= f1) && (f1 <= paramView.getWidth() + i) && (-i <= f2) && (f2 <= i + paramView.getHeight()));
      this.gJK = true;
      return true;
    }
    paramView.setPressed(true);
    this.gJH.sendMessageDelayed(Message.obtain(this.gJH, 1), ul);
    this.gJI = paramMotionEvent.getX();
    this.gJJ = paramMotionEvent.getY();
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */