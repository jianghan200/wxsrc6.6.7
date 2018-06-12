package android.support.v4.widget;

import android.os.Build.VERSION;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

public final class m
{
  static final f AW = new c();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23)
    {
      AW = new b();
      return;
    }
    if (i >= 21)
    {
      AW = new a();
      return;
    }
    if (i >= 19)
    {
      AW = new e();
      return;
    }
    if (i >= 9)
    {
      AW = new d();
      return;
    }
  }
  
  public static void a(PopupWindow paramPopupWindow, int paramInt)
  {
    AW.a(paramPopupWindow, paramInt);
  }
  
  public static void a(PopupWindow paramPopupWindow, View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    AW.a(paramPopupWindow, paramView, paramInt1, paramInt2, paramInt3);
  }
  
  public static void a(PopupWindow paramPopupWindow, boolean paramBoolean)
  {
    AW.a(paramPopupWindow, paramBoolean);
  }
  
  static class a
    extends m.e
  {
    public void a(PopupWindow paramPopupWindow, boolean paramBoolean)
    {
      n.a(paramPopupWindow, paramBoolean);
    }
  }
  
  static final class b
    extends m.a
  {
    public final void a(PopupWindow paramPopupWindow, int paramInt)
    {
      paramPopupWindow.setWindowLayoutType(paramInt);
    }
    
    public final void a(PopupWindow paramPopupWindow, boolean paramBoolean)
    {
      paramPopupWindow.setOverlapAnchor(paramBoolean);
    }
  }
  
  static class c
    implements m.f
  {
    public void a(PopupWindow paramPopupWindow, int paramInt) {}
    
    public void a(PopupWindow paramPopupWindow, View paramView, int paramInt1, int paramInt2, int paramInt3)
    {
      paramPopupWindow.showAsDropDown(paramView, paramInt1, paramInt2);
    }
    
    public void a(PopupWindow paramPopupWindow, boolean paramBoolean) {}
  }
  
  static class d
    extends m.c
  {
    public void a(PopupWindow paramPopupWindow, int paramInt)
    {
      if (!o.AZ) {}
      try
      {
        Method localMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", new Class[] { Integer.TYPE });
        o.AY = localMethod;
        localMethod.setAccessible(true);
        o.AZ = true;
        if (o.AY != null) {}
        try
        {
          o.AY.invoke(paramPopupWindow, new Object[] { Integer.valueOf(paramInt) });
          return;
        }
        catch (Exception paramPopupWindow) {}
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
  
  static class e
    extends m.d
  {
    public final void a(PopupWindow paramPopupWindow, View paramView, int paramInt1, int paramInt2, int paramInt3)
    {
      paramPopupWindow.showAsDropDown(paramView, paramInt1, paramInt2, paramInt3);
    }
  }
  
  static abstract interface f
  {
    public abstract void a(PopupWindow paramPopupWindow, int paramInt);
    
    public abstract void a(PopupWindow paramPopupWindow, View paramView, int paramInt1, int paramInt2, int paramInt3);
    
    public abstract void a(PopupWindow paramPopupWindow, boolean paramBoolean);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/widget/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */