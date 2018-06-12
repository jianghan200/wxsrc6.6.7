package com.tencent.neattextview.textview.layout;

import android.text.Spanned;
import java.lang.reflect.Array;

public final class d<E>
{
  private final Class<? extends E> vaY;
  public int vaZ;
  public E[] vba;
  public int[] vbb;
  public int[] vbc;
  public int[] vbd;
  
  d(Class<? extends E> paramClass)
  {
    this.vaY = paramClass;
    this.vaZ = 0;
  }
  
  public final void a(Spanned paramSpanned, int paramInt)
  {
    Object[] arrayOfObject = paramSpanned.getSpans(0, paramInt, this.vaY);
    int i = arrayOfObject.length;
    if ((i > 0) && ((this.vba == null) || (this.vba.length < i)))
    {
      this.vba = ((Object[])Array.newInstance(this.vaY, i));
      this.vbb = new int[i];
      this.vbc = new int[i];
      this.vbd = new int[i];
    }
    this.vaZ = 0;
    paramInt = 0;
    while (paramInt < i)
    {
      Object localObject = arrayOfObject[paramInt];
      int j = paramSpanned.getSpanStart(localObject);
      int k = paramSpanned.getSpanEnd(localObject);
      if (j != k)
      {
        int m = paramSpanned.getSpanFlags(localObject);
        this.vba[this.vaZ] = localObject;
        this.vbb[this.vaZ] = j;
        this.vbc[this.vaZ] = k;
        this.vbd[this.vaZ] = m;
        this.vaZ += 1;
      }
      paramInt += 1;
    }
  }
  
  public final E fB(int paramInt1, int paramInt2)
  {
    int i = 0;
    while (i < this.vaZ)
    {
      if ((this.vbb[i] < paramInt2) && (this.vbc[i] > paramInt1)) {
        return (E)this.vba[i];
      }
      i += 1;
    }
    return null;
  }
  
  public final boolean[] fC(int paramInt1, int paramInt2)
  {
    boolean[] arrayOfBoolean = new boolean[this.vaZ];
    int i = 0;
    while (i < this.vaZ)
    {
      if ((this.vbb[i] < paramInt2) && (this.vbc[i] > paramInt1)) {
        arrayOfBoolean[i] = true;
      }
      i += 1;
    }
    return arrayOfBoolean;
  }
  
  public final E fD(int paramInt1, int paramInt2)
  {
    int i = 0;
    while (i < this.vaZ)
    {
      if ((this.vbb[i] == paramInt1) && (this.vbc[i] == paramInt2)) {
        return (E)this.vba[i];
      }
      i += 1;
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/neattextview/textview/layout/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */