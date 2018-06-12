package com.tencent.mm.plugin.freewifi.ui;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.model.c;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import java.util.List;

public class FreeWifiManufacturerLoadingUI
  extends MMActivity
{
  private al bAZ;
  private String bssid;
  private final int jnA = 3;
  private int[] jnB = { R.g.free_wifi_loading_1, R.g.free_wifi_loading_2, R.g.free_wifi_loading_3, R.g.free_wifi_loading_4, R.g.free_wifi_loading_5 };
  ag jnC = new FreeWifiManufacturerLoadingUI.1(this);
  ag jnD = new ag();
  private ImageView jnv;
  private TextView jnw;
  private Button jnx;
  private final int jny = 1;
  private final int jnz = 2;
  private String ssid;
  
  private void Cj(String paramString)
  {
    Message localMessage = Message.obtain();
    localMessage.what = 3;
    localMessage.obj = paramString;
    this.jnC.sendMessage(localMessage);
  }
  
  private void aPE()
  {
    if (this.bAZ != null) {
      this.bAZ.SO();
    }
    this.jnC.sendEmptyMessage(2);
  }
  
  private void ak(int paramInt, String paramString)
  {
    x.i("MicroMsg.FreeWifi.FreeWifiManufacturerLoadingUI", "errcode=%d, errmsg=%s", new Object[] { Integer.valueOf(paramInt), paramString });
    if (paramInt != 0)
    {
      aPE();
      if (paramInt == 1154) {
        Cj(getString(R.l.free_wifi_manufacturer_loading_getting_portal_url_unsupported) + "(031" + k.b.jiO.jiQ + "-" + Math.abs(paramInt) + ")");
      }
    }
    else
    {
      return;
    }
    Cj(getString(R.l.free_wifi_manufacturer_loading_getting_portal_url_fail) + "(031" + k.b.jiO.jiQ + "-" + Math.abs(paramInt) + ")");
    this.jnD.postDelayed(new FreeWifiManufacturerLoadingUI.6(this), 0L);
  }
  
  private static String bQ(Context paramContext)
  {
    try
    {
      paramContext = ((ActivityManager.RunningTaskInfo)((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(1).get(0)).topActivity.getClassName();
      x.i("MicroMsg.FreeWifi.FreeWifiManufacturerLoadingUI", "top activity name =" + paramContext);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      x.printErrStackTrace("MicroMsg.FreeWifi.FreeWifiManufacturerLoadingUI", paramContext, "", new Object[0]);
    }
    return "(null)";
  }
  
  public final void aPF()
  {
    this.jnC.sendEmptyMessage(1);
    if (this.bAZ != null) {
      this.bAZ.SO();
    }
    this.bAZ = new al(new FreeWifiManufacturerLoadingUI.4(this), true);
    this.bAZ.J(200L, 200L);
    String str = this.ssid;
    j.aON().aOv().post(new FreeWifiManufacturerLoadingUI.5(this, str));
  }
  
  public void finish()
  {
    aPE();
    super.finish();
  }
  
  protected final int getLayoutId()
  {
    return R.i.free_wifi_manufacturer_loading;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(R.l.free_wifi_title);
    this.ssid = getIntent().getStringExtra("ConstantsFreeWifi.FreeWifiManufacturerConnectWifiHelper_Ssid");
    this.bssid = getIntent().getStringExtra("ConstantsFreeWifi.FreeWifiManufacturerConnectWifiHelper_Bssid");
    this.jnv = ((ImageView)findViewById(R.h.free_wifi_manufacturer_app_logo_iv));
    this.jnw = ((TextView)findViewById(R.h.free_wifi_manufacturer_hint));
    this.jnx = ((Button)findViewById(R.h.free_wifi_manufacturer_reconnect_btn));
    this.jnx.setOnClickListener(new FreeWifiManufacturerLoadingUI.2(this));
    setBackBtn(new FreeWifiManufacturerLoadingUI.3(this));
    aPF();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/FreeWifiManufacturerLoadingUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */