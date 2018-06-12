package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.w;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class e<T>
  implements Iterator<T>
{
  protected final b<T> aMv;
  protected int aMw;
  
  public e(b<T> paramb)
  {
    this.aMv = ((b)w.ah(paramb));
    this.aMw = -1;
  }
  
  public final boolean hasNext()
  {
    return this.aMw < this.aMv.getCount() - 1;
  }
  
  public final T next()
  {
    if (!hasNext()) {
      throw new NoSuchElementException("Cannot advance the iterator beyond " + this.aMw);
    }
    b localb = this.aMv;
    int i = this.aMw + 1;
    this.aMw = i;
    return (T)localb.get(i);
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/gms/common/data/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */