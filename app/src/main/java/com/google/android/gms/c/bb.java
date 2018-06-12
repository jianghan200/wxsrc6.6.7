package com.google.android.gms.c;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class bb
  implements Cloneable
{
  private az<?, ?> baf;
  private Object bag;
  List<bg> bah = new ArrayList();
  
  private byte[] toByteArray()
  {
    byte[] arrayOfByte = new byte[pU()];
    a(ax.p(arrayOfByte, arrayOfByte.length));
    return arrayOfByte;
  }
  
  final void a(ax paramax)
  {
    if (this.bag != null) {
      this.baf.a(this.bag, paramax);
    }
    for (;;)
    {
      return;
      Iterator localIterator = this.bah.iterator();
      while (localIterator.hasNext())
      {
        bg localbg = (bg)localIterator.next();
        paramax.dJ(localbg.tag);
        paramax.m(localbg.bak);
      }
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1;
    if (paramObject == this) {
      bool1 = true;
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while (!(paramObject instanceof bb));
      paramObject = (bb)paramObject;
      if ((this.bag == null) || (((bb)paramObject).bag == null)) {
        break;
      }
      bool1 = bool2;
    } while (this.baf != ((bb)paramObject).baf);
    if (!this.baf.aZZ.isArray()) {
      return this.bag.equals(((bb)paramObject).bag);
    }
    if ((this.bag instanceof byte[])) {
      return Arrays.equals((byte[])this.bag, (byte[])((bb)paramObject).bag);
    }
    if ((this.bag instanceof int[])) {
      return Arrays.equals((int[])this.bag, (int[])((bb)paramObject).bag);
    }
    if ((this.bag instanceof long[])) {
      return Arrays.equals((long[])this.bag, (long[])((bb)paramObject).bag);
    }
    if ((this.bag instanceof float[])) {
      return Arrays.equals((float[])this.bag, (float[])((bb)paramObject).bag);
    }
    if ((this.bag instanceof double[])) {
      return Arrays.equals((double[])this.bag, (double[])((bb)paramObject).bag);
    }
    if ((this.bag instanceof boolean[])) {
      return Arrays.equals((boolean[])this.bag, (boolean[])((bb)paramObject).bag);
    }
    return Arrays.deepEquals((Object[])this.bag, (Object[])((bb)paramObject).bag);
    if ((this.bah != null) && (((bb)paramObject).bah != null)) {
      return this.bah.equals(((bb)paramObject).bah);
    }
    try
    {
      bool1 = Arrays.equals(toByteArray(), ((bb)paramObject).toByteArray());
      return bool1;
    }
    catch (IOException paramObject)
    {
      throw new IllegalStateException((Throwable)paramObject);
    }
  }
  
  public final int hashCode()
  {
    try
    {
      int i = Arrays.hashCode(toByteArray());
      return i + 527;
    }
    catch (IOException localIOException)
    {
      throw new IllegalStateException(localIOException);
    }
  }
  
  final int pU()
  {
    int j;
    if (this.bag != null)
    {
      j = this.baf.al(this.bag);
      return j;
    }
    Iterator localIterator = this.bah.iterator();
    bg localbg;
    for (int i = 0;; i = localbg.bak.length + (j + 0) + i)
    {
      j = i;
      if (!localIterator.hasNext()) {
        break;
      }
      localbg = (bg)localIterator.next();
      j = ax.dK(localbg.tag);
    }
  }
  
  public final bb qJ()
  {
    int i = 0;
    bb localbb = new bb();
    try
    {
      localbb.baf = this.baf;
      if (this.bah == null) {
        localbb.bah = null;
      }
      for (;;)
      {
        if (this.bag == null) {
          return localbb;
        }
        if (!(this.bag instanceof be)) {
          break;
        }
        localbb.bag = ((be)this.bag).qH();
        return localbb;
        localbb.bah.addAll(this.bah);
      }
      if (!(this.bag instanceof byte[])) {
        break label119;
      }
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError(localCloneNotSupportedException);
    }
    localCloneNotSupportedException.bag = ((byte[])this.bag).clone();
    return localCloneNotSupportedException;
    label119:
    Object localObject1;
    Object localObject2;
    if ((this.bag instanceof byte[][]))
    {
      localObject1 = (byte[][])this.bag;
      localObject2 = new byte[localObject1.length][];
      localCloneNotSupportedException.bag = localObject2;
      i = 0;
      while (i < localObject1.length)
      {
        localObject2[i] = ((byte[])localObject1[i].clone());
        i += 1;
      }
    }
    if ((this.bag instanceof boolean[]))
    {
      localCloneNotSupportedException.bag = ((boolean[])this.bag).clone();
      return localCloneNotSupportedException;
    }
    if ((this.bag instanceof int[]))
    {
      localCloneNotSupportedException.bag = ((int[])this.bag).clone();
      return localCloneNotSupportedException;
    }
    if ((this.bag instanceof long[]))
    {
      localCloneNotSupportedException.bag = ((long[])this.bag).clone();
      return localCloneNotSupportedException;
    }
    if ((this.bag instanceof float[]))
    {
      localCloneNotSupportedException.bag = ((float[])this.bag).clone();
      return localCloneNotSupportedException;
    }
    if ((this.bag instanceof double[]))
    {
      localCloneNotSupportedException.bag = ((double[])this.bag).clone();
      return localCloneNotSupportedException;
    }
    if ((this.bag instanceof be[]))
    {
      localObject1 = (be[])this.bag;
      localObject2 = new be[localObject1.length];
      localCloneNotSupportedException.bag = localObject2;
      while (i < localObject1.length)
      {
        localObject2[i] = localObject1[i].qH();
        i += 1;
      }
    }
    return localCloneNotSupportedException;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/google/android/gms/c/bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */