package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.a;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.plugin.appbrand.l;
import java.util.HashMap;

public final class b
  extends h
{
  public static final int CTRL_INDEX = -2;
  public static final String NAME = "onDownloadAppStateChange";
  private static HashMap<Integer, b> fHu = new HashMap();
  private MMToClientEvent.a fHt;
  
  private b(l paraml)
  {
    this.fHt = new b.1(this, paraml);
    MMToClientEvent.a(this.fHt);
    paraml.fdO.fcL.a(new b.2(this, paraml));
  }
  
  public static void f(l paraml)
  {
    if (fHu.containsKey(Integer.valueOf(paraml.hashCode()))) {
      return;
    }
    b localb = new b(paraml);
    fHu.put(Integer.valueOf(paraml.hashCode()), localb);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/appdownload/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */