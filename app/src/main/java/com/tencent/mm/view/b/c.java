package com.tencent.mm.view.b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.tencent.mm.bi.b;

public final class c
  extends a
{
  public c(Context paramContext, b paramb)
  {
    super(paramContext, paramb);
  }
  
  protected final boolean cCf()
  {
    return false;
  }
  
  public final boolean cCg()
  {
    return false;
  }
  
  public final Rect getAliveRect()
  {
    if (super.getAliveRect().isEmpty()) {
      return getBoardRect();
    }
    return super.getAliveRect();
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    paramCanvas.drawColor(0);
    paramCanvas.setMatrix(this.bBo);
    getPresenter().onDraw(paramCanvas);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/view/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */