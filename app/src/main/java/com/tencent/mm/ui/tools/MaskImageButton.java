package com.tencent.mm.ui.tools;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.tencent.mm.sdk.platformtools.ag;

public class MaskImageButton
  extends ImageButton
{
  private int a = 90;
  private int b = 0;
  private int g = 0;
  private ag nLo = new ag(Looper.getMainLooper());
  private Runnable nLp = new Runnable()
  {
    public final void run()
    {
      MaskImageButton.this.setPressed(false);
      MaskImageButton.this.invalidate();
    }
  };
  private int r = 0;
  public Object uAL;
  
  public MaskImageButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    super.setOnTouchListener(new MaskImageButton.2(this));
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (isPressed()) {
      paramCanvas.drawARGB(this.a, this.r, this.g, this.b);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/tools/MaskImageButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */