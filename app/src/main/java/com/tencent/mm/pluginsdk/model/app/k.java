package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.y.g;

public final class k
  extends i<g>
{
  public static final String[] diD = { i.a(g.dhO, "AppMessage") };
  
  public k(e parame)
  {
    super(parame, g.dhO, "AppMessage", null);
  }
  
  public final g fI(long paramLong)
  {
    g localg = new g();
    localg.field_msgId = paramLong;
    if (super.b(localg, new String[0])) {
      return localg;
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/model/app/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */