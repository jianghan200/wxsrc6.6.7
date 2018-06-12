package com.tencent.mm.aq;

import com.tencent.mm.plugin.messenger.foundation.a.a.h.b;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.rd;
import com.tencent.mm.sdk.platformtools.bi;

@Deprecated
public final class d
  extends h.b
{
  private rd ecd = new rd();
  
  public d(String paramString, long paramLong)
  {
    super(8);
    this.ecd.rvi = new bhz().VO(bi.oV(paramString));
    this.ecd.rcq = paramLong;
    this.lcH = this.ecd;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/aq/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */