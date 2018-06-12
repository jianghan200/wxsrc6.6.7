package com.tencent.mm.ui.base;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListAdapter;
import android.widget.Scroller;
import java.util.LinkedList;
import java.util.Queue;

public class MMHorList
  extends AdapterView<ListAdapter>
{
  private boolean lAt = false;
  private int offset;
  private boolean tvA = false;
  private boolean tvB = false;
  protected Scroller tvC;
  private GestureDetector tvD;
  private AdapterView.OnItemSelectedListener tvE;
  private AdapterView.OnItemClickListener tvF;
  private ListAdapter tvG;
  private Runnable tvH = new MMHorList.1(this);
  private boolean tvI = false;
  private boolean tvJ = false;
  private int tvK = 0;
  private int tvL = 0;
  private boolean tvM = false;
  private DataSetObserver tvN = new MMHorList.2(this);
  private GestureDetector.OnGestureListener tvO = new MMHorList.3(this);
  private a tvt;
  private int tvu;
  private int tvv;
  private int tvw;
  private int tvx;
  private int tvy = 536870912;
  private Queue<View> tvz = new LinkedList();
  
  public MMHorList(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public MMHorList(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private void K(View paramView, int paramInt)
  {
    this.tvB = true;
    ViewGroup.LayoutParams localLayoutParams2 = paramView.getLayoutParams();
    ViewGroup.LayoutParams localLayoutParams1 = localLayoutParams2;
    if (localLayoutParams2 == null) {
      localLayoutParams1 = new ViewGroup.LayoutParams(-1, -1);
    }
    addViewInLayout(paramView, paramInt, localLayoutParams1, true);
    paramView.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
  }
  
  private int getChildViewTotalWidth()
  {
    return this.tvG.getCount() * this.tvK;
  }
  
  private void init()
  {
    this.tvC = new Scroller(getContext());
    this.tvu = -1;
    this.tvv = 0;
    this.offset = 0;
    this.tvw = 0;
    this.tvx = 0;
    this.tvA = false;
    this.tvy = 536870912;
    this.tvD = new GestureDetector(getContext(), this.tvO);
  }
  
  private void reset()
  {
    init();
    removeAllViewsInLayout();
    requestLayout();
  }
  
  public final void En(int paramInt)
  {
    this.tvC.forceFinished(true);
    this.tvC.startScroll(this.tvw, 0, paramInt - this.tvw, 0);
    this.tvM = true;
    requestLayout();
  }
  
  protected final boolean aC(float paramFloat)
  {
    this.tvC.fling(this.tvx, 0, (int)-paramFloat, 0, 0, this.tvy, 0, 0);
    requestLayout();
    return true;
  }
  
  protected final boolean crg()
  {
    this.tvC.forceFinished(true);
    return true;
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = this.tvD.onTouchEvent(paramMotionEvent);
    if (paramMotionEvent.getAction() == 0)
    {
      this.lAt = true;
      if (this.tvt != null) {
        this.tvt.bHl();
      }
    }
    while ((paramMotionEvent.getAction() != 3) && (paramMotionEvent.getAction() != 1)) {
      return bool;
    }
    if (this.tvJ)
    {
      if (getChildViewTotalWidth() <= getWidth()) {
        break label182;
      }
      if (this.tvw >= 0) {
        break label134;
      }
      this.tvC.forceFinished(true);
      this.tvC.startScroll(this.tvw, 0, 0 - this.tvw, 0);
      requestLayout();
    }
    for (;;)
    {
      this.lAt = false;
      if (this.tvt == null) {
        break;
      }
      this.tvt.bHm();
      return bool;
      label134:
      if (this.tvw > this.tvy)
      {
        this.tvC.forceFinished(true);
        this.tvC.startScroll(this.tvw, 0, this.tvy - this.tvw, 0);
        requestLayout();
        continue;
        label182:
        if (this.tvw != this.tvL * -1)
        {
          this.tvC.forceFinished(true);
          this.tvC.startScroll(this.tvw, 0, 0 - this.tvw, 0);
          requestLayout();
        }
      }
    }
  }
  
  public ListAdapter getAdapter()
  {
    return this.tvG;
  }
  
  public int getCurrentPosition()
  {
    return this.tvw;
  }
  
  public boolean getIsTouching()
  {
    return this.lAt;
  }
  
  public View getSelectedView()
  {
    return null;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.tvG == null) {
      return;
    }
    this.tvB = true;
    if (this.tvA)
    {
      paramInt1 = this.tvw;
      init();
      removeAllViewsInLayout();
      this.tvx = paramInt1;
      if (this.tvI)
      {
        this.tvL = Math.max(0, (getWidth() - getChildViewTotalWidth()) / 2);
        this.offset = this.tvL;
      }
      this.tvA = false;
    }
    if (this.tvC.computeScrollOffset()) {
      this.tvx = this.tvC.getCurrX();
    }
    if (this.tvJ) {
      if (getChildViewTotalWidth() > getWidth())
      {
        if (this.tvx < getWidth() * -1)
        {
          this.tvx = (getWidth() * -1 + 1);
          this.tvC.forceFinished(true);
        }
        if (this.tvx > this.tvy + getWidth())
        {
          this.tvx = (this.tvy + getWidth() - 1);
          this.tvC.forceFinished(true);
        }
      }
    }
    for (;;)
    {
      paramInt2 = this.tvw - this.tvx;
      localView = getChildAt(0);
      while ((localView != null) && (localView.getRight() + paramInt2 <= 0))
      {
        this.offset += localView.getMeasuredWidth();
        this.tvz.offer(localView);
        removeViewInLayout(localView);
        this.tvu += 1;
        localView = getChildAt(0);
        this.tvB = true;
      }
      if (this.tvx < getWidth() * -1 + this.tvL)
      {
        this.tvx = (getWidth() * -1 + this.tvL + 1);
        this.tvC.forceFinished(true);
      }
      if (this.tvx > getWidth() - this.tvL)
      {
        this.tvx = (getWidth() - this.tvL - 1);
        this.tvC.forceFinished(true);
        continue;
        if (this.tvx < 0)
        {
          this.tvx = 0;
          this.tvC.forceFinished(true);
        }
        if (this.tvx > this.tvy)
        {
          this.tvx = this.tvy;
          this.tvC.forceFinished(true);
        }
      }
    }
    View localView = getChildAt(getChildCount() - 1);
    while ((localView != null) && (localView.getLeft() + paramInt2 >= getWidth()))
    {
      this.tvz.offer(localView);
      removeViewInLayout(localView);
      this.tvv -= 1;
      localView = getChildAt(getChildCount() - 1);
      this.tvB = true;
    }
    localView = getChildAt(getChildCount() - 1);
    if (localView != null) {
      paramInt1 = localView.getRight();
    }
    for (;;)
    {
      if ((paramInt1 + paramInt2 < getWidth()) && (this.tvv < this.tvG.getCount()))
      {
        localView = this.tvG.getView(this.tvv, (View)this.tvz.poll(), this);
        K(localView, -1);
        paramInt1 = localView.getMeasuredWidth() + paramInt1;
        if (this.tvv == this.tvG.getCount() - 1) {
          this.tvy = (this.tvw + paramInt1 - getWidth());
        }
        this.tvv += 1;
      }
      else
      {
        localView = getChildAt(0);
        if (localView != null) {
          paramInt1 = localView.getLeft();
        }
        for (;;)
        {
          if ((paramInt1 + paramInt2 > 0) && (this.tvu >= 0))
          {
            localView = this.tvG.getView(this.tvu, (View)this.tvz.poll(), this);
            K(localView, 0);
            paramInt3 = localView.getMeasuredWidth();
            this.tvu -= 1;
            this.offset -= localView.getMeasuredWidth();
            paramInt1 -= paramInt3;
          }
          else
          {
            if ((getChildCount() > 0) && (this.tvB))
            {
              this.offset += paramInt2;
              paramInt2 = this.offset;
              paramInt1 = 0;
              while (paramInt1 < getChildCount())
              {
                localView = getChildAt(paramInt1);
                paramInt3 = localView.getMeasuredWidth();
                localView.layout(paramInt2, 0, paramInt2 + paramInt3, localView.getMeasuredHeight());
                paramInt2 += paramInt3;
                paramInt1 += 1;
              }
            }
            this.tvw = this.tvx;
            if (!this.tvC.isFinished())
            {
              post(this.tvH);
              return;
            }
            if ((this.tvt == null) || (!this.tvM)) {
              break;
            }
            this.tvt.bbm();
            this.tvM = false;
            return;
            paramInt1 = 0;
          }
        }
        paramInt1 = 0;
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if ((this.tvG != null) && (this.tvG.getCount() > 0))
    {
      View localView = getChildAt(0);
      if (localView != null)
      {
        super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(localView.getMeasuredHeight(), Integer.MIN_VALUE));
        return;
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public void setAdapter(ListAdapter paramListAdapter)
  {
    if (this.tvG == null) {
      paramListAdapter.registerDataSetObserver(this.tvN);
    }
    this.tvG = paramListAdapter;
    reset();
  }
  
  public void setCenterInParent(boolean paramBoolean)
  {
    this.tvI = paramBoolean;
  }
  
  public void setHorListLitener(a parama)
  {
    this.tvt = parama;
  }
  
  public void setItemWidth(int paramInt)
  {
    this.tvK = paramInt;
  }
  
  public void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    this.tvF = paramOnItemClickListener;
  }
  
  public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener paramOnItemSelectedListener)
  {
    this.tvE = paramOnItemSelectedListener;
  }
  
  public void setOverScrollEnabled(boolean paramBoolean)
  {
    this.tvJ = paramBoolean;
  }
  
  public void setSelection(int paramInt) {}
  
  public static abstract interface a
  {
    public abstract void bHl();
    
    public abstract void bHm();
    
    public abstract void bbm();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/base/MMHorList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */