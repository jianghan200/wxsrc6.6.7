package android.support.v4.view;

import android.view.WindowInsets;

final class aq
  extends ap
{
  final WindowInsets xp;
  
  aq(WindowInsets paramWindowInsets)
  {
    this.xp = paramWindowInsets;
  }
  
  public final ap co()
  {
    return new aq(this.xp.consumeSystemWindowInsets());
  }
  
  public final ap f(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return new aq(this.xp.replaceSystemWindowInsets(paramInt1, paramInt2, paramInt3, paramInt4));
  }
  
  public final int getSystemWindowInsetBottom()
  {
    return this.xp.getSystemWindowInsetBottom();
  }
  
  public final int getSystemWindowInsetLeft()
  {
    return this.xp.getSystemWindowInsetLeft();
  }
  
  public final int getSystemWindowInsetRight()
  {
    return this.xp.getSystemWindowInsetRight();
  }
  
  public final int getSystemWindowInsetTop()
  {
    return this.xp.getSystemWindowInsetTop();
  }
  
  public final boolean isConsumed()
  {
    return this.xp.isConsumed();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/view/aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */