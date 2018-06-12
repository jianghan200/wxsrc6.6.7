package com.tencent.mm.plugin.messenger.foundation;

import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.q;
import com.tencent.mm.plugin.messenger.foundation.a.s;
import com.tencent.mm.protocal.c.pm;
import com.tencent.mm.protocal.c.qx;
import com.tencent.mm.storage.az;

public final class b
  implements q
{
  public final void a(pm parampm, byte[] paramArrayOfByte, boolean paramBoolean, s params)
  {
    switch (parampm.rtM)
    {
    default: 
      return;
    }
    parampm = (qx)new qx().aG(paramArrayOfByte);
    ((i)g.l(i.class)).FW().Yp(ab.a(parampm.rvi));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/messenger/foundation/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */