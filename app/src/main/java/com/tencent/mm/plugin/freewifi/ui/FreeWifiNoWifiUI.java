package com.tencent.mm.plugin.freewifi.ui;

import android.os.Bundle;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.MMActivity;

public class FreeWifiNoWifiUI
  extends MMActivity
{
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return R.i.free_wifi_no_wifi;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setBackBtn(new FreeWifiNoWifiUI.1(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/FreeWifiNoWifiUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */