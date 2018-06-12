package com.tencent.liteav.beauty.b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.d.d;
import com.tencent.liteav.basic.d.g;
import com.tencent.liteav.basic.d.h;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class q
  extends d
{
  public int r;
  public int s;
  public int t = -1;
  public int u;
  public int v;
  public int w = -1;
  private ByteBuffer x;
  private ByteBuffer y;
  
  public q(String paramString)
  {
    this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\nattribute vec4 inputTextureCoordinate3;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\nvarying vec2 textureCoordinate3;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n    textureCoordinate3 = inputTextureCoordinate3.xy;\n}", paramString);
    a(g.a, false, true);
  }
  
  public q(String paramString1, String paramString2)
  {
    super(paramString1, paramString2);
    a(g.a, false, true);
  }
  
  public int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return a(paramInt1, paramInt2, paramInt3, this.m, this.n);
  }
  
  public int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    this.t = paramInt2;
    this.w = paramInt3;
    return super.a(paramInt1, paramInt4, paramInt5);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    super.a(paramInt1, paramInt2);
  }
  
  public void a(g paramg, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramg = h.a(paramg, paramBoolean1, paramBoolean2);
    ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder());
    FloatBuffer localFloatBuffer = localByteBuffer.asFloatBuffer();
    localFloatBuffer.put(paramg);
    localFloatBuffer.flip();
    this.x = localByteBuffer;
    localByteBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder());
    localFloatBuffer = localByteBuffer.asFloatBuffer();
    localFloatBuffer.put(paramg);
    localFloatBuffer.flip();
    this.y = localByteBuffer;
  }
  
  public boolean b()
  {
    super.b();
    GLES20.glUseProgram(o());
    this.r = GLES20.glGetAttribLocation(o(), "inputTextureCoordinate2");
    this.u = GLES20.glGetAttribLocation(o(), "inputTextureCoordinate3");
    this.s = GLES20.glGetUniformLocation(o(), "inputImageTexture2");
    this.v = GLES20.glGetUniformLocation(o(), "inputImageTexture3");
    GLES20.glEnableVertexAttribArray(this.r);
    if (GLES20.glGetError() == 0) {}
    for (int i = 1;; i = 0)
    {
      GLES20.glEnableVertexAttribArray(this.u);
      if ((i == 0) || (GLES20.glGetError() != 0)) {
        break;
      }
      return true;
    }
    return false;
  }
  
  protected void i()
  {
    GLES20.glEnableVertexAttribArray(this.r);
    GLES20.glActiveTexture(33987);
    GLES20.glBindTexture(3553, this.t);
    GLES20.glUniform1i(this.s, 3);
    this.x.position(0);
    GLES20.glVertexAttribPointer(this.r, 2, 5126, false, 0, this.x);
    GLES20.glEnableVertexAttribArray(this.u);
    GLES20.glActiveTexture(33988);
    GLES20.glBindTexture(3553, this.w);
    GLES20.glUniform1i(this.v, 4);
    this.y.position(0);
    GLES20.glVertexAttribPointer(this.u, 2, 5126, false, 0, this.y);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/liteav/beauty/b/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */