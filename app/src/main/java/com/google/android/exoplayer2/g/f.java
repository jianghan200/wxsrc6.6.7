package com.google.android.exoplayer2.g;

import java.util.Arrays;

public final class f
{
  public final e[] aAu;
  private int aeo;
  public final int length;
  
  public f(e... paramVarArgs)
  {
    this.aAu = paramVarArgs;
    this.length = paramVarArgs.length;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject == null) || (getClass() != paramObject.getClass())) {
      return false;
    }
    paramObject = (f)paramObject;
    return Arrays.equals(this.aAu, ((f)paramObject).aAu);
  }
  
  public final int hashCode()
  {
    if (this.aeo == 0) {
      this.aeo = (Arrays.hashCode(this.aAu) + 527);
    }
    return this.aeo;
  }
  
  public final e[] lK()
  {
    return (e[])this.aAu.clone();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/exoplayer2/g/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */