package com.tencent.mm.plugin.api.recordView;

import android.opengl.GLES20;
import com.tencent.mm.sdk.platformtools.x;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

final class d
{
  static float[] fao = { -1.0F, -1.0F, 1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F };
  static final float[] faq = { 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F };
  static final Object lock = new Object();
  int bYE = 0;
  boolean bum = false;
  int faA = -1;
  int faB;
  int faC;
  int faD;
  int faE;
  int faF;
  FloatBuffer faG;
  FloatBuffer faH;
  float[] faI = new float[16];
  float[] faK = fao;
  private int far = 0;
  private int fas = 0;
  int fau = 0;
  int fav = 0;
  ByteBuffer faw;
  ByteBuffer fax;
  int fay = -1;
  int faz = -1;
  volatile boolean fbg = false;
  volatile boolean fbh = false;
  
  public final void bz(int paramInt1, int paramInt2)
  {
    x.i("MicroMsg.MMSightRecordTextureViewRenderer", "onSurfaceChanged, surfaceWidth: %s, height: %s this %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), this });
    if ((paramInt1 != this.far) || (paramInt2 != this.fas))
    {
      x.i("MicroMsg.MMSightRecordTextureViewRenderer", "onSurfaceChanged change viewpoint");
      GLES20.glViewport(0, 0, paramInt1, paramInt2);
      this.far = paramInt1;
      this.fas = paramInt2;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/api/recordView/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */