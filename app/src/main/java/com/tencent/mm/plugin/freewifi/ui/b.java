package com.tencent.mm.plugin.freewifi.ui;

import android.app.Activity;
import android.content.Intent;
import com.tencent.mm.sdk.platformtools.bi;

public final class b
{
  Activity activity;
  String bIQ;
  int bVU;
  Intent intent;
  
  public b(Activity paramActivity, String paramString, int paramInt)
  {
    if ((paramActivity == null) || (bi.oW(paramString))) {
      throw new IllegalArgumentException("acitvity or apKey cannot be null.");
    }
    this.activity = paramActivity;
    this.intent = paramActivity.getIntent();
    this.bIQ = paramString;
    this.bVU = paramInt;
  }
  
  final void Ci(String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("free_wifi_error_ui_error_msg", paramString);
    localIntent.setClass(this.activity, FreeWifiErrorUI.class);
    this.activity.finish();
    this.activity.startActivity(localIntent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */