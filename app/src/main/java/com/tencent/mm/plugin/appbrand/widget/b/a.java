package com.tencent.mm.plugin.appbrand.widget.b;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.MotionEvent.PointerCoords;
import android.view.MotionEvent.PointerProperties;
import android.view.View;
import android.view.ViewGroup;

public final class a
{
  @TargetApi(11)
  public static boolean a(ViewGroup paramViewGroup, float paramFloat1, float paramFloat2, View paramView)
  {
    float[] arrayOfFloat = new float[2];
    float[] tmp7_5 = arrayOfFloat;
    tmp7_5[0] = 0.0F;
    float[] tmp11_7 = tmp7_5;
    tmp11_7[1] = 0.0F;
    tmp11_7;
    arrayOfFloat[0] = (paramViewGroup.getScrollX() - paramView.getLeft() + paramFloat1);
    arrayOfFloat[1] = (paramViewGroup.getScrollY() - paramView.getTop() + paramFloat2);
    paramViewGroup = paramView.getMatrix();
    if (!paramViewGroup.isIdentity())
    {
      paramViewGroup.invert(paramViewGroup);
      paramViewGroup.mapPoints(arrayOfFloat);
    }
    return (arrayOfFloat[0] >= 0.0F) && (arrayOfFloat[1] >= 0.0F) && (arrayOfFloat[0] < paramView.getRight() - paramView.getLeft()) && (arrayOfFloat[1] < paramView.getBottom() - paramView.getTop());
  }
  
  @TargetApi(11)
  public static boolean a(ViewGroup paramViewGroup, MotionEvent paramMotionEvent, View paramView, int paramInt)
  {
    if ((paramViewGroup == null) || (paramMotionEvent == null)) {
      return false;
    }
    int i = paramMotionEvent.getAction();
    if (i == 3)
    {
      paramMotionEvent.setAction(3);
      if (paramView == null) {
        return false;
      }
      bool = paramView.dispatchTouchEvent(paramMotionEvent);
      paramMotionEvent.setAction(i);
      return bool;
    }
    i = 0;
    int k = paramMotionEvent.getPointerCount();
    int j = 0;
    while (j < k)
    {
      i |= 1 << paramMotionEvent.getPointerId(j);
      j += 1;
    }
    int i1 = i & paramInt;
    if (i1 == 0) {
      return false;
    }
    if (i1 == i) {
      if ((paramView == null) || (paramView.getMatrix().isIdentity()))
      {
        if (paramView == null) {
          return false;
        }
        float f1 = paramViewGroup.getScrollX() - paramView.getLeft();
        float f2 = paramViewGroup.getScrollY() - paramView.getTop();
        paramMotionEvent.offsetLocation(f1, f2);
        bool = paramView.dispatchTouchEvent(paramMotionEvent);
        paramMotionEvent.offsetLocation(-f1, -f2);
        return bool;
      }
    }
    MotionEvent localMotionEvent;
    for (paramMotionEvent = MotionEvent.obtain(paramMotionEvent); paramView == null; paramMotionEvent = localMotionEvent)
    {
      return false;
      int i3 = paramMotionEvent.getPointerCount();
      MotionEvent.PointerProperties[] arrayOfPointerProperties = new MotionEvent.PointerProperties[i3];
      MotionEvent.PointerCoords[] arrayOfPointerCoords = new MotionEvent.PointerCoords[i3];
      int[] arrayOfInt = new int[i3];
      int n = paramMotionEvent.getAction();
      int i2 = n & 0xFF;
      j = -1;
      i = 0;
      paramInt = 0;
      int m;
      while (paramInt < i3)
      {
        paramMotionEvent.getPointerProperties(paramInt, arrayOfPointerProperties[i]);
        m = j;
        k = i;
        if ((1 << arrayOfPointerProperties[i].id & i1) != 0)
        {
          if (paramInt == (0xFF00 & n) >> 8) {
            j = i;
          }
          arrayOfInt[i] = paramInt;
          k = i + 1;
          m = j;
        }
        paramInt += 1;
        j = m;
        i = k;
      }
      if (i == 0) {
        throw new IllegalArgumentException("idBits did not match any ids in the event");
      }
      if (i2 != 5)
      {
        paramInt = n;
        if (i2 != 6) {}
      }
      else
      {
        if (j >= 0) {
          break label431;
        }
        paramInt = 2;
      }
      localMotionEvent = null;
      n = paramMotionEvent.getHistorySize();
      j = 0;
      if (j <= n)
      {
        if (j == n) {}
        for (k = Integer.MIN_VALUE;; k = j)
        {
          m = 0;
          while (m < i)
          {
            paramMotionEvent.getHistoricalPointerCoords(arrayOfInt[m], k, arrayOfPointerCoords[m]);
            m += 1;
          }
          label431:
          if (i == 1)
          {
            if (i2 == 5) {}
            for (paramInt = 0;; paramInt = 1) {
              break;
            }
          }
          paramInt = i2 | j << 8;
          break;
        }
        long l = paramMotionEvent.getHistoricalEventTime(k);
        if (j == 0)
        {
          localMotionEvent = MotionEvent.obtain(paramMotionEvent.getDownTime(), paramMotionEvent.getEventTime(), paramInt, i, arrayOfPointerProperties, arrayOfPointerCoords, paramMotionEvent.getMetaState(), paramMotionEvent.getButtonState(), paramMotionEvent.getXPrecision(), paramMotionEvent.getYPrecision(), paramMotionEvent.getDeviceId(), paramMotionEvent.getEdgeFlags(), paramMotionEvent.getSource(), paramMotionEvent.getFlags());
          localMotionEvent.offsetLocation(localMotionEvent.getX() - localMotionEvent.getRawX(), localMotionEvent.getY() - localMotionEvent.getRawY());
        }
        for (;;)
        {
          j += 1;
          break;
          localMotionEvent.addBatch(l, arrayOfPointerCoords, 0);
        }
      }
    }
    paramMotionEvent.offsetLocation(paramViewGroup.getScrollX() - paramView.getLeft(), paramViewGroup.getScrollY() - paramView.getTop());
    if (!paramView.getMatrix().isIdentity())
    {
      paramViewGroup = paramView.getMatrix();
      paramViewGroup.invert(paramViewGroup);
      paramMotionEvent.transform(paramViewGroup);
    }
    boolean bool = paramView.dispatchTouchEvent(paramMotionEvent);
    paramMotionEvent.recycle();
    return bool;
  }
  
  public static boolean bR(View paramView)
  {
    return (paramView != null) && ((paramView instanceof d)) && (((d)paramView).apd());
  }
  
  public static boolean bS(View paramView)
  {
    return (paramView.getVisibility() == 0) || (paramView.getAnimation() != null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */