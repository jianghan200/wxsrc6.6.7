package com.tencent.mm.plugin.freewifi.ui;

import android.net.NetworkInfo.State;
import android.os.Bundle;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.freewifi.model.a;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.sdk.platformtools.x;

@Deprecated
public class FreeWifiAuthStateUI
  extends FreeWifiStateUI
{
  protected final void Yz()
  {
    j.aOP().a(this.ssid, new FreeWifiAuthStateUI.1(this), this.bxk, getIntent());
  }
  
  public final void a(NetworkInfo.State paramState)
  {
    x.i("MicroMsg.FreeWifi.FreeWifiAuthStateUI", "now network state : %s", new Object[] { paramState.toString() });
    if ((paramState == NetworkInfo.State.CONNECTED) && (d.BY(this.ssid)))
    {
      aPu();
      aPw();
    }
  }
  
  protected final void aPp()
  {
    aPt();
    d.BZ(this.ssid);
  }
  
  protected final int aPq()
  {
    j.aOJ();
    return d.BX(this.ssid);
  }
  
  protected final void initView()
  {
    super.initView();
    setMMTitle(R.l.free_wifi_title);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    d.a(this.ssid, 4, getIntent());
    x.i("MicroMsg.FreeWifi.FreeWifiAuthStateUI", "now it is from qrcode, try to auth");
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/FreeWifiAuthStateUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */