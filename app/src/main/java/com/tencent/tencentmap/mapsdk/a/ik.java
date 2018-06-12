package com.tencent.tencentmap.mapsdk.a;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

public class ik
  extends Thread
{
  private EGLContext a;
  private EGL10 b;
  private EGLConfig c;
  private EGLDisplay d;
  private hv e;
  private boolean f = false;
  private boolean g = false;
  private boolean h;
  private byte[] i = null;
  
  public ik(EGL10 paramEGL10, EGLContext paramEGLContext, EGLDisplay paramEGLDisplay, EGLConfig paramEGLConfig, hv paramhv, boolean paramBoolean)
  {
    this.b = paramEGL10;
    this.d = paramEGLDisplay;
    this.c = paramEGLConfig;
    this.e = paramhv;
    this.h = paramBoolean;
    if (paramBoolean) {
      this.a = paramEGL10.eglCreateContext(paramEGLDisplay, paramEGLConfig, paramEGLContext, new int[] { 12440, 2, 12344 });
    }
  }
  
  private boolean d()
  {
    if (this.e != null) {
      return this.e.j();
    }
    return false;
  }
  
  public void a()
  {
    this.g = true;
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    this.i = paramArrayOfByte;
    this.f = true;
    interrupt();
  }
  
  public void b()
  {
    this.g = false;
    try
    {
      notify();
      return;
    }
    finally {}
  }
  
  public void c()
  {
    if (this.h) {
      this.b.eglDestroyContext(this.d, this.a);
    }
  }
  
  public void run()
  {
    if (this.h)
    {
      EGLSurface localEGLSurface = this.b.eglCreatePbufferSurface(this.d, this.c, new int[] { 12375, 1, 12374, 1, 12417, 12380, 12416, 12380, 12344 });
      this.b.eglMakeCurrent(this.d, localEGLSurface, localEGLSurface, this.a);
    }
    for (;;)
    {
      if (!this.f)
      {
        if (!this.g)
        {
          if (d()) {
            continue;
          }
          try
          {
            sleep(160L);
          }
          catch (InterruptedException localInterruptedException1) {}
          continue;
        }
        try
        {
          try
          {
            wait();
          }
          finally {}
        }
        catch (InterruptedException localInterruptedException2) {}
      }
    }
    c();
    if (this.i != null) {
      synchronized (this.i)
      {
        this.i.notify();
        return;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ik.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */