package com.tencent.mm.plugin.bottle.ui;

import android.content.Intent;
import android.text.Html;
import com.tencent.mm.R.l;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bl;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.bottle.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.ChoicePreference;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public final class c
{
  private MMActivity bGc;
  private f eOE;
  
  public c(MMActivity paramMMActivity, f paramf)
  {
    this.bGc = paramMMActivity;
    this.eOE = paramf;
    paramMMActivity = (ChoicePreference)this.eOE.ZZ("settings_sex");
    paramMMActivity.tBK = new c.1(this);
    paramMMActivity.setTitle(Html.fromHtml(this.bGc.getString(R.l.settings_sex) + "<font color='red'>*</font>"));
    ((KeyValuePreference)this.eOE.ZZ("settings_district")).setTitle(Html.fromHtml(this.bGc.getString(R.l.settings_district) + "<font color='red'>*</font>"));
  }
  
  public static void auq()
  {
    bl localbl = bl.IC();
    au.HU();
    com.tencent.mm.model.c.FQ().b(new h.a(1, bl.a(localbl)));
    a.ezo.vl();
  }
  
  public final boolean aur()
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("persist_signature", false);
    a.ezn.c(localIntent, this.bGc);
    return true;
  }
  
  public final boolean aus()
  {
    a.ezn.b(new Intent(), this.bGc);
    return true;
  }
  
  public final void update()
  {
    au.HU();
    int i = bi.a((Integer)com.tencent.mm.model.c.DT().get(12290, null), 0);
    Object localObject1 = (ChoicePreference)this.eOE.ZZ("settings_sex");
    switch (i)
    {
    default: 
      ((ChoicePreference)localObject1).setValue("unknown");
    }
    for (;;)
    {
      Object localObject2 = bl.IC();
      localObject1 = ((bl)localObject2).getProvince();
      localObject2 = ((bl)localObject2).getCity();
      this.eOE.ZZ("settings_district").setSummary(r.gV((String)localObject1) + " " + (String)localObject2);
      KeyValuePreference localKeyValuePreference = (KeyValuePreference)this.eOE.ZZ("settings_signature");
      localKeyValuePreference.tCA = false;
      au.HU();
      localObject2 = bi.oV((String)com.tencent.mm.model.c.DT().get(12291, null));
      MMActivity localMMActivity = this.bGc;
      localObject1 = localObject2;
      if (((String)localObject2).length() <= 0) {
        localObject1 = this.bGc.getString(R.l.settings_signature_empty);
      }
      localKeyValuePreference.setSummary(j.a(localMMActivity, (CharSequence)localObject1));
      this.eOE.notifyDataSetChanged();
      return;
      ((ChoicePreference)localObject1).setValue("male");
      continue;
      ((ChoicePreference)localObject1).setValue("female");
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/bottle/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */