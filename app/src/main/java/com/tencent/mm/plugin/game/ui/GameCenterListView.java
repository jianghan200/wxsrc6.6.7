package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Scroller;
import com.tencent.mm.plugin.game.f.e;

public class GameCenterListView
  extends ListView
{
  static boolean jVp;
  static int jVr;
  private View Iq;
  private boolean jVl;
  private float jVm;
  private int jVn;
  private boolean jVo;
  private boolean jVq;
  private ImageView jVs;
  private ImageView jVt;
  private Context mContext;
  private Scroller wf;
  
  public GameCenterListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
  }
  
  public static void setCanPulldown(boolean paramBoolean)
  {
    jVp = paramBoolean;
  }
  
  public static void setDefaultPadding(int paramInt)
  {
    jVr = paramInt;
  }
  
  public void computeScroll()
  {
    if (this.Iq == null) {}
    while (!this.wf.computeScrollOffset()) {
      return;
    }
    int i = this.wf.getCurrY();
    this.Iq.setPadding(0, i, 0, 0);
    float f = (jVr - i) / jVr * 255.0F;
    i = (int)f;
    int j = (int)f;
    this.jVt.setAlpha(255 - i);
    this.jVs.setAlpha(j);
    invalidate();
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((!jVp) || (this.Iq == null)) {
      return super.dispatchTouchEvent(paramMotionEvent);
    }
    switch (paramMotionEvent.getAction())
    {
    }
    int i;
    do
    {
      do
      {
        do
        {
          for (;;)
          {
            return super.dispatchTouchEvent(paramMotionEvent);
            this.jVq = false;
            this.jVm = paramMotionEvent.getRawY();
          }
        } while (!this.jVo);
        if (this.jVq) {
          return true;
        }
        i = (int)(paramMotionEvent.getRawY() - this.jVm);
        if (this.Iq.getPaddingTop() > jVr + this.jVn) {
          break;
        }
      } while ((i <= 0) || (Math.abs(i) < this.jVn));
      this.jVq = true;
      this.wf.startScroll(0, this.Iq.getPaddingTop(), 0, -this.Iq.getPaddingTop(), 500);
      this.jVs.setClickable(true);
      invalidate();
      paramMotionEvent.setAction(3);
      super.dispatchTouchEvent(paramMotionEvent);
      return true;
    } while ((this.Iq.getPaddingTop() < -this.jVn) || (i >= 0) || (Math.abs(i) < this.jVn));
    this.jVq = true;
    this.wf.startScroll(0, 0, 0, jVr, 500);
    invalidate();
    paramMotionEvent.setAction(3);
    super.dispatchTouchEvent(paramMotionEvent);
    return true;
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.jVn = ViewConfiguration.get(this.mContext).getScaledTouchSlop();
    this.wf = new Scroller(this.mContext);
    super.setOnScrollListener(new GameCenterListView.1(this));
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramBoolean) && (!this.jVl))
    {
      this.Iq = getChildAt(0);
      this.jVt = ((ImageView)this.Iq.findViewById(f.e.small_image));
      this.jVs = ((ImageView)this.Iq.findViewById(f.e.big_image));
      this.jVl = true;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameCenterListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */