package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.graphics.Color;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class aa
  extends FrameLayout
{
  private ac a = null;
  
  public aa(Context paramContext, ad paramad)
  {
    super(paramContext);
    setClickable(true);
    if (isInEditMode()) {
      return;
    }
    a(paramContext, paramad);
  }
  
  private void a(Context paramContext, ad paramad)
  {
    setBackgroundColor(Color.rgb(222, 215, 214));
    setEnabled(true);
    this.a = new ac(this, paramContext, paramad);
  }
  
  public void a()
  {
    if (this.a != null) {
      this.a.p();
    }
  }
  
  public void b()
  {
    if (this.a != null) {
      this.a.q();
    }
  }
  
  public void c()
  {
    if (this.a != null)
    {
      this.a.s();
      this.a = null;
    }
  }
  
  public void d()
  {
    if (this.a != null) {
      this.a.o();
    }
  }
  
  public void e()
  {
    if (this.a != null) {
      this.a.r();
    }
  }
  
  public void f()
  {
    if (this.a != null) {
      this.a.n();
    }
  }
  
  public final ac getMap()
  {
    return this.a;
  }
  
  public int[] getMapPadding()
  {
    return new int[] { getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom() };
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((this.a != null) && (this.a.c() != null) && (this.a.c().i() != null)) {
      return this.a.c().i().onTouchEvent(paramMotionEvent);
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setOnTop(boolean paramBoolean)
  {
    if (this.a != null) {
      this.a.d(paramBoolean);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */