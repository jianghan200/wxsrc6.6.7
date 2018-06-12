package com.tencent.mm.plugin.freewifi.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class FreeWifiOwnerUI
  extends Activity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
  
  protected void onResume()
  {
    super.onResume();
    String str = getIntent().getStringExtra("wifi_owner_name");
    int i = getIntent().getIntExtra("wifi_owner_type", 0);
    com.tencent.mm.plugin.freewifi.j.userName = str;
    com.tencent.mm.plugin.freewifi.j.type = i;
    finish();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/FreeWifiOwnerUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */