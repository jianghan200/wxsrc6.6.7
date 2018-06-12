package com.tencent.mm.plugin.game.ui;

import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;

public final class w
  implements View.OnTouchListener
{
  private int pN;
  
  public w()
  {
    this(Color.argb(221, 136, 136, 136));
  }
  
  private w(int paramInt)
  {
    this.pN = paramInt;
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    if (i == 0) {
      if ((paramView instanceof ImageView))
      {
        paramView = (ImageView)paramView;
        paramMotionEvent = paramView.getDrawable();
        if (paramMotionEvent != null)
        {
          paramMotionEvent.setColorFilter(this.pN, PorterDuff.Mode.MULTIPLY);
          paramView.setImageDrawable(paramMotionEvent);
        }
      }
    }
    for (;;)
    {
      return false;
      if (paramView.getBackground() != null)
      {
        paramView.getBackground().setColorFilter(this.pN, PorterDuff.Mode.MULTIPLY);
        continue;
        if ((i == 1) || (i == 3)) {
          if ((paramView instanceof ImageView))
          {
            paramView = ((ImageView)paramView).getDrawable();
            if (paramView != null) {
              paramView.clearColorFilter();
            }
          }
          else
          {
            paramView = paramView.getBackground();
            if (paramView != null) {
              paramView.clearColorFilter();
            }
          }
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/ui/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */