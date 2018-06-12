package android.support.v7.app;

import android.support.v4.widget.DrawerLayout.f;

public final class a
  implements DrawerLayout.f
{
  private final a CN;
  private boolean CO;
  private final int CP;
  private final int CQ;
  
  private void aD(int paramInt)
  {
    this.CN.aD(paramInt);
  }
  
  public final void cE()
  {
    if (this.CO) {
      aD(this.CQ);
    }
  }
  
  public final void cF()
  {
    if (this.CO) {
      aD(this.CP);
    }
  }
  
  public final void z(float paramFloat)
  {
    Math.min(1.0F, Math.max(0.0F, paramFloat));
  }
  
  public static abstract interface a
  {
    public abstract void aD(int paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/app/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */