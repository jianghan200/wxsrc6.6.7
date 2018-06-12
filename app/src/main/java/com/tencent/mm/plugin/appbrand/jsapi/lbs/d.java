package com.tencent.mm.plugin.appbrand.jsapi.lbs;

import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.report.service.h;
import org.json.JSONObject;

public final class d
  extends a
{
  private static final int CTRL_INDEX = 340;
  private static final String NAME = "enableLocationUpdate";
  private volatile f fQX;
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    h.mEJ.e(840L, 9L, 1L);
    boolean bool;
    try
    {
      if (this.fQX == null)
      {
        this.fQX = new f(paraml);
        this.fQX.start();
      }
      bool = paramJSONObject.optBoolean("enable");
      if ((!bool) && (!i(paraml)))
      {
        paraml.E(paramInt, f("ok", null));
        return;
      }
    }
    finally {}
    if (bool) {
      if (!i(paraml))
      {
        h.mEJ.e(840L, 11L, 1L);
        paraml.E(paramInt, f("fail:system permission denied", null));
      }
    }
    for (;;)
    {
      h.mEJ.e(840L, 10L, 1L);
      paraml.E(paramInt, f("ok", null));
      return;
      this.fQX.Dd(1);
      continue;
      this.fQX.Dd(2);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/lbs/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */