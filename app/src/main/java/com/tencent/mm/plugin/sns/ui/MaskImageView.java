package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.sdk.platformtools.ag;

public class MaskImageView
  extends TagImageView
{
  private int a = 90;
  private int b = 0;
  private boolean bKe = true;
  private int g = 0;
  private ag nLo = new ag(Looper.getMainLooper());
  private Runnable nLp = new MaskImageView.1(this);
  private int r = 0;
  
  public MaskImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    super.setOnTouchListener(new MaskImageView.2(this));
    super.setContentDescription(getContext().getResources().getString(i.j.sns_img));
  }
  
  public final boolean d(View paramView, MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    }
    while ((!isClickable()) && (!isLongClickable()))
    {
      return true;
      paramView.setPressed(true);
      paramView.invalidate();
      this.nLo.removeCallbacks(this.nLp);
      continue;
      this.nLo.post(this.nLp);
    }
    return false;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (isPressed()) {
      paramCanvas.drawARGB(this.a, this.r, this.g, this.b);
    }
  }
  
  public void settouchEnable(boolean paramBoolean)
  {
    this.bKe = paramBoolean;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/MaskImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */