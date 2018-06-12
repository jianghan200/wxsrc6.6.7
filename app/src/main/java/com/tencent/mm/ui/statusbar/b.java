package com.tencent.mm.ui.statusbar;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.os.Build.VERSION;
import android.view.Window;
import android.widget.FrameLayout;

public class b
  extends FrameLayout
  implements c.a
{
  static final boolean uuP = c.uuT;
  private final Paint cN;
  private int gwO;
  private final Activity mActivity;
  private int uuQ;
  private int uuR;
  private boolean uuS = false;
  
  public b(Context paramContext)
  {
    super(paramContext);
    if (uuP)
    {
      this.mActivity = d.cJ(paramContext);
      c.ab(this.mActivity).a(this);
      this.cN = new Paint(1);
      this.cN.setStyle(Paint.Style.FILL);
      setWillNotDraw(false);
      return;
    }
    this.mActivity = null;
    this.cN = null;
  }
  
  private void Ge(int paramInt)
  {
    this.gwO = Math.max(0, paramInt);
    if (this.uuS) {}
    for (paramInt = 0;; paramInt = this.gwO)
    {
      setPadding(0, paramInt, 0, 0);
      postInvalidate();
      return;
    }
  }
  
  public final void ar(int paramInt, boolean paramBoolean)
  {
    int j = 0;
    this.uuQ = paramInt;
    if (!uuP) {
      return;
    }
    Object localObject = this.mActivity.getWindow();
    d.a((Window)localObject);
    if ((Build.VERSION.SDK_INT >= 23) && (d.a((Window)localObject, paramBoolean))) {
      this.uuQ = paramInt;
    }
    for (;;)
    {
      localObject = this;
      paramInt = j;
      for (;;)
      {
        ((b)localObject).uuR = paramInt;
        do
        {
          postInvalidate();
          return;
        } while (Build.VERSION.SDK_INT < 21);
        int i = paramInt;
        if (paramBoolean) {
          i = d.AD(paramInt);
        }
        this.uuQ = i;
        if (!paramBoolean) {
          break;
        }
        paramInt = Color.argb(51, 0, 0, 0);
        localObject = this;
      }
    }
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    if ((this.gwO <= 0) || (!uuP) || (this.uuS)) {}
    for (;;)
    {
      super.dispatchDraw(paramCanvas);
      if ((this.gwO > 0) && (uuP) && (this.uuS)) {
        break;
      }
      return;
      this.cN.setColor(this.uuQ);
      paramCanvas.drawRect(0.0F, 0.0F, getWidth(), this.gwO, this.cN);
    }
    this.cN.setColor(this.uuR);
    paramCanvas.drawRect(0.0F, 0.0F, getWidth(), this.gwO, this.cN);
  }
  
  public final void dl(boolean paramBoolean)
  {
    this.uuS = paramBoolean;
    Ge(this.gwO);
  }
  
  public final void lH(int paramInt)
  {
    Ge(paramInt);
  }
  
  public void setStatusBarColor(int paramInt)
  {
    if (!uuP) {
      return;
    }
    ar(paramInt, d.c(this.mActivity.getWindow()));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/statusbar/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */