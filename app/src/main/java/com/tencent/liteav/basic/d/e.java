package com.tencent.liteav.basic.d;

import android.opengl.GLES20;
import java.nio.FloatBuffer;

public class e
  extends d
{
  public boolean r = false;
  private float[] s = new float[16];
  private int t;
  
  public e()
  {
    super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nuniform mat4 textureTransform;\nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = (textureTransform * inputTextureCoordinate).xy;\n}", "#extension GL_OES_EGL_image_external : require\n\nvarying lowp vec2 textureCoordinate;\n \nuniform samplerExternalOES inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
    this.o = true;
  }
  
  public void a(int paramInt, FloatBuffer paramFloatBuffer1, FloatBuffer paramFloatBuffer2)
  {
    GLES20.glUseProgram(this.a);
    k();
    if ((!l()) || (this.s == null)) {
      return;
    }
    paramFloatBuffer1.position(0);
    GLES20.glVertexAttribPointer(this.b, 2, 5126, false, 0, paramFloatBuffer1);
    GLES20.glEnableVertexAttribArray(this.b);
    paramFloatBuffer2.position(0);
    GLES20.glVertexAttribPointer(this.d, 2, 5126, false, 0, paramFloatBuffer2);
    GLES20.glEnableVertexAttribArray(this.d);
    GLES20.glUniformMatrix4fv(this.t, 1, false, this.s, 0);
    if (paramInt != -1)
    {
      GLES20.glActiveTexture(33984);
      GLES20.glBindTexture(36197, paramInt);
      GLES20.glUniform1i(this.c, 0);
    }
    GLES20.glDrawArrays(5, 0, 4);
    GLES20.glDisableVertexAttribArray(this.b);
    GLES20.glDisableVertexAttribArray(this.d);
    GLES20.glBindTexture(36197, 0);
  }
  
  public void a(float[] paramArrayOfFloat)
  {
    this.s = paramArrayOfFloat;
  }
  
  public boolean b()
  {
    boolean bool = super.b();
    this.t = GLES20.glGetUniformLocation(this.a, "textureTransform");
    return (bool) && (GLES20.glGetError() == 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/liteav/basic/d/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */