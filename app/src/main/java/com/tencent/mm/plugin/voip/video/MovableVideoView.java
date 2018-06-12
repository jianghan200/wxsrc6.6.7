package com.tencent.mm.plugin.voip.video;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.mm.bp.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.s;

public class MovableVideoView
  extends OpenGlView
{
  private float bBS;
  private float bBT;
  private View.OnClickListener mOnClickListener;
  private int mScreenHeight = 0;
  private int mScreenWidth = 0;
  int mWidth = 320;
  int oTN = 240;
  private int oUe = 800;
  private int oUf = 480;
  private long oUg;
  
  public MovableVideoView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public MovableVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public final void dS(int paramInt1, int paramInt2)
  {
    this.mWidth = paramInt1;
    this.oTN = paramInt2;
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    WindowManager localWindowManager = (WindowManager)getContext().getSystemService("window");
    if (this.mScreenWidth == 0)
    {
      this.mScreenWidth = localWindowManager.getDefaultDisplay().getWidth();
      this.mScreenHeight = localWindowManager.getDefaultDisplay().getHeight();
    }
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(paramInt1, paramInt2);
    localLayoutParams.topMargin = (a.fromDPToPix(getContext(), 12) + s.gJ(getContext()));
    localLayoutParams.leftMargin = (this.mScreenWidth - this.mWidth - localLayoutParams.topMargin + s.gJ(getContext()));
    setLayoutParams(localLayoutParams);
    this.oUe = (this.mScreenHeight - this.oTN);
    this.oUf = (this.mScreenWidth - this.mWidth);
    localWindowManager.getDefaultDisplay().getMetrics(localDisplayMetrics);
  }
  
  public final void dT(int paramInt1, int paramInt2)
  {
    dS(paramInt1, paramInt2);
  }
  
  public final void dU(int paramInt1, int paramInt2)
  {
    RelativeLayout.LayoutParams localLayoutParams1 = (RelativeLayout.LayoutParams)getLayoutParams();
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(paramInt1, paramInt2);
    localLayoutParams2.leftMargin = localLayoutParams1.leftMargin;
    localLayoutParams2.topMargin = localLayoutParams1.topMargin;
    this.mWidth = paramInt1;
    this.oTN = paramInt2;
    setLayoutParams(localLayoutParams2);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int j = 0;
    x.d("MicroMsg.MovableVideoView", "event: " + paramMotionEvent.getAction());
    switch (paramMotionEvent.getAction())
    {
    default: 
    case 0: 
    case 2: 
      float f1;
      float f2;
      do
      {
        return true;
        this.bBS = paramMotionEvent.getRawX();
        this.bBT = paramMotionEvent.getRawY();
        this.oUg = System.currentTimeMillis();
        return true;
        f1 = paramMotionEvent.getRawX() - this.bBS;
        f2 = paramMotionEvent.getRawY() - this.bBT;
      } while ((Math.abs(f1) <= 1.0F) && (Math.abs(f2) <= 1.0F));
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)getLayoutParams();
      int m = (int)(f1 + localLayoutParams.leftMargin);
      int k = (int)(f2 + localLayoutParams.topMargin);
      int i;
      if (m < 0)
      {
        i = 0;
        localLayoutParams.leftMargin = i;
        if (k >= 0) {
          break label229;
        }
        i = j;
      }
      for (;;)
      {
        localLayoutParams.topMargin = i;
        setLayoutParams(localLayoutParams);
        this.bBS = paramMotionEvent.getRawX();
        this.bBT = paramMotionEvent.getRawY();
        return true;
        i = m;
        if (m <= this.oUf) {
          break;
        }
        i = this.oUf;
        break;
        label229:
        if (k > this.oUe) {
          i = this.oUe;
        } else {
          i = k;
        }
      }
    }
    long l = System.currentTimeMillis();
    if ((this.oUg != 0L) && (l - this.oUg < 300L) && (l - this.oUg >= 0L) && (this.mOnClickListener != null)) {
      this.mOnClickListener.onClick(this);
    }
    h.mEJ.h(11079, new Object[] { Integer.valueOf(2) });
    return true;
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.mOnClickListener = paramOnClickListener;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/voip/video/MovableVideoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */