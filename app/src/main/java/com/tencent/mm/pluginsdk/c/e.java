package com.tencent.mm.pluginsdk.c;

import com.tencent.mm.g.a.rg;
import com.tencent.mm.sdk.b.a;

public final class e
{
  public static rg SG(String paramString)
  {
    rg localrg = new rg();
    localrg.cbZ.bNI = 1;
    localrg.cbZ.cca = paramString;
    a.sFg.m(localrg);
    return localrg;
  }
  
  public static void SH(String paramString)
  {
    rg localrg = new rg();
    localrg.cbZ.bNI = 2;
    localrg.cbZ.cca = paramString;
    a.sFg.m(localrg);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */