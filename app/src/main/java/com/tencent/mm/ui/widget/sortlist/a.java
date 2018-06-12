package com.tencent.mm.ui.widget.sortlist;

import android.graphics.Point;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;

public final class a
  extends d
  implements GestureDetector.OnGestureListener, View.OnTouchListener
{
  private int fW;
  private int gbM;
  private int gbN;
  private int ioh;
  private GestureDetector uG;
  private int uMT = 0;
  boolean uMU = true;
  boolean uMV = false;
  private boolean uMW = false;
  private GestureDetector uMX;
  private int uMY = -1;
  private int uMZ = -1;
  private int uNa = -1;
  private int[] uNb = new int[2];
  private int uNc;
  private int uNd;
  private boolean uNe = false;
  private float uNf = 500.0F;
  private int uNg;
  private int uNh;
  private int uNi;
  private boolean uNj;
  private DragSortListView uNk;
  private int uNl;
  private GestureDetector.OnGestureListener uNm = new a.1(this);
  
  public a(DragSortListView paramDragSortListView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    super(paramDragSortListView);
    this.uNk = paramDragSortListView;
    this.uG = new GestureDetector(paramDragSortListView.getContext(), this);
    this.uMX = new GestureDetector(paramDragSortListView.getContext(), this.uNm);
    this.uMX.setIsLongpressEnabled(false);
    this.fW = ViewConfiguration.get(paramDragSortListView.getContext()).getScaledTouchSlop();
    this.uNg = paramInt1;
    this.uNh = paramInt4;
    this.uNi = paramInt5;
    this.ioh = paramInt3;
    this.uMT = paramInt2;
  }
  
  private boolean as(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool2 = false;
    if ((this.uMU) && (!this.uMW)) {}
    for (int i = 12;; i = 0)
    {
      if ((this.uMV) && (this.uMW)) {
        i = i | 0x1 | 0x2;
      }
      for (;;)
      {
        DragSortListView localDragSortListView = this.uNk;
        paramInt1 -= this.uNk.getHeaderViewsCount();
        boolean bool1 = bool2;
        if (localDragSortListView.uNZ)
        {
          if (localDragSortListView.uOa != null) {
            break label94;
          }
          bool1 = bool2;
        }
        for (;;)
        {
          this.uNe = bool1;
          return this.uNe;
          label94:
          View localView = localDragSortListView.uOa.GK(paramInt1);
          bool1 = bool2;
          if (localView != null) {
            bool1 = localDragSortListView.a(paramInt1, localView, i, paramInt2, paramInt3);
          }
        }
      }
    }
  }
  
  private int k(MotionEvent paramMotionEvent, int paramInt)
  {
    int i = (int)paramMotionEvent.getX();
    int j = (int)paramMotionEvent.getY();
    i = this.uNk.pointToPosition(i, j);
    j = this.uNk.getHeaderViewsCount();
    int k = this.uNk.getFooterViewsCount();
    int m = this.uNk.getCount();
    if ((i != -1) && (i >= j) && (i < m - k))
    {
      View localView = this.uNk.getChildAt(i - this.uNk.getFirstVisiblePosition());
      k = (int)paramMotionEvent.getRawX();
      j = (int)paramMotionEvent.getRawY();
      if (paramInt == 0) {}
      for (paramMotionEvent = localView; paramMotionEvent != null; paramMotionEvent = localView.findViewById(paramInt))
      {
        paramMotionEvent.getLocationOnScreen(this.uNb);
        if ((k <= this.uNb[0]) || (j <= this.uNb[1]) || (k >= this.uNb[0] + paramMotionEvent.getWidth())) {
          break;
        }
        paramInt = this.uNb[1];
        if (j >= paramMotionEvent.getHeight() + paramInt) {
          break;
        }
        this.uNc = localView.getLeft();
        this.uNd = localView.getTop();
        return i;
      }
    }
    return -1;
  }
  
  public final void i(Point paramPoint)
  {
    if ((this.uMV) && (this.uMW)) {
      this.uNl = paramPoint.x;
    }
  }
  
  public final boolean onDown(MotionEvent paramMotionEvent)
  {
    int i = -1;
    if ((this.uMV) && (this.ioh == 0)) {
      this.uNa = k(paramMotionEvent, this.uNh);
    }
    this.uMY = k(paramMotionEvent, this.uNg);
    if ((this.uMY != -1) && (this.uMT == 0)) {
      as(this.uMY, (int)paramMotionEvent.getX() - this.uNc, (int)paramMotionEvent.getY() - this.uNd);
    }
    this.uMW = false;
    this.uNj = true;
    this.uNl = 0;
    if (this.ioh == 1) {
      i = k(paramMotionEvent, this.uNi);
    }
    this.uMZ = i;
    return true;
  }
  
  public final boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public final void onLongPress(MotionEvent paramMotionEvent)
  {
    if ((this.uMY != -1) && (this.uMT == 2))
    {
      this.uNk.performHapticFeedback(0);
      as(this.uMY, this.gbM - this.uNc, this.gbN - this.uNd);
    }
  }
  
  public final boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    int i = (int)paramMotionEvent1.getX();
    int j = (int)paramMotionEvent1.getY();
    int k = (int)paramMotionEvent2.getX();
    int m = (int)paramMotionEvent2.getY();
    int n = k - this.uNc;
    int i1 = m - this.uNd;
    if ((this.uNj) && (!this.uNe) && ((this.uMY != -1) || (this.uMZ != -1)))
    {
      if (this.uMY == -1) {
        break label178;
      }
      if ((this.uMT != 1) || (Math.abs(m - j) <= this.fW) || (!this.uMU)) {
        break label129;
      }
      as(this.uMY, n, i1);
    }
    label129:
    label178:
    do
    {
      do
      {
        do
        {
          return false;
        } while ((this.uMT == 0) || (Math.abs(k - i) <= this.fW) || (!this.uMV));
        this.uMW = true;
        as(this.uMZ, n, i1);
        return false;
      } while (this.uMZ == -1);
      if ((Math.abs(k - i) > this.fW) && (this.uMV))
      {
        this.uMW = true;
        as(this.uMZ, n, i1);
        return false;
      }
    } while (Math.abs(m - j) <= this.fW);
    this.uNj = false;
    return false;
  }
  
  public final void onShowPress(MotionEvent paramMotionEvent) {}
  
  public final boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    if ((this.uMV) && (this.ioh == 0) && (this.uNa != -1))
    {
      paramMotionEvent = this.uNk;
      int i = this.uNa;
      int j = this.uNk.getHeaderViewsCount();
      paramMotionEvent.uOn = false;
      paramMotionEvent.k(i - j, 0.0F);
    }
    return true;
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if ((!this.uNk.uNF) || (this.uNk.uOp)) {}
    do
    {
      return false;
      this.uG.onTouchEvent(paramMotionEvent);
      if ((this.uMV) && (this.uNe) && (this.ioh == 1)) {
        this.uMX.onTouchEvent(paramMotionEvent);
      }
      switch (paramMotionEvent.getAction() & 0xFF)
      {
      case 2: 
      default: 
        return false;
      case 0: 
        this.gbM = ((int)paramMotionEvent.getX());
        this.gbN = ((int)paramMotionEvent.getY());
        return false;
      }
    } while ((!this.uMV) || (!this.uMW));
    if (this.uNl >= 0) {}
    for (int i = this.uNl; i > this.uNk.getWidth() / 2; i = -this.uNl)
    {
      this.uNk.aE(0.0F);
      return false;
    }
    this.uMW = false;
    this.uNe = false;
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/widget/sortlist/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */