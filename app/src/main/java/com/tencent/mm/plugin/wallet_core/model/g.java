package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.mm.sdk.platformtools.bi;
import org.json.JSONObject;

public final class g
{
  private static g pmP;
  public String lMX;
  public int pmQ = 0;
  JSONObject pmR;
  
  public static g bOA()
  {
    if (pmP == null) {
      pmP = new g();
    }
    return pmP;
  }
  
  public final boolean aKp()
  {
    return (this.pmQ == 1) && (!bi.oW(this.lMX));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */