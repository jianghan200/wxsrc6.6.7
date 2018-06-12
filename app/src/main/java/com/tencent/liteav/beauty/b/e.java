package com.tencent.liteav.beauty.b;

import android.opengl.GLES20;

public class e
  extends q
{
  private int A;
  private float[] B;
  private int x;
  private int y;
  private int z;
  
  public void b(float[] paramArrayOfFloat)
  {
    float[] arrayOfFloat = new float[3];
    arrayOfFloat[0] = ((float)(0.2989D * paramArrayOfFloat[0] + 0.5866D * paramArrayOfFloat[1] + 0.1145D * paramArrayOfFloat[2]));
    arrayOfFloat[1] = ((float)(0.7132D * (paramArrayOfFloat[0] - arrayOfFloat[0])));
    arrayOfFloat[2] = ((float)(0.5647D * (paramArrayOfFloat[2] - arrayOfFloat[0])));
    b(this.y, arrayOfFloat);
  }
  
  public void c()
  {
    super.c();
    this.x = GLES20.glGetUniformLocation(o(), "screenMode");
    this.y = GLES20.glGetUniformLocation(o(), "screenReplaceColor");
    this.z = GLES20.glGetUniformLocation(o(), "screenMirrorX");
    this.A = GLES20.glGetUniformLocation(o(), "screenMirrorY");
    b(this.B);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/liteav/beauty/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */