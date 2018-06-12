package com.tencent.mm.plugin.appbrand.widget.b;

import android.view.MotionEvent;
import com.tencent.mm.sdk.platformtools.x;

public final class b
{
  public static String C(MotionEvent paramMotionEvent)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("MotionEvent { action=").append(actionToString(paramMotionEvent.getAction()));
    int j = paramMotionEvent.getPointerCount();
    int i = 0;
    while (i < j)
    {
      localStringBuilder.append(", x[").append(i).append("]=").append(paramMotionEvent.getX(i));
      localStringBuilder.append(", y[").append(i).append("]=").append(paramMotionEvent.getY(i));
      i += 1;
    }
    localStringBuilder.append(", downTime=").append(paramMotionEvent.getDownTime());
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
  
  public static void a(String paramString1, String paramString2, MotionEvent paramMotionEvent)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString2).append(' ');
    localStringBuilder.append("[apptouch] MotionEvent { action=").append(actionToString(paramMotionEvent.getAction()));
    int j = paramMotionEvent.getPointerCount();
    int i = 0;
    while (i < j)
    {
      localStringBuilder.append(", x[").append(i).append("]=").append(paramMotionEvent.getX(i));
      localStringBuilder.append(", y[").append(i).append("]=").append(paramMotionEvent.getY(i));
      i += 1;
    }
    localStringBuilder.append(", downTime=").append(paramMotionEvent.getDownTime());
    localStringBuilder.append(" }");
    if (x.getLogLevel() <= 1) {
      x.v(paramString1, localStringBuilder.toString());
    }
  }
  
  private static String actionToString(int paramInt)
  {
    int i;
    switch (paramInt)
    {
    case 5: 
    case 6: 
    default: 
      i = (0xFF00 & paramInt) >> 8;
      switch (paramInt & 0xFF)
      {
      default: 
        return Integer.toString(paramInt);
      }
    case 0: 
      return "ACTION_DOWN";
    case 1: 
      return "ACTION_UP";
    case 3: 
      return "ACTION_CANCEL";
    case 4: 
      return "ACTION_OUTSIDE";
    case 2: 
      return "ACTION_MOVE";
    case 7: 
      return "ACTION_HOVER_MOVE";
    case 8: 
      return "ACTION_SCROLL";
    case 9: 
      return "ACTION_HOVER_ENTER";
    case 10: 
      return "ACTION_HOVER_EXIT";
    case 11: 
      return "ACTION_BUTTON_PRESS";
    }
    return "ACTION_BUTTON_RELEASE";
    return "ACTION_POINTER_DOWN(" + i + ")";
    return "ACTION_POINTER_UP(" + i + ")";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */