package com.tencent.d.b.f;

import android.util.SparseArray;
import com.tencent.d.a.c.c;
import com.tencent.d.b.a.e;

public class f
{
  private static volatile f vmv = null;
  public static volatile SparseArray<d> vmw = null;
  public final Object vmx = new Object();
  
  private f()
  {
    vmw = new SparseArray(5);
  }
  
  public static f cFZ()
  {
    if (vmv == null) {
      try
      {
        if (vmv == null) {
          vmv = new f();
        }
        f localf = vmv;
        return localf;
      }
      finally {}
    }
    return vmv;
  }
  
  public final boolean a(d paramd, e parame)
  {
    int j;
    Object localObject;
    int i;
    if (!paramd.cFX())
    {
      j = paramd.hashCode();
      localObject = this.vmx;
      i = 0;
    }
    for (;;)
    {
      try
      {
        if (i < vmw.size())
        {
          int k = vmw.keyAt(i);
          if ((vmw.get(k) == null) || (!((d)vmw.get(k)).getClass().getName().equals(paramd.getClass().getName()))) {
            break label165;
          }
          c.w("Soter.SoterTaskManager", "soter: already such type of task. abandon add task", new Object[0]);
          parame.errCode = 26;
          parame.Yy = "add SOTER task to queue failed. check the logcat for further information";
          paramd.b(parame);
          return false;
        }
        vmw.put(j, paramd);
        g.cGb().C(new f.1(this, paramd));
        return true;
      }
      finally {}
      c.d("Soter.SoterTaskManager", "soter: prepare eat execute.", new Object[0]);
      return false;
      label165:
      i += 1;
    }
  }
  
  public final void cGa()
  {
    int i = 0;
    synchronized (this.vmx)
    {
      c.i("Soter.SoterTaskManager", "soter: request cancel all", new Object[0]);
      if (vmw.size() != 0) {
        while (i < vmw.size())
        {
          int j = vmw.keyAt(i);
          g.cGb().C(new f.2(this, j));
          i += 1;
        }
      }
      vmw.clear();
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/d/b/f/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */