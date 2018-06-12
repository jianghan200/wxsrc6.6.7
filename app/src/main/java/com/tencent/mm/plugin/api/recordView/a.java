package com.tencent.mm.plugin.api.recordView;

import android.graphics.Point;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView.Renderer;
import android.opengl.Matrix;
import com.tencent.mm.plugin.mmsight.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

final class a
  implements GLSurfaceView.Renderer
{
  static float[] fao = { -1.0F, -1.0F, 1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F };
  static float[] fap = { -1.0F, -0.5F, 1.0F, -0.5F, -1.0F, 0.5F, 1.0F, 0.5F };
  private static final float[] faq = { 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F };
  int bYE = 0;
  boolean bum = false;
  private int faA;
  private int faB;
  private int faC;
  private int faD;
  private int faE;
  private int faF;
  FloatBuffer faG;
  private FloatBuffer faH;
  private float[] faI = new float[16];
  private boolean faJ = false;
  float[] faK = fao;
  boolean faL = false;
  private int far = 0;
  private int fas = 0;
  byte[] fat = null;
  int fau = 0;
  int fav = 0;
  ByteBuffer faw;
  ByteBuffer fax;
  private int fay;
  private int faz;
  
  public a()
  {
    Point localPoint = d.bdF();
    float f = localPoint.x / localPoint.y / 2.0F;
    fap = new float[] { -1.0F, -f, 1.0F, -f, -1.0F, f, 1.0F, f };
  }
  
  public final void onDrawFrame(GL10 paramGL10)
  {
    bi.VG();
    this.bum = true;
    GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    GLES20.glClear(16640);
    if (this.faJ)
    {
      x.i("MicroMsg.MMSightCameraGLRenderer", "clearFrameRequest");
      this.faJ = false;
      this.bum = false;
      this.fat = null;
      this.fau = -1;
      this.fav = -1;
      return;
    }
    if ((this.faA != 0) && (this.fay != -1) && (this.faz != -1) && (this.fau > 0) && (this.fav > 0) && (this.fat != null))
    {
      GLES20.glUseProgram(this.faA);
      GLES20.glActiveTexture(33984);
      GLES20.glBindTexture(3553, this.fay);
      GLES20.glTexImage2D(3553, 0, 6409, this.fau, this.fav, 0, 6409, 5121, this.faw);
      GLES20.glTexParameterf(3553, 10241, 9729.0F);
      GLES20.glTexParameterf(3553, 10240, 9729.0F);
      GLES20.glTexParameterf(3553, 10242, 33071.0F);
      GLES20.glTexParameterf(3553, 10243, 33071.0F);
      GLES20.glUniform1i(this.faD, 0);
      GLES20.glActiveTexture(33985);
      GLES20.glBindTexture(3553, this.faz);
      GLES20.glTexImage2D(3553, 0, 6410, this.fau / 2, this.fav / 2, 0, 6410, 5121, this.fax);
      GLES20.glTexParameterf(3553, 10241, 9729.0F);
      GLES20.glTexParameterf(3553, 10240, 9729.0F);
      GLES20.glTexParameterf(3553, 10242, 33071.0F);
      GLES20.glTexParameterf(3553, 10243, 33071.0F);
      GLES20.glUniform1i(this.faE, 1);
      Matrix.setIdentityM(this.faI, 0);
      Matrix.setRotateM(this.faI, 0, this.bYE, 0.0F, 0.0F, -1.0F);
      GLES20.glUniformMatrix4fv(this.faF, 1, false, this.faI, 0);
      this.faG.position(0);
      GLES20.glVertexAttribPointer(this.faC, 2, 5126, false, 0, this.faG);
      GLES20.glEnableVertexAttribArray(this.faC);
      this.faH.position(0);
      GLES20.glVertexAttribPointer(this.faB, 2, 5126, false, 0, this.faH);
      GLES20.glEnableVertexAttribArray(this.faB);
      GLES20.glDrawArrays(5, 0, 4);
      GLES20.glDisableVertexAttribArray(this.faC);
      GLES20.glDisableVertexAttribArray(this.faB);
      GLES20.glBindTexture(3553, 0);
    }
    this.bum = false;
  }
  
  public final void onSurfaceChanged(GL10 paramGL10, int paramInt1, int paramInt2)
  {
    x.i("MicroMsg.MMSightCameraGLRenderer", "onSurfaceChanged, surfaceWidth: %s, height: %s this %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), this });
    if ((paramInt1 != this.far) || (paramInt2 != this.fas))
    {
      x.i("MicroMsg.MMSightCameraGLRenderer", "onSurfaceChanged change viewpoint");
      GLES20.glViewport(0, 0, paramInt1, paramInt2);
      this.far = paramInt1;
      this.fas = paramInt2;
    }
  }
  
  public final void onSurfaceCreated(GL10 paramGL10, EGLConfig paramEGLConfig)
  {
    x.i("MicroMsg.MMSightCameraGLRenderer", "onSurfaceCreated this %s", new Object[] { this });
    GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
    GLES20.glDisable(2929);
    this.faA = b.aQ("attribute vec4 a_position;                         \nattribute vec2 a_texCoord;                         \nvarying vec2 v_texCoord;                           \nuniform mat4 uMatrix;                              \nvoid main() {                                      \n   gl_Position = uMatrix * a_position;             \n   v_texCoord = a_texCoord;                        \n}                                                  \n", "#ifdef GL_ES                                       \nprecision highp float;                             \n#endif                                             \nvarying vec2 v_texCoord;                           \nuniform sampler2D y_texture;                       \nuniform sampler2D uv_texture;                      \nvoid main (void) {                                 \n   float r, g, b, y, u, v;                         \n   y = texture2D(y_texture, v_texCoord).r;         \n   u = texture2D(uv_texture, v_texCoord).a;        \n   v = texture2D(uv_texture, v_texCoord).r;        \n   u = u - 0.5;                                    \n   v = v - 0.5;                                    \n   r = y + 1.370705 * v;                           \n   g = y - 0.337633 * u - 0.698001 * v;            \n   b = y + 1.732446 * u;                           \n   gl_FragColor = vec4(r, g, b, 1.0);              \n}                                                  \n");
    if (this.faA == 0) {
      x.e("MicroMsg.MMSightCameraGLRenderer", "onSurfaceCreated, load program failed!");
    }
    this.faC = GLES20.glGetAttribLocation(this.faA, "a_position");
    this.faB = GLES20.glGetAttribLocation(this.faA, "a_texCoord");
    this.faD = GLES20.glGetUniformLocation(this.faA, "y_texture");
    this.faE = GLES20.glGetUniformLocation(this.faA, "uv_texture");
    this.faF = GLES20.glGetUniformLocation(this.faA, "uMatrix");
    this.fay = b.ZQ();
    this.faz = b.ZQ();
    this.faG = ByteBuffer.allocateDirect(this.faK.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    this.faG.put(this.faK);
    this.faG.position(0);
    this.faH = ByteBuffer.allocateDirect(faq.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    this.faH.put(faq);
    this.faH.position(0);
    x.i("MicroMsg.MMSightCameraGLRenderer", "onSurfaceCreated, yTextureId: %s, uvTextureId: %s this %s", new Object[] { Integer.valueOf(this.fay), Integer.valueOf(this.faz), this });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/api/recordView/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */