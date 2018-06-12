package com.tencent.mm.ab;

import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.i.c;
import com.tencent.mm.protocal.i.c.a;
import com.tencent.mm.protocal.k.d;

public abstract class j
  implements com.tencent.mm.network.q
{
  private k.d dIT;
  public boolean dIU = false;
  
  public abstract k.d Ic();
  
  public int KP()
  {
    return 0;
  }
  
  public final k.d KV()
  {
    if (this.dIT == null)
    {
      this.dIT = Ic();
      k.d locald = this.dIT;
      locald.qWv = com.tencent.mm.compatible.e.q.zz();
      locald.qWu = d.DEVICE_TYPE;
      locald.qWt = d.qVN;
      locald.eK(i.c.a.qWj.Ia());
    }
    return this.dIT;
  }
  
  public final boolean KW()
  {
    return this.dIU;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ab/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */