package com.tencent.mm.aq;

import com.tencent.mm.plugin.messenger.foundation.a.a.h.b;
import com.tencent.mm.protocal.c.auc;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.sdk.platformtools.bi;

@Deprecated
public final class j
  extends h.b
{
  private auc ecj = new auc();
  
  public j(String paramString, int paramInt)
  {
    super(20);
    this.ecj.rbR = new bhz().VO(bi.oV(paramString));
    this.ecj.hcd = paramInt;
    this.lcH = this.ecj;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/aq/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */