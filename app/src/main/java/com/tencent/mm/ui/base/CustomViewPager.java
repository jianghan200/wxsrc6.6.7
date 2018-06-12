package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.mogic.WxViewPager;

public class CustomViewPager
  extends WxViewPager
{
  private boolean Bk = true;
  private boolean tsp = true;
  
  public CustomViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected final boolean S(float paramFloat1, float paramFloat2)
  {
    if (this.tsp) {
      return super.S(paramFloat1, paramFloat2);
    }
    return false;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.Bk) {
      return false;
    }
    return super.onInterceptTouchEvent(paramMotionEvent);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.Bk) {
      return false;
    }
    try
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      return bool;
    }
    catch (Exception paramMotionEvent)
    {
      x.printErrStackTrace("MicroMsg.CustomViewPager", paramMotionEvent, "get a Exception", new Object[0]);
    }
    return false;
  }
  
  public void setCanSlide(boolean paramBoolean)
  {
    this.Bk = paramBoolean;
  }
  
  public void setCanSlideBySide(boolean paramBoolean)
  {
    this.tsp = paramBoolean;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/base/CustomViewPager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */