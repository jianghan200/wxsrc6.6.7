package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.tencent.mm.bg.d;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.a.k;
import com.tencent.mm.plugin.sns.b.e;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.protocal.c.bqd;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public class SettingsAboutTimelineUI
  extends MMPreference
{
  private String cXR = "";
  private f eOE;
  private boolean mRu = false;
  private boolean mRv = false;
  
  public final int Ys()
  {
    return a.k.settings_about_timeline;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    paramf = paramPreference.mKey;
    if (paramf.equals("timline_outside_permiss"))
    {
      paramPreference = new Intent();
      paramPreference.putExtra("k_sns_tag_id", 4L);
      paramPreference.putExtra("k_sns_from_settings_about_sns", 1);
      d.b(this, "sns", ".ui.SnsBlackDetailUI", paramPreference);
    }
    if (paramf.equals("timeline_black_permiss"))
    {
      paramPreference = new Intent();
      paramPreference.putExtra("k_sns_tag_id", 5L);
      paramPreference.putExtra("k_sns_from_settings_about_sns", 2);
      d.b(this, "sns", ".ui.SnsTagDetailUI", paramPreference);
    }
    if (paramf.equals("timeline_stranger_show")) {
      if (this.mRv) {
        break label146;
      }
    }
    label146:
    for (boolean bool = true;; bool = false)
    {
      this.mRv = bool;
      if (n.nky != null) {
        n.nky.aQ(this.cXR, this.mRv);
      }
      this.mRu = true;
      return false;
    }
  }
  
  protected final void initView()
  {
    this.eOE = this.tCL;
    setMMTitle(a.i.settings_pirvate_timeline);
    setBackBtn(new SettingsAboutTimelineUI.1(this));
    this.cXR = q.GF();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    bqd localbqd;
    if ((this.mRu) && (n.nky != null))
    {
      localbqd = n.nky.aR(this.cXR, this.mRv);
      if (localbqd != null) {}
    }
    else
    {
      return;
    }
    x.d("MicroMsg.SettingsAboutTimelineUI", "userinfo " + localbqd.toString());
    ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new h.a(51, localbqd));
  }
  
  public void onResume()
  {
    super.onResume();
    Object localObject = new bqd();
    if (n.nky != null) {
      localObject = n.nky.Lv(this.cXR);
    }
    if (localObject == null) {
      x.e("MicroMsg.SettingsAboutTimelineUI", "userinfo is null");
    }
    for (;;)
    {
      this.eOE.notifyDataSetChanged();
      return;
      int i = ((bqd)localObject).sod;
      localObject = (CheckBoxPreference)this.eOE.ZZ("timeline_stranger_show");
      if (localObject != null)
      {
        if ((i & 0x1) > 0) {}
        SharedPreferences localSharedPreferences;
        for (boolean bool = true;; bool = false)
        {
          this.mRv = bool;
          localSharedPreferences = getSharedPreferences(getPackageName() + "_preferences", 0);
          if (this.mRv) {
            break label159;
          }
          ((CheckBoxPreference)localObject).qpJ = true;
          localSharedPreferences.edit().putBoolean("timeline_stranger_show", true).commit();
          break;
        }
        label159:
        ((CheckBoxPreference)localObject).qpJ = false;
        localSharedPreferences.edit().putBoolean("timeline_stranger_show", false).commit();
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingsAboutTimelineUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */