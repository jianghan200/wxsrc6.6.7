package com.tencent.tencentmap.mapsdk.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.view.Display;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import com.tencent.map.lib.a;
import com.tencent.map.lib.f;
import com.tencent.map.lib.gl.JNICallback.f;
import com.tencent.map.lib.gl.e;
import com.tencent.map.lib.gl.e.m;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.opengles.GL10;

public class ii
  extends e
  implements JNICallback.f, e.m, hp
{
  private f a;
  private hv b;
  private hy c;
  private ik d = null;
  private boolean e;
  private float f = 0.5F;
  private Handler g = new Handler();
  private int h = 0;
  private Surface i;
  
  public ii(Context paramContext, Surface paramSurface)
  {
    super(paramContext);
    a(paramSurface);
  }
  
  private void a(Surface paramSurface)
  {
    if (paramSurface != null) {
      this.i = paramSurface;
    }
    e();
    setRenderer(this);
    setRenderMode(0);
    this.c = new hy(getContext());
    this.b = new hv(getContext(), this);
    this.a = new f(this.b);
    this.c.a(this.b);
    this.e = gg.a(this, true);
    paramSurface = (WindowManager)getContext().getSystemService("window");
    int j = paramSurface.getDefaultDisplay().getWidth();
    int k = paramSurface.getDefaultDisplay().getHeight();
    this.b.b(j, k);
  }
  
  private void a(byte[] paramArrayOfByte)
  {
    if (this.d != null)
    {
      this.d.b();
      this.d.a(paramArrayOfByte);
    }
  }
  
  private void e()
  {
    setEGLContextClientVersion(2);
    setPreserveEGLContextOnPause(true);
    a(8, 8, 8, 8, 16, 0);
    setEGLContextFactory(new ii.1(this));
    if (this.i != null) {
      setEGLWindowSurfaceFactory(new ii.2(this));
    }
  }
  
  private void h()
  {
    if (this.b != null)
    {
      getGLContext();
      this.b.o();
      this.b.a(null);
    }
  }
  
  public void a()
  {
    if (getVisibility() != 0) {
      return;
    }
    f();
  }
  
  public void a(a parama, jg paramjg)
  {
    if (this.b.a(getContext().getApplicationContext(), parama, paramjg)) {
      this.b.a().k();
    }
  }
  
  public void a(hz paramhz)
  {
    this.c.a(paramhz);
  }
  
  public void a(GL10 paramGL10, int paramInt1, int paramInt2)
  {
    this.b.a(paramInt1, paramInt2);
  }
  
  public void a(GL10 paramGL10, EGLConfig paramEGLConfig)
  {
    this.b.a(paramGL10);
    this.b.a(this);
  }
  
  public boolean a(GL10 paramGL10)
  {
    return this.b.b(paramGL10);
  }
  
  public void a_() {}
  
  public void b()
  {
    if (this.e) {
      super.b();
    }
    if (this.d != null) {
      this.d.b();
    }
    this.b.m();
  }
  
  public void b(hz paramhz)
  {
    this.c.b(paramhz);
  }
  
  public void c()
  {
    if (this.e) {
      super.c();
    }
    if (this.d != null) {
      this.d.a();
    }
    this.b.n();
  }
  
  public void d() {}
  
  public a getAdapter()
  {
    return this.b.E();
  }
  
  public int getGLContext()
  {
    Object localObject = (EGL10)EGLContext.getEGL();
    if (localObject != null)
    {
      localObject = ((EGL10)localObject).eglGetCurrentContext();
      if (localObject != null) {
        return localObject.hashCode();
      }
    }
    return 0;
  }
  
  public f getMap()
  {
    return this.a;
  }
  
  protected com.tencent.map.lib.gl.b getTextureCache()
  {
    return this.b.k();
  }
  
  @SuppressLint({"ClickableViewAccessibility"})
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.c != null) {
      return this.c.onTouch(this, paramMotionEvent);
    }
    return false;
  }
  
  public void setAdapter(a parama)
  {
    if (this.b.a(getContext().getApplicationContext(), parama)) {
      this.b.a().k();
    }
  }
  
  public void setNeedDisplay(boolean paramBoolean)
  {
    this.b.a(paramBoolean);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ii.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */