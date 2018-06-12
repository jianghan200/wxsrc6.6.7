package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.widget.EdgeEffect;

public final class i
{
  private static final c zY = new a();
  private Object zX;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21)
    {
      zY = new d();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      zY = new b();
      return;
    }
  }
  
  public i(Context paramContext)
  {
    this.zX = zY.Q(paramContext);
  }
  
  public final boolean A(float paramFloat)
  {
    return zY.a(this.zX, paramFloat);
  }
  
  public final boolean at(int paramInt)
  {
    return zY.k(this.zX, paramInt);
  }
  
  public final boolean cI()
  {
    return zY.L(this.zX);
  }
  
  public final boolean draw(Canvas paramCanvas)
  {
    return zY.a(this.zX, paramCanvas);
  }
  
  public final void finish()
  {
    zY.K(this.zX);
  }
  
  public final boolean isFinished()
  {
    return zY.J(this.zX);
  }
  
  public final boolean s(float paramFloat1, float paramFloat2)
  {
    return zY.a(this.zX, paramFloat1, paramFloat2);
  }
  
  public final void setSize(int paramInt1, int paramInt2)
  {
    zY.a(this.zX, paramInt1, paramInt2);
  }
  
  static final class a
    implements i.c
  {
    public final boolean J(Object paramObject)
    {
      return true;
    }
    
    public final void K(Object paramObject) {}
    
    public final boolean L(Object paramObject)
    {
      return false;
    }
    
    public final Object Q(Context paramContext)
    {
      return null;
    }
    
    public final void a(Object paramObject, int paramInt1, int paramInt2) {}
    
    public final boolean a(Object paramObject, float paramFloat)
    {
      return false;
    }
    
    public final boolean a(Object paramObject, float paramFloat1, float paramFloat2)
    {
      return false;
    }
    
    public final boolean a(Object paramObject, Canvas paramCanvas)
    {
      return false;
    }
    
    public final boolean k(Object paramObject, int paramInt)
    {
      return false;
    }
  }
  
  static class b
    implements i.c
  {
    public final boolean J(Object paramObject)
    {
      return ((EdgeEffect)paramObject).isFinished();
    }
    
    public final void K(Object paramObject)
    {
      ((EdgeEffect)paramObject).finish();
    }
    
    public final boolean L(Object paramObject)
    {
      paramObject = (EdgeEffect)paramObject;
      ((EdgeEffect)paramObject).onRelease();
      return ((EdgeEffect)paramObject).isFinished();
    }
    
    public final Object Q(Context paramContext)
    {
      return new EdgeEffect(paramContext);
    }
    
    public final void a(Object paramObject, int paramInt1, int paramInt2)
    {
      ((EdgeEffect)paramObject).setSize(paramInt1, paramInt2);
    }
    
    public final boolean a(Object paramObject, float paramFloat)
    {
      return j.a(paramObject, paramFloat);
    }
    
    public boolean a(Object paramObject, float paramFloat1, float paramFloat2)
    {
      return j.a(paramObject, paramFloat1);
    }
    
    public final boolean a(Object paramObject, Canvas paramCanvas)
    {
      return ((EdgeEffect)paramObject).draw(paramCanvas);
    }
    
    public final boolean k(Object paramObject, int paramInt)
    {
      ((EdgeEffect)paramObject).onAbsorb(paramInt);
      return true;
    }
  }
  
  static abstract interface c
  {
    public abstract boolean J(Object paramObject);
    
    public abstract void K(Object paramObject);
    
    public abstract boolean L(Object paramObject);
    
    public abstract Object Q(Context paramContext);
    
    public abstract void a(Object paramObject, int paramInt1, int paramInt2);
    
    public abstract boolean a(Object paramObject, float paramFloat);
    
    public abstract boolean a(Object paramObject, float paramFloat1, float paramFloat2);
    
    public abstract boolean a(Object paramObject, Canvas paramCanvas);
    
    public abstract boolean k(Object paramObject, int paramInt);
  }
  
  static final class d
    extends i.b
  {
    public final boolean a(Object paramObject, float paramFloat1, float paramFloat2)
    {
      ((EdgeEffect)paramObject).onPull(paramFloat1, paramFloat2);
      return true;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/widget/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */