package com.tencent.mm.plugin.setting.ui.setting;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

class NetStatUnit
  extends View
{
  protected static int max;
  private int mQb;
  private int total;
  
  public NetStatUnit(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public NetStatUnit(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public NetStatUnit(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void dr(int paramInt1, int paramInt2)
  {
    this.mQb = paramInt1;
    this.total = paramInt2;
    if (paramInt1 > 94371840) {
      this.mQb = 94371840;
    }
    if (paramInt2 > 94371840) {
      this.total = 94371840;
    }
    if (paramInt1 > paramInt2)
    {
      paramInt1 = (paramInt1 / 1572864 + 1) * 1572864;
      if (94371840 <= paramInt1) {
        break label78;
      }
      label55:
      if (3145728 >= paramInt1) {
        break label84;
      }
    }
    for (;;)
    {
      if (paramInt1 > max) {
        max = paramInt1;
      }
      return;
      paramInt1 = paramInt2;
      break;
      label78:
      paramInt1 = 94371840;
      break label55;
      label84:
      paramInt1 = 3145728;
    }
  }
  
  @SuppressLint({"DrawAllocation"})
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    Paint localPaint = new Paint();
    Rect localRect1 = new Rect();
    getDrawingRect(localRect1);
    float f1 = localRect1.height() * this.total / max;
    float f2 = localRect1.width();
    Rect localRect2 = new Rect(localRect1.left, (int)(localRect1.bottom - f1), (int)(f2 * 0.6F + localRect1.left), localRect1.bottom);
    localPaint.setColor(-7829368);
    paramCanvas.drawRect(localRect2, localPaint);
    f1 = localRect1.height() * this.mQb / max;
    f2 = localRect1.width();
    localRect1 = new Rect(localRect1.left, (int)(localRect1.bottom - f1), (int)(f2 * 0.6F + localRect1.left), localRect1.bottom);
    localPaint.setColor(-16711936);
    paramCanvas.drawRect(localRect1, localPaint);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/NetStatUnit.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */