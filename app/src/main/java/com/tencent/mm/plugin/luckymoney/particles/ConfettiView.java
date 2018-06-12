package com.tencent.mm.plugin.luckymoney.particles;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import com.tencent.mm.plugin.luckymoney.particles.a.b;
import com.tencent.mm.plugin.wxpay.a.d;
import java.util.Iterator;
import java.util.List;

public class ConfettiView
  extends View
  implements View.OnLayoutChangeListener
{
  List<b> kRX;
  private boolean kSH;
  private b kSI;
  boolean terminated;
  
  public ConfettiView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public static ConfettiView dN(Context paramContext)
  {
    ConfettiView localConfettiView = new ConfettiView(paramContext, null);
    localConfettiView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    if (Build.VERSION.SDK_INT >= 21) {
      localConfettiView.setElevation(paramContext.getResources().getDimensionPixelOffset(a.d.confetti_default_elevation));
    }
    return localConfettiView;
  }
  
  public final void bbe()
  {
    if (!this.terminated)
    {
      this.terminated = true;
      getParent().requestLayout();
    }
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    ViewGroup localViewGroup = (ViewGroup)getParent();
    localViewGroup.removeOnLayoutChangeListener(this);
    localViewGroup.addOnLayoutChangeListener(this);
    if (this.kRX == null) {
      bbe();
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (!this.terminated)
    {
      paramCanvas.save();
      Iterator localIterator = this.kRX.iterator();
      while (localIterator.hasNext())
      {
        b localb = (b)localIterator.next();
        if (localb.kTe) {
          localb.a(paramCanvas, localb.kTg + localb.kTi, localb.kTh + localb.kTj, localb.kTc);
        } else if ((localb.kTd) && (!localb.terminated)) {
          localb.a(paramCanvas, localb.kTa, localb.kTb, localb.kTc);
        }
      }
      paramCanvas.restore();
    }
  }
  
  public void onLayoutChange(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    if (this.terminated)
    {
      paramView = getParent();
      if ((paramView != null) && ((paramView instanceof ViewGroup)))
      {
        paramView = (ViewGroup)paramView;
        paramView.removeViewInLayout(this);
        paramView.removeOnLayoutChangeListener(this);
        paramView.invalidate();
      }
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.kSH) {}
    int i;
    switch (paramMotionEvent.getAction())
    {
    default: 
      i = 0;
    }
    for (;;)
    {
      if ((i == 0) && (!super.onTouchEvent(paramMotionEvent))) {
        break label446;
      }
      return true;
      Object localObject = this.kRX.iterator();
      label158:
      label248:
      label252:
      for (;;)
      {
        if (!((Iterator)localObject).hasNext()) {
          break label254;
        }
        b localb = (b)((Iterator)localObject).next();
        float f1 = paramMotionEvent.getX();
        float f2 = paramMotionEvent.getY();
        if ((localb.kTa <= f1) && (f1 <= localb.kTa + localb.getWidth()) && (localb.kTb <= f2) && (f2 <= localb.kTb + localb.getHeight()))
        {
          i = 1;
          if (i == 0) {
            break label248;
          }
          localb.kTe = true;
          localb.kTg = f1;
          localb.kTh = f2;
          localb.kTi = (localb.kTa - f1);
          localb.kTj = (localb.kTb - f2);
          localb.kTf = VelocityTracker.obtain();
          localb.kTf.addMovement(paramMotionEvent);
        }
        for (i = 1;; i = 0)
        {
          if (i == 0) {
            break label252;
          }
          this.kSI = localb;
          i = 1;
          break;
          i = 0;
          break label158;
        }
      }
      label254:
      i = 0;
      continue;
      if (this.kSI == null) {
        break;
      }
      localObject = this.kSI;
      ((b)localObject).kTg = paramMotionEvent.getX();
      ((b)localObject).kTh = paramMotionEvent.getY();
      ((b)localObject).kTf.addMovement(paramMotionEvent);
      i = 1;
      continue;
      if (this.kSI == null) {
        break;
      }
      localObject = this.kSI;
      ((b)localObject).kTf.addMovement(paramMotionEvent);
      ((b)localObject).kTf.computeCurrentVelocity(1);
      ((b)localObject).kSO = -1L;
      ((b)localObject).kSP = (paramMotionEvent.getX() + ((b)localObject).kTi);
      ((b)localObject).kSQ = (paramMotionEvent.getY() + ((b)localObject).kTj);
      ((b)localObject).kSR = ((b)localObject).kTf.getXVelocity();
      ((b)localObject).kSS = ((b)localObject).kTf.getYVelocity();
      ((b)localObject).kSV = ((b)localObject).kTc;
      ((b)localObject).kTf.recycle();
      ((b)localObject).i(((b)localObject).kSe);
      ((b)localObject).kTe = false;
      this.kSI = null;
      i = 1;
    }
    label446:
    return false;
  }
  
  public void setTouchEnabled(boolean paramBoolean)
  {
    this.kSH = paramBoolean;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/particles/ConfettiView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */