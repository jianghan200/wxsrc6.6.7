package com.tencent.mm.plugin.exdevice.ui;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Toast;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.exdevice.f.a.n;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public class ExdeviceSettingUI
  extends MMPreference
  implements e
{
  int bWA = -1;
  private final String iFQ = "notify_rank";
  private final String iFR = "notify_like";
  private final String iFS = "join_rank";
  boolean iFT;
  private ProgressDialog iFU;
  private CheckBoxPreference iFV;
  private CheckBoxPreference iFW;
  private CheckBoxPreference iFX;
  private boolean iFY;
  
  private void aIm()
  {
    boolean bool2 = true;
    CheckBoxPreference localCheckBoxPreference = this.iFV;
    if ((this.bWA & 0x1) == 1)
    {
      bool1 = true;
      localCheckBoxPreference.qpJ = bool1;
      localCheckBoxPreference = this.iFW;
      if ((this.bWA & 0x2) != 2) {
        break label85;
      }
      bool1 = true;
      label41:
      localCheckBoxPreference.qpJ = bool1;
      localCheckBoxPreference = this.iFX;
      if ((this.bWA & 0x8) != 8) {
        break label90;
      }
    }
    label85:
    label90:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      localCheckBoxPreference.qpJ = bool1;
      this.tCL.notifyDataSetChanged();
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label41;
    }
  }
  
  public final int Ys()
  {
    return R.o.exdevice_setting_pref;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ExdeviceSettingUI", "hy: scene end ok");
      paramString = (n)paraml;
      if (paramString.opType != 2) {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExdeviceSettingUI", "It isn't a GET_FLAG opType(%d).", new Object[] { Integer.valueOf(paramString.opType) });
      }
      do
      {
        return;
        if ((this.iFU != null) && (this.iFU.isShowing())) {
          runOnUiThread(new ExdeviceSettingUI.2(this));
        }
        this.iFT = true;
        if (this.bWA == paramString.iyc)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExdeviceSettingUI", "flag has not changed.(%s)", new Object[] { Integer.valueOf(this.bWA) });
          return;
        }
        this.bWA = paramString.iyc;
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ExdeviceSettingUI", "hy: onSceneEnd setting flag to %d", new Object[] { Integer.valueOf(this.bWA) });
        au.HU();
        c.DT().set(397310, Integer.valueOf(this.bWA));
      } while (this.iFY);
      aIm();
      return;
    }
    if ((this.iFU != null) && (this.iFU.isShowing())) {
      runOnUiThread(new ExdeviceSettingUI.3(this));
    }
    Toast.makeText(this, "scene error", 0).show();
    finish();
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ExdeviceSettingUI", "onPreferenceTreeClick, key is %s.", new Object[] { paramPreference.mKey });
    if (paramPreference.mKey.equals("black_contact_list"))
    {
      com.tencent.mm.bg.d.A(this, "sport", ".ui.SportBlackListUI");
      return false;
    }
    this.iFY = true;
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.plugin.sport.b.d.kB(38);
    au.DF().a(1044, this);
    this.iFV = ((CheckBoxPreference)this.tCL.ZZ("notify_rank"));
    this.iFW = ((CheckBoxPreference)this.tCL.ZZ("notify_like"));
    this.iFX = ((CheckBoxPreference)this.tCL.ZZ("join_rank"));
    au.HU();
    paramBundle = (Integer)c.DT().get(397310, Integer.valueOf(0));
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ExdeviceSettingUI", "hy: setting flag: %d", new Object[] { paramBundle });
    if ((paramBundle == null) || (paramBundle.intValue() == 0))
    {
      this.iFT = false;
      this.iFV.qpJ = true;
      this.iFW.qpJ = true;
      this.iFX.qpJ = true;
      this.tCL.notifyDataSetChanged();
      this.iFU = p.show(this, "", "", true, false);
    }
    for (;;)
    {
      au.DF().a(new n(2, 0), 0);
      setMMTitle(R.l.regbyfacebook_reg_setpwd_setnow);
      setBackBtn(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          ExdeviceSettingUI.this.finish();
          return false;
        }
      });
      return;
      this.iFT = true;
      this.bWA = paramBundle.intValue();
      aIm();
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    au.DF().b(1044, this);
    if ((this.iFU != null) && (this.iFU.isShowing())) {
      this.iFU.dismiss();
    }
    if (this.iFT)
    {
      if (!this.iFV.isChecked()) {
        break label168;
      }
      this.bWA |= 0x1;
      if (!this.iFW.isChecked()) {
        break label182;
      }
      this.bWA |= 0x2;
      label85:
      if (!this.iFX.isChecked()) {
        break label196;
      }
    }
    label168:
    label182:
    label196:
    for (this.bWA |= 0x8;; this.bWA &= 0xFFFFFFF7)
    {
      au.HU();
      c.DT().set(397310, Integer.valueOf(this.bWA));
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ExdeviceSettingUI", "hy: doscene setting flag to %d", new Object[] { Integer.valueOf(this.bWA) });
      au.DF().a(new n(1, this.bWA), 0);
      return;
      this.bWA &= 0xFFFFFFFE;
      break;
      this.bWA &= 0xFFFFFFFD;
      break label85;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/exdevice/ui/ExdeviceSettingUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */