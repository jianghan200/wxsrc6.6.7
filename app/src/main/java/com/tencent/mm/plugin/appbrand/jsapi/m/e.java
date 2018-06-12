package com.tencent.mm.plugin.appbrand.jsapi.m;

import android.content.res.Configuration;
import com.tencent.mm.bc.a.a;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.x;

public final class e
{
  private static String fYq = "";
  private static String fYr = "";
  private static d fYs = new d();
  private static a.a fYt = a.a.euN;
  private static a.a fYu = a.a.euN;
  private static boolean mEnable = false;
  
  public static void a(Configuration paramConfiguration, String paramString)
  {
    if (paramConfiguration.orientation == 2) {
      if (fYt == a.a.euR) {
        fYu = a.a.euR;
      }
    }
    for (;;)
    {
      x.i("MicroMsg.OrientationConfigListenerHelper", "onConfigurationChanged mAppid:" + fYq + "; appid:" + paramString + "; mOrientation:" + fYu.name());
      if ((fYq.equalsIgnoreCase("")) || (!fYq.equalsIgnoreCase(paramString)) || (!mEnable)) {
        break;
      }
      fYs.a(fYu);
      return;
      fYu = a.a.euP;
      continue;
      if (paramConfiguration.orientation == 1) {
        fYu = a.a.euO;
      } else {
        fYu = a.a.euN;
      }
    }
    fYr = paramString;
  }
  
  public static void b(a.a parama)
  {
    fYt = parama;
    if ((mEnable) && (fYu == a.a.euP) && ((parama == a.a.euR) || (parama == a.a.euP)))
    {
      fYs.a(parama);
      x.i("MicroMsg.OrientationConfigListenerHelper", "onFourOrientationsChange mAppid:" + fYq + "; mOrientation:" + parama.name());
    }
  }
  
  public static void k(l paraml)
  {
    fYq = paraml.mAppId;
    mEnable = true;
    fYs.a(paraml);
    if ((fYu != a.a.euN) && (fYr.equalsIgnoreCase(fYq))) {
      fYs.a(fYu);
    }
    for (;;)
    {
      x.i("MicroMsg.OrientationConfigListenerHelper", "init mJsAppid:" + fYq + "; mEnable:" + mEnable);
      return;
      fYu = a.a.euN;
    }
  }
  
  public static void l(l paraml)
  {
    if (paraml.mAppId.equalsIgnoreCase(fYq))
    {
      x.i("MicroMsg.OrientationConfigListenerHelper", "unInit mAppid:" + fYq);
      fYq = "";
      mEnable = false;
      fYu = a.a.euN;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/m/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */