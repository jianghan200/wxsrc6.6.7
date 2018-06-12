package com.tencent.mm.plugin.webview.ui.tools.a;

import android.content.Context;
import android.os.Bundle;
import com.tencent.mm.g.a.dn;
import com.tencent.mm.g.a.dn.a;
import com.tencent.mm.g.a.do;
import com.tencent.mm.g.a.do.a;
import com.tencent.mm.g.a.dp;
import com.tencent.mm.g.a.dp.a;
import com.tencent.mm.g.a.dq;
import com.tencent.mm.g.a.dq.a;
import com.tencent.mm.g.a.dt;
import com.tencent.mm.g.a.dt.a;
import com.tencent.mm.g.a.dx;
import com.tencent.mm.g.a.eo;
import com.tencent.mm.plugin.webview.stub.e;
import com.tencent.mm.pluginsdk.ui.tools.r.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  implements r.a
{
  private static String DEVICE_TYPE = "lan";
  private static a qcQ;
  public String bKC;
  public boolean hasInit = false;
  public a qcP;
  public byte[] qcR = null;
  private int qcS = -1;
  public boolean qcT = false;
  
  public static a bWZ()
  {
    if (qcQ == null) {
      qcQ = new a();
    }
    return qcQ;
  }
  
  public final void bXa()
  {
    x.i("MicroMsg.webview.WebViewExDeviceLanMgr", "stopPlugin, isScaning = %s", new Object[] { Boolean.valueOf(this.qcT) });
    if (this.qcT)
    {
      localObject = new eo();
      ((eo)localObject).bMs.bKD = false;
      com.tencent.mm.sdk.b.a.sFg.m((b)localObject);
      this.qcT = false;
    }
    this.hasInit = false;
    if (this.qcP != null)
    {
      com.tencent.mm.sdk.b.a.sFg.c(this.qcP.qcU);
      com.tencent.mm.sdk.b.a.sFg.c(this.qcP.qcV);
      com.tencent.mm.sdk.b.a.sFg.c(this.qcP.qcX);
      com.tencent.mm.sdk.b.a.sFg.c(this.qcP.qcW);
      com.tencent.mm.sdk.b.a.sFg.c(this.qcP.qcY);
      this.qcP = null;
    }
    this.qcR = null;
    Object localObject = new dx();
    ((dx)localObject).bLI.bKD = false;
    com.tencent.mm.sdk.b.a.sFg.m((b)localObject);
  }
  
  public final void bXb() {}
  
  public final void ez(Context paramContext) {}
  
  public final String getName()
  {
    return "WebViewExDeviceLanMgr";
  }
  
  public static final class a
  {
    private String bKC = "";
    private e pRY = null;
    public c qcU = new c() {};
    public c qcV = new a.a.2(this);
    public c qcW = new c() {};
    public c qcX = new a.a.4(this);
    public c qcY = new a.a.5(this);
    
    public a(e parame, String paramString)
    {
      this.pRY = parame;
      this.bKC = paramString;
    }
    
    final boolean h(b paramb)
    {
      if (paramb == null) {
        return false;
      }
      if (this.pRY == null)
      {
        x.e("MicroMsg.webview.WebViewExDeviceLanMgr", "callbacker is null");
        return false;
      }
      Bundle localBundle;
      try
      {
        if ((paramb instanceof dt))
        {
          x.d("MicroMsg.webview.WebViewExDeviceLanMgr", "ExDeviceOnDeviceBindStateChangeEvent");
          paramb = (dt)paramb;
          if (bi.oW(paramb.bLE.byN)) {
            return true;
          }
          localBundle = new Bundle();
          localBundle.putString("exdevice_device_id", paramb.bLE.byN);
          localBundle.putBoolean("exdevice_is_bound", paramb.bLE.bKz);
          this.pRY.c(17, localBundle);
        }
        else if ((paramb instanceof dn))
        {
          x.d("MicroMsg.webview.WebViewExDeviceLanMgr", "ExDeviceLanDeviceConnectStateEvent");
          paramb = (dn)paramb;
          if ((bi.oW(paramb.bLu.byN)) || (!this.bKC.equals(paramb.bLu.bKC))) {
            break label541;
          }
          localBundle = new Bundle();
          localBundle.putString("exdevice_device_id", paramb.bLu.byN);
          localBundle.putInt("exdevice_on_state_change_state", paramb.bLu.bLv);
          localBundle.putString("exdevice_device_type", a.bP());
          this.pRY.c(1004, localBundle);
        }
      }
      catch (Exception paramb)
      {
        x.w("MicroMsg.webview.WebViewExDeviceLanMgr", "exception in WVExDeviceEventListener callback, %s", new Object[] { paramb.getMessage() });
      }
      if ((paramb instanceof do))
      {
        x.d("MicroMsg.webview.WebViewExDeviceLanMgr", "ExDeviceLanDeviceRecvDataEvent");
        paramb = (do)paramb;
        if ((bi.oW(paramb.bLw.byN)) || (bi.oW(paramb.bLw.bKC)) || (paramb.bLw.data == null)) {
          break label543;
        }
        localBundle = new Bundle();
        localBundle.putString("exdevice_device_id", paramb.bLw.byN);
        localBundle.putByteArray("exdevice_data", paramb.bLw.data);
        localBundle.putString("exdevice_brand_name", paramb.bLw.bKC);
        localBundle.putString("exdevice_device_type", a.bP());
        this.pRY.c(16, localBundle);
      }
      else if ((paramb instanceof dp))
      {
        x.i("MicroMsg.webview.WebViewExDeviceLanMgr", "ExDeviceLanDeviceScanResultEvent");
        paramb = (dp)paramb;
        localBundle = new Bundle();
        localBundle.putString("exdevice_device_id", paramb.bLx.byN);
        localBundle.putByteArray("exdevice_broadcast_data", paramb.bLx.bLy);
        localBundle.putBoolean("exdevice_is_complete", paramb.bLx.aoy);
        localBundle.putBoolean("exdevice_is_lan_device", true);
        localBundle.putString("exdevice_device_type", a.bP());
        this.pRY.c(15, localBundle);
      }
      else if ((paramb instanceof dq))
      {
        x.i("MicroMsg.webview.WebViewExDeviceLanMgr", "ExDeviceLanDeviceStateChangeEvent");
        paramb = (dq)paramb;
        localBundle = new Bundle();
        if (paramb.bLz.bLA == true) {
          localBundle.putBoolean("exdevice_lan_state", true);
        }
        for (;;)
        {
          this.pRY.c(47, localBundle);
          break;
          localBundle.putBoolean("exdevice_lan_state", false);
        }
      }
      return true;
      label541:
      return true;
      label543:
      return true;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */