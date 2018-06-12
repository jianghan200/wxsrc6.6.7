package com.tencent.mm.wallet_core.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class CustomerScrollView
  extends ScrollView
{
  private float uYo;
  private float uYp;
  private float uYq;
  private float uYr;
  
  public CustomerScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public CustomerScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    }
    do
    {
      for (;;)
      {
        return super.onInterceptTouchEvent(paramMotionEvent);
        this.uYp = 0.0F;
        this.uYo = 0.0F;
        this.uYq = paramMotionEvent.getX();
        this.uYr = paramMotionEvent.getY();
      }
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      this.uYo += Math.abs(f1 - this.uYq);
      this.uYp += Math.abs(f2 - this.uYr);
      this.uYq = f1;
      this.uYr = f2;
    } while (this.uYo <= this.uYp);
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/ui/CustomerScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */