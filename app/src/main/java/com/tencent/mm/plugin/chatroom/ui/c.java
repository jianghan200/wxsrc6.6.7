package com.tencent.mm.plugin.chatroom.ui;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

public final class c
  extends TouchDelegate
{
  private static final Rect hQx = new Rect();
  ArrayList<TouchDelegate> hQy;
  TouchDelegate hQz;
  
  public c(View paramView)
  {
    super(hQx, paramView);
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    Object localObject;
    switch (paramMotionEvent.getAction())
    {
    default: 
      localObject = null;
    }
    for (;;)
    {
      if (localObject != null) {
        break label123;
      }
      return false;
      if (this.hQy == null) {
        break;
      }
      localObject = this.hQy.iterator();
      while (((Iterator)localObject).hasNext())
      {
        TouchDelegate localTouchDelegate = (TouchDelegate)((Iterator)localObject).next();
        if ((localTouchDelegate != null) && (localTouchDelegate.onTouchEvent(paramMotionEvent)))
        {
          this.hQz = localTouchDelegate;
          return true;
        }
      }
      localObject = null;
      continue;
      localObject = this.hQz;
      continue;
      localObject = this.hQz;
      this.hQz = null;
    }
    label123:
    return ((TouchDelegate)localObject).onTouchEvent(paramMotionEvent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/chatroom/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */