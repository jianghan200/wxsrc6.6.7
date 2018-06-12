package com.tencent.mm.plugin.offline.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.mm.ab.l;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.a.gg;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wallet_core.model.i;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;

@com.tencent.mm.ui.base.a(7)
public class WalletOfflineEntranceUI
  extends WalletBaseUI
{
  private int eLd = -1;
  private int fdx;
  boolean lMC = true;
  private boolean lMD = false;
  private c<gg> lME = new WalletOfflineEntranceUI.1(this);
  
  private void blx()
  {
    x.v("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI onCreate()");
    i.zk(1);
    e.He(30);
    int i;
    String str1;
    String str2;
    String str3;
    String str4;
    String str5;
    String str6;
    if (getIntent() != null)
    {
      i = getIntent().getIntExtra("key_from_scene", 0);
      x.i("MicroMsg.WalletOfflineEntranceUI", "parserCardData(), scene is " + i);
      if (i == 3)
      {
        com.tencent.mm.plugin.offline.c.a.lMM = i;
        i = getIntent().getIntExtra("key_expire_time", 0);
        long l = getIntent().getLongExtra("key_begin_time", 0L);
        boolean bool = getIntent().getBooleanExtra("key_is_mark", false);
        x.i("MicroMsg.WalletOfflineEntranceUI", "expire_time:" + i + " beginTime:" + l + " isMark:" + bool);
        com.tencent.mm.plugin.offline.c.a.lMN = i;
        com.tencent.mm.plugin.offline.c.a.lMO = l;
        com.tencent.mm.plugin.offline.c.a.lMP = bool;
        com.tencent.mm.plugin.offline.c.a.htC = getIntent().getStringExtra("key_card_id");
        com.tencent.mm.plugin.offline.c.a.lMQ = getIntent().getStringExtra("key_user_card_id");
        com.tencent.mm.plugin.offline.c.a.lMR = getIntent().getStringExtra("key_card_code");
      }
    }
    else
    {
      this.fdx = getIntent().getIntExtra("key_from_scene", 0);
      if ((getIntent().getBooleanExtra("is_offline_create", false)) || ((this.fdx != 6) && (this.fdx != 7))) {
        break label475;
      }
      x.i("MicroMsg.WalletOfflineEntranceUI", "from h5 or wxapp check sign: %s", new Object[] { Integer.valueOf(this.fdx) });
      localObject = getIntent();
      str1 = ((Intent)localObject).getStringExtra("appId");
      str2 = ((Intent)localObject).getStringExtra("timeStamp");
      str3 = ((Intent)localObject).getStringExtra("nonceStr");
      str4 = ((Intent)localObject).getStringExtra("packageExt");
      str5 = ((Intent)localObject).getStringExtra("signtype");
      str6 = ((Intent)localObject).getStringExtra("paySignature");
      i = ((Intent)localObject).getIntExtra("pay_channel", 0);
      if (this.fdx != 6) {
        break label434;
      }
    }
    label434:
    for (Object localObject = new com.tencent.mm.plugin.wallet_core.c.a(str1, str2, str3, str4, str5, str6, ((Intent)localObject).getStringExtra("url"), 16, "openOfflinePayView", i);; localObject = new com.tencent.mm.plugin.wallet_core.c.a(str1, str2, str3, str4, str5, str6, ((Intent)localObject).getStringExtra("wxapp_username"), ((Intent)localObject).getStringExtra("wxapp_path"), "openOfflinePayView", i))
    {
      jr(580);
      a((l)localObject, true, false);
      this.lMC = false;
      return;
      if ((i != 1) && (i != 2) && (i != 4)) {
        break;
      }
      com.tencent.mm.plugin.offline.c.a.lMM = i;
      com.tencent.mm.plugin.offline.c.a.lMN = 0;
      com.tencent.mm.plugin.offline.c.a.lMO = 0L;
      com.tencent.mm.plugin.offline.c.a.lMP = false;
      com.tencent.mm.plugin.offline.c.a.htC = "";
      com.tencent.mm.plugin.offline.c.a.lMQ = "";
      com.tencent.mm.plugin.offline.c.a.lMR = "";
      break;
    }
    label475:
    init();
    this.lMC = false;
  }
  
  private void init()
  {
    int i = 3;
    Intent localIntent = getIntent();
    int j;
    if ((localIntent != null) && (localIntent.hasExtra("key_from_scene")))
    {
      j = localIntent.getIntExtra("key_from_scene", 0);
      if (j != 1) {
        break label105;
      }
      this.eLd = 1;
      i = 2;
    }
    for (;;)
    {
      h.mEJ.h(14021, new Object[] { Integer.valueOf(1), Integer.valueOf(i) });
      if (!o.bOW().bPr()) {
        break;
      }
      x.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI isDataInvalid()");
      a(new y(null, 8), true, false);
      this.lMC = false;
      return;
      label105:
      if (j == 2)
      {
        this.eLd = 2;
        i = 1;
      }
      else if (j == 3)
      {
        this.eLd = 3;
      }
      else if (j == 4)
      {
        this.eLd = 4;
        i = 6;
      }
      else if (j == 5)
      {
        this.eLd = 8;
        i = 4;
      }
      else if (j == 6)
      {
        this.eLd = 10;
        i = 7;
      }
      else if (j == 7)
      {
        this.eLd = 11;
        i = 8;
      }
      else if (j == 8)
      {
        this.eLd = 12;
        i = 9;
      }
      else
      {
        this.eLd = 0;
        x.i("MicroMsg.WalletOfflineEntranceUI", "unknown scene: %d", new Object[] { Integer.valueOf(j) });
        i = 1;
      }
    }
    localIntent = new Intent();
    localIntent.putExtra("key_entry_scene", this.eLd);
    localIntent.putExtra("key_from_scene", this.fdx);
    String str = getIntent().getStringExtra("key_business_attach");
    if (!bi.oW(str)) {
      localIntent.putExtra("key_business_attach", str);
    }
    localIntent.putExtra("is_offline_create", getIntent().getBooleanExtra("is_offline_create", false));
    localIntent.putExtra("key_appid", getIntent().getStringExtra("key_appid"));
    d.b(this.mController.tml, "offline", ".ui.WalletOfflineCoinPurseUI", localIntent, 1);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof com.tencent.mm.plugin.wallet_core.c.a))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        x.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI onSceneEnd SUCC");
        f.Ul(((com.tencent.mm.plugin.wallet_core.c.a)paraml).bOj());
        init();
        if ((this.fdx == 6) || (this.fdx == 7))
        {
          paramString = new Intent();
          if (!this.lMD) {
            break label91;
          }
          paramString.putExtra("key_callback", "return");
        }
        for (;;)
        {
          setResult(-1, paramString);
          return true;
          label91:
          paramString.putExtra("key_callback", "ok");
        }
      }
      x.i("MicroMsg.WalletOfflineEntranceUI", "net error: %d, %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if ((this.fdx == 6) || (this.fdx == 7))
      {
        paramString = new Intent();
        paramString.putExtra("key_callback", "fail");
        setResult(0, paramString);
      }
      finish();
      return true;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      x.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI onSceneEnd SUCC");
      init();
      return true;
    }
    x.i("MicroMsg.WalletOfflineEntranceUI", "net error: %d, %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    init();
    x.e("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI onSceneEnd FAIL");
    finish();
    return false;
  }
  
  protected final int getLayoutId()
  {
    return a.g.wallet_offline_entrance_ui;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 1) && (paramInt2 == -1)) {
      x.i("MicroMsg.WalletOfflineEntranceUI", "do not finish");
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
      finish();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.wallet_core.c.a.cCW();
    com.tencent.mm.wallet_core.c.a.init(getApplicationContext());
    this.lME.cht();
    blx();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.lME.dead();
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4) {
      finish();
    }
    return true;
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    x.i("MicroMsg.WalletOfflineEntranceUI", "onNewIntent");
    if ((paramIntent != null) && (paramIntent.hasExtra("is_offline_create")))
    {
      this.lMC = true;
      this.lMD = true;
      setIntent(paramIntent);
      blx();
      return;
    }
    this.lMC = false;
    this.lMD = true;
    setIntent(paramIntent);
    blx();
  }
  
  public void onResume()
  {
    super.onResume();
    x.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI onResume()");
    if (this.lMC)
    {
      x.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI isShouldFinishOnResume is true , finish activity");
      if (com.tencent.mm.plugin.offline.c.a.bly())
      {
        x.v("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI isOfflineCreate() true");
        Intent localIntent = new Intent();
        localIntent.putExtra("key_entry_scene", this.eLd);
        localIntent.putExtra("key_from_scene", 0);
        return;
      }
      x.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI isOfflineCreate() false");
      return;
    }
    x.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI isShouldFinishOnResume is false , not finish activity");
    this.lMC = true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/offline/ui/WalletOfflineEntranceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */