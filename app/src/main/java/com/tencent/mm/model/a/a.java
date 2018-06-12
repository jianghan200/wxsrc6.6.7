package com.tencent.mm.model.a;

import com.tencent.mm.ab.d;
import com.tencent.mm.ab.d.a;
import com.tencent.mm.ab.d.b;
import com.tencent.mm.ab.d.c;
import com.tencent.mm.plugin.messenger.foundation.a.m;
import java.util.Map;

public final class a
  implements m
{
  public final d.b a(String paramString, Map<String, String> paramMap, d.a parama)
  {
    if ((paramString != null) && (paramString.equals("abtest")))
    {
      paramString = d.c.ba(Integer.valueOf(-1879048184));
      if (paramString != null) {}
    }
    else
    {
      return null;
    }
    return paramString.b(parama);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/model/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */