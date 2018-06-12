package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowInsets;

final class g
{
  private static final int[] zW = { 16843828 };
  
  public static int I(Object paramObject)
  {
    if (paramObject != null) {
      return ((WindowInsets)paramObject).getSystemWindowInsetTop();
    }
    return 0;
  }
  
  public static Drawable P(Context paramContext)
  {
    paramContext = paramContext.obtainStyledAttributes(zW);
    try
    {
      Drawable localDrawable = paramContext.getDrawable(0);
      return localDrawable;
    }
    finally
    {
      paramContext.recycle();
    }
  }
  
  public static void a(View paramView, Object paramObject, int paramInt)
  {
    WindowInsets localWindowInsets = (WindowInsets)paramObject;
    if (paramInt == 3) {
      paramObject = localWindowInsets.replaceSystemWindowInsets(localWindowInsets.getSystemWindowInsetLeft(), localWindowInsets.getSystemWindowInsetTop(), 0, localWindowInsets.getSystemWindowInsetBottom());
    }
    for (;;)
    {
      paramView.dispatchApplyWindowInsets((WindowInsets)paramObject);
      return;
      paramObject = localWindowInsets;
      if (paramInt == 5) {
        paramObject = localWindowInsets.replaceSystemWindowInsets(0, localWindowInsets.getSystemWindowInsetTop(), localWindowInsets.getSystemWindowInsetRight(), localWindowInsets.getSystemWindowInsetBottom());
      }
    }
  }
  
  public static void a(ViewGroup.MarginLayoutParams paramMarginLayoutParams, Object paramObject, int paramInt)
  {
    WindowInsets localWindowInsets = (WindowInsets)paramObject;
    if (paramInt == 3) {
      paramObject = localWindowInsets.replaceSystemWindowInsets(localWindowInsets.getSystemWindowInsetLeft(), localWindowInsets.getSystemWindowInsetTop(), 0, localWindowInsets.getSystemWindowInsetBottom());
    }
    for (;;)
    {
      paramMarginLayoutParams.leftMargin = ((WindowInsets)paramObject).getSystemWindowInsetLeft();
      paramMarginLayoutParams.topMargin = ((WindowInsets)paramObject).getSystemWindowInsetTop();
      paramMarginLayoutParams.rightMargin = ((WindowInsets)paramObject).getSystemWindowInsetRight();
      paramMarginLayoutParams.bottomMargin = ((WindowInsets)paramObject).getSystemWindowInsetBottom();
      return;
      paramObject = localWindowInsets;
      if (paramInt == 5) {
        paramObject = localWindowInsets.replaceSystemWindowInsets(0, localWindowInsets.getSystemWindowInsetTop(), localWindowInsets.getSystemWindowInsetRight(), localWindowInsets.getSystemWindowInsetBottom());
      }
    }
  }
  
  public static void aA(View paramView)
  {
    if ((paramView instanceof h))
    {
      paramView.setOnApplyWindowInsetsListener(new a());
      paramView.setSystemUiVisibility(1280);
    }
  }
  
  static final class a
    implements View.OnApplyWindowInsetsListener
  {
    public final WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
    {
      paramView = (h)paramView;
      if (paramWindowInsets.getSystemWindowInsetTop() > 0) {}
      for (boolean bool = true;; bool = false)
      {
        paramView.k(paramWindowInsets, bool);
        return paramWindowInsets.consumeSystemWindowInsets();
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/widget/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */