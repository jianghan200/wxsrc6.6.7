package com.google.android.exoplayer2.source;

import java.util.Arrays;

public final class m
{
  public static final m asH = new m(new l[0]);
  private int aeo;
  public final l[] asI;
  public final int length;
  
  public m(l... paramVarArgs)
  {
    this.asI = paramVarArgs;
    this.length = paramVarArgs.length;
  }
  
  public final int a(l paraml)
  {
    int i = 0;
    while (i < this.length)
    {
      if (this.asI[i] == paraml) {
        return i;
      }
      i += 1;
    }
    return -1;
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
      paramObject = (m)paramObject;
    } while ((this.length == ((m)paramObject).length) && (Arrays.equals(this.asI, ((m)paramObject).asI)));
    return false;
  }
  
  public final int hashCode()
  {
    if (this.aeo == 0) {
      this.aeo = Arrays.hashCode(this.asI);
    }
    return this.aeo;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/exoplayer2/source/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */