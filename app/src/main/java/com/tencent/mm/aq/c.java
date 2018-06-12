package com.tencent.mm.aq;

import com.tencent.mm.plugin.messenger.foundation.a.a.h.b;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.ra;
import com.tencent.mm.sdk.platformtools.bi;

@Deprecated
public final class c
  extends h.b
{
  private ra ecc = new ra();
  public String username;
  
  public c(String paramString)
  {
    this(paramString, 0);
    this.username = paramString;
  }
  
  public c(String paramString, int paramInt)
  {
    super(4);
    this.ecc.rvi = new bhz().VO(bi.oV(paramString));
    this.ecc.rvk = paramInt;
    this.lcH = this.ecc;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/aq/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */