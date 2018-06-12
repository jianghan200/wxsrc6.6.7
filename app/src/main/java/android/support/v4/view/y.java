package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.VelocityTracker;

public final class y
{
  static final c vH = new a();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      vH = new b();
      return;
    }
  }
  
  public static float a(VelocityTracker paramVelocityTracker, int paramInt)
  {
    return vH.a(paramVelocityTracker, paramInt);
  }
  
  public static float b(VelocityTracker paramVelocityTracker, int paramInt)
  {
    return vH.b(paramVelocityTracker, paramInt);
  }
  
  static final class a
    implements y.c
  {
    public final float a(VelocityTracker paramVelocityTracker, int paramInt)
    {
      return paramVelocityTracker.getXVelocity();
    }
    
    public final float b(VelocityTracker paramVelocityTracker, int paramInt)
    {
      return paramVelocityTracker.getYVelocity();
    }
  }
  
  static final class b
    implements y.c
  {
    public final float a(VelocityTracker paramVelocityTracker, int paramInt)
    {
      return paramVelocityTracker.getXVelocity(paramInt);
    }
    
    public final float b(VelocityTracker paramVelocityTracker, int paramInt)
    {
      return paramVelocityTracker.getYVelocity(paramInt);
    }
  }
  
  static abstract interface c
  {
    public abstract float a(VelocityTracker paramVelocityTracker, int paramInt);
    
    public abstract float b(VelocityTracker paramVelocityTracker, int paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/view/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */