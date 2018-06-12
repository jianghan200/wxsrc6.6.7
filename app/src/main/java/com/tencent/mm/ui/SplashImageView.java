package com.tencent.mm.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.mm.R.g;
import com.tencent.mm.ui.chatting.ap;

public class SplashImageView
  extends ImageView
{
  private boolean hasDrawed;
  private ap tqv;
  
  public SplashImageView(Context paramContext)
  {
    super(paramContext);
    setImageResource(R.g.welcome_bg);
  }
  
  public SplashImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setImageResource(R.g.welcome_bg);
  }
  
  public SplashImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setImageResource(R.g.welcome_bg);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (!this.hasDrawed)
    {
      this.hasDrawed = true;
      if (this.tqv != null) {
        this.tqv.aRL();
      }
    }
  }
  
  public void setOnDrawListener(ap paramap)
  {
    this.tqv = paramap;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/SplashImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */