package android.support.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

class ViewOffsetBehavior<V extends View>
  extends CoordinatorLayout.Behavior<V>
{
  private z jg;
  private int jh = 0;
  private int ji = 0;
  
  public ViewOffsetBehavior() {}
  
  public ViewOffsetBehavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public int T()
  {
    if (this.jg != null) {
      return this.jg.jl;
    }
    return 0;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt)
  {
    d(paramCoordinatorLayout, paramV, paramInt);
    if (this.jg == null) {
      this.jg = new z(paramV);
    }
    this.jg.aS();
    if (this.jh != 0)
    {
      this.jg.p(this.jh);
      this.jh = 0;
    }
    if (this.ji != 0)
    {
      paramCoordinatorLayout = this.jg;
      paramInt = this.ji;
      if (paramCoordinatorLayout.jm != paramInt)
      {
        paramCoordinatorLayout.jm = paramInt;
        paramCoordinatorLayout.aT();
      }
      this.ji = 0;
    }
    return true;
  }
  
  protected void d(CoordinatorLayout paramCoordinatorLayout, V paramV, int paramInt)
  {
    paramCoordinatorLayout.e(paramV, paramInt);
  }
  
  public boolean p(int paramInt)
  {
    if (this.jg != null) {
      return this.jg.p(paramInt);
    }
    this.jh = paramInt;
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/android/support/design/widget/ViewOffsetBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */