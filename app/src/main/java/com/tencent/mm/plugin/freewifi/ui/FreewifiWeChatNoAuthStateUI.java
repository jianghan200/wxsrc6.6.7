package com.tencent.mm.plugin.freewifi.ui;

import android.net.NetworkInfo.State;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.freewifi.d.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.sdk.platformtools.x;

@Deprecated
public class FreewifiWeChatNoAuthStateUI
  extends FreeWifiNoAuthStateUI
{
  private int bMF;
  private String joq;
  private String jor;
  
  public final void a(NetworkInfo.State paramState)
  {
    x.i("MicroMsg.FreeWifi.FreewifiWeChatNoAuthStateUI", "now network state : %s", new Object[] { paramState.toString() });
    if ((paramState == NetworkInfo.State.CONNECTED) && (d.BY(this.ssid)) && (this.jma))
    {
      aPu();
      this.jma = false;
      this.joq = d.aOx();
      this.jor = d.aOz();
      this.bMF = d.aOy();
      x.i("MicroMsg.FreeWifi.FreewifiWeChatNoAuthStateUI", "now has connect the ap, check from server rssi is :  %d, mac : %s, ssid is : %s", new Object[] { Integer.valueOf(this.bMF), this.joq, this.jor });
      new a(this.jkH, this.joq, this.jor, this.bMF, this.bxk, m.E(getIntent())).b(new FreewifiWeChatNoAuthStateUI.1(this));
    }
  }
  
  protected final int aPq()
  {
    j.aOJ();
    int j = d.BX(this.ssid);
    x.i("MicroMsg.FreeWifi.FreewifiWeChatNoAuthStateUI", "get connect state = %d", new Object[] { Integer.valueOf(j) });
    int i = j;
    if (j == 0) {
      i = 63522;
    }
    return i;
  }
  
  protected final String aPr()
  {
    return getString(R.l.free_wifi_title);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/FreewifiWeChatNoAuthStateUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */