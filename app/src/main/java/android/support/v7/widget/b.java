package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

class b
  extends Drawable
{
  final ActionBarContainer Jx;
  
  public b(ActionBarContainer paramActionBarContainer)
  {
    this.Jx = paramActionBarContainer;
  }
  
  public void draw(Canvas paramCanvas)
  {
    if (this.Jx.JE) {
      if (this.Jx.JD != null) {
        this.Jx.JD.draw(paramCanvas);
      }
    }
    do
    {
      return;
      if (this.Jx.HS != null) {
        this.Jx.HS.draw(paramCanvas);
      }
    } while ((this.Jx.JC == null) || (!this.Jx.JF));
    this.Jx.JC.draw(paramCanvas);
  }
  
  public int getOpacity()
  {
    return 0;
  }
  
  public void setAlpha(int paramInt) {}
  
  public void setColorFilter(ColorFilter paramColorFilter) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */