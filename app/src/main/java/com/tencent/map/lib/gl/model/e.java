package com.tencent.map.lib.gl.model;

import android.opengl.Matrix;

public class e
{
  public float a;
  public float b;
  public float c;
  public float d = 1.0F;
  
  public e() {}
  
  public e(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.a = paramFloat1;
    this.b = paramFloat2;
    this.c = paramFloat3;
  }
  
  public e a(float[] paramArrayOfFloat)
  {
    float[] arrayOfFloat = new float[4];
    Matrix.multiplyMV(arrayOfFloat, 0, paramArrayOfFloat, 0, new float[] { this.a, this.b, this.c, this.d }, 0);
    return new e(arrayOfFloat[0] / arrayOfFloat[3], arrayOfFloat[1] / arrayOfFloat[3], arrayOfFloat[2] / arrayOfFloat[3]);
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof e))) {}
    do
    {
      return false;
      paramObject = (e)paramObject;
    } while ((this.a != ((e)paramObject).a) || (this.b != ((e)paramObject).b) || (this.c != ((e)paramObject).c));
    return true;
  }
  
  public String toString()
  {
    return this.a + "," + this.b + "," + this.c;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/map/lib/gl/model/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */