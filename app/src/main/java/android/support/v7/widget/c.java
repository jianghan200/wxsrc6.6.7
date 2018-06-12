package android.support.v7.widget;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;

final class c
  extends b
{
  public c(ActionBarContainer paramActionBarContainer)
  {
    super(paramActionBarContainer);
  }
  
  public final void getOutline(Outline paramOutline)
  {
    if (this.Jx.JE) {
      if (this.Jx.JD != null) {
        this.Jx.JD.getOutline(paramOutline);
      }
    }
    while (this.Jx.HS == null) {
      return;
    }
    this.Jx.HS.getOutline(paramOutline);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */