package com.tencent.mm.plugin.nearby.ui;

import android.os.Bundle;
import android.text.Html;
import com.tencent.mm.R.a;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bl;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.nearby.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.preference.ChoicePreference;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public class NearbyPersonalInfoUI
  extends MMPreference
{
  private f eOE;
  private int sex = -1;
  
  public final int Ys()
  {
    return R.o.nearby_personal_info;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    paramf = paramPreference.mKey;
    if ("settings_district".equals(paramf))
    {
      a.ezn.b(null, this);
      return true;
    }
    if ("settings_signature".equals(paramf))
    {
      a.ezn.c(null, this);
      overridePendingTransition(R.a.push_up_in, R.a.push_empty_out);
      return true;
    }
    return false;
  }
  
  protected final void initView()
  {
    setMMTitle(R.l.nearby_personal_info);
    this.eOE = this.tCL;
    ((KeyValuePreference)this.eOE.ZZ("settings_signature")).tCA = false;
    setBackBtn(new NearbyPersonalInfoUI.1(this));
    addTextOptionMenu(0, getString(R.l.app_nextstep), new NearbyPersonalInfoUI.2(this));
    ((ChoicePreference)this.eOE.ZZ("settings_sex")).tBK = new NearbyPersonalInfoUI.3(this);
    au.HU();
    int i = bi.a((Integer)c.DT().get(12290, null), 0);
    ChoicePreference localChoicePreference = (ChoicePreference)this.eOE.ZZ("settings_sex");
    localChoicePreference.setTitle(Html.fromHtml(getString(R.l.settings_sex) + "<font color='red'>*</font>"));
    switch (i)
    {
    default: 
      localChoicePreference.setValue("unknown");
      return;
    case 1: 
      localChoicePreference.setValue("male");
      return;
    }
    localChoicePreference.setValue("female");
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
  
  public void onResume()
  {
    Object localObject2 = bl.IC();
    Object localObject1 = ((bl)localObject2).getProvince();
    localObject2 = ((bl)localObject2).getCity();
    Preference localPreference = this.eOE.ZZ("settings_district");
    localPreference.setSummary(r.gV((String)localObject1) + " " + (String)localObject2);
    localPreference.setTitle(Html.fromHtml(getString(R.l.settings_district) + "<font color='red'>*</font>"));
    localPreference = this.eOE.ZZ("settings_signature");
    au.HU();
    localObject2 = bi.oV((String)c.DT().get(12291, null));
    localObject1 = localObject2;
    if (((String)localObject2).length() <= 0) {
      localObject1 = getString(R.l.settings_signature_empty);
    }
    localPreference.setSummary(j.a(this, (CharSequence)localObject1));
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/nearby/ui/NearbyPersonalInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */