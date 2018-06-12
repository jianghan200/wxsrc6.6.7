package com.tencent.mm.plugin.appbrand.app;

import com.tencent.mm.plugin.appbrand.appcache.o;
import com.tencent.mm.plugin.appbrand.jsapi.h5_interact.SendDataToMiniProgramFromH5Event;
import com.tencent.mm.plugin.appbrand.jsapi.op_report.AppBrandOpReportLogic.b;
import com.tencent.mm.plugin.appbrand.n.a;

final class d
  implements a
{
  public final void aaT() {}
  
  public final void k(String paramString1, String paramString2, int paramInt)
  {
    SendDataToMiniProgramFromH5Event localSendDataToMiniProgramFromH5Event = new SendDataToMiniProgramFromH5Event();
    localSendDataToMiniProgramFromH5Event.fQs = paramString1;
    localSendDataToMiniProgramFromH5Event.data = paramString2;
    localSendDataToMiniProgramFromH5Event.fQt = paramInt;
    com.tencent.mm.plugin.appbrand.ipc.d.c(localSendDataToMiniProgramFromH5Event);
  }
  
  public final int qA(String paramString)
  {
    return AppBrandOpReportLogic.b.tW(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/app/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */