package com.tencent.mm.plugin.setting.model;

import com.tencent.mm.plugin.messenger.foundation.a.a.h.b;
import com.tencent.mm.protocal.c.aug;
import com.tencent.mm.protocal.c.sh;
import com.tencent.mm.protocal.c.si;

public final class k
  extends h.b
{
  private aug mOO = new aug();
  
  public k()
  {
    this(false, 22, 8);
  }
  
  public k(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    super(31);
    sh localsh = new sh();
    if (paramBoolean) {}
    for (int i = 1;; i = 0)
    {
      localsh.rvE = i;
      i = j;
      if (paramBoolean) {
        i = 0;
      }
      localsh.rvG = i;
      si localsi = new si();
      localsi.rvI = paramInt1;
      localsi.rvJ = paramInt2;
      localsh.rvF = localsi;
      localsi.rvI = 0;
      localsi.rvJ = 0;
      localsh.rvH = localsi;
      this.mOO.rXz = localsh;
      this.lcH = this.mOO;
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/setting/model/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */