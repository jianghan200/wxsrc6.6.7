package com.tencent.mm.plugin.webview.ui.tools;

import android.net.wifi.WifiInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.webview.model.ak;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class g
{
  public static g pXv = new g();
  private String bJK;
  private String bssid;
  boolean dDR = false;
  com.tencent.mm.plugin.webview.stub.d gcO = null;
  private int networkType;
  String nyj;
  String pXw;
  private String ssid;
  
  public final void AI(int paramInt)
  {
    x.v("MicroMsg.WebViewReportUtil", "onReceivedError traceid %s", new Object[] { this.nyj });
    if (bi.oW(this.nyj)) {
      return;
    }
    f(3, "", paramInt);
  }
  
  public final void close()
  {
    x.v("MicroMsg.WebViewReportUtil", "close traceid %s", new Object[] { this.nyj });
    this.dDR = true;
    if (bi.oW(this.nyj)) {
      return;
    }
    kB(4);
    this.nyj = null;
  }
  
  final void f(int paramInt1, String paramString, int paramInt2)
  {
    com.tencent.mm.modelsns.d locald = new com.tencent.mm.modelsns.d();
    locald.r("20adInfo", this.nyj + ",");
    locald.r("21optype", paramInt1 + ",");
    locald.r("22sessionId", this.bJK + ",");
    locald.r("23currURL", this.pXw + ",");
    locald.r("24referURL", paramString + ",");
    locald.r("25errCode", paramInt2 + ",");
    locald.r("26networkType", this.networkType + ",");
    locald.r("27timeStamp", bi.VF() + ",");
    locald.r("28ssid", this.ssid + ",");
    locald.r("29bssid", this.bssid + ",");
    x.i("MicroMsg.WebViewReportUtil", "report logbuffer adPageOp(13791): optype:%d, sessionId:%s, currUrl:%s, referUrl:%s, errCode:%d, networkType:%d", new Object[] { Integer.valueOf(paramInt1), this.bJK, this.pXw, paramString, Integer.valueOf(paramInt2), Integer.valueOf(this.networkType) });
    h.mEJ.h(13791, new Object[] { locald });
    if (this.gcO == null)
    {
      x.e("MicroMsg.WebViewReportUtil", "report invoker null");
      return;
    }
    paramString = new Bundle();
    paramString.putString("ad_report_data_str", locald.toString());
    try
    {
      this.gcO.s(1295, paramString);
      return;
    }
    catch (RemoteException paramString)
    {
      x.e("MicroMsg.WebViewReportUtil", "report: exp:%s", new Object[] { paramString });
    }
  }
  
  public final void fr(String paramString1, String paramString2)
  {
    x.i("MicroMsg.WebViewReportUtil", "setting traceid " + paramString1 + ",usename " + paramString2);
    this.nyj = paramString1;
    this.networkType = ak.bUp();
    this.bJK = ac.ce(paramString2 + bi.VF());
    paramString1 = ao.getWifiInfo(ad.getContext());
    if (paramString1 == null) {
      this.ssid = "";
    }
    for (this.bssid = "";; this.bssid = paramString1.getBSSID())
    {
      this.dDR = false;
      return;
      this.ssid = paramString1.getSSID();
    }
  }
  
  final void kB(int paramInt)
  {
    f(paramInt, "", 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */