package com.davemorrissey.labs.subscaleview.view;

import android.graphics.PointF;
import java.io.Serializable;

public final class b
  implements Serializable
{
  private float centerX;
  private float centerY;
  int orientation;
  float scale;
  
  public b(float paramFloat, PointF paramPointF, int paramInt)
  {
    this.scale = paramFloat;
    this.centerX = paramPointF.x;
    this.centerY = paramPointF.y;
    this.orientation = paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/davemorrissey/labs/subscaleview/view/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */