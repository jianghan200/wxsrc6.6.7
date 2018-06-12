package android.support.v4.view;

import android.view.View;

final class ac
{
  private static void an(View paramView)
  {
    float f = paramView.getTranslationY();
    paramView.setTranslationY(1.0F + f);
    paramView.setTranslationY(f);
  }
  
  static void j(View paramView, int paramInt)
  {
    paramView.offsetTopAndBottom(paramInt);
    an(paramView);
    paramView = paramView.getParent();
    if ((paramView instanceof View)) {
      an((View)paramView);
    }
  }
  
  static void k(View paramView, int paramInt)
  {
    paramView.offsetLeftAndRight(paramInt);
    an(paramView);
    paramView = paramView.getParent();
    if ((paramView instanceof View)) {
      an((View)paramView);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/view/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */