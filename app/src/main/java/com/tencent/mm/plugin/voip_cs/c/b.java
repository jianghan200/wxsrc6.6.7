package com.tencent.mm.plugin.voip_cs.c;

import android.content.Context;
import com.tencent.mm.bp.a;
import com.tencent.mm.sdk.platformtools.ad;

public final class b
{
  public static final int lvg = a.fromDPToPix(ad.getContext(), 3);
  public static final int lvh = a.fromDPToPix(ad.getContext(), 4);
  public static final int lvi = a.fromDPToPix(ad.getContext(), 8);
  public static final int lvj = a.fromDPToPix(ad.getContext(), 10);
  public static final int lvk = a.fromDPToPix(ad.getContext(), 14);
  public static final int lvl = a.fromDPToPix(ad.getContext(), 30);
  public static final int lvn = a.fromDPToPix(ad.getContext(), 32);
  public static final int lvo = a.fromDPToPix(ad.getContext(), 96);
  public static final int lvp = a.fromDPToPix(ad.getContext(), 76);
  public static final int lvq = a.fromDPToPix(ad.getContext(), 230);
  private static int oYt = 0;
  
  public static int er(Context paramContext)
  {
    if (oYt == 0) {
      oYt = a.fl(paramContext);
    }
    return oYt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/voip_cs/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */