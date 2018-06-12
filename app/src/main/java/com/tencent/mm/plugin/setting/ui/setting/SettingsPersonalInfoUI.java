package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.p.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.a.k;
import com.tencent.mm.plugin.setting.b;
import com.tencent.mm.plugin.setting.ui.widget.HeadImgNewPreference;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.s;
import java.io.File;

public class SettingsPersonalInfoUI
  extends MMPreference
  implements com.tencent.mm.ab.e, m.b
{
  private boolean eFl;
  private com.tencent.mm.ui.base.preference.f eOE;
  private com.tencent.mm.plugin.setting.model.g mTg;
  
  private void aut()
  {
    HeadImgNewPreference localHeadImgNewPreference = (HeadImgNewPreference)this.eOE.ZZ("settings_change_avatar");
    String str = com.tencent.mm.model.q.GF();
    localHeadImgNewPreference.mVR = null;
    if (localHeadImgNewPreference.gwj != null)
    {
      a.b.a(localHeadImgNewPreference.gwj, str);
      if (str != null) {
        break label69;
      }
    }
    label69:
    for (localHeadImgNewPreference.mVT = false;; localHeadImgNewPreference.mVT = true)
    {
      localHeadImgNewPreference.mVS = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          paramAnonymousView = new Intent(SettingsPersonalInfoUI.this, PreviewHdHeadImg.class);
          SettingsPersonalInfoUI.this.mController.tml.startActivity(paramAnonymousView);
        }
      };
      return;
      localHeadImgNewPreference.mVR = str;
      break;
    }
  }
  
  private void btC()
  {
    Preference localPreference = this.eOE.ZZ("settings_username");
    String str1 = com.tencent.mm.model.q.GG();
    String str2 = com.tencent.mm.model.q.GF();
    if (bi.oW(str1))
    {
      if (ab.XT(str2))
      {
        localPreference.setSummary(getString(a.i.settings_notset));
        return;
      }
      localPreference.setSummary(str2);
      return;
    }
    localPreference.setSummary(str1);
  }
  
  public final int Ys()
  {
    return a.k.settings_pref_personal_info_new;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    if (!bi.d(Boolean.valueOf(com.tencent.mm.kernel.g.Ei().DT().getBoolean(aa.a.sWn, false))))
    {
      this.eOE.bw("settings_invoice", true);
      return;
    }
    this.eOE.bw("settings_invoice", false);
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    int i = bi.p(paramObject, 0);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SettingsPersonalInfoUI", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramm });
    if ((paramm != com.tencent.mm.kernel.g.Ei().DT()) || (i <= 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SettingsPersonalInfoUI", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramm });
      return;
    }
    btC();
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    boolean bool2 = true;
    paramf = paramPreference.mKey;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SettingsPersonalInfoUI", "key = " + paramf);
    boolean bool1;
    if (paramf.equals("settings_change_avatar")) {
      bool1 = com.tencent.mm.plugin.account.a.a.ezo.f(this);
    }
    do
    {
      do
      {
        return bool1;
        if (!paramf.equals("settings_username")) {
          break;
        }
        bool1 = bool2;
      } while (!bi.oW(com.tencent.mm.model.q.GG()));
      bool1 = bool2;
    } while (!ab.XU(com.tencent.mm.model.q.GF()));
    L(SettingsAliasUI.class);
    return true;
    if (paramf.equals("settings_name"))
    {
      paramf = new Intent();
      paramf.setClass(this, SettingsModifyNameUI.class);
      startActivity(paramf);
      return true;
    }
    if (paramf.equals("settings_qrcode"))
    {
      h.mEJ.h(11264, new Object[] { Integer.valueOf(2) });
      this.mController.tml.startActivity(new Intent(this, SelfQRCodeUI.class));
    }
    do
    {
      for (;;)
      {
        return false;
        if (!paramf.equals("settings_more_info")) {
          break;
        }
        startActivity(new Intent(this, SettingsPersonalMoreUI.class));
      }
      if (paramf.equals("settings_address"))
      {
        paramf = new Intent();
        paramf.putExtra("launch_from_webview", false);
        d.c(this.mController.tml, "address", ".ui.WalletSelectAddrUI", paramf);
        return true;
      }
    } while (!paramf.equals("settings_invoice"));
    h.mEJ.h(14199, new Object[] { Integer.valueOf(1) });
    paramf = new Intent();
    paramf.putExtra("launch_from_webview", false);
    d.c(this.mController.tml, "address", ".ui.InvoiceListUI", paramf);
    return true;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.settings_personal_info);
    com.tencent.mm.kernel.g.Ei().DT().a(this);
    this.eOE = this.tCL;
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        SettingsPersonalInfoUI.this.YC();
        SettingsPersonalInfoUI.this.finish();
        return true;
      }
    });
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsPersonalInfoUI", "onAcvityResult requestCode:%d, resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt2 != -1) {
      if ((paramInt1 == 3) || (paramInt1 == 2) || (paramInt1 == 4)) {
        new ag(Looper.getMainLooper()).post(new SettingsPersonalInfoUI.3(this));
      }
    }
    do
    {
      do
      {
        do
        {
          return;
          switch (paramInt1)
          {
          default: 
            return;
          }
        } while (paramIntent == null);
        localIntent = new Intent();
        localIntent.putExtra("CropImageMode", 1);
        localIntent.putExtra("CropImage_Filter", true);
        localIntent.putExtra("CropImage_OutputPath", com.tencent.mm.aa.q.Kp().c(com.tencent.mm.model.q.GF() + ".crop", true, false));
        localIntent.putExtra("CropImage_ImgPath", null);
        b.ezn.a(this, paramIntent, localIntent, c.Gb(), 4, null);
        return;
        paramIntent = com.tencent.mm.pluginsdk.ui.tools.l.d(getApplicationContext(), paramIntent, c.Gb());
      } while (paramIntent == null);
      Intent localIntent = new Intent();
      localIntent.putExtra("CropImageMode", 1);
      localIntent.putExtra("CropImage_OutputPath", paramIntent);
      localIntent.putExtra("CropImage_ImgPath", paramIntent);
      b.ezn.a(this, localIntent, 4);
      return;
      new ag(Looper.getMainLooper()).post(new SettingsPersonalInfoUI.4(this));
    } while (paramIntent == null);
    paramIntent = paramIntent.getStringExtra("CropImage_OutputPath");
    if (paramIntent == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SettingsPersonalInfoUI", "crop picture failed");
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsPersonalInfoUI", "onActivityResult(CONTEXT_MENU_CROP_PICTURE)  file:%s, size:%d", new Object[] { paramIntent, Long.valueOf(new File(paramIntent).length()) });
    new com.tencent.mm.aa.o(this.mController.tml, paramIntent).b(1, new SettingsPersonalInfoUI.5(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
    if (getIntent().getBooleanExtra("intent_set_avatar", false))
    {
      this.eFl = getIntent().getBooleanExtra("KEnterFromBanner", false);
      com.tencent.mm.plugin.account.a.a.ezo.f(this);
    }
    com.tencent.mm.kernel.g.DF().a(1191, this);
  }
  
  public void onDestroy()
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SettingsPersonalInfoUI", "SettingsPersonalInfoUI.onDestroy()");
    if (com.tencent.mm.kernel.g.Eg().Dx()) {
      com.tencent.mm.kernel.g.Ei().DT().b(this);
    }
    if (this.mTg != null) {
      com.tencent.mm.kernel.g.DF().c(this.mTg);
    }
    com.tencent.mm.kernel.g.DF().b(1191, this);
    super.onDestroy();
  }
  
  public void onResume()
  {
    btC();
    aut();
    String str = (String)com.tencent.mm.kernel.g.Ei().DT().get(4, null);
    if ((str != null) && (str.length() > 0)) {
      this.eOE.ZZ("settings_name").setSummary(j.a(this, str));
    }
    boolean bool = bi.fU(this);
    this.eOE.bw("settings_address", bool);
    if (!bi.d(Boolean.valueOf(com.tencent.mm.kernel.g.Ei().DT().getBoolean(aa.a.sWn, false))))
    {
      this.eOE.bw("settings_invoice", true);
      this.mTg = new com.tencent.mm.plugin.setting.model.g();
      com.tencent.mm.kernel.g.DF().a(this.mTg, 0);
    }
    for (;;)
    {
      super.onResume();
      return;
      this.eOE.bw("settings_invoice", false);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */