package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.model.bl;
import com.tencent.mm.model.q;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.a.k;
import com.tencent.mm.plugin.setting.b;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.DialogPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.s;

public class SettingsPersonalMoreUI
  extends MMPreference
  implements m.b
{
  private f eOE;
  private int sex = -1;
  
  private void btR()
  {
    Preference localPreference = this.eOE.ZZ("settings_signature");
    String str2 = bi.oV((String)com.tencent.mm.kernel.g.Ei().DT().get(12291, null));
    String str1 = str2;
    if (str2.length() <= 0) {
      str1 = getString(a.i.settings_signature_empty);
    }
    localPreference.setSummary(j.a(this, str1));
  }
  
  public final int Ys()
  {
    return a.k.settings_pref_personal_info_more;
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    int i = bi.p(paramObject, 0);
    com.tencent.mm.sdk.platformtools.x.d("SettingsPersonalMoreUI", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramm });
    if ((paramm != com.tencent.mm.kernel.g.Ei().DT()) || (i <= 0)) {
      com.tencent.mm.sdk.platformtools.x.e("SettingsPersonalMoreUI", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramm });
    }
    while (12291 != i) {
      return;
    }
    btR();
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    paramf = paramPreference.mKey;
    if (paramf.equals("settings_district"))
    {
      b.ezn.b(new Intent(), this.mController.tml);
      return true;
    }
    if (paramf.equals("settings_signature"))
    {
      startActivity(new Intent(this, EditSignatureUI.class));
      return true;
    }
    if (paramf.equals("settings_linkedin"))
    {
      paramf = new Intent(this, BindLinkedInUI.class);
      paramf.putExtra("oversea_entry", true);
      startActivity(paramf);
      return true;
    }
    return false;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.settings_personal_more_info);
    this.eOE = this.tCL;
    ((DialogPreference)this.eOE.ZZ("settings_sex")).tBK = new SettingsPersonalMoreUI.1(this);
    setBackBtn(new SettingsPersonalMoreUI.2(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
  
  public void onPause()
  {
    super.onPause();
    bl localbl = bl.IC();
    if (this.sex != -1) {
      localbl.sex = this.sex;
    }
    ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new h.a(1, bl.a(localbl)));
  }
  
  protected void onResume()
  {
    int k = 1;
    super.onResume();
    int i = bi.a((Integer)com.tencent.mm.kernel.g.Ei().DT().get(12290, null), 0);
    Object localObject1 = (DialogPreference)this.eOE.ZZ("settings_sex");
    switch (i)
    {
    default: 
      ((DialogPreference)localObject1).setValue("unknown");
      Object localObject2 = bl.IC();
      localObject1 = bi.oV(((bl)localObject2).getProvince());
      localObject2 = bi.oV(((bl)localObject2).getCity());
      this.eOE.ZZ("settings_district").setSummary(r.gV((String)localObject1) + " " + (String)localObject2);
      btR();
      if ((q.GQ() & 0x1000000) == 0)
      {
        i = 1;
        label159:
        localObject1 = com.tencent.mm.k.g.AT().getValue("LinkedinPluginClose");
        if ((!bi.oW((String)localObject1)) && (Integer.valueOf((String)localObject1).intValue() != 0)) {
          break label239;
        }
      }
      break;
    }
    label239:
    for (int j = 1;; j = 0)
    {
      if ((i != 0) && (j != 0)) {
        break label244;
      }
      this.eOE.bw("settings_linkedin", true);
      return;
      ((DialogPreference)localObject1).setValue("male");
      break;
      ((DialogPreference)localObject1).setValue("female");
      break;
      i = 0;
      break label159;
    }
    label244:
    localObject1 = this.eOE.ZZ("settings_linkedin");
    if (!bi.oW((String)com.tencent.mm.kernel.g.Ei().DT().get(286721, null))) {}
    for (i = k; i == 0; i = 0)
    {
      ((Preference)localObject1).setSummary(getString(a.i.settings_linkedin_open_not_bind));
      return;
    }
    if ((q.GJ() & 0x400000) == 0)
    {
      ((Preference)localObject1).setSummary(getString(a.i.settings_linkedin_open_not_set));
      return;
    }
    ((Preference)localObject1).setSummary(getString(a.i.settings_linkedin_open_set));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalMoreUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */