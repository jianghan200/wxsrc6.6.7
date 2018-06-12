package com.google.android.exoplayer2;

public final class p
{
  public static final p aew = new p(1.0F, 1.0F);
  public final float aex;
  public final int aey;
  public final float pitch;
  
  public p(float paramFloat1, float paramFloat2)
  {
    this.aex = paramFloat1;
    this.pitch = paramFloat2;
    this.aey = Math.round(1000.0F * paramFloat1);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      paramObject = (p)paramObject;
    } while ((this.aex == ((p)paramObject).aex) && (this.pitch == ((p)paramObject).pitch));
    return false;
  }
  
  public final int hashCode()
  {
    return (Float.floatToRawIntBits(this.aex) + 527) * 31 + Float.floatToRawIntBits(this.pitch);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/exoplayer2/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */