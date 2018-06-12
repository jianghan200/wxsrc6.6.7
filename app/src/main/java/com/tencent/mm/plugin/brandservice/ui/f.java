package com.tencent.mm.plugin.brandservice.ui;

import android.content.Context;
import android.util.SparseArray;
import com.tencent.mm.protocal.c.bfp;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.bju;
import com.tencent.mm.protocal.c.ju;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class f
  extends c
{
  List<bfp> hpR = null;
  private SparseArray<com.tencent.mm.plugin.brandservice.ui.base.a> hpS = new SparseArray();
  private int hpT;
  
  public f(Context paramContext)
  {
    super(paramContext);
    setReporter(new f.1(this));
  }
  
  public final void a(ju paramju, boolean paramBoolean)
  {
    super.a(paramju, paramBoolean);
    if (this.hpT == 0) {
      this.hpT = super.getCount();
    }
  }
  
  public final void auT()
  {
    super.auT();
  }
  
  public final void d(String paramString, List<ju> paramList)
  {
    super.d(paramString, paramList);
    this.hpT = super.getCount();
  }
  
  public final int getCount()
  {
    int i = super.getCount();
    int j = i;
    if (i == 0)
    {
      j = i;
      if (this.hpR != null)
      {
        Iterator localIterator = this.hpR.iterator();
        if (localIterator.hasNext())
        {
          bfp localbfp = (bfp)localIterator.next();
          if ((localbfp == null) || (localbfp.sgP == null)) {
            break label81;
          }
          i += localbfp.sgP.size();
        }
      }
    }
    label81:
    for (;;)
    {
      break;
      j = i;
      return j;
    }
  }
  
  protected final Object[] nv(int paramInt)
  {
    Object localObject2 = ns(paramInt);
    Object localObject1 = nt(paramInt);
    if (localObject2 != null)
    {
      localObject2 = ((c.a)localObject2).hoB;
      if (paramInt < this.hpT)
      {
        paramInt = 39;
        if (localObject1 == null) {
          break label71;
        }
      }
      label71:
      for (localObject1 = ((ju)localObject1).rlo;; localObject1 = "")
      {
        return new Object[] { this, localObject2, Integer.valueOf(paramInt), localObject1 };
        paramInt = 56;
        break;
      }
    }
    return super.nv(paramInt);
  }
  
  public final com.tencent.mm.ui.base.sortview.a nx(int paramInt)
  {
    int i = super.getCount();
    if (i != 0) {
      localObject1 = super.nx(paramInt);
    }
    Object localObject2;
    do
    {
      do
      {
        return (com.tencent.mm.ui.base.sortview.a)localObject1;
        localObject2 = (com.tencent.mm.plugin.brandservice.ui.base.a)this.hpS.get(paramInt);
        localObject1 = localObject2;
      } while (localObject2 != null);
      localObject1 = localObject2;
    } while (this.hpR.size() <= 0);
    Object localObject1 = this.hpR.iterator();
    if (((Iterator)localObject1).hasNext())
    {
      localObject2 = (bfp)((Iterator)localObject1).next();
      if (i == paramInt) {
        if (((bfp)localObject2).sgN == null)
        {
          localObject1 = null;
          label98:
          bju localbju = (bju)((bfp)localObject2).sgP.get(0);
          localObject2 = localObject1;
          localObject1 = localbju;
        }
      }
    }
    for (;;)
    {
      localObject1 = new b(localObject1, (String)localObject2);
      ((com.tencent.mm.plugin.brandservice.ui.base.a)localObject1).ny(paramInt);
      ((com.tencent.mm.plugin.brandservice.ui.base.a)localObject1).setPosition(paramInt);
      this.hpS.put(paramInt, localObject1);
      return (com.tencent.mm.ui.base.sortview.a)localObject1;
      localObject1 = ((bfp)localObject2).sgN.toString();
      break label98;
      if (paramInt < ((bfp)localObject2).sgP.size() + i)
      {
        localObject1 = (bju)((bfp)localObject2).sgP.get(paramInt - i);
        localObject2 = null;
      }
      else
      {
        i = ((bfp)localObject2).sgP.size() + i;
        break;
        localObject2 = null;
        localObject1 = null;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/brandservice/ui/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */