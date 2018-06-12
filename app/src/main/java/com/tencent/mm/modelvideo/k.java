package com.tencent.mm.modelvideo;

import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bi;

public final class k
{
  public static final String SU()
  {
    return g.Ei().dqp + "draft/";
  }
  
  public static final String nB(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    return SU() + paramString;
  }
  
  public static final String nC(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    return SU() + paramString + ".thumb";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/modelvideo/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */