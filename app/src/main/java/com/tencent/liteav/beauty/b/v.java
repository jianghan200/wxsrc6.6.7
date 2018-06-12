package com.tencent.liteav.beauty.b;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.tencent.liteav.basic.d.d;
import com.tencent.liteav.beauty.c.d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.List;

public class v
  extends d
{
  private static final short[] x = { 1, 2, 0, 2, 0, 3 };
  private static final float[] y = { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F };
  private static final float[] z = { 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F };
  private ShortBuffer A = null;
  private String B = "GPUWatermark";
  protected a[] r = null;
  protected List<c.d> s = null;
  protected boolean t = false;
  protected int u = 772;
  private a v = null;
  private int w = 1;
  
  public v()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocateDirect(x.length * 2);
    localByteBuffer.order(ByteOrder.nativeOrder());
    this.A = localByteBuffer.asShortBuffer();
    this.A.put(x);
    this.A.position(0);
    this.o = true;
  }
  
  private void p()
  {
    if (this.r != null)
    {
      int i = 0;
      while (i < this.r.length)
      {
        if (this.r[i] != null)
        {
          if (this.r[i].d != null) {
            GLES20.glDeleteTextures(1, this.r[i].d, 0);
          }
          this.r[i].d = null;
          this.r[i].c = null;
          this.r[i] = null;
        }
        i += 1;
      }
    }
    this.r = null;
  }
  
  protected void a(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt3)
  {
    Object localObject = ByteBuffer.allocateDirect(y.length * 4);
    ((ByteBuffer)localObject).order(ByteOrder.nativeOrder());
    this.r[paramInt3].a = ((ByteBuffer)localObject).asFloatBuffer();
    localObject = new float[y.length];
    float f2 = paramInt2 / paramInt1 * paramFloat3 * this.e / this.f;
    float f1;
    if (paramFloat1 < 0.0F)
    {
      f1 = 0.0F;
      if (paramFloat2 >= 0.0F) {
        break label203;
      }
      paramFloat1 = 0.0F;
    }
    for (;;)
    {
      localObject[0] = (2.0F * f1 - 1.0F);
      localObject[1] = (1.0F - 2.0F * paramFloat1);
      localObject[2] = localObject[0];
      localObject[3] = (localObject[1] - f2 * 2.0F);
      localObject[4] = (localObject[0] + 2.0F * paramFloat3);
      localObject[5] = localObject[3];
      localObject[6] = localObject[4];
      localObject[7] = localObject[1];
      paramInt1 = 1;
      while (paramInt1 <= 7)
      {
        localObject[paramInt1] *= -1.0F;
        paramInt1 += 2;
      }
      f1 = paramFloat1;
      if (paramFloat1 <= 1.0F) {
        break;
      }
      f1 = 1.0F;
      break;
      label203:
      paramFloat1 = paramFloat2;
      if (paramFloat2 > 1.0F) {
        paramFloat1 = 1.0F;
      }
    }
    this.r[paramInt3].a.put((float[])localObject);
    this.r[paramInt3].a.position(0);
    localObject = ByteBuffer.allocateDirect(z.length * 4);
    ((ByteBuffer)localObject).order(ByteOrder.nativeOrder());
    this.r[paramInt3].b = ((ByteBuffer)localObject).asFloatBuffer();
    this.r[paramInt3].b.put(z);
    this.r[paramInt3].b.position(0);
  }
  
  public void a(int paramInt, FloatBuffer paramFloatBuffer1, FloatBuffer paramFloatBuffer2)
  {
    GLES20.glUseProgram(this.a);
    k();
    paramFloatBuffer1.position(0);
    GLES20.glVertexAttribPointer(this.b, 2, 5126, false, 0, paramFloatBuffer1);
    GLES20.glEnableVertexAttribArray(this.b);
    paramFloatBuffer2.position(0);
    GLES20.glVertexAttribPointer(this.d, 2, 5126, false, 0, paramFloatBuffer2);
    GLES20.glEnableVertexAttribArray(this.d);
    if (paramInt != -1)
    {
      GLES20.glActiveTexture(33984);
      GLES20.glBindTexture(3553, paramInt);
      GLES20.glUniform1i(this.c, 0);
      i();
      GLES20.glDrawArrays(5, 0, 4);
    }
    GLES20.glDisableVertexAttribArray(this.b);
    GLES20.glDisableVertexAttribArray(this.d);
    if (this.t)
    {
      GLES20.glEnable(3042);
      GLES20.glBlendFunc(this.u, 771);
      GLES20.glActiveTexture(33984);
      paramInt = 0;
      while (paramInt < this.r.length)
      {
        if (this.r[paramInt] != null)
        {
          GLES20.glBindTexture(3553, this.r[paramInt].d[0]);
          GLES20.glUniform1i(this.c, 0);
          GLES20.glVertexAttribPointer(this.b, 2, 5126, false, 8, this.r[paramInt].a);
          GLES20.glEnableVertexAttribArray(this.b);
          GLES20.glVertexAttribPointer(this.d, 4, 5126, false, 16, this.r[paramInt].b);
          GLES20.glEnableVertexAttribArray(this.d);
          GLES20.glDrawElements(4, x.length, 5123, this.A);
          GLES20.glDisableVertexAttribArray(this.b);
          GLES20.glDisableVertexAttribArray(this.d);
        }
        paramInt += 1;
      }
      GLES20.glDisable(3042);
    }
    GLES20.glBindTexture(3553, 0);
  }
  
  public void a(Bitmap paramBitmap, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (this.r == null) {
      this.r = new a[1];
    }
    if (this.r[0] == null) {
      this.r[0] = new a();
    }
    a(paramBitmap, paramFloat1, paramFloat2, paramFloat3, 0);
    this.v = this.r[0];
  }
  
  public void a(Bitmap paramBitmap, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt)
  {
    if (paramBitmap == null) {
      if ((this.r != null) && (this.r[paramInt] != null))
      {
        new StringBuilder("release ").append(paramInt).append(" water mark!");
        if (this.r[paramInt].d != null) {
          GLES20.glDeleteTextures(1, this.r[paramInt].d, 0);
        }
        this.r[paramInt].d = null;
        this.r[paramInt].c = null;
        this.r[paramInt] = null;
      }
    }
    while ((this.r[paramInt] == null) || (paramInt >= this.r.length)) {
      return;
    }
    a(paramBitmap.getWidth(), paramBitmap.getHeight(), paramFloat1, paramFloat2, paramFloat3, paramInt);
    if (this.r[paramInt].d == null)
    {
      this.r[paramInt].d = new int[1];
      GLES20.glGenTextures(1, this.r[paramInt].d, 0);
      GLES20.glBindTexture(3553, this.r[paramInt].d[0]);
      GLES20.glTexParameterf(3553, 10240, 9729.0F);
      GLES20.glTexParameterf(3553, 10241, 9729.0F);
      GLES20.glTexParameterf(3553, 10242, 33071.0F);
      GLES20.glTexParameterf(3553, 10243, 33071.0F);
    }
    if ((this.r[paramInt].c == null) || (!this.r[paramInt].c.equals(paramBitmap)))
    {
      GLES20.glBindTexture(3553, this.r[paramInt].d[0]);
      GLUtils.texImage2D(3553, 0, paramBitmap, 0);
    }
    this.r[paramInt].c = paramBitmap;
  }
  
  public void c(boolean paramBoolean)
  {
    this.t = paramBoolean;
  }
  
  public void d()
  {
    super.d();
    this.t = false;
    p();
  }
  
  public class a
  {
    public FloatBuffer a = null;
    public FloatBuffer b = null;
    public Bitmap c;
    public int[] d = null;
    
    public a() {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/liteav/beauty/b/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */