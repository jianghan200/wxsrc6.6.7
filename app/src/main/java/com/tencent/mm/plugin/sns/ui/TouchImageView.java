package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import junit.framework.Assert;

public class TouchImageView
  extends ImageView
{
  private int a = 90;
  private int b = 0;
  private boolean bKe = true;
  private int g = 0;
  ag nLo;
  Runnable nLp;
  private Rect ohZ = new Rect();
  private Paint oia = new Paint();
  private int r = 0;
  
  public TouchImageView(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public TouchImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  private void init()
  {
    this.nLo = new ag();
    this.nLp = new TouchImageView.1(this);
    super.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        if (!TouchImageView.a(TouchImageView.this)) {}
        for (;;)
        {
          return false;
          TouchImageView localTouchImageView = TouchImageView.this;
          switch (paramAnonymousMotionEvent.getAction())
          {
          }
          while ((!localTouchImageView.isClickable()) && (!localTouchImageView.isLongClickable()))
          {
            return true;
            paramAnonymousView.setPressed(true);
            paramAnonymousView.invalidate();
            localTouchImageView.nLo.removeCallbacks(localTouchImageView.nLp);
            continue;
            localTouchImageView.nLo.post(localTouchImageView.nLp);
          }
        }
      }
    });
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    x.d("MicroMsg.MaskImageView", "onAttachedToWindow");
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    x.d("MicroMsg.MaskImageView", "onDetachedFromWindow");
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (isPressed())
    {
      this.ohZ.left = getPaddingLeft();
      this.ohZ.top = getPaddingTop();
      this.ohZ.right = (getWidth() - getPaddingRight());
      this.ohZ.bottom = (getHeight() - getPaddingBottom());
      this.oia.setARGB(this.a, this.r, this.g, this.b);
      paramCanvas.drawRect(this.ohZ, this.oia);
    }
  }
  
  public void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    Assert.assertTrue(false);
  }
  
  public void settouchEnable(boolean paramBoolean)
  {
    this.bKe = paramBoolean;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/TouchImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */