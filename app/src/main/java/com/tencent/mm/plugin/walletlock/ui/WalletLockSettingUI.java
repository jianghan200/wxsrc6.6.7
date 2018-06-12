package com.tencent.mm.plugin.walletlock.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Toast;
import com.tencent.mm.plugin.walletlock.a.f;
import com.tencent.mm.plugin.walletlock.a.g;
import com.tencent.mm.plugin.walletlock.a.i;
import com.tencent.mm.plugin.walletlock.a.b;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.widget.a.c;

public class WalletLockSettingUI
  extends MMPreference
{
  private f eOE;
  private c evj;
  private int fdx = -1;
  private IconPreference pID;
  private IconPreference pIE;
  private IconPreference pIF;
  private boolean pIG = false;
  private boolean pIH = true;
  private boolean pII = true;
  
  private void a(Preference paramPreference, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramPreference instanceof IconPreference))
    {
      paramPreference = (IconPreference)paramPreference;
      paramPreference.eW(com.tencent.mm.bp.a.fromDPToPix(this, 20), com.tencent.mm.bp.a.fromDPToPix(this, 20));
      if (!paramBoolean1) {
        break label59;
      }
      if (!paramBoolean2) {
        break label49;
      }
      paramPreference.Eu(a.f.radio_on);
    }
    for (;;)
    {
      paramPreference.Ev(0);
      return;
      label49:
      paramPreference.Eu(a.f.radio_default_on);
    }
    label59:
    paramPreference.Eu(a.f.radio_off);
    paramPreference.Ev(0);
  }
  
  private void bSj()
  {
    bSk();
    x.i("MicroMsg.WalletLockSettingUI", "alvinluo current wallet lock type: %d", new Object[] { Integer.valueOf(com.tencent.mm.plugin.walletlock.b.g.pIt.bRY()) });
    com.tencent.mm.plugin.walletlock.b.g localg = com.tencent.mm.plugin.walletlock.b.g.pIt;
    if (!com.tencent.mm.plugin.walletlock.b.g.bSb())
    {
      x.w("MicroMsg.WalletLockSettingUI", "alvinluo FingerprintLock entry is not opened and don't show FingerprintLock entry");
      this.eOE.bw("wallet_lock_fingerprint", true);
      localg = com.tencent.mm.plugin.walletlock.b.g.pIt;
      x.i("MicroMsg.WalletLockSettingUI", "alvinluo isUserSetGesturePwd: %b", new Object[] { Boolean.valueOf(com.tencent.mm.plugin.walletlock.b.g.bRE()) });
      if ((com.tencent.mm.plugin.walletlock.b.g.pIt.bRY() == 2) || (com.tencent.mm.plugin.walletlock.b.g.pIt.bRY() != 1)) {
        break label317;
      }
      if (this.pIH)
      {
        a(this.pIE, true, true);
        this.eOE.bw("wallet_lock_modify_gesture", false);
      }
    }
    for (;;)
    {
      if (com.tencent.mm.plugin.walletlock.b.g.pIt.bRY() != 0) {
        break label342;
      }
      if (this.pIH) {
        a(this.pIF, true, true);
      }
      return;
      boolean bool = com.tencent.mm.plugin.soter.c.h.bFl();
      localg = com.tencent.mm.plugin.walletlock.b.g.pIt;
      if (com.tencent.mm.plugin.walletlock.b.g.bRt())
      {
        if (!bool)
        {
          this.eOE.bw("wallet_lock_fingerprint", false);
          this.pID.setDesc(getString(a.g.wallet_lock_device_not_support_fingerprint));
          this.pID.csj();
          a(this.pID, true, false);
          this.pID.setEnabled(false);
          this.pID.tCp = true;
          this.pII = false;
          break;
        }
        if (!this.pIH) {
          break;
        }
        this.eOE.bw("wallet_lock_fingerprint", false);
        a(this.pID, true, true);
        break;
      }
      if (!bool)
      {
        this.eOE.bw("wallet_lock_fingerprint", true);
        break;
      }
      this.eOE.bw("wallet_lock_fingerprint", false);
      a(this.pID, false, true);
      break;
      label317:
      a(this.pIE, false, true);
      this.eOE.bw("wallet_lock_modify_gesture", true);
    }
    label342:
    a(this.pIF, false, true);
  }
  
  private void bSk()
  {
    if ((this.pID != null) && (this.pII)) {
      a(this.pID, false, this.pII);
    }
    if (this.pIE != null) {
      a(this.pIE, false, true);
    }
    if (this.pIF != null) {
      a(this.pIF, false, true);
    }
  }
  
  private void g(int paramInt, Intent paramIntent)
  {
    setResult(paramInt, paramIntent);
    finish();
  }
  
  private void p(int paramInt1, int paramInt2, String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("key_err_code", paramInt2);
    localIntent.putExtra("key_err_msg", paramString);
    g(paramInt1, localIntent);
  }
  
  private void zK(String paramString)
  {
    this.evj = com.tencent.mm.ui.base.h.a(this, paramString, "", new WalletLockSettingUI.3(this));
    this.evj.setCanceledOnTouchOutside(false);
    this.evj.show();
  }
  
  public final int Ys()
  {
    return a.i.wallet_lock_setting_pref;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool = false;
    if ("wallet_lock_fingerprint".equals(paramPreference.mKey))
    {
      bSk();
      a(paramPreference, true, true);
      if ((this.pII) && ((!this.pIH) || (com.tencent.mm.plugin.walletlock.b.g.pIt.bRY() != 2)))
      {
        if (!com.tencent.d.a.a.hz(this))
        {
          this.evj = com.tencent.mm.ui.base.h.a(this, getString(a.g.wallet_lock_no_fingerprint_tips), "", new WalletLockSettingUI.2(this));
          this.evj.setCanceledOnTouchOutside(false);
        }
      }
      else {
        bool = true;
      }
    }
    do
    {
      return bool;
      if ((this.pIH) && (com.tencent.mm.plugin.walletlock.b.g.pIt.bRY() == 2)) {
        break;
      }
      x.i("MicroMsg.WalletLockSettingUI", "alvinluo request open fingerprint lock");
      ((b)com.tencent.mm.kernel.g.l(b.class)).b(this, 2, 1);
      break;
      if ("wallet_lock_gesture".equals(paramPreference.mKey))
      {
        bSk();
        a(paramPreference, true, true);
        if (com.tencent.mm.plugin.walletlock.b.g.pIt.bRY() != 1)
        {
          x.i("MicroMsg.WalletLockSettingUI", "alvinluo request open gesture lock");
          ((b)com.tencent.mm.kernel.g.l(b.class)).b(this, 1, 2);
        }
        return true;
      }
      if ("wallet_lock_close".equals(paramPreference.mKey))
      {
        bSk();
        a(paramPreference, true, true);
        if (com.tencent.mm.plugin.walletlock.b.g.pIt.bRY() != 0)
        {
          x.i("MicroMsg.WalletLockSettingUI", "alvinluo request close wallet lock");
          ((b)com.tencent.mm.kernel.g.l(b.class)).i(this, 3);
        }
        return true;
      }
    } while (!"wallet_lock_modify_gesture".equals(paramPreference.mKey));
    ((b)com.tencent.mm.kernel.g.l(b.class)).K(this);
    return true;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    x.i("MicroMsg.WalletLockSettingUI", "alvinluo onActivityResult requestCode: %d, resultCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramIntent == null) {
      x.e("MicroMsg.WalletLockSettingUI", "alvinluo data is null");
    }
    int i;
    label126:
    label184:
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  return;
                  i = paramIntent.getIntExtra("key_err_code", -1);
                  x.i("MicroMsg.WalletLockSettingUI", "alvinluo wallet lock setting onActivityResult errCode: %d", new Object[] { Integer.valueOf(i) });
                  if (paramInt1 != 1) {
                    break label126;
                  }
                  x.i("MicroMsg.WalletLockSettingUI", "alvinluo request open fingerprint lock onActivityResult");
                  if (i != 0) {
                    break;
                  }
                } while (!this.pIG);
                g(paramInt2, paramIntent);
                return;
              } while (i == 4);
              x.i("MicroMsg.WalletLockSettingUI", "alvinluo open fingerprint lock failed");
              zK(getString(a.g.wallet_lock_fingerprint_open_failed));
              return;
              if (paramInt1 != 2) {
                break label184;
              }
              x.i("MicroMsg.WalletLockSettingUI", "alvinluo request open gesture onActivityResult");
              if (i != 0) {
                break;
              }
            } while (!this.pIG);
            g(paramInt2, paramIntent);
            return;
          } while (i == 4);
          x.i("MicroMsg.WalletLockSettingUI", "alvinluo open gesture lock failed");
          zK(getString(a.g.wallet_lock_gesture_open_failed));
          return;
        } while (paramInt1 != 3);
        if (i != 0) {
          break;
        }
        ((b)com.tencent.mm.kernel.g.l(b.class)).zw(0);
        paramIntent = com.tencent.mm.plugin.walletlock.b.g.pIt;
        com.tencent.mm.plugin.walletlock.b.g.bRv();
        bSj();
        Toast.makeText(this, getString(a.g.wallet_lock_close_all_success), 0).show();
        com.tencent.mm.plugin.walletlock.b.h.bSd();
      } while (!this.pIG);
      p(-1, 0, "close wallet lock ok");
      return;
    } while (i == 4);
    zK(getString(a.g.wallet_lock_close_error));
  }
  
  public void onBackPressed()
  {
    x.i("MicroMsg.WalletLockSettingUI", "alvinluo onBackPressed");
    if (this.pIG)
    {
      p(0, 4, "user cancel setting wallet lock");
      return;
    }
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        if (WalletLockSettingUI.a(WalletLockSettingUI.this)) {
          WalletLockSettingUI.a(WalletLockSettingUI.this, "user cancel setting wallet lock");
        }
        for (;;)
        {
          return false;
          WalletLockSettingUI.this.finish();
        }
      }
    });
    setMMTitle(a.g.wallet_lock_page_title);
    this.eOE = this.tCL;
    this.eOE = this.tCL;
    this.pID = ((IconPreference)this.eOE.ZZ("wallet_lock_fingerprint"));
    this.pIE = ((IconPreference)this.eOE.ZZ("wallet_lock_gesture"));
    this.pIF = ((IconPreference)this.eOE.ZZ("wallet_lock_close"));
    this.fdx = getIntent().getIntExtra("key_wallet_lock_setting_scene", -1);
    if (this.fdx == 1)
    {
      this.pIG = true;
      this.pIH = false;
    }
    x.i("MicroMsg.WalletLockSettingUI", "alvinluo isNeedFinish: %b, isNeedShowOpenIcon: %b", new Object[] { Boolean.valueOf(this.pIG), Boolean.valueOf(this.pIH) });
  }
  
  protected void onPause()
  {
    super.onPause();
    if ((this.evj != null) && (this.evj.isShowing())) {
      this.evj.dismiss();
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    bSj();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/walletlock/ui/WalletLockSettingUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */