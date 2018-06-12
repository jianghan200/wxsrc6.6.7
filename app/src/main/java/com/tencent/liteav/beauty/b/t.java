package com.tencent.liteav.beauty.b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.d.d;
import java.util.List;

public class t
  extends s
{
  protected float u;
  
  public void a(int paramInt1, int paramInt2)
  {
    super.a(paramInt1, paramInt2);
    r();
  }
  
  public boolean b()
  {
    return (super.b()) && (GLES20.glGetError() == 0);
  }
  
  public float p()
  {
    return this.u;
  }
  
  public float q()
  {
    return this.u;
  }
  
  protected void r()
  {
    float f = q();
    d locald = (d)this.r.get(0);
    int i = GLES20.glGetUniformLocation(locald.o(), "texelWidthOffset");
    int j = GLES20.glGetUniformLocation(locald.o(), "texelHeightOffset");
    locald.a(i, f / this.e);
    locald.a(j, 0.0F);
    f = p();
    locald = (d)this.r.get(1);
    i = GLES20.glGetUniformLocation(locald.o(), "texelWidthOffset");
    j = GLES20.glGetUniformLocation(locald.o(), "texelHeightOffset");
    locald.a(i, 0.0F);
    locald.a(j, f / this.f);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/liteav/beauty/b/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */