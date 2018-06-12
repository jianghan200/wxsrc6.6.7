package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.ao.c;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.b;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.ab.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.setting.a.h;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.a.k;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.PluginTextPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceSmallCategory;
import com.tencent.mm.ui.base.preference.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class SettingsPluginsUI
  extends MMPreference
{
  private static int mTk = 1;
  private static HashMap<String, Integer> mTl = new SettingsPluginsUI.1();
  private f eOE;
  private boolean mTm;
  private boolean mTn;
  
  public final int Ys()
  {
    return a.k.settings_pref_plugins;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool = false;
    String str = paramPreference.mKey;
    if ((str != null) && (str.equals("display_in_addr_book")))
    {
      bool = ((CheckBoxPreference)paramf.ZZ(str)).isChecked();
      com.tencent.mm.kernel.g.Ei().DT().set(35, Boolean.valueOf(bool));
      bool = true;
    }
    while (!(paramPreference instanceof PluginPreference)) {
      return bool;
    }
    paramf = ((PluginPreference)paramPreference).mQg;
    if (("feedsapp".equals(paramf)) && (this.mTm)) {
      com.tencent.mm.kernel.g.Ei().DT().set(-2046825369, Boolean.valueOf(false));
    }
    paramPreference = new Intent();
    if (("gh_43f2581f6fd6".equals(paramf)) && (this.mTn))
    {
      a.bji();
      com.tencent.mm.ao.d.ih(com.tencent.mm.ao.b.ebm);
      paramPreference.putExtra("key_from_wesport_plugin_newtips", true);
    }
    paramPreference.putExtra("Contact_User", paramf);
    com.tencent.mm.bg.d.b(this, "profile", ".ui.ContactInfoUI", paramPreference);
    h.mEJ.h(12846, new Object[] { mTl.get(paramf) });
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsPluginsUI", "click id:%s, kvID:%d", new Object[] { paramf, mTl.get(paramf) });
    return true;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.settings_plugins);
    setBackBtn(new SettingsPluginsUI.2(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.eOE = this.tCL;
    initView();
    h.mEJ.h(14098, new Object[] { Integer.valueOf(5) });
    h.mEJ.h(12846, new Object[] { Integer.valueOf(mTk) });
    am.a.dBr.R("gh_43f2581f6fd6", "");
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
  
  public void onPause()
  {
    super.onPause();
  }
  
  public void onResume()
  {
    int j = 0;
    super.onResume();
    this.eOE.removeAll();
    Object localObject1 = new PreferenceSmallCategory(this);
    this.eOE.a((Preference)localObject1);
    localObject1 = new ArrayList();
    Object localObject4 = new ArrayList();
    boolean bool2 = q.Hm();
    boolean bool1 = bool2;
    label151:
    label165:
    label217:
    label231:
    label274:
    label288:
    label340:
    label354:
    label407:
    label421:
    Object localObject3;
    if (!bool2)
    {
      if (bi.getInt(com.tencent.mm.k.g.AT().getValue("BindQQSwitch"), 1) == 1) {
        bool1 = true;
      }
    }
    else
    {
      if (!bool1) {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsPluginsUI", "summerqq BindQQSwitch off");
      }
      if ((bool1) && (com.tencent.mm.bg.d.QS("qqmail")))
      {
        localObject2 = new PluginPreference(this);
        if (((PluginPreference)localObject2).KW("qqmail"))
        {
          ((PluginPreference)localObject2).setTitle(((PluginPreference)localObject2).mQh);
          if ((q.GQ() & 0x1) != 0) {
            break label822;
          }
          i = 1;
          if (i == 0) {
            break label827;
          }
          ((List)localObject1).add(localObject2);
        }
      }
      if (com.tencent.mm.bg.d.QS("readerapp"))
      {
        localObject2 = new PluginPreference(this);
        if (((PluginPreference)localObject2).KW("newsapp"))
        {
          ((PluginPreference)localObject2).setTitle(((PluginPreference)localObject2).mQh);
          if ((q.GQ() & 0x80000) != 0) {
            break label846;
          }
          i = 1;
          if (i == 0) {
            break label851;
          }
          ((List)localObject1).add(localObject2);
        }
      }
      localObject2 = new PluginPreference(this);
      if (((PluginPreference)localObject2).KW("facebookapp"))
      {
        ((PluginPreference)localObject2).setTitle(((PluginPreference)localObject2).mQh);
        if ((q.GQ() & 0x2000) != 0) {
          break label870;
        }
        i = 1;
        if (i == 0) {
          break label875;
        }
        ((List)localObject1).add(localObject2);
      }
      if (com.tencent.mm.bg.d.QS("masssend"))
      {
        localObject2 = new PluginPreference(this);
        if (((PluginPreference)localObject2).KW("masssendapp"))
        {
          ((PluginPreference)localObject2).setTitle(((PluginPreference)localObject2).mQh);
          if ((q.GQ() & 0x10000) != 0) {
            break label894;
          }
          i = 1;
          if (i == 0) {
            break label899;
          }
          ((List)localObject1).add(localObject2);
        }
      }
      com.tencent.mm.bg.d.cfH();
      if (!com.tencent.mm.al.b.Pz())
      {
        localObject2 = new PluginPreference(this);
        if (((PluginPreference)localObject2).KW("voiceinputapp"))
        {
          ((PluginPreference)localObject2).setTitle(((PluginPreference)localObject2).mQh);
          if ((q.GQ() & 0x2000000) != 0) {
            break label912;
          }
          i = 1;
          if (i == 0) {
            break label917;
          }
          ((List)localObject1).add(localObject2);
        }
      }
      localObject2 = new PluginPreference(this);
      localObject3 = getString(a.i.exdevice_wechat_sport);
      ((PluginPreference)localObject2).mQg = "gh_43f2581f6fd6";
      ((PluginPreference)localObject2).mQh = ((String)localObject3);
      ((PluginPreference)localObject2).setKey("settings_plugins_list_#" + ((PluginPreference)localObject2).mQg);
      ((PluginPreference)localObject2).setTitle(((PluginPreference)localObject2).mQh);
      if (!((com.tencent.mm.plugin.sport.b.b)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.sport.b.b.class)).bFv()) {
        break label930;
      }
      ((List)localObject1).add(localObject2);
      label517:
      a.bjk();
      this.mTn = c.ig(com.tencent.mm.ao.b.ebm);
      ((PluginPreference)localObject2).mQl = this.mTn;
      localObject2 = com.tencent.mm.k.g.AT().getValue("LinkedinPluginClose");
      if ((bi.oW((String)localObject2)) || (Integer.valueOf((String)localObject2).intValue() == 0))
      {
        localObject2 = new PluginPreference(this);
        if (((PluginPreference)localObject2).KW("linkedinplugin"))
        {
          ((PluginPreference)localObject2).setTitle(((PluginPreference)localObject2).mQh);
          if ((q.GQ() & 0x1000000) != 0) {
            break label943;
          }
        }
      }
    }
    String str;
    label822:
    label827:
    label846:
    label851:
    label870:
    label875:
    label894:
    label899:
    label912:
    label917:
    label930:
    label943:
    for (int i = 1;; i = 0)
    {
      if (!bi.oW((String)com.tencent.mm.kernel.g.Ei().DT().get(286721, null))) {
        j = 1;
      }
      if ((i != 0) && (j != 0)) {
        ((List)localObject1).add(localObject2);
      }
      if (!((List)localObject1).isEmpty())
      {
        localObject2 = new PluginTextPreference(this);
        ((PluginTextPreference)localObject2).tDi = a.h.setting_plugin_install;
        ((PluginTextPreference)localObject2).EA(a.i.settings_plugins_installed_plugins);
        this.eOE.a((Preference)localObject2);
      }
      str = (String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sXd, "");
      Iterator localIterator = ((List)localObject1).iterator();
      for (localObject1 = null; localIterator.hasNext(); localObject1 = localObject2)
      {
        localObject3 = (PluginPreference)localIterator.next();
        ((PluginPreference)localObject3).iRP = 255;
        localObject2 = localObject1;
        if (str.contains(((PluginPreference)localObject3).mQg))
        {
          ((PluginPreference)localObject3).mQl = true;
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = localObject3;
          }
        }
        this.eOE.a((Preference)localObject3);
      }
      bool1 = false;
      break;
      i = 0;
      break label151;
      if (!com.tencent.mm.al.b.PB()) {
        break label165;
      }
      ((List)localObject4).add(localObject2);
      break label165;
      i = 0;
      break label217;
      if (!com.tencent.mm.al.b.PB()) {
        break label231;
      }
      ((List)localObject4).add(localObject2);
      break label231;
      i = 0;
      break label274;
      if (!com.tencent.mm.al.b.PA()) {
        break label288;
      }
      ((List)localObject4).add(localObject2);
      break label288;
      i = 0;
      break label340;
      ((List)localObject4).add(localObject2);
      break label354;
      i = 0;
      break label407;
      ((List)localObject4).add(localObject2);
      break label421;
      ((List)localObject4).add(localObject2);
      break label517;
    }
    Object localObject2 = new PreferenceSmallCategory(this);
    this.eOE.a((Preference)localObject2);
    localObject2 = new PluginTextPreference(this);
    ((PluginTextPreference)localObject2).tDi = a.h.setting_plugin_uninstall;
    ((PluginTextPreference)localObject2).EA(a.i.settings_plugins_uninstalled_plugins);
    this.eOE.a((Preference)localObject2);
    if (((List)localObject4).isEmpty())
    {
      localObject2 = new PluginEmptyTextPreference(this, a.i.settings_plugins_can_uninstalled);
      this.eOE.a((Preference)localObject2);
    }
    localObject4 = ((List)localObject4).iterator();
    while (((Iterator)localObject4).hasNext())
    {
      localObject3 = (PluginPreference)((Iterator)localObject4).next();
      ((PluginPreference)localObject3).iRP = 136;
      localObject2 = localObject1;
      if (str.contains(((PluginPreference)localObject3).mQg))
      {
        ((PluginPreference)localObject3).mQl = true;
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = localObject3;
        }
      }
      this.eOE.a((Preference)localObject3);
      localObject1 = localObject2;
    }
    localObject2 = new PreferenceSmallCategory(this);
    this.eOE.a((Preference)localObject2);
    if (localObject1 != null) {
      setSelection(this.eOE.aab(((Preference)localObject1).mKey));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingsPluginsUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */