package com.tencent.mm.bt.a;

import android.util.SparseArray;
import java.util.ArrayList;

public abstract class g<K, T extends a>
{
  public d teA;
  
  public g(d paramd, int paramInt)
  {
    this.teA = paramd;
    this.teA.lo(true);
    this.teA.a(new g.1(this));
    if (paramInt != 0) {
      this.teA.Dz(paramInt);
    }
    getCount();
  }
  
  public abstract ArrayList<T> ae(ArrayList<Object> paramArrayList);
  
  public final void c(Object paramObject, T paramT)
  {
    this.teA.a(paramObject, paramT);
  }
  
  public final void close()
  {
    this.teA.close();
    this.teA = null;
  }
  
  public final boolean cm(Object paramObject)
  {
    return this.teA.cm(paramObject);
  }
  
  public final SparseArray<K>[] cnS()
  {
    return this.teA.cnS();
  }
  
  public final boolean cnU()
  {
    return this.teA.cnU();
  }
  
  public abstract T coe();
  
  public final int getCount()
  {
    return this.teA.getCount();
  }
  
  public final boolean isClosed()
  {
    return this.teA.isClosed();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/bt/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */