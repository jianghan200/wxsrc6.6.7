package android.support.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.f;
import android.support.v4.view.z;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import java.util.List;

abstract class HeaderScrollingViewBehavior
  extends ViewOffsetBehavior<View>
{
  private final Rect ex = new Rect();
  private final Rect ey = new Rect();
  int ga = 0;
  int gb;
  
  public HeaderScrollingViewBehavior() {}
  
  public HeaderScrollingViewBehavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int j = paramView.getLayoutParams().height;
    if ((j == -1) || (j == -2))
    {
      View localView = e(paramCoordinatorLayout.m(paramView));
      if (localView != null)
      {
        if ((z.Z(localView)) && (!z.Z(paramView)))
        {
          z.a(paramView, true);
          if (z.Z(paramView))
          {
            paramView.requestLayout();
            return true;
          }
        }
        if (z.ai(localView))
        {
          int i = View.MeasureSpec.getSize(paramInt3);
          paramInt3 = i;
          if (i == 0) {
            paramInt3 = paramCoordinatorLayout.getHeight();
          }
          int k = localView.getMeasuredHeight();
          int m = f(localView);
          if (j == -1) {}
          for (i = 1073741824;; i = Integer.MIN_VALUE)
          {
            paramCoordinatorLayout.a(paramView, paramInt1, paramInt2, View.MeasureSpec.makeMeasureSpec(m + (paramInt3 - k), i), paramInt4);
            return true;
          }
        }
      }
    }
    return false;
  }
  
  protected final void d(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt)
  {
    View localView = e(paramCoordinatorLayout.m(paramView));
    if (localView != null)
    {
      CoordinatorLayout.d locald = (CoordinatorLayout.d)paramView.getLayoutParams();
      Rect localRect = this.ex;
      localRect.set(paramCoordinatorLayout.getPaddingLeft() + locald.leftMargin, localView.getBottom() + locald.topMargin, paramCoordinatorLayout.getWidth() - paramCoordinatorLayout.getPaddingRight() - locald.rightMargin, paramCoordinatorLayout.getHeight() + localView.getBottom() - paramCoordinatorLayout.getPaddingBottom() - locald.bottomMargin);
      paramCoordinatorLayout = this.ey;
      int j = locald.gravity;
      int i = j;
      if (j == 0) {
        i = 8388659;
      }
      f.apply(i, paramView.getMeasuredWidth(), paramView.getMeasuredHeight(), localRect, paramCoordinatorLayout, paramInt);
      paramInt = o(localView);
      paramView.layout(paramCoordinatorLayout.left, paramCoordinatorLayout.top - paramInt, paramCoordinatorLayout.right, paramCoordinatorLayout.bottom - paramInt);
      this.ga = (paramCoordinatorLayout.top - localView.getBottom());
      return;
    }
    super.d(paramCoordinatorLayout, paramView, paramInt);
    this.ga = 0;
  }
  
  float e(View paramView)
  {
    return 1.0F;
  }
  
  abstract View e(List<View> paramList);
  
  int f(View paramView)
  {
    return paramView.getMeasuredHeight();
  }
  
  final int o(View paramView)
  {
    if (this.gb == 0) {
      return 0;
    }
    return n.e(Math.round(e(paramView) * this.gb), 0, this.gb);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/android/support/design/widget/HeaderScrollingViewBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */