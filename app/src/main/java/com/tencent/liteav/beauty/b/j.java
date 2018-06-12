package com.tencent.liteav.beauty.b;

import android.opengl.GLES20;

public class j
{
  private static String i = "GPUGreenScreen";
  private int a;
  private int b;
  private boolean c;
  private u d;
  private boolean e;
  private com.tencent.liteav.basic.d.e f;
  private e g;
  private boolean h;
  
  private void b()
  {
    if (this.d != null) {
      this.d.a();
    }
    this.d = null;
    this.e = false;
    this.h = false;
  }
  
  private void c()
  {
    if ((this.b != -1) && (this.b != this.a))
    {
      GLES20.glDeleteTextures(1, new int[] { this.b }, 0);
      this.b = -1;
    }
    if (this.a != -1)
    {
      GLES20.glDeleteTextures(1, new int[] { this.a }, 0);
      this.a = -1;
    }
  }
  
  public int a(int paramInt)
  {
    return paramInt;
  }
  
  public void a()
  {
    b();
    c();
    if (this.f != null)
    {
      this.f.d();
      this.f = null;
    }
    if (this.g != null)
    {
      this.g.d();
      this.g = null;
    }
    this.c = false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/liteav/beauty/b/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */