package com.tencent.mm.aq;

import com.tencent.mm.plugin.messenger.foundation.a.a.h.b;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.qx;
import com.tencent.mm.sdk.platformtools.bi;

@Deprecated
public final class b
  extends h.b
{
  private qx ecb = new qx();
  
  public b(String paramString)
  {
    super(7);
    this.ecb.rvi = new bhz().VO(bi.oV(paramString));
    this.lcH = this.ecb;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/aq/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */