package com.tencent.mm.plugin.sns.model;

import com.tencent.mm.plugin.sns.ui.bf;
import com.tencent.mm.protocal.c.bsu;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class at
  implements e
{
  public List<WeakReference<e>> nrS = new LinkedList();
  
  public final void a(int paramInt, String paramString1, long paramLong, String paramString2, bsu parambsu, boolean paramBoolean)
  {
    Iterator localIterator = this.nrS.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      if ((localWeakReference != null) && (localWeakReference.get() != null)) {
        ((e)localWeakReference.get()).a(paramInt, paramString1, paramLong, paramString2, parambsu, paramBoolean);
      }
    }
  }
  
  public final void a(int paramInt, String paramString1, long paramLong, String paramString2, bsu parambsu, boolean paramBoolean, bf parambf)
  {
    Iterator localIterator = this.nrS.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      if ((localWeakReference != null) && (localWeakReference.get() != null)) {
        ((e)localWeakReference.get()).a(paramInt, paramString1, paramLong, paramString2, parambsu, paramBoolean, parambf);
      }
    }
  }
  
  public final void a(e parame)
  {
    Iterator localIterator = this.nrS.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      if ((localWeakReference != null) && (localWeakReference.get() != null) && (((e)localWeakReference.get()).equals(parame))) {
        return;
      }
    }
    this.nrS.add(new WeakReference(parame));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/model/at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */