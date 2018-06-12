package com.tencent.liteav.beauty.b.a;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.beauty.NativeLoad;

public class d
  extends com.tencent.liteav.basic.d.d
{
  private int r = -1;
  private int s = -1;
  private float t = 4.0F;
  private String u = "SmoothHorizontal";
  
  d()
  {
    super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    super.a(paramInt1, paramInt2);
    if (paramInt1 > paramInt2) {
      if (paramInt2 < 540) {
        this.t = 2.0F;
      }
    }
    for (;;)
    {
      TXCLog.i(this.u, "m_textureRation " + this.t);
      a(this.r, this.t / paramInt1);
      a(this.s, this.t / paramInt2);
      return;
      this.t = 4.0F;
      continue;
      if (paramInt1 < 540) {
        this.t = 2.0F;
      } else {
        this.t = 4.0F;
      }
    }
  }
  
  public boolean a()
  {
    NativeLoad.getInstance();
    this.a = NativeLoad.nativeLoadGLProgram(13);
    if ((this.a != 0) && (b())) {}
    for (this.g = true;; this.g = false)
    {
      c();
      return this.g;
    }
  }
  
  public boolean b()
  {
    super.b();
    p();
    return true;
  }
  
  public void p()
  {
    this.r = GLES20.glGetUniformLocation(o(), "texelWidthOffset");
    this.s = GLES20.glGetUniformLocation(o(), "texelHeightOffset");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/liteav/beauty/b/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */