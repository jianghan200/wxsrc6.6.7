package com.tencent.mm.openim.d;

import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;

public final class b
  extends i<a>
{
  public static final String[] diD = { i.a(a.dhO, "OpenIMAccTypeInfo") };
  private e diF;
  
  public b(e parame)
  {
    super(parame, a.dhO, "OpenIMAccTypeInfo", null);
    this.diF = parame;
  }
  
  public final boolean a(a parama)
  {
    parama.field_updateTime = bi.VE();
    return super.a(parama);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/openim/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */