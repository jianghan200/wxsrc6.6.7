package com.tencent.mm.aq;

import com.tencent.mm.plugin.messenger.foundation.a.a.h.b;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.rj;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.LinkedList;

@Deprecated
public final class e
  extends h.b
{
  private rj ece = new rj();
  
  public e(String paramString, long paramLong)
  {
    super(9);
    this.ece.rvi = new bhz().VO(bi.oV(paramString));
    this.ece.rvp.add(Integer.valueOf((int)paramLong));
    this.ece.hbF = 1;
    this.lcH = this.ece;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/aq/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */