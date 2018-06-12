package com.tencent.d.b.f;

import android.util.SparseArray;
import com.tencent.d.a.c.c;
import com.tencent.d.b.a.b;
import com.tencent.d.b.a.e;

public abstract class d
{
  boolean vlZ = false;
  public b vmm;
  
  final void b(e parame)
  {
    f localf;
    for (;;)
    {
      try
      {
        if (this.vlZ)
        {
          c.w("Soter.BaseSoterTask", "soter: warning: already removed the task!", new Object[0]);
          return;
        }
        localf = f.cFZ();
        if (this != null)
        {
          ??? = Integer.valueOf(hashCode());
          c.i("Soter.SoterTaskManager", "soter: removing task: %d", new Object[] { ??? });
          if (this != null) {
            break;
          }
          c.e("Soter.SoterTaskManager", "soter: task is null", new Object[0]);
          g.cGb().A(new d.1(this, parame));
        }
        else
        {
          ??? = "null";
        }
      }
      finally {}
    }
    for (;;)
    {
      synchronized (localf.vmx)
      {
        if (f.vmw.get(hashCode()) == null) {
          c.i("Soter.SoterTaskManager", "soter: no such task: %d. maybe this task did not pass preExecute", new Object[] { Integer.valueOf(hashCode()) });
        }
      }
      f.vmw.remove(hashCode());
    }
  }
  
  abstract boolean cFX();
  
  abstract void cFY();
  
  abstract void execute();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/d/b/f/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */