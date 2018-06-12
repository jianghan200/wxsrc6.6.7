package com.tencent.mm.u.c;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.u.b.e;
import java.util.HashMap;
import java.util.Map;

public final class g
{
  private final Map<String, e> dpb = new HashMap();
  
  public final void a(e parame)
  {
    this.dpb.put(parame.getName(), parame);
  }
  
  public final e fO(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    return (e)this.dpb.get(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/u/c/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */