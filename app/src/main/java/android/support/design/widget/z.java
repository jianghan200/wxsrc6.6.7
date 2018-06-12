package android.support.design.widget;

import android.view.View;

final class z
{
  private int jj;
  private int jk;
  int jl;
  int jm;
  private final View mView;
  
  public z(View paramView)
  {
    this.mView = paramView;
  }
  
  public final void aS()
  {
    this.jj = this.mView.getTop();
    this.jk = this.mView.getLeft();
    aT();
  }
  
  final void aT()
  {
    android.support.v4.view.z.j(this.mView, this.jl - (this.mView.getTop() - this.jj));
    android.support.v4.view.z.k(this.mView, this.jm - (this.mView.getLeft() - this.jk));
  }
  
  public final boolean p(int paramInt)
  {
    if (this.jl != paramInt)
    {
      this.jl = paramInt;
      aT();
      return true;
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/android/support/design/widget/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */