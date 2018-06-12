package com.tencent.mm.plugin.api.recordView;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

final class c
  extends Thread
{
  private d faY;
  private SurfaceTexture fba;
  private EGL10 fbb;
  private EGLDisplay fbc = EGL10.EGL_NO_DISPLAY;
  private EGLContext fbd = EGL10.EGL_NO_CONTEXT;
  private EGLSurface fbe = EGL10.EGL_NO_SURFACE;
  volatile boolean fbf;
  
  public c(SurfaceTexture paramSurfaceTexture, d paramd)
  {
    this.fba = paramSurfaceTexture;
    this.faY = paramd;
  }
  
  public final void run()
  {
    x.i("MicroMsg.MMSightRecordTextureViewRenderThread", "start render thread");
    this.fbb = ((EGL10)EGLContext.getEGL());
    this.fbc = this.fbb.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
    int i;
    if (this.fbc == EGL10.EGL_NO_DISPLAY)
    {
      x.e("MicroMsg.MMSightRecordTextureViewRenderThread", "egl get display error: %s", new Object[] { GLUtils.getEGLErrorString(this.fbb.eglGetError()) });
      i = -1;
    }
    Object localObject3;
    while (i < 0)
    {
      x.e("MicroMsg.MMSightRecordTextureViewRenderThread", "init gl failed");
      return;
      ??? = new int[2];
      if (!this.fbb.eglInitialize(this.fbc, (int[])???))
      {
        x.e("MicroMsg.MMSightRecordTextureViewRenderThread", "egl init error: %s", new Object[] { GLUtils.getEGLErrorString(this.fbb.eglGetError()) });
        i = -1;
      }
      else
      {
        ??? = new int[1];
        localObject3 = new EGLConfig[1];
        if (!this.fbb.eglChooseConfig(this.fbc, new int[] { 12324, 4, 12323, 4, 12322, 4, 12352, 4, 12344 }, (EGLConfig[])localObject3, 1, (int[])???))
        {
          x.e("MicroMsg.MMSightRecordTextureViewRenderThread", "egl choose config failed: %s", new Object[] { GLUtils.getEGLErrorString(this.fbb.eglGetError()) });
          i = -1;
        }
        else
        {
          this.fbd = this.fbb.eglCreateContext(this.fbc, localObject3[0], EGL10.EGL_NO_CONTEXT, new int[] { 12440, 2, 12344 });
          this.fbe = this.fbb.eglCreateWindowSurface(this.fbc, localObject3[0], this.fba, null);
          if ((this.fbe == EGL10.EGL_NO_SURFACE) || (this.fbd == EGL10.EGL_NO_CONTEXT))
          {
            if (this.fbb.eglGetError() == 12299)
            {
              x.e("MicroMsg.MMSightRecordTextureViewRenderThread", "eglCreateWindowSurface returned EGL_BAD_NATIVE_WINDOW. ");
              i = -1;
            }
            else
            {
              x.e("MicroMsg.MMSightRecordTextureViewRenderThread", "eglCreateWindowSurface failed : %s", new Object[] { GLUtils.getEGLErrorString(this.fbb.eglGetError()) });
              i = -1;
            }
          }
          else
          {
            if (!this.fbb.eglMakeCurrent(this.fbc, this.fbe, this.fbe, this.fbd)) {
              x.e("MicroMsg.MMSightRecordTextureViewRenderThread", "eglMakeCurrent failed : %s", new Object[] { GLUtils.getEGLErrorString(this.fbb.eglGetError()) });
            }
            i = 0;
          }
        }
      }
    }
    if (this.faY != null) {
      localObject3 = this.faY;
    }
    for (;;)
    {
      synchronized (d.lock)
      {
        x.i("MicroMsg.MMSightRecordTextureViewRenderer", "init this %s", new Object[] { localObject3 });
        GLES20.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
        GLES20.glDisable(2929);
        ((d)localObject3).faA = b.aQ("attribute vec4 a_position;                         \nattribute vec2 a_texCoord;                         \nvarying vec2 v_texCoord;                           \nuniform mat4 uMatrix;                              \nvoid main() {                                      \n   gl_Position = uMatrix * a_position;             \n   v_texCoord = a_texCoord;                        \n}                                                  \n", "#ifdef GL_ES                                       \nprecision highp float;                             \n#endif                                             \nvarying vec2 v_texCoord;                           \nuniform sampler2D y_texture;                       \nuniform sampler2D uv_texture;                      \nvoid main (void) {                                 \n   float r, g, b, y, u, v;                         \n   y = texture2D(y_texture, v_texCoord).r;         \n   u = texture2D(uv_texture, v_texCoord).a;        \n   v = texture2D(uv_texture, v_texCoord).r;        \n   u = u - 0.5;                                    \n   v = v - 0.5;                                    \n   r = y + 1.370705 * v;                           \n   g = y - 0.337633 * u - 0.698001 * v;            \n   b = y + 1.732446 * u;                           \n   gl_FragColor = vec4(r, g, b, 1.0);              \n}                                                  \n");
        if (((d)localObject3).faA == 0) {
          x.e("MicroMsg.MMSightRecordTextureViewRenderer", "onSurfaceCreated, load program failed!");
        }
        ((d)localObject3).faC = GLES20.glGetAttribLocation(((d)localObject3).faA, "a_position");
        ((d)localObject3).faB = GLES20.glGetAttribLocation(((d)localObject3).faA, "a_texCoord");
        ((d)localObject3).faD = GLES20.glGetUniformLocation(((d)localObject3).faA, "y_texture");
        ((d)localObject3).faE = GLES20.glGetUniformLocation(((d)localObject3).faA, "uv_texture");
        ((d)localObject3).faF = GLES20.glGetUniformLocation(((d)localObject3).faA, "uMatrix");
        ((d)localObject3).fay = b.ZQ();
        ((d)localObject3).faz = b.ZQ();
        ((d)localObject3).faG = ByteBuffer.allocateDirect(((d)localObject3).faK.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        ((d)localObject3).faG.put(((d)localObject3).faK);
        ((d)localObject3).faG.position(0);
        ((d)localObject3).faH = ByteBuffer.allocateDirect(d.faq.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        ((d)localObject3).faH.put(d.faq);
        ((d)localObject3).faH.position(0);
        x.i("MicroMsg.MMSightRecordTextureViewRenderer", "onSurfaceCreated, yTextureId: %s, uvTextureId: %s this %s", new Object[] { Integer.valueOf(((d)localObject3).fay), Integer.valueOf(((d)localObject3).faz), localObject3 });
        x.i("MicroMsg.MMSightRecordTextureViewRenderThread", "init renderer finish");
        if (!this.fbf) {
          break;
        }
        if (this.faY != null) {
          if (this.faY.fbh) {}
        }
      }
      try
      {
        Thread.sleep(10L);
        localObject3 = this.faY;
        bi.VG();
        ((d)localObject3).bum = true;
        GLES20.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        GLES20.glClear(16640);
      }
      catch (InterruptedException localInterruptedException)
      {
        synchronized (d.lock)
        {
          if ((((d)localObject3).faA != -1) && (((d)localObject3).fay != -1) && (((d)localObject3).faz != -1) && (((d)localObject3).fau > 0) && (((d)localObject3).fav > 0) && (((d)localObject3).fax != null) && (((d)localObject3).faw != null) && (((d)localObject3).fax.limit() > 0) && (((d)localObject3).faw.limit() > 0) && (((d)localObject3).fax.position() == 0) && (((d)localObject3).faw.position() == 0))
          {
            GLES20.glUseProgram(((d)localObject3).faA);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, ((d)localObject3).fay);
            GLES20.glTexImage2D(3553, 0, 6409, ((d)localObject3).fau, ((d)localObject3).fav, 0, 6409, 5121, ((d)localObject3).faw);
            GLES20.glTexParameterf(3553, 10241, 9729.0F);
            GLES20.glTexParameterf(3553, 10240, 9729.0F);
            GLES20.glTexParameterf(3553, 10242, 33071.0F);
            GLES20.glTexParameterf(3553, 10243, 33071.0F);
            GLES20.glUniform1i(((d)localObject3).faD, 0);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, ((d)localObject3).faz);
            GLES20.glTexImage2D(3553, 0, 6410, ((d)localObject3).fau / 2, ((d)localObject3).fav / 2, 0, 6410, 5121, ((d)localObject3).fax);
            GLES20.glTexParameterf(3553, 10241, 9729.0F);
            GLES20.glTexParameterf(3553, 10240, 9729.0F);
            GLES20.glTexParameterf(3553, 10242, 33071.0F);
            GLES20.glTexParameterf(3553, 10243, 33071.0F);
            GLES20.glUniform1i(((d)localObject3).faE, 1);
            Matrix.setIdentityM(((d)localObject3).faI, 0);
            Matrix.setRotateM(((d)localObject3).faI, 0, ((d)localObject3).bYE, 0.0F, 0.0F, -1.0F);
            GLES20.glUniformMatrix4fv(((d)localObject3).faF, 1, false, ((d)localObject3).faI, 0);
            ((d)localObject3).faG.position(0);
            GLES20.glVertexAttribPointer(((d)localObject3).faC, 2, 5126, false, 0, ((d)localObject3).faG);
            GLES20.glEnableVertexAttribArray(((d)localObject3).faC);
            ((d)localObject3).faH.position(0);
            GLES20.glVertexAttribPointer(((d)localObject3).faB, 2, 5126, false, 0, ((d)localObject3).faH);
            GLES20.glEnableVertexAttribArray(((d)localObject3).faB);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(((d)localObject3).faC);
            GLES20.glDisableVertexAttribArray(((d)localObject3).faB);
            GLES20.glBindTexture(3553, 0);
          }
          ((d)localObject3).bum = false;
          if (this.fbb != null)
          {
            this.fbb.eglSwapBuffers(this.fbc, this.fbe);
            continue;
            localObject4 = finally;
            throw ((Throwable)localObject4);
            localInterruptedException = localInterruptedException;
            x.printErrStackTrace("MicroMsg.MMSightRecordTextureViewRenderThread", localInterruptedException, "", new Object[0]);
          }
        }
      }
    }
    x.i("MicroMsg.MMSightRecordTextureViewRenderThread", "finish render loop, start destroy gl");
    d locald;
    if (this.faY != null) {
      locald = this.faY;
    }
    synchronized (d.lock)
    {
      if (locald.faA >= 0)
      {
        GLES20.glDeleteProgram(locald.faA);
        locald.faA = -1;
      }
      if (locald.faz >= 0)
      {
        GLES20.glDeleteTextures(1, new int[] { locald.faz }, 0);
        locald.faz = -1;
      }
      if (locald.fay >= 0)
      {
        GLES20.glDeleteTextures(1, new int[] { locald.fay }, 0);
        locald.fay = -1;
      }
      locald.fav = -1;
      locald.fau = -1;
      locald.fbg = true;
      locald.faw = null;
      locald.fax = null;
      if ((this.fbb != null) && (this.fbd != null) && (this.fbe != null))
      {
        this.fbb.eglDestroyContext(this.fbc, this.fbd);
        this.fbb.eglDestroySurface(this.fbc, this.fbe);
        this.fbd = EGL10.EGL_NO_CONTEXT;
        this.fbe = EGL10.EGL_NO_SURFACE;
      }
      if (this.fba != null) {
        this.fba.release();
      }
      x.i("MicroMsg.MMSightRecordTextureViewRenderThread", "finish render loop, finish destroy gl");
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/api/recordView/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */