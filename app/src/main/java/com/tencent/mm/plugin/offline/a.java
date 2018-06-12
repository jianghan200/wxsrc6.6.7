package com.tencent.mm.plugin.offline;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public abstract class a<T>
{
  protected List<WeakReference<T>> lIC = new ArrayList();
  
  public final void bN(T paramT)
  {
    if (this.lIC != null) {
      this.lIC = new ArrayList();
    }
    if (paramT != null) {
      this.lIC.add(new WeakReference(paramT));
    }
  }
  
  public final void bO(T paramT)
  {
    if ((this.lIC == null) || (paramT == null)) {}
    for (;;)
    {
      return;
      int i = 0;
      while (i < this.lIC.size())
      {
        WeakReference localWeakReference = (WeakReference)this.lIC.get(i);
        if (localWeakReference != null)
        {
          Object localObject = localWeakReference.get();
          if ((localObject != null) && (localObject.equals(paramT)))
          {
            localWeakReference.clear();
            this.lIC.remove(localWeakReference);
          }
        }
        i += 1;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/offline/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */