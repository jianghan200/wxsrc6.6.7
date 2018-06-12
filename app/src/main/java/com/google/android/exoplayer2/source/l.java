package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.i.a;
import java.util.Arrays;

public final class l
{
  private int aeo;
  public final Format[] asb;
  public final int length;
  
  public l(Format... paramVarArgs)
  {
    if (paramVarArgs.length > 0) {}
    for (boolean bool = true;; bool = false)
    {
      a.ap(bool);
      this.asb = paramVarArgs;
      this.length = paramVarArgs.length;
      return;
    }
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
      paramObject = (l)paramObject;
    } while ((this.length == ((l)paramObject).length) && (Arrays.equals(this.asb, ((l)paramObject).asb)));
    return false;
  }
  
  public final int hashCode()
  {
    if (this.aeo == 0) {
      this.aeo = (Arrays.hashCode(this.asb) + 527);
    }
    return this.aeo;
  }
  
  public final int j(Format paramFormat)
  {
    int i = 0;
    while (i < this.asb.length)
    {
      if (paramFormat == this.asb[i]) {
        return i;
      }
      i += 1;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/exoplayer2/source/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */