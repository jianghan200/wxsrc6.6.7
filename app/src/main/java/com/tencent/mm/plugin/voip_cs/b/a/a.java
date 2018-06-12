package com.tencent.mm.plugin.voip_cs.b.a;

import com.tencent.mm.R.k;
import com.tencent.mm.plugin.voip.video.i;
import com.tencent.mm.sdk.platformtools.ad;

public final class a
{
  private static a oXz;
  public i oNt = new i(ad.getContext());
  
  public static a bMC()
  {
    if (oXz == null) {
      oXz = new a();
    }
    return oXz;
  }
  
  public static a bMD()
  {
    if (oXz == null) {
      oXz = bMC();
    }
    return oXz;
  }
  
  public final boolean bKY()
  {
    if (this.oNt != null) {
      return this.oNt.alf();
    }
    return true;
  }
  
  public final void bME()
  {
    if (this.oNt != null) {
      this.oNt.n(R.k.phonering, 0, true);
    }
  }
  
  public final void stopRing()
  {
    if (this.oNt != null) {
      this.oNt.stop();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/voip_cs/b/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */