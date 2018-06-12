package android.support.v7.widget;

final class ag
{
  int Tu = 0;
  int Tv = 0;
  int Tw = Integer.MIN_VALUE;
  int Tx = 0;
  int Ty = 0;
  boolean Tz = false;
  boolean dx = false;
  int tK = Integer.MIN_VALUE;
  
  public final void aj(int paramInt1, int paramInt2)
  {
    this.Tw = paramInt1;
    this.tK = paramInt2;
    this.Tz = true;
    if (this.dx)
    {
      if (paramInt2 != Integer.MIN_VALUE) {
        this.Tu = paramInt2;
      }
      if (paramInt1 != Integer.MIN_VALUE) {
        this.Tv = paramInt1;
      }
    }
    do
    {
      return;
      if (paramInt1 != Integer.MIN_VALUE) {
        this.Tu = paramInt1;
      }
    } while (paramInt2 == Integer.MIN_VALUE);
    this.Tv = paramInt2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */