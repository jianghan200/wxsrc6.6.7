package com.tencent.mm.api;

import com.tencent.mm.a.g;
import com.tencent.mm.plugin.p.c;
import com.tencent.mm.sdk.platformtools.bi;

public final class a
{
  public static String cy(String paramString)
  {
    String str = paramString;
    if (bi.oW(paramString)) {
      str = "tempConv";
    }
    paramString = new StringBuilder(c.Gc());
    paramString.append(g.u(str.getBytes())).append("/");
    paramString.append("conv/");
    return paramString.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/api/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */