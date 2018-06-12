package com.tencent.neattextview.textview.view;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.neattextview.textview.b.c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class b
  implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, NeatTextView.c
{
  private GestureDetector gbw;
  private View mView;
  private com.tencent.neattextview.textview.layout.b vaO;
  private a vbA;
  public c vbB;
  
  public b(Context paramContext, a parama)
  {
    this.vbA = parama;
    this.gbw = new GestureDetector(paramContext, this);
    this.gbw.setOnDoubleTapListener(this);
  }
  
  public void cancel(int paramInt)
  {
    if (this.vbB != null)
    {
      this.vbB.lmQ = false;
      this.mView.invalidate();
      this.vbB = null;
    }
  }
  
  public boolean onDoubleTap(MotionEvent paramMotionEvent)
  {
    if (this.vbA.getOnDoubleClickListener() != null)
    {
      this.vbA.getOnDoubleClickListener().dK(this.mView);
      return true;
    }
    return false;
  }
  
  public boolean onDoubleTapEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public boolean onDown(MotionEvent paramMotionEvent)
  {
    Object localObject1 = this.vaO;
    Object localObject2;
    if (((com.tencent.neattextview.textview.layout.b)localObject1).vaC == null)
    {
      ((com.tencent.neattextview.textview.layout.b)localObject1).vaC = new LinkedList();
      localObject2 = ((com.tencent.neattextview.textview.layout.b)localObject1).vam.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        com.tencent.neattextview.textview.b.b localb = (com.tencent.neattextview.textview.b.b)((Iterator)localObject2).next();
        if (localb.getClass() == c.class) {
          ((com.tencent.neattextview.textview.layout.b)localObject1).vaC.add((c)localb);
        }
      }
    }
    localObject1 = ((com.tencent.neattextview.textview.layout.b)localObject1).vaC.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (c)((Iterator)localObject1).next();
      if (((c)localObject2).W(paramMotionEvent.getX() - this.vbA.getHorizontalOffset(), paramMotionEvent.getY() - this.vbA.getVerticalOffset()))
      {
        this.vbB = ((c)localObject2);
        ((c)localObject2).lmQ = true;
        this.mView.postInvalidate();
      }
    }
    return false;
  }
  
  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    cancel(2);
    return false;
  }
  
  public void onLongPress(MotionEvent paramMotionEvent)
  {
    cancel(1);
  }
  
  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public void onShowPress(MotionEvent paramMotionEvent) {}
  
  public boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    if (this.vbB != null)
    {
      paramMotionEvent = this.vbB;
      View localView = this.mView;
      if (paramMotionEvent.vab != null) {
        ((ClickableSpan)paramMotionEvent.vab).onClick(localView);
      }
    }
    return false;
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool1;
    if (this.vbA.getLayout() == null) {
      bool1 = false;
    }
    boolean bool2;
    do
    {
      return bool1;
      this.vaO = this.vbA.getLayout();
      this.mView = paramView;
      bool2 = this.gbw.onTouchEvent(paramMotionEvent);
      if (paramMotionEvent.getAction() == 3) {
        break;
      }
      bool1 = bool2;
    } while (paramMotionEvent.getAction() != 1);
    cancel(2);
    return bool2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/neattextview/textview/view/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */