package com.tencent.mm.aq;

import com.tencent.mm.plugin.messenger.foundation.a.a.h.b;
import com.tencent.mm.protocal.c.bei;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.sdk.platformtools.bi;

@Deprecated
public final class n
  extends h.b
{
  private bei ecn = new bei();
  
  public n(String paramString1, String paramString2)
  {
    super(16);
    this.ecn.rvi = new bhz().VO(bi.oV(paramString1));
    this.ecn.rbR = new bhz().VO(bi.oV(paramString2));
    this.lcH = this.ecn;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/aq/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */