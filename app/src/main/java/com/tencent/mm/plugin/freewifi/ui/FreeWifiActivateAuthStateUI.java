package com.tencent.mm.plugin.freewifi.ui;

import android.net.NetworkInfo.State;
import android.os.Bundle;
import android.widget.Button;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.freewifi.model.a;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.sdk.platformtools.x;

@Deprecated
public class FreeWifiActivateAuthStateUI
  extends FreeWifiActivateStateUI
{
  protected final void Yz()
  {
    j.aOP().a(this.ssid, new FreeWifiActivateAuthStateUI.2(this), this.bxk, getIntent());
  }
  
  public final void a(NetworkInfo.State paramState)
  {
    x.i("MicroMsg.FreeWifi.FreeWifiActivateAuthStateUI", "now network state : %s", new Object[] { paramState.toString() });
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
    this.jlX = ((Button)findViewById(R.h.help_btn));
    this.jlX.setOnClickListener(new FreeWifiActivateAuthStateUI.1(this));
    setMMTitle(R.l.free_wifi_title);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (this.source != 2) {
      d.a(this.ssid, 1, getIntent());
    }
    x.i("MicroMsg.FreeWifi.FreeWifiActivateAuthStateUI", "now it is from qrcode, try to auth");
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/FreeWifiActivateAuthStateUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */