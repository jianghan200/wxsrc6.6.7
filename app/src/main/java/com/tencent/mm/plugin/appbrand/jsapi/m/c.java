package com.tencent.mm.plugin.appbrand.jsapi.m;

import com.tencent.mm.bc.a;
import com.tencent.mm.bc.a.b;
import com.tencent.mm.plugin.appbrand.jsapi.n;
import com.tencent.mm.plugin.appbrand.l;
import org.json.JSONObject;

public final class c
  extends n
{
  public static final int CTRL_INDEX = 472;
  public static final String NAME = "enableDeviceOrientationChangeListening";
  private boolean fYk = false;
  protected a fYl;
  private a.b fYm = new c.1(this);
  
  public final String a(l paraml, JSONObject paramJSONObject)
  {
    if (paramJSONObject.optBoolean("enable", false))
    {
      e.k(paraml);
      if (!this.fYk)
      {
        this.fYl = new a(paraml.getContext(), this.fYm);
        this.fYl.enable();
        this.fYk = true;
      }
    }
    for (;;)
    {
      return f("ok", null);
      e.l(paraml);
      if (this.fYk)
      {
        this.fYl.disable();
        this.fYl = null;
        this.fYk = false;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/m/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */