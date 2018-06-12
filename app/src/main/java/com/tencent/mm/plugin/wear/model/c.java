package com.tencent.mm.plugin.wear.model;

import com.tencent.mm.plugin.wear.model.e.i;
import com.tencent.mm.pluginsdk.o.f.a;
import com.tencent.mm.protocal.c.cec;
import com.tencent.mm.sdk.platformtools.bi;

public final class c
  implements o.f.a
{
  public final String bSn()
  {
    cec localcec = a.bSl().pIM.pJd.pJT;
    if (localcec != null) {
      return localcec.szg + "\n" + localcec.szh + "\n" + localcec.szi;
    }
    return "Not Connect";
  }
  
  public final void bSo()
  {
    a.bSl().pIS.a(new com.tencent.mm.plugin.wear.model.f.a());
  }
  
  public final boolean bSp()
  {
    Object localObject = a.bSl().pIM.pJd.pJT;
    if ((bi.oW(null)) && (bi.oW(null))) {
      return localObject != null;
    }
    if (bi.oW(null))
    {
      if (localObject != null) {
        throw new NullPointerException();
      }
      return false;
    }
    if (bi.oW(null))
    {
      if (localObject != null)
      {
        localObject = ((cec)localObject).szd;
        throw new NullPointerException();
      }
      return false;
    }
    if (localObject != null) {
      throw new NullPointerException();
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wear/model/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */