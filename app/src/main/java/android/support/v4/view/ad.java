package android.support.v4.view;

import android.graphics.Rect;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

final class ad
{
  private static ThreadLocal<Rect> vR;
  
  static Rect cd()
  {
    if (vR == null) {
      vR = new ThreadLocal();
    }
    Rect localRect2 = (Rect)vR.get();
    Rect localRect1 = localRect2;
    if (localRect2 == null)
    {
      localRect1 = new Rect();
      vR.set(localRect1);
    }
    localRect1.setEmpty();
    return localRect1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/view/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */