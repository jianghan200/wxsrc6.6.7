package com.tencent.mm.plugin.appbrand.jsapi.h5_interact;

import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class a
  extends h
{
  private static final int CTRL_INDEX = 460;
  private static final String NAME = "onH5Data";
  private static final AtomicBoolean fQp = new AtomicBoolean(false);
  
  public static void aiR()
  {
    int i = 1;
    if (!fQp.getAndSet(true)) {}
    for (;;)
    {
      if (i != 0) {
        MMToClientEvent.a(new a.1());
      }
      return;
      i = 0;
    }
  }
  
  public static void j(String paramString1, String paramString2, int paramInt)
  {
    if (bi.oW(paramString1)) {}
    do
    {
      return;
      paramString1 = com.tencent.mm.plugin.appbrand.a.pY(paramString1);
    } while ((paramString1 == null) || (!paramString1.dti));
    try
    {
      paramString2 = new JSONObject().put("data", paramString2).put("webviewId", String.valueOf(paramInt));
      a locala = new a();
      locala.a(paramString1.fcy).mData = paramString2.toString();
      locala.ahM();
      return;
    }
    catch (Exception paramString1)
    {
      x.e("MicroMsg.AppBrand.EventOnH5Data", "dispatch ex = %s", new Object[] { paramString1 });
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/h5_interact/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */