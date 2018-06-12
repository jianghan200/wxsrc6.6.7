package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import junit.framework.Assert;

public class AsyncMaskImageView
  extends ImageView
{
  private int a = 90;
  private int b = 0;
  private boolean bKe = true;
  private int g = 0;
  ag nLo = new ag();
  Runnable nLp = new AsyncMaskImageView.1(this);
  private int r = 0;
  
  public AsyncMaskImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    super.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        if (!AsyncMaskImageView.a(AsyncMaskImageView.this)) {}
        for (;;)
        {
          return false;
          AsyncMaskImageView localAsyncMaskImageView = AsyncMaskImageView.this;
          switch (paramAnonymousMotionEvent.getAction())
          {
          }
          while ((!localAsyncMaskImageView.isClickable()) && (!localAsyncMaskImageView.isLongClickable()))
          {
            return true;
            paramAnonymousView.setPressed(true);
            paramAnonymousView.invalidate();
            localAsyncMaskImageView.nLo.removeCallbacks(localAsyncMaskImageView.nLp);
            continue;
            localAsyncMaskImageView.nLo.post(localAsyncMaskImageView.nLp);
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
    if (isPressed()) {
      paramCanvas.drawARGB(this.a, this.r, this.g, this.b);
    }
  }
  
  @Deprecated
  public void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    Assert.assertTrue(false);
  }
  
  public void settouchEnable(boolean paramBoolean)
  {
    this.bKe = paramBoolean;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/AsyncMaskImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */