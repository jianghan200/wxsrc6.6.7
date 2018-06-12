package com.google.android.gms.c;

import com.google.android.gms.common.internal.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class ag<T extends ag>
{
  public final ah aYi;
  protected final ae aYj;
  private final List<Object> aYk;
  
  public ag(ah paramah, v paramv)
  {
    w.ah(paramah);
    this.aYi = paramah;
    this.aYk = new ArrayList();
    paramah = new ae(this, paramv);
    paramah.aYf = true;
    this.aYj = paramah;
  }
  
  public void a(ae paramae) {}
  
  public ae oj()
  {
    ae localae = this.aYj.ql();
    qo();
    return localae;
  }
  
  public final ae qm()
  {
    return this.aYj;
  }
  
  public final List<ai> qn()
  {
    return this.aYj.aYh;
  }
  
  public final void qo()
  {
    Iterator localIterator = this.aYk.iterator();
    while (localIterator.hasNext()) {
      localIterator.next();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/gms/c/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */