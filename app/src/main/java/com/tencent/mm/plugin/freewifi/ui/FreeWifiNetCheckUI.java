package com.tencent.mm.plugin.freewifi.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ImageView;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.freewifi.d.a;
import com.tencent.mm.plugin.freewifi.d.c;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.plugin.freewifi.model.h.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;

public class FreeWifiNetCheckUI
  extends MMActivity
{
  private String aAL;
  private al bAZ;
  private int bVU;
  private Intent intent;
  private int[] jnB = { R.g.free_wifi_loading_1, R.g.free_wifi_loading_2, R.g.free_wifi_loading_3, R.g.free_wifi_loading_4, R.g.free_wifi_loading_5 };
  ag jnC = new FreeWifiNetCheckUI.1(this);
  private b jnJ;
  ImageView jnv;
  private final int jny = 1;
  private final int jnz = 2;
  private int scene;
  
  private void aPI()
  {
    if (bi.oW(this.aAL))
    {
      x.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "get key failed");
      finish();
      return;
    }
    this.jnJ = new b(this, this.aAL, this.bVU);
    x.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=FreeWifiNetCheckUI.connectFreewifi, desc=base params are ready and it will connets wifi.apKey=%s, channel=%d", new Object[] { m.E(getIntent()), Integer.valueOf(m.F(this.intent)), this.aAL, Integer.valueOf(this.bVU) });
    b localb = this.jnJ;
    if (bi.oW(localb.bIQ))
    {
      x.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "get key failed");
      localb.activity.finish();
    }
    localb.activity.getIntent().putExtra("free_wifi_url", localb.bIQ);
    localb.activity.getIntent().putExtra("free_wifi_ap_key", localb.bIQ);
    if (bi.oW(localb.bIQ))
    {
      x.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "ap key is null");
      localb.activity.finish();
      return;
    }
    x.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=FreeWifiConnector.getApInfo, desc=it starts net request [getApInfo] for retrieving protocol type and frontpage info. apKey=%s, channel=%d", new Object[] { m.E(localb.intent), Integer.valueOf(m.F(localb.intent)), localb.bIQ, Integer.valueOf(localb.bVU) });
    k.a locala = k.aOa();
    locala.bIQ = localb.bIQ;
    locala.jid = m.E(localb.intent);
    locala.jif = k.b.jin.jiQ;
    locala.jig = k.b.jin.name;
    locala.bVU = localb.bVU;
    locala.jie = m.G(localb.intent);
    locala.aOc().b(localb.intent, false).aOb();
    new a(localb.bIQ, localb.bVU, m.E(localb.intent)).s(localb.activity).b(new b.1(localb));
  }
  
  public void finish()
  {
    if (this.bAZ != null) {
      this.bAZ.SO();
    }
    this.jnC.sendEmptyMessage(2);
    super.finish();
  }
  
  protected final int getLayoutId()
  {
    return R.i.free_wifi_net_check;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(R.l.free_wifi_title);
    setBackBtn(new FreeWifiNetCheckUI.2(this));
    this.intent = getIntent();
    m.D(this.intent);
    this.aAL = getIntent().getStringExtra("free_wifi_ap_key");
    this.scene = getIntent().getIntExtra("free_wifi_source", 1);
    x.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=FreeWifiNetCheckUI.onCreate, desc=it goes into black loading ui and starts to connect. get qrcode key = %s, current connected ssid = %s", new Object[] { m.E(this.intent), Integer.valueOf(m.F(this.intent)), this.aAL, d.aOz() });
    this.jnv = ((ImageView)findViewById(R.h.free_wifi_app_logo_iv));
    this.bAZ = new al(new FreeWifiNetCheckUI.3(this), true);
    this.bAZ.J(200L, 200L);
    switch (this.scene)
    {
    case 2: 
    case 3: 
    default: 
      x.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "unkown scene, just finish");
      finish();
    }
    for (;;)
    {
      x.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=FreeWifiNetCheckUI.handleRequstByScene, desc=it decides the channel. channel=%d", new Object[] { m.E(getIntent()), Integer.valueOf(m.F(this.intent)), Integer.valueOf(this.bVU) });
      return;
      paramBundle = getIntent().getStringExtra("free_wifi_jsapi_param_type");
      if ("1".equals(paramBundle))
      {
        getIntent().putExtra("free_wifi_channel_id", 9);
        this.bVU = 9;
      }
      for (;;)
      {
        paramBundle = getIntent().getStringExtra("free_wifi_jsapi_param_type");
        if ((!paramBundle.equals("0")) || (!bi.oW(this.aAL))) {
          break label400;
        }
        x.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "get key fail");
        finish();
        break;
        if ("0".equals(paramBundle))
        {
          getIntent().putExtra("free_wifi_channel_id", 8);
          this.bVU = 8;
        }
        else
        {
          getIntent().putExtra("free_wifi_channel_id", 4);
          this.bVU = 4;
        }
      }
      label400:
      if (paramBundle.equals("0"))
      {
        aPI();
      }
      else if (paramBundle.equals("1"))
      {
        paramBundle = getIntent().getStringExtra("free_wifi_jsapi_param_username");
        if (!d.isWifiEnabled()) {
          d.aOw();
        }
        h.b.aOH().a(new FreeWifiNetCheckUI.5(this, paramBundle));
      }
      else
      {
        x.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "undefined jsapi type");
        finish();
        continue;
        this.bVU = getIntent().getIntExtra("free_wifi_channel_id", 1);
        if (bi.oW(this.aAL))
        {
          x.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "get key failed");
          finish();
        }
        else
        {
          aPI();
          continue;
          getIntent().putExtra("free_wifi_channel_id", 2);
          this.bVU = 2;
          if (bi.oW(this.aAL))
          {
            x.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "get key failed");
            finish();
          }
          else
          {
            paramBundle = null;
            Object localObject2 = "";
            try
            {
              localObject1 = Uri.parse(this.aAL);
              paramBundle = (Bundle)localObject1;
              localObject3 = ((Uri)localObject1).getQueryParameter("q");
              localObject2 = localObject3;
              paramBundle = (Bundle)localObject1;
            }
            catch (Exception localException)
            {
              for (;;)
              {
                Object localObject1;
                Object localObject3;
                finish();
              }
              "_test".equals(localObject2);
              aPI();
            }
            if ("pc".equalsIgnoreCase((String)localObject2))
            {
              localObject1 = paramBundle.getQueryParameter("appid");
              localObject2 = paramBundle.getQueryParameter("shopid");
              paramBundle = paramBundle.getQueryParameter("ticket");
              m.d(getIntent(), paramBundle);
              localObject3 = k.aOa();
              ((k.a)localObject3).jib = ((String)localObject2);
              ((k.a)localObject3).jic = ((String)localObject1);
              ((k.a)localObject3).jid = paramBundle;
              ((k.a)localObject3).jif = k.b.jiK.jiQ;
              ((k.a)localObject3).jig = k.b.jiK.name;
              ((k.a)localObject3).aOc().aOb();
              x.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=handlePcRequest, desc=It starts NetSceneGetPcFrontPage.shopid=%s, appid=%s, ticket=%s", new Object[] { m.E(getIntent()), Integer.valueOf(m.F(getIntent())), localObject2, localObject1, paramBundle });
              new com.tencent.mm.plugin.freewifi.d.h((String)localObject1, Integer.valueOf((String)localObject2).intValue(), paramBundle).b(new FreeWifiNetCheckUI.4(this, (String)localObject2, paramBundle, (String)localObject1));
            }
            else
            {
              continue;
              getIntent().putExtra("free_wifi_channel_id", 10);
              this.bVU = 10;
              if (bi.oW(this.aAL))
              {
                x.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "get key failed");
                finish();
              }
              else
              {
                aPI();
              }
            }
          }
        }
      }
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.jnJ != null) {
      this.jnJ = null;
    }
    this.bAZ.SO();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      finish();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */