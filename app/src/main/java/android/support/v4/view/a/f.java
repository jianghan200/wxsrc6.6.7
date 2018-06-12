package android.support.v4.view.a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityRecord;

public final class f
{
  public static final c xX = new e();
  public final Object xY;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      xX = new d();
      return;
    }
    if (Build.VERSION.SDK_INT >= 15)
    {
      xX = new b();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      xX = new a();
      return;
    }
  }
  
  public f(Object paramObject)
  {
    this.xY = paramObject;
  }
  
  public static f cw()
  {
    return new f(xX.cx());
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      do
      {
        return true;
        if (paramObject == null) {
          return false;
        }
        if (getClass() != paramObject.getClass()) {
          return false;
        }
        paramObject = (f)paramObject;
        if (this.xY != null) {
          break;
        }
      } while (((f)paramObject).xY == null);
      return false;
    } while (this.xY.equals(((f)paramObject).xY));
    return false;
  }
  
  public final int hashCode()
  {
    if (this.xY == null) {
      return 0;
    }
    return this.xY.hashCode();
  }
  
  public final void setFromIndex(int paramInt)
  {
    xX.d(this.xY, paramInt);
  }
  
  public final void setItemCount(int paramInt)
  {
    xX.e(this.xY, paramInt);
  }
  
  public final void setScrollable(boolean paramBoolean)
  {
    xX.g(this.xY, paramBoolean);
  }
  
  public final void setToIndex(int paramInt)
  {
    xX.h(this.xY, paramInt);
  }
  
  static class a
    extends f.e
  {
    public final Object cx()
    {
      return AccessibilityRecord.obtain();
    }
    
    public final void d(Object paramObject, int paramInt)
    {
      ((AccessibilityRecord)paramObject).setFromIndex(paramInt);
    }
    
    public final void e(Object paramObject, int paramInt)
    {
      ((AccessibilityRecord)paramObject).setItemCount(paramInt);
    }
    
    public final void f(Object paramObject, int paramInt)
    {
      ((AccessibilityRecord)paramObject).setScrollX(paramInt);
    }
    
    public final void g(Object paramObject, int paramInt)
    {
      ((AccessibilityRecord)paramObject).setScrollY(paramInt);
    }
    
    public final void g(Object paramObject, boolean paramBoolean)
    {
      ((AccessibilityRecord)paramObject).setScrollable(paramBoolean);
    }
    
    public final void h(Object paramObject, int paramInt)
    {
      ((AccessibilityRecord)paramObject).setToIndex(paramInt);
    }
  }
  
  static class b
    extends f.a
  {
    public final void i(Object paramObject, int paramInt)
    {
      ((AccessibilityRecord)paramObject).setMaxScrollX(paramInt);
    }
    
    public final void j(Object paramObject, int paramInt)
    {
      ((AccessibilityRecord)paramObject).setMaxScrollY(paramInt);
    }
  }
  
  public static abstract interface c
  {
    public abstract Object cx();
    
    public abstract void d(Object paramObject, int paramInt);
    
    public abstract void e(Object paramObject, int paramInt);
    
    public abstract void f(Object paramObject, int paramInt);
    
    public abstract void g(Object paramObject, int paramInt);
    
    public abstract void g(Object paramObject, boolean paramBoolean);
    
    public abstract void h(Object paramObject, int paramInt);
    
    public abstract void i(Object paramObject, int paramInt);
    
    public abstract void j(Object paramObject, int paramInt);
  }
  
  static final class d
    extends f.b
  {}
  
  static class e
    implements f.c
  {
    public Object cx()
    {
      return null;
    }
    
    public void d(Object paramObject, int paramInt) {}
    
    public void e(Object paramObject, int paramInt) {}
    
    public void f(Object paramObject, int paramInt) {}
    
    public void g(Object paramObject, int paramInt) {}
    
    public void g(Object paramObject, boolean paramBoolean) {}
    
    public void h(Object paramObject, int paramInt) {}
    
    public void i(Object paramObject, int paramInt) {}
    
    public void j(Object paramObject, int paramInt) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/view/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */