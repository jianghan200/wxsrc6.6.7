package com.tencent.liteav.beauty.a.a;

import javax.microedition.khronos.egl.EGL11;
import javax.microedition.khronos.egl.EGLSurface;

public class b
{
  protected a a;
  private EGLSurface b = EGL11.EGL_NO_SURFACE;
  private int c = -1;
  private int d = -1;
  
  protected b(a parama)
  {
    this.a = parama;
  }
  
  public void a()
  {
    this.a.a(this.b);
    this.b = EGL11.EGL_NO_SURFACE;
    this.d = -1;
    this.c = -1;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    if (this.b != EGL11.EGL_NO_SURFACE) {
      throw new IllegalStateException("surface already created");
    }
    this.b = this.a.a(paramInt1, paramInt2);
    this.c = paramInt1;
    this.d = paramInt2;
  }
  
  public void b()
  {
    this.a.b(this.b);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/liteav/beauty/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */