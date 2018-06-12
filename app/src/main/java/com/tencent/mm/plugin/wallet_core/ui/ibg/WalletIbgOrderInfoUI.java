package com.tencent.mm.plugin.wallet_core.ui.ibg;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wallet_core.c.a.c;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@a(3)
public class WalletIbgOrderInfoUI
  extends WalletBaseUI
{
  public static Orders pfb;
  private String mAppId = null;
  private String mTimeStamp = null;
  private String pdI = null;
  private String pze = null;
  private String pzf = null;
  private String pzg = null;
  private String pzh = null;
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.WalletIbgOrderInfoUI", "onSceneEnd, errType: %s, errCode: %s, errMsg: %s, scene: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paraml });
    if ((paraml instanceof c))
    {
      js(1565);
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paraml = (c)paraml;
        pfb = paraml.pjG;
        paramString = pfb;
        paramInt1 = paraml.pjR;
        x.i("MicroMsg.WalletIbgOrderInfoUI", "gotoIbgOrderInfoUI, useNewPage: %s, orders: %s", new Object[] { Integer.valueOf(paramInt1), paramString });
        if (paramInt1 == 1)
        {
          paraml = new Intent(this, WalletIbgOrderInfoNewUI.class);
          paraml.putExtra("key_orders", paramString);
          startActivity(paraml);
        }
        for (;;)
        {
          setResult(-1);
          finish();
          return true;
          paraml = new Intent(this, WalletIbgOrderInfoOldUI.class);
          paraml.putExtra("key_orders", paramString);
          startActivity(paraml);
        }
      }
      setResult(0);
      finish();
    }
    setResult(0);
    finish();
    return false;
  }
  
  protected final int getLayoutId()
  {
    return a.g.transparent_layout;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    jr(1565);
    this.mAppId = getIntent().getStringExtra("appId");
    this.pze = getIntent().getStringExtra("nonceStr");
    this.mTimeStamp = getIntent().getStringExtra("timeStamp");
    this.pdI = getIntent().getStringExtra("packageExt");
    this.pzf = getIntent().getStringExtra("paySignature");
    this.pzg = getIntent().getStringExtra("signtype");
    this.pzh = getIntent().getStringExtra("url");
    a(new c(this.mAppId, this.pze, this.mTimeStamp, this.pdI, this.pzf, this.pzg, this.pzh), true, false);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    js(1565);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/ibg/WalletIbgOrderInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */