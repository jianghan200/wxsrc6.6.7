package com.tencent.liteav.beauty.b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.d.d;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.beauty.NativeLoad;

public class n
  extends d
{
  private int r = -1;
  private int s = -1;
  private String t = "RGBA2I420Filter";
  private int u = 1;
  
  public n(int paramInt)
  {
    super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
    this.u = paramInt;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    if ((paramInt1 <= 0) || (paramInt2 <= 0))
    {
      TXCLog.e(this.t, "width or height is error!");
      return;
    }
    super.a(paramInt1, paramInt2);
    TXCLog.i(this.t, "RGBA2I420Filter width " + paramInt1 + " height " + paramInt2);
    a(this.r, paramInt1);
    a(this.s, paramInt2);
  }
  
  public boolean a()
  {
    if (1 == this.u)
    {
      NativeLoad.getInstance();
      this.a = NativeLoad.nativeLoadGLProgram(8);
      TXCLog.i(this.t, "RGB-->I420 init!");
      if ((this.a == 0) || (!b())) {
        break label160;
      }
    }
    label160:
    for (this.g = true;; this.g = false)
    {
      c();
      return this.g;
      if (3 == this.u)
      {
        TXCLog.i(this.t, "RGB-->NV21 init!");
        NativeLoad.getInstance();
        this.a = NativeLoad.nativeLoadGLProgram(11);
        break;
      }
      if (2 == this.u)
      {
        TXCLog.i(this.t, "RGBA Format init!");
        return super.a();
      }
      TXCLog.i(this.t, "don't support format " + this.u + " use default I420");
      NativeLoad.getInstance();
      this.a = NativeLoad.nativeLoadGLProgram(8);
      break;
    }
  }
  
  public boolean b()
  {
    super.b();
    p();
    return true;
  }
  
  public void c()
  {
    super.c();
  }
  
  public void p()
  {
    this.r = GLES20.glGetUniformLocation(o(), "width");
    this.s = GLES20.glGetUniformLocation(o(), "height");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/liteav/beauty/b/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */