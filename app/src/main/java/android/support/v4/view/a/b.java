package android.support.v4.view.a;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;

public final class b
{
  public static final e xr = new j();
  public final Object xs;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 22)
    {
      xr = new c();
      return;
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      xr = new b();
      return;
    }
    if (Build.VERSION.SDK_INT >= 19)
    {
      xr = new i();
      return;
    }
    if (Build.VERSION.SDK_INT >= 18)
    {
      xr = new h();
      return;
    }
    if (Build.VERSION.SDK_INT >= 17)
    {
      xr = new g();
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      xr = new f();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      xr = new d();
      return;
    }
  }
  
  public b(Object paramObject)
  {
    this.xs = paramObject;
  }
  
  public static b a(b paramb)
  {
    paramb = xr.m(paramb.xs);
    if (paramb != null) {
      return new b(paramb);
    }
    return null;
  }
  
  public final boolean a(a parama)
  {
    return xr.f(this.xs, a.b(parama));
  }
  
  public final void addAction(int paramInt)
  {
    xr.b(this.xs, paramInt);
  }
  
  public final void addChild(View paramView)
  {
    xr.c(this.xs, paramView);
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
        paramObject = (b)paramObject;
        if (this.xs != null) {
          break;
        }
      } while (((b)paramObject).xs == null);
      return false;
    } while (this.xs.equals(((b)paramObject).xs));
    return false;
  }
  
  public final int getActions()
  {
    return xr.n(this.xs);
  }
  
  public final void getBoundsInParent(Rect paramRect)
  {
    xr.a(this.xs, paramRect);
  }
  
  public final void getBoundsInScreen(Rect paramRect)
  {
    xr.b(this.xs, paramRect);
  }
  
  public final CharSequence getClassName()
  {
    return xr.o(this.xs);
  }
  
  public final CharSequence getContentDescription()
  {
    return xr.p(this.xs);
  }
  
  public final CharSequence getPackageName()
  {
    return xr.q(this.xs);
  }
  
  public final int hashCode()
  {
    if (this.xs == null) {
      return 0;
    }
    return this.xs.hashCode();
  }
  
  public final boolean isAccessibilityFocused()
  {
    return xr.F(this.xs);
  }
  
  public final boolean isClickable()
  {
    return xr.u(this.xs);
  }
  
  public final boolean isEnabled()
  {
    return xr.v(this.xs);
  }
  
  public final boolean isFocusable()
  {
    return xr.w(this.xs);
  }
  
  public final boolean isFocused()
  {
    return xr.x(this.xs);
  }
  
  public final boolean isLongClickable()
  {
    return xr.y(this.xs);
  }
  
  public final boolean isSelected()
  {
    return xr.B(this.xs);
  }
  
  public final boolean isVisibleToUser()
  {
    return xr.E(this.xs);
  }
  
  public final void l(Object paramObject)
  {
    xr.h(this.xs, ((l)paramObject).xs);
  }
  
  public final void recycle()
  {
    xr.C(this.xs);
  }
  
  public final void setAccessibilityFocused(boolean paramBoolean)
  {
    xr.j(this.xs, paramBoolean);
  }
  
  public final void setBoundsInParent(Rect paramRect)
  {
    xr.c(this.xs, paramRect);
  }
  
  public final void setBoundsInScreen(Rect paramRect)
  {
    xr.d(this.xs, paramRect);
  }
  
  public final void setClassName(CharSequence paramCharSequence)
  {
    xr.b(this.xs, paramCharSequence);
  }
  
  public final void setClickable(boolean paramBoolean)
  {
    xr.b(this.xs, paramBoolean);
  }
  
  public final void setContentDescription(CharSequence paramCharSequence)
  {
    xr.c(this.xs, paramCharSequence);
  }
  
  public final void setEnabled(boolean paramBoolean)
  {
    xr.c(this.xs, paramBoolean);
  }
  
  public final void setFocusable(boolean paramBoolean)
  {
    xr.d(this.xs, paramBoolean);
  }
  
  public final void setFocused(boolean paramBoolean)
  {
    xr.e(this.xs, paramBoolean);
  }
  
  public final void setLongClickable(boolean paramBoolean)
  {
    xr.f(this.xs, paramBoolean);
  }
  
  public final void setPackageName(CharSequence paramCharSequence)
  {
    xr.d(this.xs, paramCharSequence);
  }
  
  public final void setParent(View paramView)
  {
    xr.d(this.xs, paramView);
  }
  
  public final void setScrollable(boolean paramBoolean)
  {
    xr.g(this.xs, paramBoolean);
  }
  
  public final void setSelected(boolean paramBoolean)
  {
    xr.h(this.xs, paramBoolean);
  }
  
  public final void setSource(View paramView)
  {
    xr.e(this.xs, paramView);
  }
  
  public final void setText(CharSequence paramCharSequence)
  {
    xr.e(this.xs, paramCharSequence);
  }
  
  public final void setVisibleToUser(boolean paramBoolean)
  {
    xr.i(this.xs, paramBoolean);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(super.toString());
    Object localObject = new Rect();
    getBoundsInParent((Rect)localObject);
    localStringBuilder.append("; boundsInParent: " + localObject);
    getBoundsInScreen((Rect)localObject);
    localStringBuilder.append("; boundsInScreen: " + localObject);
    localStringBuilder.append("; packageName: ").append(getPackageName());
    localStringBuilder.append("; className: ").append(getClassName());
    localStringBuilder.append("; text: ").append(xr.r(this.xs));
    localStringBuilder.append("; contentDescription: ").append(getContentDescription());
    localStringBuilder.append("; viewId: ").append(xr.G(this.xs));
    localStringBuilder.append("; checkable: ").append(xr.s(this.xs));
    localStringBuilder.append("; checked: ").append(xr.t(this.xs));
    localStringBuilder.append("; focusable: ").append(isFocusable());
    localStringBuilder.append("; focused: ").append(isFocused());
    localStringBuilder.append("; selected: ").append(isSelected());
    localStringBuilder.append("; clickable: ").append(isClickable());
    localStringBuilder.append("; longClickable: ").append(isLongClickable());
    localStringBuilder.append("; enabled: ").append(isEnabled());
    localStringBuilder.append("; password: ").append(xr.z(this.xs));
    localStringBuilder.append("; scrollable: " + xr.A(this.xs));
    localStringBuilder.append("; [");
    int i = getActions();
    if (i != 0)
    {
      int j = 1 << Integer.numberOfTrailingZeros(i);
      i = (j ^ 0xFFFFFFFF) & i;
      switch (j)
      {
      default: 
        localObject = "ACTION_UNKNOWN";
      }
      for (;;)
      {
        localStringBuilder.append((String)localObject);
        if (i != 0) {
          localStringBuilder.append(", ");
        }
        break;
        localObject = "ACTION_FOCUS";
        continue;
        localObject = "ACTION_CLEAR_FOCUS";
        continue;
        localObject = "ACTION_SELECT";
        continue;
        localObject = "ACTION_CLEAR_SELECTION";
        continue;
        localObject = "ACTION_CLICK";
        continue;
        localObject = "ACTION_LONG_CLICK";
        continue;
        localObject = "ACTION_ACCESSIBILITY_FOCUS";
        continue;
        localObject = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
        continue;
        localObject = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
        continue;
        localObject = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
        continue;
        localObject = "ACTION_NEXT_HTML_ELEMENT";
        continue;
        localObject = "ACTION_PREVIOUS_HTML_ELEMENT";
        continue;
        localObject = "ACTION_SCROLL_FORWARD";
        continue;
        localObject = "ACTION_SCROLL_BACKWARD";
        continue;
        localObject = "ACTION_CUT";
        continue;
        localObject = "ACTION_COPY";
        continue;
        localObject = "ACTION_PASTE";
        continue;
        localObject = "ACTION_SET_SELECTION";
      }
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public static final a xA = new a(128);
    public static final a xB = new a(256);
    public static final a xC = new a(512);
    public static final a xD = new a(1024);
    public static final a xE = new a(2048);
    public static final a xF = new a(4096);
    public static final a xG = new a(8192);
    public static final a xH = new a(16384);
    public static final a xI = new a(32768);
    public static final a xJ = new a(65536);
    public static final a xK = new a(131072);
    public static final a xL = new a(262144);
    public static final a xM = new a(524288);
    public static final a xN = new a(1048576);
    public static final a xO = new a(2097152);
    public static final a xt = new a(1);
    public static final a xu = new a(2);
    public static final a xv = new a(4);
    public static final a xw = new a(8);
    public static final a xx = new a(16);
    public static final a xy = new a(32);
    public static final a xz = new a(64);
    private final Object xP;
    
    private a(int paramInt)
    {
      this(b.cp().ap(paramInt));
    }
    
    private a(Object paramObject)
    {
      this.xP = paramObject;
    }
  }
  
  static class b
    extends b.i
  {
    public final void a(Object paramObject, CharSequence paramCharSequence)
    {
      ((AccessibilityNodeInfo)paramObject).setError(paramCharSequence);
    }
    
    public final Object ap(int paramInt)
    {
      return new AccessibilityNodeInfo.AccessibilityAction(paramInt, null);
    }
    
    public final Object b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
    {
      return AccessibilityNodeInfo.CollectionItemInfo.obtain(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean, false);
    }
    
    public final boolean f(Object paramObject1, Object paramObject2)
    {
      return ((AccessibilityNodeInfo)paramObject1).removeAction((AccessibilityNodeInfo.AccessibilityAction)paramObject2);
    }
    
    public final Object r(int paramInt1, int paramInt2)
    {
      return AccessibilityNodeInfo.CollectionInfo.obtain(paramInt1, paramInt2, false, 0);
    }
  }
  
  static final class c
    extends b.b
  {}
  
  static class d
    extends b.j
  {
    public final boolean A(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isScrollable();
    }
    
    public final boolean B(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isSelected();
    }
    
    public final void C(Object paramObject)
    {
      ((AccessibilityNodeInfo)paramObject).recycle();
    }
    
    public final void a(Object paramObject, Rect paramRect)
    {
      ((AccessibilityNodeInfo)paramObject).getBoundsInParent(paramRect);
    }
    
    public final void b(Object paramObject, int paramInt)
    {
      ((AccessibilityNodeInfo)paramObject).addAction(paramInt);
    }
    
    public final void b(Object paramObject, Rect paramRect)
    {
      ((AccessibilityNodeInfo)paramObject).getBoundsInScreen(paramRect);
    }
    
    public final void b(Object paramObject, CharSequence paramCharSequence)
    {
      ((AccessibilityNodeInfo)paramObject).setClassName(paramCharSequence);
    }
    
    public final void b(Object paramObject, boolean paramBoolean)
    {
      ((AccessibilityNodeInfo)paramObject).setClickable(paramBoolean);
    }
    
    public final void c(Object paramObject, Rect paramRect)
    {
      ((AccessibilityNodeInfo)paramObject).setBoundsInParent(paramRect);
    }
    
    public final void c(Object paramObject, View paramView)
    {
      ((AccessibilityNodeInfo)paramObject).addChild(paramView);
    }
    
    public final void c(Object paramObject, CharSequence paramCharSequence)
    {
      ((AccessibilityNodeInfo)paramObject).setContentDescription(paramCharSequence);
    }
    
    public final void c(Object paramObject, boolean paramBoolean)
    {
      ((AccessibilityNodeInfo)paramObject).setEnabled(paramBoolean);
    }
    
    public final void d(Object paramObject, Rect paramRect)
    {
      ((AccessibilityNodeInfo)paramObject).setBoundsInScreen(paramRect);
    }
    
    public final void d(Object paramObject, View paramView)
    {
      ((AccessibilityNodeInfo)paramObject).setParent(paramView);
    }
    
    public final void d(Object paramObject, CharSequence paramCharSequence)
    {
      ((AccessibilityNodeInfo)paramObject).setPackageName(paramCharSequence);
    }
    
    public final void d(Object paramObject, boolean paramBoolean)
    {
      ((AccessibilityNodeInfo)paramObject).setFocusable(paramBoolean);
    }
    
    public final void e(Object paramObject, View paramView)
    {
      ((AccessibilityNodeInfo)paramObject).setSource(paramView);
    }
    
    public final void e(Object paramObject, CharSequence paramCharSequence)
    {
      ((AccessibilityNodeInfo)paramObject).setText(paramCharSequence);
    }
    
    public final void e(Object paramObject, boolean paramBoolean)
    {
      ((AccessibilityNodeInfo)paramObject).setFocused(paramBoolean);
    }
    
    public final void f(Object paramObject, boolean paramBoolean)
    {
      ((AccessibilityNodeInfo)paramObject).setLongClickable(paramBoolean);
    }
    
    public final void g(Object paramObject, boolean paramBoolean)
    {
      ((AccessibilityNodeInfo)paramObject).setScrollable(paramBoolean);
    }
    
    public final void h(Object paramObject, boolean paramBoolean)
    {
      ((AccessibilityNodeInfo)paramObject).setSelected(paramBoolean);
    }
    
    public final Object m(Object paramObject)
    {
      return AccessibilityNodeInfo.obtain((AccessibilityNodeInfo)paramObject);
    }
    
    public final int n(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).getActions();
    }
    
    public final CharSequence o(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).getClassName();
    }
    
    public final CharSequence p(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).getContentDescription();
    }
    
    public final CharSequence q(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).getPackageName();
    }
    
    public final CharSequence r(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).getText();
    }
    
    public final boolean s(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isCheckable();
    }
    
    public final boolean t(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isChecked();
    }
    
    public final boolean u(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isClickable();
    }
    
    public final boolean v(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isEnabled();
    }
    
    public final boolean w(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isFocusable();
    }
    
    public final boolean x(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isFocused();
    }
    
    public final boolean y(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isLongClickable();
    }
    
    public final boolean z(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isPassword();
    }
  }
  
  public static abstract interface e
  {
    public abstract boolean A(Object paramObject);
    
    public abstract boolean B(Object paramObject);
    
    public abstract void C(Object paramObject);
    
    public abstract int D(Object paramObject);
    
    public abstract boolean E(Object paramObject);
    
    public abstract boolean F(Object paramObject);
    
    public abstract String G(Object paramObject);
    
    public abstract void H(Object paramObject);
    
    public abstract void a(Object paramObject, Rect paramRect);
    
    public abstract void a(Object paramObject, CharSequence paramCharSequence);
    
    public abstract Object ap(int paramInt);
    
    public abstract Object b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean);
    
    public abstract void b(Object paramObject, int paramInt);
    
    public abstract void b(Object paramObject, Rect paramRect);
    
    public abstract void b(Object paramObject, CharSequence paramCharSequence);
    
    public abstract void b(Object paramObject, boolean paramBoolean);
    
    public abstract void c(Object paramObject, int paramInt);
    
    public abstract void c(Object paramObject, Rect paramRect);
    
    public abstract void c(Object paramObject, View paramView);
    
    public abstract void c(Object paramObject, CharSequence paramCharSequence);
    
    public abstract void c(Object paramObject, boolean paramBoolean);
    
    public abstract void d(Object paramObject, Rect paramRect);
    
    public abstract void d(Object paramObject, View paramView);
    
    public abstract void d(Object paramObject, CharSequence paramCharSequence);
    
    public abstract void d(Object paramObject, boolean paramBoolean);
    
    public abstract void e(Object paramObject, View paramView);
    
    public abstract void e(Object paramObject, CharSequence paramCharSequence);
    
    public abstract void e(Object paramObject, boolean paramBoolean);
    
    public abstract void f(Object paramObject, View paramView);
    
    public abstract void f(Object paramObject, boolean paramBoolean);
    
    public abstract boolean f(Object paramObject1, Object paramObject2);
    
    public abstract void g(Object paramObject1, Object paramObject2);
    
    public abstract void g(Object paramObject, boolean paramBoolean);
    
    public abstract void h(Object paramObject1, Object paramObject2);
    
    public abstract void h(Object paramObject, boolean paramBoolean);
    
    public abstract void i(Object paramObject, boolean paramBoolean);
    
    public abstract void j(Object paramObject, boolean paramBoolean);
    
    public abstract Object m(Object paramObject);
    
    public abstract int n(Object paramObject);
    
    public abstract CharSequence o(Object paramObject);
    
    public abstract CharSequence p(Object paramObject);
    
    public abstract CharSequence q(Object paramObject);
    
    public abstract CharSequence r(Object paramObject);
    
    public abstract Object r(int paramInt1, int paramInt2);
    
    public abstract boolean s(Object paramObject);
    
    public abstract boolean t(Object paramObject);
    
    public abstract boolean u(Object paramObject);
    
    public abstract boolean v(Object paramObject);
    
    public abstract boolean w(Object paramObject);
    
    public abstract boolean x(Object paramObject);
    
    public abstract boolean y(Object paramObject);
    
    public abstract boolean z(Object paramObject);
  }
  
  static class f
    extends b.d
  {
    public final int D(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).getMovementGranularities();
    }
    
    public final boolean E(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isVisibleToUser();
    }
    
    public final boolean F(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).isAccessibilityFocused();
    }
    
    public final void c(Object paramObject, int paramInt)
    {
      ((AccessibilityNodeInfo)paramObject).setMovementGranularities(paramInt);
    }
    
    public final void i(Object paramObject, boolean paramBoolean)
    {
      ((AccessibilityNodeInfo)paramObject).setVisibleToUser(paramBoolean);
    }
    
    public final void j(Object paramObject, boolean paramBoolean)
    {
      ((AccessibilityNodeInfo)paramObject).setAccessibilityFocused(paramBoolean);
    }
  }
  
  static class g
    extends b.f
  {
    public final void f(Object paramObject, View paramView)
    {
      ((AccessibilityNodeInfo)paramObject).setLabelFor(paramView);
    }
  }
  
  static class h
    extends b.g
  {
    public final String G(Object paramObject)
    {
      return ((AccessibilityNodeInfo)paramObject).getViewIdResourceName();
    }
  }
  
  static class i
    extends b.h
  {
    public final void H(Object paramObject)
    {
      ((AccessibilityNodeInfo)paramObject).setContentInvalid(true);
    }
    
    public Object b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
    {
      return AccessibilityNodeInfo.CollectionItemInfo.obtain(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean);
    }
    
    public final void g(Object paramObject1, Object paramObject2)
    {
      ((AccessibilityNodeInfo)paramObject1).setCollectionInfo((AccessibilityNodeInfo.CollectionInfo)paramObject2);
    }
    
    public final void h(Object paramObject1, Object paramObject2)
    {
      ((AccessibilityNodeInfo)paramObject1).setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo)paramObject2);
    }
    
    public Object r(int paramInt1, int paramInt2)
    {
      return AccessibilityNodeInfo.CollectionInfo.obtain(paramInt1, paramInt2, false);
    }
  }
  
  static class j
    implements b.e
  {
    public boolean A(Object paramObject)
    {
      return false;
    }
    
    public boolean B(Object paramObject)
    {
      return false;
    }
    
    public void C(Object paramObject) {}
    
    public int D(Object paramObject)
    {
      return 0;
    }
    
    public boolean E(Object paramObject)
    {
      return false;
    }
    
    public boolean F(Object paramObject)
    {
      return false;
    }
    
    public String G(Object paramObject)
    {
      return null;
    }
    
    public void H(Object paramObject) {}
    
    public void a(Object paramObject, Rect paramRect) {}
    
    public void a(Object paramObject, CharSequence paramCharSequence) {}
    
    public Object ap(int paramInt)
    {
      return null;
    }
    
    public Object b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
    {
      return null;
    }
    
    public void b(Object paramObject, int paramInt) {}
    
    public void b(Object paramObject, Rect paramRect) {}
    
    public void b(Object paramObject, CharSequence paramCharSequence) {}
    
    public void b(Object paramObject, boolean paramBoolean) {}
    
    public void c(Object paramObject, int paramInt) {}
    
    public void c(Object paramObject, Rect paramRect) {}
    
    public void c(Object paramObject, View paramView) {}
    
    public void c(Object paramObject, CharSequence paramCharSequence) {}
    
    public void c(Object paramObject, boolean paramBoolean) {}
    
    public void d(Object paramObject, Rect paramRect) {}
    
    public void d(Object paramObject, View paramView) {}
    
    public void d(Object paramObject, CharSequence paramCharSequence) {}
    
    public void d(Object paramObject, boolean paramBoolean) {}
    
    public void e(Object paramObject, View paramView) {}
    
    public void e(Object paramObject, CharSequence paramCharSequence) {}
    
    public void e(Object paramObject, boolean paramBoolean) {}
    
    public void f(Object paramObject, View paramView) {}
    
    public void f(Object paramObject, boolean paramBoolean) {}
    
    public boolean f(Object paramObject1, Object paramObject2)
    {
      return false;
    }
    
    public void g(Object paramObject1, Object paramObject2) {}
    
    public void g(Object paramObject, boolean paramBoolean) {}
    
    public void h(Object paramObject1, Object paramObject2) {}
    
    public void h(Object paramObject, boolean paramBoolean) {}
    
    public void i(Object paramObject, boolean paramBoolean) {}
    
    public void j(Object paramObject, boolean paramBoolean) {}
    
    public Object m(Object paramObject)
    {
      return null;
    }
    
    public int n(Object paramObject)
    {
      return 0;
    }
    
    public CharSequence o(Object paramObject)
    {
      return null;
    }
    
    public CharSequence p(Object paramObject)
    {
      return null;
    }
    
    public CharSequence q(Object paramObject)
    {
      return null;
    }
    
    public CharSequence r(Object paramObject)
    {
      return null;
    }
    
    public Object r(int paramInt1, int paramInt2)
    {
      return null;
    }
    
    public boolean s(Object paramObject)
    {
      return false;
    }
    
    public boolean t(Object paramObject)
    {
      return false;
    }
    
    public boolean u(Object paramObject)
    {
      return false;
    }
    
    public boolean v(Object paramObject)
    {
      return false;
    }
    
    public boolean w(Object paramObject)
    {
      return false;
    }
    
    public boolean x(Object paramObject)
    {
      return false;
    }
    
    public boolean y(Object paramObject)
    {
      return false;
    }
    
    public boolean z(Object paramObject)
    {
      return false;
    }
  }
  
  public static final class k
  {
    public final Object xs;
    
    public k(Object paramObject)
    {
      this.xs = paramObject;
    }
  }
  
  public static final class l
  {
    final Object xs;
    
    private l(Object paramObject)
    {
      this.xs = paramObject;
    }
    
    public static l c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
    {
      return new l(b.cp().b(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/view/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */