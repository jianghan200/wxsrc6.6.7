package android.support.v4.view.a;

import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.List;

public final class c
{
  private static final a xQ = new d();
  public final Object xR;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      xQ = new c();
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      xQ = new b();
      return;
    }
  }
  
  public c()
  {
    this.xR = xQ.a(this);
  }
  
  public c(Object paramObject)
  {
    this.xR = paramObject;
  }
  
  public static b cq()
  {
    return null;
  }
  
  public static boolean cr()
  {
    return false;
  }
  
  public static List<b> cs()
  {
    return null;
  }
  
  public static b ct()
  {
    return null;
  }
  
  static abstract interface a
  {
    public abstract Object a(c paramc);
  }
  
  static final class b
    extends c.d
  {
    public final Object a(final c paramc)
    {
      new d.1(new d.a()
      {
        public final boolean cr()
        {
          return c.cr();
        }
        
        public final List<Object> cs()
        {
          c.cs();
          new ArrayList();
          throw new NullPointerException();
        }
        
        public final Object cu()
        {
          c.cq();
          return null;
        }
      });
    }
  }
  
  static final class c
    extends c.d
  {
    public final Object a(final c paramc)
    {
      new e.1(new e.a()
      {
        public final boolean cr()
        {
          return c.cr();
        }
        
        public final List<Object> cs()
        {
          c.cs();
          new ArrayList();
          throw new NullPointerException();
        }
        
        public final Object cu()
        {
          c.cq();
          return null;
        }
        
        public final Object cv()
        {
          c.ct();
          return null;
        }
      });
    }
  }
  
  static class d
    implements c.a
  {
    public Object a(c paramc)
    {
      return null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/view/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */