package com.google.android.exoplayer2;

public final class t
{
  public static final t aez = new t(0);
  public final int aeA;
  
  public t(int paramInt)
  {
    this.aeA = paramInt;
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
      paramObject = (t)paramObject;
    } while (this.aeA == ((t)paramObject).aeA);
    return false;
  }
  
  public final int hashCode()
  {
    return this.aeA;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/exoplayer2/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */