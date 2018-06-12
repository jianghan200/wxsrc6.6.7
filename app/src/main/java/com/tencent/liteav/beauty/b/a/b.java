package com.tencent.liteav.beauty.b.a;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.beauty.NativeLoad;
import com.tencent.liteav.beauty.b.r;

public class b
  extends r
{
  private int r = -1;
  private int s = -1;
  private int t = -1;
  private final String x = "BeautyBlend";
  
  public b()
  {
    super("varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
  }
  
  private void p()
  {
    this.s = GLES20.glGetUniformLocation(o(), "whiteDegree");
    this.r = GLES20.glGetUniformLocation(o(), "contrast");
    this.t = GLES20.glGetUniformLocation(o(), "ruddyDegree");
  }
  
  public void a(float paramFloat)
  {
    TXCLog.i("BeautyBlend", "setBrightLevel " + paramFloat);
    a(this.s, paramFloat);
  }
  
  public boolean a()
  {
    NativeLoad.getInstance();
    this.a = NativeLoad.nativeLoadGLProgram(12);
    if ((this.a != 0) && (b())) {}
    for (this.g = true;; this.g = false)
    {
      c();
      return this.g;
    }
  }
  
  public void b(float paramFloat)
  {
    a(this.t, paramFloat / 2.0F);
  }
  
  public boolean b()
  {
    super.b();
    p();
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/liteav/beauty/b/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */