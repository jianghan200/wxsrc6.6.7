package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.tencent.mm.plugin.account.ui.LanguagePreference;
import com.tencent.mm.plugin.account.ui.LanguagePreference.a;
import com.tencent.mm.plugin.setting.a.b;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceCategory;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.s.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SettingsLanguageUI
  extends MMPreference
{
  private static final String[] mSn = v.mSn;
  private f eOE;
  private String eVK;
  private List<LanguagePreference.a> mSp;
  private boolean mSq = false;
  
  public final int Ys()
  {
    return -1;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    if ((paramPreference instanceof LanguagePreference))
    {
      paramPreference = ((LanguagePreference)paramPreference).eQG;
      if (paramPreference == null) {
        return false;
      }
      this.eVK = paramPreference.eQJ;
      Iterator localIterator = this.mSp.iterator();
      while (localIterator.hasNext()) {
        ((LanguagePreference.a)localIterator.next()).eQK = false;
      }
      paramPreference.eQK = true;
      paramf.notifyDataSetChanged();
      return true;
    }
    return false;
  }
  
  protected final void initView()
  {
    int i = 0;
    setMMTitle(a.i.settings_language_title);
    setBackBtn(new SettingsLanguageUI.1(this));
    a(0, getString(a.i.settings_language_save), new SettingsLanguageUI.2(this), s.b.tmX);
    this.mSq = getIntent().getBooleanExtra("not_auth_setting", false);
    this.eOE.removeAll();
    Object localObject1 = getResources().getStringArray(a.b.language_setting);
    this.eVK = w.e(getSharedPreferences(ad.chY(), 0));
    this.mSp = new ArrayList();
    Object localObject2;
    while (i < mSn.length)
    {
      localObject2 = mSn[i];
      this.mSp.add(new LanguagePreference.a(localObject1[i], "", (String)localObject2, this.eVK.equalsIgnoreCase((String)localObject2)));
      i += 1;
    }
    localObject1 = this.mSp.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (LanguagePreference.a)((Iterator)localObject1).next();
      LanguagePreference localLanguagePreference = new LanguagePreference(this);
      localLanguagePreference.a((LanguagePreference.a)localObject2);
      this.eOE.a(localLanguagePreference);
    }
    localObject1 = new PreferenceCategory(this);
    this.eOE.a((Preference)localObject1);
    this.eOE.notifyDataSetChanged();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.eOE = this.tCL;
    initView();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingsLanguageUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */