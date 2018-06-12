package com.tencent.mm.openim.d;

import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;

public final class d
  extends i<c>
{
  public static final String[] diD = { i.a(c.dhO, "OpenIMAppIdInfo") };
  public e diF;
  
  public d(e parame)
  {
    super(parame, c.dhO, "OpenIMAppIdInfo", null);
    this.diF = parame;
  }
  
  public final boolean a(c paramc)
  {
    paramc.field_updateTime = bi.VE();
    return super.a(paramc);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/openim/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */