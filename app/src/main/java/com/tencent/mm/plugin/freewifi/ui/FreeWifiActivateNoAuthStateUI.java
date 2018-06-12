package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.net.NetworkInfo.State;
import android.os.Bundle;
import android.widget.Button;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.x;

@Deprecated
public abstract class FreeWifiActivateNoAuthStateUI
  extends FreeWifiActivateStateUI
{
  private String eSH;
  private int jlR;
  private boolean jlS;
  
  protected final void Yz()
  {
    aPp();
  }
  
  public void a(NetworkInfo.State paramState)
  {
    x.i("MicroMsg.FreeWifi.FreeWifiActivateNoAuthStateUI", "now network state : %s", new Object[] { paramState.toString() });
    if ((paramState == NetworkInfo.State.CONNECTED) && (d.BY(this.ssid)))
    {
      aPu();
      this.jma = false;
      d.a(this.ssid, 2, getIntent());
    }
  }
  
  protected final void aPp()
  {
    if (this.jma)
    {
      x.i("MicroMsg.FreeWifi.FreeWifiActivateNoAuthStateUI", "it is authing now");
      return;
    }
    this.jma = true;
    aPt();
    d.d(this.ssid, this.eSH, this.jlR, this.jlS);
  }
  
  protected int aPq()
  {
    if (d.BY(this.ssid))
    {
      d.a(this.ssid, 2, getIntent());
      return 2;
    }
    return 1;
  }
  
  protected abstract String aPr();
  
  protected final void initView()
  {
    super.initView();
    this.jlX.setVisibility(0);
    setMMTitle(aPr());
  }
  
  public void onCreate(Bundle paramBundle)
  {
    this.jlR = getIntent().getIntExtra("free_wifi_encrypt_type", 0);
    this.eSH = getIntent().getStringExtra("free_wifi_passowrd");
    this.jlS = getIntent().getBooleanExtra("free_wifi_hide_ssid", false);
    super.onCreate(paramBundle);
    d.a(this.ssid, 1, getIntent());
    x.i("MicroMsg.FreeWifi.FreeWifiActivateNoAuthStateUI", "Comes from webview, do auth");
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/FreeWifiActivateNoAuthStateUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */