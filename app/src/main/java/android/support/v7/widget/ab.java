package android.support.v7.widget;

import android.view.View;

public abstract class ab
{
  protected final RecyclerView.h QG;
  int QH = Integer.MIN_VALUE;
  
  private ab(RecyclerView.h paramh)
  {
    this.QG = paramh;
  }
  
  public abstract int aU(View paramView);
  
  public abstract int aV(View paramView);
  
  public abstract int aW(View paramView);
  
  public abstract int aX(View paramView);
  
  public abstract void bj(int paramInt);
  
  public final int fr()
  {
    if (Integer.MIN_VALUE == this.QH) {
      return 0;
    }
    return fu() - this.QH;
  }
  
  public abstract int fs();
  
  public abstract int ft();
  
  public abstract int fu();
  
  public abstract int fv();
  
  public abstract int getEnd();
  
  public abstract int getEndPadding();
  
  public abstract int getMode();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/android/support/v7/widget/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */