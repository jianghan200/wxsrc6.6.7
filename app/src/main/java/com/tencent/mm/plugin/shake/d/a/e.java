package com.tencent.mm.plugin.shake.d.a;

import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.c.bhp;

public abstract class e
  extends l
  implements k
{
  protected boolean mYF = false;
  long mYG = 0L;
  
  public e(long paramLong)
  {
    this.mYG = paramLong;
  }
  
  public final boolean bve()
  {
    return this.mYF;
  }
  
  public abstract bhp bvf();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/d/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */