package android.support.v4.b.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

public final class a
{
  static final b rp = new a();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23)
    {
      rp = new h();
      return;
    }
    if (i >= 21)
    {
      rp = new g();
      return;
    }
    if (i >= 19)
    {
      rp = new f();
      return;
    }
    if (i >= 17)
    {
      rp = new e();
      return;
    }
    if (i >= 11)
    {
      rp = new d();
      return;
    }
    if (i >= 5)
    {
      rp = new c();
      return;
    }
  }
  
  public static void a(Drawable paramDrawable, float paramFloat1, float paramFloat2)
  {
    rp.a(paramDrawable, paramFloat1, paramFloat2);
  }
  
  public static void a(Drawable paramDrawable, int paramInt)
  {
    rp.a(paramDrawable, paramInt);
  }
  
  public static void a(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    rp.a(paramDrawable, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void a(Drawable paramDrawable, ColorStateList paramColorStateList)
  {
    rp.a(paramDrawable, paramColorStateList);
  }
  
  public static void a(Drawable paramDrawable, Resources.Theme paramTheme)
  {
    rp.a(paramDrawable, paramTheme);
  }
  
  public static void a(Drawable paramDrawable, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    rp.a(paramDrawable, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
  }
  
  public static void a(Drawable paramDrawable, PorterDuff.Mode paramMode)
  {
    rp.a(paramDrawable, paramMode);
  }
  
  public static void a(Drawable paramDrawable, boolean paramBoolean)
  {
    rp.a(paramDrawable, paramBoolean);
  }
  
  public static void b(Drawable paramDrawable)
  {
    rp.b(paramDrawable);
  }
  
  public static void b(Drawable paramDrawable, int paramInt)
  {
    rp.b(paramDrawable, paramInt);
  }
  
  public static boolean c(Drawable paramDrawable)
  {
    return rp.c(paramDrawable);
  }
  
  public static int d(Drawable paramDrawable)
  {
    return rp.d(paramDrawable);
  }
  
  public static boolean e(Drawable paramDrawable)
  {
    return rp.e(paramDrawable);
  }
  
  public static ColorFilter f(Drawable paramDrawable)
  {
    return rp.f(paramDrawable);
  }
  
  public static Drawable g(Drawable paramDrawable)
  {
    return rp.g(paramDrawable);
  }
  
  public static <T extends Drawable> T h(Drawable paramDrawable)
  {
    Drawable localDrawable = paramDrawable;
    if ((paramDrawable instanceof c)) {
      localDrawable = ((c)paramDrawable).bD();
    }
    return localDrawable;
  }
  
  public static int i(Drawable paramDrawable)
  {
    return rp.i(paramDrawable);
  }
  
  static class a
    implements a.b
  {
    public void a(Drawable paramDrawable, float paramFloat1, float paramFloat2) {}
    
    public void a(Drawable paramDrawable, int paramInt)
    {
      if ((paramDrawable instanceof l)) {
        ((l)paramDrawable).setTint(paramInt);
      }
    }
    
    public void a(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
    
    public void a(Drawable paramDrawable, ColorStateList paramColorStateList)
    {
      if ((paramDrawable instanceof l)) {
        ((l)paramDrawable).setTintList(paramColorStateList);
      }
    }
    
    public void a(Drawable paramDrawable, Resources.Theme paramTheme) {}
    
    public void a(Drawable paramDrawable, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    {
      paramDrawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet);
    }
    
    public void a(Drawable paramDrawable, PorterDuff.Mode paramMode)
    {
      if ((paramDrawable instanceof l)) {
        ((l)paramDrawable).setTintMode(paramMode);
      }
    }
    
    public void a(Drawable paramDrawable, boolean paramBoolean) {}
    
    public void b(Drawable paramDrawable) {}
    
    public void b(Drawable paramDrawable, int paramInt) {}
    
    public boolean c(Drawable paramDrawable)
    {
      return false;
    }
    
    public int d(Drawable paramDrawable)
    {
      return 0;
    }
    
    public boolean e(Drawable paramDrawable)
    {
      return false;
    }
    
    public ColorFilter f(Drawable paramDrawable)
    {
      return null;
    }
    
    public Drawable g(Drawable paramDrawable)
    {
      Object localObject = paramDrawable;
      if (!(paramDrawable instanceof l)) {
        localObject = new d(paramDrawable);
      }
      return (Drawable)localObject;
    }
    
    public int i(Drawable paramDrawable)
    {
      return 0;
    }
  }
  
  static abstract interface b
  {
    public abstract void a(Drawable paramDrawable, float paramFloat1, float paramFloat2);
    
    public abstract void a(Drawable paramDrawable, int paramInt);
    
    public abstract void a(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
    
    public abstract void a(Drawable paramDrawable, ColorStateList paramColorStateList);
    
    public abstract void a(Drawable paramDrawable, Resources.Theme paramTheme);
    
    public abstract void a(Drawable paramDrawable, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme);
    
    public abstract void a(Drawable paramDrawable, PorterDuff.Mode paramMode);
    
    public abstract void a(Drawable paramDrawable, boolean paramBoolean);
    
    public abstract void b(Drawable paramDrawable);
    
    public abstract void b(Drawable paramDrawable, int paramInt);
    
    public abstract boolean c(Drawable paramDrawable);
    
    public abstract int d(Drawable paramDrawable);
    
    public abstract boolean e(Drawable paramDrawable);
    
    public abstract ColorFilter f(Drawable paramDrawable);
    
    public abstract Drawable g(Drawable paramDrawable);
    
    public abstract int i(Drawable paramDrawable);
  }
  
  static class c
    extends a.a
  {
    public Drawable g(Drawable paramDrawable)
    {
      Object localObject = paramDrawable;
      if (!(paramDrawable instanceof l)) {
        localObject = new e(paramDrawable);
      }
      return (Drawable)localObject;
    }
  }
  
  static class d
    extends a.c
  {
    public final void b(Drawable paramDrawable)
    {
      paramDrawable.jumpToCurrentState();
    }
    
    public Drawable g(Drawable paramDrawable)
    {
      Object localObject = paramDrawable;
      if (!(paramDrawable instanceof l)) {
        localObject = new f(paramDrawable);
      }
      return (Drawable)localObject;
    }
  }
  
  static class e
    extends a.d
  {
    public void b(Drawable paramDrawable, int paramInt)
    {
      if (!b.rr) {}
      try
      {
        Method localMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", new Class[] { Integer.TYPE });
        b.rq = localMethod;
        localMethod.setAccessible(true);
        b.rr = true;
        if (b.rq != null) {}
        try
        {
          b.rq.invoke(paramDrawable, new Object[] { Integer.valueOf(paramInt) });
          return;
        }
        catch (Exception paramDrawable)
        {
          b.rq = null;
          return;
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        for (;;) {}
      }
    }
    
    public int i(Drawable paramDrawable)
    {
      int i = b.i(paramDrawable);
      if (i >= 0) {
        return i;
      }
      return 0;
    }
  }
  
  static class f
    extends a.e
  {
    public final void a(Drawable paramDrawable, boolean paramBoolean)
    {
      paramDrawable.setAutoMirrored(paramBoolean);
    }
    
    public final boolean c(Drawable paramDrawable)
    {
      return paramDrawable.isAutoMirrored();
    }
    
    public final int d(Drawable paramDrawable)
    {
      return paramDrawable.getAlpha();
    }
    
    public Drawable g(Drawable paramDrawable)
    {
      Object localObject = paramDrawable;
      if (!(paramDrawable instanceof l)) {
        localObject = new g(paramDrawable);
      }
      return (Drawable)localObject;
    }
  }
  
  static class g
    extends a.f
  {
    public final void a(Drawable paramDrawable, float paramFloat1, float paramFloat2)
    {
      paramDrawable.setHotspot(paramFloat1, paramFloat2);
    }
    
    public final void a(Drawable paramDrawable, int paramInt)
    {
      paramDrawable.setTint(paramInt);
    }
    
    public final void a(Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      paramDrawable.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    
    public final void a(Drawable paramDrawable, ColorStateList paramColorStateList)
    {
      paramDrawable.setTintList(paramColorStateList);
    }
    
    public final void a(Drawable paramDrawable, Resources.Theme paramTheme)
    {
      paramDrawable.applyTheme(paramTheme);
    }
    
    public final void a(Drawable paramDrawable, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    {
      paramDrawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    }
    
    public final void a(Drawable paramDrawable, PorterDuff.Mode paramMode)
    {
      paramDrawable.setTintMode(paramMode);
    }
    
    public final boolean e(Drawable paramDrawable)
    {
      return paramDrawable.canApplyTheme();
    }
    
    public final ColorFilter f(Drawable paramDrawable)
    {
      return paramDrawable.getColorFilter();
    }
    
    public Drawable g(Drawable paramDrawable)
    {
      Object localObject = paramDrawable;
      if (!(paramDrawable instanceof l)) {
        localObject = new h(paramDrawable);
      }
      return (Drawable)localObject;
    }
  }
  
  static final class h
    extends a.g
  {
    public final void b(Drawable paramDrawable, int paramInt)
    {
      paramDrawable.setLayoutDirection(paramInt);
    }
    
    public final Drawable g(Drawable paramDrawable)
    {
      return paramDrawable;
    }
    
    public final int i(Drawable paramDrawable)
    {
      return paramDrawable.getLayoutDirection();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/b/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */